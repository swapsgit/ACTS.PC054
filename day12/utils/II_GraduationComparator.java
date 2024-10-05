package cdac.acts.assignment.day12.utils;
import java.util.Comparator;

import cdac.acts.assignment.day12.II_ApplicationFormBase;
public class II_GraduationComparator implements Comparator<II_ApplicationFormBase>{

	@Override
	public int compare(II_ApplicationFormBase o1, II_ApplicationFormBase o2) {
		// TODO Auto-generated method stub
		return o1.getPassoutYear().compareTo(o2.getPassoutYear());
	}

}
