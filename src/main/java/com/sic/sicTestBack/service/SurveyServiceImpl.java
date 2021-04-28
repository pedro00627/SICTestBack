package com.sic.sicTestBack.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import com.sic.sicTestBack.entities.Survey;
import com.sic.sicTestBack.model.SurveyModel;
import com.sic.sicTestBack.repository.SurveyRepository;
import com.sic.sicTestBack.utils.Converter;

public class SurveyServiceImpl  implements SurveyService{

	@Autowired
	SurveyRepository surveyRepository;

	@Override
	public void create(Survey survey) {
		surveyRepository.save(survey);
		
	}

	@Override
	public Survey read(Long id) {
		Optional<Survey> survey = surveyRepository.findById(id);
		return survey.isPresent() ? survey.get() : null;
	}

	@Override
	public List<SurveyModel> readAll() {
		return Converter.surveyListConverter(surveyRepository.findAll());
	}

	@Override
	public void update(Survey survey) {
		surveyRepository.save(survey);
	}

	@Override
	public void delete(Long id) {
		surveyRepository.deleteById(id);
	}
}
