package com.eren.JPA.springJPA;

import com.eren.JPA.springJPA.entity.User;
import com.eren.JPA.springJPA.service.UserDAOService;
import com.eren.JPA.springJPA.service.UserRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

@Component
public class UserRepositoryCommandLineRunner implements CommandLineRunner {
    private static final Logger log=
            LoggerFactory.getLogger(UserRepositoryCommandLineRunner.class);

    @Autowired
    private UserRepository userRepository;
    @Override
    public void run(String... args) throws Exception {
        User user=new User("irem","Admin");
       userRepository.save(user);
        log.info("User is created :  "+user);
        Optional<User> userWithIdOne = userRepository.findById(1L);
        log.info("User is retrieved:  "+userWithIdOne);

        List<User> users=userRepository.findAll();
        log.info("All Users Retrieved: " + users);



    }
}
