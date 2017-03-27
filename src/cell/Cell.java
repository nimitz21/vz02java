/* File  : Cell.java */
/* Author: Gisela Supardi */

package cell;

import java.io.FileInputStream;
import java.util.Random;

/**
 * \brief Class Cell.
 * \details Kelas untuk mengisi sel-sel dalam matriks pada Zoo.
 */
public class Cell {
  private Character initial_symbol; /**< simbol asli untuk sel dengan jenis tertentu*/
  private Character symbol; /**< simbol yang akan ditampilkan pada layar (dapat dioverwrite animal)*/
  private Boolean[] sekat; /**< state dari sekat untuk habitat; true untuk terbuka, false untuk tertutup */
  private String plant; /**< tanaman yang ditanam di taman*/
  private String food; /**< jenis makanan yang dijual di restoran*/
  private Boolean open; /**< penanda restoran buka atau tutup; true untuk buka, false untuk tutup*/

  /**
   * \brief Constructor dengan parameter.
   * \details Menciptakan cell dengan symbol default yaitu '-'.
   */
  public Cell() {
    int i;
    Random rand = new Random();
    initial_symbol = new Character('-');
    symbol = new Character('-');
    sekat = new Boolean[4];
    plant = new String();
    food = new String();
    open = new Boolean(true);
    for (i = 0; i < 4; ++i) {
      sekat[i] = false;
    }
    i = rand.nextInt(10);
    switch (i) {
      case 0: {
        plant = "";
        food = "ekkado";
        open = false;
      }
      break;
      case 1: {
        plant = "apple trees";
        food = "batagor";
      }
      break;
      case 2: {
        plant = "roses";
        food = "pizza";
      }
      break;
      case 3: {
        plant = "dandelions";
        food = "ketoprak";
      }
      break;
      case 4: {
        plant = "sokas";
        food = "sushi";
      }
      break;
      case 5: {
        plant = "cambodias";
        food = "gado-gado";
      }
      break;
      case 6: {
        plant = "tulips";
        food = "Padang food";
      }
      break;
      case 7: {
        plant = "sunflowers";
        food = "fried rice";
      }
      break;
      case 8: {
        plant = "daisies";
        food = "meatball";
      }
      break;
      case 9: {
        plant = "maze-shaped bushes";
        food = "pho";
        open = false;
      }
      break;
    }
  }

  /**
   * \brief GetInitSymbol.
   * \details membalikan nilai initial_symbol cell.
   * \return init symbol.
   */
  public char GetInitSymbol() {
    return initial_symbol;
  }

  /**
   * \brief GetSymbol.
   * \details mengembalikan nilai simbol cell.
   * \return symbol.
   */
  public char GetSymbol() {
    return symbol;
  }

  /**
   * \brief SetInitSymbol.
   * \details mengubah initial_symbol dengan s.
   * \param s initial_symbol yang baru.
   */
  public void SetInitSymbol(char s) {
    initial_symbol = s;
  }
  /**
   * \brief SetSymbol.
   * \details mengubah symbol dengan s.
   * \param s symbol yang baru.
   */
  public void SetSymbol(char s) {
    symbol = s;
  }

  /**
   * \brief ToggleSekat
   * \details Memasang atau menghilangkan sekat antar-Cell
   *
   * \param direction arah yang ingin dibuka
   */
  public void ToggleSekat(int direction) {
    if (sekat[direction]) {
      sekat[direction] = false;
    } else {
      sekat[direction] = true;
    }
  }

  /**
   * \brief GetSekat
   * \details Mengecek apakah ke arah direction terdapat sekat
   *
   * \param direction arah yang ingin dicek
   */
  public boolean GetSekat(int direction) {
    return sekat[direction];
  }

  /**
   * \brief Interact
   * \details Interaksi dengan Cell
   */
  public void Interact() {
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
   * \brief GetFood
   * \details Mengembalikan jenis makanan yang dijual restoran
   * \return jenis makanan
   */
  public String GetFood() {
    return food;
  }

  /**
   * \brief GetOpen
   * \details Mengembalikan status restoran
   * \return bool true jika buka, false jika tutup
   */
  public boolean GetOpen() {
    return open;
  }

  /**
   * \brief SetFood
   * \details Mengubah jenis makanan yang dijual restoran
   * \param f Jenis makanan yang akan dijual
   */
  public void SetFood(String f) {
    food = f;
  }

  /**
   * \brief ToggleOpen
   * \details Mengubah status restoran
   */
  public void ToggleOpen() {
    if (open) {
      open = false;
    } else {
      open = true;
    }
  }

  /**
   * \brief GetPlant
   * \details Mengembalikan tanaman yang tertanam pada taman
   * \return jenis tanaman
   */
  public String GetPlant() {
    return plant;
  }

  /**
   * \brief SetPlant
   * \details Mengubah tanaman yang tertanam pada taman dengan p
   * \param p Tanaman yang ingin ditanam
   */
  public void SetPlant(String p) {
    plant = p;
  }
}
