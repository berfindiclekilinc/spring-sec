package berfin.springsecjpa.dto;

import lombok.Data;

@Data
public class SignInRequest {

    private String email;
    private String password;

}
