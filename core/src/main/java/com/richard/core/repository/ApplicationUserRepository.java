package com.richard.core.repository;


import com.richard.core.model.ApplicationUser;
import com.richard.core.model.Course;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface ApplicationUserRepository extends JpaRepository<ApplicationUser, Long> {

    ApplicationUser findByUsername(final String username);

}
