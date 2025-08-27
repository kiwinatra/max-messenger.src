package defpackage;

import java.io.Closeable;
import java.io.EOFException;
import java.io.IOException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import kotlin.UByte;
import kotlin.UShort;
import kotlin.Unit;
import kotlin.jvm.internal.IntCompanionObject;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntProgression;
import kotlin.ranges.RangesKt;

/* renamed from: d47  reason: default package */
public final class d47 implements Closeable {
    public static final Logger v = Logger.getLogger(n37.class.getName());
    public final c47 a;
    public final e37 b;
    public final xu0 c;
    public final boolean o;

    public d47(xu0 xu0, boolean z) {
        this.c = xu0;
        this.o = z;
        c47 c47 = new c47(xu0);
        this.a = c47;
        this.b = new e37(c47);
    }

    public final boolean a(boolean z, fb1 fb1) {
        int i;
        int readInt;
        int i2;
        h47[] h47Arr;
        fb1 fb12 = fb1;
        int i3 = 0;
        try {
            this.c.i0(9);
            int r = u0g.r(this.c);
            if (r <= 16384) {
                byte readByte = this.c.readByte() & UByte.MAX_VALUE;
                byte readByte2 = this.c.readByte();
                byte b2 = readByte2 & UByte.MAX_VALUE;
                int readInt2 = this.c.readInt();
                int i4 = Integer.MAX_VALUE & readInt2;
                Logger logger = v;
                if (logger.isLoggable(Level.FINE)) {
                    logger.fine(n37.a(true, i4, r, readByte, b2));
                }
                if (!z || readByte == 4) {
                    switch (readByte) {
                        case 0:
                            d(fb12, r, b2, i4);
                            break;
                        case 1:
                            j(fb12, r, b2, i4);
                            break;
                        case 2:
                            if (r != 5) {
                                throw new IOException(a81.j(r, "TYPE_PRIORITY length: ", " != 5"));
                            } else if (i4 != 0) {
                                xu0 xu0 = this.c;
                                xu0.readInt();
                                xu0.readByte();
                                fb1.getClass();
                                break;
                            } else {
                                throw new IOException("TYPE_PRIORITY streamId == 0");
                            }
                        case 3:
                            if (r != 4) {
                                throw new IOException(a81.j(r, "TYPE_RST_STREAM length: ", " != 4"));
                            } else if (i4 != 0) {
                                int readInt3 = this.c.readInt();
                                int[] A = tr1.A(14);
                                int length = A.length;
                                int i5 = 0;
                                while (true) {
                                    if (i5 < length) {
                                        i = A[i5];
                                        if (tr1.y(i) != readInt3) {
                                            i5++;
                                        }
                                    } else {
                                        i = 0;
                                    }
                                }
                                if (i != 0) {
                                    a47 a47 = (a47) fb12.c;
                                    a47.getClass();
                                    if (i4 != 0 && (readInt2 & 1) == 0) {
                                        i3 = 1;
                                    }
                                    if (i3 == 0) {
                                        h47 g = a47.g(i4);
                                        if (g != null) {
                                            synchronized (g) {
                                                if (g.k == 0) {
                                                    g.k = i;
                                                    g.notifyAll();
                                                }
                                                break;
                                            }
                                        }
                                    } else {
                                        a47.X.c(new x37(a47.o + '[' + i4 + "] onReset", a47, i4, i), 0);
                                        break;
                                    }
                                } else {
                                    throw new IOException(wj6.h(readInt3, "TYPE_RST_STREAM unexpected error code: "));
                                }
                            } else {
                                throw new IOException("TYPE_RST_STREAM streamId == 0");
                            }
                            break;
                        case 4:
                            if (i4 != 0) {
                                throw new IOException("TYPE_SETTINGS streamId != 0");
                            } else if ((readByte2 & 1) != 0) {
                                if (r == 0) {
                                    fb1.getClass();
                                    break;
                                } else {
                                    throw new IOException("FRAME_SIZE_ERROR ack frame should be empty!");
                                }
                            } else if (r % 6 == 0) {
                                a0e a0e = new a0e();
                                IntProgression step = RangesKt.step((IntProgression) RangesKt.until(0, r), 6);
                                int first = step.getFirst();
                                int last = step.getLast();
                                int step2 = step.getStep();
                                if (step2 < 0 ? first >= last : first <= last) {
                                    while (true) {
                                        xu0 xu02 = this.c;
                                        short readShort = xu02.readShort();
                                        byte[] bArr = u0g.a;
                                        short s = readShort & UShort.MAX_VALUE;
                                        readInt = xu02.readInt();
                                        if (s != 2) {
                                            if (s == 3) {
                                                s = 4;
                                            } else if (s != 4) {
                                                if (s == 5) {
                                                    if (readInt < 16384 || readInt > 16777215) {
                                                    }
                                                }
                                            } else if (readInt >= 0) {
                                                s = 7;
                                            } else {
                                                throw new IOException("PROTOCOL_ERROR SETTINGS_INITIAL_WINDOW_SIZE > 2^31 - 1");
                                            }
                                        } else if (!(readInt == 0 || readInt == 1)) {
                                            throw new IOException("PROTOCOL_ERROR SETTINGS_ENABLE_PUSH != 0 or 1");
                                        }
                                        a0e.b(s, readInt);
                                        if (first != last) {
                                            first += step2;
                                        }
                                    }
                                    throw new IOException(wj6.h(readInt, "PROTOCOL_ERROR SETTINGS_MAX_FRAME_SIZE: "));
                                }
                                a47 a472 = (a47) fb12.c;
                                a472.z.c(new u37(wj6.n(new StringBuilder(), a472.o, " applyAndAckSettings"), fb12, a0e), 0);
                                break;
                            } else {
                                throw new IOException(wj6.h(r, "TYPE_SETTINGS length % 6 != 0: "));
                            }
                        case 5:
                            m(fb12, r, b2, i4);
                            break;
                        case 6:
                            if (r != 8) {
                                throw new IOException(wj6.h(r, "TYPE_PING length != 8: "));
                            } else if (i4 == 0) {
                                int readInt4 = this.c.readInt();
                                int readInt5 = this.c.readInt();
                                if ((readByte2 & 1) == 0) {
                                    ((a47) fb12.c).z.c(new t37(wj6.n(new StringBuilder(), ((a47) fb12.c).o, " ping"), readInt4, readInt5, 0, fb1), 0);
                                    break;
                                } else {
                                    synchronized (((a47) fb12.c)) {
                                        if (readInt4 == 1) {
                                            ((a47) fb12.c).w0++;
                                        } else if (readInt4 != 2) {
                                            if (readInt4 == 3) {
                                                a47 a473 = (a47) fb12.c;
                                                a473.getClass();
                                                a473.notifyAll();
                                            }
                                            try {
                                                Unit unit = Unit.INSTANCE;
                                            } catch (Throwable th) {
                                                throw th;
                                            }
                                        } else {
                                            ((a47) fb12.c).y0++;
                                        }
                                        break;
                                    }
                                }
                            } else {
                                throw new IOException("TYPE_PING streamId != 0");
                            }
                        case 7:
                            if (r < 8) {
                                throw new IOException(wj6.h(r, "TYPE_GOAWAY length < 8: "));
                            } else if (i4 == 0) {
                                int readInt6 = this.c.readInt();
                                int readInt7 = this.c.readInt();
                                int i6 = r - 8;
                                int[] A2 = tr1.A(14);
                                int length2 = A2.length;
                                int i7 = 0;
                                while (true) {
                                    if (i7 < length2) {
                                        i2 = A2[i7];
                                        if (tr1.y(i2) != readInt7) {
                                            i7++;
                                        }
                                    } else {
                                        i2 = 0;
                                    }
                                }
                                if (i2 != 0) {
                                    vw0 vw0 = vw0.o;
                                    if (i6 > 0) {
                                        vw0 = this.c.f((long) i6);
                                    }
                                    fb1.getClass();
                                    vw0.c();
                                    synchronized (((a47) fb12.c)) {
                                        Object[] array = ((a47) fb12.c).c.values().toArray(new h47[0]);
                                        if (array != null) {
                                            h47Arr = (h47[]) array;
                                            ((a47) fb12.c).x = true;
                                            Unit unit2 = Unit.INSTANCE;
                                        } else {
                                            throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
                                        }
                                    }
                                    int length3 = h47Arr.length;
                                    while (i3 < length3) {
                                        h47 h47 = h47Arr[i3];
                                        if (h47.m > readInt6 && h47.h()) {
                                            synchronized (h47) {
                                                if (h47.k == 0) {
                                                    h47.k = 8;
                                                    h47.notifyAll();
                                                }
                                            }
                                            ((a47) fb12.c).g(h47.m);
                                        }
                                        i3++;
                                    }
                                    break;
                                } else {
                                    throw new IOException(wj6.h(readInt7, "TYPE_GOAWAY unexpected error code: "));
                                }
                            } else {
                                throw new IOException("TYPE_GOAWAY streamId != 0");
                            }
                        case 8:
                            if (r == 4) {
                                long readInt8 = ((long) this.c.readInt()) & 2147483647L;
                                int i8 = (readInt8 > 0 ? 1 : (readInt8 == 0 ? 0 : -1));
                                if (i8 != 0) {
                                    if (i4 != 0) {
                                        h47 d = ((a47) fb12.c).d(i4);
                                        if (d != null) {
                                            synchronized (d) {
                                                d.d += readInt8;
                                                if (i8 > 0) {
                                                    d.notifyAll();
                                                }
                                                Unit unit3 = Unit.INSTANCE;
                                                break;
                                            }
                                        }
                                    } else {
                                        synchronized (((a47) fb12.c)) {
                                            a47 a474 = (a47) fb12.c;
                                            a474.F0 += readInt8;
                                            a474.notifyAll();
                                            Unit unit4 = Unit.INSTANCE;
                                            break;
                                        }
                                    }
                                } else {
                                    throw new IOException("windowSizeIncrement was 0");
                                }
                            } else {
                                throw new IOException(wj6.h(r, "TYPE_WINDOW_UPDATE length !=4: "));
                            }
                            break;
                        default:
                            this.c.S((long) r);
                            break;
                    }
                    return true;
                }
                StringBuilder sb = new StringBuilder("Expected a SETTINGS frame but was ");
                String[] strArr = n37.b;
                sb.append(readByte < strArr.length ? strArr[readByte] : u0g.h("0x%02x", Integer.valueOf(readByte)));
                throw new IOException(sb.toString());
            }
            throw new IOException(wj6.h(r, "FRAME_SIZE_ERROR: "));
        } catch (EOFException unused) {
            return false;
        }
    }

    public final void b(fb1 fb1) {
        if (!this.o) {
            vw0 vw0 = n37.a;
            vw0 f = this.c.f((long) vw0.c.length);
            Level level = Level.FINE;
            Logger logger = v;
            if (logger.isLoggable(level)) {
                logger.fine(u0g.h("<< CONNECTION " + f.d(), new Object[0]));
            }
            if (!Intrinsics.areEqual((Object) vw0, (Object) f)) {
                throw new IOException("Expected a connection header but was ".concat(f.j()));
            }
        } else if (!a(true, fb1)) {
            throw new IOException("Required SETTINGS preface not received");
        }
    }

    public final void close() {
        this.c.close();
    }

    /* JADX WARNING: type inference failed for: r5v11, types: [java.lang.Object, rt0] */
    public final void d(fb1 fb1, int i, int i2, int i3) {
        byte b2;
        int i4;
        boolean z;
        boolean z2;
        boolean z3;
        long j;
        fb1 fb12 = fb1;
        int i5 = i2;
        int i6 = i3;
        if (i6 != 0) {
            boolean z4 = (i5 & 1) != 0;
            if ((i5 & 32) == 0) {
                if ((i5 & 8) != 0) {
                    byte readByte = this.c.readByte();
                    byte[] bArr = u0g.a;
                    b2 = readByte & UByte.MAX_VALUE;
                    i4 = i;
                } else {
                    i4 = i;
                    b2 = 0;
                }
                int E = n79.E(i4, i5, b2);
                xu0 xu0 = this.c;
                ((a47) fb12.c).getClass();
                if (i6 != 0 && (i6 & 1) == 0) {
                    a47 a47 = (a47) fb12.c;
                    a47.getClass();
                    ? obj = new Object();
                    long j2 = (long) E;
                    xu0.i0(j2);
                    xu0.e(obj, j2);
                    a47.X.c(new v37(a47.o + '[' + i6 + "] onData", a47, i3, obj, E, z4), 0);
                } else {
                    h47 d = ((a47) fb12.c).d(i6);
                    if (d == null) {
                        ((a47) fb12.c).o(i6, 2);
                        long j3 = (long) E;
                        ((a47) fb12.c).m(j3);
                        xu0.S(j3);
                    } else {
                        byte[] bArr2 = u0g.a;
                        f47 f47 = d.g;
                        long j4 = (long) E;
                        f47.getClass();
                        while (true) {
                            if (j4 <= 0) {
                                z = z4;
                                break;
                            }
                            synchronized (f47.w) {
                                z2 = f47.v;
                                z = z4;
                                z3 = f47.b.b + j4 > f47.o;
                                Unit unit = Unit.INSTANCE;
                            }
                            if (z3) {
                                xu0.S(j4);
                                f47.w.e(4);
                                break;
                            } else if (z2) {
                                xu0.S(j4);
                                break;
                            } else {
                                long e = xu0.e(f47.a, j4);
                                if (e != -1) {
                                    j4 -= e;
                                    synchronized (f47.w) {
                                        try {
                                            if (f47.c) {
                                                rt0 rt0 = f47.a;
                                                j = rt0.b;
                                                rt0.m();
                                            } else {
                                                rt0 rt02 = f47.b;
                                                boolean z5 = rt02.b == 0;
                                                rt02.t0(f47.a);
                                                if (z5) {
                                                    h47 h47 = f47.w;
                                                    if (h47 != null) {
                                                        h47.notifyAll();
                                                    } else {
                                                        throw new NullPointerException("null cannot be cast to non-null type java.lang.Object");
                                                    }
                                                }
                                                j = 0;
                                            }
                                        } catch (Throwable th) {
                                            throw th;
                                        }
                                    }
                                    if (j > 0) {
                                        f47.a(j);
                                    }
                                    z4 = z;
                                } else {
                                    throw new EOFException();
                                }
                            }
                        }
                        if (z) {
                            d.j(u0g.b, true);
                        }
                    }
                }
                this.c.S((long) b2);
                return;
            }
            throw new IOException("PROTOCOL_ERROR: FLAG_COMPRESSED without SETTINGS_COMPRESS_DATA");
        }
        throw new IOException("PROTOCOL_ERROR: TYPE_DATA streamId == 0");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0064, code lost:
        throw new java.io.IOException(defpackage.wj6.h(r7, "Header index too large "));
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.util.List g(int r6, int r7, int r8, int r9) {
        /*
            r5 = this;
            r0 = 32
            r1 = 64
            r2 = 128(0x80, float:1.794E-43)
            c47 r3 = r5.a
            r3.o = r6
            r3.a = r6
            r3.v = r7
            r3.b = r8
            r3.c = r9
        L_0x0012:
            e37 r6 = r5.b
            gtc r7 = r6.b
            boolean r8 = r7.C()
            java.util.ArrayList r9 = r6.a
            if (r8 != 0) goto L_0x0122
            byte r7 = r7.readByte()
            byte[] r8 = defpackage.u0g.a
            r8 = r7 & 255(0xff, float:3.57E-43)
            if (r8 == r2) goto L_0x011a
            r3 = r7 & 128(0x80, float:1.794E-43)
            if (r3 != r2) goto L_0x0065
            r7 = 127(0x7f, float:1.78E-43)
            int r7 = r6.e(r8, r7)
            int r8 = r7 + -1
            if (r8 < 0) goto L_0x0043
            zw6[] r3 = defpackage.g37.a
            int r4 = r3.length
            int r4 = r4 + -1
            if (r8 > r4) goto L_0x0043
            r6 = r3[r8]
            r9.add(r6)
            goto L_0x0012
        L_0x0043:
            zw6[] r3 = defpackage.g37.a
            int r3 = r3.length
            int r8 = r8 - r3
            int r3 = r6.d
            int r3 = r3 + 1
            int r3 = r3 + r8
            if (r3 < 0) goto L_0x0059
            zw6[] r6 = r6.c
            int r8 = r6.length
            if (r3 >= r8) goto L_0x0059
            r6 = r6[r3]
            r9.add(r6)
            goto L_0x0012
        L_0x0059:
            java.io.IOException r5 = new java.io.IOException
            java.lang.String r6 = "Header index too large "
            java.lang.String r6 = defpackage.wj6.h(r7, r6)
            r5.<init>(r6)
            throw r5
        L_0x0065:
            if (r8 != r1) goto L_0x007d
            zw6[] r7 = defpackage.g37.a
            vw0 r7 = r6.d()
            defpackage.g37.a(r7)
            vw0 r8 = r6.d()
            zw6 r9 = new zw6
            r9.<init>((defpackage.vw0) r7, (defpackage.vw0) r8)
            r6.c(r9)
            goto L_0x0012
        L_0x007d:
            r3 = r7 & 64
            if (r3 != r1) goto L_0x009b
            r7 = 63
            int r7 = r6.e(r8, r7)
            int r7 = r7 + -1
            vw0 r7 = r6.b(r7)
            vw0 r8 = r6.d()
            zw6 r9 = new zw6
            r9.<init>((defpackage.vw0) r7, (defpackage.vw0) r8)
            r6.c(r9)
            goto L_0x0012
        L_0x009b:
            r7 = r7 & r0
            if (r7 != r0) goto L_0x00e2
            r7 = 31
            int r7 = r6.e(r8, r7)
            r6.g = r7
            if (r7 < 0) goto L_0x00cc
            r8 = 4096(0x1000, float:5.74E-42)
            if (r7 > r8) goto L_0x00cc
            int r8 = r6.f
            if (r7 >= r8) goto L_0x0012
            if (r7 != 0) goto L_0x00c6
            zw6[] r7 = r6.c
            r8 = 0
            kotlin.collections.ArraysKt___ArraysJvmKt.fill$default((java.lang.Object[]) r7, (java.lang.Object) r8, 0, 0, 6, (java.lang.Object) null)
            zw6[] r7 = r6.c
            int r7 = r7.length
            int r7 = r7 + -1
            r6.d = r7
            r7 = 0
            r6.e = r7
            r6.f = r7
            goto L_0x0012
        L_0x00c6:
            int r8 = r8 - r7
            r6.a(r8)
            goto L_0x0012
        L_0x00cc:
            java.io.IOException r5 = new java.io.IOException
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            java.lang.String r8 = "Invalid dynamic table size update "
            r7.<init>(r8)
            int r6 = r6.g
            r7.append(r6)
            java.lang.String r6 = r7.toString()
            r5.<init>(r6)
            throw r5
        L_0x00e2:
            r7 = 16
            if (r8 == r7) goto L_0x0103
            if (r8 != 0) goto L_0x00e9
            goto L_0x0103
        L_0x00e9:
            r7 = 15
            int r7 = r6.e(r8, r7)
            int r7 = r7 + -1
            vw0 r7 = r6.b(r7)
            vw0 r6 = r6.d()
            zw6 r8 = new zw6
            r8.<init>((defpackage.vw0) r7, (defpackage.vw0) r6)
            r9.add(r8)
            goto L_0x0012
        L_0x0103:
            zw6[] r7 = defpackage.g37.a
            vw0 r7 = r6.d()
            defpackage.g37.a(r7)
            vw0 r6 = r6.d()
            zw6 r8 = new zw6
            r8.<init>((defpackage.vw0) r7, (defpackage.vw0) r6)
            r9.add(r8)
            goto L_0x0012
        L_0x011a:
            java.io.IOException r5 = new java.io.IOException
            java.lang.String r6 = "index == 0"
            r5.<init>(r6)
            throw r5
        L_0x0122:
            java.util.List r5 = kotlin.collections.CollectionsKt.toList(r9)
            r9.clear()
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.d47.g(int, int, int, int):java.util.List");
    }

    public final void j(fb1 fb1, int i, int i2, int i3) {
        byte b2;
        boolean z = true;
        if (i3 != 0) {
            boolean z2 = (i2 & 1) != 0;
            if ((i2 & 8) != 0) {
                byte readByte = this.c.readByte();
                byte[] bArr = u0g.a;
                b2 = readByte & UByte.MAX_VALUE;
            } else {
                b2 = 0;
            }
            if ((i2 & 32) != 0) {
                xu0 xu0 = this.c;
                xu0.readInt();
                xu0.readByte();
                byte[] bArr2 = u0g.a;
                fb1.getClass();
                i -= 5;
            }
            List g = g(n79.E(i, i2, b2), b2, i2, i3);
            ((a47) fb1.c).getClass();
            if (i3 == 0 || (i3 & 1) != 0) {
                z = false;
            }
            if (z) {
                a47 a47 = (a47) fb1.c;
                a47.X.c(new w37(a47.o + '[' + i3 + "] onHeaders", a47, i3, g, z2), 0);
                return;
            }
            synchronized (((a47) fb1.c)) {
                h47 d = ((a47) fb1.c).d(i3);
                if (d == null) {
                    a47 a472 = (a47) fb1.c;
                    if (!a472.x) {
                        if (i3 > a472.v) {
                            if (i3 % 2 != a472.w % 2) {
                                h47 h47 = new h47(i3, (a47) fb1.c, false, z2, u0g.t(g));
                                a47 a473 = (a47) fb1.c;
                                a473.v = i3;
                                a473.c.put(Integer.valueOf(i3), h47);
                                ((a47) fb1.c).y.f().c(new s37(((a47) fb1.c).o + '[' + i3 + "] onStream", h47, fb1, g), 0);
                                return;
                            }
                            return;
                        }
                        return;
                    }
                    return;
                }
                Unit unit = Unit.INSTANCE;
                d.j(u0g.t(g), z2);
                return;
            }
        }
        throw new IOException("PROTOCOL_ERROR: TYPE_HEADERS streamId == 0");
    }

    public final void m(fb1 fb1, int i, int i2, int i3) {
        byte b2;
        if (i3 != 0) {
            if ((i2 & 8) != 0) {
                byte readByte = this.c.readByte();
                byte[] bArr = u0g.a;
                b2 = readByte & UByte.MAX_VALUE;
            } else {
                b2 = 0;
            }
            int readInt = this.c.readInt() & IntCompanionObject.MAX_VALUE;
            List g = g(n79.E(i - 4, i2, b2), b2, i2, i3);
            a47 a47 = (a47) fb1.c;
            synchronized (a47) {
                if (a47.J0.contains(Integer.valueOf(readInt))) {
                    a47.o(readInt, 2);
                    return;
                }
                a47.J0.add(Integer.valueOf(readInt));
                cef cef = a47.X;
                cef.c(new w37(a47.o + '[' + readInt + "] onRequest", a47, readInt, g), 0);
                return;
            }
        }
        throw new IOException("PROTOCOL_ERROR: TYPE_PUSH_PROMISE streamId == 0");
    }
}
