package com.comtrade.comparator;

import java.util.Comparator;

import com.comtrade.domain.Groups;

public class MyComparatorGroups implements Comparator<Groups> {

	@Override
	public int compare(Groups o1, Groups o2) {
		return o1.getGroupName().compareToIgnoreCase(o2.getGroupName());
	}

}
