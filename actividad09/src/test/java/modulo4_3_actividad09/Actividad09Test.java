package modulo4_3_actividad09;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.io.*;
import java.nio.charset.StandardCharsets;
import org.junit.jupiter.api.Test;

class Actividad09Test {
  @Test
  void salidaEsperada() throws Exception {
    ByteArrayOutputStream b = new ByteArrayOutputStream();
    PrintStream old = System.out;
    System.setOut(new PrintStream(b, true, StandardCharsets.UTF_8));
    try {
      Actividad09.main(new String[0]);
    } finally {
      System.setOut(old);
    }
    assertEquals(
        "Segundo guion: 7", b.toString(StandardCharsets.UTF_8).replace("\r\n", "\n").trim());
  }
}
