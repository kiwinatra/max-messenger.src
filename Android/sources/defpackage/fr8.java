package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* renamed from: fr8  reason: default package */
public final class fr8 implements hr8 {
    public final long a;
    public final long b;
    public final o00 c;
    public final b3g o;
    public final String v;
    public final long w;
    public final int x;

    public fr8(long j, long j2, o00 o00, b3g b3g, String str) {
        this.a = j;
        this.b = j2;
        this.c = o00;
        this.o = b3g;
        this.v = str;
        String str2 = b3g.g;
        this.w = str2 != null ? (long) str2.hashCode() : 0;
        this.x = cra.n;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fr8)) {
            return false;
        }
        fr8 fr8 = (fr8) obj;
        return this.a == fr8.a && this.b == fr8.b && Intrinsics.areEqual((Object) this.c, (Object) fr8.c) && Intrinsics.areEqual((Object) this.o, (Object) fr8.o) && Intrinsics.areEqual((Object) this.v, (Object) fr8.v);
    }

    public final long getItemId() {
        return this.w;
    }

    public final int hashCode() {
        int i = wzf.i(Long.hashCode(this.a) * 31, 31, this.b);
        o00 o00 = this.c;
        int hashCode = o00 == null ? 0 : o00.hashCode();
        return this.v.hashCode() + ((this.o.hashCode() + ((i + hashCode) * 31)) * 31);
    }

    public final int i() {
        return this.x;
    }

    public final long j() {
        return this.b;
    }

    public final long m() {
        return this.a;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Video(messageId=");
        sb.append(this.a);
        sb.append(", attachId=");
        sb.append(this.b);
        sb.append(", attachModel=");
        sb.append(this.c);
        sb.append(", videoAttachConfig=");
        sb.append(this.o);
        sb.append(", localId=");
        return wj6.n(sb, this.v, ")");
    }

    public final String v() {
        return this.v;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public fr8(long r10, long r12, defpackage.o00 r14, defpackage.b3g r15) {
        /*
            r9 = this;
            java.lang.String r0 = r15.g
            if (r0 != 0) goto L_0x0006
            java.lang.String r0 = ""
        L_0x0006:
            r8 = r0
            r1 = r9
            r2 = r10
            r4 = r12
            r6 = r14
            r7 = r15
            r1.<init>(r2, r4, r6, r7, r8)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fr8.<init>(long, long, o00, b3g):void");
    }
}
