package com.google.firebase.components;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DependencyCycleException extends DependencyException {
    public final List a;

    public DependencyCycleException(ArrayList arrayList) {
        super("Dependency cycle detected: " + Arrays.toString(arrayList.toArray()));
    }
}
