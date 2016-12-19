package com.myproject;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.autoconfigure.jdbc.DataSourceBuilder;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;

@Configuration
public class MySQLConnectivity {

	@Bean(name = "mysqlDb")
	@ConfigurationProperties(prefix = "spring.datasource")
	public DataSource mysqlDataSource() {
		return DataSourceBuilder.create().build();
	}

	@Bean(name = "mysqlJdbcTemplate")
	public JdbcTemplate jdbcTemplate(@Qualifier("mysqlDb") DataSource dsMySQL) {
		return new JdbcTemplate(dsMySQL);
	}
}
