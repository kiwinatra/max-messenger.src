package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* renamed from: e83  reason: default package */
public final class e83 implements g83 {
    public static final int e = (e83.class.hashCode() + 10);
    public final a32 a;
    public final CharSequence b;
    public final CharSequence c;
    public final long d;

    public e83(a32 a32, CharSequence charSequence, String str) {
        this.a = a32;
        this.b = charSequence;
        this.c = str;
        this.d = a32.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e83)) {
            return false;
        }
        e83 e83 = (e83) obj;
        return this.d == e83.d && Intrinsics.areEqual((Object) this.b, (Object) e83.b) && Intrinsics.areEqual((Object) this.c, (Object) e83.c);
    }

    public final long getId() {
        return this.d;
    }

    public final int hashCode() {
        return this.c.hashCode() + wj6.e(this.b, wzf.i(e83.class.getName().hashCode() * 31, 31, this.d), 31);
    }
}
