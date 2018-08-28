package com.comtrade.domain;

import java.io.Serializable;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class User implements Serializable, GeneralDomain {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int idUser;
	private String username;
	private String password;
	private String firstName;
	private String lastName;
	private String email;
	private String gender;
	private String aboutMe;
	private String workplace;
	private String education;
	private String town;
	private String country;
	private String dateOfBirth;
	private String dateOfRegistration;
	private String typeOfUser;
	private String profilePictureURL;

	public User() {
		super();
	}

	public User(String username, String password, String firstName, String lastName, String email, String gender,
			String aboutMe, String workplace, String education, String town, String country, String dateOfBirth,
			String dateOfRegistration, String typeOfUser, String profilePictureURL) {
		super();
		this.username = username;
		this.password = password;
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.gender = gender;
		this.aboutMe = aboutMe;
		this.workplace = workplace;
		this.education = education;
		this.town = town;
		this.country = country;
		this.dateOfBirth = dateOfBirth;
		this.dateOfRegistration = dateOfRegistration;
		this.typeOfUser = typeOfUser;
		this.profilePictureURL = profilePictureURL;
	}

	
	
	public User(int idUser, String username, String password, String firstName, String lastName, String email,
			String gender, String aboutMe, String workplace, String education, String town, String country,
			String dateOfBirth, String dateOfRegistration, String typeOfUser, String profilePictureURL) {
		super();
		this.idUser = idUser;
		this.username = username;
		this.password = password;
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.gender = gender;
		this.aboutMe = aboutMe;
		this.workplace = workplace;
		this.education = education;
		this.town = town;
		this.country = country;
		this.dateOfBirth = dateOfBirth;
		this.dateOfRegistration = dateOfRegistration;
		this.typeOfUser = typeOfUser;
		this.profilePictureURL = profilePictureURL;
	}

	@Override
	public String getTableName() {
		return "user";
	}

	@Override
	public String getForInsert() {
		return "(username, password, firstName, lastName, email, gender, aboutMe, workplace, "
				+ "education, town, country, dateOfBirth, dateOfRegistration, typeOfUser, profilePictureURL) "
				+ "VALUES ('"+getUsername()+"','"+getPassword()+"','"+getFirstName()+"','"
				+getLastName()+"','"+getEmail()+"','"+getGender()+"','"+getAboutMe()+"','"
				+getWorkplace()+"','"+getEducation()+"','"+getTown()+"','"+getCountry()+"','"
				+getDateOfBirth()+"','"+getDateOfRegistration()+"','"+getTypeOfUser()+"','"+getProfilePictureURL()+"')";
	}

	@Override
	public String getForUpdate(GeneralDomain gd) {
		User u = (User) gd;
		return " SET firstName='"+u.getFirstName()+"', lastName='"+u.getLastName()+"',email='"+u.getEmail()+"',gender='"+u.getGender()+"',aboutMe='"+u.getAboutMe()+"'"
				+ ",workplace='"+u.getWorkplace()+"',education='"+u.getEducation()+"',town='"+u.getTown()+"',country='"+u.getCountry()+"', dateOfBirth='"+u.getDateOfBirth()+"',profilePictureURL='"+u.getProfilePictureURL()+"' WHERE username='"+u.getUsername()+"'";
	}

	@Override
	public String getForDelete(GeneralDomain gd) {
		return null;
	}

	@Override
	public List<GeneralDomain> editSelect(ResultSet rs) {
		List<GeneralDomain> list = new ArrayList<>();
		try {
			while(rs.next()) {
				int idUser = rs.getInt("idUser");
				String username = rs.getString("username");
				String password = rs.getString("password");
				String firstName = rs.getString("firstName");
				String lastName = rs.getString("lastName");
				String email = rs.getString("email");
				String gender = rs.getString("gender");
				String aboutMe = rs.getString("aboutMe");
				String workplace = rs.getString("workplace");
				String education = rs.getString("education");
				String town = rs.getString("town");
				String country = rs.getString("country");
				String dateOfBirth = rs.getDate("dateOfBirth").toString();
				String dateOfRegistration = rs.getDate("dateOfRegistration").toString();
				String typeOfUser = rs.getString("typeOfUser");
				String profilePictureURL = rs.getString("profilePictureURL");
				User u = new User(idUser, username, password, firstName, lastName, email, gender, aboutMe, workplace, education, town, country, dateOfBirth, dateOfRegistration, typeOfUser,profilePictureURL);
				list.add(u);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return list;
	}

	@Override
	public String getForSelect() {
		return "user";
	}

	
	
	public int getIdUser() {
		return idUser;
	}

	public void setIdUser(int idUser) {
		this.idUser = idUser;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getAboutMe() {
		return aboutMe;
	}

	public void setAboutMe(String aboutMe) {
		this.aboutMe = aboutMe;
	}

	public String getWorkplace() {
		return workplace;
	}

	public void setWorkplace(String workplace) {
		this.workplace = workplace;
	}

	public String getEducation() {
		return education;
	}

	public void setEducation(String education) {
		this.education = education;
	}

	public String getTown() {
		return town;
	}

	public void setTown(String town) {
		this.town = town;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(String dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public String getDateOfRegistration() {
		return dateOfRegistration;
	}

	public void setDateOfRegistration(String dateOfRegistration) {
		this.dateOfRegistration = dateOfRegistration;
	}

	public String getTypeOfUser() {
		return typeOfUser;
	}

	public void setTypeOfUser(String typeOfUser) {
		this.typeOfUser = typeOfUser;
	}

	public String getProfilePictureURL() {
		return profilePictureURL;
	}

	public void setProfilePictureURL(String profilePictureURL) {
		this.profilePictureURL = profilePictureURL;
	}

	@Override
	public String toString() {
		return lastName+" "+firstName ;
	}

	@Override
	public String getForSelectForSpecific(GeneralDomain u) {
		// TODO Auto-generated method stub
		return null;
	}
	
	
}
