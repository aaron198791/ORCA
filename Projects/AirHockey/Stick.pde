public class Stick {
  int x, y;
  int dx, dy;
  boolean home;
  
  public Stick(boolean home) {
    this.home = home;
    
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
    ellipseMode(CENTER);
    circle(this.x, this.y, 75);
  }
}
