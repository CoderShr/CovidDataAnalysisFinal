package com.mindtree.service;

import java.text.ParseException;
import java.util.List;

import com.mindtree.entity.CovidData;

public interface CovidAnalysisService {

	public List<CovidData> getCovidDataReport() throws ParseException;
}
