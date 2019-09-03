package com.tgt.neo4j.service;

import com.tgt.neo4j.repository.FriendsWithRoleRepository;
import com.tgt.neo4j.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FriendsWithRoleService {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private FriendsWithRoleRepository friendsWithRoleRepository;

    /*public void createRelation(FriendsWithRole role){
        User fromUser = userRepository.findByName(role.getFromUser().getName());
        User toUser = userRepository.findByName(role.getToUser().getName());
        UserInfo fromUserIdAndName = userRepository.findById(fromUser.getId());
        UserInfo toUserIdAndName = userRepository.findById(toUser.getId());
        role.setFromUser(fromUserIdAndName);
        role.setToUser(toUserIdAndName);
        friendsWithRoleRepository.save(role);
    }*/
}
