package monprojet.dao;

import java.util.List;

import jakarta.persistence.Id;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import monprojet.entity.City;
import monprojet.entity.Country;

// This will be AUTO IMPLEMENTED by Spring 

public interface CountryRepository extends JpaRepository<Country, Integer> {

    @Query("SELECT SUM (c.population) from City c where c.country.id = :countryId")

        Integer populationTotale(Integer countryId);



}
