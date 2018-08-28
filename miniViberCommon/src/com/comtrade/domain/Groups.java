package com.comtrade.domain;

import java.io.Serializable;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class Groups implements GeneralDomain, Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String groupName;
	private int groupCreatorId;
	private String dateOfCreation;
	private String timeOfCreation;
	private String groupInfo;
	private String groupPictureURL;

	public Groups() {
		super();
	}

	public Groups(String groupName, int groupCreatorId, String dateOfCreation, String timeOfCreation,
			String groupInfo) {
		super();
		this.groupName = groupName;
		this.groupCreatorId = groupCreatorId;
		this.dateOfCreation = dateOfCreation;
		this.timeOfCreation = timeOfCreation;
		this.groupInfo = groupInfo;
	}

	public Groups(String groupName, int groupCreatorId, String dateOfCreation, String timeOfCreation, String groupInfo,
			String groupPictureURL) {
		super();
		this.groupName = groupName;
		this.groupCreatorId = groupCreatorId;
		this.dateOfCreation = dateOfCreation;
		this.timeOfCreation = timeOfCreation;
		this.groupInfo = groupInfo;
		this.groupPictureURL = groupPictureURL;
	}

	public String getGroupPictureURL() {
		return groupPictureURL;
	}

	public void setGroupPictureURL(String groupPictureURL) {
		this.groupPictureURL = groupPictureURL;
	}

	public String getGroupName() {
		return groupName;
	}

	public void setGroupName(String groupName) {
		this.groupName = groupName;
	}

	public int getGroupCreatorId() {
		return groupCreatorId;
	}

	public void setGroupCreatorId(int groupCreatorId) {
		this.groupCreatorId = groupCreatorId;
	}

	public String getDateOfCreation() {
		return dateOfCreation;
	}

	public void setDateOfCreation(String dateOfCreation) {
		this.dateOfCreation = dateOfCreation;
	}

	public String getTimeOfCreation() {
		return timeOfCreation;
	}

	public void setTimeOfCreation(String timeOfCreation) {
		this.timeOfCreation = timeOfCreation;
	}

	public String getGroupInfo() {
		return groupInfo;
	}

	public void setGroupInfo(String groupInfo) {
		this.groupInfo = groupInfo;
	}

	@Override
	public String getTableName() {
		return "groups";
	}

	@Override
	public String getForInsert() {
		return "(groupName, groupCreatorId, dateOfCreation, timeOfCreation, groupInfo, groupPictureURL) " + "VALUES ('" + getGroupName()
				+ "', '" + getGroupCreatorId() + "','" + getDateOfCreation() + "','" + getTimeOfCreation() + "', '"
				+ getGroupInfo() + "','"+getGroupPictureURL()+"')";
	}

	@Override
	public String getForUpdate(GeneralDomain gd) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getForDelete(GeneralDomain gd) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<GeneralDomain> editSelect(ResultSet rs) {
		List<GeneralDomain> list = new ArrayList<>();
		try {
			while (rs.next()) {
				String groupName = rs.getString("groupName");
				int groupCreatorId = rs.getInt("groupCreatorId");
				String dateOfCreation = rs.getDate("dateOfCreation").toString();
				String timeOfCreation = rs.getTime("timeOfCreation").toString();
				String groupInfo = rs.getString("groupInfo");
				String groupPictureURL = rs.getString("groupPictureURL");
				Groups gr = new Groups(groupName, groupCreatorId, dateOfCreation, timeOfCreation, groupInfo, groupPictureURL);
				list.add(gr);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return list;
	}

	@Override
	public String getForSelect() {
		return "groups";
	}

	@Override
	public String getForSelectForSpecific(GeneralDomain u) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String toString() {
		return getGroupName();
	}

}
