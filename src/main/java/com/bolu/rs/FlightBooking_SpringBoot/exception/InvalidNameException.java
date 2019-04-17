package com.bolu.rs.FlightBooking_SpringBoot.exception;

public class InvalidNameException extends Exception{
    private static final long serialVersionUID = 1L;
    /**
    * 
     * This Exception is thrown from RegistrationService class with error
    * message RegistrationService.INVALID_NAME if the given 
     * name is not matching the constraints given in the regular expression.
    * 
     * 
    *
    */
    public InvalidNameException(String message)
    {
                    super(message);
    }
}