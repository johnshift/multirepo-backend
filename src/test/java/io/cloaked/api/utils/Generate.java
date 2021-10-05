package io.cloaked.api.utils;

import java.util.Arrays;
import java.util.List;

import org.jeasy.random.EasyRandom;

import io.cloaked.api.user.User;

public class Generate {
  
  private static final EasyRandom random = new EasyRandom();

  public static User user() {
    User user = random.nextObject(User.class);
    user.setId(Math.abs(random.nextLong()));

    return user;
  }

  public static List<User> users() {
    User user = random.nextObject(User.class);
    user.setId(Math.abs(random.nextLong()));

    return Arrays.asList(user);
  }

}
