package com.matrimonial.domain;

import javax.persistence.Entity;
import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;
import org.hibernate.annotations.Type;
import org.joda.time.LocalDate;

@Entity
@Table(name = "matrimonial.users")
public class User {

	@Id
	@Column(name = "username")
	private String username;

	@Column(name = "password", nullable = false)
	private String password;

	@Column(name = "first_name", nullable = false)
	private String firstName;

	@Column(name = "last_name", nullable = false)
	private String lastName;

	@Column(name = "email", nullable = false)
	private String email;

	@Column(name = "gender", nullable = false)
	private String gender;

	@Column(name = "profile_for", nullable = false)
	private String profileFor;

	@Column(name = "date_of_birth", nullable = false)
	@Type(type="org.jadira.usertype.dateandtime.joda.PersistentLocalDate")
	private LocalDate dateOfBirth;

	@Column(name = "ethnicity", nullable = false)
	private String ethnicity;

	@Column(name = "religious_sect", nullable = false)
	private String religiousSect;

	@Column(name = "community_language", nullable = false)
	private String communityLanguage;
	
	@Column(name = "join_date", nullable = false)
	@Type(type="org.jadira.usertype.dateandtime.joda.PersistentLocalDate")
	private LocalDate joinDate;
	
	@Column(name = "role", nullable = false)
	private String role;
	
	@Column(name = "where_did_you_hear_about_us", nullable = false)
	private String whereDidYouHearAboutUs;

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

	public String getProfileFor() {
		return profileFor;
	}

	public void setProfileFor(String profileFor) {
		this.profileFor = profileFor;
	}

	public LocalDate getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(LocalDate dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public String getEthnicity() {
		return ethnicity;
	}

	public void setEthnicity(String ethnicity) {
		this.ethnicity = ethnicity;
	}

	public String getReligiousSect() {
		return religiousSect;
	}

	public void setReligiousSect(String religiousSect) {
		this.religiousSect = religiousSect;
	}

	public String getCommunityLanguage() {
		return communityLanguage;
	}

	public void setCommunityLanguage(String communityLanguage) {
		this.communityLanguage = communityLanguage;
	}
	
	public LocalDate getJoinDate() {
		return joinDate;
	}

	public void setJoinDate(LocalDate joinDate) {
		this.joinDate = joinDate;
	}
	
	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}
	
	public String getWhereDidYouHearAboutUs() {
		return whereDidYouHearAboutUs;
	}

	public void setWhereDidYouHearAboutUs(String whereDidYouHearAboutUs) {
		this.whereDidYouHearAboutUs = whereDidYouHearAboutUs;
	}
}
