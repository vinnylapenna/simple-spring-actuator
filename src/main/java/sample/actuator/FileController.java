package sample.actuator;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;
import java.nio.file.FileSystems;
import java.nio.file.Files;
import java.nio.file.Path;

@RestController
public class FileController {

  private byte[] fileContents;

  @GetMapping("/file")
  public int readLargeFile() throws IOException {
    Path path = FileSystems.getDefault().getPath(System.getProperty("user.dir"), "test1Gb.db");
    fileContents = Files.readAllBytes(path);
    return fileContents.length;
  }
}
