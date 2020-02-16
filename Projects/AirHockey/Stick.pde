public class Stick {
  int x, y;
  int dx, dy;
  int score;
  boolean home;
  
  public Stick(boolean home) {
    this.home = home;
    this.score = 0;
    
    if(home) {
      this.x = 200;
      this.y = height / 2;
    } else {
      this.x = width - 200;
      this.y = height / 2;
    }
  }
  
  public void display() {
    stroke(0);
    strokeWeight(1);
    if(this.home) fill(255, 140, 0);
    else fill(0,128,128);
    rectMode(CENTER);
    rect(this.x, this.y, 60, 75);
    if(this.home) {
      textMode(CENTER);
      textSize(50);
      text(this.score, 100, 100);
    } else {
      textMode(CENTER);
      textSize(50);
      text(this.score, width - 100, 100);
    }
  }
}
