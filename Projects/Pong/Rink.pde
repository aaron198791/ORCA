void rink() {
  strokeWeight(5);
  stroke(0, 0, 255);
  line(0, height / 3, width, height / 3);
  line(0, 2 * height / 3, width, 2 * height / 3);
  stroke(255, 0, 0);
  line(0, height / 2, width, height / 2);
    
  strokeWeight(30);
  stroke(155);
  line(0, 0, width / 3, 0);
  line(2 * width / 3, 0, width, 0);
  line(width, 0, width, height);
  line(width, height, 2 * width / 3, height);
  line(width / 3, height, 0, height);
  line(0, height, 0, 0);
  
  strokeWeight(5);
  stroke(155);
  noFill();
  ellipseMode(CENTER);
  arc(width / 2, height / 2, height / 4, height / 4, 0, TWO_PI);
  strokeWeight(0);
}
