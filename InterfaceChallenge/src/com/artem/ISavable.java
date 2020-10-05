package com.artem;

import java.lang.reflect.Array;
import java.util.ArrayList;

public interface ISavable {
    ArrayList<String> write();
    void read(ArrayList<String> savedValues);
}
