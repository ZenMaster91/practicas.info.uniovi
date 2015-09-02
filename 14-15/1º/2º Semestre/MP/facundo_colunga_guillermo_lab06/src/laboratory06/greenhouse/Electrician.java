package laboratory06.greenhouse;

import java.util.ArrayList;

public class Electrician {

	/**
	 * Checks all the elements for the ArrayList of checkables
	 * in the array of the argument.
	 * 
	 * @param toCheck, ArrayList of checkables to check.
	 */
	public static void check(ArrayList<Checkable> toCheck)
	{
		for(Checkable current : toCheck)
			current.check();
	}
}
