char strikeValOne;
char strikeValTwo;
int dirIndexOne;
int dirIndexTwo;

int scoreOne = 0;
int scoreTwo = 0;
int livesOne = 20;
int livesTwo = 20;

int clearTimeOne;
int clearTimeTwo;
int strikeTimeOne;
int strikeTimeTwo;

void setup() {
  size(2020, 1000);
  background(0);
  textSize(75);
  resetBoardOne();
  resetBoardTwo();
}

void keyPressed() {
  if (key == CODED) {
    if (keyCode == UP) {
      strikeValTwo = 2;
    }
    else if (keyCode == RIGHT) {
      strikeValTwo = 3;
    } 
    else if (keyCode == LEFT) {
      strikeValTwo = 4;
    } 
    else if (keyCode == DOWN) {
      strikeValTwo = 5;
    } 
  }
}

void resetBoardOne() {  
  strikeValOne = 0;
  dirIndexOne = int(random(2, 6));
  rectMode(CENTER);
  fill(175);
  rect(500, 500, 1000, 1000);
  clearTimeOne = millis();
  fill(0, 0, 255);
  textMode(CENTER);
  text(scoreOne, 425, 500);
  timeToHitOne();
}

void resetBoardTwo() {
  strikeValTwo = 0;
  dirIndexTwo = int(random(2, 6));
  rectMode(CENTER);
  fill(175);
  rect(1520, 500, 1000, 1000);
  clearTimeTwo = millis();
  fill(255, 0, 0);
  textMode(CENTER);
  text(scoreTwo, 1425, 500);
  timeToHitTwo();
}

void timeToHitOne() {
  if (scoreOne <= 10) {
    strikeTimeOne = 1000;
  } else if (scoreOne > 10 && scoreOne <= 30) {
    strikeTimeOne = 750;
  } else if (scoreOne > 30) {
    strikeTimeOne = 500;
  }
}

void timeToHitTwo() {
  if (scoreTwo <= 10) {
    strikeTimeTwo = 1000;
  } else if (scoreTwo > 10 && scoreTwo <= 30) {
    strikeTimeTwo = 750;
  } else if (scoreTwo > 30) {
    strikeTimeTwo = 500;
  }
}



void draw(){
}

/*

void draw() {
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
}*/