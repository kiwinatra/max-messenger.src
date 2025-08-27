package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* renamed from: e00  reason: default package */
public final class e00 extends f00 {
    public final long a;
    public final float b;
    public final ngf c;

    public e00(long j, float f, mgf mgf) {
        this.a = j;
        this.b = f;
        this.c = mgf;
    }

    public final long a() {
        return this.a;
    }

    public final ngf b() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e00)) {
            return false;
        }
        e00 e00 = (e00) obj;
        return this.a == e00.a && Float.compare(this.b, e00.b) == 0 && Intrinsics.areEqual((Object) this.c, (Object) e00.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + g63.c(Long.hashCode(this.a) * 31, this.b, 31);
    }

    public final String toString() {
        return "Uploading(messageId=" + this.a + ", progress=" + this.b + ", textSize=" + this.c + ")";
    }
}
