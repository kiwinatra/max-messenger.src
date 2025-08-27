package defpackage;

import java.util.Arrays;
import kotlin.KotlinVersion;
import org.apache.http.HttpStatus;

/* renamed from: tfe  reason: default package */
public final class tfe {
    public final /* synthetic */ int a;
    public final int b;
    public final int c;
    public final float d;
    public final float e;
    public final float f;
    public final int g;
    public final int h;
    public final int i;
    public final short[] j;
    public short[] k;
    public int l;
    public short[] m;
    public int n;
    public short[] o;
    public int p;
    public int q;
    public int r;
    public int s;
    public int t;
    public int u;
    public int v;
    public int w;

    public tfe(int i2, int i3, float f2, float f3, int i4, int i5) {
        this.a = i5;
        switch (i5) {
            case 1:
                this.b = i2;
                this.c = i3;
                this.d = f2;
                this.e = f3;
                this.f = ((float) i2) / ((float) i4);
                this.g = i2 / HttpStatus.SC_BAD_REQUEST;
                int i6 = i2 / 65;
                this.h = i6;
                int i7 = i6 * 2;
                this.i = i7;
                this.j = new short[i7];
                this.k = new short[(i7 * i3)];
                this.m = new short[(i7 * i3)];
                this.o = new short[(i7 * i3)];
                return;
            default:
                this.b = i2;
                this.c = i3;
                this.d = f2;
                this.e = f3;
                this.f = ((float) i2) / ((float) i4);
                this.g = i2 / HttpStatus.SC_BAD_REQUEST;
                int i8 = i2 / 65;
                this.h = i8;
                int i9 = i8 * 2;
                this.i = i9;
                this.j = new short[i9];
                this.k = new short[(i9 * i3)];
                this.m = new short[(i9 * i3)];
                this.o = new short[(i9 * i3)];
                return;
        }
    }

    public static void e(int i2, int i3, short[] sArr, int i4, short[] sArr2, int i5, short[] sArr3, int i6) {
        for (int i7 = 0; i7 < i3; i7++) {
            int i8 = (i4 * i3) + i7;
            int i9 = (i6 * i3) + i7;
            int i10 = (i5 * i3) + i7;
            for (int i11 = 0; i11 < i2; i11++) {
                sArr[i8] = (short) (((sArr3[i9] * i11) + ((i2 - i11) * sArr2[i10])) / i2);
                i8 += i3;
                i10 += i3;
                i9 += i3;
            }
        }
    }

    public static void f(int i2, int i3, short[] sArr, int i4, short[] sArr2, int i5, short[] sArr3, int i6) {
        for (int i7 = 0; i7 < i3; i7++) {
            int i8 = (i4 * i3) + i7;
            int i9 = (i6 * i3) + i7;
            int i10 = (i5 * i3) + i7;
            for (int i11 = 0; i11 < i2; i11++) {
                sArr[i8] = (short) (((sArr3[i9] * i11) + ((i2 - i11) * sArr2[i10])) / i2);
                i8 += i3;
                i10 += i3;
                i9 += i3;
            }
        }
    }

    public final void a(short[] sArr, int i2, int i3) {
        switch (this.a) {
            case 0:
                short[] c2 = c(this.m, this.n, i3);
                this.m = c2;
                int i4 = this.c;
                System.arraycopy(sArr, i2 * i4, c2, this.n * i4, i4 * i3);
                this.n += i3;
                return;
            default:
                short[] c3 = c(this.m, this.n, i3);
                this.m = c3;
                int i5 = this.c;
                System.arraycopy(sArr, i2 * i5, c3, this.n * i5, i5 * i3);
                this.n += i3;
                return;
        }
    }

    public final void b(short[] sArr, int i2, int i3) {
        switch (this.a) {
            case 0:
                int i4 = this.i / i3;
                int i5 = this.c;
                int i6 = i3 * i5;
                int i7 = i2 * i5;
                for (int i8 = 0; i8 < i4; i8++) {
                    int i9 = 0;
                    for (int i10 = 0; i10 < i6; i10++) {
                        i9 += sArr[(i8 * i6) + i7 + i10];
                    }
                    this.j[i8] = (short) (i9 / i6);
                }
                return;
            default:
                int i11 = this.i / i3;
                int i12 = this.c;
                int i13 = i3 * i12;
                int i14 = i2 * i12;
                for (int i15 = 0; i15 < i11; i15++) {
                    int i16 = 0;
                    for (int i17 = 0; i17 < i13; i17++) {
                        i16 += sArr[(i15 * i13) + i14 + i17];
                    }
                    this.j[i15] = (short) (i16 / i13);
                }
                return;
        }
    }

    public final short[] c(short[] sArr, int i2, int i3) {
        switch (this.a) {
            case 0:
                int length = sArr.length;
                int i4 = this.c;
                int i5 = length / i4;
                return i2 + i3 <= i5 ? sArr : Arrays.copyOf(sArr, (((i5 * 3) / 2) + i3) * i4);
            default:
                int length2 = sArr.length;
                int i6 = this.c;
                int i7 = length2 / i6;
                return i2 + i3 <= i7 ? sArr : Arrays.copyOf(sArr, (((i7 * 3) / 2) + i3) * i6);
        }
    }

    public final int d(short[] sArr, int i2, int i3, int i4) {
        switch (this.a) {
            case 0:
                int i5 = i2 * this.c;
                int i6 = KotlinVersion.MAX_COMPONENT_VALUE;
                int i7 = 1;
                int i8 = 0;
                int i9 = 0;
                while (i3 <= i4) {
                    int i10 = 0;
                    for (int i11 = 0; i11 < i3; i11++) {
                        i10 += Math.abs(sArr[i5 + i11] - sArr[(i5 + i3) + i11]);
                    }
                    if (i10 * i8 < i7 * i3) {
                        i8 = i3;
                        i7 = i10;
                    }
                    if (i10 * i6 > i9 * i3) {
                        i6 = i3;
                        i9 = i10;
                    }
                    i3++;
                }
                this.v = i7 / i8;
                this.w = i9 / i6;
                return i8;
            default:
                int i12 = i2 * this.c;
                int i13 = KotlinVersion.MAX_COMPONENT_VALUE;
                int i14 = 1;
                int i15 = 0;
                int i16 = 0;
                while (i3 <= i4) {
                    int i17 = 0;
                    for (int i18 = 0; i18 < i3; i18++) {
                        i17 += Math.abs(sArr[i12 + i18] - sArr[(i12 + i3) + i18]);
                    }
                    if (i17 * i15 < i14 * i3) {
                        i15 = i3;
                        i14 = i17;
                    }
                    if (i17 * i13 > i16 * i3) {
                        i13 = i3;
                        i16 = i17;
                    }
                    i3++;
                }
                this.v = i14 / i15;
                this.w = i16 / i13;
                return i15;
        }
    }

    /*  JADX ERROR: JadxRuntimeException in pass: IfRegionVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Don't wrap MOVE or CONST insns: 0x0188: MOVE  (r4v71 int) = (r23v12 int)
        	at jadx.core.dex.instructions.args.InsnArg.wrapArg(InsnArg.java:164)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.assignInline(CodeShrinkVisitor.java:133)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.checkInline(CodeShrinkVisitor.java:118)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.shrinkBlock(CodeShrinkVisitor.java:65)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.shrinkMethod(CodeShrinkVisitor.java:43)
        	at jadx.core.dex.visitors.regions.TernaryMod.makeTernaryInsn(TernaryMod.java:122)
        	at jadx.core.dex.visitors.regions.TernaryMod.visitRegion(TernaryMod.java:34)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:73)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:78)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:78)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:78)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:78)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:78)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:78)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:78)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:78)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:78)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:78)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:78)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterative(DepthRegionTraversal.java:27)
        	at jadx.core.dex.visitors.regions.IfRegionVisitor.visit(IfRegionVisitor.java:31)
        */
    /* JADX WARNING: Removed duplicated region for block: B:150:0x03d6  */
    /* JADX WARNING: Removed duplicated region for block: B:192:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:196:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x018e  */
    public final void g() {
        /*
            r25 = this;
            r0 = r25
            int r1 = r0.a
            switch(r1) {
                case 0: goto L_0x024f;
                default: goto L_0x0007;
            }
        L_0x0007:
            int r1 = r0.n
            float r2 = r0.d
            float r3 = r0.e
            float r2 = r2 / r3
            float r4 = r0.f
            float r4 = r4 * r3
            double r5 = (double) r2
            r7 = 4607182463836013682(0x3ff0000a7c5ac472, double:1.00001)
            int r3 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            int r8 = r0.b
            int r9 = r0.c
            r10 = 0
            r11 = 1
            if (r3 > 0) goto L_0x003e
            r12 = 4607182328728024861(0x3fefffeb074a771d, double:0.99999)
            int r3 = (r5 > r12 ? 1 : (r5 == r12 ? 0 : -1))
            if (r3 >= 0) goto L_0x002b
            goto L_0x003e
        L_0x002b:
            short[] r2 = r0.k
            int r3 = r0.l
            r0.a(r2, r10, r3)
            r0.l = r10
        L_0x0034:
            r23 = r1
            r24 = r4
            r22 = r8
        L_0x003a:
            r1 = 1065353216(0x3f800000, float:1.0)
            goto L_0x0182
        L_0x003e:
            int r3 = r0.l
            int r12 = r0.i
            if (r3 >= r12) goto L_0x0045
            goto L_0x0034
        L_0x0045:
            r15 = r10
        L_0x0046:
            int r13 = r0.s
            if (r13 <= 0) goto L_0x0061
            int r13 = java.lang.Math.min(r12, r13)
            short[] r14 = r0.k
            r0.a(r14, r15, r13)
            int r14 = r0.s
            int r14 = r14 - r13
            r0.s = r14
            int r15 = r15 + r13
            r23 = r1
            r24 = r4
            r22 = r8
            goto L_0x016e
        L_0x0061:
            short[] r13 = r0.k
            r14 = 4000(0xfa0, float:5.605E-42)
            if (r8 <= r14) goto L_0x006a
            int r14 = r8 / 4000
            goto L_0x006b
        L_0x006a:
            r14 = r11
        L_0x006b:
            int r7 = r0.h
            int r10 = r0.g
            if (r9 != r11) goto L_0x007e
            if (r14 != r11) goto L_0x007e
            int r7 = r0.d(r13, r15, r10, r7)
            r23 = r1
            r24 = r4
            r22 = r8
            goto L_0x00b6
        L_0x007e:
            r0.b(r13, r15, r14)
            int r11 = r10 / r14
            r22 = r8
            int r8 = r7 / r14
            r23 = r1
            short[] r1 = r0.j
            r24 = r4
            r4 = 0
            int r8 = r0.d(r1, r4, r11, r8)
            r4 = 1
            if (r14 == r4) goto L_0x00b5
            int r8 = r8 * r14
            int r14 = r14 * 4
            int r4 = r8 - r14
            int r8 = r8 + r14
            if (r4 >= r10) goto L_0x009e
            goto L_0x009f
        L_0x009e:
            r10 = r4
        L_0x009f:
            if (r8 <= r7) goto L_0x00a3
        L_0x00a1:
            r4 = 1
            goto L_0x00a5
        L_0x00a3:
            r7 = r8
            goto L_0x00a1
        L_0x00a5:
            if (r9 != r4) goto L_0x00ac
            int r7 = r0.d(r13, r15, r10, r7)
            goto L_0x00b6
        L_0x00ac:
            r0.b(r13, r15, r4)
            r4 = 0
            int r7 = r0.d(r1, r4, r10, r7)
            goto L_0x00b6
        L_0x00b5:
            r7 = r8
        L_0x00b6:
            int r1 = r0.v
            int r4 = r0.w
            if (r1 == 0) goto L_0x00ce
            int r8 = r0.t
            if (r8 != 0) goto L_0x00c1
            goto L_0x00ce
        L_0x00c1:
            int r10 = r1 * 3
            if (r4 <= r10) goto L_0x00c6
            goto L_0x00ce
        L_0x00c6:
            int r4 = r1 * 2
            int r10 = r0.u
            int r10 = r10 * 3
            if (r4 > r10) goto L_0x00cf
        L_0x00ce:
            r8 = r7
        L_0x00cf:
            r0.u = r1
            r0.t = r7
            r10 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            int r1 = (r5 > r10 ? 1 : (r5 == r10 ? 0 : -1))
            r4 = 1073741824(0x40000000, float:2.0)
            if (r1 <= 0) goto L_0x011c
            short[] r1 = r0.k
            int r7 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r7 < 0) goto L_0x00e9
            float r4 = (float) r8
            r7 = 1065353216(0x3f800000, float:1.0)
            float r10 = r2 - r7
            float r4 = r4 / r10
            int r4 = (int) r4
            goto L_0x00f5
        L_0x00e9:
            r7 = 1065353216(0x3f800000, float:1.0)
            float r10 = (float) r8
            float r4 = r4 - r2
            float r4 = r4 * r10
            float r10 = r2 - r7
            float r4 = r4 / r10
            int r4 = (int) r4
            r0.s = r4
            r4 = r8
        L_0x00f5:
            short[] r7 = r0.m
            int r10 = r0.n
            short[] r7 = r0.c(r7, r10, r4)
            r0.m = r7
            int r10 = r0.n
            int r20 = r15 + r8
            int r14 = r0.c
            r13 = r4
            r11 = r15
            r15 = r7
            r16 = r10
            r17 = r1
            r18 = r11
            r19 = r1
            f(r13, r14, r15, r16, r17, r18, r19, r20)
            int r1 = r0.n
            int r1 = r1 + r4
            r0.n = r1
            int r8 = r8 + r4
            int r8 = r8 + r11
            r15 = r8
            goto L_0x016e
        L_0x011c:
            r11 = r15
            short[] r1 = r0.k
            r7 = 1056964608(0x3f000000, float:0.5)
            int r7 = (r2 > r7 ? 1 : (r2 == r7 ? 0 : -1))
            if (r7 >= 0) goto L_0x012e
            float r4 = (float) r8
            float r4 = r4 * r2
            r7 = 1065353216(0x3f800000, float:1.0)
            float r10 = r7 - r2
            float r4 = r4 / r10
            int r4 = (int) r4
            goto L_0x013b
        L_0x012e:
            r7 = 1065353216(0x3f800000, float:1.0)
            float r10 = (float) r8
            float r4 = r4 * r2
            float r4 = r4 - r7
            float r4 = r4 * r10
            float r10 = r7 - r2
            float r4 = r4 / r10
            int r4 = (int) r4
            r0.s = r4
            r4 = r8
        L_0x013b:
            short[] r7 = r0.m
            int r10 = r0.n
            int r15 = r8 + r4
            short[] r7 = r0.c(r7, r10, r15)
            r0.m = r7
            int r10 = r11 * r9
            int r13 = r0.n
            int r13 = r13 * r9
            int r14 = r8 * r9
            java.lang.System.arraycopy(r1, r10, r7, r13, r14)
            short[] r7 = r0.m
            int r10 = r0.n
            int r16 = r10 + r8
            int r18 = r11 + r8
            int r14 = r0.c
            r13 = r4
            r8 = r15
            r15 = r7
            r17 = r1
            r19 = r1
            r20 = r11
            f(r13, r14, r15, r16, r17, r18, r19, r20)
            int r1 = r0.n
            int r1 = r1 + r8
            r0.n = r1
            int r15 = r11 + r4
        L_0x016e:
            int r1 = r15 + r12
            if (r1 <= r3) goto L_0x0245
            int r1 = r0.l
            int r1 = r1 - r15
            short[] r2 = r0.k
            int r15 = r15 * r9
            int r3 = r1 * r9
            r4 = 0
            java.lang.System.arraycopy(r2, r15, r2, r4, r3)
            r0.l = r1
            goto L_0x003a
        L_0x0182:
            int r1 = (r24 > r1 ? 1 : (r24 == r1 ? 0 : -1))
            if (r1 == 0) goto L_0x0244
            int r1 = r0.n
            r4 = r23
            if (r1 != r4) goto L_0x018e
            goto L_0x0244
        L_0x018e:
            r7 = r22
            float r1 = (float) r7
            float r1 = r1 / r24
            int r1 = (int) r1
            r8 = r7
        L_0x0195:
            r2 = 16384(0x4000, float:2.2959E-41)
            if (r1 > r2) goto L_0x019b
            if (r8 <= r2) goto L_0x019f
        L_0x019b:
            r10 = 1
            r11 = 0
            goto L_0x023e
        L_0x019f:
            int r2 = r0.n
            int r2 = r2 - r4
            short[] r3 = r0.o
            int r5 = r0.p
            short[] r3 = r0.c(r3, r5, r2)
            r0.o = r3
            short[] r5 = r0.m
            int r6 = r4 * r9
            int r7 = r0.p
            int r7 = r7 * r9
            int r10 = r2 * r9
            java.lang.System.arraycopy(r5, r6, r3, r7, r10)
            r0.n = r4
            int r3 = r0.p
            int r3 = r3 + r2
            r0.p = r3
            r4 = 0
        L_0x01c0:
            int r2 = r0.p
            int r3 = r2 + -1
            if (r4 >= r3) goto L_0x022b
        L_0x01c6:
            int r2 = r0.q
            r3 = 1
            int r2 = r2 + r3
            int r5 = r2 * r1
            int r6 = r0.r
            int r7 = r6 * r8
            if (r5 <= r7) goto L_0x0214
            short[] r2 = r0.m
            int r5 = r0.n
            short[] r2 = r0.c(r2, r5, r3)
            r0.m = r2
            r2 = 0
        L_0x01dd:
            if (r2 >= r9) goto L_0x0208
            short[] r3 = r0.m
            int r5 = r0.n
            int r5 = r5 * r9
            int r5 = r5 + r2
            short[] r6 = r0.o
            int r7 = r4 * r9
            int r7 = r7 + r2
            short r10 = r6[r7]
            int r7 = r7 + r9
            short r6 = r6[r7]
            int r7 = r0.r
            int r7 = r7 * r8
            int r11 = r0.q
            int r12 = r11 * r1
            r13 = 1
            int r11 = r11 + r13
            int r11 = r11 * r1
            int r7 = r11 - r7
            int r11 = r11 - r12
            int r10 = r10 * r7
            int r7 = r11 - r7
            int r7 = r7 * r6
            int r7 = r7 + r10
            int r7 = r7 / r11
            short r6 = (short) r7
            r3[r5] = r6
            int r2 = r2 + 1
            goto L_0x01dd
        L_0x0208:
            int r2 = r0.r
            r10 = 1
            int r2 = r2 + r10
            r0.r = r2
            int r2 = r0.n
            int r2 = r2 + r10
            r0.n = r2
            goto L_0x01c6
        L_0x0214:
            r10 = r3
            r0.q = r2
            if (r2 != r8) goto L_0x0228
            r2 = 0
            r0.q = r2
            if (r6 != r1) goto L_0x0221
            r21 = r10
            goto L_0x0223
        L_0x0221:
            r21 = r2
        L_0x0223:
            defpackage.n79.n(r21)
            r0.r = r2
        L_0x0228:
            int r4 = r4 + 1
            goto L_0x01c0
        L_0x022b:
            if (r3 != 0) goto L_0x022e
            goto L_0x0244
        L_0x022e:
            short[] r1 = r0.o
            int r4 = r3 * r9
            int r2 = r2 - r3
            int r2 = r2 * r9
            r11 = 0
            java.lang.System.arraycopy(r1, r4, r1, r11, r2)
            int r1 = r0.p
            int r1 = r1 - r3
            r0.p = r1
            goto L_0x0244
        L_0x023e:
            int r1 = r1 / 2
            int r8 = r8 / 2
            goto L_0x0195
        L_0x0244:
            return
        L_0x0245:
            r8 = r22
            r1 = r23
            r4 = r24
            r10 = 0
            r11 = 1
            goto L_0x0046
        L_0x024f:
            int r1 = r0.n
            float r2 = r0.d
            float r3 = r0.e
            float r2 = r2 / r3
            float r4 = r0.f
            float r4 = r4 * r3
            double r5 = (double) r2
            r7 = 4607182463836013682(0x3ff0000a7c5ac472, double:1.00001)
            int r3 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            int r8 = r0.b
            int r9 = r0.c
            r10 = 0
            r11 = 1
            if (r3 > 0) goto L_0x0286
            r12 = 4607182328728024861(0x3fefffeb074a771d, double:0.99999)
            int r3 = (r5 > r12 ? 1 : (r5 == r12 ? 0 : -1))
            if (r3 >= 0) goto L_0x0273
            goto L_0x0286
        L_0x0273:
            short[] r2 = r0.k
            int r3 = r0.l
            r0.a(r2, r10, r3)
            r0.l = r10
        L_0x027c:
            r23 = r1
            r24 = r4
            r22 = r8
        L_0x0282:
            r1 = 1065353216(0x3f800000, float:1.0)
            goto L_0x03ca
        L_0x0286:
            int r3 = r0.l
            int r12 = r0.i
            if (r3 >= r12) goto L_0x028d
            goto L_0x027c
        L_0x028d:
            r15 = r10
        L_0x028e:
            int r13 = r0.s
            if (r13 <= 0) goto L_0x02a9
            int r13 = java.lang.Math.min(r12, r13)
            short[] r14 = r0.k
            r0.a(r14, r15, r13)
            int r14 = r0.s
            int r14 = r14 - r13
            r0.s = r14
            int r15 = r15 + r13
            r23 = r1
            r24 = r4
            r22 = r8
            goto L_0x03b6
        L_0x02a9:
            short[] r13 = r0.k
            r14 = 4000(0xfa0, float:5.605E-42)
            if (r8 <= r14) goto L_0x02b2
            int r14 = r8 / 4000
            goto L_0x02b3
        L_0x02b2:
            r14 = r11
        L_0x02b3:
            int r7 = r0.h
            int r10 = r0.g
            if (r9 != r11) goto L_0x02c6
            if (r14 != r11) goto L_0x02c6
            int r7 = r0.d(r13, r15, r10, r7)
            r23 = r1
            r24 = r4
            r22 = r8
            goto L_0x02fe
        L_0x02c6:
            r0.b(r13, r15, r14)
            int r11 = r10 / r14
            r22 = r8
            int r8 = r7 / r14
            r23 = r1
            short[] r1 = r0.j
            r24 = r4
            r4 = 0
            int r8 = r0.d(r1, r4, r11, r8)
            r4 = 1
            if (r14 == r4) goto L_0x02fd
            int r8 = r8 * r14
            int r14 = r14 * 4
            int r4 = r8 - r14
            int r8 = r8 + r14
            if (r4 >= r10) goto L_0x02e6
            goto L_0x02e7
        L_0x02e6:
            r10 = r4
        L_0x02e7:
            if (r8 <= r7) goto L_0x02eb
        L_0x02e9:
            r4 = 1
            goto L_0x02ed
        L_0x02eb:
            r7 = r8
            goto L_0x02e9
        L_0x02ed:
            if (r9 != r4) goto L_0x02f4
            int r7 = r0.d(r13, r15, r10, r7)
            goto L_0x02fe
        L_0x02f4:
            r0.b(r13, r15, r4)
            r4 = 0
            int r7 = r0.d(r1, r4, r10, r7)
            goto L_0x02fe
        L_0x02fd:
            r7 = r8
        L_0x02fe:
            int r1 = r0.v
            int r4 = r0.w
            if (r1 == 0) goto L_0x0316
            int r8 = r0.t
            if (r8 != 0) goto L_0x0309
            goto L_0x0316
        L_0x0309:
            int r10 = r1 * 3
            if (r4 <= r10) goto L_0x030e
            goto L_0x0316
        L_0x030e:
            int r4 = r1 * 2
            int r10 = r0.u
            int r10 = r10 * 3
            if (r4 > r10) goto L_0x0317
        L_0x0316:
            r8 = r7
        L_0x0317:
            r0.u = r1
            r0.t = r7
            r10 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            int r1 = (r5 > r10 ? 1 : (r5 == r10 ? 0 : -1))
            r4 = 1073741824(0x40000000, float:2.0)
            if (r1 <= 0) goto L_0x0364
            short[] r1 = r0.k
            int r7 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r7 < 0) goto L_0x0331
            float r4 = (float) r8
            r7 = 1065353216(0x3f800000, float:1.0)
            float r10 = r2 - r7
            float r4 = r4 / r10
            int r4 = (int) r4
            goto L_0x033d
        L_0x0331:
            r7 = 1065353216(0x3f800000, float:1.0)
            float r10 = (float) r8
            float r4 = r4 - r2
            float r4 = r4 * r10
            float r10 = r2 - r7
            float r4 = r4 / r10
            int r4 = (int) r4
            r0.s = r4
            r4 = r8
        L_0x033d:
            short[] r7 = r0.m
            int r10 = r0.n
            short[] r7 = r0.c(r7, r10, r4)
            r0.m = r7
            int r10 = r0.n
            int r20 = r15 + r8
            int r14 = r0.c
            r13 = r4
            r11 = r15
            r15 = r7
            r16 = r10
            r17 = r1
            r18 = r11
            r19 = r1
            e(r13, r14, r15, r16, r17, r18, r19, r20)
            int r1 = r0.n
            int r1 = r1 + r4
            r0.n = r1
            int r8 = r8 + r4
            int r8 = r8 + r11
            r15 = r8
            goto L_0x03b6
        L_0x0364:
            r11 = r15
            short[] r1 = r0.k
            r7 = 1056964608(0x3f000000, float:0.5)
            int r7 = (r2 > r7 ? 1 : (r2 == r7 ? 0 : -1))
            if (r7 >= 0) goto L_0x0376
            float r4 = (float) r8
            float r4 = r4 * r2
            r7 = 1065353216(0x3f800000, float:1.0)
            float r10 = r7 - r2
            float r4 = r4 / r10
            int r4 = (int) r4
            goto L_0x0383
        L_0x0376:
            r7 = 1065353216(0x3f800000, float:1.0)
            float r10 = (float) r8
            float r4 = r4 * r2
            float r4 = r4 - r7
            float r4 = r4 * r10
            float r10 = r7 - r2
            float r4 = r4 / r10
            int r4 = (int) r4
            r0.s = r4
            r4 = r8
        L_0x0383:
            short[] r7 = r0.m
            int r10 = r0.n
            int r15 = r8 + r4
            short[] r7 = r0.c(r7, r10, r15)
            r0.m = r7
            int r10 = r11 * r9
            int r13 = r0.n
            int r13 = r13 * r9
            int r14 = r8 * r9
            java.lang.System.arraycopy(r1, r10, r7, r13, r14)
            short[] r7 = r0.m
            int r10 = r0.n
            int r16 = r10 + r8
            int r18 = r11 + r8
            int r14 = r0.c
            r13 = r4
            r8 = r15
            r15 = r7
            r17 = r1
            r19 = r1
            r20 = r11
            e(r13, r14, r15, r16, r17, r18, r19, r20)
            int r1 = r0.n
            int r1 = r1 + r8
            r0.n = r1
            int r15 = r11 + r4
        L_0x03b6:
            int r1 = r15 + r12
            if (r1 <= r3) goto L_0x048d
            int r1 = r0.l
            int r1 = r1 - r15
            short[] r2 = r0.k
            int r15 = r15 * r9
            int r3 = r1 * r9
            r4 = 0
            java.lang.System.arraycopy(r2, r15, r2, r4, r3)
            r0.l = r1
            goto L_0x0282
        L_0x03ca:
            int r1 = (r24 > r1 ? 1 : (r24 == r1 ? 0 : -1))
            if (r1 == 0) goto L_0x048c
            int r1 = r0.n
            r4 = r23
            if (r1 != r4) goto L_0x03d6
            goto L_0x048c
        L_0x03d6:
            r7 = r22
            float r1 = (float) r7
            float r1 = r1 / r24
            int r1 = (int) r1
            r8 = r7
        L_0x03dd:
            r2 = 16384(0x4000, float:2.2959E-41)
            if (r1 > r2) goto L_0x03e3
            if (r8 <= r2) goto L_0x03e7
        L_0x03e3:
            r10 = 1
            r11 = 0
            goto L_0x0486
        L_0x03e7:
            int r2 = r0.n
            int r2 = r2 - r4
            short[] r3 = r0.o
            int r5 = r0.p
            short[] r3 = r0.c(r3, r5, r2)
            r0.o = r3
            short[] r5 = r0.m
            int r6 = r4 * r9
            int r7 = r0.p
            int r7 = r7 * r9
            int r10 = r2 * r9
            java.lang.System.arraycopy(r5, r6, r3, r7, r10)
            r0.n = r4
            int r3 = r0.p
            int r3 = r3 + r2
            r0.p = r3
            r4 = 0
        L_0x0408:
            int r2 = r0.p
            int r3 = r2 + -1
            if (r4 >= r3) goto L_0x0473
        L_0x040e:
            int r2 = r0.q
            r3 = 1
            int r2 = r2 + r3
            int r5 = r2 * r1
            int r6 = r0.r
            int r7 = r6 * r8
            if (r5 <= r7) goto L_0x045c
            short[] r2 = r0.m
            int r5 = r0.n
            short[] r2 = r0.c(r2, r5, r3)
            r0.m = r2
            r2 = 0
        L_0x0425:
            if (r2 >= r9) goto L_0x0450
            short[] r3 = r0.m
            int r5 = r0.n
            int r5 = r5 * r9
            int r5 = r5 + r2
            short[] r6 = r0.o
            int r7 = r4 * r9
            int r7 = r7 + r2
            short r10 = r6[r7]
            int r7 = r7 + r9
            short r6 = r6[r7]
            int r7 = r0.r
            int r7 = r7 * r8
            int r11 = r0.q
            int r12 = r11 * r1
            r13 = 1
            int r11 = r11 + r13
            int r11 = r11 * r1
            int r7 = r11 - r7
            int r11 = r11 - r12
            int r10 = r10 * r7
            int r7 = r11 - r7
            int r7 = r7 * r6
            int r7 = r7 + r10
            int r7 = r7 / r11
            short r6 = (short) r7
            r3[r5] = r6
            int r2 = r2 + 1
            goto L_0x0425
        L_0x0450:
            int r2 = r0.r
            r10 = 1
            int r2 = r2 + r10
            r0.r = r2
            int r2 = r0.n
            int r2 = r2 + r10
            r0.n = r2
            goto L_0x040e
        L_0x045c:
            r10 = r3
            r0.q = r2
            if (r2 != r8) goto L_0x0470
            r2 = 0
            r0.q = r2
            if (r6 != r1) goto L_0x0469
            r21 = r10
            goto L_0x046b
        L_0x0469:
            r21 = r2
        L_0x046b:
            defpackage.y64.j(r21)
            r0.r = r2
        L_0x0470:
            int r4 = r4 + 1
            goto L_0x0408
        L_0x0473:
            if (r3 != 0) goto L_0x0476
            goto L_0x048c
        L_0x0476:
            short[] r1 = r0.o
            int r4 = r3 * r9
            int r2 = r2 - r3
            int r2 = r2 * r9
            r11 = 0
            java.lang.System.arraycopy(r1, r4, r1, r11, r2)
            int r1 = r0.p
            int r1 = r1 - r3
            r0.p = r1
            goto L_0x048c
        L_0x0486:
            int r1 = r1 / 2
            int r8 = r8 / 2
            goto L_0x03dd
        L_0x048c:
            return
        L_0x048d:
            r8 = r22
            r1 = r23
            r4 = r24
            r10 = 0
            r11 = 1
            goto L_0x028e
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.tfe.g():void");
    }
}
