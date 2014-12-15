/**
 * Created by happy on 12/12/2014.
 */
$(document).ready(function(){

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