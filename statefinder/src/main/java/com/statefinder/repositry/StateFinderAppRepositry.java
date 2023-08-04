package com.statefinder.repositry;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;

import jakarta.annotation.PostConstruct;

@Repository
public class StateFinderAppRepositry {
	
	
	private Map<String, List<String>> db1;
	
	@PostConstruct
	public void init()
	{
		 db1 = new HashMap<>();
		 db1.put("India", Arrays.asList("Odisha","Karnataka","TamilNadu","AndhraPradesh"));
		 db1.put("USA", Arrays.asList("NewYork","NewJersey","amsterdam"));
		 db1.put("Germany", Arrays.asList("Berlin","helsenky","Hamberg","Saxony"));
	}
	public List<String> findListOfState(String countryName)
	{
		List<String> listOfState = db1.get(countryName);
		return listOfState;
	}
}
