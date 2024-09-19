package com.lamvt.demo.config;

import lombok.AllArgsConstructor;
import lombok.Getter;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.bind.ConstructorBinding;

@Getter
@AllArgsConstructor(onConstructor_ = @ConstructorBinding)
@ConfigurationProperties(prefix = "app")
public class ApplicationConfigurationProperties {
  
  private final String authorName;
}
