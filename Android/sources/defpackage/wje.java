package defpackage;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: wje  reason: default package */
public final class wje {
    public final vje a;
    public final boolean b;
    public final boolean c;
    public final Function0 d;

    public wje(vje vje, boolean z, boolean z2, Function0 function0) {
        this.a = vje;
        this.b = z;
        this.c = z2;
        this.d = function0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wje)) {
            return false;
        }
        wje wje = (wje) obj;
        return Intrinsics.areEqual((Object) this.a, (Object) wje.a) && this.b == wje.b && this.c == wje.c && Intrinsics.areEqual((Object) this.d, (Object) wje.d);
    }

    public final int hashCode() {
        int e = g63.e(g63.e(this.a.hashCode() * 31, 31, this.b), 31, this.c);
        Function0 function0 = this.d;
        return e + (function0 == null ? 0 : function0.hashCode());
    }

    public final String toString() {
        return "StartCallParams(type=" + this.a + ", isVideo=" + this.b + ", isAudio=" + this.c + ", callbackPrepare=" + this.d + ")";
    }
}
