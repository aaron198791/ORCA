int strikeValOne;
int strikeValTwo;
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
    } else if (keyCode == DOWN) {
      strikeValTwo = 3;
    } else if (keyCode == LEFT) {
      strikeValTwo = 4;
    } else if (keyCode == RIGHT) {
      strikeValTwo = 5;
    }
  }
}

void resetBoardOne() {  
  strikeValOne = 0;
  dirIndexOne = int(random(2, 6));
  rectMode(CENTER);
  fill(175);
  rect(1520, 500, 1000, 1000);
  clearTimeOne = millis();
  fill(0, 0, 255);
  textMode(CENTER);
  text(scoreOne, 1425, 500);
  timeToHitOne();
}

void resetBoardTwo() {
  strikeValTwo = 0;
  dirIndexTwo = int(random(2, 6));
  rectMode(CENTER);
  fill(175);
  rect(500, 500, 1000, 1000);
  clearTimeTwo = millis();
  fill(255, 0, 0);
  textMode(CENTER);
  text(scoreTwo, 450, 100);
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

void draw() {
  if (dirIndexTwo == 2) {
    fill(255, 0, 0);
    triangle(425, 400, 575, 400, 500, 300);

    if(strikeValTwo == dirIndexTwo) {
      scoreTwo++;
      resetBoardTwo();
    }

    if(strikeValTwo != dirIndexTwo && strikeValTwo != 0 || millis() - clearTimeTwo > strikeTimeTwo) {
      livesTwo--;
      resetBoardTwo();
      dirIndexTwo = 2;
    }
  } 
  
  else if(dirIndexTwo == 3) {
    fill(255, 0, 0);
    triangle(425, 600, 575, 600, 500, 700);
    
    if(strikeValTwo == dirIndexTwo) {
      scoreTwo++;
      resetBoardTwo();
    }
    
    if(strikeValTwo != dirIndexTwo && strikeValTwo != 0 || millis() - clearTimeTwo > strikeTimeTwo) {
      livesTwo--;
      resetBoardTwo();
      dirIndexTwo = 3;
    }
  } 
  
  else if(dirIndexTwo == 4) {
    fill(255, 0, 0);
    triangle(400, 425, 400, 575, 300, 500);
    
    if(strikeValTwo == dirIndexTwo) {
      scoreTwo++;
      resetBoardTwo();
    }
    
    if(strikeValTwo != dirIndexTwo && strikeValTwo != 0 || millis() - clearTimeTwo > strikeTimeTwo) {
      livesTwo--;
      resetBoardTwo();
      dirIndexTwo = 4;
    }
  } 
  
  else if(dirIndexTwo == 5) {
    fill(255, 0, 0);
    triangle(600, 425, 600, 575, 700, 500);
    
    if(strikeValTwo == dirIndexTwo) {
      scoreTwo++;
      resetBoardTwo();
    }
    
    if(strikeValTwo != dirIndexTwo && strikeValTwo != 0 || millis() - clearTimeTwo > strikeTimeTwo) {
      livesTwo--;
      resetBoardTwo();
      dirIndexTwo = 5;
    }
  }
}