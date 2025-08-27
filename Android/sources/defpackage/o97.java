package defpackage;

import kotlin.enums.EnumEntriesKt;

/* renamed from: o97  reason: default package */
public enum o97 {
    ;

    /* JADX WARNING: type inference failed for: r0v0, types: [java.lang.Enum, o97] */
    /* JADX WARNING: type inference failed for: r1v1, types: [java.lang.Enum, o97] */
    /* JADX WARNING: type inference failed for: r2v2, types: [java.lang.Enum, o97] */
    /* JADX WARNING: type inference failed for: r3v2, types: [java.lang.Enum, o97] */
    /* JADX WARNING: type inference failed for: r4v2, types: [java.lang.Enum, o97] */
    /* JADX WARNING: type inference failed for: r5v2, types: [java.lang.Enum, o97] */
    /* JADX WARNING: type inference failed for: r6v2, types: [java.lang.Enum, o97] */
    static {
        o97[] o97Arr;
        y = EnumEntriesKt.enumEntries((E[]) o97Arr);
        values();
    }

    public final String toString() {
        int i = n97.$EnumSwitchMapping$0[ordinal()];
        return i != 1 ? i != 2 ? i != 3 ? i != 4 ? i != 5 ? "unknown" : "released" : "error" : "intermediate_available" : "success" : "requested";
    }
}
