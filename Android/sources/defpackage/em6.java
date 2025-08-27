package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* renamed from: em6  reason: default package */
public final class em6 implements gm6 {
    public final wk6 a;

    public em6(wk6 wk6) {
        this.a = wk6;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof em6) && Intrinsics.areEqual((Object) this.a, (Object) ((em6) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "OnSelectAlbum(album=" + this.a + ")";
    }
}
