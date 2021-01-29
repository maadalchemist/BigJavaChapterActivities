public class Display {
  // Member Variables
  int dispW, dispH;
  char[][] display;

  // Constructor
  public Display(int _dispW, int _dispH) {
    this.dispW = _dispW;
    this.dispH = _dispH;
    this.display = new char[dispW][dispH];
  }

  // Member Methods
  public void clear() {
    for (int i = 0; i < dispH; i++) {
      for (int j = 0; j < dispW; j++) {
        display[j][i] = ' ';
      }
    }
  }

  public void draw() {
    for (int i = 0; i < dispH; i++) {
      for (int j = 0; j < dispW; j++) {
        System.out.print(display[j][i]);
      }
      System.out.println();
    }
  }

  public void draw_char(int _x, int _y, char _character) {
    display[_x][_y] = _character;
  }

  public void draw_rect(int _x, int _y, int _w, int _h, boolean _fill, char _character) {
    if (_fill) {
      for (int i = 0; i < _w; i++) {
        for (int j = 0; j < _h; j++) {
          display[i + _x][j + _y] = _character;
        }
      }
    } else {
      for (int i = 0; i < _w; i++) {
        display[_x + i][_y] = _character;
        display[_x + i][_y + _h - 1] = _character;
      }
      for (int i = 0; i < _h; i++) {
        display[_x][_y + i] = _character;
        display[_x + _w - 1][_y + i] = _character;
      }
    }
  }

  public void draw_text(int _x, int _y, String _txt) {
    for (int i = 0; i < _txt.length(); i++) {
      display[_x + i][_y] = _txt.charAt(i);
    }
  }

  public void draw_2d_char_array(int _x, int _y, char[][] _array) {
    for (int i = 0; i < _array.length; i++) {
      for (int j = 0; j < _array[0].length; j++) {
        display[i + _x][j + _y] = _array[i][j];
      }
    }
  }
}
