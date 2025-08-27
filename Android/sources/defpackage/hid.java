package defpackage;

/* renamed from: hid  reason: default package */
public final class hid {
    public static final hid e = new hid(0, false, false, (gid) null);
    public final int a;
    public final boolean b;
    public final boolean c;
    public final gid d;

    public hid(int i, boolean z, boolean z2, gid gid) {
        this.a = i;
        this.b = z;
        this.c = z2;
        this.d = gid;
    }

    public static hid a(hid hid, int i, boolean z, boolean z2, gid gid, int i2) {
        if ((i2 & 1) != 0) {
            i = hid.a;
        }
        if ((i2 & 2) != 0) {
            z = hid.b;
        }
        if ((i2 & 4) != 0) {
            z2 = hid.c;
        }
        if ((i2 & 8) != 0) {
            gid = hid.d;
        }
        hid.getClass();
        return new hid(i, z, z2, gid);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x000a, code lost:
        r5 = (defpackage.hid) r5;
        r1 = r5.a;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean equals(java.lang.Object r5) {
        /*
            r4 = this;
            r0 = 1
            if (r4 != r5) goto L_0x0004
            return r0
        L_0x0004:
            boolean r1 = r5 instanceof defpackage.hid
            r2 = 0
            if (r1 != 0) goto L_0x000a
            return r2
        L_0x000a:
            hid r5 = (defpackage.hid) r5
            int r1 = r5.a
            int r3 = r4.a
            if (r3 == r1) goto L_0x0013
            return r2
        L_0x0013:
            boolean r1 = r4.b
            boolean r3 = r5.b
            if (r1 == r3) goto L_0x001a
            return r2
        L_0x001a:
            boolean r1 = r4.c
            boolean r3 = r5.c
            if (r1 == r3) goto L_0x0021
            return r2
        L_0x0021:
            gid r4 = r4.d
            gid r5 = r5.d
            boolean r4 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r4, (java.lang.Object) r5)
            if (r4 != 0) goto L_0x002c
            return r2
        L_0x002c:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.hid.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        int e2 = g63.e(g63.e(Integer.hashCode(this.a) * 31, 31, this.b), 31, this.c);
        gid gid = this.d;
        return e2 + (gid == null ? 0 : gid.hashCode());
    }

    public final String toString() {
        return "ScrollState(unreadMessages=" + this.a + ", isUnreadButtonVisible=" + this.b + ", isMentionButtonVisible=" + this.c + ", lastReaction=" + this.d + ")";
    }
}
