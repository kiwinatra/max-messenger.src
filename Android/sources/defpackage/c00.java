package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* renamed from: c00  reason: default package */
public final class c00 extends f00 {
    public final long a;
    public final ngf b;

    public c00(long j, mgf mgf) {
        this.a = j;
        this.b = mgf;
    }

    public final long a() {
        return this.a;
    }

    public final ngf b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c00)) {
            return false;
        }
        c00 c00 = (c00) obj;
        return this.a == c00.a && Intrinsics.areEqual((Object) this.b, (Object) c00.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (Long.hashCode(this.a) * 31);
    }

    public final String toString() {
        return "NeedDownload(messageId=" + this.a + ", textSize=" + this.b + ")";
    }
}
