package defpackage;

import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* renamed from: oa9  reason: default package */
public enum oa9 {
    UNKNOWN(0),
    SENDING(10),
    SENT(20),
    READ(30),
    ERROR(40);
    
    public static final cd4 b = null;
    public static final List c = null;
    public final int a;

    /* JADX WARNING: type inference failed for: r1v2, types: [cd4, java.lang.Object] */
    static {
        oa9[] oa9Arr;
        EnumEntries enumEntries = EnumEntriesKt.enumEntries((E[]) oa9Arr);
        X = enumEntries;
        b = new Object();
        c = CollectionsKt.toList(enumEntries);
    }

    /* access modifiers changed from: public */
    oa9(int i) {
        this.a = i;
    }
}
