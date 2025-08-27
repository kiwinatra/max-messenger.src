package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* renamed from: b00  reason: default package */
public final class b00 extends f00 {
    public final long a;
    public final float b;
    public final ngf c;

    public b00(long j, float f, ngf ngf) {
        this.a = j;
        this.b = f;
        this.c = ngf;
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
        if (!(obj instanceof b00)) {
            return false;
        }
        b00 b00 = (b00) obj;
        return this.a == b00.a && Float.compare(this.b, b00.b) == 0 && Intrinsics.areEqual((Object) this.c, (Object) b00.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + g63.c(Long.hashCode(this.a) * 31, this.b, 31);
    }

    public final String toString() {
        return "Downloading(messageId=" + this.a + ", progress=" + this.b + ", textSize=" + this.c + ")";
    }
}
