public class Puck {
  float x, y;
  float dx, dy;
  
  public Puck(int delta) {
    this.x = width / 2;
    this.y = height / 2;
    this.dy = 0;
    
    if(random(10) % 2 == 0) {
      this.dx = delta * 3;
    } else {
      this.dx = -delta * 3;
    }
  }
  
  public void move() {
    if(this.x <= 10 || this.x >= width - 10) {
      dx *= -1;
    }
    
    if(this.y <= 10 || this.y >= height - 10) {
      dy *= -1;
    }
    
    if(20 >= abs(this.x - p1.x) && this.y < p1.y + 37.5 && this.y > p1.y - 37.5) {
      dx *= -1;
      dy = -10 * sin(3 * (this.y - p1.y));
    }
    
    if(20 >= abs(this.x - p2.x) && this.y < p2.y + 37.5 && this.y > p2.y - 37.5) {
      dx *= -1;
      dy = -10 * sin(3 * (this.y - p2.y));
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

/*if(this.x <= 10 && this.y > (height / 2) - 50 && this.y < (height / 2) + 50) {
      dx = dy = 0;
    }
    
    if(this.x >= width - 10 && this.y > (height / 2) - 50 && this.y < (height / 2) + 50) {
      dx = dy = 0;
    }*/
