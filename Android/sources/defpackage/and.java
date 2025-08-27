package defpackage;

/* renamed from: and  reason: default package */
public final class and implements bnd {
    public final jnd a;
    public final ngf b;
    public final int c;
    public final long o;
    public final h1e v;
    public final ngf w = null;
    public final f1e x;
    public final int y;

    public and(jnd jnd, igf igf, int i, long j, f1e f1e) {
        h1e h1e = h1e.b;
        this.a = jnd;
        this.b = igf;
        this.c = i;
        this.o = j;
        this.v = h1e;
        this.x = f1e;
        this.y = qza.D;
    }

    public final ngf b() {
        return this.w;
    }

    public final f1e e() {
        return this.x;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x000a, code lost:
        r8 = (defpackage.and) r8;
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
            boolean r1 = r8 instanceof defpackage.and
            r2 = 0
            if (r1 != 0) goto L_0x000a
            return r2
        L_0x000a:
            and r8 = (defpackage.and) r8
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
            f1e r7 = r7.x
            f1e r8 = r8.x
            boolean r7 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r7, (java.lang.Object) r8)
            if (r7 != 0) goto L_0x004b
            return r2
        L_0x004b:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.and.equals(java.lang.Object):boolean");
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
        if (f1e != null) {
            i = f1e.hashCode();
        }
        return hashCode2 + i;
    }

    public final int i() {
        return this.y;
    }

    public final int s() {
        return this.c;
    }

    public final String toString() {
        return "SettingPrivacyItem(sectionItemType=" + this.a + ", title=" + this.b + ", sectionId=" + this.c + ", itemId=" + this.o + ", type=" + this.v + ", descriptionRes=" + this.w + ", endView=" + this.x + ")";
    }
}
