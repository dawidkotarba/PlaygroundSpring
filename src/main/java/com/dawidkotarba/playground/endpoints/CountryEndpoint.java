package com.dawidkotarba.playground.endpoints;

import com.dawidkotarba.playground.annotations.WebServiceEndpoint;
import com.dawidkotarba.playground.integration.dto.CountryDto;
import com.dawidkotarba.playground.service.CountryService;

import javax.inject.Inject;
import javax.jws.WebMethod;
import javax.validation.Valid;
import java.util.List;

/**
 * Created by Dawid Kotarba on 06.03.2016.
 */

@WebServiceEndpoint
public class CountryEndpoint {

    @Inject
    private CountryService countryService;

    @WebMethod
    public List<CountryDto> getAll() {
        return countryService.getAll();
    }

    @WebMethod
    public List<CountryDto> getByName(String name) {
        return countryService.getByName(name);
    }

    @WebMethod
    public void add(@Valid CountryDto countryDto) {
        countryService.add(countryDto);
    }
}
