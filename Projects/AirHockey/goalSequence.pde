public void goalSequence(SoundFile horn) {
  horn.play();
  int t = millis();
  
  while(millis() < t + 15000) {
  
  }
  
  puck = new Puck(0);
  
  while(millis() < t + 3000) {}
  
  rink(img);
  
  puck = new Puck(0);
}
