package animal;

import junit.framework.TestCase;
import pair.Pair;

/**
 * Created by ASUS INDONESIA on 3/28/2017.
 */
public class AnimalTest extends TestCase {
  public void testGetId() throws Exception {
    Animal a= new Animal("WF".toString(), new Pair(3,3));
    assert(a.GetId().equals("WF".toString()));
  }

  public void testGetNumber() throws Exception {

  }

  public void testGetWeight() throws Exception {

  }

  public void testGetEat() throws Exception {

  }

  public void testGetPos() throws Exception {

  }

  public void testGetType() throws Exception {

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