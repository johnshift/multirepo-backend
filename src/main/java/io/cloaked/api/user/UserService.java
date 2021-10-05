package io.cloaked.api.user;

import java.util.List;

import org.springframework.stereotype.Service;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class UserService {
  
  private final UserRepository userRepo;

  public List<User> getUsers() {

    return userRepo.findAll();
  }

  public User getUserById(Long id) {

    return userRepo.findById(id)
        .orElseThrow(() -> new UserException(UserException.NOT_FOUND));
  }

}
