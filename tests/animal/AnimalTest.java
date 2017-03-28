package animal;

import junit.framework.TestCase;
import pair.Pair;

/**
 * Created by ASUS INDONESIA on 3/28/2017.
 */
public class AnimalTest extends TestCase {
  public void testGetId() throws Exception {
    Animal a;
    a = new Animal("WF", new Pair(3, 3));
    assert (a.GetId().equals("WF"));
    a = new Animal("LI", new Pair(3, 3));
    assert (a.GetId().equals("LI"));
    a = new Animal("ZBR", new Pair(3, 3));
    assert (a.GetId().equals("ZBR"));
    a = new Animal("ELP", new Pair(3, 3));
    assert (a.GetId().equals("ELP"));
    a = new Animal("MCQ", new Pair(3, 3));
    assert (a.GetId().equals("MCQ"));
    a = new Animal("HG", new Pair(3, 3));
    assert (a.GetId().equals("HG"));
    a = new Animal("SHK", new Pair(3, 3));
    assert (a.GetId().equals("SHK"));
    a = new Animal("MRE", new Pair(3, 3));
    assert (a.GetId().equals("MRE"));
    a = new Animal("DGG", new Pair(3, 3));
    assert (a.GetId().equals("DGG"));
    a = new Animal("TRL", new Pair(3, 3));
    assert (a.GetId().equals("TRL"));
    a = new Animal("DLP", new Pair(3, 3));
    assert (a.GetId().equals("DLP"));
    a = new Animal("WHL", new Pair(3, 3));
    assert (a.GetId().equals("WHL"));
    a = new Animal("EGL", new Pair(3, 3));
    assert (a.GetId().equals("EGL"));
    a = new Animal("OW", new Pair(3, 3));
    assert (a.GetId().equals("OW"));
    a = new Animal("HMB", new Pair(3, 3));
    assert (a.GetId().equals("HMB"));
    a = new Animal("CKT", new Pair(3, 3));
    assert (a.GetId().equals("CKT"));
    a = new Animal("RBN", new Pair(3, 3));
    assert (a.GetId().equals("RBN"));
    a = new Animal("BT", new Pair(3, 3));
    assert (a.GetId().equals("BT"));
    a = new Animal("PNG", new Pair(3, 3));
    assert (a.GetId().equals("PNG"));
    a = new Animal("HPP", new Pair(3, 3));
    assert (a.GetId().equals("HPP"));
    a = new Animal("PLC", new Pair(3, 3));
    assert (a.GetId().equals("PLC"));
    a = new Animal("GSE", new Pair(3, 3));
    assert (a.GetId().equals("GSE"));
    a = new Animal("CRN", new Pair(3, 3));
    assert (a.GetId().equals("CRN"));
    a = new Animal("DRL", new Pair(3, 3));
    assert (a.GetId().equals("DRL"));
    a = new Animal("CLG", new Pair(3, 3));
    assert (a.GetId().equals("CLG"));
    a = new Animal("SGL", new Pair(3, 3));
    assert (a.GetId().equals("SGL"));
  }

  public void testGetNumber() throws Exception {
    Animal a;
    a = new Animal("WF", new Pair(3, 3));
    assert (a.GetNumber() == 1);
    a = new Animal("LI", new Pair(3, 3));
    assert (a.GetNumber() == 1);
    a = new Animal("ZBR", new Pair(3, 3));
    assert (a.GetNumber() == 1);
    a = new Animal("ELP", new Pair(3, 3));
    assert (a.GetNumber() == 1);
    a = new Animal("MCQ", new Pair(3, 3));
    assert (a.GetNumber() == 1);
    a = new Animal("HG", new Pair(3, 3));
    assert (a.GetNumber() == 1);
    a = new Animal("SHK", new Pair(3, 3));
    assert (a.GetNumber() == 1);
    a = new Animal("MRE", new Pair(3, 3));
    assert (a.GetNumber() == 1);
    a = new Animal("DGG", new Pair(3, 3));
    assert (a.GetNumber() == 1);
    a = new Animal("TRL", new Pair(3, 3));
    assert (a.GetNumber() == 1);
    a = new Animal("DLP", new Pair(3, 3));
    assert (a.GetNumber() == 1);
    a = new Animal("WHL", new Pair(3, 3));
    assert (a.GetNumber() == 1);
    a = new Animal("EGL", new Pair(3, 3));
    assert (a.GetNumber() == 1);
    a = new Animal("OW", new Pair(3, 3));
    assert (a.GetNumber() == 1);
    a = new Animal("HMB", new Pair(3, 3));
    assert (a.GetNumber() == 1);
    a = new Animal("CKT", new Pair(3, 3));
    assert (a.GetNumber() == 1);
    a = new Animal("RBN", new Pair(3, 3));
    assert (a.GetNumber() == 1);
    a = new Animal("BT", new Pair(3, 3));
    assert (a.GetNumber() == 1);
    a = new Animal("PNG", new Pair(3, 3));
    assert (a.GetNumber() == 1);
    a = new Animal("HPP", new Pair(3, 3));
    assert (a.GetNumber() == 1);
    a = new Animal("PLC", new Pair(3, 3));
    assert (a.GetNumber() == 1);
    a = new Animal("GSE", new Pair(3, 3));
    assert (a.GetNumber() == 1);
    a = new Animal("CRN", new Pair(3, 3));
    assert (a.GetNumber() == 1);
    a = new Animal("DRL", new Pair(3, 3));
    assert (a.GetNumber() == 1);
    a = new Animal("CLG", new Pair(3, 3));
    assert (a.GetNumber() == 1);
    a = new Animal("SGL", new Pair(3, 3));
    assert (a.GetNumber() == 1);
  }

  public void testGetWeight() throws Exception {
    Animal a;
    a = new Animal("WF", new Pair(3, 3));
    assert (a.GetWeight() == 45);
    a = new Animal("LI", new Pair(3, 3));
    assert (a.GetWeight() == 158);
    a = new Animal("ZBR", new Pair(3, 3));
    assert (a.GetWeight() == 226);
    a = new Animal("ELP", new Pair(3, 3));
    assert (a.GetWeight() == 5000);
    a = new Animal("MCQ", new Pair(3, 3));
    assert (a.GetWeight() == 9);
    a = new Animal("HG", new Pair(3, 3));
    assert (a.GetWeight() == 68);
    a = new Animal("SHK", new Pair(3, 3));
    assert (a.GetWeight() == 771);
    a = new Animal("MRE", new Pair(3, 3));
    assert (a.GetWeight() == 13);
    a = new Animal("DGG", new Pair(3, 3));
    assert (a.GetWeight() == 294);
    a = new Animal("TRL", new Pair(3, 3));
    assert (a.GetWeight() == 453);
    a = new Animal("DLP", new Pair(3, 3));
    assert (a.GetWeight() == 220);
    a = new Animal("WHL", new Pair(3, 3));
    assert (a.GetWeight() == 40000);
    a = new Animal("EGL", new Pair(3, 3));
    assert (a.GetWeight() == 4);
    a = new Animal("OW", new Pair(3, 3));
    assert (a.GetWeight() == 2);
    a = new Animal("HMB", new Pair(3, 3));
    assert (a.GetWeight() == 0.0002);
    a = new Animal("CKT", new Pair(3, 3));
    assert (a.GetWeight() == 0.09);
    a = new Animal("RBN", new Pair(3, 3));
    assert (a.GetWeight() == 0.06);
    a = new Animal("BT", new Pair(3, 3));
    assert (a.GetWeight() == 0.15);
    a = new Animal("PNG", new Pair(3, 3));
    assert (a.GetWeight() == 22);
    a = new Animal("HPP", new Pair(3, 3));
    assert (a.GetWeight() == 1496);
    a = new Animal("PLC", new Pair(3, 3));
    assert (a.GetWeight() == 7);
    a = new Animal("GSE", new Pair(3, 3));
    assert (a.GetWeight() == 4);
    a = new Animal("CRN", new Pair(3, 3));
    assert (a.GetWeight() == 3);
    a = new Animal("DRL", new Pair(3, 3));
    assert (a.GetWeight() == 0.2);
    a = new Animal("CLG", new Pair(3, 3));
    assert (a.GetWeight() == 0.035);
    a = new Animal("SGL", new Pair(3, 3));
    assert (a.GetWeight() == 0.12);
    a = new Animal("SGL", 100.213, new Pair(3, 3));
    assert (a.GetWeight() == 100.213);
  }

  public void testGetEat() throws Exception {
    Animal a;
    a = new Animal("WF", new Pair(3, 3));
    assert (a.GetEat() == 0.2);
    a = new Animal("LI", new Pair(3, 3));
    assert (a.GetEat() == 0.5);
    a = new Animal("ZBR", new Pair(3, 3));
    assert (a.GetEat() == 0.3);
    a = new Animal("ELP", new Pair(3, 3));
    assert (a.GetEat() == 0.7);
    a = new Animal("MCQ", new Pair(3, 3));
    assert (a.GetEat() == 0.2);
    a = new Animal("HG", new Pair(3, 3));
    assert (a.GetEat() == 0.2);
    a = new Animal("SHK", new Pair(3, 3));
    assert (a.GetEat() == 0.2);
    a = new Animal("MRE", new Pair(3, 3));
    assert (a.GetEat() == 0.2);
    a = new Animal("DGG", new Pair(3, 3));
    assert (a.GetEat() == 0.2);
    a = new Animal("TRL", new Pair(3, 3));
    assert (a.GetEat() == 0.05);
    a = new Animal("DLP", new Pair(3, 3));
    assert (a.GetEat() == 0.2);
    a = new Animal("WHL", new Pair(3, 3));
    assert (a.GetEat() == 0.1);
    a = new Animal("EGL", new Pair(3, 3));
    assert (a.GetEat() == 0.7);
    a = new Animal("OW", new Pair(3, 3));
    assert (a.GetEat() == 0.3);
    a = new Animal("HMB", new Pair(3, 3));
    assert (a.GetEat() == 0.3);
    a = new Animal("CKT", new Pair(3, 3));
    assert (a.GetEat() == 0.3);
    a = new Animal("RBN", new Pair(3, 3));
    assert (a.GetEat() == 0.3);
    a = new Animal("BT", new Pair(3, 3));
    assert (a.GetEat() == 0.4);
    a = new Animal("PNG", new Pair(3, 3));
    assert (a.GetEat() == 0.25);
    a = new Animal("HPP", new Pair(3, 3));
    assert (a.GetEat() == 0.65);
    a = new Animal("PLC", new Pair(3, 3));
    assert (a.GetEat() == 0.3);
    a = new Animal("GSE", new Pair(3, 3));
    assert (a.GetEat() == 0.3);
    a = new Animal("CRN", new Pair(3, 3));
    assert (a.GetEat() == 0.3);
    a = new Animal("DRL", new Pair(3, 3));
    assert (a.GetEat() == 0.2);
    a = new Animal("CLG", new Pair(3, 3));
    assert (a.GetEat() == 0.25);
    a = new Animal("SGL", new Pair(3, 3));
    assert (a.GetEat() == 0.5);
  }

  public void testGetPos() throws Exception {
    Animal a = new Animal("SGL", new Pair(2, 3));
    assert (a.GetPos().Equals(new Pair(2, 3)));
  }

  public void testGetType() throws Exception {
    Animal a;
    a = new Animal("WF", new Pair(3, 3));
    assert (a.GetType() == 'K');
    a = new Animal("LI", new Pair(3, 3));
    assert (a.GetType() == 'K');
    a = new Animal("ZBR", new Pair(3, 3));
    assert (a.GetType() == 'H');
    a = new Animal("ELP", new Pair(3, 3));
    assert (a.GetType() == 'H');
    a = new Animal("MCQ", new Pair(3, 3));
    assert (a.GetType() == 'O');
    a = new Animal("HG", new Pair(3, 3));
    assert (a.GetType() == 'O');
    a = new Animal("SHK", new Pair(3, 3));
    assert (a.GetType() == 'K');
    a = new Animal("MRE", new Pair(3, 3));
    assert (a.GetType() == 'K');
    a = new Animal("DGG", new Pair(3, 3));
    assert (a.GetType() == 'H');
    a = new Animal("TRL", new Pair(3, 3));
    assert (a.GetType() == 'H');
    a = new Animal("DLP", new Pair(3, 3));
    assert (a.GetType() == 'K');
    a = new Animal("WHL", new Pair(3, 3));
    assert (a.GetType() == 'O');
    a = new Animal("EGL", new Pair(3, 3));
    assert (a.GetType() == 'K');
    a = new Animal("OW", new Pair(3, 3));
    assert (a.GetType() == 'K');
    a = new Animal("HMB", new Pair(3, 3));
    assert (a.GetType() == 'H');
    a = new Animal("CKT", new Pair(3, 3));
    assert (a.GetType() == 'H');
    a = new Animal("RBN", new Pair(3, 3));
    assert (a.GetType() == 'O');
    a = new Animal("BT", new Pair(3, 3));
    assert (a.GetType() == 'O');
    a = new Animal("PNG", new Pair(3, 3));
    assert (a.GetType() == 'K');
    a = new Animal("HPP", new Pair(3, 3));
    assert (a.GetType() == 'H');
    a = new Animal("PLC", new Pair(3, 3));
    assert (a.GetType() == 'K');
    a = new Animal("GSE", new Pair(3, 3));
    assert (a.GetType() == 'H');
    a = new Animal("CRN", new Pair(3, 3));
    assert (a.GetType() == 'O');
    a = new Animal("DRL", new Pair(3, 3));
    assert (a.GetType() == 'K');
    a = new Animal("CLG", new Pair(3, 3));
    assert (a.GetType() == 'H');
    a = new Animal("SGL", new Pair(3, 3));
    assert (a.GetType() == 'O');
  }

  public void testGetLegend() throws Exception {

  }

  public void testGetHabitat() throws Exception {

  }

  public void testGetCompatible() throws Exception {

  }

  public void testMove() throws Exception {
		Animal a= new Animal ("WF", new Pair(0, 0));
		a.Move(0);
		assert(a.GetPos().first == -1 && a.GetPos().second == 0);
		a.Move(1);
		assert(a.GetPos().first == -1 && a.GetPos().second == -1);
		a.Move(2);
		assert(a.GetPos().first == -1 && a.GetPos().second == 0);
		a.Move(3);
		assert(a.GetPos().first == 0 && a.GetPos().second == 0);
  }

}