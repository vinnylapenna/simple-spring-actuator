package sample.actuator;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
public class MemoryLeakController {

  private List<Long> list = new ArrayList<>();

  @GetMapping("/leak/list")
  public String memoryLeakList() {
    while(true) {
      // wait for the impending memory leak
      list.add(new Long(System.currentTimeMillis()));
    }
  }

  private Map<Long, Long> map = new HashMap<>();

  @GetMapping("/leak/map")
  public String memoryLeakMap() {
    while(true) {
      // wait for the impending memory leak
      map.put(new Long(System.currentTimeMillis()), new Long(System.currentTimeMillis()));
    }
  }

}
