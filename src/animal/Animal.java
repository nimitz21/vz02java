package animal;

import pair.Pair;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by ASUS INDONESIA on 3/27/2017.
 */
public class Animal {
	public Animal(float f, Pair p) {}
	public Animal(Pair p) {}
	public String GetId() {
		return "a";
	}

	public int GetNumber() {
		return 0;
	}

	public Pair GetPos() {
		Pair a;
		a = new Pair();
		a.first = 1;
		a.second = 1;
		return a;
	}

	public Set<Character> GetHabitat() {
		Set<Character> hab;
		hab = new HashSet<Character>();
		return hab;
	}

	public Set<String> GetCompatible() {
		Set<String> hab;
		hab = new HashSet<String>();
		return hab;
	}

	public char GetType() {
		return 'X';
	}

	public char GetLegend() {
		return 'x';
	}

	public float GetWeight() {
		return 0;
	}

	public float GetEat() {
		return 0;
	}

	public void Move(int direction) {
	}

	public void Interact() {}
}
