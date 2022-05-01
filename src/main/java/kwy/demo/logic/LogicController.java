package kwy.demo.logic;

import java.net.InetAddress;
import java.net.UnknownHostException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LogicController {

  Logger logger = LoggerFactory.getLogger(LogicController.class);

  @GetMapping("/logic")
  public String logic() throws UnknownHostException {
    String hostName = InetAddress.getLocalHost().getHostName();
    logger.info(hostName);
    return "logic by (" + hostName + ")";
  }
}
