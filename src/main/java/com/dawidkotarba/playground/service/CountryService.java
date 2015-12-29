package com.dawidkotarba.playground.service;

import com.dawidkotarba.playground.dao.CountryDao;
import com.dawidkotarba.playground.integration.dto.CountryDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

/**
 * Created by Dawid Kotarba on 12.11.2015.
 */

@Service
@Transactional
public class CountryService {

    private CountryDao countryDao;

    @Autowired
    public CountryService(CountryDao countryDao) {
        this.countryDao = countryDao;
    }

    public List<CountryDto> getAll() {
        return countryDao.getAll();
    }

    public List<CountryDto> getByName(String name) {
        return countryDao.getByName(name);
    }

    public void add(CountryDto countryDto) {
        countryDao.add(countryDto);
    }
}