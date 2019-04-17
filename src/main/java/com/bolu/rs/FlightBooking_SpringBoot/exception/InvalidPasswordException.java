package com.bolu.rs.FlightBooking_SpringBoot.exception;

public class InvalidPasswordException extends Exception{
    private static final long serialVersionUID = 1L;
    /**
    * 
     * This Exception is thrown from RegistrationService class with error
    * message RegistrationService.INVALID_PASSWORD if the given 
     *password is not matching the constraints given in the regular expression.
    * 
     * 
    *
    */
    
    public InvalidPasswordException(String message)
    {
                    super(message);
    }
}