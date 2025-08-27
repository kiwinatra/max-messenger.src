package defpackage;

import kotlin.enums.EnumEntriesKt;

/* renamed from: p5g  reason: default package */
public enum p5g {
    HLS("video/hls"),
    DASH("application/dash+xml"),
    MP4("video/mp4");

    static {
        p5g[] p5gArr;
        v = EnumEntriesKt.enumEntries((E[]) p5gArr);
    }

    /* access modifiers changed from: public */
    p5g(String str) {
    }
}
