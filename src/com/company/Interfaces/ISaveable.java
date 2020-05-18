package com.company.Interfaces;

import java.util.ArrayList;

public interface ISaveable {
    ArrayList<String> SavedItems();
    void PopulateFields(ArrayList<String> parameters);
}
