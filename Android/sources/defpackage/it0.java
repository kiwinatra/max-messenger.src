package defpackage;

import java.io.Closeable;

/* renamed from: it0  reason: default package */
public final class it0 implements Closeable {
    public rt0 a;
    public boolean b;
    public hod c;
    public long o = -1;
    public byte[] v;
    public int w = -1;
    public int x = -1;

    public final void a(long j) {
        long j2 = j;
        rt0 rt0 = this.a;
        if (rt0 == null) {
            throw new IllegalStateException("not attached to a buffer".toString());
        } else if (this.b) {
            long j3 = rt0.b;
            int i = (j2 > j3 ? 1 : (j2 == j3 ? 0 : -1));
            if (i <= 0) {
                if (j2 >= 0) {
                    long j4 = j3 - j2;
                    while (true) {
                        if (j4 <= 0) {
                            break;
                        }
                        hod hod = rt0.a.g;
                        int i2 = hod.c;
                        long j5 = (long) (i2 - hod.b);
                        if (j5 > j4) {
                            hod.c = i2 - ((int) j4);
                            break;
                        }
                        rt0.a = hod.a();
                        zod.a(hod);
                        j4 -= j5;
                    }
                    this.c = null;
                    this.o = j2;
                    this.v = null;
                    this.w = -1;
                    this.x = -1;
                } else {
                    throw new IllegalArgumentException(wj6.i(j2, "newSize < 0: ").toString());
                }
            } else if (i > 0) {
                long j6 = j2 - j3;
                int i3 = 1;
                boolean z = true;
                for (long j7 = 0; j6 > j7; j7 = 0) {
                    hod s0 = rt0.s0(i3);
                    int min = (int) Math.min(j6, (long) (8192 - s0.c));
                    int i4 = s0.c + min;
                    s0.c = i4;
                    j6 -= (long) min;
                    if (z) {
                        this.c = s0;
                        this.o = j3;
                        this.v = s0.a;
                        this.w = i4 - min;
                        this.x = i4;
                        z = false;
                    }
                    i3 = 1;
                }
            }
            rt0.b = j2;
        } else {
            throw new IllegalStateException("resizeBuffer() only permitted for read/write buffers".toString());
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x000e, code lost:
        r5 = r3.b;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int b(long r18) {
        /*
            r17 = this;
            r0 = r17
            r1 = r18
            rt0 r3 = r0.a
            if (r3 == 0) goto L_0x00d0
            r4 = -1
            long r5 = (long) r4
            int r5 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
            if (r5 < 0) goto L_0x00af
            long r5 = r3.b
            int r7 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
            if (r7 > 0) goto L_0x00af
            r8 = -1
            int r8 = (r1 > r8 ? 1 : (r1 == r8 ? 0 : -1))
            if (r8 == 0) goto L_0x00a3
            if (r7 != 0) goto L_0x001e
            goto L_0x00a3
        L_0x001e:
            hod r4 = r3.a
            hod r7 = r0.c
            r8 = 0
            if (r7 == 0) goto L_0x003c
            long r10 = r0.o
            int r12 = r0.w
            int r13 = r7.b
            int r12 = r12 - r13
            long r12 = (long) r12
            long r10 = r10 - r12
            int r12 = (r10 > r1 ? 1 : (r10 == r1 ? 0 : -1))
            if (r12 <= 0) goto L_0x003a
            r5 = r10
            r16 = r7
            r7 = r4
            r4 = r16
            goto L_0x003d
        L_0x003a:
            r8 = r10
            goto L_0x003d
        L_0x003c:
            r7 = r4
        L_0x003d:
            long r10 = r5 - r1
            long r12 = r1 - r8
            int r10 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            if (r10 <= 0) goto L_0x0054
        L_0x0045:
            int r4 = r7.c
            int r5 = r7.b
            int r4 = r4 - r5
            long r4 = (long) r4
            long r4 = r4 + r8
            int r6 = (r1 > r4 ? 1 : (r1 == r4 ? 0 : -1))
            if (r6 < 0) goto L_0x0064
            hod r7 = r7.f
            r8 = r4
            goto L_0x0045
        L_0x0054:
            int r7 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
            if (r7 <= 0) goto L_0x0062
            hod r4 = r4.g
            int r7 = r4.c
            int r8 = r4.b
            int r7 = r7 - r8
            long r7 = (long) r7
            long r5 = r5 - r7
            goto L_0x0054
        L_0x0062:
            r7 = r4
            r8 = r5
        L_0x0064:
            boolean r4 = r0.b
            if (r4 == 0) goto L_0x008e
            boolean r4 = r7.d
            if (r4 == 0) goto L_0x008e
            hod r4 = new hod
            byte[] r5 = r7.a
            int r6 = r5.length
            byte[] r11 = java.util.Arrays.copyOf(r5, r6)
            int r12 = r7.b
            int r13 = r7.c
            r14 = 0
            r15 = 1
            r10 = r4
            r10.<init>(r11, r12, r13, r14, r15)
            hod r5 = r3.a
            if (r5 != r7) goto L_0x0085
            r3.a = r4
        L_0x0085:
            r7.b(r4)
            hod r3 = r4.g
            r3.a()
            r7 = r4
        L_0x008e:
            r0.c = r7
            r0.o = r1
            byte[] r3 = r7.a
            r0.v = r3
            int r3 = r7.b
            long r1 = r1 - r8
            int r1 = (int) r1
            int r3 = r3 + r1
            r0.w = r3
            int r1 = r7.c
            r0.x = r1
            int r1 = r1 - r3
            return r1
        L_0x00a3:
            r3 = 0
            r0.c = r3
            r0.o = r1
            r0.v = r3
            r0.w = r4
            r0.x = r4
            return r4
        L_0x00af:
            java.lang.ArrayIndexOutOfBoundsException r0 = new java.lang.ArrayIndexOutOfBoundsException
            kotlin.jvm.internal.StringCompanionObject r4 = kotlin.jvm.internal.StringCompanionObject.INSTANCE
            java.lang.Long r1 = java.lang.Long.valueOf(r18)
            long r2 = r3.b
            java.lang.Long r2 = java.lang.Long.valueOf(r2)
            java.lang.Object[] r1 = new java.lang.Object[]{r1, r2}
            r2 = 2
            java.lang.Object[] r1 = java.util.Arrays.copyOf(r1, r2)
            java.lang.String r2 = "offset=%s > size=%s"
            java.lang.String r1 = java.lang.String.format(r2, r1)
            r0.<init>(r1)
            throw r0
        L_0x00d0:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "not attached to a buffer"
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.it0.b(long):int");
    }

    public final void close() {
        if (this.a != null) {
            this.a = null;
            this.c = null;
            this.o = -1;
            this.v = null;
            this.w = -1;
            this.x = -1;
            return;
        }
        throw new IllegalStateException("not attached to a buffer".toString());
    }
}
