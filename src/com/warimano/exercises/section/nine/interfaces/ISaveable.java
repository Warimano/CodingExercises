package com.warimano.exercises.section.nine.interfaces;

import java.util.List;

public interface ISaveable {
    List<String> write();
    void read(List<String> toRead);
}
