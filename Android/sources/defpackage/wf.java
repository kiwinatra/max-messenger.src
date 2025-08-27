package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* renamed from: wf  reason: default package */
public final class wf {
    public final Number a;
    public final Number b;

    public wf(Float f, Float f2) {
        this.a = f;
        this.b = f2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wf)) {
            return false;
        }
        wf wfVar = (wf) obj;
        return Intrinsics.areEqual((Object) this.a, (Object) wfVar.a) && Intrinsics.areEqual((Object) this.b, (Object) wfVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "AnimatedValues(start=" + this.a + ", finish=" + this.b + ")";
    }
}
