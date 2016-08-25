/*
 * Copyright 2012-2013 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package sample.actuator;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class HelloWorldService {

	@Autowired
	private ServiceProperties configuration;

	public String getHelloMessage() {
		return "Hello " + this.configuration.getName();
	}

	/* TODO: ideas:
  1. DONE - sychronized - have controller call a syncronized method that sleeps for x seconds....have two browsers initiate a request...watch one wait
  2. IO / CPU / Memory - save a >1GB file to disk -> read it in, load each line into a persistent hashmap...see which process fails first
  3. Make an infinite while loop that loads the current system millisecond time into a map - generate dump files
  4. recompile / rebuild jvmtop, see if you can get overview functionality to work
  */

}
