/* File  : Cell.java */

package cell;

import java.util.Random;

/**
 * Kelas untuk mengisi sel-sel dalam matriks pada <code>Zoo</code>.
 *
 * @author Gisela Supardi
 * @version %I%, %G%
 */
public class Cell {
  /**
   * Simbol asli untuk sel dengan jenis tertentu.
   */
  private Character initial_symbol;

  /**
   * Simbol yang akan ditampilkan pada layar (dapat dioverwrite animal).
   */
  private Character symbol;

  /**
   * State dari sekat untuk habitat; true untuk terbuka, false untuk tertutup.
   */
  private Boolean[] sekat;

  /**
   * Tanaman yang ditanam di taman.
   */
  private String plant;

  /**
   * Jenis makanan yang dijual di restoran.
   */
  private String food;

  /**
   * Penanda restoran buka atau tutup; true untuk buka, false untuk tutup.
   */
  private Boolean open;

  /**
   * Constructor.
   * @param _initial_symbol initial symbol untuk diisi ke <code>Cell</code>
   * Menciptakan cell
   */
  public Cell(final char _initial_symbol) {
    int i;
    Random rand = new Random();
    initial_symbol = new Character(_initial_symbol);
    symbol = new Character(_initial_symbol);
    sekat = new Boolean[4];
    plant = new String();
    food = new String();
    open = new Boolean(true);
    for (i = 0; i < 4; ++i) {
      sekat[i] = false;
    }
    i = rand.nextInt(10);
    switch (i) {
      case 0:
        plant = "";
        food = "ekkado";
        open = false;
        break;
      case 1:
        plant = "apple trees";
        food = "batagor";
        break;
      case 2:
        plant = "roses";
        food = "pizza";
        break;
      case 3:
        plant = "dandelions";
        food = "ketoprak";
        break;
      case 4:
        plant = "sokas";
        food = "sushi";
        break;
      case 5:
        plant = "cambodias";
        food = "gado-gado";
        break;
      case 6:
        plant = "tulips";
        food = "Padang food";
        break;
      case 7:
        plant = "sunflowers";
        food = "fried rice";
        break;
      case 8:
        plant = "daisies";
        food = "meatball";
        break;
      case 9:
        plant = "maze-shaped bushes";
        food = "pho";
        open = false;
        break;
    }
  }

    /**
     * Membalikan nilai <code>initial_symbol</code> yang disimpan <code>Cell</code>.
     *
     * @return initial symbol.
     */
    public final Character GetInitSymbol() {
        return initial_symbol;
    }

    /**
     * Mengembalikan nilai simbol yang disimpan <code>Cell</code>.
     *
     * @return symbol.
     */
    public final Character GetSymbol() {
        return symbol;
    }

    /**
     * Mengubah <code>initial_symbol</code> dengan simbol baru
     * yaitu <code>s</code>.
     * I.S.: <code>initial_symbol</code> sembarang.
     * F.S.: <code>initial_symbol</code> telah terganti dengan <code>s</code>.
     *
     * @param s initial <code>symbol</code> yang baru.
     */
    public void SetInitSymbol(final char s) {
        initial_symbol = new Character(s);
    }

    /**
     * Mengubah <code>symbol</code> dengan simbol baru
     * yaitu <code>s</code>.
     * I.S.: <code>symbol</code> sembarang.
     * F.S.: <code>symbol</code> telah terganti dengan <code>s</code>.
     *
     * @param s <code>symbol</code> yang baru.
     */
    public void SetSymbol(final char s) {
        symbol = new Character(s);
    }

    /**
     * Memasang atau menghilangkan sekat antar-<code>Cell</code>;
     * I.S.: sembarang.
     * F.S.: sekat terbuka/tertutup tergantung kondisi awal.
     *
     * @param direction arah yang ingin dibuka
     */
    public void ToggleSekat(final int direction) {
        sekat[direction] = !sekat[direction];
    }

    /**
     * Mengecek apakah ke arah <code>direction</code>
     * terdapat <code>sekat</code>.
     *
     * @param direction arah yang ingin dicek
     * @return sekat dengan arah <code>direction</code>
     */
    public final boolean GetSekat(final int direction) {
        return sekat[direction];
    }

    /**
     * Interact.
     * I.S: sembarang
     * F.S: Interaksi dengan restoran atau park dilakukan
     */
    public final void Interact() {
        switch (initial_symbol) {
            case 'P': {
                System.out.print("This park has ");
                if (!"".equals(plant)) {
                    System.out.print(plant);
                } else {
                    System.out.print("nothing");
                }
                System.out.println(" planted on it.");
            }
            case 'R': {
                if (open) {
                    System.out.println("This restaurant sells " + food + ".");
                } else {
                    System.out.println("This restaurant is closed.");
                }
            }
        }
    }

    /**
     * Mengembalikan makanan yang dijual di restoran.
     *
     * @return food
     */
    public final String GetFood() {
        return food;
    }

    /**
     * Mengembalikan status buka restoran.
     *
     * @return open
     */
    public final boolean GetOpen() {
        return open;
    }

    /**
     * Mengubah jenis makanan yang dijual restoran menjadi jenis yang di-input.
     * I.S.: <code>food</code> sembarang.
     * F.S.: <code>food</code> telah terganti dengan <code>f</code>.
     *
     * @param f jenis makanan yang akan dijual
     */
    public void SetFood(final String f) {
        food = f;
    }

  /**
   * Mengubah status buka restoran menjadi kebalikan dari initial state.
   * I.S.: keadaan <code>open</code> sembarang.
   * F.S.: keadaan <code>open</code> menjadi kebalikan dari keadaan semula.
   */
  public void ToggleOpen() {
    open = !open;
  }

    /**
     * Mengembalikan nama tanaman yang tertanam pada taman.
     *
     * @return plant
     */
    public final String GetPlant() {
        return plant;
    }

    /**
     * Mengubah nama tanaman yang tertanam pada taman dengan p.
     * I.S.: <code>plant</code> sembarang.
     * F.S.: <code>plant</code> telah terganti dengan <code>p</code>.
     *
     * @param p tanaman yang ingin ditanam
     */
    public void SetPlant(final String p) {
        plant = p;
    }
}
