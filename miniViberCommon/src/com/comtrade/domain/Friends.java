package com.comtrade.domain;

import java.io.Serializable;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class Friends implements Serializable, GeneralDomain {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int userOneId;
	private int userTwoId;
	private int actionUserId;
	private int actionStatus;

	public Friends() {
		super();
	}

	public Friends(int userOneId, int userTwoId, int actionUserId, int actionStatus) {
		super();
		this.userOneId = userOneId;
		this.userTwoId = userTwoId;
		this.actionUserId = actionUserId;
		this.actionStatus = actionStatus;
	}

	public int getUserOneId() {
		return userOneId;
	}

	public void setUserOneId(int userOneId) {
		this.userOneId = userOneId;
	}

	public int getUserTwoId() {
		return userTwoId;
	}

	public void setUserTwoId(int userTwoId) {
		this.userTwoId = userTwoId;
	}

	public int getActionUserId() {
		return actionUserId;
	}

	public void setActionUserId(int actionUserId) {
		this.actionUserId = actionUserId;
	}

	public int getActionStatus() {
		return actionStatus;
	}

	public void setActionStatus(int actionStatus) {
		this.actionStatus = actionStatus;
	}

	@Override
	public String getTableName() {
		return "friends";
	}

	@Override
	public String getForInsert() {
		if (getUserOneId() < getUserTwoId()) {
			return "(userOneId, userTwoId, actionUser, actionStatus) " + "VALUES (" + getUserOneId() + ","
					+ getUserTwoId() + "," + getActionUserId() + "," + getActionStatus() + ")";
		} else {
			return "(userOneId, userTwoId, actionUser, actionStatus) " + "VALUES (" + getUserTwoId() + ","
					+ getUserOneId() + "," + getActionUserId() + "," + getActionStatus() + ")";
		}
	}

	@Override
	public String getForUpdate(GeneralDomain gd) {
		Friends fr = (Friends) gd;
		if (fr.getUserOneId() < fr.getUserTwoId()) {
			return " SET actionUser=" + fr.getActionUserId() + ",actionStatus=" + fr.getActionStatus()
					+ " WHERE userOneId=" + fr.getUserOneId() + " AND userTwoId=" + fr.getUserTwoId() + "";
		} else {
			return " SET actionUser=" + fr.getActionUserId() + ",actionStatus=" + fr.getActionStatus()
			+ " WHERE userOneId=" + fr.getUserTwoId() + " AND userTwoId=" + fr.getUserOneId() + "";
		}
	}

	@Override
	public String getForDelete(GeneralDomain gd) {
		Friends fr = (Friends) gd;
		if (fr.getUserOneId()<fr.getUserTwoId()) {
			return " WHERE userOneId="+fr.getUserOneId()+" AND userTwoId="+fr.getUserTwoId()+"";
		}else {
			return " WHERE userOneId="+fr.getUserTwoId()+" AND userTwoId="+fr.getUserOneId()+"";
		}
	}

	@Override
	public List<GeneralDomain> editSelect(ResultSet rs) {
		List<GeneralDomain> list = new ArrayList<>();
		try {
			while (rs.next()) {
				int userOneId = rs.getInt("userOneId");
				int userTwoId = rs.getInt("userTwoId");
				int actionUser = rs.getInt("actionUser");
				int actionStatus = rs.getInt("actionStatus");
				Friends fr = new Friends(userOneId, userTwoId, actionUser, actionStatus);
				list.add(fr);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return list;
	}

	@Override
	public String getForSelect() {
		return "friends";
	}

	@Override
	public String getForSelectForSpecific(GeneralDomain u) {
		// TODO Auto-generated method stub
		return null;
	}

}
