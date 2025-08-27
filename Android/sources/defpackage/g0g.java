package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* renamed from: g0g  reason: default package */
public final class g0g implements lz7 {
    public final zx5 a;
    public final f0g b;
    public final ngf c;
    public final int o;
    public final long v;

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0011, code lost:
        r1 = r1.a;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public g0g(defpackage.zx5 r1, defpackage.f0g r2, defpackage.ngf r3) {
        /*
            r0 = this;
            r0.<init>()
            r0.a = r1
            r0.b = r2
            r0.c = r3
            int r3 = r2.ordinal()
            r0.o = r3
            if (r1 == 0) goto L_0x001a
            java.lang.String r1 = r1.a
            if (r1 == 0) goto L_0x001a
            int r1 = r1.hashCode()
            goto L_0x001b
        L_0x001a:
            r1 = 0
        L_0x001b:
            int r2 = r2.hashCode()
            int r2 = r2 * 33
            int r2 = r2 + r1
            long r1 = (long) r2
            r0.v = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.g0g.<init>(zx5, f0g, ngf):void");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g0g)) {
            return false;
        }
        g0g g0g = (g0g) obj;
        return Intrinsics.areEqual((Object) this.a, (Object) g0g.a) && this.b == g0g.b && Intrinsics.areEqual((Object) this.c, (Object) g0g.c);
    }

    public final boolean f(lz7 lz7) {
        if (!(lz7 instanceof g0g)) {
            return false;
        }
        String str = null;
        zx5 zx5 = this.a;
        String str2 = zx5 != null ? zx5.a : null;
        zx5 zx52 = ((g0g) lz7).a;
        if (zx52 != null) {
            str = zx52.a;
        }
        return Intrinsics.areEqual((Object) str2, (Object) str);
    }

    public final long getItemId() {
        return this.v;
    }

    public final int hashCode() {
        zx5 zx5 = this.a;
        int hashCode = zx5 == null ? 0 : zx5.hashCode();
        return this.c.hashCode() + ((this.b.hashCode() + (hashCode * 31)) * 31);
    }

    public final int i() {
        return this.o;
    }

    public final String toString() {
        return "UserFolderListItem(folder=" + this.a + ", type=" + this.b + ", processedTitle=" + this.c + ")";
    }
}
