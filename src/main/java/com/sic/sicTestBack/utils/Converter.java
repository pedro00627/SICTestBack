/**
 * 
 */
package com.sic.sicTestBack.utils;

import java.util.ArrayList;
import java.util.List;

import com.sic.sicTestBack.entities.Survey;
import com.sic.sicTestBack.entities.User;
import com.sic.sicTestBack.model.SurveyModel;
import com.sic.sicTestBack.model.UserModel;

/**
 * @author pedro
 *
 */
public class Converter {

	public static UserModel userConverter(User user) {
		return new UserModel(user.getId(), user.getName(), user.getUsername(), user.getPassword(), user.getAttempts(),
				user.isStatus());
	}
	
	public static User userModelConverter(UserModel userModel) {
		return new User(userModel.getId(), userModel.getName(), userModel.getUsername(), userModel.getPassword(), userModel.getAttempts(),
				userModel.isStatus());
	}

	public static SurveyModel surveyConverter(Survey survey) {
		return new SurveyModel(survey.getId(), survey.getDocumentNumber(), survey.getEmail(), survey.getComentarios(),
				survey.getPcFavoriteBrand(), survey.getDate());
	}
	
	public static Survey surveyModelConverter(SurveyModel surveyModel) {
		return new Survey(surveyModel.getId(), surveyModel.getDocumentNumber(), surveyModel.getEmail(), surveyModel.getComentarios(),
				surveyModel.getPcFavoriteBrand(), surveyModel.getDate());
	}

	
	public static List<UserModel> userListConverter(List<User> users) {
		List<UserModel> userModelList = new ArrayList<>();

		for (User user : users) {
			userModelList.add(userConverter(user));
		}

		return userModelList;
	}
	
	public static List<User> userModelListConverter(List<UserModel> usersModel) {
		List<User> userList = new ArrayList<>();

		for (UserModel user : usersModel) {
			userList.add(userModelConverter(user));
		}

		return userList;
	}

	public static List<SurveyModel> surveyListConverter(List<Survey> surveys) {
		List<SurveyModel> surveyModelList = new ArrayList<>();

		for (Survey survey : surveys) {
			surveyModelList.add(surveyConverter(survey));
		}

		return surveyModelList;
	}
	
	

	public static List<Survey> surveyListModelConverter(List<SurveyModel> surveysModel) {
		List<Survey> surveyList = new ArrayList<>();

		for (SurveyModel survey : surveysModel) {
			surveyList.add(surveyModelConverter(survey));
		}

		return surveyList;
	}

}
