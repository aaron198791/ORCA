import processing.sound.*;

Text[] txt = new Text[10];
SoundFile gH;
Puck puck;
Paddle p1, p2;
boolean hasScored1 = false;
boolean hasScored2 = false;
boolean start = false;
int t;
int goals1, goals2;
int i = 0;

void setup() {
  background(255);
  size(1300, 950);
  rink();
  gH = new SoundFile(this, "C:\\Users\\SP513\\MYSKETCHES\\Pong\\Anaheim Ducks 2019 Goal Horn.wav");
  puck = new Puck();
  p1 = new Paddle(0);
  p2 = new Paddle(1);
  t = millis();
}

void draw() {
  if(! start) {
  }
  
  else {
    background(255);
    rink();
    dispScore();
    showGame();
    
    if(puck.x >= width / 3 && puck.x <= 2 * width / 3 &&  puck.y <= puck.border) {
      goals1++;
      hasScored1;
      p1 = new Paddle(0);
      p2 = new Paddle(1);
      
      if(goals1 < 5) {
                
        puck = null;
        gH.play();
        puck = new Puck();
      }
      
      else {
        hasScored = true;
        puck.dx = 0;
        puck.dy = 0;
        win();
      }
    }
    
    else if(puck.x >= width / 3 && puck.x <= 2 * width / 3 &&  puck.y >= height - puck.border) {
      goals2++;
      
      if(goals2 < 5) {
        hasScored = true;
        puck.dx = 0;
        puck.dy = 0;
        gH.play();
        //score();
        p1 = new Paddle(0);
        p2 = new Paddle(1);
        puck = new Puck();
        t = millis();
      }
      
      else {
        hasScored = true;
        puck.dx = 0;
        puck.dy = 0;
        win();
        puck = new Puck();
        t = millis() + 23000;
      }
    }
  }
  
  if(hasScored1 && gH.isPlaying() == 1) {
    rink();
    
    if((i == 0 || txt[i - 1].x <= (width - 400)) && i < 4) {
      if(i % 2 == 0) {
        txt[i] = new Text("GOAL!");
      }
      
      else {
        txt[i] = new Text("ITAI!");
      }
      
      i++;
    }
    
    for(int j = 0; j < i; j++) {
      txt[j].display();
    }
  }
}
