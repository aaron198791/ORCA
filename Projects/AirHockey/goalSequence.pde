public void goalSequence(SoundFile horn) {    
  if(horn.isPlaying() == 0) {
    horn.stop();
    horn.play();
  }
}
