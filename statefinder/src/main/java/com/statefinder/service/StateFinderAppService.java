package com.statefinder.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.statefinder.repositry.StateFinderAppRepositry;

@Service
public class StateFinderAppService {
	
	
	@Autowired
	private StateFinderAppRepositry repo;
	
	public List<String> findListOfState(String CountryName)
	{
		 return repo.findListOfState(CountryName);
	}
}
