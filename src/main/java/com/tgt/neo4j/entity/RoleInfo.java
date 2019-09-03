package com.tgt.neo4j.entity;

public interface RoleInfo {

    Long getId();

    UserInfo getFromUser();

    UserInfo getToUser();

    String getSince();
}
