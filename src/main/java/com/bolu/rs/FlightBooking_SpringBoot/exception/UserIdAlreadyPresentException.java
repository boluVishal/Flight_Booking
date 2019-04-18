package com.bolu.rs.FlightBooking_SpringBoot.exception;


@SuppressWarnings("serial")
public class UserIdAlreadyPresentException extends Exception {
	public UserIdAlreadyPresentException(String message){
		super(message);
	}
}