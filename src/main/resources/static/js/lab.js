var cha = new Audio('audio/cha.wav');
$('.cha').click(function() {
    cha.play();
    $('#vid').html('<video width="320" height="240" src="/img/cha.mov" autoplay></video>');
});
var concha = new Audio('audio/concha1.wav');
$('.concha').click(function() {
    concha.play();
    $('#vid').html('<video width="320" height="240" src="/img/con_.mov" autoplay></video>');
});
var kick = new Audio('audio/kick.wav');
$('.kick').click(function() {
    kick.play();
    $('#vid').html('<video width="320" height="240" src="/img/kick.mov" autoplay></video>');
});
var shaker = new Audio('audio/shaker.wav');
$('.shaker').click(function() {
    shaker.play();
    $('#vid').html('<video width="320" height="240" src="/img/shaker.mov" autoplay></video>');
});
var snare = new Audio('audio/snare.wav');
$('.snare').click(function() {
    snare.play();
    $('#vid').html('<video width="320" height="240" src="/img/snare.mov" autoplay></video>');
});
var drum = new Audio('audio/snare2.wav');
$('.drum').click(function() {
    drum.play();
    $('#vid').html('<video width="320" height="240" src="/img/rattle.mov" autoplay></video>');

});
var yoyobass = new Audio('audio/yoyobass.wav');
$('.yoyobass').click(function() {
    yoyobass.play();
    $('#vid').html('<video width="320" height="240" src="/img/bass.mov" autoplay></video>');
});