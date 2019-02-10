import processing.sound.*;

Text[] txt = new Text[10];
SoundFile gH;
PFont defaultFont;
Puck puck;
Paddle p1, p2;
boolean hasScored =false;
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
  gH = new SoundFile(this, "C:\\Users\\SP513\\ORCA\\Projects\\Pong\\San Diego Padres 2018 Home Run Horn.wav");
  p1 = new Paddle(0);
  p2 = new Paddle(1);
  puck = new Puck();
  defaultFont = createFont("C:\\Users\\SP513\\MYSKETCHES\\Pong\\CODE Bold.otf", 100);
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
    
    try {
      if(puck.x >= width / 3 && puck.x <= 2 * width / 3 &&  puck.y <= puck.border) {
        goals1++;
        hasScored1 = true;
        p1 = new Paddle(0);
        p2 = new Paddle(1);
        t = millis();
        
        if(goals1 < 5) {
          puck = null;
          gH.play();
        }
        
        else {
          win();
        }
      }
      
      if(puck.x >= width / 3 && puck.x <= 2 * width / 3 &&  puck.y >= height - puck.border) {
        goals2++;
        hasScored2 = true;
        p1 = new Paddle(0);
        p2 = new Paddle(1);
        t = millis();
        
        if(goals2 < 5) {
          puck = null;
        }
        
        else {
          win();
        }
      }
    }
    
    catch(Exception e) {
    }
  }
  
  if(hasScored1 && millis() < t + 16000) {
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
  
  if(hasScored1 && millis() >= t + 16000) {
    gH.stop();
    hasScored1 = false;
    puck = new Puck();
  }
  
  if(hasScored2 && millis() < t + 4000) {
    Text goalP2 = new Text("Goal P2");
    goalP2.display();
  }
  
  if(hasScored2 && millis() >= t + 4000) {
    hasScored2 = false;
    puck = new Puck();
  }    
}
