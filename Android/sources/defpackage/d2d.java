package defpackage;

import kotlin.enums.EnumEntriesKt;

/* renamed from: d2d  reason: default package */
public enum d2d {
    MESSAGE("message"),
    IMAGE("image"),
    CONTACT("contact"),
    LOCATION("location"),
    UNKNOWN("unknown");
    
    public static final cd4 b = null;
    public final String a;

    /* JADX WARNING: type inference failed for: r0v3, types: [cd4, java.lang.Object] */
    static {
        d2d[] d2dArr;
        z = EnumEntriesKt.enumEntries((E[]) d2dArr);
        b = new Object();
    }

    /* access modifiers changed from: public */
    d2d(String str) {
        this.a = str;
    }
}
