package sample.actuator;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WaitController {

  Object lock = new Object();

  private static long MILLIS = 5000;

  @GetMapping("/wait")
  public long waitOnLock() throws InterruptedException{
    long start = System.currentTimeMillis();
    long end;

    synchronized(lock) {
      Thread.sleep(MILLIS);
      end = System.currentTimeMillis();
    }

    // Note that this time will not necessarily reflect the actual time the browser will wait to receive a response
    return end - start;
  }

}
