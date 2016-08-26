package sample.actuator;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/wait")
public class WaitController {

  Object lock = new Object();

  @GetMapping()
  public long waitOnLockFiveSeconds() throws InterruptedException {
    return this.waitOnLock(5000);
  }

  @GetMapping("/{millis}")
  public long waitOnLock(@PathVariable long millis) throws InterruptedException {
    long start = System.currentTimeMillis();
    long end;

    synchronized(lock) {
      Thread.sleep(millis);
      end = System.currentTimeMillis();
    }

    // Note that this time will not necessarily reflect the actual time the browser waits to receive a response
    return end - start;
  }

}
