package com.fedoseev.lab2.dao;

import com.fedoseev.lab2.model.Country;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class CountryRowMapper implements RowMapper<Country> {
	public static final String ID = "id";
	public static final String NAME = "name";
	public static final String CODE_NAME = "code_name";

	public Country mapRow(ResultSet resultSet, int i) throws SQLException {
		Country country = new Country();
		country.setId(resultSet.getInt(ID));
		country.setName(resultSet.getString(NAME));
		country.setCodeName(resultSet.getString(CODE_NAME));
		return country;
	}
}
