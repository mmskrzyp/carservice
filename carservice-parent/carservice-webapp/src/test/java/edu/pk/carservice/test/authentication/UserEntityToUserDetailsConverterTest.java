package edu.pk.carservice.test.authentication;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import org.junit.Test;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import edu.pk.carservice.authentication.DefaultUserEntityToSpringUserConverter;
import edu.pk.carservice.authentication.UserEntityToSpringDetailsConverter;
import edu.pk.carservice.entity.UserEntity;

public class UserEntityToUserDetailsConverterTest {
	
	private UserEntityToSpringDetailsConverter converter = new DefaultUserEntityToSpringUserConverter();
	
	@Test
	public void userShouldHaveDefaultRoleUser() {
		UserEntity entity = new UserEntity();
		entity.setLogin("user");
		entity.setPassword("5baa61e4c9b93f3f0682250b6cf8331b7ee68fd8");
		
		UserDetails springUser = converter.convertUserEntityToSpringUser(entity);
		
		Object[] authorities = springUser.getAuthorities().toArray();
		
		GrantedAuthority authority = (GrantedAuthority)authorities[0];
		
		assertThat(authority.getAuthority(), is("ROLE_USER"));
	}
	
	
}
