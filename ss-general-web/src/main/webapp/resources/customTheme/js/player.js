/**
 * Created by happy on 12/12/2014.
 */
$(document).ready(function(){

    var cssSelector = {
        jPlayer: "#jquery_jplayer_1",
        cssSelectorAncestor: "#jp_container_1"
    };

    var playlist = [
        {
            author:"TSP",
            title:"Cro Magnon Man",
            discription: "Текст песни / описание",
            mp3:"http://www.jplayer.org/audio/mp3/TSP-01-Cro_magnon_man.mp3",
            oga:"http://www.jplayer.org/audio/ogg/TSP-01-Cro_magnon_man.ogg"
        },
        {
            author:"TSP",
            title:"Your Face",
            discription: "Текст песни / описание",
            mp3:"http://www.jplayer.org/audio/mp3/TSP-05-Your_face.mp3",
            oga:"http://www.jplayer.org/audio/ogg/TSP-05-Your_face.ogg"
        },
        {
            author:"TSP",
            title:"Cyber Sonnet",
            discription: "Текст песни / описание",
            mp3:"http://www.jplayer.org/audio/mp3/TSP-07-Cybersonnet.mp3",
            oga:"http://www.jplayer.org/audio/ogg/TSP-07-Cybersonnet.ogg"
        },
        {
            author:"Miaow",
            title:"Tempered Song",
            discription: "Текст песни / описание",
            mp3:"http://www.jplayer.org/audio/mp3/Miaow-01-Tempered-song.mp3",
            oga:"http://www.jplayer.org/audio/ogg/Miaow-01-Tempered-song.ogg"
        },
        {
            author:"Miaow",
            title:"Hidden",
            discription: "Текст песни / описание",
            mp3:"http://www.jplayer.org/audio/mp3/Miaow-02-Hidden.mp3",
            oga:"http://www.jplayer.org/audio/ogg/Miaow-02-Hidden.ogg"
        },
        {
            author:"Miaow",
            title:"Lentement",
            free:true,
            discription: "Текст песни / описание",
            mp3:"http://www.jplayer.org/audio/mp3/Miaow-03-Lentement.mp3",
            oga:"http://www.jplayer.org/audio/ogg/Miaow-03-Lentement.ogg"
        },
        {
            author:"Miaow",
            title:"Lismore",
            discription: "Текст песни / описание",
            mp3:"http://www.jplayer.org/audio/mp3/Miaow-04-Lismore.mp3",
            oga:"http://www.jplayer.org/audio/ogg/Miaow-04-Lismore.ogg"
        },
        {
            author:"Miaow",
            title:"The Separation",
            discription: "Текст песни / описание",
            mp3:"http://www.jplayer.org/audio/mp3/Miaow-05-The-separation.mp3",
            oga:"http://www.jplayer.org/audio/ogg/Miaow-05-The-separation.ogg"
        },
        {
            author:"Miaow",
            title:"Beside Me",
            discription: "Текст песни / описание",
            mp3:"http://www.jplayer.org/audio/mp3/Miaow-06-Beside-me.mp3",
            oga:"http://www.jplayer.org/audio/ogg/Miaow-06-Beside-me.ogg"
        },
        {
            author:"Miaow",
            title:"Bubble",
            free:true,
            discription: "Текст песни / описание",
            mp3:"http://www.jplayer.org/audio/mp3/Miaow-07-Bubble.mp3",
            oga:"http://www.jplayer.org/audio/ogg/Miaow-07-Bubble.ogg"
        },
        {
            author:"Miaow",
            title:"Stirring of a Fool",
            discription: "Текст песни / описание",
            mp3:"http://www.jplayer.org/audio/mp3/Miaow-08-Stirring-of-a-fool.mp3",
            oga:"http://www.jplayer.org/audio/ogg/Miaow-08-Stirring-of-a-fool.ogg"
        },
        {
            author:"Miaow",
            title:"Partir",
            free: true,
            discription: "Текст песни / описание",
            mp3:"http://www.jplayer.org/audio/mp3/Miaow-09-Partir.mp3",
            oga:"http://www.jplayer.org/audio/ogg/Miaow-09-Partir.ogg"
        },
        {
            author:"Miaow",
            title:"Thin Ice",
            discription: "Текст песни / описание",
            mp3:"http://www.jplayer.org/audio/mp3/Miaow-10-Thin-ice.mp3",
            oga:"http://www.jplayer.org/audio/ogg/Miaow-10-Thin-ice.ogg"
        }
    ];

    var options = {
        swfPath: "js",
        supplied: "oga, mp3",
        wmode: "window",
        smoothPlayBar: false,
        keyEnabled: true
    };

    new jPlayerPlaylist(cssSelector, playlist, options);

    $("#jquery_jplayer_2").jPlayer({
        ready: function (event) {
            $(this).jPlayer("setMedia", {
                title: "Bubble",
                mp3: "http://ololo.fm/download/121511166946a0856d97a522f2e4107a54901698/333034313236393837/323533363431393339/mp3/Mr._Carmack_-_Day_6_Kick_It_Up_%D1%81_%D1%81%D0%B0%D0%B9%D1%82%D0%B0_ololo%28fm%29.mp3",
                poster: "http://www.dancerebels.com/wp-content/uploads/2014/02/artworks-000071197404-88vzx6-t500x500.jpg"
//            }
//            {
//                title: "Bad Karma",
//                mp3: "http://mp3cube.net/track/47e5f116afb4cba7f15ef2297d3fb17d/9607cd703d2cd36abf4d3621514c8dc5/Axel_Thesleff-Bad_Karma_2014.mp3"
            });
        },
        size: {width: "60px", height: "60px"},
        swfPath: "resources/customTheme/lib/jplayer/jquery.jplayer.swf",
        supplied: "mp3",
        cssSelectorAncestor: "",
        cssSelector: {
            title: "#title",
            play: "#play",
            pause: "#pause",
            stop: "#stop",
            mute: "#mute",
            unmute: "#unmute",
            seekBar: ".player-seek-bar",
            playBar: ".player-play-bar",
            volumeBar: ".player-volume-bar",
            volumeBarValue: ".player-volume-bar-value",
            currentTime: "#currentTime",
            duration: "#duration",
            repeat: "#repeat-on",
            repeatOff: "#repeat-off"
        }
    });
});