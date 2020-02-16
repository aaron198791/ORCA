public class Puck {
  int x, y;
  int dx, dy;
  
  public Puck(int delta) {
    this.x = width / 2;
    this.y = height / 2;
    this.dy = delta * 2;
    this.dx = -delta * 3;
  }
  
  public void move() {
    if(this.x <= 10 || this.x >= width - 10) {
      dx *= -1;
    }
    
    if(this.y <= 10 || this.y >= height - 10) {
      dy *= -1;
    }
    
    if(this.x <= 10 && this.y > (height / 2) - 50 && this.y < (height / 2) + 50) {
      dx = dy = 0;
    }
    
    if(this.x >= width - 10 && this.y > (height / 2) - 50 && this.y < (height / 2) + 50) {
      dx = dy = 0;
    }
    
    this.x += dx;
    this.y += dy;

  }
  
  public void display() {
    stroke(0);
    strokeWeight(1);
    fill(0);
    ellipseMode(CENTER);
    circle(this.x, this.y, 20);
  }
}
