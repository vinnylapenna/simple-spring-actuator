package com.credera.vinnylapenna;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/wait")
public class WaitController {

  @GetMapping()
  public String waitOnLockFiveSeconds() throws InterruptedException {
    return this.waitOnLock(5000);
  }

  @GetMapping("/{millis}")
  public String waitOnLock(@PathVariable long millis) throws InterruptedException {
    long start = System.currentTimeMillis();

    doSomethingInteresting(millis);

    long end = System.currentTimeMillis();

    return "\ndoSomethingInteresting() took " + (end - start) + " milliseconds";
  }

  private synchronized void doSomethingInteresting(long millis) throws InterruptedException{
    // This method would normally take time to do real work, but we are sleeping for demonstration purposes
    Thread.sleep(millis);
  }

}
