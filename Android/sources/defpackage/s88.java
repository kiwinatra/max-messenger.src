package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* renamed from: s88  reason: default package */
public final class s88 extends t88 {
    public final ngf d;
    public final ngf e;

    public s88(ngf ngf, ngf ngf2) {
        super(ngf, (Throwable) null);
        this.d = ngf;
        this.e = ngf2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s88)) {
            return false;
        }
        s88 s88 = (s88) obj;
        return Intrinsics.areEqual((Object) this.d, (Object) s88.d) && Intrinsics.areEqual((Object) this.e, (Object) s88.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + (this.d.hashCode() * 31);
    }

    public final String toString() {
        return "SmsCountExceeded(title=" + this.d + ", description=" + this.e + ")";
    }
}
