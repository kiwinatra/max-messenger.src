package defpackage;

import android.graphics.drawable.Drawable;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.LongCompanionObject;

/* renamed from: n25  reason: default package */
public final class n25 implements lz7 {
    public final int a;
    public final int b;
    public final CharSequence c;
    public final List o;
    public final Drawable v;
    public final long w;
    public final int x;
    public final long y;

    public n25(int i, int i2, CharSequence charSequence, List list, Drawable drawable, long j) {
        this.a = i;
        this.b = i2;
        this.c = charSequence;
        this.o = list;
        this.v = drawable;
        this.w = j;
        this.x = pya.a;
        this.y = j != 0 ? (LongCompanionObject.MAX_VALUE - Math.abs(j)) - ((long) i) : (long) i2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x000a, code lost:
        r6 = (defpackage.n25) r6;
        r1 = r6.a;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean equals(java.lang.Object r6) {
        /*
            r5 = this;
            r0 = 1
            if (r5 != r6) goto L_0x0004
            return r0
        L_0x0004:
            boolean r1 = r6 instanceof defpackage.n25
            r2 = 0
            if (r1 != 0) goto L_0x000a
            return r2
        L_0x000a:
            n25 r6 = (defpackage.n25) r6
            int r1 = r6.a
            int r3 = r5.a
            if (r3 == r1) goto L_0x0013
            return r2
        L_0x0013:
            int r1 = r5.b
            int r3 = r6.b
            if (r1 == r3) goto L_0x001a
            return r2
        L_0x001a:
            java.lang.CharSequence r1 = r5.c
            java.lang.CharSequence r3 = r6.c
            boolean r1 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r1, (java.lang.Object) r3)
            if (r1 != 0) goto L_0x0025
            return r2
        L_0x0025:
            java.util.List r1 = r5.o
            java.util.List r3 = r6.o
            boolean r1 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r1, (java.lang.Object) r3)
            if (r1 != 0) goto L_0x0030
            return r2
        L_0x0030:
            android.graphics.drawable.Drawable r1 = r5.v
            android.graphics.drawable.Drawable r3 = r6.v
            boolean r1 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r1, (java.lang.Object) r3)
            if (r1 != 0) goto L_0x003b
            return r2
        L_0x003b:
            long r3 = r5.w
            long r5 = r6.w
            int r5 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r5 == 0) goto L_0x0044
            return r2
        L_0x0044:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.n25.equals(java.lang.Object):boolean");
    }

    public final long getItemId() {
        return this.y;
    }

    public final int hashCode() {
        int i = rae.i(this.o, wj6.e(this.c, rae.h(this.b, Integer.hashCode(this.a) * 31, 31), 31), 31);
        Drawable drawable = this.v;
        return Long.hashCode(this.w) + ((i + (drawable == null ? 0 : drawable.hashCode())) * 31);
    }

    public final int i() {
        return this.x;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("EmojiModel(groupIndex=");
        sb.append(this.a);
        sb.append(", itemIndex=");
        sb.append(this.b);
        sb.append(", defaultValue=");
        sb.append(this.c);
        sb.append(", values=");
        sb.append(this.o);
        sb.append(", drawable=");
        sb.append(this.v);
        sb.append(", animojiId=");
        return wj6.m(sb, this.w, ")");
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ n25(int i, int i2, CharSequence charSequence, List list, Drawable drawable, long j, int i3) {
        this(i, i2, charSequence, (i3 & 8) != 0 ? CollectionsKt.emptyList() : list, drawable, (i3 & 32) != 0 ? 0 : j);
    }
}
