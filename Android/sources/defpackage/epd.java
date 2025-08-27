package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* renamed from: epd  reason: default package */
public final class epd implements gpd {
    public final wk6 a;

    public epd(wk6 wk6) {
        this.a = wk6;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof epd) && Intrinsics.areEqual((Object) this.a, (Object) ((epd) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "OnAlbumSelected(album=" + this.a + ")";
    }
}
