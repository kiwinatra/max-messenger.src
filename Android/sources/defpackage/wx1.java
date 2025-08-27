package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* renamed from: wx1  reason: default package */
public final class wx1 implements xx1 {
    public final long a;
    public final mqe b;
    public final ngf c;
    public final Integer o;
    public final int v;
    public final long w;

    public wx1(long j, mqe mqe) {
        this.a = j;
        this.b = mqe;
        this.c = mqe.b;
        this.o = mqe.o;
        this.v = mqe.z;
        this.w = mqe.X;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wx1)) {
            return false;
        }
        wx1 wx1 = (wx1) obj;
        return this.a == wx1.a && Intrinsics.areEqual((Object) this.b, (Object) wx1.b);
    }

    public final long getItemId() {
        return this.w;
    }

    public final ngf getName() {
        return this.c;
    }

    public final int hashCode() {
        return this.b.hashCode() + (Long.hashCode(this.a) * 31);
    }

    public final int i() {
        return this.v;
    }

    public final boolean q() {
        return this.b.w == lqe.a;
    }

    public final String toString() {
        return "StickerSet(setId=" + this.a + ", model=" + this.b + ")";
    }
}
