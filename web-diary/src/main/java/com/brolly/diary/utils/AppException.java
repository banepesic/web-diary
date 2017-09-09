package com.brolly.diary.utils;

public class AppException extends Exception{
	
	private static final long serialVersionUID = -1163694644453233964L;

	public AppException(Throwable cause) {
		super(cause);
	}

	public AppException(String message) {
		super(message);
	}

	public AppException(String message, Throwable cause) {
		super(message, cause);
	}
}
