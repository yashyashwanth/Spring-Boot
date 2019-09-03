package com.tgt.neo4j.service;

import com.tgt.neo4j.entity.User;
import com.tgt.neo4j.entity.UserInfo;
import com.tgt.neo4j.entity.UserView;
import com.tgt.neo4j.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public User createUser(User user){

        UserView getUser = userRepository.findByName(user.getName());

//        if(null != getUser)
//            user.setId(getUser.getId());
        return (User) userRepository.save(user);
    }
}
