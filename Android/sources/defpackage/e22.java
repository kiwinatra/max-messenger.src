package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* renamed from: e22  reason: default package */
public final class e22 {
    public static final d22 b = new Object();
    public final Object a;

    public /* synthetic */ e22(Object obj) {
        this.a = obj;
    }

    public static final Throwable a(Object obj) {
        c22 c22 = obj instanceof c22 ? (c22) obj : null;
        if (c22 != null) {
            return c22.a;
        }
        return null;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof e22)) {
            return false;
        }
        return Intrinsics.areEqual(this.a, ((e22) obj).a);
    }

    public final int hashCode() {
        Object obj = this.a;
        if (obj == null) {
            return 0;
        }
        return obj.hashCode();
    }

    public final String toString() {
        Object obj = this.a;
        if (obj instanceof c22) {
            return ((c22) obj).toString();
        }
        return "Value(" + obj + ')';
    }
}
