package defpackage;

import android.graphics.drawable.Drawable;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: xqc  reason: default package */
public final class xqc implements lz7 {
    public final long a;
    public final hqc b;
    public final Drawable c;
    public final boolean o;
    public final int v = gad.b;
    public final long w;

    public xqc(long j, hqc hqc, Drawable drawable, boolean z) {
        this.a = j;
        this.b = hqc;
        this.c = drawable;
        this.o = z;
        this.w = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xqc)) {
            return false;
        }
        xqc xqc = (xqc) obj;
        return this.a == xqc.a && Intrinsics.areEqual((Object) this.b, (Object) xqc.b) && Intrinsics.areEqual((Object) this.c, (Object) xqc.c) && this.o == xqc.o;
    }

    public final long getItemId() {
        return this.w;
    }

    public final int hashCode() {
        int hashCode = (this.b.hashCode() + (Long.hashCode(this.a) * 31)) * 31;
        Drawable drawable = this.c;
        return Boolean.hashCode(this.o) + ((hashCode + (drawable == null ? 0 : drawable.hashCode())) * 31);
    }

    public final int i() {
        return this.v;
    }

    public final String toString() {
        return "ReactionModel(animojiId=" + this.a + ", reaction=" + this.b + ", reactionDrawable=" + this.c + ", selected=" + this.o + ")";
    }
}
