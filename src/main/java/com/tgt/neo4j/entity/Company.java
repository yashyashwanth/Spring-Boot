package com.tgt.neo4j.entity;

import org.neo4j.ogm.annotation.GeneratedValue;
import org.neo4j.ogm.annotation.Id;
import org.neo4j.ogm.annotation.NodeEntity;

@NodeEntity(label = "Company")
public class Company {

    @Id
    @GeneratedValue
    private Long id;

    private String name;
}
