package defpackage;

import java.io.EOFException;
import java.io.IOException;
import java.util.Arrays;
import java.util.zip.CRC32;
import java.util.zip.Inflater;
import kotlin.jvm.internal.LongCompanionObject;

/* renamed from: kv6  reason: default package */
public final class kv6 implements yfe {
    public byte a;
    public final gtc b;
    public final Inflater c;
    public final cf7 o;
    public final CRC32 v = new CRC32();

    public kv6(yfe yfe) {
        gtc gtc = new gtc(yfe);
        this.b = gtc;
        Inflater inflater = new Inflater(true);
        this.c = inflater;
        this.o = new cf7(gtc, inflater);
    }

    public static void a(int i, int i2, String str) {
        if (i2 != i) {
            throw new IOException(String.format("%s: actual 0x%08x != expected 0x%08x", Arrays.copyOf(new Object[]{str, Integer.valueOf(i2), Integer.valueOf(i)}, 3)));
        }
    }

    public final void b(rt0 rt0, long j, long j2) {
        hod hod = rt0.a;
        while (true) {
            int i = hod.c;
            int i2 = hod.b;
            if (j < ((long) (i - i2))) {
                break;
            }
            j -= (long) (i - i2);
            hod = hod.f;
        }
        while (j2 > 0) {
            int i3 = (int) (((long) hod.b) + j);
            int min = (int) Math.min((long) (hod.c - i3), j2);
            this.v.update(hod.a, i3, min);
            j2 -= (long) min;
            hod = hod.f;
            j = 0;
        }
    }

    public final void close() {
        this.o.close();
    }

    public final long e(rt0 rt0, long j) {
        gtc gtc;
        rt0 rt02;
        long j2;
        rt0 rt03 = rt0;
        long j3 = j;
        int i = (j3 > 0 ? 1 : (j3 == 0 ? 0 : -1));
        if (i < 0) {
            throw new IllegalArgumentException(wj6.i(j3, "byteCount < 0: ").toString());
        } else if (i == 0) {
            return 0;
        } else {
            byte b2 = this.a;
            CRC32 crc32 = this.v;
            gtc gtc2 = this.b;
            if (b2 == 0) {
                gtc2.i0(10);
                rt0 rt04 = gtc2.a;
                byte U = rt04.U(3);
                boolean z = ((U >> 1) & 1) == 1;
                if (z) {
                    b(gtc2.a, 0, 10);
                }
                a(8075, gtc2.readShort(), "ID1ID2");
                gtc2.S(8);
                if (((U >> 2) & 1) == 1) {
                    gtc2.i0(2);
                    if (z) {
                        b(gtc2.a, 0, 2);
                    }
                    short readShort = rt04.readShort();
                    long j4 = (long) ((short) (((readShort & 255) << 8) | ((readShort & 65280) >>> 8)));
                    gtc2.i0(j4);
                    if (z) {
                        b(gtc2.a, 0, j4);
                        j2 = j4;
                    } else {
                        j2 = j4;
                    }
                    gtc2.S(j2);
                }
                if (((U >> 3) & 1) == 1) {
                    rt02 = rt04;
                    gtc gtc3 = gtc2;
                    long a2 = gtc2.a((byte) 0, 0, LongCompanionObject.MAX_VALUE);
                    if (a2 != -1) {
                        if (z) {
                            gtc = gtc3;
                            b(gtc3.a, 0, a2 + 1);
                        } else {
                            gtc = gtc3;
                        }
                        gtc.S(a2 + 1);
                    } else {
                        throw new EOFException();
                    }
                } else {
                    rt02 = rt04;
                    gtc = gtc2;
                }
                if (((U >> 4) & 1) == 1) {
                    long a3 = gtc.a((byte) 0, 0, LongCompanionObject.MAX_VALUE);
                    if (a3 != -1) {
                        if (z) {
                            b(gtc.a, 0, a3 + 1);
                        }
                        gtc.S(a3 + 1);
                    } else {
                        throw new EOFException();
                    }
                }
                if (z) {
                    gtc.i0(2);
                    short readShort2 = rt02.readShort();
                    a((short) (((readShort2 & 255) << 8) | ((readShort2 & 65280) >>> 8)), (short) ((int) crc32.getValue()), "FHCRC");
                    crc32.reset();
                }
                this.a = 1;
            } else {
                gtc = gtc2;
            }
            if (this.a == 1) {
                long j5 = rt03.b;
                long e = this.o.e(rt03, j3);
                if (e != -1) {
                    b(rt0, j5, e);
                    return e;
                }
                this.a = 2;
            }
            if (this.a != 2) {
                return -1;
            }
            a(gtc.m(), (int) crc32.getValue(), "CRC");
            a(gtc.m(), (int) this.c.getBytesWritten(), "ISIZE");
            this.a = 3;
            if (gtc.C()) {
                return -1;
            }
            throw new IOException("gzip finished without exhausting source");
        }
    }

    public final lkf q() {
        return this.b.c.q();
    }
}
