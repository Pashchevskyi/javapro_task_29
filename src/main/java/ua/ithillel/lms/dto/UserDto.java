package ua.ithillel.lms.dto;

import lombok.Data;
import ua.ithillel.lms.model.UserRole;

@Data
public class UserDto {

  long id;
  String name;
  String password;

  UserRole role;
}
