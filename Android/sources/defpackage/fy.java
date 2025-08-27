package defpackage;

import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Bundle;
import android.os.Handler;
import android.os.HandlerThread;
import android.view.Surface;
import java.nio.ByteBuffer;
import java.util.Arrays;

/* renamed from: fy  reason: default package */
public final class fy implements hn8 {
    public final MediaCodec a;
    public final my b;
    public final ky c;
    public final boolean o;
    public final boolean v;
    public boolean w;
    public int x = 0;

    public fy(MediaCodec mediaCodec, HandlerThread handlerThread, HandlerThread handlerThread2, boolean z, boolean z2) {
        this.a = mediaCodec;
        this.b = new my(handlerThread);
        this.c = new ky(mediaCodec, handlerThread2);
        this.o = z;
        this.v = z2;
    }

    public static void b(fy fyVar, MediaFormat mediaFormat, Surface surface, MediaCrypto mediaCrypto) {
        my myVar = fyVar.b;
        y64.j(myVar.c == null);
        HandlerThread handlerThread = myVar.b;
        handlerThread.start();
        Handler handler = new Handler(handlerThread.getLooper());
        MediaCodec mediaCodec = fyVar.a;
        mediaCodec.setCallback(myVar, handler);
        myVar.c = handler;
        m5a.f("configureCodec");
        mediaCodec.configure(mediaFormat, surface, mediaCrypto, 0);
        m5a.s();
        ky kyVar = fyVar.c;
        if (!kyVar.f) {
            HandlerThread handlerThread2 = kyVar.b;
            handlerThread2.start();
            kyVar.c = new hy(kyVar, handlerThread2.getLooper(), 0);
            kyVar.f = true;
        }
        m5a.f("startCodec");
        mediaCodec.start();
        m5a.s();
        fyVar.x = 1;
    }

    public static String d(int i, String str) {
        StringBuilder sb = new StringBuilder(str);
        if (i == 1) {
            sb.append("Audio");
        } else if (i == 2) {
            sb.append("Video");
        } else {
            sb.append("Unknown(");
            sb.append(i);
            sb.append(")");
        }
        return sb.toString();
    }

    public final void a(int i, int i2, int i3, long j) {
        ky kyVar = this.c;
        RuntimeException runtimeException = (RuntimeException) kyVar.d.getAndSet((Object) null);
        if (runtimeException == null) {
            iy b2 = ky.b();
            b2.a = i;
            b2.b = 0;
            b2.c = i2;
            b2.e = j;
            b2.f = i3;
            hy hyVar = kyVar.c;
            int i4 = t0g.a;
            hyVar.obtainMessage(0, b2).sendToTarget();
            return;
        }
        throw runtimeException;
    }

    public final void c(int i, long j) {
        this.a.releaseOutputBuffer(i, j);
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x001a A[Catch:{ all -> 0x001c }, DONT_GENERATE] */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x001e A[Catch:{ all -> 0x001c }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int e() {
        /*
            r6 = this;
            my r6 = r6.b
            java.lang.Object r0 = r6.a
            monitor-enter(r0)
            long r1 = r6.k     // Catch:{ all -> 0x001c }
            r3 = 0
            int r1 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            r2 = 1
            r3 = 0
            if (r1 > 0) goto L_0x0016
            boolean r1 = r6.l     // Catch:{ all -> 0x001c }
            if (r1 == 0) goto L_0x0014
            goto L_0x0016
        L_0x0014:
            r1 = r3
            goto L_0x0017
        L_0x0016:
            r1 = r2
        L_0x0017:
            r4 = -1
            if (r1 == 0) goto L_0x001e
            monitor-exit(r0)     // Catch:{ all -> 0x001c }
            goto L_0x0037
        L_0x001c:
            r6 = move-exception
            goto L_0x003e
        L_0x001e:
            java.lang.IllegalStateException r1 = r6.m     // Catch:{ all -> 0x001c }
            r5 = 0
            if (r1 != 0) goto L_0x003b
            android.media.MediaCodec$CodecException r1 = r6.j     // Catch:{ all -> 0x001c }
            if (r1 != 0) goto L_0x0038
            zy r6 = r6.d     // Catch:{ all -> 0x001c }
            int r1 = r6.o     // Catch:{ all -> 0x001c }
            if (r1 != 0) goto L_0x002e
            goto L_0x002f
        L_0x002e:
            r2 = r3
        L_0x002f:
            if (r2 == 0) goto L_0x0032
            goto L_0x0036
        L_0x0032:
            int r4 = r6.g()     // Catch:{ all -> 0x001c }
        L_0x0036:
            monitor-exit(r0)     // Catch:{ all -> 0x001c }
        L_0x0037:
            return r4
        L_0x0038:
            r6.j = r5     // Catch:{ all -> 0x001c }
            throw r1     // Catch:{ all -> 0x001c }
        L_0x003b:
            r6.m = r5     // Catch:{ all -> 0x001c }
            throw r1     // Catch:{ all -> 0x001c }
        L_0x003e:
            monitor-exit(r0)     // Catch:{ all -> 0x001c }
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fy.e():int");
    }

    public final void f() {
        if (this.o) {
            try {
                ky kyVar = this.c;
                bv1 bv1 = kyVar.e;
                synchronized (bv1) {
                    bv1.b = false;
                }
                hy hyVar = kyVar.c;
                hyVar.getClass();
                hyVar.obtainMessage(2).sendToTarget();
                bv1.a();
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                throw new IllegalStateException(e);
            }
        }
    }

    public final void flush() {
        this.c.a();
        MediaCodec mediaCodec = this.a;
        mediaCodec.flush();
        boolean z = this.v;
        my myVar = this.b;
        if (z) {
            myVar.a((MediaCodec) null);
            mediaCodec.start();
            return;
        }
        myVar.a(mediaCodec);
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x001a A[Catch:{ all -> 0x001c }, DONT_GENERATE] */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x001e A[Catch:{ all -> 0x001c }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int g(android.media.MediaCodec.BufferInfo r12) {
        /*
            r11 = this;
            my r11 = r11.b
            java.lang.Object r0 = r11.a
            monitor-enter(r0)
            long r1 = r11.k     // Catch:{ all -> 0x001c }
            r3 = 0
            int r1 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            r2 = 1
            r3 = 0
            if (r1 > 0) goto L_0x0016
            boolean r1 = r11.l     // Catch:{ all -> 0x001c }
            if (r1 == 0) goto L_0x0014
            goto L_0x0016
        L_0x0014:
            r1 = r3
            goto L_0x0017
        L_0x0016:
            r1 = r2
        L_0x0017:
            r4 = -1
            if (r1 == 0) goto L_0x001e
            monitor-exit(r0)     // Catch:{ all -> 0x001c }
            goto L_0x0061
        L_0x001c:
            r11 = move-exception
            goto L_0x0068
        L_0x001e:
            java.lang.IllegalStateException r1 = r11.m     // Catch:{ all -> 0x001c }
            r5 = 0
            if (r1 != 0) goto L_0x0065
            android.media.MediaCodec$CodecException r1 = r11.j     // Catch:{ all -> 0x001c }
            if (r1 != 0) goto L_0x0062
            zy r1 = r11.e     // Catch:{ all -> 0x001c }
            int r5 = r1.o     // Catch:{ all -> 0x001c }
            if (r5 != 0) goto L_0x002e
            goto L_0x002f
        L_0x002e:
            r2 = r3
        L_0x002f:
            if (r2 == 0) goto L_0x0033
            monitor-exit(r0)     // Catch:{ all -> 0x001c }
            goto L_0x0061
        L_0x0033:
            int r4 = r1.g()     // Catch:{ all -> 0x001c }
            if (r4 < 0) goto L_0x0053
            android.media.MediaFormat r1 = r11.h     // Catch:{ all -> 0x001c }
            defpackage.y64.k(r1)     // Catch:{ all -> 0x001c }
            java.util.ArrayDeque r11 = r11.f     // Catch:{ all -> 0x001c }
            java.lang.Object r11 = r11.remove()     // Catch:{ all -> 0x001c }
            android.media.MediaCodec$BufferInfo r11 = (android.media.MediaCodec.BufferInfo) r11     // Catch:{ all -> 0x001c }
            int r6 = r11.offset     // Catch:{ all -> 0x001c }
            int r7 = r11.size     // Catch:{ all -> 0x001c }
            long r8 = r11.presentationTimeUs     // Catch:{ all -> 0x001c }
            int r10 = r11.flags     // Catch:{ all -> 0x001c }
            r5 = r12
            r5.set(r6, r7, r8, r10)     // Catch:{ all -> 0x001c }
            goto L_0x0060
        L_0x0053:
            r12 = -2
            if (r4 != r12) goto L_0x0060
            java.util.ArrayDeque r12 = r11.g     // Catch:{ all -> 0x001c }
            java.lang.Object r12 = r12.remove()     // Catch:{ all -> 0x001c }
            android.media.MediaFormat r12 = (android.media.MediaFormat) r12     // Catch:{ all -> 0x001c }
            r11.h = r12     // Catch:{ all -> 0x001c }
        L_0x0060:
            monitor-exit(r0)     // Catch:{ all -> 0x001c }
        L_0x0061:
            return r4
        L_0x0062:
            r11.j = r5     // Catch:{ all -> 0x001c }
            throw r1     // Catch:{ all -> 0x001c }
        L_0x0065:
            r11.m = r5     // Catch:{ all -> 0x001c }
            throw r1     // Catch:{ all -> 0x001c }
        L_0x0068:
            monitor-exit(r0)     // Catch:{ all -> 0x001c }
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fy.g(android.media.MediaCodec$BufferInfo):int");
    }

    public final ByteBuffer getInputBuffer(int i) {
        return this.a.getInputBuffer(i);
    }

    public final ByteBuffer getOutputBuffer(int i) {
        return this.a.getOutputBuffer(i);
    }

    public final MediaFormat getOutputFormat() {
        MediaFormat mediaFormat;
        my myVar = this.b;
        synchronized (myVar.a) {
            try {
                mediaFormat = myVar.h;
                if (mediaFormat == null) {
                    throw new IllegalStateException();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return mediaFormat;
    }

    public final void h(int i) {
        f();
        this.a.setVideoScalingMode(i);
    }

    public final void j(Surface surface) {
        f();
        this.a.setOutputSurface(surface);
    }

    public final void n(int i, h44 h44, long j) {
        ky kyVar = this.c;
        RuntimeException runtimeException = (RuntimeException) kyVar.d.getAndSet((Object) null);
        if (runtimeException == null) {
            iy b2 = ky.b();
            b2.a = i;
            b2.b = 0;
            b2.c = 0;
            b2.e = j;
            b2.f = 0;
            int i2 = h44.f;
            MediaCodec.CryptoInfo cryptoInfo = b2.d;
            cryptoInfo.numSubSamples = i2;
            int[] iArr = (int[]) h44.d;
            int[] iArr2 = cryptoInfo.numBytesOfClearData;
            if (iArr != null) {
                if (iArr2 == null || iArr2.length < iArr.length) {
                    iArr2 = Arrays.copyOf(iArr, iArr.length);
                } else {
                    System.arraycopy(iArr, 0, iArr2, 0, iArr.length);
                }
            }
            cryptoInfo.numBytesOfClearData = iArr2;
            int[] iArr3 = (int[]) h44.e;
            int[] iArr4 = cryptoInfo.numBytesOfEncryptedData;
            if (iArr3 != null) {
                if (iArr4 == null || iArr4.length < iArr3.length) {
                    iArr4 = Arrays.copyOf(iArr3, iArr3.length);
                } else {
                    System.arraycopy(iArr3, 0, iArr4, 0, iArr3.length);
                }
            }
            cryptoInfo.numBytesOfEncryptedData = iArr4;
            byte[] bArr = (byte[]) h44.b;
            byte[] bArr2 = cryptoInfo.key;
            if (bArr != null) {
                if (bArr2 == null || bArr2.length < bArr.length) {
                    bArr2 = Arrays.copyOf(bArr, bArr.length);
                } else {
                    System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
                }
            }
            bArr2.getClass();
            cryptoInfo.key = bArr2;
            byte[] bArr3 = (byte[]) h44.a;
            byte[] bArr4 = cryptoInfo.iv;
            if (bArr3 != null) {
                if (bArr4 == null || bArr4.length < bArr3.length) {
                    bArr4 = Arrays.copyOf(bArr3, bArr3.length);
                } else {
                    System.arraycopy(bArr3, 0, bArr4, 0, bArr3.length);
                }
            }
            bArr4.getClass();
            cryptoInfo.iv = bArr4;
            cryptoInfo.mode = h44.c;
            if (t0g.a >= 24) {
                cryptoInfo.setPattern(new MediaCodec.CryptoInfo.Pattern(h44.g, h44.h));
            }
            kyVar.c.obtainMessage(1, b2).sendToTarget();
            return;
        }
        throw runtimeException;
    }

    public final void q(ho8 ho8, Handler handler) {
        f();
        this.a.setOnFrameRenderedListener(new dy(this, ho8, 0), handler);
    }

    public final void release() {
        try {
            if (this.x == 1) {
                ky kyVar = this.c;
                if (kyVar.f) {
                    kyVar.a();
                    kyVar.b.quit();
                }
                kyVar.f = false;
                my myVar = this.b;
                synchronized (myVar.a) {
                    myVar.l = true;
                    myVar.b.quit();
                    myVar.b();
                }
            }
            this.x = 2;
            if (!this.w) {
                this.a.release();
                this.w = true;
            }
        } catch (Throwable th) {
            if (!this.w) {
                this.a.release();
                this.w = true;
            }
            throw th;
        }
    }

    public final void releaseOutputBuffer(int i, boolean z) {
        this.a.releaseOutputBuffer(i, z);
    }

    public final void setParameters(Bundle bundle) {
        f();
        this.a.setParameters(bundle);
    }
}
