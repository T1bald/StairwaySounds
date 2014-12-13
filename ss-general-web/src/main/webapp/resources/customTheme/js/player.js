/**
 * Created by happy on 12/12/2014.
 */
$(document).ready(function(){

    $("#jquery_jplayer_1").jPlayer({
        ready: function (event) {
            $(this).jPlayer("setMedia", {
                title: "Bubble",
                m4a: "http://jplayer.org/audio/m4a/Miaow-07-Bubble.m4a",
                oga: "http://jplayer.org/audio/ogg/Miaow-07-Bubble.ogg"
            });
        },
        swfPath: "resources/customTheme/lib/jplayer/jquery.jplayer.swf",
        supplied: "m4a, oga",
        wmode: "window",
        useStateClassSkin: true,
        autoBlur: false,
        smoothPlayBar: true,
        keyEnabled: true,
        remainingDuration: true,
        toggleDuration: true
    });
});