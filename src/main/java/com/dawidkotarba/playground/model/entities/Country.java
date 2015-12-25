package com.dawidkotarba.playground.model.entities;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

/**
 * Created by Dawid Kotarba on 12.11.2015.
 */

@Entity
@Table(name = "COUNTRY")
@SequenceGenerator(name = "PK", sequenceName = "COUNTRY_SEQ", allocationSize = 1)
public class Country extends AbstractPersistableSequence {

    private static final long serialVersionUID = -8939819042050493878L;

    @Column(name = "NAME", nullable = false, unique = true)
    private String name;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "CAPITAL")
    private Capital capital;

    @Column(name = "AREA")
    private int area;

    @Column(name = "POPULATION")
    private int population;

    @Column(name = "CURRENCY")
    private String currency;

    @ManyToMany(cascade = CascadeType.ALL)
    @JoinTable(name = "NEIGHBOUR",
            joinColumns = {@JoinColumn(name = "COUNTRY")},
            inverseJoinColumns = {@JoinColumn(name = "NEIGHBOUR")})
    private Set<Country> neighbours = new HashSet<>();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Capital getCapital() {
        return capital;
    }

    public void setCapital(Capital capital) {
        this.capital = capital;
    }

    public int getArea() {
        return area;
    }

    public void setArea(int area) {
        this.area = area;
    }

    public int getPopulation() {
        return population;
    }

    public void setPopulation(int population) {
        this.population = population;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public Set<Country> getNeighbours() {
        return neighbours;
    }

    public void setNeighbours(Set<Country> neighbours) {
        this.neighbours = neighbours;
    }
}
