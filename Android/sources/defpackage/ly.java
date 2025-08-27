package defpackage;

import android.media.MediaCodec;
import android.os.Bundle;
import android.os.HandlerThread;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: ly  reason: default package */
public final class ly implements mn8 {
    public static final ArrayDeque x = new ArrayDeque();
    public static final Object y = new Object();
    public final MediaCodec a;
    public final HandlerThread b;
    public hy c;
    public final AtomicReference o = new AtomicReference();
    public final bv1 v;
    public boolean w;

    public ly(MediaCodec mediaCodec, HandlerThread handlerThread) {
        bv1 bv1 = new bv1(2, false);
        this.a = mediaCodec;
        this.b = handlerThread;
        this.v = bv1;
    }

    public static jy b() {
        ArrayDeque arrayDeque = x;
        synchronized (arrayDeque) {
            try {
                if (arrayDeque.isEmpty()) {
                    jy jyVar = new jy();
                    return jyVar;
                }
                jy jyVar2 = (jy) arrayDeque.removeFirst();
                return jyVar2;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void a(int i, int i2, int i3, long j) {
        d();
        jy b2 = b();
        b2.a = i;
        b2.b = 0;
        b2.c = i2;
        b2.e = j;
        b2.f = i3;
        hy hyVar = this.c;
        int i4 = v0g.a;
        hyVar.obtainMessage(1, b2).sendToTarget();
    }

    public final void d() {
        RuntimeException runtimeException = (RuntimeException) this.o.getAndSet((Object) null);
        if (runtimeException != null) {
            throw runtimeException;
        }
    }

    public final void flush() {
        if (this.w) {
            try {
                hy hyVar = this.c;
                hyVar.getClass();
                hyVar.removeCallbacksAndMessages((Object) null);
                bv1 bv1 = this.v;
                bv1.c();
                hy hyVar2 = this.c;
                hyVar2.getClass();
                hyVar2.obtainMessage(3).sendToTarget();
                bv1.a();
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                throw new IllegalStateException(e);
            }
        }
    }

    public final void i(int i, h44 h44, long j, int i2) {
        d();
        jy b2 = b();
        b2.a = i;
        b2.b = 0;
        b2.c = 0;
        b2.e = j;
        b2.f = i2;
        int i3 = h44.f;
        MediaCodec.CryptoInfo cryptoInfo = b2.d;
        cryptoInfo.numSubSamples = i3;
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
        if (v0g.a >= 24) {
            cryptoInfo.setPattern(new MediaCodec.CryptoInfo.Pattern(h44.g, h44.h));
        }
        this.c.obtainMessage(2, b2).sendToTarget();
    }

    public final void setParameters(Bundle bundle) {
        d();
        hy hyVar = this.c;
        int i = v0g.a;
        hyVar.obtainMessage(4, bundle).sendToTarget();
    }

    public final void shutdown() {
        if (this.w) {
            flush();
            this.b.quit();
        }
        this.w = false;
    }

    public final void start() {
        if (!this.w) {
            HandlerThread handlerThread = this.b;
            handlerThread.start();
            this.c = new hy(this, handlerThread.getLooper(), 1);
            this.w = true;
        }
    }
}
