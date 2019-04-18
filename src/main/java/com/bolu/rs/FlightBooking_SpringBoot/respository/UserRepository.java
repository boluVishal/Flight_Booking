package com.bolu.rs.FlightBooking_SpringBoot.respository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.bolu.rs.FlightBooking_SpringBoot.entity.UserEntity;
public interface UserRepository extends JpaRepository<UserEntity, String>{
}