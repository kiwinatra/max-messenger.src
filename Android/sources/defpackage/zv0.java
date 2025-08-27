package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* renamed from: zv0  reason: default package */
public final class zv0 {
    public final Integer a;
    public final int b;

    public zv0(int i, Integer num) {
        this.a = num;
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zv0)) {
            return false;
        }
        zv0 zv0 = (zv0) obj;
        return Intrinsics.areEqual((Object) this.a, (Object) zv0.a) && this.b == zv0.b;
    }

    public final int hashCode() {
        Integer num = this.a;
        return Integer.hashCode(this.b) + ((num == null ? 0 : num.hashCode()) * 31);
    }

    public final String toString() {
        return "BackgroundColors(color=" + this.a + ", rippleColor=" + this.b + ")";
    }
}
