public class GoalText {
  int x, y;
  int dx;
  
  public GoalText() {
    this.x = width + 100;
    this.y = height / 2;
    this.dx = -5;
  }
  
  public void move() {
    this.x += dx;
  }
  
  public void display() {
    fill(255,0,255);
    textMode(CENTER);
    textSize(50);
    text("GOAL! GOAL!  GOAL! GOAL! GOAL! GOAL! GOAL! GOAL! GOAL! GOAL! GOAL! GOAL! GOAL! GOAL! GOAL! GOAL! GOAL! GOAL! GOAL! GOAL! GOAL! GOAL! GOAL! GOAL! GOAL! GOAL! GOAL! GOAL! GOAL! GOAL! GOAL! GOAL! GOAL! GOAL! GOAL! GOAL! GOAL! GOAL! GOAL! GOAL! GOAL! GOAL! GOAL! GOAL! GOAL! GOAL! GOAL! GOAL! GOAL! GOAL! GOAL! GOAL! GOAL! GOAL! GOAL! GOAL! GOAL! GOAL! GOAL! GOAL! GOAL! GOAL! GOAL! GOAL! GOAL! GOAL! GOAL! GOAL! GOAL! GOAL! GOAL! GOAL! GOAL! GOAL! GOAL! GOAL! GOAL! GOAL! GOAL! GOAL! GOAL! GOAL! GOAL! GOAL! GOAL! GOAL! GOAL! GOAL! GOAL! GOAL! GOAL! GOAL! GOAL! GOAL! GOAL! GOAL! GOAL! GOAL! GOAL! GOAL! GOAL! GOAL! GOAL! GOAL! GOAL! GOAL! GOAL! GOAL! GOAL! GOAL! GOAL! GOAL! GOAL! GOAL! GOAL! GOAL! GOAL! GOAL! GOAL! GOAL! GOAL! GOAL! GOAL! GOAL! GOAL! GOAL! GOAL! GOAL! GOAL! GOAL! GOAL! GOAL! GOAL! GOAL! GOAL! GOAL! GOAL! GOAL! GOAL! GOAL! GOAL! GOAL! GOAL! GOAL! GOAL! GOAL! GOAL! GOAL! GOAL! GOAL! GOAL! GOAL! GOAL! GOAL! GOAL! GOAL! GOAL! GOAL! GOAL! GOAL! GOAL! GOAL! GOAL! GOAL! GOAL! GOAL! GOAL! GOAL! GOAL!", x, y);    
  }
}
