package defpackage;

import com.fasterxml.jackson.core.JsonProcessingException;
import java.io.Writer;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Arrays;
import kotlin.KotlinVersion;
import kotlin.uuid.Uuid;

/* renamed from: drg  reason: default package */
public final class drg extends jp7 {
    public static final char[] z0 = ((char[]) t22.a.clone());
    public final Writer X;
    public final char Y;
    public char[] Z;
    public int v0;
    public int w0;
    public final int x0;
    public char[] y0;

    /* JADX WARNING: type inference failed for: r3v4, types: [char[], java.lang.Cloneable] */
    public drg(o67 o67, int i, Writer writer, char c) {
        super(o67, i);
        this.X = writer;
        if (((char[]) o67.g) == null) {
            ? a = ((eu0) o67.d).a(1, 0);
            o67.g = a;
            this.Z = a;
            this.x0 = a.length;
            this.Y = c;
            if (c != '\"') {
                int[] iArr = t22.h;
                if (c != '\"') {
                    int[][] iArr2 = s22.b.a;
                    int[] iArr3 = iArr2[c];
                    if (iArr3 == null) {
                        iArr = Arrays.copyOf(iArr, Uuid.SIZE_BITS);
                        if (iArr[c] == 0) {
                            iArr[c] = -1;
                        }
                        iArr2[c] = iArr;
                    } else {
                        iArr = iArr3;
                    }
                }
                this.v = iArr;
                return;
            }
            return;
        }
        throw new IllegalStateException("Trying to call same allocXxx() method second time");
    }

    public final void A0(char c, int i) {
        int i2;
        Writer writer = this.X;
        if (i >= 0) {
            int i3 = this.w0;
            if (i3 >= 2) {
                int i4 = i3 - 2;
                this.v0 = i4;
                char[] cArr = this.Z;
                cArr[i4] = '\\';
                cArr[i3 - 1] = (char) i;
                return;
            }
            char[] cArr2 = this.y0;
            if (cArr2 == null) {
                cArr2 = w0();
            }
            this.v0 = this.w0;
            cArr2[1] = (char) i;
            writer.write(cArr2, 0, 2);
        } else if (i != -2) {
            int i5 = this.w0;
            char[] cArr3 = z0;
            if (i5 >= 6) {
                char[] cArr4 = this.Z;
                int i6 = i5 - 6;
                this.v0 = i6;
                cArr4[i6] = '\\';
                cArr4[i5 - 5] = 'u';
                if (c > 255) {
                    int i7 = c >> 8;
                    cArr4[i5 - 4] = cArr3[(i7 & KotlinVersion.MAX_COMPONENT_VALUE) >> 4];
                    i2 = i5 - 3;
                    cArr4[i2] = cArr3[i7 & 15];
                    c = (char) (c & 255);
                } else {
                    cArr4[i5 - 4] = '0';
                    i2 = i5 - 3;
                    cArr4[i2] = '0';
                }
                cArr4[i2 + 1] = cArr3[c >> 4];
                cArr4[i2 + 2] = cArr3[c & 15];
                return;
            }
            char[] cArr5 = this.y0;
            if (cArr5 == null) {
                cArr5 = w0();
            }
            this.v0 = this.w0;
            if (c > 255) {
                int i8 = c >> 8;
                cArr5[10] = cArr3[(i8 & KotlinVersion.MAX_COMPONENT_VALUE) >> 4];
                cArr5[11] = cArr3[i8 & 15];
                cArr5[12] = cArr3[(c & 255) >> 4];
                cArr5[13] = cArr3[c & 15];
                writer.write(cArr5, 8, 6);
                return;
            }
            cArr5[6] = cArr3[c >> 4];
            cArr5[7] = cArr3[c & 15];
            writer.write(cArr5, 2, 6);
        } else {
            throw null;
        }
    }

    public final void B0(String str) {
        char c;
        yp7 yp7 = this.c;
        int i = yp7.a;
        boolean z = false;
        if (i == 2) {
            if (!yp7.g) {
                z = true;
            } else {
                yp7.g = false;
                yp7.b++;
                z = true;
            }
        } else if (i == 1) {
            int i2 = yp7.b;
            yp7.b = i2 + 1;
            if (i2 >= 0) {
                z = true;
            }
        } else {
            int i3 = yp7.b + 1;
            yp7.b = i3;
            if (i3 != 0) {
                z = true;
            }
        }
        if (z) {
            c = ',';
        } else if (z) {
            c = ':';
        } else if (!z) {
            if (z) {
                ip7.b("Can not " + str + ", expecting field name (context: " + yp7.e() + ")");
                throw null;
            }
            return;
        } else if (this.x != null) {
            F0(" ");
            return;
        } else {
            return;
        }
        if (this.w0 >= this.x0) {
            y0();
        }
        char[] cArr = this.Z;
        int i4 = this.w0;
        this.w0 = i4 + 1;
        cArr[i4] = c;
    }

    public final void C0() {
        if (this.w0 + 4 >= this.x0) {
            y0();
        }
        int i = this.w0;
        char[] cArr = this.Z;
        cArr[i] = 'n';
        cArr[i + 1] = 'u';
        cArr[i + 2] = 'l';
        cArr[i + 3] = 'l';
        this.w0 = i + 4;
    }

    public final void D0(String str) {
        int i = this.w0;
        int i2 = this.x0;
        if (i >= i2) {
            y0();
        }
        char[] cArr = this.Z;
        int i3 = this.w0;
        this.w0 = i3 + 1;
        char c = this.Y;
        cArr[i3] = c;
        F0(str);
        if (this.w0 >= i2) {
            y0();
        }
        char[] cArr2 = this.Z;
        int i4 = this.w0;
        this.w0 = i4 + 1;
        cArr2[i4] = c;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:68:0x010f, code lost:
        r5 = r6.v0;
        r4 = r4 - r5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:69:0x0112, code lost:
        if (r4 <= 0) goto L_0x0117;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:70:0x0114, code lost:
        r10.write(r3, r5, r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:71:0x0117, code lost:
        r3 = r6.Z;
        r4 = r6.w0;
        r6.w0 = r4 + 1;
        r3 = r3[r4];
        A0(r3, r0[r3]);
     */
    /* JADX WARNING: Removed duplicated region for block: B:81:0x0043 A[EDGE_INSN: B:81:0x0043->B:15:0x0043 ?: BREAK  , SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:89:0x012d A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void E0(java.lang.String r20) {
        /*
            r19 = this;
            r6 = r19
            r7 = r20
            int r0 = r20.length()
            r9 = 0
            java.io.Writer r10 = r6.X
            int r11 = r6.x0
            if (r0 <= r11) goto L_0x00ad
            r19.y0()
            int r12 = r20.length()
            r0 = r9
        L_0x0017:
            int r1 = r0 + r11
            if (r1 <= r12) goto L_0x001f
            int r1 = r12 - r0
            r13 = r1
            goto L_0x0020
        L_0x001f:
            r13 = r11
        L_0x0020:
            int r14 = r0 + r13
            char[] r1 = r6.Z
            r7.getChars(r0, r14, r1, r9)
            int r15 = r6.w
            if (r15 == 0) goto L_0x0075
            int[] r5 = r6.v
            int r0 = r5.length
            int r1 = r15 + 1
            int r4 = java.lang.Math.min(r0, r1)
            r0 = r9
            r1 = r0
            r2 = r1
        L_0x0037:
            if (r0 >= r13) goto L_0x00a7
        L_0x0039:
            char[] r3 = r6.Z
            char r8 = r3[r0]
            if (r8 >= r4) goto L_0x0046
            r2 = r5[r8]
            if (r2 == 0) goto L_0x004b
        L_0x0043:
            r16 = r2
            goto L_0x0050
        L_0x0046:
            if (r8 <= r15) goto L_0x004b
            r16 = -1
            goto L_0x0050
        L_0x004b:
            int r0 = r0 + 1
            if (r0 < r13) goto L_0x0039
            goto L_0x0043
        L_0x0050:
            int r2 = r0 - r1
            if (r2 <= 0) goto L_0x005a
            r10.write(r3, r1, r2)
            if (r0 < r13) goto L_0x005a
            goto L_0x00a7
        L_0x005a:
            int r17 = r0 + 1
            char[] r1 = r6.Z
            r0 = r19
            r2 = r17
            r3 = r13
            r18 = r4
            r4 = r8
            r8 = r5
            r5 = r16
            int r1 = r0.z0(r1, r2, r3, r4, r5)
            r5 = r8
            r2 = r16
            r0 = r17
            r4 = r18
            goto L_0x0037
        L_0x0075:
            int[] r8 = r6.v
            int r15 = r8.length
            r0 = r9
            r1 = r0
        L_0x007a:
            if (r0 >= r13) goto L_0x00a7
        L_0x007c:
            char[] r2 = r6.Z
            char r4 = r2[r0]
            if (r4 >= r15) goto L_0x0087
            r3 = r8[r4]
            if (r3 == 0) goto L_0x0087
            goto L_0x008b
        L_0x0087:
            int r0 = r0 + 1
            if (r0 < r13) goto L_0x007c
        L_0x008b:
            int r3 = r0 - r1
            if (r3 <= 0) goto L_0x0095
            r10.write(r2, r1, r3)
            if (r0 < r13) goto L_0x0095
            goto L_0x00a7
        L_0x0095:
            int r16 = r0 + 1
            char[] r1 = r6.Z
            r5 = r8[r4]
            r0 = r19
            r2 = r16
            r3 = r13
            int r1 = r0.z0(r1, r2, r3, r4, r5)
            r0 = r16
            goto L_0x007a
        L_0x00a7:
            if (r14 < r12) goto L_0x00aa
            return
        L_0x00aa:
            r0 = r14
            goto L_0x0017
        L_0x00ad:
            int r1 = r6.w0
            int r1 = r1 + r0
            if (r1 <= r11) goto L_0x00b5
            r19.y0()
        L_0x00b5:
            char[] r1 = r6.Z
            int r2 = r6.w0
            r7.getChars(r9, r0, r1, r2)
            int r1 = r6.w
            if (r1 == 0) goto L_0x00f9
            int r2 = r6.w0
            int r2 = r2 + r0
            int[] r0 = r6.v
            int r3 = r0.length
            int r4 = r1 + 1
            int r3 = java.lang.Math.min(r3, r4)
        L_0x00cc:
            int r4 = r6.w0
            if (r4 >= r2) goto L_0x012d
        L_0x00d0:
            char[] r4 = r6.Z
            int r5 = r6.w0
            char r7 = r4[r5]
            if (r7 >= r3) goto L_0x00dd
            r8 = r0[r7]
            if (r8 == 0) goto L_0x00f2
            goto L_0x00e0
        L_0x00dd:
            if (r7 <= r1) goto L_0x00f2
            r8 = -1
        L_0x00e0:
            int r9 = r6.v0
            int r5 = r5 - r9
            if (r5 <= 0) goto L_0x00e8
            r10.write(r4, r9, r5)
        L_0x00e8:
            int r4 = r6.w0
            int r4 = r4 + 1
            r6.w0 = r4
            r6.A0(r7, r8)
            goto L_0x00cc
        L_0x00f2:
            int r5 = r5 + 1
            r6.w0 = r5
            if (r5 < r2) goto L_0x00d0
            goto L_0x012d
        L_0x00f9:
            int r1 = r6.w0
            int r1 = r1 + r0
            int[] r0 = r6.v
            int r2 = r0.length
        L_0x00ff:
            int r3 = r6.w0
            if (r3 >= r1) goto L_0x012d
        L_0x0103:
            char[] r3 = r6.Z
            int r4 = r6.w0
            char r5 = r3[r4]
            if (r5 >= r2) goto L_0x0127
            r5 = r0[r5]
            if (r5 == 0) goto L_0x0127
            int r5 = r6.v0
            int r4 = r4 - r5
            if (r4 <= 0) goto L_0x0117
            r10.write(r3, r5, r4)
        L_0x0117:
            char[] r3 = r6.Z
            int r4 = r6.w0
            int r5 = r4 + 1
            r6.w0 = r5
            char r3 = r3[r4]
            r4 = r0[r3]
            r6.A0(r3, r4)
            goto L_0x00ff
        L_0x0127:
            int r4 = r4 + 1
            r6.w0 = r4
            if (r4 < r1) goto L_0x0103
        L_0x012d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.drg.E0(java.lang.String):void");
    }

    public final void F0(String str) {
        int length = str.length();
        int i = this.w0;
        int i2 = this.x0;
        int i3 = i2 - i;
        if (i3 == 0) {
            y0();
            i3 = i2 - this.w0;
        }
        if (i3 >= length) {
            str.getChars(0, length, this.Z, this.w0);
            this.w0 += length;
            return;
        }
        int i4 = this.w0;
        int i5 = i2 - i4;
        str.getChars(0, i5, this.Z, i4);
        this.w0 += i5;
        y0();
        int length2 = str.length() - i5;
        while (length2 > i2) {
            int i6 = i5 + i2;
            str.getChars(i5, i6, this.Z, 0);
            this.v0 = 0;
            this.w0 = i2;
            y0();
            length2 -= i2;
            i5 = i6;
        }
        str.getChars(i5, i5 + length2, this.Z, 0);
        this.v0 = 0;
        this.w0 = length2;
    }

    public final void U(double d) {
        if (!this.b) {
            String str = tga.a;
            if ((!Double.isNaN(d) && !Double.isInfinite(d)) || !v0(hp7.QUOTE_NON_NUMERIC_NUMBERS)) {
                B0("write a number");
                F0(String.valueOf(d));
                return;
            }
        }
        s0(String.valueOf(d));
    }

    public final void V(float f) {
        if (!this.b) {
            String str = tga.a;
            if ((!Float.isNaN(f) && !Float.isInfinite(f)) || !v0(hp7.QUOTE_NON_NUMERIC_NUMBERS)) {
                B0("write a number");
                F0(String.valueOf(f));
                return;
            }
        }
        s0(String.valueOf(f));
    }

    public final void close() {
        if (this.Z != null && v0(hp7.AUTO_CLOSE_JSON_CONTENT)) {
            while (true) {
                yp7 yp7 = this.c;
                if (!yp7.b()) {
                    if (!yp7.c()) {
                        break;
                    }
                    n();
                } else {
                    m();
                }
            }
        }
        y0();
        this.v0 = 0;
        this.w0 = 0;
        o67 o67 = this.o;
        Writer writer = this.X;
        if (writer != null) {
            if (o67.b || v0(hp7.AUTO_CLOSE_TARGET)) {
                writer.close();
            } else if (v0(hp7.FLUSH_PASSED_TO_STREAM)) {
                writer.flush();
            }
        }
        char[] cArr = this.Z;
        if (cArr != null) {
            this.Z = null;
            char[] cArr2 = (char[]) o67.g;
            if (cArr == cArr2 || cArr.length >= cArr2.length) {
                o67.g = null;
                ((eu0) o67.d).b.set(1, cArr);
                return;
            }
            throw new IllegalArgumentException("Trying to release buffer smaller than original");
        }
    }

    public final void d(boolean z) {
        int i;
        B0("write a boolean value");
        if (this.w0 + 5 >= this.x0) {
            y0();
        }
        int i2 = this.w0;
        char[] cArr = this.Z;
        if (z) {
            cArr[i2] = 't';
            cArr[i2 + 1] = 'r';
            cArr[i2 + 2] = 'u';
            i = i2 + 3;
            cArr[i] = 'e';
        } else {
            cArr[i2] = 'f';
            cArr[i2 + 1] = 'a';
            cArr[i2 + 2] = 'l';
            cArr[i2 + 3] = 's';
            i = i2 + 4;
            cArr[i] = 'e';
        }
        this.w0 = i + 1;
    }

    public final void e0(int i) {
        B0("write a number");
        boolean z = this.b;
        int i2 = this.x0;
        if (z) {
            if (this.w0 + 13 >= i2) {
                y0();
            }
            char[] cArr = this.Z;
            int i3 = this.w0;
            int i4 = i3 + 1;
            this.w0 = i4;
            char c = this.Y;
            cArr[i3] = c;
            int d = tga.d(cArr, i, i4);
            char[] cArr2 = this.Z;
            this.w0 = d + 1;
            cArr2[d] = c;
            return;
        }
        if (this.w0 + 11 >= i2) {
            y0();
        }
        this.w0 = tga.d(this.Z, i, this.w0);
    }

    public final void flush() {
        y0();
        Writer writer = this.X;
        if (writer != null && v0(hp7.FLUSH_PASSED_TO_STREAM)) {
            writer.flush();
        }
    }

    public final void k0(long j) {
        B0("write a number");
        boolean z = this.b;
        int i = this.x0;
        if (z) {
            if (this.w0 + 23 >= i) {
                y0();
            }
            char[] cArr = this.Z;
            int i2 = this.w0;
            int i3 = i2 + 1;
            this.w0 = i3;
            char c = this.Y;
            cArr[i2] = c;
            int e = tga.e(j, cArr, i3);
            char[] cArr2 = this.Z;
            this.w0 = e + 1;
            cArr2[e] = c;
            return;
        }
        if (this.w0 + 21 >= i) {
            y0();
        }
        this.w0 = tga.e(j, this.Z, this.w0);
    }

    public final void m() {
        if (this.c.b()) {
            if (this.w0 >= this.x0) {
                y0();
            }
            char[] cArr = this.Z;
            int i = this.w0;
            this.w0 = i + 1;
            cArr[i] = ']';
            this.c = this.c.c;
            return;
        }
        ip7.b("Current context not Array but ".concat(this.c.e()));
        throw null;
    }

    public final void m0(BigDecimal bigDecimal) {
        B0("write a number");
        if (bigDecimal == null) {
            C0();
        } else if (this.b) {
            D0(u0(bigDecimal));
        } else {
            F0(u0(bigDecimal));
        }
    }

    public final void n() {
        if (this.c.c()) {
            if (this.w0 >= this.x0) {
                y0();
            }
            char[] cArr = this.Z;
            int i = this.w0;
            this.w0 = i + 1;
            cArr[i] = '}';
            this.c = this.c.c;
            return;
        }
        ip7.b("Current context not Object but ".concat(this.c.e()));
        throw null;
    }

    public final void o(String str) {
        boolean z;
        yp7 yp7 = this.c;
        boolean z2 = false;
        if (yp7.a != 2 || yp7.g) {
            z = true;
        } else {
            yp7.g = true;
            yp7.f = str;
            eud eud = yp7.d;
            if (eud == null || !eud.r(str)) {
                z = yp7.b >= 0;
            } else {
                String k = wj6.k("Duplicate field '", str, "'");
                boolean z3 = eud.c instanceof ip7;
                throw new JsonProcessingException(k, (lp7) null, (NumberFormatException) null);
            }
        }
        if (!z) {
            if (z) {
                z2 = true;
            }
            int i = this.w0 + 1;
            int i2 = this.x0;
            if (i >= i2) {
                y0();
            }
            if (z2) {
                char[] cArr = this.Z;
                int i3 = this.w0;
                this.w0 = i3 + 1;
                cArr[i3] = ',';
            }
            if (this.y) {
                E0(str);
                return;
            }
            char[] cArr2 = this.Z;
            int i4 = this.w0;
            this.w0 = i4 + 1;
            char c = this.Y;
            cArr2[i4] = c;
            E0(str);
            if (this.w0 >= i2) {
                y0();
            }
            char[] cArr3 = this.Z;
            int i5 = this.w0;
            this.w0 = i5 + 1;
            cArr3[i5] = c;
            return;
        }
        ip7.b("Can not write a field name, expecting a value");
        throw null;
    }

    public final void p0(BigInteger bigInteger) {
        B0("write a number");
        if (bigInteger == null) {
            C0();
        } else if (this.b) {
            D0(bigInteger.toString());
        } else {
            F0(bigInteger.toString());
        }
    }

    public final void q0() {
        B0("start an array");
        yp7 yp7 = this.c;
        yp7 yp72 = yp7.e;
        eud eud = null;
        if (yp72 == null) {
            eud eud2 = yp7.d;
            if (eud2 != null) {
                eud = new eud(eud2.c);
            }
            yp72 = new yp7(1, yp7, eud);
            yp7.e = yp72;
        } else {
            yp72.a = 1;
            yp72.b = -1;
            yp72.f = null;
            yp72.g = false;
            eud eud3 = yp72.d;
            if (eud3 != null) {
                eud3.b = null;
                eud3.o = null;
                eud3.v = null;
            }
        }
        this.c = yp72;
        if (this.w0 >= this.x0) {
            y0();
        }
        char[] cArr = this.Z;
        int i = this.w0;
        this.w0 = i + 1;
        cArr[i] = '[';
    }

    public final void r0() {
        B0("start an object");
        yp7 yp7 = this.c;
        yp7 yp72 = yp7.e;
        eud eud = null;
        if (yp72 == null) {
            eud eud2 = yp7.d;
            if (eud2 != null) {
                eud = new eud(eud2.c);
            }
            yp72 = new yp7(2, yp7, eud);
            yp7.e = yp72;
        } else {
            yp72.a = 2;
            yp72.b = -1;
            yp72.f = null;
            yp72.g = false;
            eud eud3 = yp72.d;
            if (eud3 != null) {
                eud3.b = null;
                eud3.o = null;
                eud3.v = null;
            }
        }
        this.c = yp72;
        if (this.w0 >= this.x0) {
            y0();
        }
        char[] cArr = this.Z;
        int i = this.w0;
        this.w0 = i + 1;
        cArr[i] = '{';
    }

    public final void s0(String str) {
        B0("write a string");
        if (str == null) {
            C0();
            return;
        }
        int i = this.w0;
        int i2 = this.x0;
        if (i >= i2) {
            y0();
        }
        char[] cArr = this.Z;
        int i3 = this.w0;
        this.w0 = i3 + 1;
        char c = this.Y;
        cArr[i3] = c;
        E0(str);
        if (this.w0 >= i2) {
            y0();
        }
        char[] cArr2 = this.Z;
        int i4 = this.w0;
        this.w0 = i4 + 1;
        cArr2[i4] = c;
    }

    public final void t0(char[] cArr, int i, int i2) {
        char c;
        char[] cArr2 = cArr;
        B0("write a string");
        int i3 = this.w0;
        int i4 = this.x0;
        if (i3 >= i4) {
            y0();
        }
        char[] cArr3 = this.Z;
        int i5 = this.w0;
        this.w0 = i5 + 1;
        char c2 = this.Y;
        cArr3[i5] = c2;
        int i6 = this.w;
        Writer writer = this.X;
        int i7 = 32;
        if (i6 != 0) {
            int i8 = i2 + i;
            int[] iArr = this.v;
            int min = Math.min(iArr.length, i6 + 1);
            int i9 = 0;
            int i10 = i;
            while (i10 < i8) {
                int i11 = i10;
                while (true) {
                    c = cArr2[i11];
                    if (c >= min) {
                        if (c > i6) {
                            i9 = -1;
                            break;
                        }
                    } else {
                        i9 = iArr[c];
                        if (i9 != 0) {
                            break;
                        }
                    }
                    i11++;
                    if (i11 >= i8) {
                        break;
                    }
                }
                int i12 = i11 - i10;
                if (i12 < i7) {
                    if (this.w0 + i12 > i4) {
                        y0();
                    }
                    if (i12 > 0) {
                        System.arraycopy(cArr2, i10, this.Z, this.w0, i12);
                        this.w0 += i12;
                    }
                } else {
                    y0();
                    writer.write(cArr2, i10, i12);
                }
                if (i11 >= i8) {
                    break;
                }
                i10 = i11 + 1;
                x0(c, i9);
                i7 = 32;
            }
        } else {
            int i13 = i2 + i;
            int[] iArr2 = this.v;
            int length = iArr2.length;
            int i14 = i;
            while (i14 < i13) {
                int i15 = i14;
                do {
                    char c3 = cArr2[i15];
                    if ((c3 < length && iArr2[c3] != 0) || (i15 = i15 + 1) >= i13) {
                        int i16 = i15 - i14;
                    }
                    char c32 = cArr2[i15];
                    break;
                } while ((i15 = i15 + 1) >= i13);
                int i162 = i15 - i14;
                if (i162 < 32) {
                    if (this.w0 + i162 > i4) {
                        y0();
                    }
                    if (i162 > 0) {
                        System.arraycopy(cArr2, i14, this.Z, this.w0, i162);
                        this.w0 += i162;
                    }
                } else {
                    y0();
                    writer.write(cArr2, i14, i162);
                }
                if (i15 >= i13) {
                    break;
                }
                i14 = i15 + 1;
                char c4 = cArr2[i15];
                x0(c4, iArr2[c4]);
            }
        }
        if (this.w0 >= i4) {
            y0();
        }
        char[] cArr4 = this.Z;
        int i17 = this.w0;
        this.w0 = i17 + 1;
        cArr4[i17] = c2;
    }

    public final char[] w0() {
        char[] cArr = new char[14];
        cArr[0] = '\\';
        cArr[2] = '\\';
        cArr[3] = 'u';
        cArr[4] = '0';
        cArr[5] = '0';
        cArr[8] = '\\';
        cArr[9] = 'u';
        this.y0 = cArr;
        return cArr;
    }

    public final void x0(char c, int i) {
        int i2;
        int i3 = this.x0;
        if (i >= 0) {
            if (this.w0 + 2 > i3) {
                y0();
            }
            char[] cArr = this.Z;
            int i4 = this.w0;
            int i5 = i4 + 1;
            this.w0 = i5;
            cArr[i4] = '\\';
            this.w0 = i4 + 2;
            cArr[i5] = (char) i;
        } else if (i != -2) {
            if (this.w0 + 5 >= i3) {
                y0();
            }
            int i6 = this.w0;
            char[] cArr2 = this.Z;
            cArr2[i6] = '\\';
            int i7 = i6 + 2;
            cArr2[i6 + 1] = 'u';
            char[] cArr3 = z0;
            if (c > 255) {
                int i8 = c >> 8;
                int i9 = i6 + 3;
                cArr2[i7] = cArr3[(i8 & KotlinVersion.MAX_COMPONENT_VALUE) >> 4];
                i2 = i6 + 4;
                cArr2[i9] = cArr3[i8 & 15];
                c = (char) (c & 255);
            } else {
                int i10 = i6 + 3;
                cArr2[i7] = '0';
                i2 = i6 + 4;
                cArr2[i10] = '0';
            }
            cArr2[i2] = cArr3[c >> 4];
            cArr2[i2 + 1] = cArr3[c & 15];
            this.w0 = i2 + 2;
        } else {
            throw null;
        }
    }

    public final void y0() {
        int i = this.w0;
        int i2 = this.v0;
        int i3 = i - i2;
        if (i3 > 0) {
            this.v0 = 0;
            this.w0 = 0;
            this.X.write(this.Z, i2, i3);
        }
    }

    public final int z0(char[] cArr, int i, int i2, char c, int i3) {
        int i4;
        Writer writer = this.X;
        if (i3 >= 0) {
            if (i <= 1 || i >= i2) {
                char[] cArr2 = this.y0;
                if (cArr2 == null) {
                    cArr2 = w0();
                }
                cArr2[1] = (char) i3;
                writer.write(cArr2, 0, 2);
                return i;
            }
            int i5 = i - 2;
            cArr[i5] = '\\';
            cArr[i - 1] = (char) i3;
            return i5;
        } else if (i3 != -2) {
            char[] cArr3 = z0;
            if (i <= 5 || i >= i2) {
                char[] cArr4 = this.y0;
                if (cArr4 == null) {
                    cArr4 = w0();
                }
                this.v0 = this.w0;
                if (c > 255) {
                    int i6 = c >> 8;
                    cArr4[10] = cArr3[(i6 & KotlinVersion.MAX_COMPONENT_VALUE) >> 4];
                    cArr4[11] = cArr3[i6 & 15];
                    cArr4[12] = cArr3[(c & 255) >> 4];
                    cArr4[13] = cArr3[c & 15];
                    writer.write(cArr4, 8, 6);
                    return i;
                }
                cArr4[6] = cArr3[c >> 4];
                cArr4[7] = cArr3[c & 15];
                writer.write(cArr4, 2, 6);
                return i;
            }
            cArr[i - 6] = '\\';
            int i7 = i - 4;
            cArr[i - 5] = 'u';
            if (c > 255) {
                int i8 = c >> 8;
                int i9 = i - 3;
                cArr[i7] = cArr3[(i8 & KotlinVersion.MAX_COMPONENT_VALUE) >> 4];
                i4 = i - 2;
                cArr[i9] = cArr3[i8 & 15];
                c = (char) (c & 255);
            } else {
                int i10 = i - 3;
                cArr[i7] = '0';
                i4 = i - 2;
                cArr[i10] = '0';
            }
            cArr[i4] = cArr3[c >> 4];
            cArr[i4 + 1] = cArr3[c & 15];
            return i4 - 4;
        } else {
            throw null;
        }
    }
}
