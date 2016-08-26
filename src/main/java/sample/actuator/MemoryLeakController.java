package sample.actuator;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
public class MemoryLeakController {

  private List<Long> list = new ArrayList<>();
  private Map<Long, Long> map = new HashMap<>();

  @GetMapping("/leak/list")
  public String memoryLeakList() {
    long i = 0;
    while(true) {
      // This collection will keep growing forever
      list.add(i);
      i++;
    }
  }

  @GetMapping("/leak/map")
  public String memoryLeakMap() {
    long i = 0;
    while(true) {
      // This collection will eventually be bounded in size
      map.put(i,i);
      i++;
    }
  }

}
