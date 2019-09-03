package com.tgt.neo4j.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Getter;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import org.neo4j.ogm.annotation.*;

@RelationshipEntity(type = "FRIENDS_WITH")
@Getter
@Setter
@RequiredArgsConstructor
public class FriendsWithRole {

    @Id @GeneratedValue
    private Long id;

    @StartNode
    @NonNull
    @JsonIgnore
    private User fromUser;

    @EndNode
    @NonNull
    private User toUser;

    @NonNull
    private String since;
}
