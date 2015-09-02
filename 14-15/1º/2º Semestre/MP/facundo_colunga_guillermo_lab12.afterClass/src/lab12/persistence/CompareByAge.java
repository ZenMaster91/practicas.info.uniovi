package lab12.persistence;

import java.util.Comparator;

public class CompareByAge implements Comparator<Vehicle> {

	@Override
	public int compare(Vehicle v1, Vehicle v2) {
		if(v1.getYears() < v2.getYears())
			return -1;
		if(v1.getYears() > v2.getYears())
			return 1;
		return 0;
	}

}
