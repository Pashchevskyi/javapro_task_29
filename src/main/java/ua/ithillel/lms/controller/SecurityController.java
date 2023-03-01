package ua.ithillel.lms.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import ua.ithillel.lms.dto.SecurityDto;
import ua.ithillel.lms.dto.UserDto;

@RestController
public class SecurityController {

  @PostMapping("/login")
  public UserDto login(SecurityDto securityDto) {
    return new UserDto();
  }
}
