package defpackage;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.util.LongSparseArray;
import java.util.LinkedList;
import java.util.Random;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import ru.ok.android.webrtc.protocol.exceptions.RtcRetryLimitExceedException;

/* renamed from: q9d  reason: default package */
public final class q9d {
    public final o9a a;
    public final AtomicReference b = new AtomicReference((Object) null);
    public final gtg c = new gtg(this);
    public final msg d = new msg(2, this);
    public final HandlerThread e;
    public final Handler f;
    public final Handler g = new Handler(Looper.getMainLooper());
    public final Handler h = new Handler(Looper.getMainLooper());
    public final x4d i = new x4d();
    public final AtomicBoolean j = new AtomicBoolean(false);
    public long k = 0;
    public final LongSparseArray l = new LongSparseArray();
    public final LinkedList m = new LinkedList();
    public final o5h n;
    public final voc o;

    /* JADX WARNING: type inference failed for: r0v12, types: [o5h, java.lang.Object] */
    public q9d(dm4 dm4) {
        o9a o9a = (o9a) dm4.c;
        if (o9a != null) {
            this.a = o9a;
            voc voc = (voc) dm4.b;
            this.o = voc;
            ? obj = new Object();
            obj.b = new CopyOnWriteArrayList();
            obj.c = new Handler(Looper.getMainLooper());
            if (voc != null) {
                obj.a = voc;
                this.n = obj;
                HandlerThread handlerThread = new HandlerThread("RtcCommExec");
                this.e = handlerThread;
                handlerThread.start();
                this.f = new Handler(handlerThread.getLooper());
                return;
            }
            throw new IllegalArgumentException("Illegal 'uncaughtExceptionHandler' value: null");
        }
        throw new IllegalArgumentException("Illegal 'serializer' value: null");
    }

    public final void a() {
        this.g.removeCallbacksAndMessages((Object) null);
        LinkedList linkedList = this.m;
        linkedList.clear();
        int i2 = 0;
        while (true) {
            LongSparseArray longSparseArray = this.l;
            if (i2 < longSparseArray.size()) {
                long keyAt = longSparseArray.keyAt(i2);
                lsg lsg = (lsg) longSparseArray.valueAt(i2);
                lsg.e = 0;
                lsg.f = 0;
                linkedList.offer(Long.valueOf(keyAt));
                i2++;
            } else {
                return;
            }
        }
    }

    public final void b() {
        Handler handler = this.h;
        o5h o5h = this.n;
        u64 u64 = (u64) this.b.get();
        if (u64 != null && u64.b()) {
            LinkedList linkedList = this.m;
            for (Long l2 = (Long) linkedList.poll(); l2 != null; l2 = (Long) linkedList.poll()) {
                LongSparseArray longSparseArray = this.l;
                lsg lsg = (lsg) longSparseArray.get(l2.longValue());
                if (lsg != null) {
                    try {
                        ni0 s = this.a.s(lsg.b, lsg.c);
                        byte[] bArr = (byte[]) s.c;
                        int i2 = s.b;
                        boolean e2 = u64.e(i2, bArr);
                        if (e2) {
                            n9d n9d = lsg.c;
                            o5h.getClass();
                            ysg ysg = new ysg(o5h, n9d, 2);
                            Handler handler2 = (Handler) o5h.c;
                            handler2.post(ysg);
                            handler2.post(new zsg(o5h, bArr, i2, 1));
                        }
                        if (e2) {
                            if (lsg.c.a()) {
                                o5h.r(lsg.c);
                                longSparseArray.remove(lsg.b);
                            }
                            handler.post(new qof(15, lsg));
                        } else {
                            c(lsg.b);
                        }
                    } catch (Throwable th) {
                        n9d n9d2 = lsg.c;
                        o5h.getClass();
                        ((Handler) o5h.c).post(new o6d((Object) o5h, (Object) n9d2, th, 19));
                        o5h.r(lsg.c);
                        handler.post(new l8g(12, lsg, th));
                        longSparseArray.remove(lsg.b);
                    }
                }
            }
        }
    }

    public final void c(long j2) {
        long j3 = j2;
        LongSparseArray longSparseArray = this.l;
        lsg lsg = (lsg) longSparseArray.get(j3);
        if (lsg != null && !this.j.get()) {
            o9d o9d = lsg.d;
            long j4 = o9d.e;
            int i2 = (j4 > 0 ? 1 : (j4 == 0 ? 0 : -1));
            x4d x4d = this.i;
            if (i2 >= 0) {
                x4d.getClass();
                long j5 = o9d.f;
                if (j5 >= 0) {
                    float f2 = o9d.g;
                    if (f2 >= c44.DEFAULT_ASPECT_RATIO) {
                        float f3 = o9d.h;
                        if (f3 >= c44.DEFAULT_ASPECT_RATIO) {
                            x4d.a = f3;
                            long j6 = lsg.f;
                            if (j6 >= 0) {
                                lsg.e++;
                                float max = Math.max((float) j4, Math.min((float) ((long) (((float) j6) * f2)), (float) j5));
                                long nextGaussian = (long) (max + ((float) (((Random) x4d.b).nextGaussian() * ((double) max) * ((double) x4d.a))));
                                lsg.f = nextGaussian;
                                if (lsg.e >= 0) {
                                    RtcRetryLimitExceedException rtcRetryLimitExceedException = new RtcRetryLimitExceedException();
                                    o5h o5h = this.n;
                                    o5h.getClass();
                                    n9d n9d = o9d.b;
                                    ((Handler) o5h.c).post(new o6d((Object) o5h, (Object) n9d, (Object) rtcRetryLimitExceedException, 19));
                                    o5h.r(n9d);
                                    this.h.post(new l8g(12, lsg, rtcRetryLimitExceedException));
                                    longSparseArray.remove(j3);
                                    return;
                                }
                                this.g.postDelayed(new p9d(this, j3, 1), nextGaussian);
                                return;
                            }
                            throw new IllegalArgumentException(wj6.i(j6, "Illegal 'latestRetryTimeout' value: "));
                        }
                        throw new IllegalArgumentException("Illegal 'retryBackoffJitter' value: " + f3);
                    }
                    throw new IllegalArgumentException("Illegal 'retryBackoffFactor' value: " + f2);
                }
                throw new IllegalArgumentException(wj6.i(j5, "Illegal 'maxRetryTimeoutMs' value: "));
            }
            x4d.getClass();
            throw new IllegalArgumentException(wj6.i(j4, "Illegal 'minRetryTimeoutMs' value: "));
        }
    }

    public final void d(o9d o9d) {
        if (this.j.get()) {
            this.o.log("RTCCommand", "execute on disposed");
        }
        this.f.post(new ovb(17, this, o9d));
    }
}
