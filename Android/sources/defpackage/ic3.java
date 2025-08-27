package defpackage;

import android.util.Pair;
import android.util.Size;
import com.google.android.exoplayer2.ExoPlaybackException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.TreeMap;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.KotlinVersion;
import kotlin.uuid.Uuid;

/* renamed from: ic3  reason: default package */
public class ic3 implements cc3, h65 {
    public static final byte[] X = {0, 119, -120, -1};
    public static final byte[] Y = {0, 17, 34, 51, 68, 85, 102, 119, -120, -103, -86, -69, -52, -35, -18, -1};
    public static final gc3 y = new gc3(0);
    public static final byte[] z = {0, 7, 8, 15};
    public Object a;
    public Object b;
    public Object c;
    public Object o;
    public Object v;
    public Object w;
    public Object x;

    public ic3(int i) {
        switch (i) {
            case 5:
                this.b = new q0a(25);
                this.c = new q0a(26);
                this.o = jm.a;
                return;
            default:
                this.a = new AtomicInteger(0);
                this.b = new AtomicInteger(0);
                this.c = new AtomicInteger(0);
                this.o = new AtomicInteger(0);
                this.v = new AtomicInteger(0);
                this.w = new AtomicInteger(0);
                this.x = new AtomicInteger(0);
                new ConcurrentHashMap();
                return;
        }
    }

    public static boolean d(mpf mpf, ca6 ca6) {
        return cvg.c(ca6.a, mpf.a) && cvg.c(ca6.b, mpf.b) && cvg.c(ca6.c, mpf.c) && ca6.z0 == mpf.o && ca6.A0 == mpf.v && ca6.y == mpf.w;
    }

    public static byte[] i(int i, int i2, ky1 ky1) {
        byte[] bArr = new byte[i];
        for (int i3 = 0; i3 < i; i3++) {
            bArr[i3] = (byte) ky1.i(i2);
        }
        return bArr;
    }

    public static int[] k() {
        int[] iArr = new int[16];
        iArr[0] = 0;
        for (int i = 1; i < 16; i++) {
            if (i < 8) {
                iArr[i] = n(KotlinVersion.MAX_COMPONENT_VALUE, (i & 1) != 0 ? 255 : 0, (i & 2) != 0 ? 255 : 0, (i & 4) != 0 ? 255 : 0);
            } else {
                int i2 = 127;
                int i3 = (i & 1) != 0 ? 127 : 0;
                int i4 = (i & 2) != 0 ? 127 : 0;
                if ((i & 4) == 0) {
                    i2 = 0;
                }
                iArr[i] = n(KotlinVersion.MAX_COMPONENT_VALUE, i3, i4, i2);
            }
        }
        return iArr;
    }

    public static int[] l() {
        int[] iArr = new int[256];
        iArr[0] = 0;
        for (int i = 0; i < 256; i++) {
            int i2 = KotlinVersion.MAX_COMPONENT_VALUE;
            if (i < 8) {
                int i3 = (i & 1) != 0 ? 255 : 0;
                int i4 = (i & 2) != 0 ? 255 : 0;
                if ((i & 4) == 0) {
                    i2 = 0;
                }
                iArr[i] = n(63, i3, i4, i2);
            } else {
                int i5 = i & 136;
                int i6 = 170;
                int i7 = 85;
                if (i5 == 0) {
                    int i8 = ((i & 1) != 0 ? 85 : 0) + ((i & 16) != 0 ? 170 : 0);
                    int i9 = ((i & 2) != 0 ? 85 : 0) + ((i & 32) != 0 ? 170 : 0);
                    if ((i & 4) == 0) {
                        i7 = 0;
                    }
                    if ((i & 64) == 0) {
                        i6 = 0;
                    }
                    iArr[i] = n(KotlinVersion.MAX_COMPONENT_VALUE, i8, i9, i7 + i6);
                } else if (i5 != 8) {
                    int i10 = 43;
                    if (i5 == 128) {
                        int i11 = ((i & 1) != 0 ? 43 : 0) + 127 + ((i & 16) != 0 ? 85 : 0);
                        int i12 = ((i & 2) != 0 ? 43 : 0) + 127 + ((i & 32) != 0 ? 85 : 0);
                        if ((i & 4) == 0) {
                            i10 = 0;
                        }
                        int i13 = i10 + 127;
                        if ((i & 64) == 0) {
                            i7 = 0;
                        }
                        iArr[i] = n(KotlinVersion.MAX_COMPONENT_VALUE, i11, i12, i13 + i7);
                    } else if (i5 == 136) {
                        int i14 = ((i & 1) != 0 ? 43 : 0) + ((i & 16) != 0 ? 85 : 0);
                        int i15 = ((i & 2) != 0 ? 43 : 0) + ((i & 32) != 0 ? 85 : 0);
                        if ((i & 4) == 0) {
                            i10 = 0;
                        }
                        if ((i & 64) == 0) {
                            i7 = 0;
                        }
                        iArr[i] = n(KotlinVersion.MAX_COMPONENT_VALUE, i14, i15, i10 + i7);
                    }
                } else {
                    int i16 = ((i & 1) != 0 ? 85 : 0) + ((i & 16) != 0 ? 170 : 0);
                    int i17 = ((i & 2) != 0 ? 85 : 0) + ((i & 32) != 0 ? 170 : 0);
                    if ((i & 4) == 0) {
                        i7 = 0;
                    }
                    if ((i & 64) == 0) {
                        i6 = 0;
                    }
                    iArr[i] = n(127, i16, i17, i7 + i6);
                }
            }
        }
        return iArr;
    }

    public static int n(int i, int i2, int i3, int i4) {
        return (i << 24) | (i2 << 16) | (i3 << 8) | i4;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v4, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v5, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v11, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v12, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v15, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v18, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v19, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v20, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v23, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v24, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v62, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v63, resolved type: byte} */
    /* JADX WARNING: Incorrect type for immutable var: ssa=byte, code=int, for r3v34, types: [byte] */
    /* JADX WARNING: Incorrect type for immutable var: ssa=byte, code=int, for r3v7, types: [byte] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:107:0x01f3 A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:115:0x0226 A[LOOP:3: B:86:0x0174->B:115:0x0226, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:129:0x0221 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:88:0x017a  */
    /* JADX WARNING: Removed duplicated region for block: B:90:0x0183  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void u(byte[] r23, int[] r24, int r25, int r26, int r27, android.graphics.Paint r28, android.graphics.Canvas r29) {
        /*
            r0 = r23
            r1 = r25
            r8 = r28
            ky1 r9 = new ky1
            int r2 = r0.length
            r3 = 1
            r4 = 0
            r9.<init>((byte[]) r0, (byte) r4, (int) r2, (int) r3)
            r2 = r26
            r10 = r27
            r11 = 0
            r12 = 0
            r13 = 0
        L_0x0015:
            int r3 = r9.b()
            if (r3 == 0) goto L_0x0231
            r14 = 8
            int r3 = r9.i(r14)
            r4 = 240(0xf0, float:3.36E-43)
            if (r3 == r4) goto L_0x022b
            r15 = 2
            r7 = 1
            r16 = 0
            r6 = 3
            r5 = 4
            switch(r3) {
                case 16: goto L_0x0159;
                case 17: goto L_0x009f;
                case 18: goto L_0x0043;
                default: goto L_0x002e;
            }
        L_0x002e:
            switch(r3) {
                case 32: goto L_0x003e;
                case 33: goto L_0x0039;
                case 34: goto L_0x0032;
                default: goto L_0x0031;
            }
        L_0x0031:
            goto L_0x0015
        L_0x0032:
            r3 = 16
            byte[] r12 = i(r3, r14, r9)
            goto L_0x0015
        L_0x0039:
            byte[] r11 = i(r5, r14, r9)
            goto L_0x0015
        L_0x003e:
            byte[] r13 = i(r5, r5, r9)
            goto L_0x0015
        L_0x0043:
            r15 = r2
            r2 = r16
        L_0x0046:
            int r3 = r9.i(r14)
            if (r3 == 0) goto L_0x0051
            r17 = r2
            r18 = r7
            goto L_0x0079
        L_0x0051:
            boolean r3 = r9.h()
            r4 = 7
            if (r3 != 0) goto L_0x006c
            int r3 = r9.i(r4)
            if (r3 == 0) goto L_0x0065
            r17 = r2
            r18 = r3
            r3 = r16
            goto L_0x0079
        L_0x0065:
            r17 = r7
            r3 = r16
            r18 = r3
            goto L_0x0079
        L_0x006c:
            int r3 = r9.i(r4)
            int r4 = r9.i(r14)
            r17 = r2
            r18 = r3
            r3 = r4
        L_0x0079:
            if (r18 == 0) goto L_0x0093
            if (r8 == 0) goto L_0x0093
            r2 = r24[r3]
            r8.setColor(r2)
            float r3 = (float) r15
            float r4 = (float) r10
            int r2 = r15 + r18
            float r5 = (float) r2
            int r2 = r10 + 1
            float r6 = (float) r2
            r2 = r29
            r0 = r7
            r7 = r28
            r2.drawRect(r3, r4, r5, r6, r7)
            goto L_0x0094
        L_0x0093:
            r0 = r7
        L_0x0094:
            int r15 = r15 + r18
            if (r17 == 0) goto L_0x009b
            r2 = r15
            goto L_0x0015
        L_0x009b:
            r7 = r0
            r2 = r17
            goto L_0x0046
        L_0x009f:
            r0 = r7
            if (r1 != r6) goto L_0x00ab
            if (r12 != 0) goto L_0x00a7
            byte[] r3 = Y
            goto L_0x00a8
        L_0x00a7:
            r3 = r12
        L_0x00a8:
            r17 = r3
            goto L_0x00ad
        L_0x00ab:
            r17 = 0
        L_0x00ad:
            r7 = r2
            r2 = r16
        L_0x00b0:
            int r3 = r9.i(r5)
            if (r3 == 0) goto L_0x00bc
            r19 = r0
            r18 = r2
            goto L_0x011c
        L_0x00bc:
            boolean r3 = r9.h()
            if (r3 != 0) goto L_0x00d8
            int r3 = r9.i(r6)
            if (r3 == 0) goto L_0x00d1
            int r3 = r3 + 2
            r18 = r2
            r19 = r3
        L_0x00ce:
            r3 = r16
            goto L_0x011c
        L_0x00d1:
            r18 = r0
        L_0x00d3:
            r3 = r16
            r19 = r3
            goto L_0x011c
        L_0x00d8:
            boolean r3 = r9.h()
            if (r3 != 0) goto L_0x00ed
            int r3 = r9.i(r15)
            int r3 = r3 + r5
            int r4 = r9.i(r5)
        L_0x00e7:
            r18 = r2
            r19 = r3
            r3 = r4
            goto L_0x011c
        L_0x00ed:
            int r3 = r9.i(r15)
            if (r3 == 0) goto L_0x0117
            if (r3 == r0) goto L_0x0112
            if (r3 == r15) goto L_0x0107
            if (r3 == r6) goto L_0x00fc
            r18 = r2
            goto L_0x00d3
        L_0x00fc:
            int r3 = r9.i(r14)
            int r3 = r3 + 25
            int r4 = r9.i(r5)
            goto L_0x00e7
        L_0x0107:
            int r3 = r9.i(r5)
            int r3 = r3 + 9
            int r4 = r9.i(r5)
            goto L_0x00e7
        L_0x0112:
            r18 = r2
            r19 = r15
            goto L_0x00ce
        L_0x0117:
            r19 = r0
            r18 = r2
            goto L_0x00ce
        L_0x011c:
            if (r19 == 0) goto L_0x0144
            if (r8 == 0) goto L_0x0144
            if (r17 == 0) goto L_0x0124
            byte r3 = r17[r3]
        L_0x0124:
            r2 = r24[r3]
            r8.setColor(r2)
            float r3 = (float) r7
            float r4 = (float) r10
            int r2 = r7 + r19
            float r2 = (float) r2
            int r5 = r10 + 1
            float r5 = (float) r5
            r20 = r2
            r2 = r29
            r22 = r5
            r5 = r20
            r14 = r6
            r6 = r22
            r20 = r7
            r7 = r28
            r2.drawRect(r3, r4, r5, r6, r7)
            goto L_0x0147
        L_0x0144:
            r14 = r6
            r20 = r7
        L_0x0147:
            int r7 = r20 + r19
            if (r18 == 0) goto L_0x0151
            r9.c()
        L_0x014e:
            r2 = r7
            goto L_0x0015
        L_0x0151:
            r6 = r14
            r2 = r18
            r5 = 4
            r14 = 8
            goto L_0x00b0
        L_0x0159:
            r14 = r6
            r0 = r7
            if (r1 != r14) goto L_0x0166
            if (r11 != 0) goto L_0x0162
            byte[] r3 = X
            goto L_0x0163
        L_0x0162:
            r3 = r11
        L_0x0163:
            r17 = r3
            goto L_0x0171
        L_0x0166:
            if (r1 != r15) goto L_0x016f
            if (r13 != 0) goto L_0x016d
            byte[] r3 = z
            goto L_0x0163
        L_0x016d:
            r3 = r13
            goto L_0x0163
        L_0x016f:
            r17 = 0
        L_0x0171:
            r7 = r2
            r2 = r16
        L_0x0174:
            int r3 = r9.i(r15)
            if (r3 == 0) goto L_0x0183
            r19 = r0
            r18 = r2
        L_0x017e:
            r5 = 4
            r6 = 8
            goto L_0x01f1
        L_0x0183:
            boolean r3 = r9.h()
            if (r3 == 0) goto L_0x0198
            int r3 = r9.i(r14)
            int r3 = r3 + r14
            int r4 = r9.i(r15)
            r18 = r2
            r19 = r3
            r3 = r4
            goto L_0x017e
        L_0x0198:
            boolean r3 = r9.h()
            if (r3 == 0) goto L_0x01a5
            r19 = r0
            r18 = r2
            r3 = r16
            goto L_0x017e
        L_0x01a5:
            int r3 = r9.i(r15)
            if (r3 == 0) goto L_0x01e8
            if (r3 == r0) goto L_0x01de
            if (r3 == r15) goto L_0x01cb
            if (r3 == r14) goto L_0x01b8
            r18 = r2
            r3 = r16
            r19 = r3
            goto L_0x017e
        L_0x01b8:
            r6 = 8
            int r3 = r9.i(r6)
            int r3 = r3 + 29
            int r4 = r9.i(r15)
            r18 = r2
            r19 = r3
            r3 = r4
            r5 = 4
            goto L_0x01f1
        L_0x01cb:
            r5 = 4
            r6 = 8
            int r3 = r9.i(r5)
            int r3 = r3 + 12
            int r4 = r9.i(r15)
            r18 = r2
            r19 = r3
            r3 = r4
            goto L_0x01f1
        L_0x01de:
            r5 = 4
            r6 = 8
            r18 = r2
            r19 = r15
            r3 = r16
            goto L_0x01f1
        L_0x01e8:
            r5 = 4
            r6 = 8
            r18 = r0
            r3 = r16
            r19 = r3
        L_0x01f1:
            if (r19 == 0) goto L_0x0218
            if (r8 == 0) goto L_0x0218
            if (r17 == 0) goto L_0x01f9
            byte r3 = r17[r3]
        L_0x01f9:
            r2 = r24[r3]
            r8.setColor(r2)
            float r3 = (float) r7
            float r4 = (float) r10
            int r2 = r7 + r19
            float r2 = (float) r2
            int r0 = r10 + 1
            float r0 = (float) r0
            r21 = r2
            r2 = r29
            r22 = r5
            r5 = r21
            r21 = r6
            r6 = r0
            r0 = r7
            r7 = r28
            r2.drawRect(r3, r4, r5, r6, r7)
            goto L_0x021d
        L_0x0218:
            r22 = r5
            r21 = r6
            r0 = r7
        L_0x021d:
            int r7 = r0 + r19
            if (r18 == 0) goto L_0x0226
            r9.c()
            goto L_0x014e
        L_0x0226:
            r2 = r18
            r0 = 1
            goto L_0x0174
        L_0x022b:
            int r10 = r10 + 2
            r2 = r26
            goto L_0x0015
        L_0x0231:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ic3.u(byte[], int[], int, int, int, android.graphics.Paint, android.graphics.Canvas):void");
    }

    public static dy4 v(ky1 ky1, int i) {
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        ky1 ky12 = ky1;
        int i7 = 8;
        int i8 = ky12.i(8);
        ky12.t(8);
        int i9 = 2;
        int i10 = i - 2;
        int i11 = 0;
        int[] iArr = {0, -1, -16777216, -8421505};
        int[] k = k();
        int[] l = l();
        while (i10 > 0) {
            int i12 = ky12.i(i7);
            int i13 = ky12.i(i7);
            int[] iArr2 = (i13 & Uuid.SIZE_BITS) != 0 ? iArr : (i13 & 64) != 0 ? k : l;
            if ((i13 & 1) != 0) {
                i5 = ky12.i(i7);
                i4 = ky12.i(i7);
                i3 = ky12.i(i7);
                i2 = ky12.i(i7);
                i6 = i10 - 6;
            } else {
                i3 = ky12.i(4) << 4;
                i6 = i10 - 4;
                int i14 = ky12.i(4) << 4;
                i2 = ky12.i(i9) << 6;
                i5 = ky12.i(6) << i9;
                i4 = i14;
            }
            if (i5 == 0) {
                i4 = i11;
                i3 = i4;
                i2 = 255;
            }
            double d = (double) i5;
            double d2 = (double) (i4 - 128);
            double d3 = (double) (i3 - 128);
            iArr2[i12] = n((byte) (255 - (i2 & KotlinVersion.MAX_COMPONENT_VALUE)), t0g.j((int) ((1.402d * d2) + d), 0, KotlinVersion.MAX_COMPONENT_VALUE), t0g.j((int) ((d - (0.34414d * d3)) - (d2 * 0.71414d)), 0, KotlinVersion.MAX_COMPONENT_VALUE), t0g.j((int) ((d3 * 1.772d) + d), 0, KotlinVersion.MAX_COMPONENT_VALUE));
            i10 = i6;
            i11 = 0;
            i8 = i8;
            l = l;
            i7 = 8;
            i9 = 2;
        }
        return new dy4(i8, iArr, k, l);
    }

    public static gy4 w(ky1 ky1) {
        byte[] bArr;
        int i = ky1.i(16);
        ky1.t(4);
        int i2 = ky1.i(2);
        boolean h = ky1.h();
        ky1.t(1);
        byte[] bArr2 = t0g.f;
        if (i2 == 1) {
            ky1.t(ky1.i(8) * 16);
        } else if (i2 == 0) {
            int i3 = ky1.i(16);
            int i4 = ky1.i(16);
            if (i3 > 0) {
                bArr2 = new byte[i3];
                ky1.l(i3, bArr2);
            }
            if (i4 > 0) {
                bArr = new byte[i4];
                ky1.l(i4, bArr);
                return new gy4(i, h, bArr2, bArr);
            }
        }
        bArr = bArr2;
        return new gy4(i, h, bArr2, bArr);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0083, code lost:
        r5 = r9.y;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A(int r9) {
        /*
            r8 = this;
            java.lang.Object r0 = r8.a
            rj4 r0 = (defpackage.rj4) r0
            me8 r1 = r0.c
            if (r1 != 0) goto L_0x0009
            return
        L_0x0009:
            java.lang.Object r8 = r8.o
            java.util.List r8 = (java.util.List) r8
            java.util.Iterator r8 = r8.iterator()
            r2 = 0
        L_0x0012:
            boolean r3 = r8.hasNext()
            if (r3 == 0) goto L_0x0037
            java.lang.Object r3 = r8.next()
            npf r3 = (defpackage.npf) r3
            if (r2 != 0) goto L_0x0022
        L_0x0020:
            r2 = r3
            goto L_0x0012
        L_0x0022:
            mpf r4 = r3.a
            int r4 = r4.v
            int r4 = r4 - r9
            int r4 = java.lang.Math.abs(r4)
            mpf r5 = r2.a
            int r5 = r5.v
            int r5 = r5 - r9
            int r5 = java.lang.Math.abs(r5)
            if (r4 >= r5) goto L_0x0012
            goto L_0x0020
        L_0x0037:
            if (r2 != 0) goto L_0x003a
            return
        L_0x003a:
            java.lang.Object[] r8 = new java.lang.Object[]{r2}
            java.lang.String r9 = "ic3"
            java.lang.String r3 = "selectTrackWithHeight %s"
            defpackage.z68.c(r9, r3, r8)
            gj4 r8 = new gj4
            mpf r9 = r2.a
            int r3 = r9.y
            int r4 = r9.z
            int[] r5 = new int[]{r4}
            r6 = 0
            r8.<init>(r5, r3, r6)
            tpf[] r1 = r1.c
            int r3 = r9.x
            r5 = r1[r3]
            fj4 r7 = r0.b()
            r7.e(r3, r5, r8)
            r0.h(r7)
            java.util.List r8 = r2.b
            boolean r2 = r8.isEmpty()
            r2 = r2 ^ 1
            if (r2 == 0) goto L_0x00a0
            java.util.Iterator r8 = r8.iterator()
        L_0x0073:
            boolean r2 = r8.hasNext()
            if (r2 == 0) goto L_0x00a0
            java.lang.Object r2 = r8.next()
            mpf r2 = (defpackage.mpf) r2
            int r3 = r2.z
            if (r3 != r4) goto L_0x0073
            int r5 = r9.y
            int r7 = r2.y
            if (r7 != r5) goto L_0x0073
            gj4 r8 = new gj4
            int[] r9 = new int[]{r3}
            r8.<init>(r9, r7, r6)
            int r9 = r2.x
            r1 = r1[r9]
            fj4 r2 = r0.b()
            r2.e(r9, r1, r8)
            r0.h(r2)
        L_0x00a0:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ic3.A(int):void");
    }

    public synchronized m9c e(pac pac) {
        ms7 ms7 = (ms7) ((HashMap) this.c).get(pac);
        if (ms7 != null) {
            return ms7;
        }
        return y;
    }

    public synchronized m9c f(pac pac) {
        q8.c(pac, "Null interface requested.");
        return (m9c) ((HashMap) this.b).get(pac);
    }

    public nla h() {
        cf3 cf3 = (cf3) this.a;
        bmf bmf = (bmf) this.b;
        pm pmVar = (pm) this.x;
        tm tmVar = (tm) this.w;
        o21 o21 = (o21) this.v;
        if (pmVar != null && tmVar != null && o21 != null) {
            return new lh4(this, pmVar, tmVar, o21);
        }
        if (cf3 != null && bmf != null) {
            return new lh4(this, cf3, bmf);
        }
        throw new IllegalArgumentException("You must either provide configurationStore and tokenProvider, either sessionStore, tokenInfoProvider and appKeyProvider");
    }

    public void j(Map map, boolean z2) {
        ArrayDeque arrayDeque;
        for (Map.Entry entry : map.entrySet()) {
            m9c m9c = (m9c) entry.getValue();
            int i = ((mb3) entry.getKey()).d;
            if (i == 1 || (i == 2 && z2)) {
                m9c.get();
            }
        }
        r85 r85 = (r85) this.v;
        synchronized (r85) {
            arrayDeque = r85.b;
            if (arrayDeque != null) {
                r85.b = null;
            } else {
                arrayDeque = null;
            }
        }
        if (arrayDeque != null) {
            Iterator it = arrayDeque.iterator();
            if (it.hasNext()) {
                rae.w(it.next());
                throw null;
            }
        }
    }

    public boolean m(int i) {
        return q(i) != null;
    }

    public i65 o(int i) {
        return q(i);
    }

    public npf p() {
        rj4 rj4 = (rj4) this.a;
        me8 me8 = rj4.c;
        if (me8 == null) {
            return npf.c;
        }
        int intValue = ((Integer) r(me8).first).intValue();
        gj4 a2 = ((dj4) rj4.e.get()).a(intValue, me8.c[intValue]);
        if (a2 == null) {
            return npf.c;
        }
        for (npf npf : (List) this.o) {
            mpf mpf = npf.a;
            if (mpf.x == intValue && mpf.y == a2.a && mpf.z == a2.b[0]) {
                return npf;
            }
        }
        return npf.c;
    }

    public i65 q(int i) {
        yb0 yb0;
        ra0 ra0;
        Object obj;
        xw1 xw1;
        ic3 ic3 = this;
        int i2 = i;
        HashMap hashMap = (HashMap) ic3.a;
        if (hashMap.containsKey(Integer.valueOf(i))) {
            return (i65) hashMap.get(Integer.valueOf(i));
        }
        h65 h65 = (h65) ic3.c;
        i65 o2 = h65.o(i2);
        HashSet hashSet = (HashSet) ic3.o;
        Iterator it = hashSet.iterator();
        while (true) {
            if (!it.hasNext()) {
                yb0 = null;
                break;
            }
            yb0 = (yb0) it.next();
            if (yb0.a == i2) {
                break;
            }
        }
        if (yb0 != null) {
            HashSet hashSet2 = (HashSet) ic3.w;
            if (o2 != null) {
                Iterator it2 = hashSet2.iterator();
                loop1:
                while (true) {
                    if (!it2.hasNext()) {
                        break;
                    }
                    vy4 vy4 = (vy4) it2.next();
                    Iterator it3 = o2.d().iterator();
                    while (true) {
                        if (!it3.hasNext()) {
                            break loop1;
                        } else if (yy4.a((sa0) it3.next(), vy4)) {
                        }
                    }
                }
            }
            bs0.n(hashSet.contains(yb0));
            i65 o3 = h65.o(yb0.a);
            Iterator it4 = yb0.c.iterator();
            while (true) {
                if (!it4.hasNext()) {
                    ra0 = null;
                    break;
                }
                Size size = (Size) it4.next();
                if (((HashSet) ic3.v).contains(size)) {
                    TreeMap treeMap = new TreeMap(new v93(false));
                    ArrayList arrayList = new ArrayList();
                    Iterator it5 = hashSet2.iterator();
                    while (it5.hasNext()) {
                        vy4 vy42 = (vy4) it5.next();
                        if (o3 != null) {
                            Iterator it6 = o3.d().iterator();
                            while (true) {
                                if (it6.hasNext()) {
                                    if (yy4.a((sa0) it6.next(), vy42)) {
                                        break;
                                    }
                                } else {
                                    break;
                                }
                            }
                        }
                        HashMap hashMap2 = (HashMap) ic3.b;
                        if (hashMap2.containsKey(vy42)) {
                            xw1 = (xw1) hashMap2.get(vy42);
                            Objects.requireNonNull(xw1);
                        } else {
                            xw1 xw12 = new xw1(new d19(h65, vy42));
                            hashMap2.put(vy42, xw12);
                            xw1 = xw12;
                        }
                        zc0 a2 = xw1.a(size);
                        if (a2 != null) {
                            sa0 sa0 = a2.f;
                            a5g a5g = (a5g) ((bj6) ic3.x).apply(e4g.d(sa0));
                            if (a5g != null) {
                                if (!a5g.B0(size.getWidth(), size.getHeight())) {
                                    ic3 = this;
                                } else {
                                    treeMap.put(new Size(sa0.e, sa0.f), a2);
                                    arrayList.add(n79.y(sa0, size, a5g.E0()));
                                }
                            }
                            ic3 = this;
                            int i3 = i;
                        }
                    }
                    if (!arrayList.isEmpty()) {
                        Size size2 = pde.a;
                        Map.Entry ceilingEntry = treeMap.ceilingEntry(size);
                        if (ceilingEntry != null) {
                            obj = ceilingEntry.getValue();
                        } else {
                            Map.Entry floorEntry = treeMap.floorEntry(size);
                            obj = floorEntry != null ? floorEntry.getValue() : null;
                        }
                        i65 i65 = (i65) obj;
                        Objects.requireNonNull(i65);
                        ra0 = ra0.e(i65.a(), i65.b(), i65.c(), arrayList);
                    } else {
                        ic3 = this;
                        int i4 = i;
                    }
                }
            }
            if (o2 == null && ra0 == null) {
                o2 = null;
            } else {
                int a3 = o2 != null ? o2.a() : ra0.a;
                int b2 = o2 != null ? o2.b() : ra0.b;
                List c2 = o2 != null ? o2.c() : ra0.c;
                ArrayList arrayList2 = new ArrayList();
                if (o2 != null) {
                    arrayList2.addAll(o2.d());
                }
                if (ra0 != null) {
                    arrayList2.addAll(ra0.d);
                }
                o2 = ra0.e(a3, b2, c2, arrayList2);
            }
        }
        hashMap.put(Integer.valueOf(i), o2);
        return o2;
    }

    public Pair r(me8 me8) {
        int i = -1;
        int i2 = -1;
        for (int i3 = 0; i3 < me8.a; i3++) {
            if (me8.c[i3].a != 0) {
                zae zae = (zae) this.b;
                zae.n1();
                sc5 sc5 = zae.b;
                sc5.G1();
                int i4 = sc5.x[i3].a;
                if (i4 == 1) {
                    i2 = i3;
                } else if (i4 == 2) {
                    i = i3;
                }
            }
        }
        return new Pair(Integer.valueOf(i), Integer.valueOf(i2));
    }

    public boolean s() {
        int i;
        int i2;
        me8 me8;
        int intValue;
        List list;
        if (((f4g) this.c) == null) {
            return false;
        }
        rj4 rj4 = (rj4) this.a;
        me8 me82 = rj4.c;
        ArrayList arrayList = null;
        if (me82 != null) {
            Pair r = r(me82);
            int intValue2 = ((Integer) r.first).intValue();
            int intValue3 = ((Integer) r.second).intValue();
            if (intValue2 >= 0) {
                tpf[] tpfArr = me82.c;
                ArrayList t = t(intValue2, tpfArr[intValue2]);
                ArrayList<mpf> t2 = intValue3 > 0 ? t(intValue3, tpfArr[intValue3]) : null;
                ArrayList arrayList2 = new ArrayList(t.size());
                for (int i3 = 0; i3 < t.size(); i3++) {
                    mpf mpf = (mpf) t.get(i3);
                    int i4 = mpf.z;
                    if (t2 == null) {
                        list = Collections.emptyList();
                    } else {
                        ArrayList arrayList3 = new ArrayList();
                        for (mpf mpf2 : t2) {
                            if (mpf2.z == i4) {
                                arrayList3.add(mpf2);
                            }
                        }
                        list = arrayList3;
                    }
                    arrayList2.add(new npf(mpf, list));
                    if ((((f4g) this.c) instanceof k27) && mpf.v == 0) {
                        ys7 ys7 = (ys7) this.w;
                        if (ys7.get() != null) {
                            ((nd) ys7.get()).e("HLS_WITHOUT_HEIGHT");
                        }
                    }
                }
                if (!arrayList2.isEmpty()) {
                    arrayList = arrayList2;
                }
            }
        }
        if (arrayList == null) {
            this.o = Collections.emptyList();
            return false;
        }
        this.o = arrayList;
        int i5 = ((a33) this.v).g.getInt("app.video.play.quality", -1);
        if (i5 > 0) {
            A(i5);
        }
        f4g f4g = (f4g) this.c;
        if (f4g == null) {
            return true;
        }
        ol0 ol0 = (ol0) f4g;
        if (ol0.b <= 0 || (i = ol0.h) == -1 || (i2 = ol0.i) == -1 || (me8 = rj4.c) == null || (intValue = ((Integer) r(me8).second).intValue()) < 0) {
            return true;
        }
        gj4 gj4 = new gj4(new int[]{i}, i2, 0);
        tpf tpf = me8.c[intValue];
        fj4 b2 = rj4.b();
        b2.e(intValue, tpf, gj4);
        rj4.h(b2);
        return true;
    }

    public ArrayList t(int i, tpf tpf) {
        int i2;
        ArrayList arrayList;
        tpf tpf2 = tpf;
        ArrayList arrayList2 = new ArrayList();
        for (int i3 = 0; i3 < tpf2.a; i3++) {
            rpf a2 = tpf2.a(i3);
            int i4 = 0;
            while (i4 < a2.a) {
                ca6 ca6 = a2.c[i4];
                ebf ebf = (ebf) this.x;
                ebf.getClass();
                if (uq9.g(ca6.Z) == 1) {
                    arrayList = new ArrayList();
                    for (Object next : ebf.c) {
                        if (next instanceof kn8) {
                            arrayList.add(next);
                        }
                    }
                } else {
                    if (uq9.g(ca6.Z) == 2) {
                        arrayList = new ArrayList();
                        for (Object next2 : ebf.d) {
                            if (next2 instanceof io8) {
                                arrayList.add(next2);
                            }
                        }
                    }
                    mpf mpf = r4;
                    i2 = i4;
                    mpf mpf2 = new mpf(ca6.a, ca6.b, ca6.c, ca6.z0, ca6.A0, ca6.y, i, i3, i4);
                    arrayList2.add(mpf);
                    i4 = i2 + 1;
                }
                if (!arrayList.isEmpty()) {
                    Iterator it = arrayList.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            z68.c("ic3", "mapTracks: Skip format %s", ca6);
                            i2 = i4;
                            break;
                        }
                        try {
                            if ((((vn8) it.next()).A(ca6) & 7) == 4) {
                                break;
                            }
                        } catch (ExoPlaybackException unused) {
                        }
                    }
                    i4 = i2 + 1;
                }
                mpf mpf3 = mpf2;
                i2 = i4;
                mpf mpf22 = new mpf(ca6.a, ca6.b, ca6.c, ca6.z0, ca6.A0, ca6.y, i, i3, i4);
                arrayList2.add(mpf3);
                i4 = i2 + 1;
            }
        }
        Collections.sort(arrayList2, new baf(1));
        return arrayList2;
    }

    /* JADX WARNING: type inference failed for: r5v1, types: [java.lang.Object, a5b] */
    /* JADX WARNING: type inference failed for: r6v4, types: [ms7, java.lang.Object] */
    public void x() {
        for (mb3 mb3 : ((HashMap) this.a).keySet()) {
            Iterator it = mb3.c.iterator();
            while (true) {
                if (it.hasNext()) {
                    bm4 bm4 = (bm4) it.next();
                    if (bm4.b == 2 && !((HashMap) this.c).containsKey(bm4.a)) {
                        pac pac = bm4.a;
                        Set emptySet = Collections.emptySet();
                        ? obj = new Object();
                        obj.b = null;
                        obj.a = Collections.newSetFromMap(new ConcurrentHashMap());
                        obj.a.addAll(emptySet);
                        ((HashMap) this.c).put(pac, obj);
                    } else if (((HashMap) this.b).containsKey(bm4.a)) {
                        continue;
                    } else {
                        int i = bm4.b;
                        if (i == 1) {
                            pac pac2 = bm4.a;
                            throw new RuntimeException("Unsatisfied dependency for component " + mb3 + ": " + pac2);
                        } else if (i != 2) {
                            pac pac3 = bm4.a;
                            ts1 ts1 = a5b.c;
                            gc3 gc3 = a5b.d;
                            ? obj2 = new Object();
                            obj2.a = ts1;
                            obj2.b = gc3;
                            ((HashMap) this.b).put(pac3, obj2);
                        }
                    }
                }
            }
        }
    }

    public ArrayList y(ArrayList arrayList) {
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            mb3 mb3 = (mb3) it.next();
            if (mb3.e == 0) {
                m9c m9c = (m9c) ((HashMap) this.a).get(mb3);
                for (pac pac : mb3.b) {
                    HashMap hashMap = (HashMap) this.b;
                    if (!hashMap.containsKey(pac)) {
                        hashMap.put(pac, m9c);
                    } else {
                        arrayList2.add(new ir1(11, (a5b) ((m9c) hashMap.get(pac)), m9c));
                    }
                }
            }
        }
        return arrayList2;
    }

    /* JADX WARNING: type inference failed for: r5v1, types: [ms7, java.lang.Object] */
    public ArrayList z() {
        ArrayList arrayList = new ArrayList();
        HashMap hashMap = new HashMap();
        for (Map.Entry entry : ((HashMap) this.a).entrySet()) {
            mb3 mb3 = (mb3) entry.getKey();
            if (mb3.e != 0) {
                m9c m9c = (m9c) entry.getValue();
                for (pac pac : mb3.b) {
                    if (!hashMap.containsKey(pac)) {
                        hashMap.put(pac, new HashSet());
                    }
                    ((Set) hashMap.get(pac)).add(m9c);
                }
            }
        }
        for (Map.Entry entry2 : hashMap.entrySet()) {
            Object key = entry2.getKey();
            HashMap hashMap2 = (HashMap) this.c;
            if (!hashMap2.containsKey(key)) {
                ? obj = new Object();
                obj.b = null;
                obj.a = Collections.newSetFromMap(new ConcurrentHashMap());
                obj.a.addAll((Set) ((Collection) entry2.getValue()));
                hashMap2.put((pac) entry2.getKey(), obj);
            } else {
                ms7 ms7 = (ms7) hashMap2.get(entry2.getKey());
                for (m9c ir1 : (Set) entry2.getValue()) {
                    arrayList.add(new ir1(12, ms7, ir1));
                }
            }
        }
        return arrayList;
    }
}
