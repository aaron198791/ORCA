public class Paddle {
  public float posX = width / 2;
  public float posY, sizeX, sizeY, borderX, borderY;
  
  public Paddle(int aPosY) {
    sizeX = 120;
    sizeY = 20;
    borderX = sizeX / 2;
    borderY = sizeY / 2;
    
    if(aPosY == 0) {
      posY = height - (borderY);
    }
    
    else {
      posY = borderY;
    }
  }
  
  public void display() {
    rectMode(CENTER);
    fill(255, 140, 0);
    rect(posX, posY, sizeX, sizeY);
  }
}
