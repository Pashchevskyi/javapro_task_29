package ua.ithillel.lms.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ua.ithillel.lms.dto.UserDto;
import ua.ithillel.lms.service.UserService;

@RestController
@RequiredArgsConstructor
@RequestMapping("/users")
public class UserController {

  private final UserService userService;

  @PostMapping("/")
  public UserDto register(UserDto userDto) {
    return userService.createUser(userDto);
  }
}
