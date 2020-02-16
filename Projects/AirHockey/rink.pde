public void rink(PImage img) {
  background(255);
  stroke(135, 206, 250);
  strokeWeight(10);
  line(width / 3, 0, width / 3, height);
  line(2 * width / 3, 0, 2 * width / 3, height);
  stroke(255, 0, 0);
  strokeWeight(20);
  line(width / 2, 0, width / 2, height);
  stroke(100);
  strokeWeight(30);
  line(0, 0, width, 0);
  line(width, 0, width, (height / 2) - 70);
  line(width, (height / 2) + 70, width, height);
  line(width, height, 0, height);
  line(0, height, 0, (height / 2) + 70);
  line(0, (height / 2) - 70, 0, 0);
  image(img, (width / 2) - 200, (height / 2) - 100, 400, 200);
  stroke(0);
}
