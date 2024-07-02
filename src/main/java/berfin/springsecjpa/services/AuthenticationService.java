package berfin.springsecjpa.services;


import berfin.springsecjpa.dto.JwtAuthenticationResponse;
import berfin.springsecjpa.dto.SignUpRequest;
import berfin.springsecjpa.dto.SignInRequest;
import berfin.springsecjpa.entities.AppUser;

public interface AuthenticationService {
    AppUser signup(SignUpRequest signupRequest);
    JwtAuthenticationResponse signin(SignInRequest signinRequest);
}
