package com.example.xaxaton.Kyrgyz.Concept.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.security.authentication.jaas.JaasPasswordCallbackHandler;
import org.springframework.stereotype.Repository;

@Repository
public interface CityRepository extends JpaRepository<CityRepository, Long> {
}
