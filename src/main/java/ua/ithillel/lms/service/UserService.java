package ua.ithillel.lms.service;

import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import ua.ithillel.lms.dto.UserDto;
import ua.ithillel.lms.model.User;
import ua.ithillel.lms.repository.UserRepository;

@Service
@RequiredArgsConstructor
public class UserService {
  private final UserRepository userRepository;
  private final ObjectMapper objectMapper;

  private final PasswordEncoder passwordEncoder;

  public UserDto createUser(UserDto userDto) {
    User user = objectMapper.convertValue(userDto, User.class);
    user.setPassword(passwordEncoder.encode(userDto.getPassword()));
    userRepository.save(user);
    userDto.setId(user.getId());
    return userDto;
  }
}
