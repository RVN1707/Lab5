package org.example.Commands;

import org.example.Managers.ScriptManager;

import java.io.FileNotFoundException;

public interface CommandInterface {
    int execute(String[] args) throws FileNotFoundException;
}
