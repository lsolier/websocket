package com.lsolier.udacity.springbootwebsocket.config;

import com.lsolier.udacity.springbootwebsocket.model.UserResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.messaging.simp.SimpMessagingTemplate;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;

@EnableScheduling
@Configuration
public class SchedulerConfig {

  @Autowired
  private SimpMessagingTemplate template;

  @Scheduled
  public void sendAdhocMessage() {
    template.convertAndSend("/topic/user", new UserResponse("Scheduler"));
  }
}
