/* File  : Animal.java */
package animal;

import java.util.HashSet;
import java.util.Set;

import pair.Pair;

/**
 * Kelas yang bertanggung jawab atas terbentuknya
 * hewan-hewan di dalam <code>Zoo</code>.
 * Di dalam kelas ini terdapat 26 jenis hewan berbeda
 * yang mungkin akan dihidupkan dalam <code>Zoo</code>.
 *
 * @author Vigor Akbar
 * @version %I%, %G%
 */
public class Animal {
  /**
   * Identitas dari hewan.
   * Setiap jenis hewan memiliki <code>id</code> yang unik.
   */
  private String id;

  /**
   * Identitas dari instansi hewan untuk membedakan
   * dengan instansi lain pada jenis yang sama.
   * Setiap instansi hewan memiliki nomor yang unik
   * dari hewan lain yang sejenis.
   */
  private int number;

  /**
   * Legenda hewan, yaitu simbol yang ditampilkan
   * pada peta.
   */
  private char legend;

  /**
   * Berat badan hewan.
   */
  private double weight;

  /**
   * Persentase makanan yang dikonsumsi hewan
   * terhadap berat badan hewan tersebut.
   */
  private double eat;

  private char type;
  private Pair position = new Pair();
  private HashSet<String> compatible = new HashSet<String>();
  private HashSet<Character> habitat = new HashSet<Character>();
  private static int bat_nb;
  private static int cockatoo_nb;
  private static int colugo_nb;
  private static int crane_nb;
  private static int dolphin_nb;
  private static int draco_lizard_nb;
  private static int dugong_nb;
  private static int eagle_nb;
  private static int elephant_nb;
  private static int goose_nb;
  private static int hippopotamus_nb;
  private static int hog_nb;
  private static int hummingbird_nb;
  private static int lion_nb;
  private static int macaque_nb;
  private static int moray_eel_nb;
  private static int owl_nb;
  private static int pelican_nb;
  private static int penguin_nb;
  private static int robin_nb;
  private static int shark_nb;
  private static int sugar_glider_nb;
  private static int turtle_nb;
  private static int whale_nb;
  private static int wolf_nb;
  private static int zebra_nb;

  static {
    bat_nb = 0;
    cockatoo_nb = 0;
    colugo_nb = 0;
    crane_nb = 0;
    dolphin_nb = 0;
    draco_lizard_nb = 0;
    dugong_nb = 0;
    eagle_nb = 0;
    elephant_nb = 0;
    goose_nb = 0;
    hippopotamus_nb = 0;
    hog_nb = 0;
    hummingbird_nb = 0;
    lion_nb = 0;
    macaque_nb = 0;
    moray_eel_nb = 0;
    owl_nb = 0;
    pelican_nb = 0;
    penguin_nb = 0;
    robin_nb = 0;
    shark_nb = 0;
    sugar_glider_nb = 0;
    turtle_nb = 0;
    whale_nb = 0;
    wolf_nb = 0;
    zebra_nb = 0;
  }

  public Animal(String _id,
                Pair _position
  ) {
    id = _id;
    position = new Pair(_position.first, _position.second);
    if (_id.equals("WF")) {
      number = ++wolf_nb;
      eat = 0.2;
      legend = '1';
      weight = 45;
      type = 'K';
      compatible.add(new String("WF"));
      compatible.add(new String("ELP"));
      compatible.add(new String("HPP"));
      habitat.add(new Character('L'));
    } else if (_id.equals("LI")) {
      number = ++lion_nb;
      eat = 0.5;
      legend = '2';
      weight = 158;
      type = 'K';
      compatible.add(new String("LI"));
      habitat.add(new Character('L'));
    } else if (_id.equals("ZBR")) {
      number = ++zebra_nb;
      eat = 0.3;
      legend = '3';
      weight = 226;
      type = 'H';
      compatible.add(new String("ZBR"));
      compatible.add(new String("ELP"));
      compatible.add(new String("MCQ"));
      compatible.add(new String("HG"));
      compatible.add(new String("PNG"));
      compatible.add(new String("HPP"));
      compatible.add(new String("DRL"));
      compatible.add(new String("CLG"));
      compatible.add(new String("SGL"));
      habitat.add(new Character('L'));
    } else if (_id.equals("ELP")) {
      number = ++elephant_nb;
      eat = 0.7;
      legend = '4';
      weight = 5000;
      type = 'H';
      habitat.add(new Character('L'));
      compatible.add(new String("WF"));
      compatible.add(new String("ZBR"));
      compatible.add(new String("ELP"));
      compatible.add(new String("MCQ"));
      compatible.add(new String("HG"));
      compatible.add(new String("PNG"));
      compatible.add(new String("HPP"));
    } else if (_id.equals("MCQ")) {
      number = ++macaque_nb;
      eat = 0.2;
      legend = '5';
      weight = 9;
      type = 'O';
      habitat.add(new Character('L'));
      compatible.add(new String("ZBR"));
      compatible.add(new String("ELP"));
      compatible.add(new String("MCQ"));
      compatible.add(new String("HG"));
      compatible.add(new String("HPP"));
      compatible.add(new String("DRL"));
      compatible.add(new String("CLG"));
      compatible.add(new String("SGL"));
    } else if (_id.equals("HG")) {
      number = ++hog_nb;
      eat = 0.2;
      legend = '6';
      weight = 68;
      type = 'O';
      habitat.add(new Character('L'));
      compatible.add(new String("ZBR"));
      compatible.add(new String("ELP"));
      compatible.add(new String("MCQ"));
      compatible.add(new String("HG"));
      compatible.add(new String("HPP"));
    } else if (_id.equals("SHK")) {
      number = ++shark_nb;
      eat = 0.2;
      legend = '7';
      weight = 771;
      type = 'K';
      habitat.add(new Character('W'));
      compatible.add(new String("SHK"));
      compatible.add(new String("WHL"));
    } else if (_id.equals("MRE")) {
      number = ++moray_eel_nb;
      eat = 0.2;
      legend = '8';
      weight = 13;
      type = 'K';
      habitat.add(new Character('W'));
      compatible.add(new String("MRE"));
      compatible.add(new String("DGG"));
      compatible.add(new String("TRL"));
      compatible.add(new String("DLP"));
      compatible.add(new String("WHL"));
      compatible.add(new String("HPP"));
    } else if (_id.equals("DGG")) {
      number = ++dugong_nb;
      eat = 0.2;
      legend = '9';
      weight = 294;
      type = 'H';
      habitat.add(new Character('W'));
      compatible.add(new String("MRE"));
      compatible.add(new String("DGG"));
      compatible.add(new String("TRL"));
      compatible.add(new String("DLP"));
      compatible.add(new String("WHL"));
      compatible.add(new String("PNG"));
      compatible.add(new String("HPP"));
      compatible.add(new String("PLC"));
      compatible.add(new String("GSE"));
      compatible.add(new String("CRN"));
    } else if (_id.equals("TRL")) {
      number = ++turtle_nb;
      eat = 0.05;
      legend = '0';
      weight = 453;
      type = 'H';
      habitat.add(new Character('W'));
      compatible.add(new String("MRE"));
      compatible.add(new String("DGG"));
      compatible.add(new String("TRL"));
      compatible.add(new String("DLP"));
      compatible.add(new String("WHL"));
      compatible.add(new String("PNG"));
      compatible.add(new String("HPP"));
      compatible.add(new String("GSE"));
      compatible.add(new String("CRN"));
    } else if (_id.equals("DLP")) {
      number = ++dolphin_nb;
      eat = 0.2;
      legend = '!';
      weight = 220;
      type = 'K';
      habitat.add(new Character('W'));
      compatible.add(new String("MRE"));
      compatible.add(new String("DGG"));
      compatible.add(new String("TRL"));
      compatible.add(new String("DLP"));
      compatible.add(new String("WHL"));
      compatible.add(new String("PNG"));
      compatible.add(new String("HPP"));
      compatible.add(new String("PLC"));
      compatible.add(new String("GSE"));
      compatible.add(new String("CRN"));
    } else if (_id.equals("WHL")) {
      number = ++whale_nb;
      eat = 0.1;
      legend = '@';
      weight = 40000;
      type = 'O';
      habitat.add(new Character('W'));
      compatible.add(new String("SHK"));
      compatible.add(new String("MRE"));
      compatible.add(new String("DGG"));
      compatible.add(new String("TRL"));
      compatible.add(new String("DLP"));
      compatible.add(new String("WHL"));
      compatible.add(new String("PNG"));
      compatible.add(new String("HPP"));
      compatible.add(new String("PLC"));
      compatible.add(new String("GSE"));
      compatible.add(new String("CRN"));
    } else if (_id.equals("EGL")) {
      number = ++eagle_nb;
      eat = 0.7;
      legend = '#';
      weight = 4;
      type = 'K';
      habitat.add(new Character('A'));
      compatible.add(new String("EGL"));
      compatible.add(new String("OW"));
      compatible.add(new String("PLC"));
    } else if (_id.equals("OW")) {
      number = ++owl_nb;
      eat = 0.3;
      legend = '$';
      weight = 2;
      type = 'K';
      habitat.add(new Character('A'));
      compatible.add(new String("EGL"));
      compatible.add(new String("OW"));
      compatible.add(new String("PLC"));
      compatible.add(new String("DRL"));
    } else if (_id.equals("HMB")) {
      number = ++hummingbird_nb;
      eat = 0.3;
      legend = '%';
      weight = 0.0002;
      type = 'H';
      habitat.add(new Character('A'));
      compatible.add(new String("HMB"));
      compatible.add(new String("CKT"));
      compatible.add(new String("RBN"));
      compatible.add(new String("BT"));
      compatible.add(new String("PLC"));
      compatible.add(new String("GSE"));
      compatible.add(new String("CRN"));
      compatible.add(new String("CLG"));
      compatible.add(new String("SGL"));
    } else if (_id.equals("CKT")) {
      number = ++cockatoo_nb;
      eat = 0.3;
      legend = '^';
      weight = 0.09;
      type = 'H';
      habitat.add(new Character('A'));
      compatible.add(new String("HMB"));
      compatible.add(new String("CKT"));
      compatible.add(new String("RBN"));
      compatible.add(new String("BT"));
      compatible.add(new String("PLC"));
      compatible.add(new String("GSE"));
      compatible.add(new String("CRN"));
      compatible.add(new String("CLG"));
    } else if (_id.equals("RBN")) {
      number = ++robin_nb;
      eat = 0.3;
      legend = '&';
      weight = 0.06;
      type = 'O';
      habitat.add(new Character('A'));
      compatible.add(new String("HMB"));
      compatible.add(new String("CKT"));
      compatible.add(new String("RBN"));
      compatible.add(new String("BT"));
      compatible.add(new String("PLC"));
      compatible.add(new String("GSE"));
      compatible.add(new String("CRN"));
      compatible.add(new String("CLG"));
      compatible.add(new String("DRL"));
    } else if (_id.equals("BT")) {
      number = ++bat_nb;
      eat = 0.4;
      legend = '*';
      weight = 0.15;
      type = 'O';
      habitat.add(new Character('A'));
      compatible.add(new String("HMB"));
      compatible.add(new String("CKT"));
      compatible.add(new String("RBN"));
      compatible.add(new String("BT"));
      compatible.add(new String("PLC"));
      compatible.add(new String("GSE"));
      compatible.add(new String("CRN"));
    } else if (_id.equals("PNG")) {
      number = ++penguin_nb;
      eat = 0.25;
      legend = '(';
      weight = 22;
      type = 'K';
      habitat.add(new Character('L'));
      habitat.add(new Character('W'));
      compatible.add(new String("ZBR"));
      compatible.add(new String("ELP"));
      compatible.add(new String("PNG"));
      compatible.add(new String("HPP"));
      compatible.add(new String("DRL"));
      compatible.add(new String("CLG"));
      compatible.add(new String("SGL"));
      compatible.add(new String("DGG"));
      compatible.add(new String("TRL"));
      compatible.add(new String("DLP"));
      compatible.add(new String("WHL"));
      compatible.add(new String("PLC"));
      compatible.add(new String("GSE"));
      compatible.add(new String("CRN"));
    } else if (_id.equals("HPP")) {
      number = ++hippopotamus_nb;
      eat = 0.65;
      legend = ')';
      weight = 1496;
      type = 'H';
      habitat.add(new Character('L'));
      habitat.add(new Character('W'));
      compatible.add(new String("WF"));
      compatible.add(new String("ZBR"));
      compatible.add(new String("ELP"));
      compatible.add(new String("MCQ"));
      compatible.add(new String("HG"));
      compatible.add(new String("PNG"));
      compatible.add(new String("HPP"));
      compatible.add(new String("CLG"));
      compatible.add(new String("MRE"));
      compatible.add(new String("DGG"));
      compatible.add(new String("TRL"));
      compatible.add(new String("DLP"));
      compatible.add(new String("WHL"));
      compatible.add(new String("PLC"));
      compatible.add(new String("GSE"));
      compatible.add(new String("CRN"));
    } else if (_id.equals("PLC")) {
      number = ++pelican_nb;
      eat = 0.3;
      legend = '`';
      weight = 7;
      type = 'K';
      habitat.add(new Character('W'));
      habitat.add(new Character('A'));
      compatible.add(new String("MRE"));
      compatible.add(new String("DGG"));
      compatible.add(new String("DLP"));
      compatible.add(new String("WHL"));
      compatible.add(new String("PNG"));
      compatible.add(new String("HPP"));
      compatible.add(new String("PLC"));
      compatible.add(new String("GSE"));
      compatible.add(new String("CRN"));
      compatible.add(new String("EGL"));
      compatible.add(new String("OW"));
      compatible.add(new String("HMB"));
      compatible.add(new String("CKT"));
      compatible.add(new String("RBN"));
      compatible.add(new String("BT"));
      compatible.add(new String("CLG"));
      compatible.add(new String("SGL"));
    } else if (_id.equals("GSE")) {
      number = ++goose_nb;
      eat = 0.3;
      legend = '+';
      weight = 4;
      type = 'H';
      habitat.add(new Character('W'));
      habitat.add(new Character('A'));
      compatible.add(new String("MRE"));
      compatible.add(new String("DGG"));
      compatible.add(new String("TRL"));
      compatible.add(new String("DLP"));
      compatible.add(new String("WHL"));
      compatible.add(new String("PNG"));
      compatible.add(new String("HPP"));
      compatible.add(new String("PLC"));
      compatible.add(new String("GSE"));
      compatible.add(new String("CRN"));
      compatible.add(new String("HMB"));
      compatible.add(new String("CKT"));
      compatible.add(new String("RBN"));
      compatible.add(new String("BT"));
      compatible.add(new String("CLG"));
      compatible.add(new String("SGL"));
    } else if (_id.equals("CRN")) {
      number = ++crane_nb;
      eat = 0.3;
      legend = '-';
      weight = 3;
      type = 'O';
      habitat.add(new Character('W'));
      habitat.add(new Character('A'));
      compatible.add(new String("MRE"));
      compatible.add(new String("DGG"));
      compatible.add(new String("TRL"));
      compatible.add(new String("DLP"));
      compatible.add(new String("WHL"));
      compatible.add(new String("PNG"));
      compatible.add(new String("HPP"));
      compatible.add(new String("PLC"));
      compatible.add(new String("GSE"));
      compatible.add(new String("CRN"));
      compatible.add(new String("HMB"));
      compatible.add(new String("CKT"));
      compatible.add(new String("RBN"));
      compatible.add(new String("BT"));
      compatible.add(new String("DRL"));
      compatible.add(new String("CLG"));
      compatible.add(new String("SGL"));
    } else if (_id.equals("DRL")) {
      number = ++draco_lizard_nb;
      eat = 0.2;
      legend = '=';
      weight = 0.2;
      type = 'K';
      habitat.add(new Character('L'));
      habitat.add(new Character('A'));
      compatible.add(new String("ZBR"));
      compatible.add(new String("MCQ"));
      compatible.add(new String("HG"));
      compatible.add(new String("PNG"));
      compatible.add(new String("DRL"));
      compatible.add(new String("CLG"));
      compatible.add(new String("SGL"));
      compatible.add(new String("OW"));
      compatible.add(new String("RBN"));
      compatible.add(new String("GSE"));
      compatible.add(new String("CRN"));
    } else if (_id.equals("CLG")) {
      number = ++colugo_nb;
      eat = 0.25;
      legend = '<';
      weight = 0.035;
      type = 'H';
      habitat.add(new Character('L'));
      habitat.add(new Character('A'));
      compatible.add(new String("ZBR"));
      compatible.add(new String("MCQ"));
      compatible.add(new String("HG"));
      compatible.add(new String("PNG"));
      compatible.add(new String("HPP"));
      compatible.add(new String("DRL"));
      compatible.add(new String("CLG"));
      compatible.add(new String("SGL"));
      compatible.add(new String("HMB"));
      compatible.add(new String("CKT"));
      compatible.add(new String("RBN"));
      compatible.add(new String("GSE"));
      compatible.add(new String("CRN"));
    } else if (_id.equals("SGL")) {
      number = ++sugar_glider_nb;
      eat = 0.5;
      legend = '>';
      weight = 0.12;
      type = 'O';
      habitat.add(new Character('L'));
      habitat.add(new Character('A'));
      compatible.add(new String("ZBR"));
      compatible.add(new String("MCQ"));
      compatible.add(new String("HG"));
      compatible.add(new String("PNG"));
      compatible.add(new String("DRL"));
      compatible.add(new String("CLG"));
      compatible.add(new String("SGL"));
      compatible.add(new String("HMB"));
      compatible.add(new String("GSE"));
      compatible.add(new String("CRN"));
    } else {
      eat = 0.1;
    }
  }

  public Animal(String _id,
                double _weight,
                Pair _position) {
    id = _id;
        /*
        number = _number;
        legend = _legend;
        eat = _eat;
        type = _type;
        */
    weight = _weight;
    position = new Pair(_position.first, _position.second);
    if (_id.equals("WF")) {
      number = ++wolf_nb; // ini jadi gini
      legend = '1'; // ini juga
      type = 'K'; // ini juga diliat
      eat = 0.2;
      compatible.add(new String("WF"));
      compatible.add(new String("ELP"));
      compatible.add(new String("HPP"));
      habitat.add(new Character('L'));
    } else if (_id.equals("LI")) {
      number = ++lion_nb;
      legend = '2';
      eat = 0.5;
      type = 'K';
      compatible.add(new String("LI"));
      habitat.add(new Character('L'));
    } else if (_id.equals("ZBR")) {
      number = ++zebra_nb;
      legend = '3';
      type = 'H';
      eat = 0.3;
      compatible.add(new String("ZBR"));
      compatible.add(new String("ELP"));
      compatible.add(new String("MCQ"));
      compatible.add(new String("HG"));
      compatible.add(new String("PNG"));
      compatible.add(new String("HPP"));
      compatible.add(new String("DRL"));
      compatible.add(new String("CLG"));
      compatible.add(new String("SGL"));
      habitat.add(new Character('L'));
    } else if (_id.equals("ELP")) {
      number = ++elephant_nb;
      legend = '4';
      eat = 0.7;
      type = 'H';
      habitat.add(new Character('L'));
      compatible.add(new String("WF"));
      compatible.add(new String("ZBR"));
      compatible.add(new String("ELP"));
      compatible.add(new String("MCQ"));
      compatible.add(new String("HG"));
      compatible.add(new String("PNG"));
      compatible.add(new String("HPP"));
    } else if (_id.equals("MCQ")) {
      number = ++macaque_nb;
      legend = '5';
      eat = 0.2;
      type = 'O';
      habitat.add(new Character('L'));
      compatible.add(new String("ZBR"));
      compatible.add(new String("ELP"));
      compatible.add(new String("MCQ"));
      compatible.add(new String("HG"));
      compatible.add(new String("HPP"));
      compatible.add(new String("DRL"));
      compatible.add(new String("CLG"));
      compatible.add(new String("SGL"));
    } else if (_id.equals("HG")) {
      number = ++hog_nb;
      legend = '6';
      eat = 0.2;
      type = 'O';
      habitat.add(new Character('L'));
      compatible.add(new String("ZBR"));
      compatible.add(new String("ELP"));
      compatible.add(new String("MCQ"));
      compatible.add(new String("HG"));
      compatible.add(new String("HPP"));
    } else if (_id.equals("SHK")) {
      number = ++shark_nb;
      legend = '7';
      eat = 0.2;
      type = 'K';
      habitat.add(new Character('W'));
      compatible.add(new String("SHK"));
      compatible.add(new String("WHL"));
    } else if (_id.equals("MRE")) {
      number = ++moray_eel_nb;
      legend = '8';
      eat = 0.2;
      type = 'K';
      habitat.add(new Character('W'));
      compatible.add(new String("MRE"));
      compatible.add(new String("DGG"));
      compatible.add(new String("TRL"));
      compatible.add(new String("DLP"));
      compatible.add(new String("WHL"));
      compatible.add(new String("HPP"));
    } else if (_id.equals("DGG")) {
      number = ++dugong_nb;
      legend = '9';
      eat = 0.2;
      type = 'H';
      habitat.add(new Character('W'));
      compatible.add(new String("MRE"));
      compatible.add(new String("DGG"));
      compatible.add(new String("TRL"));
      compatible.add(new String("DLP"));
      compatible.add(new String("WHL"));
      compatible.add(new String("PNG"));
      compatible.add(new String("HPP"));
      compatible.add(new String("PLC"));
      compatible.add(new String("GSE"));
      compatible.add(new String("CRN"));
    } else if (_id.equals("TRL")) {
      number = ++turtle_nb;
      legend = '0';
      eat = 0.05;
      type = 'H';
      habitat.add(new Character('W'));
      compatible.add(new String("MRE"));
      compatible.add(new String("DGG"));
      compatible.add(new String("TRL"));
      compatible.add(new String("DLP"));
      compatible.add(new String("WHL"));
      compatible.add(new String("PNG"));
      compatible.add(new String("HPP"));
      compatible.add(new String("GSE"));
      compatible.add(new String("CRN"));
    } else if (_id.equals("DLP")) {
      number = ++dolphin_nb;
      legend = '!';
      eat = 0.2;
      type = 'K';
      habitat.add(new Character('W'));
      compatible.add(new String("MRE"));
      compatible.add(new String("DGG"));
      compatible.add(new String("TRL"));
      compatible.add(new String("DLP"));
      compatible.add(new String("WHL"));
      compatible.add(new String("PNG"));
      compatible.add(new String("HPP"));
      compatible.add(new String("PLC"));
      compatible.add(new String("GSE"));
      compatible.add(new String("CRN"));
    } else if (_id.equals("WHL")) {
      number = ++whale_nb;
      legend = '@';
      eat = 0.1;
      type = 'O';
      habitat.add(new Character('W'));
      compatible.add(new String("SHK"));
      compatible.add(new String("MRE"));
      compatible.add(new String("DGG"));
      compatible.add(new String("TRL"));
      compatible.add(new String("DLP"));
      compatible.add(new String("WHL"));
      compatible.add(new String("PNG"));
      compatible.add(new String("HPP"));
      compatible.add(new String("PLC"));
      compatible.add(new String("GSE"));
      compatible.add(new String("CRN"));
    } else if (_id.equals("EGL")) {
      number = ++eagle_nb;
      legend = '#';
      eat = 0.7;
      type = 'K';
      habitat.add(new Character('A'));
      compatible.add(new String("EGL"));
      compatible.add(new String("OW"));
      compatible.add(new String("PLC"));
    } else if (_id.equals("OW")) {
      number = ++owl_nb;
      legend = '$';
      eat = 0.3;
      type = 'K';
      habitat.add(new Character('A'));
      compatible.add(new String("EGL"));
      compatible.add(new String("OW"));
      compatible.add(new String("PLC"));
      compatible.add(new String("DRL"));
    } else if (_id.equals("HMB")) {
      number = ++hummingbird_nb;
      legend = '%';
      eat = 0.3;
      type = 'H';
      habitat.add(new Character('A'));
      compatible.add(new String("HMB"));
      compatible.add(new String("CKT"));
      compatible.add(new String("RBN"));
      compatible.add(new String("BT"));
      compatible.add(new String("PLC"));
      compatible.add(new String("GSE"));
      compatible.add(new String("CRN"));
      compatible.add(new String("CLG"));
      compatible.add(new String("SGL"));
    } else if (_id.equals("CKT")) {
      number = ++cockatoo_nb;
      legend = '^';
      type = 'H';
      eat = 0.3;
      habitat.add(new Character('A'));
      compatible.add(new String("HMB"));
      compatible.add(new String("CKT"));
      compatible.add(new String("RBN"));
      compatible.add(new String("BT"));
      compatible.add(new String("PLC"));
      compatible.add(new String("GSE"));
      compatible.add(new String("CRN"));
      compatible.add(new String("CLG"));
    } else if (_id.equals("RBN")) {
      number = ++robin_nb;
      legend = '&';
      eat = 0.3;
      type = 'O';
      habitat.add(new Character('A'));
      compatible.add(new String("HMB"));
      compatible.add(new String("CKT"));
      compatible.add(new String("RBN"));
      compatible.add(new String("BT"));
      compatible.add(new String("PLC"));
      compatible.add(new String("GSE"));
      compatible.add(new String("CRN"));
      compatible.add(new String("CLG"));
      compatible.add(new String("DRL"));
    } else if (_id.equals("BT")) {
      number = ++bat_nb;
      legend = '*';
      eat = 0.4;
      type = 'O';
      habitat.add(new Character('A'));
      compatible.add(new String("HMB"));
      compatible.add(new String("CKT"));
      compatible.add(new String("RBN"));
      compatible.add(new String("BT"));
      compatible.add(new String("PLC"));
      compatible.add(new String("GSE"));
      compatible.add(new String("CRN"));
    } else if (_id.equals("PNG")) {
      number = ++penguin_nb;
      legend = '(';
      eat = 0.25;
      type = 'K';
      habitat.add(new Character('L'));
      habitat.add(new Character('W'));
      compatible.add(new String("ZBR"));
      compatible.add(new String("ELP"));
      compatible.add(new String("PNG"));
      compatible.add(new String("HPP"));
      compatible.add(new String("DRL"));
      compatible.add(new String("CLG"));
      compatible.add(new String("SGL"));
      compatible.add(new String("DGG"));
      compatible.add(new String("TRL"));
      compatible.add(new String("DLP"));
      compatible.add(new String("WHL"));
      compatible.add(new String("PLC"));
      compatible.add(new String("GSE"));
      compatible.add(new String("CRN"));
    } else if (_id.equals("HPP")) {
      number = ++hippopotamus_nb;
      legend = ')';
      eat = 0.65;
      type = 'H';
      habitat.add(new Character('L'));
      habitat.add(new Character('W'));
      compatible.add(new String("WF"));
      compatible.add(new String("ZBR"));
      compatible.add(new String("ELP"));
      compatible.add(new String("MCQ"));
      compatible.add(new String("HG"));
      compatible.add(new String("PNG"));
      compatible.add(new String("HPP"));
      compatible.add(new String("CLG"));
      compatible.add(new String("MRE"));
      compatible.add(new String("DGG"));
      compatible.add(new String("TRL"));
      compatible.add(new String("DLP"));
      compatible.add(new String("WHL"));
      compatible.add(new String("PLC"));
      compatible.add(new String("GSE"));
      compatible.add(new String("CRN"));
    } else if (_id.equals("PLC")) {
      number = ++pelican_nb;
      legend = '`';
      eat = 0.3;
      type = 'K';
      habitat.add(new Character('W'));
      habitat.add(new Character('A'));
      compatible.add(new String("MRE"));
      compatible.add(new String("DGG"));
      compatible.add(new String("DLP"));
      compatible.add(new String("WHL"));
      compatible.add(new String("PNG"));
      compatible.add(new String("HPP"));
      compatible.add(new String("PLC"));
      compatible.add(new String("GSE"));
      compatible.add(new String("CRN"));
      compatible.add(new String("EGL"));
      compatible.add(new String("OW"));
      compatible.add(new String("HMB"));
      compatible.add(new String("CKT"));
      compatible.add(new String("RBN"));
      compatible.add(new String("BT"));
      compatible.add(new String("CLG"));
      compatible.add(new String("SGL"));
    } else if (_id.equals("GSE")) {
      number = ++goose_nb;
      legend = '+';
      eat = 0.3;
      type = 'H';
      habitat.add(new Character('W'));
      habitat.add(new Character('A'));
      compatible.add(new String("MRE"));
      compatible.add(new String("DGG"));
      compatible.add(new String("TRL"));
      compatible.add(new String("DLP"));
      compatible.add(new String("WHL"));
      compatible.add(new String("PNG"));
      compatible.add(new String("HPP"));
      compatible.add(new String("PLC"));
      compatible.add(new String("GSE"));
      compatible.add(new String("CRN"));
      compatible.add(new String("HMB"));
      compatible.add(new String("CKT"));
      compatible.add(new String("RBN"));
      compatible.add(new String("BT"));
      compatible.add(new String("CLG"));
      compatible.add(new String("SGL"));
    } else if (_id.equals("CRN")) {
      number = ++crane_nb;
      legend = '-';
      eat = 0.3;
      type = 'O';
      habitat.add(new Character('W'));
      habitat.add(new Character('A'));
      compatible.add(new String("MRE"));
      compatible.add(new String("DGG"));
      compatible.add(new String("TRL"));
      compatible.add(new String("DLP"));
      compatible.add(new String("WHL"));
      compatible.add(new String("PNG"));
      compatible.add(new String("HPP"));
      compatible.add(new String("PLC"));
      compatible.add(new String("GSE"));
      compatible.add(new String("CRN"));
      compatible.add(new String("HMB"));
      compatible.add(new String("CKT"));
      compatible.add(new String("RBN"));
      compatible.add(new String("BT"));
      compatible.add(new String("DRL"));
      compatible.add(new String("CLG"));
      compatible.add(new String("SGL"));
    } else if (_id.equals("DRL")) {
      number = ++draco_lizard_nb;
      legend = '=';
      eat = 0.2;
      type = 'K';
      habitat.add(new Character('L'));
      habitat.add(new Character('A'));
      compatible.add(new String("ZBR"));
      compatible.add(new String("MCQ"));
      compatible.add(new String("HG"));
      compatible.add(new String("PNG"));
      compatible.add(new String("DRL"));
      compatible.add(new String("CLG"));
      compatible.add(new String("SGL"));
      compatible.add(new String("OW"));
      compatible.add(new String("RBN"));
      compatible.add(new String("GSE"));
      compatible.add(new String("CRN"));
    } else if (_id.equals("CLG")) {
      number = ++colugo_nb;
      legend = '<';
      eat = 0.25;
      type = 'H';
      habitat.add(new Character('L'));
      habitat.add(new Character('A'));
      compatible.add(new String("ZBR"));
      compatible.add(new String("MCQ"));
      compatible.add(new String("HG"));
      compatible.add(new String("PNG"));
      compatible.add(new String("HPP"));
      compatible.add(new String("DRL"));
      compatible.add(new String("CLG"));
      compatible.add(new String("SGL"));
      compatible.add(new String("HMB"));
      compatible.add(new String("CKT"));
      compatible.add(new String("RBN"));
      compatible.add(new String("GSE"));
      compatible.add(new String("CRN"));
    } else if (_id.equals("SGL")) {
      number = ++sugar_glider_nb;
      legend = '>';
      eat = 0.5;
      type = 'O';
      habitat.add(new Character('L'));
      habitat.add(new Character('A'));
      compatible.add(new String("ZBR"));
      compatible.add(new String("MCQ"));
      compatible.add(new String("HG"));
      compatible.add(new String("PNG"));
      compatible.add(new String("DRL"));
      compatible.add(new String("CLG"));
      compatible.add(new String("SGL"));
      compatible.add(new String("HMB"));
      compatible.add(new String("GSE"));
      compatible.add(new String("CRN"));
    } else {
      eat = 0.1;
    }
  }

  public final String GetId() {
    return id;
  }

  public final int GetNumber() {
    return number;
  }

  public final double GetWeight() {
    return weight;
  }

  public final double GetEat() {
    return eat;
  }

  public final Pair GetPos() {
    return position;
  }

  public final char GetType() {
    return type;
  }

  public final char GetLegend() {
    return legend;
  }

  public final HashSet<Character> GetHabitat() {
    return habitat;
  }

  public void SetWeight(double _weight) {
    weight = _weight;
  }

  public void SetPos(Pair _position) {
    position.first = _position.first;
    position.second = _position.second;
  }

  public final Set<String> GetCompatible() {
    return compatible;
  }

  public final void Act() {
    System.out.print(id + "-");
    if (number < 10) {
      System.out.print("0");
    }
    System.out.print(number + ": ");
    if (id.equals("WF")) {
      System.out.println("*howl*");
    } else if (id.equals("LI")) {
      System.out.println("*roar*");
    } else if (id.equals("ZBR")) {
      System.out.println("*snort*");
    } else if (id.equals("ELP")) {
      System.out.println("*trumpet*");
    } else if (id.equals("MCQ")) {
      System.out.println("*chatter*");
    } else if (id.equals("HG")) {
      System.out.println("*oink*");
    } else if (id.equals("SHK")) {
      System.out.println("*cruise*");
    } else if (id.equals("MRE")) {
      System.out.println("*hide into rocks*");
    } else if (id.equals("DGG")) {
      System.out.println("*splash*");
    } else if (id.equals("TRL")) {
      System.out.println("*swim*");
    } else if (id.equals("DLP")) {
      System.out.println("*click*");
    } else if (id.equals("WHL")) {
      System.out.println("*sing*");
    } else if (id.equals("EGL")) {
      System.out.println("*scream*");
    } else if (id.equals("OW")) {
      System.out.println("*hoot*");
    } else if (id.equals("HMB")) {
      System.out.println("*hum*");
    } else if (id.equals("CKT")) {
      System.out.println("*talk*");
    } else if (id.equals("RBN")) {
      System.out.println("*hoot*");
    } else if (id.equals("BT")) {
      System.out.println("*screech*");
    } else if (id.equals("PNG")) {
      System.out.println("*slide*");
    } else if (id.equals("HPP")) {
      System.out.println("*grunt*");
    } else if (id.equals("PLC")) {
      System.out.println("\"hrraa-hrraa\"");
    } else if (id.equals("GSE")) {
      System.out.println("*quack*");
    } else if (id.equals("CRN")) {
      System.out.println("*soar*");
    } else if (id.equals("DRL")) {
      System.out.println("*jump*");
    } else if (id.equals("CLG")) {
      System.out.println("*glide*");
    } else if (id.equals("SGL")) {
      System.out.println("*crab*");
    }
  }

  public final void Interact() {
    if (id.equals("WF")) {
      Desription("wolf");
    } else if (id.equals("LI")) {
      Desription("lioin");
    } else if (id.equals("ZBR")) {
      Desription("zebra");
    } else if (id.equals("ELP")) {
      Desription("elephant");
    } else if (id.equals("MCQ")) {
      Desription("macaque");
    } else if (id.equals("HG")) {
      Desription("hog");
    } else if (id.equals("SHK")) {
      Desription("shark");
    } else if (id.equals("MRE")) {
      Desription("moray eel");
    } else if (id.equals("DGG")) {
      Desription("dugong");
    } else if (id.equals("TRL")) {
      Desription("turtle");
    } else if (id.equals("DLP")) {
      Desription("dolphin");
    } else if (id.equals("WHL")) {
      Desription("whale");
    } else if (id.equals("EGL")) {
      Desription("eagle");
    } else if (id.equals("OW")) {
      Desription("owl");
    } else if (id.equals("HMB")) {
      Desription("hummingbird");
    } else if (id.equals("CKT")) {
      Desription("cockatoo");
    } else if (id.equals("RBN")) {
      Desription("robin");
    } else if (id.equals("BT")) {
      Desription("bat");
    } else if (id.equals("PNG")) {
      Desription("penguin");
    } else if (id.equals("HPP")) {
      Desription("hippopotamus");
    } else if (id.equals("PLC")) {
      Desription("pelican");
    } else if (id.equals("GSE")) {
      Desription("goose");
    } else if (id.equals("CRN")) {
      Desription("crane");
    } else if (id.equals("DRL")) {
      Desription("draco lizard");
    } else if (id.equals("CLG")) {
      Desription("colugo");
    } else if (id.equals("SGL")) {
      Desription("sugar glider");
    }
    Act();
  }

  public final void Desription(String a) {
    System.out.print("This is a(n) " + a + " called " + id + "-");
    if (number < 10) {
      System.out.print("0");
    }
    System.out.print(number + ". It weights " + weight + " kilograms. It eats ");
    System.out.print((eat * weight) + " kilograms of ");
    if (type == 'K') {
      System.out.print("meats");
    } else if (type == 'O') {
      System.out.print("meats and vegetables");
    } else {
      System.out.print("vegetables");
    }
    System.out.println();
  }

  public void Move(int direction) {
    switch (direction) {
      case 0:
        (position.first)--;
        break;
      case 1:
        (position.second)--;
        break;
      case 2:
        (position.second)++;
        break;
      case 3:
        (position.first)++;
        break;
    }
  }
}
