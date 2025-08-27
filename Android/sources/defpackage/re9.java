package defpackage;

import java.util.HashMap;
import kotlin.enums.EnumEntriesKt;

/* renamed from: re9  reason: default package */
public enum re9 {
    ;
    
    public static final sx6 a = null;
    public static final HashMap b = null;

    /* JADX WARNING: type inference failed for: r0v0, types: [java.lang.Enum, re9] */
    /* JADX WARNING: type inference failed for: r1v1, types: [java.lang.Enum, re9] */
    /* JADX WARNING: type inference failed for: r3v1, types: [java.lang.Enum, re9] */
    /* JADX WARNING: type inference failed for: r4v2, types: [java.lang.Enum, re9] */
    static {
        int i;
        re9[] re9Arr;
        x = EnumEntriesKt.enumEntries((E[]) re9Arr);
        a = new sx6(15);
        HashMap hashMap = new HashMap(4);
        for (re9 re9 : values()) {
            hashMap.put(re9.name(), re9);
        }
        b = hashMap;
    }
}
