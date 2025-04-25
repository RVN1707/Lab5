package org.example.Managers;

import java.io.BufferedReader;
import java.io.IOException;
import java.util.Objects;

public class ScriptManager {
    private final BufferedReader reader;

    public ScriptManager(BufferedReader reader) {
        this.reader = Objects.requireNonNull(reader);

    }

    public BufferedReader getReader() {
        return reader;
    }

    public String readLine() throws IOException {
        return reader.readLine();
    }
}
