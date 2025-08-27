package defpackage;

import android.os.Handler;
import android.os.HandlerThread;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.io.ConstantsKt;

/* renamed from: bug  reason: default package */
public final class bug {
    public static final long E;
    public static final String[] F = {"OMX.google.", "OMX.SEC.", "c2.android"};
    public static final long G;
    public final fx A;
    public boolean B;
    public volatile boolean C;
    public int D;
    public final voc a;
    public final pbb b;
    public final byte[] c = new byte[ConstantsKt.DEFAULT_BUFFER_SIZE];
    public final HandlerThread d;
    public final Handler e;
    public jla f;
    public fa4 g;
    public final long h;
    public long i;
    public Integer j;
    public Integer k;
    public final AtomicInteger l;
    public final AtomicInteger m;
    public final AtomicInteger n;
    public final AtomicInteger o;
    public final AtomicInteger p;
    public final AtomicInteger q;
    public final AtomicInteger r;
    public final AtomicInteger s;
    public final AtomicInteger t;
    public final zjf u;
    public final zjf v;
    public final zjf w;
    public final zjf x;
    public final AtomicInteger y;
    public final AtomicInteger z;

    static {
        TimeUnit timeUnit = TimeUnit.SECONDS;
        E = timeUnit.toNanos(1) / 10;
        G = timeUnit.toMillis(3);
    }

    public bug(voc voc, rjf rjf, pbb pbb) {
        HandlerThread handlerThread = new HandlerThread("DecoderWrapperControl");
        this.d = handlerThread;
        this.f = null;
        this.h = -1;
        this.i = 0;
        this.l = new AtomicInteger(0);
        this.m = new AtomicInteger(0);
        this.n = new AtomicInteger(0);
        this.o = new AtomicInteger(0);
        this.p = new AtomicInteger(0);
        this.q = new AtomicInteger(0);
        this.r = new AtomicInteger(0);
        this.s = new AtomicInteger(0);
        this.t = new AtomicInteger(0);
        this.u = new zjf();
        this.v = new zjf();
        this.w = new zjf();
        this.x = new zjf();
        this.y = new AtomicInteger(0);
        this.z = new AtomicInteger(0);
        this.B = false;
        this.a = voc;
        this.b = pbb;
        handlerThread.start();
        this.e = new Handler(handlerThread.getLooper());
        this.A = new fx(rjf);
    }

    public final void a() {
        if (!this.C) {
            this.C = true;
            HandlerThread handlerThread = this.d;
            Handler handler = this.e;
            qof qof = new qof(16, this);
            handler.removeCallbacksAndMessages((Object) null);
            handler.post(qof);
            handlerThread.quitSafely();
        }
    }

    public final void b() {
        jla jla = this.f;
        if (jla != null) {
            try {
                ((ByteArrayOutputStream) jla.e).close();
            } catch (IOException unused) {
            }
        }
        this.f = null;
    }
}
