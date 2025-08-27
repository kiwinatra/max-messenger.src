package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* renamed from: ar  reason: default package */
public final class ar implements lz7 {
    public final yq a;
    public final Boolean b;

    public ar(yq yqVar, Boolean bool) {
        this.a = yqVar;
        this.b = bool;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x000a, code lost:
        r5 = (defpackage.ar) r5;
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
            boolean r1 = r5 instanceof defpackage.ar
            r2 = 0
            if (r1 != 0) goto L_0x000a
            return r2
        L_0x000a:
            ar r5 = (defpackage.ar) r5
            yq r1 = r5.a
            yq r3 = r4.a
            if (r3 == r1) goto L_0x0013
            return r2
        L_0x0013:
            java.lang.Boolean r4 = r4.b
            java.lang.Boolean r5 = r5.b
            boolean r4 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r4, (java.lang.Object) r5)
            if (r4 != 0) goto L_0x001e
            return r2
        L_0x001e:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ar.equals(java.lang.Object):boolean");
    }

    public final boolean f(lz7 lz7) {
        return getItemId() == lz7.getItemId();
    }

    public final long getItemId() {
        return (long) this.a.ordinal();
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        Boolean bool = this.b;
        return hashCode + (bool == null ? 0 : bool.hashCode());
    }

    public final int i() {
        return 0;
    }

    public final Object l(Object obj) {
        lz7 lz7 = (lz7) obj;
        ar arVar = lz7 instanceof ar ? (ar) lz7 : null;
        if (arVar == null) {
            return null;
        }
        Boolean bool = this.b;
        Boolean bool2 = arVar.b;
        if (!Intrinsics.areEqual((Object) bool, (Object) bool2)) {
            return new zq(bool2);
        }
        return null;
    }

    public final String toString() {
        return "AppearanceModeItem(mode=" + this.a + ", isSelected=" + this.b + ")";
    }
}
