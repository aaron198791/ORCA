void impact() {
  float impactSlider = 0;
  
  if(puck.x >= p1.posX - p1.borderX && puck.x <= p1.posX + p1.borderX && puck.y >= height - p1.borderX) {
    impactSlider = ((puck.x - p1.posX) / p1.borderX) * (PI / 4);
    
    puck.dx = abs(puck.dy) * atan(impactSlider);
    puck.dy = -puck.dy;
  }
  
  if(puck.x >= p2.posX - p2.borderX && puck.x <= p2.posX + p2.borderX && puck.y <= p2.borderX) {
    impactSlider = ((puck.x - p2.posX) / p2.borderX) * (PI / 4);
    
    puck.dx = abs(puck.dy) * atan(impactSlider);
    puck.dy = -puck.dy;
  }
  
  puck.x += puck.dx;
  puck.y += puck.dy;
}
  
