package piano;

public class Block {
  private int x;
  private int y;

  /**
   * @return the x
   */
  public int getX() {
    return x;
  }

  /**
   * @return the y
   */
  public int getY() {
    return y;
  }

  /**
   * @param x the x to set
   */
  public void setX(int x) {
    this.x = x;
  }

  /**
   * @param y the y to set
   */
  public void setY(int y) {
    this.y = y;
  }

  @Override
  public boolean equals(Object obj) {
    Block block = (Block) obj;
    if(this.x == block.x && this.y == block.y){
      return true;
    }
    
    return super.equals(obj);
  }
  
}