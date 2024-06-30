package berfin.springsecjpa.services;


import berfin.springsecjpa.dto.SignUpRequest;
import berfin.springsecjpa.entities.AppUser;

public interface AuthenticationService {
    AppUser signup(SignUpRequest signupRequest);
}
