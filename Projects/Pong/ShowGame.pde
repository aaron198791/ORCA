void showGame() {
  p1.display();
  p2.display();
  
  try {
    puck.move();
    puck.display();
  }
  
  catch(Exception e) {
  }
}
