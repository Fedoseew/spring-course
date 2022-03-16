package com.fedoseev.lab2.service;

import java.util.List;

import org.springframework.transaction.annotation.Propagation;

import com.fedoseev.lab2.dao.CountryDao;
import com.fedoseev.lab2.dao.CountryNotFoundException;
import com.fedoseev.lab2.model.Country;

public interface ProgrammaticTransactionCountryService {

    public Country getCountryByName(String name) throws CountryNotFoundException;

    public List<Country> getAllCountries();

    public Country getCountryByCodeName(String codeName, Propagation propagation);

    public void setDao(CountryDao dao);

    public CountryDao getDao();

}
