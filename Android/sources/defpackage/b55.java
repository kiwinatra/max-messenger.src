package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* renamed from: b55  reason: default package */
public final class b55 implements c55 {
    public final String a;
    public final ngf b;
    public final ngf c;

    public b55(String str, igf igf, igf igf2) {
        this.a = str;
        this.b = igf;
        this.c = igf2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b55)) {
            return false;
        }
        b55 b55 = (b55) obj;
        return Intrinsics.areEqual((Object) this.a, (Object) b55.a) && Intrinsics.areEqual((Object) this.b, (Object) b55.b) && Intrinsics.areEqual((Object) this.c, (Object) b55.c);
    }

    public final int hashCode() {
        String str = this.a;
        return this.c.hashCode() + i2a.g((str == null ? 0 : str.hashCode()) * 31, 31, this.b);
    }

    public final String toString() {
        return "SavedMessages(avatar=" + this.a + ", title=" + this.b + ", subtitle=" + this.c + ")";
    }
}
