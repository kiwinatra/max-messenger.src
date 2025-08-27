package defpackage;

import com.fasterxml.jackson.core.exc.StreamReadException;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Arrays;
import kotlin.jvm.internal.IntCompanionObject;
import kotlin.jvm.internal.LongCompanionObject;

/* renamed from: m8b  reason: default package */
public abstract class m8b extends pp7 {
    public static final byte[] H0 = new byte[0];
    public static final BigInteger I0;
    public static final BigInteger J0;
    public static final BigInteger K0;
    public static final BigInteger L0;
    public static final BigDecimal M0;
    public static final BigDecimal N0;
    public static final BigDecimal O0;
    public static final BigDecimal P0;
    public int A0;
    public long B0;
    public double C0;
    public BigInteger D0;
    public BigDecimal E0;
    public boolean F0;
    public int G0;
    public int X = 1;
    public int Y;
    public qp7 Z;
    public wp7 b;
    public final o67 c;
    public boolean o;
    public int v;
    public wp7 v0;
    public int w;
    public final wef w0;
    public long x;
    public char[] x0;
    public int y = 1;
    public boolean y0;
    public int z;
    public int z0 = 0;

    static {
        BigInteger valueOf = BigInteger.valueOf(-2147483648L);
        I0 = valueOf;
        BigInteger valueOf2 = BigInteger.valueOf(2147483647L);
        J0 = valueOf2;
        BigInteger valueOf3 = BigInteger.valueOf(Long.MIN_VALUE);
        K0 = valueOf3;
        BigInteger valueOf4 = BigInteger.valueOf(LongCompanionObject.MAX_VALUE);
        L0 = valueOf4;
        M0 = new BigDecimal(valueOf3);
        N0 = new BigDecimal(valueOf4);
        O0 = new BigDecimal(valueOf);
        P0 = new BigDecimal(valueOf2);
    }

    public m8b(o67 o67, int i) {
        this.a = i;
        this.c = o67;
        this.w0 = new wef((eu0) o67.d);
        this.Z = new qp7((qp7) null, np7.STRICT_DUPLICATE_DETECTION.a(i) ? new eud((Object) this) : null, 0, 1, 0);
    }

    public static String B0(String str) {
        int length = str.length();
        if (length < 1000) {
            return str;
        }
        if (str.startsWith("-")) {
            length--;
        }
        return String.format("[Integer with %d digits]", new Object[]{Integer.valueOf(length)});
    }

    public static String C0(String str) {
        int length = str.length();
        if (length < 1000) {
            return str;
        }
        if (str.startsWith("-")) {
            length--;
        }
        return String.format("[number with %d characters]", new Object[]{Integer.valueOf(length)});
    }

    public static int[] O0(int i, int[] iArr) {
        return iArr == null ? new int[i] : Arrays.copyOf(iArr, iArr.length + i);
    }

    public static final String x0(int i) {
        char c2 = (char) i;
        if (Character.isISOControl(c2)) {
            return a81.j(i, "(CTRL-CHAR, code ", ")");
        }
        if (i > 255) {
            return "'" + c2 + "' (code " + i + " / 0x" + Integer.toHexString(i) + ")";
        }
        return "'" + c2 + "' (code " + i + ")";
    }

    public final void A0(char c2) {
        np7 np7 = np7.ALLOW_BACKSLASH_ESCAPING_ANY_CHARACTER;
        int i = this.a;
        if (!np7.a(i)) {
            if (c2 != '\'' || !np7.ALLOW_SINGLE_QUOTES.a(i)) {
                F0("Unrecognized character escape " + x0(c2));
                throw null;
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:23:0x006c  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void D0(int r18) {
        /*
            r17 = this;
            r1 = r17
            r0 = r18
            r2 = 1
            boolean r3 = r1.o
            r4 = 0
            if (r3 != 0) goto L_0x01a9
            wp7 r3 = r1.b
            wp7 r5 = defpackage.wp7.VALUE_NUMBER_INT
            java.lang.String r8 = "2.2250738585072012e-308"
            java.lang.String r9 = ")"
            java.lang.String r10 = "Malformed numeric value ("
            r11 = 8
            wef r12 = r1.w0
            if (r3 != r5) goto L_0x0144
            int r3 = r1.G0
            r5 = 9
            if (r3 > r5) goto L_0x002b
            boolean r0 = r1.F0
            int r0 = r12.k(r0)
            r1.A0 = r0
            r1.z0 = r2
            return
        L_0x002b:
            r5 = 0
            r13 = 18
            r14 = 2
            if (r3 > r13) goto L_0x008f
            boolean r0 = r1.F0
            int r4 = r12.d
            if (r4 < 0) goto L_0x0050
            java.lang.Object r6 = r12.i
            char[] r6 = (char[]) r6
            if (r6 == 0) goto L_0x0050
            if (r0 == 0) goto L_0x0049
            int r4 = r4 + r2
            int r0 = r12.e
            int r0 = r0 - r2
            long r4 = defpackage.sga.c(r6, r4, r0)
        L_0x0047:
            long r4 = -r4
            goto L_0x0068
        L_0x0049:
            int r0 = r12.e
            long r4 = defpackage.sga.c(r6, r4, r0)
            goto L_0x0068
        L_0x0050:
            if (r0 == 0) goto L_0x005e
            java.lang.Object r0 = r12.j
            char[] r0 = (char[]) r0
            int r4 = r12.g
            int r4 = r4 - r2
            long r4 = defpackage.sga.c(r0, r2, r4)
            goto L_0x0047
        L_0x005e:
            java.lang.Object r0 = r12.j
            char[] r0 = (char[]) r0
            int r4 = r12.g
            long r4 = defpackage.sga.c(r0, r5, r4)
        L_0x0068:
            r0 = 10
            if (r3 != r0) goto L_0x008a
            boolean r0 = r1.F0
            if (r0 == 0) goto L_0x007d
            r6 = -2147483648(0xffffffff80000000, double:NaN)
            int r0 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r0 < 0) goto L_0x008a
            int r0 = (int) r4
            r1.A0 = r0
            r1.z0 = r2
            return
        L_0x007d:
            r6 = 2147483647(0x7fffffff, double:1.060997895E-314)
            int r0 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r0 > 0) goto L_0x008a
            int r0 = (int) r4
            r1.A0 = r0
            r1.z0 = r2
            return
        L_0x008a:
            r1.B0 = r4
            r1.z0 = r14
            return
        L_0x008f:
            java.lang.String r3 = r12.l()
            int r13 = r1.G0     // Catch:{ NumberFormatException -> 0x00df }
            char[] r15 = r12.r()     // Catch:{ NumberFormatException -> 0x00df }
            int r12 = r12.d     // Catch:{ NumberFormatException -> 0x00df }
            if (r12 < 0) goto L_0x009e
            goto L_0x009f
        L_0x009e:
            r12 = r5
        L_0x009f:
            boolean r5 = r1.F0     // Catch:{ NumberFormatException -> 0x00df }
            if (r5 == 0) goto L_0x00a4
            int r12 = r12 + r2
        L_0x00a4:
            if (r5 == 0) goto L_0x00a9
            java.lang.String r5 = defpackage.sga.a     // Catch:{ NumberFormatException -> 0x00df }
            goto L_0x00ab
        L_0x00a9:
            java.lang.String r5 = defpackage.sga.b     // Catch:{ NumberFormatException -> 0x00df }
        L_0x00ab:
            int r6 = r5.length()     // Catch:{ NumberFormatException -> 0x00df }
            if (r13 >= r6) goto L_0x00b3
            goto L_0x011e
        L_0x00b3:
            if (r13 <= r6) goto L_0x00b6
            goto L_0x00c8
        L_0x00b6:
            r7 = 0
        L_0x00b7:
            if (r7 >= r6) goto L_0x011e
            int r13 = r12 + r7
            char r13 = r15[r13]     // Catch:{ NumberFormatException -> 0x00df }
            char r16 = r5.charAt(r7)     // Catch:{ NumberFormatException -> 0x00df }
            int r13 = r13 - r16
            if (r13 == 0) goto L_0x011c
            if (r13 >= 0) goto L_0x00c8
            goto L_0x011e
        L_0x00c8:
            if (r0 == r2) goto L_0x00f5
            if (r0 != r14) goto L_0x00cd
            goto L_0x00f5
        L_0x00cd:
            if (r0 == r11) goto L_0x00e1
            r2 = 32
            if (r0 != r2) goto L_0x00d4
            goto L_0x00e1
        L_0x00d4:
            java.math.BigInteger r0 = new java.math.BigInteger     // Catch:{ NumberFormatException -> 0x00df }
            r0.<init>(r3)     // Catch:{ NumberFormatException -> 0x00df }
            r1.D0 = r0     // Catch:{ NumberFormatException -> 0x00df }
            r0 = 4
            r1.z0 = r0     // Catch:{ NumberFormatException -> 0x00df }
            goto L_0x0126
        L_0x00df:
            r0 = move-exception
            goto L_0x0127
        L_0x00e1:
            java.lang.String r0 = defpackage.sga.a     // Catch:{ NumberFormatException -> 0x00df }
            boolean r0 = r8.equals(r3)     // Catch:{ NumberFormatException -> 0x00df }
            if (r0 == 0) goto L_0x00ec
            r6 = 1
            goto L_0x00f0
        L_0x00ec:
            double r6 = java.lang.Double.parseDouble(r3)     // Catch:{ NumberFormatException -> 0x00df }
        L_0x00f0:
            r1.C0 = r6     // Catch:{ NumberFormatException -> 0x00df }
            r1.z0 = r11     // Catch:{ NumberFormatException -> 0x00df }
            goto L_0x0126
        L_0x00f5:
            if (r0 != r2) goto L_0x0118
            java.lang.String r0 = B0(r3)     // Catch:{ NumberFormatException -> 0x00df }
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)     // Catch:{ NumberFormatException -> 0x00df }
            r4 = 2147483647(0x7fffffff, float:NaN)
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)     // Catch:{ NumberFormatException -> 0x00df }
            java.lang.Object[] r0 = new java.lang.Object[]{r0, r2, r4}     // Catch:{ NumberFormatException -> 0x00df }
            java.lang.String r2 = "Numeric value (%s) out of range of int (%d - %s)"
            java.lang.String r0 = java.lang.String.format(r2, r0)     // Catch:{ NumberFormatException -> 0x00df }
            com.fasterxml.jackson.core.exc.InputCoercionException r2 = new com.fasterxml.jackson.core.exc.InputCoercionException     // Catch:{ NumberFormatException -> 0x00df }
            r2.<init>(r1, r0)     // Catch:{ NumberFormatException -> 0x00df }
            throw r2     // Catch:{ NumberFormatException -> 0x00df }
        L_0x0118:
            r1.P0(r3)     // Catch:{ NumberFormatException -> 0x00df }
            throw r4     // Catch:{ NumberFormatException -> 0x00df }
        L_0x011c:
            int r7 = r7 + r2
            goto L_0x00b7
        L_0x011e:
            long r4 = java.lang.Long.parseLong(r3)     // Catch:{ NumberFormatException -> 0x00df }
            r1.B0 = r4     // Catch:{ NumberFormatException -> 0x00df }
            r1.z0 = r14     // Catch:{ NumberFormatException -> 0x00df }
        L_0x0126:
            return
        L_0x0127:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>(r10)
            java.lang.String r3 = C0(r3)
            r2.append(r3)
            r2.append(r9)
            java.lang.String r2 = r2.toString()
            com.fasterxml.jackson.core.JsonParseException r3 = new com.fasterxml.jackson.core.JsonParseException
            lp7 r1 = r17.o()
            r3.<init>(r2, r1, r0)
            throw r3
        L_0x0144:
            wp7 r2 = defpackage.wp7.VALUE_NUMBER_FLOAT
            if (r3 != r2) goto L_0x0190
            r2 = 16
            if (r0 != r2) goto L_0x0157
            java.math.BigDecimal r0 = r12.e()     // Catch:{ NumberFormatException -> 0x0155 }
            r1.E0 = r0     // Catch:{ NumberFormatException -> 0x0155 }
            r1.z0 = r2     // Catch:{ NumberFormatException -> 0x0155 }
            goto L_0x016e
        L_0x0155:
            r0 = move-exception
            goto L_0x016f
        L_0x0157:
            java.lang.String r0 = r12.l()     // Catch:{ NumberFormatException -> 0x0155 }
            java.lang.String r2 = defpackage.sga.a     // Catch:{ NumberFormatException -> 0x0155 }
            boolean r2 = r8.equals(r0)     // Catch:{ NumberFormatException -> 0x0155 }
            if (r2 == 0) goto L_0x0166
            r6 = 1
            goto L_0x016a
        L_0x0166:
            double r6 = java.lang.Double.parseDouble(r0)     // Catch:{ NumberFormatException -> 0x0155 }
        L_0x016a:
            r1.C0 = r6     // Catch:{ NumberFormatException -> 0x0155 }
            r1.z0 = r11     // Catch:{ NumberFormatException -> 0x0155 }
        L_0x016e:
            return
        L_0x016f:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>(r10)
            java.lang.String r3 = r12.l()
            java.lang.String r3 = C0(r3)
            r2.append(r3)
            r2.append(r9)
            java.lang.String r2 = r2.toString()
            com.fasterxml.jackson.core.JsonParseException r3 = new com.fasterxml.jackson.core.JsonParseException
            lp7 r1 = r17.o()
            r3.<init>(r2, r1, r0)
            throw r3
        L_0x0190:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r2 = "Current token ("
            r0.<init>(r2)
            r0.append(r3)
            java.lang.String r2 = ") not numeric, can not use numeric value accessors"
            r0.append(r2)
            java.lang.String r0 = r0.toString()
            com.fasterxml.jackson.core.JsonParseException r2 = new com.fasterxml.jackson.core.JsonParseException
            r2.<init>(r1, r0)
            throw r2
        L_0x01a9:
            java.lang.String r0 = "Internal error: _parseNumericValue called when parser instance closed"
            r1.F0(r0)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.m8b.D0(int):void");
    }

    public void E0() {
        char[] cArr;
        wef wef = this.w0;
        wef.d = -1;
        wef.g = 0;
        wef.e = 0;
        wef.i = null;
        wef.k = null;
        if (wef.b) {
            wef.c();
        }
        eu0 eu0 = (eu0) wef.h;
        if (!(eu0 == null || (cArr = (char[]) wef.j) == null)) {
            wef.j = null;
            eu0.b.set(2, cArr);
        }
        char[] cArr2 = this.x0;
        if (cArr2 != null) {
            this.x0 = null;
            o67 o67 = this.c;
            char[] cArr3 = (char[]) o67.h;
            if (cArr2 == cArr3 || cArr2.length >= cArr3.length) {
                o67.h = null;
                ((eu0) o67.d).b.set(3, cArr2);
                return;
            }
            throw new IllegalArgumentException("Trying to release buffer smaller than original");
        }
    }

    public final void F0(String str) {
        throw new StreamReadException(this, str);
    }

    public final void G0(String str) {
        throw new StreamReadException(this, a81.m("Unexpected end-of-input", str));
    }

    public final void H0(wp7 wp7) {
        G0(wp7 != wp7.VALUE_STRING ? (wp7 == wp7.VALUE_NUMBER_INT || wp7 == wp7.VALUE_NUMBER_FLOAT) ? " in a Number value" : " in a value" : " in a String value");
        throw null;
    }

    public final void I0(char c2, int i) {
        qp7 qp7 = this.Z;
        F0(String.format("Unexpected close marker '%s': expected '%c' (for %s starting at %s)", new Object[]{Character.valueOf((char) i), Character.valueOf(c2), qp7.e(), new lp7(qp7.g, qp7.h, -1, -1, y0())}));
        throw null;
    }

    public final void J0(int i, String str) {
        if (i >= 0) {
            String k = wj6.k("Unexpected character (", x0(i), ")");
            if (str != null) {
                k = g63.i(k, ": ", str);
            }
            F0(k);
            throw null;
        }
        G0(" in " + this.b);
        throw null;
    }

    public final void K0(int i) {
        F0("Illegal character (" + x0((char) i) + "): only regular white space (\\r, \\n, \\t) is allowed between tokens");
        throw null;
    }

    public final void L0(int i, String str) {
        if (!np7.ALLOW_UNQUOTED_CONTROL_CHARS.a(this.a) || i > 32) {
            F0("Illegal unquoted character (" + x0((char) i) + "): has to be escaped using backslash to be included in " + str);
            throw null;
        }
    }

    public final String M0() {
        return np7.ALLOW_NON_NUMERIC_NUMBERS.a(this.a) ? "(JSON String, Number (or 'NaN'/'INF'/'+INF'), Array, Object or token 'null', 'true' or 'false')" : "(JSON String, Number, Array, Object or token 'null', 'true' or 'false')";
    }

    public final void N0() {
        int i = this.z0;
        int i2 = i & 2;
        Integer valueOf = Integer.valueOf(IntCompanionObject.MAX_VALUE);
        Integer valueOf2 = Integer.valueOf(IntCompanionObject.MIN_VALUE);
        if (i2 != 0) {
            long j = this.B0;
            int i3 = (int) j;
            if (((long) i3) == j) {
                this.A0 = i3;
            } else {
                throw new StreamReadException(this, String.format("Numeric value (%s) out of range of int (%d - %s)", new Object[]{B0(r0()), valueOf2, valueOf}));
            }
        } else if ((i & 4) != 0) {
            if (I0.compareTo(this.D0) > 0 || J0.compareTo(this.D0) < 0) {
                throw new StreamReadException(this, String.format("Numeric value (%s) out of range of int (%d - %s)", new Object[]{B0(r0()), valueOf2, valueOf}));
            }
            this.A0 = this.D0.intValue();
        } else if ((i & 8) != 0) {
            double d = this.C0;
            if (d < -2.147483648E9d || d > 2.147483647E9d) {
                throw new StreamReadException(this, String.format("Numeric value (%s) out of range of int (%d - %s)", new Object[]{B0(r0()), valueOf2, valueOf}));
            }
            this.A0 = (int) d;
        } else if ((i & 16) == 0) {
            q2g.a();
            throw null;
        } else if (O0.compareTo(this.E0) > 0 || P0.compareTo(this.E0) < 0) {
            throw new StreamReadException(this, String.format("Numeric value (%s) out of range of int (%d - %s)", new Object[]{B0(r0()), valueOf2, valueOf}));
        } else {
            this.A0 = this.E0.intValue();
        }
        this.z0 |= 1;
    }

    public final void P0(String str) {
        throw new StreamReadException(this, String.format("Numeric value (%s) out of range of long (%d - %s)", new Object[]{B0(str), Long.MIN_VALUE, Long.valueOf(LongCompanionObject.MAX_VALUE)}));
    }

    public final void Q0(int i, String str) {
        String k = wj6.k("Unexpected character (", x0(i), ") in numeric value");
        F0(k + ": " + str);
        throw null;
    }

    public final wp7 R0(String str, double d) {
        wef wef = this.w0;
        wef.i = null;
        wef.d = -1;
        wef.e = 0;
        wef.c = str;
        wef.k = null;
        if (wef.b) {
            wef.c();
        }
        wef.g = 0;
        this.C0 = d;
        this.z0 = 8;
        return wp7.VALUE_NUMBER_FLOAT;
    }

    public final wp7 S0(int i, boolean z2) {
        this.F0 = z2;
        this.G0 = i;
        this.z0 = 0;
        return wp7.VALUE_NUMBER_INT;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x000a, code lost:
        r0 = r2.Z.c;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.String U() {
        /*
            r2 = this;
            wp7 r0 = r2.b
            wp7 r1 = defpackage.wp7.START_OBJECT
            if (r0 == r1) goto L_0x000a
            wp7 r1 = defpackage.wp7.START_ARRAY
            if (r0 != r1) goto L_0x0013
        L_0x000a:
            qp7 r0 = r2.Z
            qp7 r0 = r0.c
            if (r0 == 0) goto L_0x0013
            java.lang.String r2 = r0.f
            return r2
        L_0x0013:
            qp7 r2 = r2.Z
            java.lang.String r2 = r2.f
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.m8b.U():java.lang.String");
    }

    public final BigDecimal V() {
        int i = this.z0;
        if ((i & 16) == 0) {
            if (i == 0) {
                D0(16);
            }
            int i2 = this.z0;
            if ((i2 & 16) == 0) {
                if ((i2 & 8) != 0) {
                    String r0 = r0();
                    String str = sga.a;
                    try {
                        this.E0 = new BigDecimal(r0);
                    } catch (NumberFormatException unused) {
                        throw new NumberFormatException(wj6.k("Value \"", r0, "\" can not be represented as BigDecimal"));
                    }
                } else if ((i2 & 4) != 0) {
                    this.E0 = new BigDecimal(this.D0);
                } else if ((i2 & 2) != 0) {
                    this.E0 = BigDecimal.valueOf(this.B0);
                } else if ((i2 & 1) != 0) {
                    this.E0 = BigDecimal.valueOf((long) this.A0);
                } else {
                    q2g.a();
                    throw null;
                }
                this.z0 |= 16;
            }
        }
        return this.E0;
    }

    public final void close() {
        if (!this.o) {
            this.v = Math.max(this.v, this.w);
            this.o = true;
            try {
                w0();
            } finally {
                E0();
            }
        }
    }

    public final double e0() {
        int i = this.z0;
        if ((i & 8) == 0) {
            if (i == 0) {
                D0(8);
            }
            int i2 = this.z0;
            if ((i2 & 8) == 0) {
                if ((i2 & 16) != 0) {
                    this.C0 = this.E0.doubleValue();
                } else if ((i2 & 4) != 0) {
                    this.C0 = this.D0.doubleValue();
                } else if ((i2 & 2) != 0) {
                    this.C0 = (double) this.B0;
                } else if ((i2 & 1) != 0) {
                    this.C0 = (double) this.A0;
                } else {
                    q2g.a();
                    throw null;
                }
                this.z0 |= 8;
            }
        }
        return this.C0;
    }

    public final int k0() {
        int i = this.z0;
        if ((i & 1) == 0) {
            if (i == 0) {
                if (this.o) {
                    F0("Internal error: _parseNumericValue called when parser instance closed");
                    throw null;
                } else if (this.b != wp7.VALUE_NUMBER_INT || this.G0 > 9) {
                    D0(1);
                    if ((this.z0 & 1) == 0) {
                        N0();
                    }
                    return this.A0;
                } else {
                    int k = this.w0.k(this.F0);
                    this.A0 = k;
                    this.z0 = 1;
                    return k;
                }
            } else if ((i & 1) == 0) {
                N0();
            }
        }
        return this.A0;
    }

    public final int m() {
        wp7 wp7 = this.b;
        if (wp7 == null) {
            return 0;
        }
        return wp7.o;
    }

    public final long m0() {
        int i = this.z0;
        if ((i & 2) == 0) {
            if (i == 0) {
                D0(2);
            }
            int i2 = this.z0;
            if ((i2 & 2) == 0) {
                if ((i2 & 1) != 0) {
                    this.B0 = (long) this.A0;
                } else if ((i2 & 4) != 0) {
                    if (K0.compareTo(this.D0) > 0 || L0.compareTo(this.D0) < 0) {
                        P0(r0());
                        throw null;
                    }
                    this.B0 = this.D0.longValue();
                } else if ((i2 & 8) != 0) {
                    double d = this.C0;
                    if (d < -9.223372036854776E18d || d > 9.223372036854776E18d) {
                        P0(r0());
                        throw null;
                    }
                    this.B0 = (long) d;
                } else if ((i2 & 16) == 0) {
                    q2g.a();
                    throw null;
                } else if (M0.compareTo(this.E0) > 0 || N0.compareTo(this.E0) < 0) {
                    P0(r0());
                    throw null;
                } else {
                    this.B0 = this.E0.longValue();
                }
                this.z0 |= 2;
            }
        }
        return this.B0;
    }

    public final BigInteger n() {
        int i = this.z0;
        if ((i & 4) == 0) {
            if (i == 0) {
                D0(4);
            }
            int i2 = this.z0;
            if ((i2 & 4) == 0) {
                if ((i2 & 16) != 0) {
                    this.D0 = this.E0.toBigInteger();
                } else if ((i2 & 2) != 0) {
                    this.D0 = BigInteger.valueOf(this.B0);
                } else if ((i2 & 1) != 0) {
                    this.D0 = BigInteger.valueOf((long) this.A0);
                } else if ((i2 & 8) != 0) {
                    this.D0 = BigDecimal.valueOf(this.C0).toBigInteger();
                } else {
                    q2g.a();
                    throw null;
                }
                this.z0 |= 4;
            }
        }
        return this.D0;
    }

    public final int p0() {
        if (this.z0 == 0) {
            D0(0);
        }
        if (this.b != wp7.VALUE_NUMBER_INT) {
            return (this.z0 & 16) != 0 ? 6 : 5;
        }
        int i = this.z0;
        if ((i & 1) != 0) {
            return 1;
        }
        return (i & 2) != 0 ? 2 : 3;
    }

    public final Number q0() {
        if (this.z0 == 0) {
            D0(0);
        }
        if (this.b == wp7.VALUE_NUMBER_INT) {
            int i = this.z0;
            if ((i & 1) != 0) {
                return Integer.valueOf(this.A0);
            }
            if ((i & 2) != 0) {
                return Long.valueOf(this.B0);
            }
            if ((i & 4) != 0) {
                return this.D0;
            }
            q2g.a();
            throw null;
        }
        int i2 = this.z0;
        if ((i2 & 16) != 0) {
            return this.E0;
        }
        if ((i2 & 8) != 0) {
            return Double.valueOf(this.C0);
        }
        q2g.a();
        throw null;
    }

    public abstract void w0();

    public final Object y0() {
        if (np7.INCLUDE_SOURCE_IN_LOCATION.a(this.a)) {
            return this.c.a;
        }
        return null;
    }

    public final void z0() {
        if (!this.Z.d()) {
            String str = this.Z.b() ? "Array" : "Object";
            qp7 qp7 = this.Z;
            lp7 lp7 = new lp7(qp7.g, qp7.h, -1, -1, y0());
            G0(": expected close marker for " + str + " (start marker at " + lp7 + ")");
            throw null;
        }
    }
}
