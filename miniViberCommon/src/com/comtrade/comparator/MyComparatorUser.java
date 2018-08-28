package com.comtrade.comparator;

import java.util.Comparator;

import com.comtrade.domain.User;

public class MyComparatorUser implements Comparator<User>{

	@Override
	public int compare(User user1, User user2) {
		if (user1.getLastName().compareToIgnoreCase(user2.getLastName())==0) {
			return user1.getFirstName().compareToIgnoreCase(user2.getFirstName());
		}else {
			return user1.getLastName().compareToIgnoreCase(user2.getLastName());
		}
	}

}
