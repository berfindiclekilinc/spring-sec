package berfin.springsecjpa.services.impl;

import berfin.springsecjpa.dto.SignUpRequest;
import berfin.springsecjpa.entities.AppUser;
import berfin.springsecjpa.entities.Role;
import berfin.springsecjpa.repository.UserRepository;
import berfin.springsecjpa.services.AuthenticationService;
import lombok.RequiredArgsConstructor;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class AuthenticationServiceImpl implements AuthenticationService {

    private final UserRepository userRepository;
    private final PasswordEncoder passwordEncoder;

    public AppUser signup(SignUpRequest signupRequest){
        AppUser user = new AppUser();

        user.setEmail(signupRequest.getEmail());
        user.setFirstname(signupRequest.getFirstname());
        user.setSurname(signupRequest.getSurname());
        user.setRole(Role.USER);
        user.setPassword(passwordEncoder.encode(signupRequest.getPassword()));

        return userRepository.save(user);

    }

}
