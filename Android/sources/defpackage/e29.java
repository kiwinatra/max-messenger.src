package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* renamed from: e29  reason: default package */
public final class e29 extends g29 {
    public final ngf a;
    public final float b;

    public e29(ngf ngf, float f) {
        this.a = ngf;
        this.b = f;
    }

    public final ngf a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e29)) {
            return false;
        }
        e29 e29 = (e29) obj;
        return Intrinsics.areEqual((Object) this.a, (Object) e29.a) && Float.compare(this.b, e29.b) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "Downloading(downloadText=" + this.a + ", progress=" + this.b + ")";
    }
}
