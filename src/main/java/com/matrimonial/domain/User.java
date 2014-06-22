package com.matrimonial.domain;

import javax.persistence.Entity;
import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import org.hibernate.annotations.Type;
import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.NotEmpty;
import org.joda.time.LocalDate;
import org.springframework.format.annotation.DateTimeFormat;

import com.matrimonial.validator.NotDefaultSelect;

@Entity
@Table(name = "matrimonial.users")
public class User {
	@Id
	@Column(name = "username")
	@NotEmpty
	@Pattern(regexp = "^[a-zA-Z0-9]*$")
	private String username;

	@Column(name = "password", nullable = false)
	@NotEmpty
	@Size(min = 8)
	private String password;

	@Column(name = "first_name", nullable = false)
	@NotEmpty
	private String firstName;

	@Column(name = "last_name", nullable = false)
	@NotEmpty
	private String lastName;

	@Column(name = "email", nullable = false)
	@NotEmpty
	@Email
	private String email;

	@Column(name = "gender", nullable = false)
	@NotEmpty
	private String gender;

	@Column(name = "date_of_birth", nullable = false)
	@Type(type = "org.jadira.usertype.dateandtime.joda.PersistentLocalDate")
	@DateTimeFormat(pattern = "dd/MM/yyyy")
	private LocalDate dateOfBirth;

	@Column(name = "join_date", nullable = false)
	@Type(type = "org.jadira.usertype.dateandtime.joda.PersistentLocalDate")
	private LocalDate joinDate;

	@Column(name = "profile_for", nullable = false)
	@NotDefaultSelect
	private String profileFor;

	@Column(name = "ethnicity", nullable = false)
	@NotDefaultSelect
	private String ethnicity;

	@Column(name = "religious_sect", nullable = false)
	@NotDefaultSelect
	private String religiousSect;

	@Column(name = "community_language", nullable = false)
	@NotDefaultSelect
	private String communityLanguage;

	@Column(name = "where_did_you_hear_about_us", nullable = false)
	@NotDefaultSelect
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

	public LocalDate getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(LocalDate dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public LocalDate getJoinDate() {
		return joinDate;
	}

	public void setJoinDate(LocalDate joinDate) {
		this.joinDate = joinDate;
	}

	public String getProfileFor() {
		return profileFor;
	}

	public void setProfileFor(String profileFor) {
		this.profileFor = profileFor;
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

	public String getWhereDidYouHearAboutUs() {
		return whereDidYouHearAboutUs;
	}

	public void setWhereDidYouHearAboutUs(String whereDidYouHearAboutUs) {
		this.whereDidYouHearAboutUs = whereDidYouHearAboutUs;
	}
}
