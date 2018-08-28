package com.comtrade.domain;

import java.io.Serializable;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.comtrade.constant.Constant;

public class PrivateMessage implements Serializable, GeneralDomain {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int idMessage;
	private int userOneId;
	private int userTwoId;
	private int senderId;
	private String messageStatus;
	private String sendDate;
	private String receivedDate;
	private String sendTime;
	private String receivedTime;
	private String messageBody;

	public PrivateMessage() {
		super();
	}

	public PrivateMessage(int idMessage, int userOneId, int userTwoId, int senderId, String messageStatus,
			String sendDate, String receivedDate, String sendTime, String receivedTime, String messageBody) {
		super();
		this.idMessage = idMessage;
		this.userOneId = userOneId;
		this.userTwoId = userTwoId;
		this.senderId = senderId;
		this.messageStatus = messageStatus;
		this.sendDate = sendDate;
		this.receivedDate = receivedDate;
		this.sendTime = sendTime;
		this.receivedTime = receivedTime;
		this.messageBody = messageBody;
	}

		
	
	public PrivateMessage(int userOneId, int userTwoId, int senderId, String messageStatus, String sendDate,
			String receivedDate, String sendTime, String receivedTime, String messageBody) {
		super();
		this.userOneId = userOneId;
		this.userTwoId = userTwoId;
		this.senderId = senderId;
		this.messageStatus = messageStatus;
		this.sendDate = sendDate;
		this.receivedDate = receivedDate;
		this.sendTime = sendTime;
		this.receivedTime = receivedTime;
		this.messageBody = messageBody;
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

	public int getSenderId() {
		return senderId;
	}

	public void setSenderId(int senderId) {
		this.senderId = senderId;
	}

	public String getMessageStatus() {
		return messageStatus;
	}

	public void setMessageStatus(String messageStatus) {
		this.messageStatus = messageStatus;
	}

	public String getSendDate() {
		return sendDate;
	}

	public void setSendDate(String sendDate) {
		this.sendDate = sendDate;
	}

	public String getReceivedDate() {
		return receivedDate;
	}

	public void setReceivedDate(String receivedDate) {
		this.receivedDate = receivedDate;
	}

	public String getSendTime() {
		return sendTime;
	}

	public void setSendTime(String sendTime) {
		this.sendTime = sendTime;
	}

	public String getReceivedTime() {
		return receivedTime;
	}

	public void setReceivedTime(String receivedTime) {
		this.receivedTime = receivedTime;
	}

	public String getMessageBody() {
		return messageBody;
	}

	public void setMessageBody(String messageBody) {
		this.messageBody = messageBody;
	}

	public int getIdMessage() {
		return idMessage;
	}

	public void setIdMessage(int idMessage) {
		this.idMessage = idMessage;
	}

	@Override
	public String getTableName() {
		return "privatemessage";
	}

	@Override
	public String getForInsert() {
		return "(userOneId, userTwoId, senderId, messageStatus, sendDate, sendTime, receivedDate, receivedTime, messageBody) "
				+ "VALUES ('"+getUserOneId()+"','"+getUserTwoId()+"','"+getSenderId()+"','"+getMessageStatus()+"','"+getSendDate()+
				"','"+getSendTime()+"','"+getReceivedDate()+"','"+getReceivedTime()+"','"+getMessageBody()+"')";
	}

	@Override
	public String getForUpdate(GeneralDomain gd) {
		PrivateMessage pm = (PrivateMessage) gd;
		return " SET receivedDate='"+pm.getReceivedDate()+"', receivedTime='"+pm.getReceivedTime()+"', messageStatus='"+pm.getMessageStatus()+"' WHERE "
				+ "userOneId = "+pm.getUserOneId()+" AND userTwoId="+pm.getUserTwoId()+" AND senderId="+pm.getSenderId()+" AND messageStatus='"+Constant.MESSAGE_PENDING+"'";
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
				int idMessage = rs.getInt("idMessage");
				int userOneId= rs.getInt("userOneId");
				int userTwoId = rs.getInt("userTwoId");
				int senderId = rs.getInt("senderId");
				String messageStatus = rs.getString("messageStatus");
				String sendDate = rs.getDate("sendDate").toString();
				String receivedDate = rs.getDate("receivedDate").toString();
				String sendTime = rs.getTime("sendTime").toString();
				String receivedTime = rs.getTime("receivedTime").toString();
				String messageBody = rs.getString("messageBody");
				PrivateMessage pm = new PrivateMessage(idMessage, userOneId, userTwoId, senderId, messageStatus, sendDate, receivedDate, sendTime, receivedTime, messageBody);
				list.add(pm);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return list;
	}

	@Override
	public String getForSelect() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getForSelectForSpecific(GeneralDomain u) {
		User user = (User) u;
		return " WHERE userOneId="+user.getIdUser()+" or userTwoId="+user.getIdUser();
	}

}
