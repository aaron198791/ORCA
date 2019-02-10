public class Puck {
  public float x, y, dx, dy, border;
  private int size, dirIndexX, dirIndexY;
  public boolean hasScored;
  
  public Puck() {
    y = height / 2;
    dx = 0;
    size = 30;
    border = size / 2;
    hasScored = false;
    
    dirIndexX = (int) random(10);
    dirIndexY = (int) random(10);
    
    /*if(dirIndexX % 2 == 0) {
      x = 2 * width / 3;
      dx = 0;
    }
    
    else {
      x = width / 3;
      dx = 0;
    }*/
    
    if(dirIndexY % 2 == 0) {
      x = p1.posX;
      dy = -8;
    }
    
    else {
      x = p2.posX;
      dy = 8;
    }
  }
  
  public void move() {
    if(x >= width - border) {
      
      dx = -abs(dx);
    }
    
    if(x <= border) {
      dx = abs(dx);
    }
    
    if(y >= height - border) {
      dy = -abs(dy);
    }
    
    if(y <= border) {
      dy = abs(dy);
    }
    
    impact();
  }
  
  public void display() {
    fill(0);
    ellipseMode(CENTER);
    ellipse(x, y, size, size);
  }
}
    
