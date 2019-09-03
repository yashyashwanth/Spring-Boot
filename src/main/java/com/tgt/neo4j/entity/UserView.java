package com.tgt.neo4j.entity;

import java.util.Set;

public interface UserView {

    Long getId();

    String getName();

    String getEmail();

    String getPhoneNumber();

    Set<RoleInfo> getFriends();
}
