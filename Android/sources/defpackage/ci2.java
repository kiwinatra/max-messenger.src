package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* renamed from: ci2  reason: default package */
public final class ci2 {
    public final hr8 a;
    public final g4g b;

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ci2(fr8 fr8, int i) {
        this((hr8) (i & 1) != 0 ? null : fr8, (g4g) null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ci2)) {
            return false;
        }
        ci2 ci2 = (ci2) obj;
        return Intrinsics.areEqual((Object) this.a, (Object) ci2.a) && Intrinsics.areEqual((Object) this.b, (Object) ci2.b);
    }

    public final int hashCode() {
        int i = 0;
        hr8 hr8 = this.a;
        int hashCode = (hr8 == null ? 0 : hr8.hashCode()) * 31;
        g4g g4g = this.b;
        if (g4g != null) {
            i = g4g.hashCode();
        }
        return hashCode + i;
    }

    public final String toString() {
        return "VideoPageState(mediaItem=" + this.a + ", videoContent=" + this.b + ")";
    }

    public ci2(hr8 hr8, g4g g4g) {
        this.a = hr8;
        this.b = g4g;
    }
}
