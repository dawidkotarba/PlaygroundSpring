package com.dawidkotarba.playground.integration.dto;

import org.hibernate.validator.constraints.NotEmpty;

/**
 * Created by Dawid Kotarba on 30.11.2015.
 */
public class CapitalDto {

    @NotEmpty
    private String name;

    private int population;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPopulation() {
        return population;
    }

    public void setPopulation(int population) {
        this.population = population;
    }
}