package com.brolly.diary.utils;

public enum DiffActions {
	IDENTICAL("  "),  ADD("++"), CHANGE("**"), DELETE("--");
	//IDENTICAL("="), ADD("a"), CHANGE("c"), DELETE("d");

	private DiffActions(String s) {
		action = s;
	}

	private final String action;

	public String getAction(){
		return action;
	}

}
