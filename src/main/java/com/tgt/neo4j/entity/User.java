package com.tgt.neo4j.entity;

import lombok.Getter;
import lombok.Setter;
import org.neo4j.ogm.annotation.GeneratedValue;
import org.neo4j.ogm.annotation.Id;
import org.neo4j.ogm.annotation.NodeEntity;
import org.neo4j.ogm.annotation.Relationship;

import java.util.HashSet;
import java.util.Set;

@NodeEntity(label = "User" )
@Getter
@Setter
public class User{

    @Id
    @GeneratedValue
    private Long id;

    private String name;

    private String email;

    private String phoneNumber;

    @Relationship(type = "FRIENDS_WITH", direction = Relationship.UNDIRECTED)
    private Set<FriendsWithRole> friends = new HashSet<>();
}
