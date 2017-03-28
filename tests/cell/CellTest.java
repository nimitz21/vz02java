package cell;

import junit.framework.TestCase;

/**
 * Created by ASUS INDONESIA on 3/28/2017.
 */
public class CellTest extends TestCase {
  public void testGetInitSymbol() throws Exception {
    Cell c;
    c = new Cell('L');
    assert (c.GetInitSymbol().charValue() == 'L');
  }

  public void testGetSymbol() throws Exception {
    Cell c;
    c = new Cell('W');
    assert (c.GetSymbol().charValue() == 'W');
  }

  public void testToggleSekat() throws Exception {
    Cell c;
    c = new Cell('W');
    assert (!c.GetSekat(0));
    assert (!c.GetSekat(1));
    assert (!c.GetSekat(2));
    assert (!c.GetSekat(3));
    c.ToggleSekat(0);
    assert (c.GetSekat(0));
    assert (!c.GetSekat(1));
    assert (!c.GetSekat(2));
    assert (!c.GetSekat(3));
    c.ToggleSekat(1);
    assert (c.GetSekat(0));
    assert (c.GetSekat(1));
    assert (!c.GetSekat(2));
    assert (!c.GetSekat(3));
    c.ToggleSekat(2);
    assert (c.GetSekat(0));
    assert (c.GetSekat(1));
    assert (c.GetSekat(2));
    assert (!c.GetSekat(3));
    c.ToggleSekat(3);
    assert (c.GetSekat(0));
    assert (c.GetSekat(1));
    assert (c.GetSekat(2));
    assert (c.GetSekat(3));
  }

  public void testGetSekat() throws Exception {
    Cell c;
    c = new Cell('W');
    assert (!c.GetSekat(0));
    assert (!c.GetSekat(1));
    assert (!c.GetSekat(2));
    assert (!c.GetSekat(3));
  }

}