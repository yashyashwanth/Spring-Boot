package com.tgt.neo4j.repository;

import com.tgt.neo4j.entity.FriendsWithRole;
import com.tgt.neo4j.entity.User;
import org.springframework.data.neo4j.repository.Neo4jRepository;

public interface FriendsWithRoleRepository extends Neo4jRepository<FriendsWithRole, Long> {

    FriendsWithRole findByFromUser(User fromUser);
}
