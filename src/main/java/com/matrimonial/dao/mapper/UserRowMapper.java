package com.matrimonial.dao.mapper;

import com.matrimonial.domain.User;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.joda.time.LocalDate;
import org.springframework.jdbc.core.RowMapper;

public class UserRowMapper implements RowMapper<User> {
	public User mapRow(ResultSet rs, int rowNum) throws SQLException {
		User user = new User();
		user.setUsername(rs.getString("username"));
		user.setPassword(rs.getString("password"));
		user.setFirstName(rs.getString("first_name"));
		user.setLastName(rs.getString("last_name"));
		user.setFullName(rs.getString("first_name") + " " + rs.getString("last_name"));
		user.setEmail(rs.getString("email"));
		user.setGender(rs.getString("gender"));
		user.setProfileFor(rs.getString("profile_for"));
		LocalDate dateOfBirth = LocalDate.fromDateFields(rs.getDate("date_of_birth"));
		user.setDateOfBirth(dateOfBirth);
		LocalDate joinDate = LocalDate.fromDateFields(rs.getDate("join_date"));
		user.setJoinDate(joinDate);
		user.setEthnicity(rs.getString("ethnicity"));
		user.setReligiousSect(rs.getString("religious_sect"));
		user.setCommunityLanguage(rs.getString("community_language"));
		return user;
	}
}