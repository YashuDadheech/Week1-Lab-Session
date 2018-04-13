package com.yashu.audition;

public enum PerformerType {
	
	PERFORMER("Performer"),
	DANCER("Dancer"),
	VOCALIST("Vocalist");
	
	private String value;
	
	private PerformerType(String value) {
		this.value = value;
	}
	
	public String getValue() {
		return value;
	}
}
