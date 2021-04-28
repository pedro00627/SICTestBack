package com.sic.sicTestBack.service;

import java.util.List;

import com.sic.sicTestBack.entities.Survey;
import com.sic.sicTestBack.model.SurveyModel;

public interface SurveyService {
	
	public void create(Survey survey);

	public Survey read(Long id);

	public List<SurveyModel> readAll();

	public void update(Survey survey);

	public void delete(Long id);

}
