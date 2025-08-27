package defpackage;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.core.exc.StreamReadException;
import java.io.BufferedInputStream;
import java.io.CharArrayWriter;
import java.io.IOException;
import java.util.HashMap;
import ru.ok.android.api.json.JsonStateException;
import ru.ok.android.api.json.JsonTypeMismatchException;

/* renamed from: tp7  reason: default package */
public final class tp7 extends u1 {
    public static final gp7 b = new gp7();
    public final pp7 a;

    public tp7(pp7 pp7) {
        this.a = pp7;
        try {
            pp7.v0();
        } catch (JsonParseException e) {
            throw new IOException(e);
        }
    }

    public static tp7 a(BufferedInputStream bufferedInputStream) {
        try {
            pp7 l = b.l(bufferedInputStream);
            new HashMap();
            return new tp7(l);
        } catch (JsonParseException e) {
            throw new IOException(e);
        }
    }

    public static tp7 b(String str) {
        try {
            pp7 n = b.n(str);
            new HashMap();
            return new tp7(n);
        } catch (JsonParseException e) {
            throw new IOException(e);
        }
    }

    public static String d(pp7 pp7) {
        CharArrayWriter charArrayWriter = new CharArrayWriter();
        ip7 k = b.k(charArrayWriter);
        k.getClass();
        m8b m8b = (m8b) pp7;
        wp7 wp7 = m8b.b;
        int i = -1;
        int i2 = wp7 == null ? -1 : wp7.o;
        if (i2 == 5) {
            k.o(pp7.U());
            wp7 v0 = pp7.v0();
            i2 = v0 == null ? -1 : v0.o;
        }
        boolean z = true;
        if (i2 == 1) {
            k.r0();
            k.a(pp7);
        } else if (i2 != 3) {
            wp7 wp72 = m8b.b;
            if (wp72 != null) {
                i = wp72.o;
            }
            switch (i) {
                case -1:
                    ip7.b("No current event to copy");
                    throw null;
                case 1:
                    k.r0();
                    break;
                case 2:
                    k.n();
                    break;
                case 3:
                    k.q0();
                    break;
                case 4:
                    k.m();
                    break;
                case 5:
                    k.o(pp7.U());
                    break;
                case 6:
                    m8b m8b2 = (m8b) pp7;
                    wp7 wp73 = m8b2.b;
                    if (wp73 != wp7.VALUE_STRING) {
                        z = wp73 == wp7.FIELD_NAME ? m8b2.y0 : false;
                    }
                    if (!z) {
                        k.s0(pp7.r0());
                        break;
                    } else {
                        k.t0(pp7.s0(), pp7.u0(), pp7.t0());
                        break;
                    }
                case 7:
                    int p0 = pp7.p0();
                    if (p0 != 1) {
                        if (p0 != 3) {
                            k.k0(pp7.m0());
                            break;
                        } else {
                            k.p0(pp7.n());
                            break;
                        }
                    } else {
                        k.e0(pp7.k0());
                        break;
                    }
                case 8:
                    int p02 = pp7.p0();
                    if (p02 != 6) {
                        if (p02 != 4) {
                            k.U(pp7.e0());
                            break;
                        } else {
                            k.V((float) ((m8b) pp7).e0());
                            break;
                        }
                    } else {
                        k.m0(pp7.V());
                        break;
                    }
                case 9:
                    k.d(true);
                    break;
                case 10:
                    k.d(false);
                    break;
                case 11:
                    drg drg = (drg) k;
                    drg.B0("write a null");
                    drg.C0();
                    break;
                case 12:
                    drg drg2 = (drg) ((pp6) k);
                    drg2.B0("write a null");
                    drg2.C0();
                    break;
                default:
                    throw new IllegalStateException("Internal error: unknown current token, " + wp72);
            }
        } else {
            k.q0();
            k.a(pp7);
        }
        k.close();
        return charArrayWriter.toString();
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [ru.ok.android.api.json.JsonTypeMismatchException, java.lang.Exception] */
    public static JsonTypeMismatchException g(int i, int i2) {
        return new Exception("Expected " + n79.W(i) + " was " + n79.W(i2));
    }

    public final void A() {
        pp7 pp7 = this.a;
        try {
            switch (pp7.m()) {
                case -1:
                    throw new UnsupportedOperationException("Non-blocking parsing not supported");
                case 0:
                    throw JsonStateException.d(0);
                case 1:
                case 3:
                    m8b m8b = (m8b) pp7;
                    wp7 wp7 = m8b.b;
                    if (wp7 == wp7.START_OBJECT || wp7 == wp7.START_ARRAY) {
                        int i = 1;
                        while (true) {
                            wp7 v0 = m8b.v0();
                            if (v0 == null) {
                                m8b.z0();
                            } else if (v0.v) {
                                i++;
                            } else if (v0.w) {
                                i--;
                                if (i == 0) {
                                }
                            } else if (v0 == wp7.NOT_AVAILABLE) {
                                throw new StreamReadException(m8b, "Not enough content available for `skipChildren()`: non-blocking parser? (" + m8b.getClass().getName() + ")");
                            }
                        }
                    }
                    pp7.v0();
                    return;
                case 2:
                    throw JsonStateException.d(125);
                case 4:
                    throw JsonStateException.d(93);
                case 5:
                    throw JsonStateException.d(39);
                case 6:
                case 7:
                case 8:
                case 9:
                case 10:
                case 11:
                    pp7.v0();
                    return;
                case 12:
                    throw new UnsupportedOperationException("Embedded objects not supported");
                default:
                    throw new AssertionError("Unknown JsonTokenId " + pp7.m());
            }
        } catch (JsonParseException e) {
            throw new IOException(e);
        }
    }

    public final int E() {
        return (int) x();
    }

    public final String I() {
        pp7 pp7 = this.a;
        try {
            switch (pp7.m()) {
                case -1:
                    throw new UnsupportedOperationException("Non-blocking parsing not supported");
                case 0:
                    throw JsonStateException.d(0);
                case 1:
                case 3:
                    String d = d(pp7);
                    pp7.v0();
                    return d;
                case 2:
                    throw JsonStateException.d(125);
                case 4:
                    throw JsonStateException.d(93);
                case 5:
                    throw JsonStateException.d(39);
                case 6:
                case 7:
                case 8:
                case 9:
                case 10:
                    String r0 = pp7.r0();
                    pp7.v0();
                    return r0;
                case 11:
                    pp7.v0();
                    return "null";
                case 12:
                    throw new UnsupportedOperationException("Embedded objects not supported");
                default:
                    throw new AssertionError("Unknown JsonTokenId " + pp7.m());
            }
        } catch (JsonParseException e) {
            throw new IOException(e);
        }
    }

    public final String W() {
        pp7 pp7 = this.a;
        try {
            switch (pp7.m()) {
                case -1:
                    throw new UnsupportedOperationException("Non-blocking parsing not supported");
                case 0:
                    return "";
                case 1:
                case 3:
                case 6:
                    String d = d(pp7);
                    pp7.v0();
                    return d;
                case 2:
                    throw JsonStateException.d(125);
                case 4:
                    throw JsonStateException.d(93);
                case 5:
                    throw JsonStateException.d(39);
                case 7:
                case 8:
                case 9:
                case 10:
                case 11:
                    String r0 = pp7.r0();
                    pp7.v0();
                    return r0;
                case 12:
                    throw new UnsupportedOperationException("Embedded objects not supported");
                default:
                    throw new AssertionError("Unknown JsonTokenId " + pp7.m());
            }
        } catch (JsonParseException e) {
            throw new IOException(e);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:37:0x008f A[Catch:{ JsonParseException -> 0x0027 }] */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x009c A[Catch:{ JsonParseException -> 0x0027 }, RETURN] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean b0() {
        /*
            r6 = this;
            pp7 r6 = r6.a
            java.lang.String r0 = "Unknown JsonTokenId "
            java.lang.String r1 = "Cannot parse boolean from string "
            int r2 = r6.m()     // Catch:{ JsonParseException -> 0x0027 }
            r3 = 98
            r4 = 1
            r5 = 0
            switch(r2) {
                case -1: goto L_0x00c5;
                case 0: goto L_0x00c0;
                case 1: goto L_0x00b9;
                case 2: goto L_0x00b2;
                case 3: goto L_0x00ab;
                case 4: goto L_0x00a4;
                case 5: goto L_0x009d;
                case 6: goto L_0x005e;
                case 7: goto L_0x004e;
                case 8: goto L_0x003e;
                case 9: goto L_0x003a;
                case 10: goto L_0x0036;
                case 11: goto L_0x0032;
                case 12: goto L_0x002a;
                default: goto L_0x0011;
            }     // Catch:{ JsonParseException -> 0x0027 }
        L_0x0011:
            java.lang.AssertionError r1 = new java.lang.AssertionError     // Catch:{ JsonParseException -> 0x0027 }
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ JsonParseException -> 0x0027 }
            r2.<init>(r0)     // Catch:{ JsonParseException -> 0x0027 }
            int r6 = r6.m()     // Catch:{ JsonParseException -> 0x0027 }
            r2.append(r6)     // Catch:{ JsonParseException -> 0x0027 }
            java.lang.String r6 = r2.toString()     // Catch:{ JsonParseException -> 0x0027 }
            r1.<init>(r6)     // Catch:{ JsonParseException -> 0x0027 }
            throw r1     // Catch:{ JsonParseException -> 0x0027 }
        L_0x0027:
            r6 = move-exception
            goto L_0x00cd
        L_0x002a:
            java.lang.UnsupportedOperationException r6 = new java.lang.UnsupportedOperationException     // Catch:{ JsonParseException -> 0x0027 }
            java.lang.String r0 = "Embedded objects not supported"
            r6.<init>(r0)     // Catch:{ JsonParseException -> 0x0027 }
            throw r6     // Catch:{ JsonParseException -> 0x0027 }
        L_0x0032:
            r6.v0()     // Catch:{ JsonParseException -> 0x0027 }
            return r5
        L_0x0036:
            r6.v0()     // Catch:{ JsonParseException -> 0x0027 }
            return r5
        L_0x003a:
            r6.v0()     // Catch:{ JsonParseException -> 0x0027 }
            return r4
        L_0x003e:
            double r0 = r6.e0()     // Catch:{ JsonParseException -> 0x0027 }
            r6.v0()     // Catch:{ JsonParseException -> 0x0027 }
            r2 = 0
            int r6 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r6 == 0) goto L_0x004c
            goto L_0x004d
        L_0x004c:
            r4 = r5
        L_0x004d:
            return r4
        L_0x004e:
            long r0 = r6.m0()     // Catch:{ JsonParseException -> 0x0027 }
            r6.v0()     // Catch:{ JsonParseException -> 0x0027 }
            r2 = 0
            int r6 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r6 == 0) goto L_0x005c
            goto L_0x005d
        L_0x005c:
            r4 = r5
        L_0x005d:
            return r4
        L_0x005e:
            java.lang.String r0 = r6.r0()     // Catch:{ JsonParseException -> 0x0027 }
            r6.v0()     // Catch:{ JsonParseException -> 0x0027 }
            java.lang.String r6 = r0.trim()     // Catch:{ JsonParseException -> 0x0027 }
            int r2 = r6.hashCode()     // Catch:{ JsonParseException -> 0x0027 }
            r3 = 3569038(0x36758e, float:5.001287E-39)
            if (r2 == r3) goto L_0x0082
            r3 = 97196323(0x5cb1923, float:1.9099262E-35)
            if (r2 == r3) goto L_0x0078
            goto L_0x008c
        L_0x0078:
            java.lang.String r2 = "false"
            boolean r6 = r6.equals(r2)     // Catch:{ JsonParseException -> 0x0027 }
            if (r6 == 0) goto L_0x008c
            r6 = r4
            goto L_0x008d
        L_0x0082:
            java.lang.String r2 = "true"
            boolean r6 = r6.equals(r2)     // Catch:{ JsonParseException -> 0x0027 }
            if (r6 == 0) goto L_0x008c
            r6 = r5
            goto L_0x008d
        L_0x008c:
            r6 = -1
        L_0x008d:
            if (r6 == 0) goto L_0x009c
            if (r6 != r4) goto L_0x0092
            return r5
        L_0x0092:
            ru.ok.android.api.json.JsonTypeMismatchException r6 = new ru.ok.android.api.json.JsonTypeMismatchException     // Catch:{ JsonParseException -> 0x0027 }
            java.lang.String r0 = r1.concat(r0)     // Catch:{ JsonParseException -> 0x0027 }
            r6.<init>(r0)     // Catch:{ JsonParseException -> 0x0027 }
            throw r6     // Catch:{ JsonParseException -> 0x0027 }
        L_0x009c:
            return r4
        L_0x009d:
            r6 = 39
            ru.ok.android.api.json.JsonStateException r6 = ru.ok.android.api.json.JsonStateException.d(r6)     // Catch:{ JsonParseException -> 0x0027 }
            throw r6     // Catch:{ JsonParseException -> 0x0027 }
        L_0x00a4:
            r6 = 93
            ru.ok.android.api.json.JsonStateException r6 = ru.ok.android.api.json.JsonStateException.d(r6)     // Catch:{ JsonParseException -> 0x0027 }
            throw r6     // Catch:{ JsonParseException -> 0x0027 }
        L_0x00ab:
            r6 = 91
            ru.ok.android.api.json.JsonTypeMismatchException r6 = g(r3, r6)     // Catch:{ JsonParseException -> 0x0027 }
            throw r6     // Catch:{ JsonParseException -> 0x0027 }
        L_0x00b2:
            r6 = 125(0x7d, float:1.75E-43)
            ru.ok.android.api.json.JsonStateException r6 = ru.ok.android.api.json.JsonStateException.d(r6)     // Catch:{ JsonParseException -> 0x0027 }
            throw r6     // Catch:{ JsonParseException -> 0x0027 }
        L_0x00b9:
            r6 = 123(0x7b, float:1.72E-43)
            ru.ok.android.api.json.JsonTypeMismatchException r6 = g(r3, r6)     // Catch:{ JsonParseException -> 0x0027 }
            throw r6     // Catch:{ JsonParseException -> 0x0027 }
        L_0x00c0:
            ru.ok.android.api.json.JsonStateException r6 = ru.ok.android.api.json.JsonStateException.d(r5)     // Catch:{ JsonParseException -> 0x0027 }
            throw r6     // Catch:{ JsonParseException -> 0x0027 }
        L_0x00c5:
            java.lang.UnsupportedOperationException r6 = new java.lang.UnsupportedOperationException     // Catch:{ JsonParseException -> 0x0027 }
            java.lang.String r0 = "Non-blocking parsing not supported"
            r6.<init>(r0)     // Catch:{ JsonParseException -> 0x0027 }
            throw r6     // Catch:{ JsonParseException -> 0x0027 }
        L_0x00cd:
            ru.ok.android.api.json.JsonSyntaxException r0 = new ru.ok.android.api.json.JsonSyntaxException
            r0.<init>(r6)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.tp7.b0():boolean");
    }

    public final void close() {
        ((m8b) this.a).close();
    }

    public final String g0() {
        pp7 pp7 = this.a;
        try {
            switch (pp7.m()) {
                case -1:
                    throw new UnsupportedOperationException("Non-blocking parsing not supported");
                case 0:
                    throw JsonStateException.d(0);
                case 1:
                case 3:
                    String d = d(pp7);
                    pp7.v0();
                    return d;
                case 2:
                    throw JsonStateException.d(125);
                case 4:
                    throw JsonStateException.d(93);
                case 5:
                    throw JsonStateException.d(39);
                case 6:
                case 7:
                case 8:
                case 9:
                case 10:
                    String r0 = pp7.r0();
                    pp7.v0();
                    return r0;
                case 11:
                    pp7.v0();
                    return null;
                case 12:
                    throw new UnsupportedOperationException("Embedded objects not supported");
                default:
                    throw new AssertionError("Unknown JsonTokenId " + pp7.m());
            }
        } catch (JsonParseException e) {
            throw new IOException(e);
        }
    }

    public final boolean hasNext() {
        pp7 pp7 = this.a;
        switch (pp7.m()) {
            case -1:
                throw new UnsupportedOperationException("Non-blocking parsing not supported");
            case 0:
            case 2:
            case 4:
                return false;
            case 1:
            case 3:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
                return true;
            case 12:
                throw new UnsupportedOperationException("Embedded objects not supported");
            default:
                throw new AssertionError("Unknown JsonTokenId " + pp7.m());
        }
    }

    public final String name() {
        pp7 pp7 = this.a;
        try {
            switch (pp7.m()) {
                case -1:
                    throw new UnsupportedOperationException("Non-blocking parsing not supported");
                case 0:
                    throw JsonStateException.c(0);
                case 1:
                    throw JsonStateException.c(123);
                case 2:
                    throw JsonStateException.c(125);
                case 3:
                    throw JsonStateException.c(91);
                case 4:
                    throw JsonStateException.c(93);
                case 5:
                    String U = pp7.U();
                    pp7.v0();
                    return U;
                case 6:
                    throw JsonStateException.c(34);
                case 7:
                case 8:
                    throw JsonStateException.c(49);
                case 9:
                case 10:
                    throw JsonStateException.c(98);
                case 11:
                    throw JsonStateException.c(110);
                case 12:
                    throw new UnsupportedOperationException("Embedded objects not supported");
                default:
                    throw new AssertionError("Unknown JsonTokenId " + pp7.m());
            }
        } catch (JsonParseException e) {
            throw new IOException(e);
        }
    }

    public final int peek() {
        pp7 pp7 = this.a;
        switch (pp7.m()) {
            case -1:
                throw new UnsupportedOperationException("Non-blocking parsing not supported");
            case 0:
                return 0;
            case 1:
                return 123;
            case 2:
                return 125;
            case 3:
                return 91;
            case 4:
                return 93;
            case 5:
                return 39;
            case 6:
                return 34;
            case 7:
            case 8:
                return 49;
            case 9:
            case 10:
                return 98;
            case 11:
                return 110;
            case 12:
                throw new UnsupportedOperationException("Embedded objects not supported");
            default:
                throw new AssertionError("Unknown JsonTokenId " + pp7.m());
        }
    }

    public final void r() {
        pp7 pp7 = this.a;
        try {
            switch (pp7.m()) {
                case -1:
                    throw new UnsupportedOperationException("Non-blocking parsing not supported");
                case 0:
                    throw JsonStateException.b(0);
                case 1:
                    throw JsonStateException.b(123);
                case 2:
                    pp7.v0();
                    return;
                case 3:
                    throw JsonStateException.b(91);
                case 4:
                    throw JsonStateException.b(93);
                case 5:
                    throw JsonStateException.b(39);
                case 6:
                    throw JsonStateException.b(34);
                case 7:
                case 8:
                    throw JsonStateException.b(49);
                case 9:
                case 10:
                    throw JsonStateException.b(98);
                case 11:
                    throw JsonStateException.b(110);
                case 12:
                    throw new UnsupportedOperationException("Embedded objects not supported");
                default:
                    throw new AssertionError("Unknown JsonTokenId " + pp7.m());
            }
        } catch (JsonParseException e) {
            throw new IOException(e);
        }
    }

    public final void t() {
        pp7 pp7 = this.a;
        try {
            switch (pp7.m()) {
                case -1:
                    throw new UnsupportedOperationException("Non-blocking parsing not supported");
                case 0:
                    throw JsonStateException.d(0);
                case 1:
                    pp7.v0();
                    return;
                case 2:
                    throw JsonStateException.d(125);
                case 3:
                    throw g(123, 91);
                case 4:
                    throw JsonStateException.d(93);
                case 5:
                    throw JsonStateException.d(39);
                case 6:
                    throw g(123, 34);
                case 7:
                case 8:
                    throw g(123, 49);
                case 9:
                case 10:
                    throw g(123, 98);
                case 11:
                    throw g(123, 110);
                case 12:
                    throw new UnsupportedOperationException("Embedded objects not supported");
                default:
                    throw new AssertionError("Unknown JsonTokenId " + pp7.m());
            }
        } catch (JsonParseException e) {
            throw new IOException(e);
        }
    }

    public final void u() {
        pp7 pp7 = this.a;
        try {
            switch (pp7.m()) {
                case -1:
                    throw new UnsupportedOperationException("Non-blocking parsing not supported");
                case 0:
                    throw JsonStateException.a(0);
                case 1:
                    throw JsonStateException.a(123);
                case 2:
                    throw JsonStateException.a(125);
                case 3:
                    throw JsonStateException.a(91);
                case 4:
                    pp7.v0();
                    return;
                case 5:
                    throw JsonStateException.a(39);
                case 6:
                    throw JsonStateException.a(34);
                case 7:
                case 8:
                    throw JsonStateException.a(49);
                case 9:
                case 10:
                    throw JsonStateException.a(98);
                case 11:
                    throw JsonStateException.a(110);
                case 12:
                    throw new UnsupportedOperationException("Embedded objects not supported");
                default:
                    throw new AssertionError("Unknown JsonTokenId " + pp7.m());
            }
        } catch (JsonParseException e) {
            throw new IOException(e);
        }
    }

    public final void v() {
        pp7 pp7 = this.a;
        try {
            switch (pp7.m()) {
                case -1:
                    throw new UnsupportedOperationException("Non-blocking parsing not supported");
                case 0:
                    throw JsonStateException.d(0);
                case 1:
                    throw g(91, 123);
                case 2:
                    throw JsonStateException.d(125);
                case 3:
                    pp7.v0();
                    return;
                case 4:
                    throw JsonStateException.d(93);
                case 5:
                    throw JsonStateException.d(39);
                case 6:
                    throw g(91, 34);
                case 7:
                case 8:
                    throw g(91, 49);
                case 9:
                case 10:
                    throw g(91, 98);
                case 11:
                    throw g(91, 110);
                case 12:
                    throw new UnsupportedOperationException("Embedded objects not supported");
                default:
                    throw new AssertionError("Unknown JsonTokenId " + pp7.m());
            }
        } catch (JsonParseException e) {
            throw new IOException(e);
        }
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(3:30|31|32) */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x0088, code lost:
        throw new java.lang.Exception("Cannot parse long from string " + r0);
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:30:0x0077 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final long x() {
        /*
            r6 = this;
            pp7 r6 = r6.a
            java.lang.String r0 = "Unknown JsonTokenId "
            java.lang.String r1 = "Cannot parse long from string "
            int r2 = r6.m()     // Catch:{ JsonParseException -> 0x0027 }
            r3 = 49
            r4 = 0
            switch(r2) {
                case -1: goto L_0x00b2;
                case 0: goto L_0x00ac;
                case 1: goto L_0x00a5;
                case 2: goto L_0x009e;
                case 3: goto L_0x0097;
                case 4: goto L_0x0090;
                case 5: goto L_0x0089;
                case 6: goto L_0x0067;
                case 7: goto L_0x0049;
                case 8: goto L_0x0040;
                case 9: goto L_0x003a;
                case 10: goto L_0x0036;
                case 11: goto L_0x0032;
                case 12: goto L_0x002a;
                default: goto L_0x0011;
            }     // Catch:{ JsonParseException -> 0x0027 }
        L_0x0011:
            java.lang.AssertionError r1 = new java.lang.AssertionError     // Catch:{ JsonParseException -> 0x0027 }
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ JsonParseException -> 0x0027 }
            r2.<init>(r0)     // Catch:{ JsonParseException -> 0x0027 }
            int r6 = r6.m()     // Catch:{ JsonParseException -> 0x0027 }
            r2.append(r6)     // Catch:{ JsonParseException -> 0x0027 }
            java.lang.String r6 = r2.toString()     // Catch:{ JsonParseException -> 0x0027 }
            r1.<init>(r6)     // Catch:{ JsonParseException -> 0x0027 }
            throw r1     // Catch:{ JsonParseException -> 0x0027 }
        L_0x0027:
            r6 = move-exception
            goto L_0x00ba
        L_0x002a:
            java.lang.UnsupportedOperationException r6 = new java.lang.UnsupportedOperationException     // Catch:{ JsonParseException -> 0x0027 }
            java.lang.String r0 = "Embedded objects not supported"
            r6.<init>(r0)     // Catch:{ JsonParseException -> 0x0027 }
            throw r6     // Catch:{ JsonParseException -> 0x0027 }
        L_0x0032:
            r6.v0()     // Catch:{ JsonParseException -> 0x0027 }
            return r4
        L_0x0036:
            r6.v0()     // Catch:{ JsonParseException -> 0x0027 }
            return r4
        L_0x003a:
            r6.v0()     // Catch:{ JsonParseException -> 0x0027 }
            r0 = 1
            return r0
        L_0x0040:
            double r0 = r6.e0()     // Catch:{ JsonParseException -> 0x0027 }
            r6.v0()     // Catch:{ JsonParseException -> 0x0027 }
            long r0 = (long) r0     // Catch:{ JsonParseException -> 0x0027 }
            return r0
        L_0x0049:
            int r0 = r6.p0()     // Catch:{ JsonParseException -> 0x0027 }
            int r0 = defpackage.tr1.y(r0)     // Catch:{ JsonParseException -> 0x0027 }
            if (r0 == 0) goto L_0x005f
            r1 = 1
            if (r0 == r1) goto L_0x005f
            java.lang.Number r0 = r6.q0()     // Catch:{ JsonParseException -> 0x0027 }
            long r0 = r0.longValue()     // Catch:{ JsonParseException -> 0x0027 }
            goto L_0x0063
        L_0x005f:
            long r0 = r6.m0()     // Catch:{ JsonParseException -> 0x0027 }
        L_0x0063:
            r6.v0()     // Catch:{ JsonParseException -> 0x0027 }
            return r0
        L_0x0067:
            java.lang.String r0 = r6.r0()     // Catch:{ JsonParseException -> 0x0027 }
            r6.v0()     // Catch:{ JsonParseException -> 0x0027 }
            java.lang.String r6 = r0.trim()     // Catch:{ NumberFormatException -> 0x0077 }
            long r0 = defpackage.t1.a(r6)     // Catch:{ NumberFormatException -> 0x0077 }
            return r0
        L_0x0077:
            ru.ok.android.api.json.JsonTypeMismatchException r6 = new ru.ok.android.api.json.JsonTypeMismatchException     // Catch:{ JsonParseException -> 0x0027 }
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ JsonParseException -> 0x0027 }
            r2.<init>(r1)     // Catch:{ JsonParseException -> 0x0027 }
            r2.append(r0)     // Catch:{ JsonParseException -> 0x0027 }
            java.lang.String r0 = r2.toString()     // Catch:{ JsonParseException -> 0x0027 }
            r6.<init>(r0)     // Catch:{ JsonParseException -> 0x0027 }
            throw r6     // Catch:{ JsonParseException -> 0x0027 }
        L_0x0089:
            r6 = 39
            ru.ok.android.api.json.JsonStateException r6 = ru.ok.android.api.json.JsonStateException.d(r6)     // Catch:{ JsonParseException -> 0x0027 }
            throw r6     // Catch:{ JsonParseException -> 0x0027 }
        L_0x0090:
            r6 = 93
            ru.ok.android.api.json.JsonStateException r6 = ru.ok.android.api.json.JsonStateException.d(r6)     // Catch:{ JsonParseException -> 0x0027 }
            throw r6     // Catch:{ JsonParseException -> 0x0027 }
        L_0x0097:
            r6 = 91
            ru.ok.android.api.json.JsonTypeMismatchException r6 = g(r3, r6)     // Catch:{ JsonParseException -> 0x0027 }
            throw r6     // Catch:{ JsonParseException -> 0x0027 }
        L_0x009e:
            r6 = 125(0x7d, float:1.75E-43)
            ru.ok.android.api.json.JsonStateException r6 = ru.ok.android.api.json.JsonStateException.d(r6)     // Catch:{ JsonParseException -> 0x0027 }
            throw r6     // Catch:{ JsonParseException -> 0x0027 }
        L_0x00a5:
            r6 = 123(0x7b, float:1.72E-43)
            ru.ok.android.api.json.JsonTypeMismatchException r6 = g(r3, r6)     // Catch:{ JsonParseException -> 0x0027 }
            throw r6     // Catch:{ JsonParseException -> 0x0027 }
        L_0x00ac:
            r6 = 0
            ru.ok.android.api.json.JsonStateException r6 = ru.ok.android.api.json.JsonStateException.d(r6)     // Catch:{ JsonParseException -> 0x0027 }
            throw r6     // Catch:{ JsonParseException -> 0x0027 }
        L_0x00b2:
            java.lang.UnsupportedOperationException r6 = new java.lang.UnsupportedOperationException     // Catch:{ JsonParseException -> 0x0027 }
            java.lang.String r0 = "Non-blocking parsing not supported"
            r6.<init>(r0)     // Catch:{ JsonParseException -> 0x0027 }
            throw r6     // Catch:{ JsonParseException -> 0x0027 }
        L_0x00ba:
            ru.ok.android.api.json.JsonSyntaxException r0 = new ru.ok.android.api.json.JsonSyntaxException
            r0.<init>(r6)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.tp7.x():long");
    }
}
