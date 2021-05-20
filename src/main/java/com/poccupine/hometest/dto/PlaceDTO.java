package com.poccupine.hometest.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.io.Serializable;


public class PlaceDTO implements Serializable {

    @JsonProperty("id")
    private Long id;

    @JsonProperty("name")
    private String name;

    @JsonProperty("visited")
    private Integer visited;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getVisited() {
        return visited;
    }

    public void setVisited(Integer visited) {
        this.visited = visited;
    }

    public PlaceDTO() {
    }


}
