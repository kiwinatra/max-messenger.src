package defpackage;

import kotlin.UShort;
import sun.misc.Unsafe;

/* renamed from: gwf  reason: default package */
public enum gwf {
    ;
    
    public static final Unsafe a = null;
    public static final long b = 0;
    public static final int c = 0;
    public static final long o = 0;
    public static final int v = 0;
    public static final long w = 0;
    public static final int x = 0;

    public static byte a(int i, byte[] bArr) {
        return a.getByte(bArr, b + ((long) (c * i)));
    }

    public static int b(int i, byte[] bArr) {
        return a.getInt(bArr, b + ((long) i));
    }

    public static int c(int i, int[] iArr) {
        return a.getInt(iArr, o + ((long) (v * i)));
    }

    public static long d(int i, byte[] bArr) {
        return a.getLong(bArr, b + ((long) i));
    }

    public static int e(short[] sArr, int i) {
        return a.getShort(sArr, w + ((long) (x * i))) & UShort.MAX_VALUE;
    }

    public static short f(int i, byte[] bArr) {
        return a.getShort(bArr, b + ((long) i));
    }

    public static void g(byte[] bArr, int i, byte b2) {
        a.putByte(bArr, b + ((long) (c * i)), b2);
    }

    public static void h(int i, byte[] bArr, int i2) {
        a.putInt(bArr, b + ((long) i), i2);
    }

    public static void i(int[] iArr, int i, int i2) {
        a.putInt(iArr, o + ((long) (v * i)), i2);
    }

    public static void j(int i, byte[] bArr, long j) {
        a.putLong(bArr, b + ((long) i), j);
    }

    public static void k(byte[] bArr, int i, short s) {
        a.putShort(bArr, b + ((long) i), s);
    }

    public static void l(short[] sArr, int i, int i2) {
        a.putShort(sArr, w + ((long) (x * i)), (short) i2);
    }
}
