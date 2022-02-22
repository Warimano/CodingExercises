package com.warimano.SectionNineExercises.Interface;

import java.util.List;

public interface ISaveable {
    List<String> write();
    void read(List<String> toRead);
}
