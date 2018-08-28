package com.comtrade.domain;

import java.io.Serializable;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class GroupMembers implements GeneralDomain, Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int idUser;
	private String groupName;
	private String dateOfJoin;
	private String timeOfJoin;
	private String typeOfMember;
	private String dateOfDeliveredMessage;
	private String timeOfDeliveredMessage;

	public GroupMembers() {
		super();
	}

	public GroupMembers(int idUser, String groupName, String dateOfJoin, String timeOfJoin, String typeOfMember) {
		super();
		this.idUser = idUser;
		this.groupName = groupName;
		this.dateOfJoin = dateOfJoin;
		this.timeOfJoin = timeOfJoin;
		this.typeOfMember = typeOfMember;
		this.dateOfDeliveredMessage ="2000-01-01";
		this.timeOfDeliveredMessage ="00:00:00:000";
	}

	public GroupMembers(int idUser, String groupName, String dateOfJoin, String timeOfJoin, String typeOfMember,
			String dateOfDeliveredMessage, String timeOfDeliveredMessage) {
		super();
		this.idUser = idUser;
		this.groupName = groupName;
		this.dateOfJoin = dateOfJoin;
		this.timeOfJoin = timeOfJoin;
		this.typeOfMember = typeOfMember;
		this.dateOfDeliveredMessage = dateOfDeliveredMessage;
		this.timeOfDeliveredMessage = timeOfDeliveredMessage;
	}

	public int getIdUser() {
		return idUser;
	}

	public void setIdUser(int idUser) {
		this.idUser = idUser;
	}

	public String getGroupName() {
		return groupName;
	}

	public void setGroupName(String groupName) {
		this.groupName = groupName;
	}

	public String getDateOfJoin() {
		return dateOfJoin;
	}

	public void setDateOfJoin(String dateOfJoin) {
		this.dateOfJoin = dateOfJoin;
	}

	public String getTimeOfJoin() {
		return timeOfJoin;
	}

	public void setTimeOfJoin(String timeOfJoin) {
		this.timeOfJoin = timeOfJoin;
	}

	public String getTypeOfMember() {
		return typeOfMember;
	}

	public void setTypeOfMember(String typeOfMember) {
		this.typeOfMember = typeOfMember;
	}

	public String getDateOfDeliveredMessage() {
		return dateOfDeliveredMessage;
	}

	public void setDateOfDeliveredMessage(String dateOfDeliveredMessage) {
		this.dateOfDeliveredMessage = dateOfDeliveredMessage;
	}

	public String getTimeOfDeliveredMessage() {
		return timeOfDeliveredMessage;
	}

	public void setTimeOfDeliveredMessage(String timeOfDeliveredMessage) {
		this.timeOfDeliveredMessage = timeOfDeliveredMessage;
	}

	@Override
	public String getTableName() {
		return "groupmembers";
	}

	@Override
	public String getForInsert() {
		return "(idUser, groupName, dateOfJoin, timeOfJoin, typeOfMember, dateOfDeliveredMessage, timeOfDeliveredMessage) VALUES ('"+getIdUser()+"', '"+getGroupName()+"','"+getDateOfJoin()+"','"+getTimeOfJoin()+"','"+getTypeOfMember()+"','"+getDateOfDeliveredMessage()+"','"+getTimeOfDeliveredMessage()+"')";
	}

	@Override
	public String getForUpdate(GeneralDomain gd) {
		GroupMembers grMem = (GroupMembers) gd;
		return " SET dateOfJoin='"+grMem.getDateOfJoin()+"', timeOfJoin='"+grMem.getTimeOfJoin()+"', typeOfMember='"+grMem.getTypeOfMember()+"', dateOfDeliveredMessage='"+grMem.getDateOfDeliveredMessage()+"', timeOfDeliveredMessage='"+grMem.getTimeOfDeliveredMessage()+"' WHERE idUser='"+grMem.getIdUser()+"' AND groupName='"+grMem.getGroupName()+"'";
	}

	@Override
	public String getForDelete(GeneralDomain gd) {
		GroupMembers grMem = (GroupMembers) gd;
		return " WHERE idUser='"+grMem.getIdUser()+"' AND groupName='"+grMem.getGroupName()+"'";
	}

	@Override
	public List<GeneralDomain> editSelect(ResultSet rs) {
		List<GeneralDomain> list = new ArrayList<>();
		try {
			while(rs.next()) {
				int idUser = rs.getInt("idUser");
				String groupName = rs.getString("groupName");
				String dateOfJoin = rs.getDate("dateOfJoin").toString();
				String timeOfJoin = rs.getString("timeOfJoin");
				String typeOfMember = rs.getString("typeOfMember");
				String dateOfDeliveredMessage = rs.getDate("dateOfDeliveredMessage").toString();
				String timeOfDeliveredMessage = rs.getString("timeOfDeliveredMessage");
				GroupMembers grMem =new GroupMembers(idUser, groupName, dateOfJoin, timeOfJoin, typeOfMember, dateOfDeliveredMessage, timeOfDeliveredMessage);
				list.add(grMem);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return list;
	}

	@Override
	public String getForSelect() {
		return "groupmembers";
	}

	@Override
	public String getForSelectForSpecific(GeneralDomain u) {
		// TODO Auto-generated method stub
		return null;
	}

}
