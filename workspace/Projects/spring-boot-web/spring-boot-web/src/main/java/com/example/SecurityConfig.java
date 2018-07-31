package com.example;



import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.web.authentication.SavedRequestAwareAuthenticationSuccessHandler;
import org.springframework.security.web.authentication.rememberme.JdbcTokenRepositoryImpl;
import org.springframework.security.web.authentication.rememberme.PersistentTokenRepository;

@Configuration
@EnableWebSecurity
public class SecurityConfig extends  WebSecurityConfigurerAdapter{

	@Autowired
	DataSource dataSource;
	
	@Autowired
	protected void configure(AuthenticationManagerBuilder builder) throws Exception{
		builder.jdbcAuthentication().dataSource(dataSource)
		.usersByUsernameQuery("select username,password, enabled from user where username=?")
		.authoritiesByUsernameQuery("select us.username, ur.role from user us, user_role ur where "
				   + "us.id = ur.user_id and us.username =?");
	}
	
	protected void configure(HttpSecurity httpSecurity) throws Exception {
		httpSecurity.authorizeRequests().antMatchers("/").permitAll().antMatchers("/login").permitAll().antMatchers("/resources/**").permitAll()
				.antMatchers("/addJsp").access("hasRole('ROLE_USER')").antMatchers("/loadStudent")
				.access("hasRole('ROLE_USER')").antMatchers("/deleteStudent").access("hasRole('ROLE_ADMIN')")
				.anyRequest().authenticated()
				// .anyRequest().permitAll()
				.and().formLogin()./*successHandler(savedRequestAwareAuthenticationSuccessHandler()).*/loginPage("/login")
				.permitAll().loginProcessingUrl("/auth/login_check")/*loginProcessingUrl("/j_spring_security_check")*/.usernameParameter("j_username")
				.passwordParameter("j_password").and().logout().logoutUrl("/j_spring_security_logout")
				.logoutSuccessUrl("/").and().csrf().and().rememberMe()
				.tokenRepository(persistentTokenRepository()).tokenValiditySeconds(12000);
	}

	@Bean
	public PersistentTokenRepository persistentTokenRepository() {
		JdbcTokenRepositoryImpl database = new JdbcTokenRepositoryImpl();
		database.setDataSource(dataSource);
		return database;
	}

	@Bean
	public SavedRequestAwareAuthenticationSuccessHandler savedRequestAwareAuthenticationSuccessHandler() {
		SavedRequestAwareAuthenticationSuccessHandler author = new SavedRequestAwareAuthenticationSuccessHandler();
		author.setTargetUrlParameter("targetUrl");
		return author;
	}
}
