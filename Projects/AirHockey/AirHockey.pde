PImage img;
Puck puck;
Stick p1, p2;
import processing.sound.*;
SoundFile horn;
int period;
int time, pause, temp;
boolean scoreHome, scoreAway;
GoalText celebration;

void setup() {
  img = loadImage("DucksLogo.png");
  size(1800, 900);
  rink(img);
  puck = new Puck(10);
  p1 = new Stick(true);
  p2 = new Stick(false);
  horn = new SoundFile(this, "C:\\Users\\SP513\\MYSKETCHES\\AirHockey\\GoalHorn2.mp3");
  period = 1;
  time = 180;
  scoreHome = scoreAway = false;
}

void draw() {  
  rink(img);
  puck.move();
  puck.display();
  p1.display();
  p2.display();
  
  if(puck.x >= width - 10 && puck.y > (height / 2) - 50 && puck.y < (height / 2) + 50) {
    puck = new Puck(0);
    p1.y = p2.y = height / 2;
    p1.score++;
    
    temp = millis();
    goalSequence(horn);
    scoreHome = true;
    
    celebration = new GoalText();
  }
  
  if(puck.x <= 10 && puck.y > (height / 2) - 50 && puck.y < (height / 2) + 50) {
    puck = new Puck(0);
    p1.y = p2.y = height / 2;
    p2.score++;
    
    temp = millis();
    scoreAway = true;
  }
  
  if(scoreHome && millis() < temp + 10000) {
    pause = millis() - temp;
  
    celebration.move();
    celebration.display();    
  } else if(scoreAway && millis() < temp + 3000) {
    pause = millis() - temp;
  } else {
    if(scoreHome || scoreAway) {
      celebration = null;
      scoreHome = scoreAway = false;
      puck = new Puck(10);
    }
    
    time = 180 - ((millis() - pause) / 1000);
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
      puck = new Puck(10);
      p1 = new Stick(true);
    }
  }
}

/**/
