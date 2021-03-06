package com.example.demo.common;

import java.time.LocalTime;
import org.springframework.stereotype.Service;

@Service
public class TimeKeeper {

  public LocalTime getUtcTime() {
    return LocalTime.now();
  }
}
