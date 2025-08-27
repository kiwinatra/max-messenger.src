package defpackage;

import java.util.List;
import java.util.regex.Pattern;

/* renamed from: px9  reason: default package */
public final class px9 extends hd8 {
    public static final f19 j = ct.l("multipart/form-data");
    public static final byte[] k = {(byte) 58, (byte) 32};
    public static final byte[] l = {(byte) 13, (byte) 10};
    public static final byte[] m;
    public final f19 f;
    public long g = -1;
    public final vw0 h;
    public final List i;

    static {
        Pattern pattern = f19.d;
        ct.l("multipart/mixed");
        ct.l("multipart/alternative");
        ct.l("multipart/digest");
        ct.l("multipart/parallel");
        byte b = (byte) 45;
        m = new byte[]{b, b};
    }

    public px9(vw0 vw0, f19 f19, List list) {
        this.h = vw0;
        this.i = list;
        Pattern pattern = f19.d;
        this.f = ct.l(f19 + "; boundary=" + vw0.j());
    }

    public final void c0(wu0 wu0) {
        d0(wu0, false);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v0, resolved type: rt0} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v0, resolved type: wu0} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v1, resolved type: rt0} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v2, resolved type: wu0} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v3, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v2, resolved type: rt0} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v4, resolved type: wu0} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final long d0(defpackage.wu0 r17, boolean r18) {
        /*
            r16 = this;
            r0 = r16
            if (r18 == 0) goto L_0x000b
            rt0 r1 = new rt0
            r1.<init>()
            r2 = r1
            goto L_0x000f
        L_0x000b:
            r1 = 0
            r2 = r1
            r1 = r17
        L_0x000f:
            java.util.List r3 = r0.i
            int r4 = r3.size()
            r5 = 0
            r6 = 0
            r8 = r5
        L_0x0019:
            vw0 r9 = r0.h
            byte[] r10 = m
            byte[] r11 = l
            if (r8 >= r4) goto L_0x009d
            java.lang.Object r12 = r3.get(r8)
            ox9 r12 = (defpackage.ox9) r12
            lx6 r13 = r12.a
            r1.write(r10)
            r1.N(r9)
            r1.write(r11)
            if (r13 == 0) goto L_0x0057
            int r9 = r13.size()
            r10 = r5
        L_0x0039:
            if (r10 >= r9) goto L_0x0057
            java.lang.String r14 = r13.d(r10)
            wu0 r14 = r1.M(r14)
            byte[] r15 = k
            wu0 r14 = r14.write(r15)
            java.lang.String r15 = r13.f(r10)
            wu0 r14 = r14.M(r15)
            r14.write(r11)
            int r10 = r10 + 1
            goto L_0x0039
        L_0x0057:
            hd8 r9 = r12.b
            f19 r10 = r9.l()
            if (r10 == 0) goto L_0x006e
            java.lang.String r12 = "Content-Type: "
            wu0 r12 = r1.M(r12)
            java.lang.String r10 = r10.a
            wu0 r10 = r12.M(r10)
            r10.write(r11)
        L_0x006e:
            long r12 = r9.k()
            r14 = -1
            int r10 = (r12 > r14 ? 1 : (r12 == r14 ? 0 : -1))
            if (r10 == 0) goto L_0x0086
            java.lang.String r10 = "Content-Length: "
            wu0 r10 = r1.M(r10)
            wu0 r10 = r10.j0(r12)
            r10.write(r11)
            goto L_0x008c
        L_0x0086:
            if (r18 == 0) goto L_0x008c
            r2.m()
            return r14
        L_0x008c:
            r1.write(r11)
            if (r18 == 0) goto L_0x0093
            long r6 = r6 + r12
            goto L_0x0096
        L_0x0093:
            r9.c0(r1)
        L_0x0096:
            r1.write(r11)
            int r8 = r8 + 1
            goto L_0x0019
        L_0x009d:
            r1.write(r10)
            r1.N(r9)
            r1.write(r10)
            r1.write(r11)
            if (r18 == 0) goto L_0x00b1
            long r0 = r2.b
            long r6 = r6 + r0
            r2.m()
        L_0x00b1:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.px9.d0(wu0, boolean):long");
    }

    public final long k() {
        long j2 = this.g;
        if (j2 != -1) {
            return j2;
        }
        long d0 = d0((wu0) null, true);
        this.g = d0;
        return d0;
    }

    public final f19 l() {
        return this.f;
    }
}
