package defpackage;

import java.util.List;

/* renamed from: bqe  reason: default package */
public final class bqe {
    public final long a;
    public final String b;
    public final String c;
    public final long d;
    public final long e;
    public final long f;
    public final String g;
    public final List h;
    public final boolean i;
    public final boolean j;

    /* JADX WARNING: Removed duplicated region for block: B:13:0x0044 A[EDGE_INSN: B:13:0x0044->B:10:0x0044 ?: BREAK  , SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:5:0x0035  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public bqe(defpackage.zpe r4) {
        /*
            r3 = this;
            r3.<init>()
            long r0 = r4.a
            r3.a = r0
            java.lang.String r0 = r4.b
            r3.b = r0
            java.lang.String r0 = r4.c
            r3.c = r0
            long r0 = r4.d
            r3.d = r0
            long r0 = r4.e
            r3.e = r0
            long r0 = r4.f
            r3.f = r0
            java.lang.String r0 = r4.g
            r3.g = r0
            java.util.List r0 = r4.h
            r3.h = r0
            boolean r4 = r4.i
            r3.i = r4
            r4 = 0
            if (r0 != 0) goto L_0x002b
            goto L_0x0044
        L_0x002b:
            java.util.Iterator r0 = r0.iterator()
        L_0x002f:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x0044
            java.lang.Object r1 = r0.next()
            boe r1 = (defpackage.boe) r1
            int r1 = r1.X
            r2 = 3
            if (r1 == r2) goto L_0x0043
            r2 = 4
            if (r1 != r2) goto L_0x002f
        L_0x0043:
            r4 = 1
        L_0x0044:
            r3.j = r4
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bqe.<init>(zpe):void");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || bqe.class != obj.getClass()) {
            return false;
        }
        bqe bqe = (bqe) obj;
        if (this.a != bqe.a || this.d != bqe.d || this.e != bqe.e || this.f != bqe.f || this.i != bqe.i) {
            return false;
        }
        String str = bqe.b;
        String str2 = this.b;
        if (str2 == null ? str != null : !str2.equals(str)) {
            return false;
        }
        String str3 = bqe.c;
        String str4 = this.c;
        if (str4 == null ? str3 != null : !str4.equals(str3)) {
            return false;
        }
        if (!this.g.equals(bqe.g)) {
            return false;
        }
        return this.h.equals(bqe.h);
    }

    public final int hashCode() {
        long j2 = this.a;
        int i2 = ((int) (j2 ^ (j2 >>> 32))) * 31;
        int i3 = 0;
        String str = this.b;
        int hashCode = (i2 + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.c;
        if (str2 != null) {
            i3 = str2.hashCode();
        }
        long j3 = this.d;
        long j4 = this.e;
        long j5 = this.f;
        return ((this.h.hashCode() + g63.d((((((((hashCode + i3) * 31) + ((int) (j3 ^ (j3 >>> 32)))) * 31) + ((int) (j4 ^ (j4 >>> 32)))) * 31) + ((int) (j5 ^ (j5 >>> 32)))) * 31, 31, this.g)) * 31) + (this.i ? 1 : 0);
    }

    public final String toString() {
        List list = this.h;
        int size = list != null ? list.size() : 0;
        StringBuilder sb = new StringBuilder("StickerSet{id=");
        sb.append(this.a);
        sb.append(", name='");
        sb.append(this.b);
        sb.append("', iconUrl='");
        sb.append(this.c);
        sb.append("', authorId=");
        sb.append(this.d);
        sb.append(", createTime=");
        sb.append(this.e);
        sb.append(", updateTime=");
        sb.append(this.f);
        sb.append(", link='");
        sb.append(this.g);
        sb.append("', stickers=");
        sb.append(size);
        sb.append(", draft=");
        sb.append(this.i);
        sb.append(", hasAnimatedOrOverlayStickers=");
        return tr1.m(sb, this.j, "}");
    }
}
