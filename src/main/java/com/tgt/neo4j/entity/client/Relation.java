package com.tgt.neo4j.entity.client;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class Relation {

    @JsonProperty("from_user")
    private String fromUser;

    @JsonProperty("to_user")
    private String toUser;

    @JsonProperty("since")
    private String since;
}
