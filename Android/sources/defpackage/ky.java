package defpackage;

import android.media.MediaCodec;
import android.os.HandlerThread;
import java.util.ArrayDeque;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: ky  reason: default package */
public final class ky {
    public static final ArrayDeque g = new ArrayDeque();
    public static final Object h = new Object();
    public final MediaCodec a;
    public final HandlerThread b;
    public hy c;
    public final AtomicReference d = new AtomicReference();
    public final bv1 e;
    public boolean f;

    public ky(MediaCodec mediaCodec, HandlerThread handlerThread) {
        bv1 bv1 = new bv1(1, false);
        this.a = mediaCodec;
        this.b = handlerThread;
        this.e = bv1;
    }

    public static iy b() {
        ArrayDeque arrayDeque = g;
        synchronized (arrayDeque) {
            try {
                if (arrayDeque.isEmpty()) {
                    iy iyVar = new iy();
                    return iyVar;
                }
                iy iyVar2 = (iy) arrayDeque.removeFirst();
                return iyVar2;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void a() {
        if (this.f) {
            try {
                hy hyVar = this.c;
                hyVar.getClass();
                hyVar.removeCallbacksAndMessages((Object) null);
                bv1 bv1 = this.e;
                synchronized (bv1) {
                    bv1.b = false;
                }
                hy hyVar2 = this.c;
                hyVar2.getClass();
                hyVar2.obtainMessage(2).sendToTarget();
                bv1.a();
            } catch (InterruptedException e2) {
                Thread.currentThread().interrupt();
                throw new IllegalStateException(e2);
            }
        }
    }
}
