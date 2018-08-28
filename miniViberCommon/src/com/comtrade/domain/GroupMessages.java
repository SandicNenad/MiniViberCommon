package com.comtrade.domain;

import java.io.Serializable;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class GroupMessages implements GeneralDomain, Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int idGroupMessages;
	private int senderId;
	private String groupName;
	private String messageBody;
	private String sendDate;
	private String sendTime;

	public GroupMessages() {
		super();
	}

	public GroupMessages(int idGroupMessages, int senderId, String groupName, String messageBody, String sendDate,
			String sendTime) {
		super();
		this.idGroupMessages = idGroupMessages;
		this.senderId = senderId;
		this.groupName = groupName;
		this.messageBody = messageBody;
		this.sendDate = sendDate;
		this.sendTime = sendTime;
	}

	public GroupMessages(int senderId, String groupName, String messageBody, String sendDate, String sendTime) {
		super();
		this.senderId = senderId;
		this.groupName = groupName;
		this.messageBody = messageBody;
		this.sendDate = sendDate;
		this.sendTime = sendTime;
	}

	public String getMessageBody() {
		return messageBody;
	}

	public void setMessageBody(String messageBody) {
		this.messageBody = messageBody;
	}

	public int getIdGroupMessages() {
		return idGroupMessages;
	}

	public void setIdGroupMessages(int idGroupMessages) {
		this.idGroupMessages = idGroupMessages;
	}

	public int getSenderId() {
		return senderId;
	}

	public void setSenderId(int senderId) {
		this.senderId = senderId;
	}

	public String getGroupName() {
		return groupName;
	}

	public void setGroupName(String groupName) {
		this.groupName = groupName;
	}

	public String getSendDate() {
		return sendDate;
	}

	public void setSendDate(String sendDate) {
		this.sendDate = sendDate;
	}

	public String getSendTime() {
		return sendTime;
	}

	public void setSendTime(String sendTime) {
		this.sendTime = sendTime;
	}

	@Override
	public String getTableName() {
		return "groupmessages";
	}

	@Override
	public String getForInsert() {
		return " (senderId, groupName, messageBody, sendDate, sendTime) "
				+ "VALUES ('"+getSenderId()+"','"+getGroupName()+"','"+getMessageBody()+
				"','"+getSendDate()+"','"+getSendTime()+"')";
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
			while(rs.next()) {
				int senderId = rs.getInt("senderId");
				String groupName = rs.getString("groupName");
				String messageBody = rs.getString("messageBody");
				String sendDate = rs.getDate("sendDate").toString();
				String sendTime = rs.getString("sendTime");
				GroupMessages gm = new GroupMessages(senderId, groupName, messageBody, sendDate, sendTime);
				list.add(gm);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return list;
	}

	@Override
	public String getForSelect() {
		return "groupmessages";
	}

	@Override
	public String getForSelectForSpecific(GeneralDomain u) {
		// TODO Auto-generated method stub
		return null;
	}

}
