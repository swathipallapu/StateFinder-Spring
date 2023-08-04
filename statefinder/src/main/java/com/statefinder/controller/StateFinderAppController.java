package com.statefinder.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.statefinder.response.StateFinderAppResponseModel;
import com.statefinder.service.StateFinderAppService;


@RestController
public class StateFinderAppController {

	@Autowired
	private StateFinderAppService stateFinderAppService;
	
	
	@GetMapping("/find/state/{CountryName}")
	public ResponseEntity<StateFinderAppResponseModel> findListOfState(@PathVariable String CountryName)
	{
		List<String> listOfState = stateFinderAppService.findListOfState(CountryName);
		
		StateFinderAppResponseModel responseModel = new StateFinderAppResponseModel();
		responseModel.setListOfState(listOfState);
		return new ResponseEntity<StateFinderAppResponseModel>(responseModel, HttpStatus.OK);
		
	}
}
