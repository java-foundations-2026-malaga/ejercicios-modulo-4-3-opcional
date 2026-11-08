package modulo4_3_actividad12;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Locale;
import java.util.regex.Pattern;

import org.junit.jupiter.api.Test;

class Actividad12Test {

    @Test
    void salidaEsperada() throws Exception {
        String salida = ejecutar();
        assertEquals("Año: 2026\nCódigo: PROD/2026/ABC", salida);
    }

    @Test
    void compruebaCodigo() throws Exception {
        String codigo = leerCodigo();
        assertTrue(contiene(codigo, "\\.\\s*(substring|split)\\s*\\("), "Debe extraerse el año con substring()");
        assertTrue(contiene(codigo, "\\.\\s*replace(All)?\\s*\\("), "Debe usarse replace()");
    }

    private static String ejecutar() throws Exception {
        ByteArrayOutputStream buffer = new ByteArrayOutputStream();
        PrintStream originalOut = System.out;
        Locale originalLocale = Locale.getDefault();
        Locale.setDefault(Locale.US);
        System.setOut(new PrintStream(buffer, true, StandardCharsets.UTF_8));
        try {
            Actividad12.main(new String[0]);
        } finally {
            System.setOut(originalOut);
            Locale.setDefault(originalLocale);
        }
        String texto = buffer.toString(StandardCharsets.UTF_8).replace("\r\n", "\n").replace('\r', '\n');
        StringBuilder salida = new StringBuilder();
        for (String linea : texto.split("\n")) {
            salida.append(linea.strip()).append("\n");
        }
        return salida.toString().strip();
    }

    private static String leerCodigo() throws Exception {
        String codigo = Files.readString(Path.of("src/main/java/modulo4_3_actividad12/Actividad12.java"));
        return codigo.replaceAll("(?s)/\\*.*?\\*/", "").replaceAll("//[^\n]*", "");
    }

    private static boolean contiene(String codigo, String regex) {
        return Pattern.compile(regex).matcher(codigo).find();
    }
}
