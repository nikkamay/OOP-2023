package ie.tudublin;

// import processing.core.PApplet;
import processing.core.PVector;

class Bullet
{
  PVector pos;
  PVector forward;
  float theta;
  boolean isPlayerBullet;
  
  Bullet(float x, float y, float theta, boolean isPlayerBullet)
  {
    pos = new PVector(x, y);
    forward = new PVector(0, -1);
    this.theta = theta;
    this.isPlayerBullet = isPlayerBullet;
  }
  
  void update()
  {

    
  }
  
  void render()
  {
    if (isPlayerBullet)
    {

    }
    else
    {

    }
    

  }
  
  
}