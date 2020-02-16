PImage img;
Puck puck;
Stick p1, p2;
import processing.sound.*;
SoundFile horn;
int period;
int time;

void setup() {
  img = loadImage("DucksLogo.png");
  size(1800, 900);
  rink(img);
  puck = new Puck(20);
  p1 = new Stick(true);
  p2 = new Stick(false);
  horn = new SoundFile(this, "C:\\Users\\SP513\\MYSKETCHES\\AirHockey\\GoalHorn1.mp3");
  period = 1;
  time = 180;
}

void draw() {
  time = 180 - (millis() / 1000);
  rink(img);
  
  puck.move();
  puck.display();
  p1.display();
  p2.display();
  
  if(puck.x >= width - 10 && puck.y > (height / 2) - 50 && puck.y < (height / 2) + 50) {
    rink(img);
    goalSequence(horn);
  }
}

void keyPressed() {
  if(key == 'w' || key == 'W') {
    p1.y -= 10;
  } else if(key == 's' || key == 'S') {
    p1.y += 10;
  } else if(key == 'i' || key == 'I') {
    p2.y -= 10;
  } else if(key == 'k' || key == 'K') {
    p2.y += 10;
  } else if(key == CODED) {
    if(keyCode == SHIFT) {
      rink(img);
      puck = new Puck(20);
      p1 = new Stick(true);
    }
  }
}
