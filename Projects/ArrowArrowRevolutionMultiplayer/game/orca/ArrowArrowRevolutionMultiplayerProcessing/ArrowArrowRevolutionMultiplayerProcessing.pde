int strikeVal; 
int blu;
PImage Up;
PImage Right;
PImage Left;
PImage Down;
PImage yui;

void setup() {
  size(2000, 1000);
  textSize(75);
  delay(1500);
  resetBoard();
  Up = loadImage("Up.jpg");
  Right = loadImage("Right.jpg");
  Left = loadImage("Left.jpg");
  Down = loadImage("Down.jpg");
  yui = loadImage("yui.jpg");
}

int score = 0;
int deathVal = 10;

void draw() {
  fill(0, 0, 255);
  textMode(CENTER);
  text(score, width/3, 700);
  timeToHit();
  
    if (blu == 2) {
      fill(100);
      triangle(500, 150, 700, 150, 600, 50);
      imageMode(CENTER);
      image(Up, 600, 400, 400, 400);
      if(strikeVal == blu) {
      score++;
      resetBoard(); 
      }
      if (strikeVal != blu && strikeVal != 0 || millis() - clearTime > strikeTime) {
      deathVal--;
      resetBoard();
      blu = 2;
      }
    } 
    else if (blu == 3) {
      fill(100);
      triangle(1050, 350, 1050, 550, 1150, 450);
      imageMode(CENTER);
      image(Right, 600, 400, 400, 400);
      if(strikeVal == blu) {
      score++;
      resetBoard();
      }
      if (strikeVal != blu && strikeVal != 0 || millis() - clearTime > strikeTime) {
      deathVal--;
      resetBoard();
      blu = 3;
      }
    }   
    else if (blu == 4) {
      fill(100);
      triangle(150, 350, 150, 550, 50, 450);
      imageMode(CENTER);
      image(Left, 600, 400, 400 ,400);
      if(strikeVal == blu) {
      score++;
      resetBoard();
      }
      if (strikeVal != blu && strikeVal != 0 || millis() - clearTime > strikeTime) {
      deathVal--;
      resetBoard();
      blu = 4;
      }
    }     
    else if (blu == 5) {
      fill(100);
      triangle(500, 750, 700, 750, 600, 850);
      imageMode(CENTER);
      image(Down, 600, 400, 400, 400);
      if(strikeVal == blu) {
      score++;
      resetBoard();
      }
      if (strikeVal != blu && strikeVal != 0 || millis() - clearTime > strikeTime) {
      deathVal--;
      resetBoard();
      blu = 5;
      }
    }
  
  fill(0);
  textMode(CENTER);
  text(deathVal, 2*width/3, 700);
  
  if (deathVal < 1) {
    background(255);
    blu = 0;
    fill(255, 0, 0);
    textMode(CENTER);
    text("You Lose!", width/2, 700);
    text(score, width/3, 700);
    imageMode(CENTER);
    image(yui, 600, 350, 435, 435);
    if (keyPressed) {
    if (key == 'r' || key == 'R') {
      strikeVal = 0;
      deathVal = 10;
      score = 0;
      delay(250);
      resetBoard();
    }
    }
  } 
}

void keyPressed() {
  if (key == CODED) {
    if (keyCode == UP) {
      strikeVal = 2;
    } else if (keyCode == RIGHT) {
      strikeVal = 3;
    } else if (keyCode == LEFT) {
      strikeVal = 4;
    } else if (keyCode == DOWN) {
      strikeVal = 5;
    } 
  }
}

int clearTime;

void resetBoard() {  
  strikeVal = 0;
  blu = int(random(2, 6));
  background(255);
  clearTime = millis();
}

int strikeTime;

void timeToHit() {
  if (score <= 10) {
    strikeTime = 1000;
  } else if (score > 10 && score <= 30) {
    strikeTime = 750;
  } else if (score > 30) {
    strikeTime = 500;
  }
}