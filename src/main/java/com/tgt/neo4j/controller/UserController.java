package com.tgt.neo4j.controller;

import com.tgt.neo4j.entity.FriendsWithRole;
import com.tgt.neo4j.entity.User;
import com.tgt.neo4j.entity.UserInfo;
import com.tgt.neo4j.entity.UserView;
import com.tgt.neo4j.repository.FriendsWithRoleRepository;
import com.tgt.neo4j.repository.UserRepository;
import com.tgt.neo4j.service.FriendsWithRoleService;
import com.tgt.neo4j.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

@Controller
public class UserController {

    @Autowired
    private UserService userService;

    @Autowired
    private FriendsWithRoleService friendsWithRoleService;

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private FriendsWithRoleRepository friendsWithRoleRepository;

    @PatchMapping("/user")
    private ResponseEntity<?> createUser(@RequestBody User user){
        User createdUser = userService.createUser(user);
        return new ResponseEntity<>(createdUser, HttpStatus.CREATED);
    }

    /*@PatchMapping("/relation/friend")
    private ResponseEntity<?> createFriendRelation(@RequestBody Relation relation){
        User fromUser = userRepository.findByName(relation.getFromUser());
        User toUser = userRepository.findByName(relation.getToUser());
        FriendsWithRole role = new FriendsWithRole(fromUser, toUser, relation.getSince());
        friendsWithRoleService.createRelation(role);
        return new ResponseEntity<>(HttpStatus.CREATED);
    }*/

    @GetMapping("/user")
    private ResponseEntity<?> getUser(@RequestBody User user){
        UserView response = userRepository.findUserById(user.getId());

        return new ResponseEntity<>(response, HttpStatus.OK);
    }

    @GetMapping("/relation/{id}")
    private ResponseEntity<?> getRelationFromUser(@PathVariable Long id){
//        User user = userRepository.findByName(name);
        FriendsWithRole friendsWithRole = friendsWithRoleRepository.findById(id).get();

        return new ResponseEntity<>(friendsWithRole, HttpStatus.OK);
    }

}
