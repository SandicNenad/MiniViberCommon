package com.comtrade.constant;

public class Constant {
	public static final int CREATE_USER =1;
	public static final int CREATE_USER_SUCCESSFULL =2;
	public static final int CREATE_USER_FAILED =3;
	public static final int GET_ALL_USERS = 4;
	public static final int LOGIN =5;
	public static final int LOGIN_SUCCESSFULL =6;
	public static final int LOGIN_FAILED =7;
	public static final int UPDATE_USER_INFO =8;
	public static final int UPDATE_SUCCESSFULL =9;
	public static final int REFRESH_FORM =10;
	public static final int SEND_PASSWORD_TO_EMAIL = 11;
	public static final int SEND_PASSWORD_SUCCESS = 12;
	public static final int SEND_PASSWORD_FAILED = 13;
	
	public static final int GROUPMEMBERS_CREATED =31;
	public static final int GROUPMEMBERS_KICKED = 32;
	public static final int GROUPMEMBERS_CHANGED =33;
	public static final int GROUPMEMBERS_CANCELREQUEST = 34;
	public static final int GROUPMEMBERS_ASKTOJOIN =35;
	public static final int GROUPMEMBERS_ACCEPTEDMEMBERSHIP =36;
	public static final int GROUPMEMBERS_DECLINEDMEMBERSHIP =37;
	
	public static final int FRIEND_REQUEST_SENT = 51;
	public static final int FRIEND_REQUEST_RECIEVED =52;
	public static final int FRIEND_REQUEST_ACCEPTED = 53;
	public static final int FRIEND_REQUEST_DECLINED =54;
	public static final int FRIEND_REQUEST_BLOCK_FRIEND =55;
	public static final int FRIEND_REQUEST_BLOCK_NON_FRIEND = 56;
	public static final int FRIEND_REQUEST_UNBLOCK_USER =57;
	
	public static final int MESSAGE_PENDING_OPERATION = 61;
	public static final int MESSAGE_DELIVERED_OPERATION = 62;
	public static final int MESSAGE_SEEN_OPERATION =63;
	
	public static final int GROUP_CREATE_OPERATION = 71;
	public static final int GROUP_CREATE_FAILED =72;
	public static final int GROUP_CREATE_SUCCESS =73;
	
	public static final int GROUPMESSAGE_CREATEOPERATION = 81;
	public static final int GROUPMESSAGE_NEWMESSAGE =82;
	
	public static final int LIST_OF_ACTIVE_USERS_CHANGED = 21;
	
	public static final int COPY_PROFILE_PICTURE_TO_SERVER =110;
	public static final int UPDATED_PROFILE_PICTURE =111;
	public static final int SEND_MY_PROFILE_PICTURE_TO_NEW_FRIEND= 112;
	public static final int ASK_FOR_FRIEND_PROFILE_PICTURE = 113;
	public static final int COPY_GROUP_PICTURE_TO_ALL = 114;
	public static final int UPDATED_GROUP_PICTURE = 115;
	public static final int ASK_FOR_GROUP_PICTURE = 116;
	
	public static final String ACTIVE_USERS = "ACTIVE USERS";
	public static final String ALL_USERS_LIST = "ALL_USERS_LIST";
	public static final String ALL_USERS_HM = "ALL_USERS_HM";
	public static final String CURRENT_USER = "CURENT_USER";
	public static final String ALL_FRIEND_RELATION_LIST = "ALL_FRIEND_RELATION_LIST";
	public static final String ALL_PRIVATE_MESSAGES = "All_PRIVATE_MESSAGES";
	public static final String VALUE_FOR_SELECT = "VALUE_FOR_SELECT";
	public static final String ALL_GROUPS_LIST = "ALL_GROUPS_LIST";
	public static final String ALL_GROUPS_HM =  "ALL_GROUPS_HM";
	public static final String ALL_GROUPMEMBERS_LIST = "ALL_GROUPMEMBERS";
	public static final String ALL_GROUPMESSAGES_LIST = "ALL_GROUPMESSAGES";
	public static final String ALL_NEW_PICTURES_LIST ="ALL_PICTURES_FROM_SERVER_HM";
	public static final String ALL_NEW_GROUP_PICTURES = "ALL_GROUP_PICTURES_FROM_SERVER_HM";
	
	public static final String LIST_OF_OBJECT = "ListOfObject";
	public static final String TYPE_OF_OBJECT = "TypeOfObject";
	
	public static final String BUTTON_ADD_FRIEND = "Add ";
	public static final String BUTTON_DECLINE_REQUEST = "Decline";
	public static final String BUTTON_ACCEPT_REQUEST = "Accept";
	public static final String BUTTON_BLOCK_USER = "Block";
	public static final String BUTTON_UNFRIEND = "Unfriend";
	public static final String BUTTON_CANCEL_REQUEST = "Cancel request";
	public static final String BUTTON_UNBLOCK_REQUEST = "Unblock";
	public static final String BUTTON_SEND_PRIVATEMESSAGE ="Send message";
	public static final String BUTTON_GROUP_ASKTOJOIN ="Send group request";
	public static final String BUTTON_GROUP_KICKFROMGROUP = "Kick from group";
	public static final String BUTTON_GROUP_ACCEPTINTOGROUP = "Accept into group";
	public static final String BUTTON_GROUP_DECLINETOGROUP = "Decline";
	public static final String BUTTON_GROUP_CANCELREQUST = "Cancel request";
	public static final String BUTTON_GROUP_LEAVE = "Leave group";
	public static final String BUTTON_GROUP_SENDMESSAGE = "Send message";
	
	
	public static final String MESSAGE_PENDING = "Pending";
	public static final String MESSAGE_DELIVERED = "Delivered";
	public static final String MESSAGE_SEEN = "Seen";
	
	
	public static final String COUNTRIESANDTOWNS ="dataFiles/countriesandtowns.txt";
	public static final String ADRESS_IP_PORT ="dataFiles/ipadress.txt";
	public static final String PROFILE_PICTURES_HM = "profilePictures.txt";
	public static final String GROUP_PICTURES_HM = "groupPictures.txt";
	
	public static final String PROFILE_PICTURE ="profilePicture/";
	public static final String PROFILE_PICTURE_SERVER = "serverProfilePictures/";
	public static final String COUNTRY_PICTURES = "countryPictures/";
	public static final String PROFILE_PICTURE_MALE = "profilePicture/male.jpg";
	public static final String PROFILE_PICTURE_FEMALE = "profilePicture/female.jpg";
	public static final String ICON_INFO = "icons/info-icon.png";
	public static final String ICON_GROUP_DEFAULT ="groupPicture/group-icon.png";
	public static final String GROUP_PICTURE = "groupPicture/";
	public static final String GROUP_PICTURE_SERVER = "serverGroupPicture/";
	
	public static final String ICON_USER_ONLINE ="icons/online-icon.png";
	public static final String ICON_USER_OFFLINE ="icons/offline-icon.png";
	public static final String ICON_USER_RECIEVED_REQUEST ="icons/recieved-request.png";
	public static final String ICON_USER_SENT_REQUEST ="icons/sent-request.png";
	public static final String ICON_USER_BLOCKED ="icons/blocked-icon.png";
	public static final String ICON_USER_NOT_FRIENDS="icons/notfriend-icon.png";
	public static final String ICON_USER_GROUP_ADMIN ="icons/adminIcon.png";
	public static final String ICON_USER_GROUP_MEMBER ="icons/memberIcon.png";
	public static final String ICON_USER_GROUP_SENT_REQUEST ="icons/groupSentRequest.png";
	public static final String ICON_SEND_MESSAGE = "icons/send-message.png";
	
}
