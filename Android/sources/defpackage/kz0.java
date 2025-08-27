package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* renamed from: kz0  reason: default package */
public final class kz0 implements i1e {
    public final ngf a;
    public final long b;
    public final h1e c;
    public final ngf o;
    public final f1e v;
    public final Integer w;
    public final int x;
    public final boolean y;

    public kz0(igf igf, long j, h1e h1e, ngf ngf, f1e f1e, Integer num, int i, boolean z) {
        jnd jnd = jnd.a;
        this.a = igf;
        this.b = j;
        this.c = h1e;
        this.o = ngf;
        this.v = f1e;
        this.w = num;
        this.x = i;
        this.y = z;
    }

    public final Integer a() {
        return this.w;
    }

    public final ngf b() {
        return this.o;
    }

    public final z0e c() {
        return null;
    }

    public final ngf d() {
        return null;
    }

    public final f1e e() {
        return this.v;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kz0)) {
            return false;
        }
        kz0 kz0 = (kz0) obj;
        kz0.getClass();
        jnd jnd = jnd.a;
        return Intrinsics.areEqual((Object) this.a, (Object) kz0.a) && this.b == kz0.b && this.c == kz0.c && Intrinsics.areEqual((Object) this.o, (Object) kz0.o) && Intrinsics.areEqual((Object) this.v, (Object) kz0.v) && Intrinsics.areEqual((Object) this.w, (Object) kz0.w) && this.x == kz0.x && this.y == kz0.y;
    }

    public final long getItemId() {
        return this.b;
    }

    public final ngf getTitle() {
        return this.a;
    }

    public final h1e getType() {
        return this.c;
    }

    public final int hashCode() {
        int i = 0;
        int hashCode = (this.c.hashCode() + wzf.i(rae.h(0, i2a.g(jnd.o.hashCode() * 31, 31, this.a), 31), 31, this.b)) * 31;
        ngf ngf = this.o;
        int hashCode2 = (hashCode + (ngf == null ? 0 : ngf.hashCode())) * 31;
        f1e f1e = this.v;
        int hashCode3 = (hashCode2 + (f1e == null ? 0 : f1e.hashCode())) * 31;
        Integer num = this.w;
        if (num != null) {
            i = num.hashCode();
        }
        return Boolean.hashCode(this.y) + rae.h(this.x, (hashCode3 + i) * 31, 31);
    }

    public final int i() {
        return this.x;
    }

    public final int s() {
        return 0;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ActionItem(sectionItemType=");
        sb.append(jnd.o);
        sb.append(", title=");
        sb.append(this.a);
        sb.append(", sectionId=0, itemId=");
        sb.append(this.b);
        sb.append(", type=");
        sb.append(this.c);
        sb.append(", descriptionRes=");
        sb.append(this.o);
        sb.append(", endView=");
        sb.append(this.v);
        sb.append(", startIconRes=");
        sb.append(this.w);
        sb.append(", viewType=");
        sb.append(this.x);
        sb.append(", isAvailable=");
        return tr1.m(sb, this.y, ")");
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ kz0(defpackage.igf r13, long r14, defpackage.h1e r16, defpackage.igf r17, defpackage.f1e r18, java.lang.Integer r19, int r20, int r21) {
        /*
            r12 = this;
            r0 = r21
            jnd r1 = defpackage.jnd.a
            r1 = r0 & 16
            if (r1 == 0) goto L_0x000c
            h1e r1 = defpackage.h1e.b
            r6 = r1
            goto L_0x000e
        L_0x000c:
            r6 = r16
        L_0x000e:
            r1 = r0 & 32
            r2 = 0
            if (r1 == 0) goto L_0x0015
            r7 = r2
            goto L_0x0017
        L_0x0015:
            r7 = r17
        L_0x0017:
            r1 = r0 & 64
            if (r1 == 0) goto L_0x001d
            r8 = r2
            goto L_0x001f
        L_0x001d:
            r8 = r18
        L_0x001f:
            r1 = r0 & 256(0x100, float:3.59E-43)
            if (r1 == 0) goto L_0x0027
            int r1 = defpackage.qqa.V
            r10 = r1
            goto L_0x0029
        L_0x0027:
            r10 = r20
        L_0x0029:
            r0 = r0 & 512(0x200, float:7.175E-43)
            if (r0 == 0) goto L_0x0030
            r0 = 1
        L_0x002e:
            r11 = r0
            goto L_0x0032
        L_0x0030:
            r0 = 0
            goto L_0x002e
        L_0x0032:
            r2 = r12
            r3 = r13
            r4 = r14
            r9 = r19
            r2.<init>((defpackage.igf) r3, (long) r4, (defpackage.h1e) r6, (defpackage.ngf) r7, (defpackage.f1e) r8, (java.lang.Integer) r9, (int) r10, (boolean) r11)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.kz0.<init>(igf, long, h1e, igf, f1e, java.lang.Integer, int, int):void");
    }
}
