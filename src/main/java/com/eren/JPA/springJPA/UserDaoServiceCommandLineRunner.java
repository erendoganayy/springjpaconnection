package com.eren.JPA.springJPA;

import com.eren.JPA.springJPA.entity.User;
import com.eren.JPA.springJPA.service.UserDAOService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.autoconfigure.security.SecurityProperties;
import org.springframework.stereotype.Component;

@Component
public class UserDaoServiceCommandLineRunner implements CommandLineRunner {
    private static final Logger log=
            LoggerFactory.getLogger(UserDaoServiceCommandLineRunner.class);

    @Autowired
private UserDAOService userDAOService;
    @Override
    public void run(String... args) throws Exception {
        User user=new User("Eren","Admin");
        long insert =userDAOService.insert(user);
        log.info("New user is created :  "+user);

    }
}
