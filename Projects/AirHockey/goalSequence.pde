public void goalSequence(SoundFile horn) {
  horn.play();
  int t = millis();
  puck = new Puck(0);
  
  while(millis() < t + 20000) {
    
  }
  
  puck = new Puck(20);
}
