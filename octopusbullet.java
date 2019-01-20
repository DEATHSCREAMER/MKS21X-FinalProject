public class octopusbullet implements ammo{
  private String sprite = "|";
  private int damage = 1;
  private int speed = 1;
  private int size = 1;
  private int x,y;
  private long bLast;


  public octopusbullet(int x, int y, long bLast){
    this.x = x;
    this.y = y;
    this.bLast = bLast;
  }
  public int getSpeed(){
    return speed;
  }
  public int getDamage(){
    return damage;
  }
  public int getSize(){
    return size;
  }
  public int getx(){
    return x;
  }
  public int gety(){
    return y;
  }
  public String getSprite(){
    return sprite;
  }
  public void setbLast(long value){
    bLast = value;
  }
  public long getbLast(){
    return bLast;
  }
  public int move(){
    return y++;
  }
}
