package com.richard.auth;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class AuthApplicationTests {

	@Test
	public void contextLoads() {
		//System.out.println(new BCryptPasswordEncoder().encode("course"));
		//$2a$10$.jgmBfldbgRKMDGH2E5gp.G1JnvBHS2hnQl1QpsQXLh4SDO7cYz.W
	}

} 
