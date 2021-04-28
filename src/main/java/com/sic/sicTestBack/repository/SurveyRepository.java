package com.sic.sicTestBack.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sic.sicTestBack.entities.Survey;

public interface SurveyRepository extends JpaRepository<Survey, Long> {

}
