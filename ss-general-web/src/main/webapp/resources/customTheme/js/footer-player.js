/**
 * Created by happy on 12/12/2014.
 */
$(document).ready(function(){

//
//    var cssSelector = {
//        jPlayer: "#jquery_jplayer_2",
//        cssSelectorAncestor: "#jp_container_2"
//    };

//    var playlist = [
//        {
//            author:"TSP",
//            title:"Cro Magnon Man",
//            discription: "Текст песни / описание",
//            mp3:"http://www.jplayer.org/audio/mp3/TSP-01-Cro_magnon_man.mp3",
//            oga:"http://www.jplayer.org/audio/ogg/TSP-01-Cro_magnon_man.ogg",
//            poster: "http://t1.gstatic.com/images?q=tbn:ANd9GcQ-2muCpu6ItSuMclaykb5kBRKItVzLBGBFMW73dVqxQ7K6gHd4"
//        },
//        {
//            author:"TSP",
//            title:"Your Face",
//            discription: "Текст песни / описание",
//            mp3:"http://www.jplayer.org/audio/mp3/TSP-05-Your_face.mp3",
//            oga:"http://www.jplayer.org/audio/ogg/TSP-05-Your_face.ogg",
//            poster: "data:image/jpeg;base64,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"
//        },
//        {
//            author:"TSP",
//            title:"Cyber Sonnet",
//            discription: "Текст песни / описание",
//            mp3:"http://www.jplayer.org/audio/mp3/TSP-07-Cybersonnet.mp3",
//            oga:"http://www.jplayer.org/audio/ogg/TSP-07-Cybersonnet.ogg",
//            poster: "data:image/jpeg;base64,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"
//        },
//        {
//            author:"Miaow",
//            title:"Tempered Song",
//            discription: "Текст песни / описание",
//            mp3:"http://www.jplayer.org/audio/mp3/Miaow-01-Tempered-song.mp3",
//            oga:"http://www.jplayer.org/audio/ogg/Miaow-01-Tempered-song.ogg",
//            poster: "http://www.smashingmagazine.com/images/music-cd-covers/64.jpg"
//        },
//        {
//            author:"Mr.Carmack",
//            title:"Kick it Up",
//            discription: "Текст песни / описание",
//            mp3:"/media/Mr.Carmack-Day6KickItUp.mp3",
//            poster: "http://www.dancerebels.com/wp-content/uploads/2014/02/artworks-000071197404-88vzx6-t500x500.jpg"
//        },
//        {
//            author:"Miaow",
//            title:"Hidden",
//            discription: "Текст песни / описание",
//            mp3:"http://www.jplayer.org/audio/mp3/Miaow-02-Hidden.mp3",
//            oga:"http://www.jplayer.org/audio/ogg/Miaow-02-Hidden.ogg",
//            poster: "http://assets.sbnation.com/assets/2414577/Wasnatch_Front-To-Back.jpg"
//        },
//        {
//            author:"Miaow",
//            title:"Lentement",
//            free:true,
//            discription: "Текст песни / описание",
//            mp3:"http://www.jplayer.org/audio/mp3/Miaow-03-Lentement.mp3",
//            oga:"http://www.jplayer.org/audio/ogg/Miaow-03-Lentement.ogg",
//            poster: "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQ0dj2OTa79N4ACKAUv1h_kyRC3ccGXw5guATnb7Mvl3Yp7jn0UmQ"
//        },
//        {
//            author:"Miaow",
//            title:"Lismore",
//            discription: "Текст песни / описание",
//            mp3:"http://www.jplayer.org/audio/mp3/Miaow-04-Lismore.mp3",
//            oga:"http://www.jplayer.org/audio/ogg/Miaow-04-Lismore.ogg",
//            poster: "https://encrypted-tbn3.gstatic.com/images?q=tbn:ANd9GcRZlvEdMwuqB3Q5BWtDzamojlPGmDfz6Pc3Ce4zvTGDw1us2jqo5g"
//        },
//        {
//            author:"Miaow",
//            title:"The Separation",
//            discription: "Текст песни / описание",
//            mp3:"http://www.jplayer.org/audio/mp3/Miaow-05-The-separation.mp3",
//            oga:"http://www.jplayer.org/audio/ogg/Miaow-05-The-separation.ogg",
//            poster: "https://encrypted-tbn2.gstatic.com/images?q=tbn:ANd9GcTUBPj-YJeNbLuKEqX7hOqJK_lX2KemUL-Sq0gcApTpC0t6v2KKUw"
//        },
//        {
//            author:"Miaow",
//            title:"Beside Me",
//            discription: "Текст песни / описание",
//            mp3:"http://www.jplayer.org/audio/mp3/Miaow-06-Beside-me.mp3",
//            oga:"http://www.jplayer.org/audio/ogg/Miaow-06-Beside-me.ogg",
//            poster: "https://encrypted-tbn2.gstatic.com/images?q=tbn:ANd9GcQu1rucGW7ItIC9jDZb4DpoYxn_dvX3MBHljyi5a3xmw8Aig9SK"
//        },
//        {
//            author:"Miaow",
//            title:"Bubble",
//            free:true,
//            discription: "Текст песни / описание",
//            mp3:"http://www.jplayer.org/audio/mp3/Miaow-07-Bubble.mp3",
//            oga:"http://www.jplayer.org/audio/ogg/Miaow-07-Bubble.ogg",
//            poster: "http://cdn01.cdn.justjared.com/wp-content/uploads/2011/04/gaga-cover/lady-gaga-born-this-way-album-cover.jpg"
//        },
//        {
//            author:"Miaow",
//            title:"Stirring of a Fool",
//            discription: "Текст песни / описание",
//            mp3:"http://www.jplayer.org/audio/mp3/Miaow-08-Stirring-of-a-fool.mp3",
//            oga:"http://www.jplayer.org/audio/ogg/Miaow-08-Stirring-of-a-fool.ogg",
//            poster: "https://encrypted-tbn3.gstatic.com/images?q=tbn:ANd9GcRkYL7bRJz2invH4xGahRMdy4YVo7Sz4sGFVKCPAVeswgk0bkRC"
//        },
//        {
//            author:"Miaow",
//            title:"Partir",
//            free: true,
//            discription: "Текст песни / описание",
//            mp3:"http://www.jplayer.org/audio/mp3/Miaow-09-Partir.mp3",
//            oga:"http://www.jplayer.org/audio/ogg/Miaow-09-Partir.ogg",
//            poster: "https://encrypted-tbn3.gstatic.com/images?q=tbn:ANd9GcQ0QAPkwdpmwaHPgd8aoh6ZyYjJJlGnvh3osnu66Kilvcy5Uu-lPw"
//        },
//        {
//            author:"Miaow",
//            title:"Thin Ice",
//            discription: "Текст песни / описание",
//            mp3:"http://www.jplayer.org/audio/mp3/Miaow-10-Thin-ice.mp3",
//            oga:"http://www.jplayer.org/audio/ogg/Miaow-10-Thin-ice.ogg",
//            poster: "http://www.dancerebels.com/wp-content/uploads/2014/02/artworks-000071197404-88vzx6-t500x500.jpg"
//        }
//    ];
//
//    var options = {
//        size: {width: "60px", height: "60px"},
//        swfPath: "js",
//        supplied: "mp3",
//        wmode: "window",
//        smoothPlayBar: false,
//        keyEnabled: true
//    };

//    $.ajax({
//        type: 'GET',
//        url: '/rest/api/track/popular',
//        success: function(data){
//            new jPlayerPlaylist(cssSelector, data['playlistItems'], options);
//        }
//    });

//    var playlist = {
//        title: "Bad Karma",
//        mp3: "http://mp3cube.net/track/47e5f116afb4cba7f15ef2297d3fb17d/9607cd703d2cd36abf4d3621514c8dc5/Axel_Thesleff-Bad_Karma_2014.mp3",
//        poster: "http://www.dancerebels.com/wp-content/uploads/2014/02/artworks-000071197404-88vzx6-t500x500.jpg"
//    }
//
//    new jPlayerPlaylist(cssSelector, playlist, options);


    $.ajax({
        type: 'GET',
        url: '/rest/api/track/' + gup('id'),
        success: function(data){
            $("#jquery_jplayer_2").jPlayer({
                ready: function (event) {
                    $(this).jPlayer("setMedia", data);
                },
                size: {width: "60px", height: "60px"},
                swfPath: "resources/customTheme/lib/jplayer/jquery.jplayer.swf",
                supplied: "mp3",
                cssSelectorAncestor: "#jp_container_2"
            });
        }
    });

});

function gup( name )
{
    name = name.replace(/[\[]/,"\\\[").replace(/[\]]/,"\\\]");
    var regexS = "[\\?&]"+name+"=([^&#]*)";
    var regex = new RegExp( regexS );
    var results = regex.exec( window.location.href );
    if( results == null )
        return null;
    else
        return results[1];
}