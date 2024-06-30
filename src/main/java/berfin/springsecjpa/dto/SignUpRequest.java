package berfin.springsecjpa.dto;

import lombok.Data;

@Data
public class SignUpRequest {

    private String firstname;

    private String surname;

    private String email;

    private String password;

}
