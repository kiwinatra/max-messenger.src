package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* renamed from: f83  reason: default package */
public final class f83 implements h83 {
    public final a32 a;
    public final CharSequence b;
    public final CharSequence c;
    public final long d;

    static {
        f83.class.hashCode();
    }

    public f83(a32 a32, CharSequence charSequence, String str) {
        this.a = a32;
        this.b = charSequence;
        this.c = str;
        this.d = a32.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f83)) {
            return false;
        }
        f83 f83 = (f83) obj;
        return this.d == f83.d && Intrinsics.areEqual((Object) this.b, (Object) f83.b) && Intrinsics.areEqual((Object) this.c, (Object) f83.c);
    }

    public final long getId() {
        return this.d;
    }

    public final int hashCode() {
        return this.c.hashCode() + wj6.e(this.b, wzf.i(f83.class.getName().hashCode() * 31, 31, this.d), 31);
    }
}
