package modulo4_3_actividad14;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.io.*;
import java.nio.charset.StandardCharsets;
import org.junit.jupiter.api.Test;

class Actividad14Test {
  @Test
  void salidaEsperada() throws Exception {
    ByteArrayOutputStream b = new ByteArrayOutputStream();
    PrintStream old = System.out;
    System.setOut(new PrintStream(b, true, StandardCharsets.UTF_8));
    try {
      Actividad14.main(new String[0]);
    } finally {
      System.setOut(old);
    }
    assertEquals("casa\nperro", b.toString(StandardCharsets.UTF_8).replace("\r\n", "\n").trim());
  }
}
