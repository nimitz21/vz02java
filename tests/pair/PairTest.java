package pair;

import junit.framework.TestCase;

/**
 * Created by Reinaldo on 3/28/2017.
 */
public class PairTest extends TestCase {
	public void testEquals() throws Exception {
		Pair p1 = new Pair();
		Pair p2 = new Pair();
		assert(p1.Equals(p2));
	}

}