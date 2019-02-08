public class Text {
  private PFont blackops;
  private String text;
  public int x; 
  private int y, dx, dy;
  
  public Text(String aText) {
    text = aText;
    blackops = createFont("BlackOpsOne-Regular.ttf", 100);
    
    x = width;
    y = (height / 2) + 20;
    
    dx = -4;
    dy = 0;
  }
  
  public void display() {
    rectMode(CENTER);
    textFont(blackops);
    fill(36, 248, 229);
    text(text, x, y);
    
    if(x < -300) {
      x = width;
      
      dy = -dy;
      y += dy;
    }
    
    else {
      x += dx;
      
      dy = -dy;
      y += dy;
    }
  }
}
