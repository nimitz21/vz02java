package pair;

/**
 * Class Pair untuk menyimpan pasangan int.
 *
 * @author Reinaldo Ignatius Wijaya
 * @version %I%, %G%
 */
public class Pair {
  public int first;
  public int second;

  /**
   * Ctor tanpa parameter.
   */
  public Pair() {
    first = 0;
    second = 0;
  }

  /**
   * Ctor dengan parameter.
   *
   * @param _first  int pertama.
   * @param _second int kedua.
   */
  public Pair(int _first, int _second) {
    first = _first;
    second = _second;
  }

  /**
   * Equals untuk mengecek kesamaan 2 buah Pair.
   *
   * @param pair Pair yang akan dicek kesamaannya.
   * @return true jika kedua pair sama dan false jika tidak.
   */
  public boolean Equals(Pair pair) {
    return first == pair.first && second == pair.second;
  }
}
