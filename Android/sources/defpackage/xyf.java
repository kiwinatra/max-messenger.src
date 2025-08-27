package defpackage;

import kotlin.enums.EnumEntriesKt;

/* renamed from: xyf  reason: default package */
public enum xyf {
    UNKNOWN(0),
    VIDEO(1),
    PHOTO(2),
    PROFILE_PHOTO(3),
    FILE(4),
    AUDIO(5),
    EXTERNAL_GIF(6),
    STICKER(7);
    
    public static final ejd b = null;
    public final int a;

    /* JADX WARNING: type inference failed for: r0v3, types: [java.lang.Object, ejd] */
    static {
        xyf[] xyfArr;
        Z = EnumEntriesKt.enumEntries((E[]) xyfArr);
        b = new Object();
    }

    /* access modifiers changed from: public */
    xyf(int i) {
        this.a = i;
    }

    public final boolean a() {
        return this == PROFILE_PHOTO;
    }

    public final boolean b() {
        return this == STICKER;
    }
}
