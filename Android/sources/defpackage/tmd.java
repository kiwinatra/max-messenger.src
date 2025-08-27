package defpackage;

import kotlin.uuid.Uuid;

/* renamed from: tmd  reason: default package */
public final class tmd implements xmd {
    public final int X;
    public final jnd a;
    public final ngf b;
    public final int c;
    public final long o;
    public final h1e v;
    public final ngf w;
    public final f1e x;
    public final Integer y;
    public final boolean z;

    public tmd(jnd jnd, ngf ngf, int i, long j, h1e h1e, ngf ngf2, f1e f1e, Integer num, boolean z2, int i2) {
        h1e = (i2 & 16) != 0 ? h1e.b : h1e;
        ngf2 = (i2 & 32) != 0 ? null : ngf2;
        f1e = (i2 & 64) != 0 ? null : f1e;
        num = (i2 & Uuid.SIZE_BITS) != 0 ? null : num;
        z2 = (i2 & 256) != 0 ? true : z2;
        this.a = jnd;
        this.b = ngf;
        this.c = i;
        this.o = j;
        this.v = h1e;
        this.w = ngf2;
        this.x = f1e;
        this.y = num;
        this.z = z2;
        this.X = tza.t;
    }

    public final Integer a() {
        return this.y;
    }

    public final ngf b() {
        return this.w;
    }

    public final f1e e() {
        return this.x;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x000a, code lost:
        r8 = (defpackage.tmd) r8;
        r1 = r8.a;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean equals(java.lang.Object r8) {
        /*
            r7 = this;
            r0 = 1
            if (r7 != r8) goto L_0x0004
            return r0
        L_0x0004:
            boolean r1 = r8 instanceof defpackage.tmd
            r2 = 0
            if (r1 != 0) goto L_0x000a
            return r2
        L_0x000a:
            tmd r8 = (defpackage.tmd) r8
            jnd r1 = r8.a
            jnd r3 = r7.a
            if (r3 == r1) goto L_0x0013
            return r2
        L_0x0013:
            ngf r1 = r7.b
            ngf r3 = r8.b
            boolean r1 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r1, (java.lang.Object) r3)
            if (r1 != 0) goto L_0x001e
            return r2
        L_0x001e:
            int r1 = r7.c
            int r3 = r8.c
            if (r1 == r3) goto L_0x0025
            return r2
        L_0x0025:
            long r3 = r7.o
            long r5 = r8.o
            int r1 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r1 == 0) goto L_0x002e
            return r2
        L_0x002e:
            h1e r1 = r7.v
            h1e r3 = r8.v
            if (r1 == r3) goto L_0x0035
            return r2
        L_0x0035:
            ngf r1 = r7.w
            ngf r3 = r8.w
            boolean r1 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r1, (java.lang.Object) r3)
            if (r1 != 0) goto L_0x0040
            return r2
        L_0x0040:
            f1e r1 = r7.x
            f1e r3 = r8.x
            boolean r1 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r1, (java.lang.Object) r3)
            if (r1 != 0) goto L_0x004b
            return r2
        L_0x004b:
            java.lang.Integer r1 = r7.y
            java.lang.Integer r3 = r8.y
            boolean r1 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r1, (java.lang.Object) r3)
            if (r1 != 0) goto L_0x0056
            return r2
        L_0x0056:
            boolean r7 = r7.z
            boolean r8 = r8.z
            if (r7 == r8) goto L_0x005d
            return r2
        L_0x005d:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.tmd.equals(java.lang.Object):boolean");
    }

    public final jnd g() {
        return this.a;
    }

    public final long getItemId() {
        return this.o;
    }

    public final ngf getTitle() {
        return this.b;
    }

    public final h1e getType() {
        return this.v;
    }

    public final int hashCode() {
        int hashCode = (this.v.hashCode() + wzf.i(rae.h(this.c, i2a.g(this.a.hashCode() * 31, 31, this.b), 31), 31, this.o)) * 31;
        int i = 0;
        ngf ngf = this.w;
        int hashCode2 = (hashCode + (ngf == null ? 0 : ngf.hashCode())) * 31;
        f1e f1e = this.x;
        int hashCode3 = (hashCode2 + (f1e == null ? 0 : f1e.hashCode())) * 31;
        Integer num = this.y;
        if (num != null) {
            i = num.hashCode();
        }
        return Boolean.hashCode(this.z) + ((hashCode3 + i) * 31);
    }

    public final int i() {
        return this.X;
    }

    public final int s() {
        return this.c;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SettingPrivacyItem(sectionItemType=");
        sb.append(this.a);
        sb.append(", title=");
        sb.append(this.b);
        sb.append(", sectionId=");
        sb.append(this.c);
        sb.append(", itemId=");
        sb.append(this.o);
        sb.append(", type=");
        sb.append(this.v);
        sb.append(", descriptionRes=");
        sb.append(this.w);
        sb.append(", endView=");
        sb.append(this.x);
        sb.append(", startIconRes=");
        sb.append(this.y);
        sb.append(", clickable=");
        return tr1.m(sb, this.z, ")");
    }
}
