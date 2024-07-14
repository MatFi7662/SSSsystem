package com.wwsis.sss.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import com.wwsis.sss.dao.*;

@Configuration
public class AppConfig {

    @Bean
    public StudentDao studentDao() {
        return new StudentDaoImpl();
    }

    @Bean
    public UserDao userDao() {
        return new UserDaoImpl();
    }

    @Bean
    public LibraryDao libraryDao() {
        return new LibraryDaoImpl();
    }

    // You can add more beans here for other DAOs if needed
}
