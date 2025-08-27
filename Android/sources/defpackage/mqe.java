package defpackage;

import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlin.uuid.Uuid;

/* renamed from: mqe  reason: default package */
public final class mqe implements lz7 {
    public final long X;
    public final long a;
    public final ngf b;
    public final String c;
    public final Integer o;
    public final List v;
    public final lqe w;
    public final boolean x;
    public final boolean y;
    public final int z;

    public mqe(long j, ngf ngf, String str, Integer num, List list, lqe lqe, boolean z2, boolean z3) {
        int i;
        this.a = j;
        this.b = ngf;
        this.c = str;
        this.o = num;
        this.v = list;
        this.w = lqe;
        this.x = z2;
        this.y = z3;
        if (lqe == lqe.v) {
            i = fza.j;
        } else {
            i = fza.i;
        }
        this.z = i;
        this.X = j >= 0 ? -j : j;
    }

    public static mqe h(mqe mqe, ArrayList arrayList, boolean z2, boolean z3, int i) {
        long j = mqe.a;
        ngf ngf = mqe.b;
        String str = mqe.c;
        Integer num = mqe.o;
        List list = arrayList;
        if ((i & 16) != 0) {
            list = mqe.v;
        }
        List list2 = list;
        lqe lqe = mqe.w;
        if ((i & 64) != 0) {
            z2 = mqe.x;
        }
        boolean z4 = z2;
        if ((i & Uuid.SIZE_BITS) != 0) {
            z3 = mqe.y;
        }
        mqe.getClass();
        return new mqe(j, ngf, str, num, list2, lqe, z4, z3);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mqe)) {
            return false;
        }
        mqe mqe = (mqe) obj;
        return this.a == mqe.a && Intrinsics.areEqual((Object) this.b, (Object) mqe.b) && Intrinsics.areEqual((Object) this.c, (Object) mqe.c) && Intrinsics.areEqual((Object) this.o, (Object) mqe.o) && Intrinsics.areEqual((Object) this.v, (Object) mqe.v) && this.w == mqe.w && this.x == mqe.x && this.y == mqe.y;
    }

    public final boolean f(lz7 lz7) {
        return this.X == lz7.getItemId();
    }

    public final long getItemId() {
        return this.X;
    }

    public final int hashCode() {
        int g = i2a.g(Long.hashCode(this.a) * 31, 31, this.b);
        int i = 0;
        String str = this.c;
        int hashCode = (g + (str == null ? 0 : str.hashCode())) * 31;
        Integer num = this.o;
        if (num != null) {
            i = num.hashCode();
        }
        return Boolean.hashCode(this.y) + g63.e((this.w.hashCode() + rae.i(this.v, (hashCode + i) * 31, 31)) * 31, 31, this.x);
    }

    public final int i() {
        return this.z;
    }

    public final Object l(Object obj) {
        lz7 lz7 = (lz7) obj;
        if (!(lz7 instanceof mqe)) {
            return null;
        }
        mqe mqe = (mqe) lz7;
        boolean z2 = this.x;
        boolean z3 = mqe.x;
        if (z2 != z3) {
            return new iqe(z3);
        }
        lqe lqe = this.w;
        lqe lqe2 = mqe.w;
        if (lqe != lqe2) {
            return new jqe(lqe2);
        }
        return null;
    }

    public final String toString() {
        return "StickerSetModel(id=" + this.a + ", name=" + this.b + ", iconUrl=" + this.c + ", iconRes=" + this.o + ", stickers=" + this.v + ", type=" + this.w + ", selected=" + this.x + ", favorite=" + this.y + ")";
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ mqe(long r14, defpackage.ngf r16, java.lang.String r17, java.lang.Integer r18, java.util.List r19, defpackage.lqe r20, boolean r21, boolean r22, int r23) {
        /*
            r13 = this;
            r0 = r23
            r1 = r0 & 4
            r2 = 0
            if (r1 == 0) goto L_0x0009
            r7 = r2
            goto L_0x000b
        L_0x0009:
            r7 = r17
        L_0x000b:
            r1 = r0 & 8
            if (r1 == 0) goto L_0x0011
            r8 = r2
            goto L_0x0013
        L_0x0011:
            r8 = r18
        L_0x0013:
            r1 = r0 & 64
            r2 = 0
            if (r1 == 0) goto L_0x001a
            r11 = r2
            goto L_0x001c
        L_0x001a:
            r11 = r21
        L_0x001c:
            r0 = r0 & 128(0x80, float:1.794E-43)
            if (r0 == 0) goto L_0x0022
            r12 = r2
            goto L_0x0024
        L_0x0022:
            r12 = r22
        L_0x0024:
            r3 = r13
            r4 = r14
            r6 = r16
            r9 = r19
            r10 = r20
            r3.<init>(r4, r6, r7, r8, r9, r10, r11, r12)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.mqe.<init>(long, ngf, java.lang.String, java.lang.Integer, java.util.List, lqe, boolean, boolean, int):void");
    }
}
