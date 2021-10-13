package com.jovasdevs.citiesapi.countries.repository;

import com.jovasdevs.citiesapi.countries.Country;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CountryRepository extends JpaRepository<Country, Long> {
}
