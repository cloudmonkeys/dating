package com.matrimonial.dao.impl;

import com.matrimonial.dao.UserDao;
import com.matrimonial.domain.User;
import com.matrimonial.dao.mapper.UserRowMapper;
import java.util.List;
import java.util.Map;
import java.util.HashMap;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.core.namedparam.SqlParameterSource;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.stereotype.Repository;

@Repository
public class UserDaoJDBCImpl implements UserDao {
	private NamedParameterJdbcTemplate namedParameterJdbcTemplate;

	public void setNamedParameterJdbcTemplate(
			NamedParameterJdbcTemplate namedParameterJdbcTemplate) {
		this.namedParameterJdbcTemplate = namedParameterJdbcTemplate;
	}

	@Override
	public void addUser(User user) {
		String sql = "INSERT INTO matrimonial.users (username, password, first_name, last_name, email, gender, profile_for, date_of_birth, ethnicity, "
				+ "religious_sect, community_language, join_date) VALUES (:username, :password, :firstName, :lastName, :email, :gender, :profileFor, "
				+ ":dateOfBirth, :ethnicity, :religiousSect, :communityLanguage, getDate())";
		Map<String, Object> parameters = new HashMap<String, Object>();
		parameters.put("username", user.getUsername());
		parameters.put("password", user.getPassword());
		parameters.put("firstName", user.getFirstName());
		parameters.put("lastName", user.getLastName());
		parameters.put("email", user.getEmail());
		parameters.put("gender", user.getGender());
		parameters.put("profileFor", user.getProfileFor());
		parameters.put("dateOfBirth", user.getDateOfBirth());
		parameters.put("ethnicity", user.getEthnicity());
		parameters.put("religiousSect", user.getReligiousSect());
		parameters.put("communityLanguage", user.getCommunityLanguage());
		namedParameterJdbcTemplate.update(sql, parameters);
	}

	@Override
	public User getUserByUsername(String username) {
		String sql = "SELECT * FROM matrimonial.users WHERE username = :username";
		SqlParameterSource parameters = new MapSqlParameterSource("username",
				username);
		User user = namedParameterJdbcTemplate.queryForObject(sql, parameters,
				new UserRowMapper());
		return user;
	}

	@Override
	public List<User> getAllUsers() {
		String sql = "SELECT * FROM matrimonial.users";
		List<User> users = namedParameterJdbcTemplate.query(sql,
				new UserRowMapper());
		return users;
	}

	@Override
	public void updateUserDetails(User user) {
		String sql = "UPDATE matrimonial.users SET password = :password, first_name = :firstName, last_name = :lastName, email = :email, gender = :gender, "
				+ "profile_for = :profileFor, date_of_birth = :dateOfBirth, ethnicity = :ethnicity, religious_sect = :religiousSect, "
				+ "community_language = :communityLanguage WHERE username = :username";
		Map<String, Object> parameters = new HashMap<String, Object>();
		parameters.put("username", user.getUsername());
		parameters.put("password", user.getPassword());
		parameters.put("firstName", user.getFirstName());
		parameters.put("lastName", user.getLastName());
		parameters.put("email", user.getEmail());
		parameters.put("gender", user.getGender());
		parameters.put("profileFor", user.getProfileFor());
		parameters.put("dateOfBirth", user.getDateOfBirth());
		parameters.put("ethnicity", user.getEthnicity());
		parameters.put("religiousSect", user.getReligiousSect());
		parameters.put("communityLanguage", user.getCommunityLanguage());
		namedParameterJdbcTemplate.update(sql, parameters);
	}
}