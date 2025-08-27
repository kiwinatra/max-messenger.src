package com.my.tracker.obfuscated;

public abstract class l {
    public static int a(Comparable[] comparableArr, Comparable[] comparableArr2) {
        if (comparableArr == comparableArr2) {
            return 0;
        }
        if (comparableArr == null || comparableArr2 == null) {
            return comparableArr == null ? -1 : 1;
        }
        int min = Math.min(comparableArr.length, comparableArr2.length);
        for (int i = 0; i < min; i++) {
            Comparable comparable = comparableArr[i];
            Comparable comparable2 = comparableArr2[i];
            if (comparable != comparable2) {
                if (comparable == null || comparable2 == null) {
                    return comparable == null ? -1 : 1;
                }
                int compareTo = comparable.compareTo(comparable2);
                if (compareTo != 0) {
                    return compareTo;
                }
            }
        }
        return comparableArr.length - comparableArr2.length;
    }
}
