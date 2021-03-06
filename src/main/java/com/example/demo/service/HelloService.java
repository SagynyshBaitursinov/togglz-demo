package com.example.demo.service;

import static com.example.demo.DemoFeatures.APP_SPEAKS_KAZAKH;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.togglz.core.manager.FeatureManager;

@Service
@RequiredArgsConstructor
public class HelloService {

  private final FeatureManager featureManager;

  public String hello() {
    if (featureManager.isActive(APP_SPEAKS_KAZAKH)) {
      return "Sálem Álem";
    } else {
      return "Hello world";
    }
  }
}

