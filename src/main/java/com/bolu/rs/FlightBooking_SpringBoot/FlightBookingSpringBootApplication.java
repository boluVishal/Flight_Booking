package com.bolu.rs.FlightBooking_SpringBoot;

import java.util.Scanner;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;
import com.bolu.rs.FlightBooking_SpringBoot.model.User;
import com.bolu.rs.FlightBooking_SpringBoot.service.RegistrationService;
@SpringBootApplication
@PropertySource(value = {"classpath:configuration.properties"})
public class FlightBookingSpringBootApplication implements CommandLineRunner{
                
                @Autowired
                private Environment environment;
                @Autowired
                ApplicationContext context;
                
                public static void main(String args[]) {SpringApplication.run(FlightBookingSpringBootApplication.class, args);
                                
  }
                @Override
                public void run(String... arg0) throws Exception {
                                try{
                                User user = new User();
                                Scanner sc = new Scanner(System.in);
                                System.out.println("Enter user id: ");
                                String uid = sc.next();
                                System.out.println("Enter password: ");
                                String pwd = sc.next();
                                System.out.println("Enter name: ");
                                String name = sc.next();
                                System.out.println("Enter city: ");
                                String city = sc.next();
                                System.out.println("Enter email: ");
                                String mail = sc.next();
                                System.out.println("Enter phone: ");
                                String phone = sc.next();
                                user.setCity(city);
                                user.setUserId(uid);
                                user.setPassword(pwd);
                                user.setName(name);
                                user.setEmail(mail);
                                user.setPhone(phone);
                                
                                RegistrationService service = (RegistrationService)context.getBean("registrationService");
                                String registrationMessage = service.registerUser(user);
                                System.out.println(environment.getProperty(registrationMessage));
                }
                catch(Exception e){
                                System.out.println(environment.getProperty(e.getMessage())); }
                }
}