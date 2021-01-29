public class LawnMower {
  // Member variables
  int x, y, facing;
  /* FACING KEY
   * 0 = 'right'
   * 1 = 'up'
   * 2 = 'down'
   * 3 = 'left'  */

  // Constructor
  public LawnMower(int _x, int _y, int _facing) {
    this.x = _x;
    this.y = _y;
    this.facing = _facing;
  }

  // Member Methods
  public void move(char[][] _lawn){
    if (_lawn[x][y] == '#') {
      _lawn[x][y] = '.';
      return;
    }

    int targetX, targetY;
    switch (facing) {
      case 0:
        targetX = Math.max(0, Math.min(x+1, _lawn.length - 1));
        targetY = y;
        break;
      case 1:
        targetX = x;
        targetY = Math.max(0, Math.min(y+1, _lawn[0].length - 1));
        break;
      case 2:
        targetX = Math.max(0, Math.min(x-1, _lawn.length - 1));
        targetY = y;
        break;
      case 3:
        targetX = x;
        targetY = Math.max(0, Math.min(y-1, _lawn[0].length - 1));
        break;
      default:
        targetX = x;
        targetY = y;
        break;
    }

    if (_lawn[targetX][targetY] == '#') {
      x = targetX;
      y = targetY;
    } else {
      facing ++;
    }

    facing = facing % 4;
  }

  public boolean b_stuck(char[][] _lawn) {
    int targetX, targetY, targetIX, targetIY;
    targetX  = Math.max(0, Math.min(x+1, _lawn.length - 1));
    targetY  = Math.max(0, Math.min(y+1, _lawn[0].length - 1));
    targetIX = Math.max(0, Math.min(x-1, _lawn.length - 1));
    targetIY = Math.max(0, Math.min(y-1, _lawn[0].length - 1));

    if(_lawn[targetX][y] != '#' && _lawn[x][targetY] != '#' && _lawn[targetIX][y] != '#' && _lawn[x][targetIY] != '#') {
      return true;
    }
    return false;
  }

  public void display(Display _display){
    _display.draw_char(x + 1, y + 1, 'O');
  }
}
