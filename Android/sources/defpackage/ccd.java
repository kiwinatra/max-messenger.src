package defpackage;

import android.media.MediaCodec;
import java.nio.ByteBuffer;
import java.util.Arrays;
import kotlin.jvm.internal.ByteCompanionObject;

/* renamed from: ccd  reason: default package */
public final class ccd {
    public final /* synthetic */ int a = 2;
    public int b;
    public long c;
    public Object d;
    public Object e;
    public Object f;
    public Object g;
    public Object h;

    public /* synthetic */ ccd() {
    }

    public static vy e(vy vyVar, long j, ByteBuffer byteBuffer, int i) {
        while (j >= vyVar.c) {
            vyVar = (vy) vyVar.v;
        }
        while (i > 0) {
            int min = Math.min(i, (int) (vyVar.c - j));
            gd gdVar = (gd) vyVar.o;
            byteBuffer.put(gdVar.a, ((int) (j - vyVar.b)) + gdVar.b, min);
            i -= min;
            j += (long) min;
            if (j == vyVar.c) {
                vyVar = (vy) vyVar.v;
            }
        }
        return vyVar;
    }

    public static vy f(vy vyVar, long j, byte[] bArr, int i) {
        while (j >= vyVar.c) {
            vyVar = (vy) vyVar.v;
        }
        int i2 = i;
        while (i2 > 0) {
            int min = Math.min(i2, (int) (vyVar.c - j));
            gd gdVar = (gd) vyVar.o;
            System.arraycopy(gdVar.a, ((int) (j - vyVar.b)) + gdVar.b, bArr, i - i2, min);
            i2 -= min;
            j += (long) min;
            if (j == vyVar.c) {
                vyVar = (vy) vyVar.v;
            }
        }
        return vyVar;
    }

    public static vy g(vy vyVar, long j, ByteBuffer byteBuffer, int i) {
        while (j >= vyVar.c) {
            vyVar = (vy) vyVar.v;
        }
        while (i > 0) {
            int min = Math.min(i, (int) (vyVar.c - j));
            hd hdVar = (hd) vyVar.o;
            byteBuffer.put(hdVar.a, ((int) (j - vyVar.b)) + hdVar.b, min);
            i -= min;
            j += (long) min;
            if (j == vyVar.c) {
                vyVar = (vy) vyVar.v;
            }
        }
        return vyVar;
    }

    public static vy h(vy vyVar, long j, byte[] bArr, int i) {
        while (j >= vyVar.c) {
            vyVar = (vy) vyVar.v;
        }
        int i2 = i;
        while (i2 > 0) {
            int min = Math.min(i2, (int) (vyVar.c - j));
            hd hdVar = (hd) vyVar.o;
            System.arraycopy(hdVar.a, ((int) (j - vyVar.b)) + hdVar.b, bArr, i - i2, min);
            i2 -= min;
            j += (long) min;
            if (j == vyVar.c) {
                vyVar = (vy) vyVar.v;
            }
        }
        return vyVar;
    }

    public static vy i(vy vyVar, aa4 aa4, gv1 gv1, g1g g1g) {
        int i;
        if (aa4.h(1073741824)) {
            long j = gv1.b;
            g1g.E(1);
            vy f2 = f(vyVar, j, g1g.a, 1);
            long j2 = j + 1;
            byte b2 = g1g.a[0];
            boolean z = (b2 & ByteCompanionObject.MIN_VALUE) != 0;
            byte b3 = b2 & ByteCompanionObject.MAX_VALUE;
            h44 h44 = aa4.c;
            byte[] bArr = (byte[]) h44.a;
            if (bArr == null) {
                h44.a = new byte[16];
            } else {
                Arrays.fill(bArr, (byte) 0);
            }
            vyVar = f(f2, j2, (byte[]) h44.a, b3);
            long j3 = j2 + ((long) b3);
            if (z) {
                g1g.E(2);
                vyVar = f(vyVar, j3, g1g.a, 2);
                j3 += 2;
                i = g1g.A();
            } else {
                i = 1;
            }
            int[] iArr = (int[]) h44.d;
            if (iArr == null || iArr.length < i) {
                iArr = new int[i];
            }
            int[] iArr2 = (int[]) h44.e;
            if (iArr2 == null || iArr2.length < i) {
                iArr2 = new int[i];
            }
            if (z) {
                int i2 = i * 6;
                g1g.E(i2);
                vyVar = f(vyVar, j3, g1g.a, i2);
                j3 += (long) i2;
                g1g.H(0);
                for (int i3 = 0; i3 < i; i3++) {
                    iArr[i3] = g1g.A();
                    iArr2[i3] = g1g.y();
                }
            } else {
                iArr[0] = 0;
                iArr2[0] = gv1.a - ((int) (j3 - gv1.b));
            }
            wpf wpf = (wpf) gv1.c;
            int i4 = t0g.a;
            byte[] bArr2 = wpf.b;
            byte[] bArr3 = (byte[]) h44.a;
            h44.f = i;
            h44.d = iArr;
            h44.e = iArr2;
            h44.b = bArr2;
            h44.a = bArr3;
            int i5 = wpf.a;
            h44.c = i5;
            int i6 = wpf.c;
            h44.g = i6;
            int i7 = wpf.d;
            h44.h = i7;
            MediaCodec.CryptoInfo cryptoInfo = (MediaCodec.CryptoInfo) h44.i;
            cryptoInfo.numSubSamples = i;
            cryptoInfo.numBytesOfClearData = iArr;
            cryptoInfo.numBytesOfEncryptedData = iArr2;
            cryptoInfo.key = bArr2;
            cryptoInfo.iv = bArr3;
            cryptoInfo.mode = i5;
            if (t0g.a >= 24) {
                ata ata = (ata) h44.j;
                ata.getClass();
                MediaCodec.CryptoInfo.Pattern pattern = (MediaCodec.CryptoInfo.Pattern) ata.c;
                pattern.set(i6, i7);
                ((MediaCodec.CryptoInfo) ata.b).setPattern(pattern);
            }
            long j4 = gv1.b;
            int i8 = (int) (j3 - j4);
            gv1.b = j4 + ((long) i8);
            gv1.a -= i8;
        }
        if (aa4.h(268435456)) {
            g1g.E(4);
            vy f3 = f(vyVar, gv1.b, g1g.a, 4);
            int y = g1g.y();
            gv1.b += 4;
            gv1.a -= 4;
            aa4.B(y);
            vy e2 = e(f3, gv1.b, aa4.o, y);
            gv1.b += (long) y;
            int i9 = gv1.a - y;
            gv1.a = i9;
            ByteBuffer byteBuffer = aa4.x;
            if (byteBuffer == null || byteBuffer.capacity() < i9) {
                aa4.x = ByteBuffer.allocate(i9);
            } else {
                aa4.x.clear();
            }
            return e(e2, gv1.b, aa4.x, gv1.a);
        }
        aa4.B(gv1.a);
        return e(vyVar, gv1.b, aa4.o, gv1.a);
    }

    public static vy j(vy vyVar, ba4 ba4, gv1 gv1, l8b l8b) {
        int i;
        if (ba4.h(1073741824)) {
            long j = gv1.b;
            l8b.D(1);
            vy h2 = h(vyVar, j, l8b.a, 1);
            long j2 = j + 1;
            byte b2 = l8b.a[0];
            boolean z = (b2 & ByteCompanionObject.MIN_VALUE) != 0;
            byte b3 = b2 & ByteCompanionObject.MAX_VALUE;
            h44 h44 = ba4.o;
            byte[] bArr = (byte[]) h44.a;
            if (bArr == null) {
                h44.a = new byte[16];
            } else {
                Arrays.fill(bArr, (byte) 0);
            }
            vyVar = h(h2, j2, (byte[]) h44.a, b3);
            long j3 = j2 + ((long) b3);
            if (z) {
                l8b.D(2);
                vyVar = h(vyVar, j3, l8b.a, 2);
                j3 += 2;
                i = l8b.A();
            } else {
                i = 1;
            }
            int[] iArr = (int[]) h44.d;
            if (iArr == null || iArr.length < i) {
                iArr = new int[i];
            }
            int[] iArr2 = (int[]) h44.e;
            if (iArr2 == null || iArr2.length < i) {
                iArr2 = new int[i];
            }
            if (z) {
                int i2 = i * 6;
                l8b.D(i2);
                vyVar = h(vyVar, j3, l8b.a, i2);
                j3 += (long) i2;
                l8b.G(0);
                for (int i3 = 0; i3 < i; i3++) {
                    iArr[i3] = l8b.A();
                    iArr2[i3] = l8b.y();
                }
            } else {
                iArr[0] = 0;
                iArr2[0] = gv1.a - ((int) (j3 - gv1.b));
            }
            xpf xpf = (xpf) gv1.c;
            int i4 = v0g.a;
            byte[] bArr2 = xpf.b;
            byte[] bArr3 = (byte[]) h44.a;
            h44.f = i;
            h44.d = iArr;
            h44.e = iArr2;
            h44.b = bArr2;
            h44.a = bArr3;
            int i5 = xpf.a;
            h44.c = i5;
            int i6 = xpf.c;
            h44.g = i6;
            int i7 = xpf.d;
            h44.h = i7;
            MediaCodec.CryptoInfo cryptoInfo = (MediaCodec.CryptoInfo) h44.i;
            cryptoInfo.numSubSamples = i;
            cryptoInfo.numBytesOfClearData = iArr;
            cryptoInfo.numBytesOfEncryptedData = iArr2;
            cryptoInfo.key = bArr2;
            cryptoInfo.iv = bArr3;
            cryptoInfo.mode = i5;
            if (v0g.a >= 24) {
                wsb wsb = (wsb) h44.j;
                wsb.getClass();
                MediaCodec.CryptoInfo.Pattern pattern = (MediaCodec.CryptoInfo.Pattern) wsb.b;
                pattern.set(i6, i7);
                ((MediaCodec.CryptoInfo) wsb.a).setPattern(pattern);
            }
            long j4 = gv1.b;
            int i8 = (int) (j3 - j4);
            gv1.b = j4 + ((long) i8);
            gv1.a -= i8;
        }
        if (ba4.h(268435456)) {
            l8b.D(4);
            vy h3 = h(vyVar, gv1.b, l8b.a, 4);
            int y = l8b.y();
            gv1.b += 4;
            gv1.a -= 4;
            ba4.B(y);
            vy g2 = g(h3, gv1.b, ba4.v, y);
            gv1.b += (long) y;
            int i9 = gv1.a - y;
            gv1.a = i9;
            ByteBuffer byteBuffer = ba4.y;
            if (byteBuffer == null || byteBuffer.capacity() < i9) {
                ba4.y = ByteBuffer.allocate(i9);
            } else {
                ba4.y.clear();
            }
            return g(g2, gv1.b, ba4.y, gv1.a);
        }
        ba4.B(gv1.a);
        return g(vyVar, gv1.b, ba4.v, gv1.a);
    }

    public void a(vy vyVar) {
        if (((gd) vyVar.o) != null) {
            cb4 cb4 = (cb4) this.d;
            synchronized (cb4) {
                vy vyVar2 = vyVar;
                while (vyVar2 != null) {
                    try {
                        int i = cb4.f;
                        cb4.f = i + 1;
                        gd gdVar = (gd) vyVar2.o;
                        gdVar.getClass();
                        ((gd[]) cb4.g)[i] = gdVar;
                        cb4.e--;
                        vyVar2 = (vy) vyVar2.v;
                        if (vyVar2 == null || ((gd) vyVar2.o) == null) {
                            vyVar2 = null;
                        }
                    } finally {
                        while (true) {
                        }
                    }
                }
                cb4.notifyAll();
            }
            vyVar.o = null;
            vyVar.v = null;
        }
    }

    public void b(vy vyVar) {
        if (((hd) vyVar.o) != null) {
            cb4 cb4 = (cb4) this.d;
            synchronized (cb4) {
                vy vyVar2 = vyVar;
                while (vyVar2 != null) {
                    try {
                        int i = cb4.f;
                        cb4.f = i + 1;
                        hd hdVar = (hd) vyVar2.o;
                        hdVar.getClass();
                        ((hd[]) cb4.g)[i] = hdVar;
                        cb4.e--;
                        vyVar2 = (vy) vyVar2.v;
                        if (vyVar2 == null || ((hd) vyVar2.o) == null) {
                            vyVar2 = null;
                        }
                    } finally {
                        while (true) {
                        }
                    }
                }
                cb4.notifyAll();
            }
            vyVar.o = null;
            vyVar.v = null;
        }
    }

    public void c(long j) {
        switch (this.a) {
            case 0:
                if (j != -1) {
                    while (true) {
                        vy vyVar = (vy) this.f;
                        if (j >= vyVar.c) {
                            cb4 cb4 = (cb4) this.d;
                            gd gdVar = (gd) vyVar.o;
                            synchronized (cb4) {
                                int i = cb4.f;
                                cb4.f = i + 1;
                                ((gd[]) cb4.g)[i] = gdVar;
                                cb4.e--;
                                cb4.notifyAll();
                            }
                            vy vyVar2 = (vy) this.f;
                            vyVar2.o = null;
                            vyVar2.v = null;
                            this.f = (vy) vyVar2.v;
                        } else if (((vy) this.g).b < vyVar.b) {
                            this.g = vyVar;
                            return;
                        } else {
                            return;
                        }
                    }
                } else {
                    return;
                }
            default:
                if (j != -1) {
                    while (true) {
                        vy vyVar3 = (vy) this.f;
                        if (j >= vyVar3.c) {
                            cb4 cb42 = (cb4) this.d;
                            hd hdVar = (hd) vyVar3.o;
                            synchronized (cb42) {
                                int i2 = cb42.f;
                                cb42.f = i2 + 1;
                                ((hd[]) cb42.g)[i2] = hdVar;
                                cb42.e--;
                                cb42.notifyAll();
                            }
                            vy vyVar4 = (vy) this.f;
                            vyVar4.o = null;
                            vyVar4.v = null;
                            this.f = (vy) vyVar4.v;
                        } else if (((vy) this.g).b < vyVar3.b) {
                            this.g = vyVar3;
                            return;
                        } else {
                            return;
                        }
                    }
                } else {
                    return;
                }
        }
    }

    public int d(int i) {
        gd gdVar;
        hd hdVar;
        switch (this.a) {
            case 0:
                vy vyVar = (vy) this.h;
                if (((gd) vyVar.o) == null) {
                    cb4 cb4 = (cb4) this.d;
                    synchronized (cb4) {
                        try {
                            int i2 = cb4.e + 1;
                            cb4.e = i2;
                            int i3 = cb4.f;
                            if (i3 > 0) {
                                int i4 = i3 - 1;
                                cb4.f = i4;
                                gdVar = ((gd[]) cb4.g)[i4];
                                gdVar.getClass();
                                ((gd[]) cb4.g)[cb4.f] = null;
                            } else {
                                gd gdVar2 = new gd(0, new byte[cb4.c]);
                                gd[] gdVarArr = (gd[]) cb4.g;
                                if (i2 > gdVarArr.length) {
                                    cb4.g = (gd[]) Arrays.copyOf(gdVarArr, gdVarArr.length * 2);
                                }
                                gdVar = gdVar2;
                            }
                        } catch (Throwable th) {
                            while (true) {
                                throw th;
                                break;
                            }
                        }
                    }
                    vy vyVar2 = new vy(this.b, 4, ((vy) this.h).c);
                    vyVar.o = gdVar;
                    vyVar.v = vyVar2;
                }
                return Math.min(i, (int) (((vy) this.h).c - this.c));
            default:
                vy vyVar3 = (vy) this.h;
                if (((hd) vyVar3.o) == null) {
                    cb4 cb42 = (cb4) this.d;
                    synchronized (cb42) {
                        try {
                            int i5 = cb42.e + 1;
                            cb42.e = i5;
                            int i6 = cb42.f;
                            if (i6 > 0) {
                                int i7 = i6 - 1;
                                cb42.f = i7;
                                hdVar = ((hd[]) cb42.g)[i7];
                                hdVar.getClass();
                                ((hd[]) cb42.g)[cb42.f] = null;
                            } else {
                                hd hdVar2 = new hd(0, new byte[cb42.c]);
                                hd[] hdVarArr = (hd[]) cb42.g;
                                if (i5 > hdVarArr.length) {
                                    cb42.g = (hd[]) Arrays.copyOf(hdVarArr, hdVarArr.length * 2);
                                }
                                hdVar = hdVar2;
                            }
                        } catch (Throwable th2) {
                            while (true) {
                                throw th2;
                                break;
                            }
                        }
                    }
                    vy vyVar4 = new vy(this.b, 5, ((vy) this.h).c);
                    vyVar3.o = hdVar;
                    vyVar3.v = vyVar4;
                }
                return Math.min(i, (int) (((vy) this.h).c - this.c));
        }
    }

    public ccd(cb4 cb4) {
        this.d = cb4;
        int i = cb4.c;
        this.b = i;
        this.e = new g1g(32);
        vy vyVar = new vy(i, 4, 0);
        this.f = vyVar;
        this.g = vyVar;
        this.h = vyVar;
    }

    public ccd(cb4 cb4, byte b2) {
        this.d = cb4;
        int i = cb4.c;
        this.b = i;
        this.e = new l8b(32);
        vy vyVar = new vy(i, 5, 0);
        this.f = vyVar;
        this.g = vyVar;
        this.h = vyVar;
    }
}
