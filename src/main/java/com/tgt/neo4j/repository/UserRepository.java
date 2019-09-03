package com.tgt.neo4j.repository;

import com.tgt.neo4j.entity.User;
import com.tgt.neo4j.entity.UserInfo;
import com.tgt.neo4j.entity.UserView;
import org.springframework.data.neo4j.repository.Neo4jRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends Neo4jRepository<User, Long> {

    UserView findByName(String name);

    User findById(Long id);

}