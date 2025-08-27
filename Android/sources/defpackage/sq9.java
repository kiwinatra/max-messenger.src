package defpackage;

import kotlin.enums.EnumEntriesKt;

/* renamed from: sq9  reason: default package */
public enum sq9 {
    UNKNOWN("unknown"),
    IMAGE_JPEG("image/jpeg"),
    IMAGE_GIF("image/gif"),
    VIDEO_MP4("video/mp4");
    
    public static final o9a b = null;
    public final String a;

    static {
        sq9[] sq9Arr;
        y = EnumEntriesKt.enumEntries((E[]) sq9Arr);
        b = new o9a(15);
    }

    /* access modifiers changed from: public */
    sq9(String str) {
        this.a = str;
    }

    public final String toString() {
        return this.a;
    }
}
