package sample.actuator;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class MemoryLeakController {

  private List<Long> list = new ArrayList<>();

  @GetMapping("/leak")
  public String memoryLeak() {
    while(true) {
      // wait for the impending memory leak
      list.add(new Long(System.currentTimeMillis()));
    }
  }

}
