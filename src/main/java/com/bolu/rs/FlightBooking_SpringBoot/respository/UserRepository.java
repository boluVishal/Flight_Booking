package com.bolu.rs.FlightBooking_SpringBoot.respository;

import org.springframework.stereotype.Component;

import com.bolu.rs.FlightBooking_SpringBoot.model.User;

@Component
public class UserRepository {
	public String registerUser(User user)
    {
        return "UserRespository.REGISTRATION_SUCCESS";
    }
}
