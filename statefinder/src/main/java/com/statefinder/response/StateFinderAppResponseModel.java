package com.statefinder.response;

import java.util.List;

public class StateFinderAppResponseModel {
	
	private List<String> listOfState;

	public StateFinderAppResponseModel(List<String> listOfState) {
		super();
		this.listOfState = listOfState;
	}

	public StateFinderAppResponseModel() {
		
	}

	public List<String> getListOfState() {
		return listOfState;
	}

	public void setListOfState(List<String> listOfState) {
		this.listOfState = listOfState;
	}

	@Override
	public String toString() {
		return "StateFinderAppResponseModel [listOfState=" + listOfState + "]";
	}

}
