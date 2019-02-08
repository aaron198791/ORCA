void keyPressed() {
  if(key == CODED) {
    if(keyCode == UP || keyCode == LEFT) {
      if(p1.posX - 12 < p1.borderX) {
        p1.posX = p1.borderX;
      }
      
      else {
        p1.posX -= 12;
      }
    }
    
    if(keyCode == DOWN || keyCode == RIGHT) {
      if(p1.posX + 12 > width - p1.borderX) {
        p1.posX = width - p1.borderX;
      }
      
      else {
        p1.posX += 12;
      }
    }
  }
  
  if(keyPressed) {
    if(key == 'f' || key == 'F') {
      start = true;
    }
    
    if(key == 'w' || key == 'W' || key == 'a' || key == 'A') {
      if(p2.posX - 12 < p2.borderX) {
        p2.posX = p2.borderX;
      }
      
      else {
        p2.posX -= 12;
      }
    }
    
    if(key == 's' || key == 'S' || key == 'd' || key == 'D') {
      if(p2.posX + 12 > width - p2.borderX) {
        p2.posX = width - p2.borderX;
      }
      
      else {
        p2.posX += 12;
      }
    }
  }
}
