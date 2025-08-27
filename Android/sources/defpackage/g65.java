package defpackage;

import android.media.MediaCodec;
import android.media.MediaCodecInfo;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.util.LruCache;
import android.util.Range;
import android.view.Surface;
import androidx.camera.video.internal.compat.quirk.EncoderNotUsePersistentInputSurfaceQuirk;
import androidx.camera.video.internal.compat.quirk.SignalEosOutputBufferNotComeQuirk;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Objects;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.jvm.internal.LongCompanionObject;

/* renamed from: g65  reason: default package */
public final class g65 implements q55 {
    public static final Range E;
    public boolean A = false;
    public boolean B = false;
    public Future C;
    public int D;
    public final String a;
    public final Object b = new Object();
    public final boolean c;
    public final MediaFormat d;
    public final MediaCodec e;
    public final n55 f;
    public final j3h g;
    public final tsd h;
    public final zz7 i;
    public final do1 j;
    public final ArrayDeque k = new ArrayDeque();
    public final ArrayDeque l = new ArrayDeque();
    public final HashSet m = new HashSet();
    public final HashSet n = new HashSet();
    public final ArrayDeque o = new ArrayDeque();
    public final xjf p;
    public final ejd q = new Object();
    public r55 r = r55.r;
    public Executor s = ryg.j();
    public Range t = E;
    public long u = 0;
    public boolean v = false;
    public Long w = null;
    public ScheduledFuture x = null;
    public e65 y = null;
    public boolean z = false;

    static {
        Long valueOf = Long.valueOf(LongCompanionObject.MAX_VALUE);
        E = Range.create(valueOf, valueOf);
    }

    /* JADX WARNING: type inference failed for: r0v6, types: [java.lang.Object, ejd] */
    public g65(Executor executor, t55 t55) {
        executor.getClass();
        t55.getClass();
        LruCache lruCache = h43.a;
        try {
            MediaCodec createEncoderByType = MediaCodec.createEncoderByType(t55.b());
            this.e = createEncoderByType;
            MediaCodecInfo codecInfo = createEncoderByType.getCodecInfo();
            this.h = new tsd(executor);
            MediaFormat c2 = t55.c();
            this.d = c2;
            xjf d2 = t55.d();
            this.p = d2;
            if (t55 instanceof x90) {
                this.a = "AudioEncoder";
                this.c = false;
                this.f = new c65(this);
                j3h j3h = new j3h(codecInfo, t55.b());
                Objects.requireNonNull(((MediaCodecInfo.CodecCapabilities) j3h.a).getAudioCapabilities());
                this.g = j3h;
            } else if (t55 instanceof uc0) {
                this.a = "VideoEncoder";
                this.c = true;
                this.f = new f65(this);
                b5g b5g = new b5g(codecInfo, t55.b());
                if (c2.containsKey("bitrate")) {
                    int integer = c2.getInteger("bitrate");
                    int intValue = b5g.b.getBitrateRange().clamp(Integer.valueOf(integer)).intValue();
                    if (integer != intValue) {
                        c2.setInteger("bitrate", intValue);
                    }
                }
                this.g = b5g;
            } else {
                throw new Exception("Unknown encoder config type");
            }
            Objects.toString(d2);
            Objects.toString(c2);
            try {
                h();
                AtomicReference atomicReference = new AtomicReference();
                this.i = hd8.J(m5a.F(new ut0(atomicReference, 4)));
                do1 do1 = (do1) atomicReference.get();
                do1.getClass();
                this.j = do1;
                i(1);
            } catch (MediaCodec.CodecException e2) {
                throw new Exception(e2);
            }
        } catch (IOException | IllegalArgumentException e3) {
            throw new Exception(e3);
        }
    }

    public final zz7 a() {
        switch (tr1.y(this.D)) {
            case 0:
                return new xa7(1, new IllegalStateException("Encoder is not started yet."));
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
                AtomicReference atomicReference = new AtomicReference();
                go1 F = m5a.F(new ut0(atomicReference, 3));
                do1 do1 = (do1) atomicReference.get();
                do1.getClass();
                this.l.offer(do1);
                do1.a(new bk4(13, this, do1), this.h);
                c();
                return F;
            case 7:
                return new xa7(1, new IllegalStateException("Encoder is in error state."));
            case 8:
                return new xa7(1, new IllegalStateException("Encoder is released."));
            default:
                throw new IllegalStateException("Unknown state: ".concat(g63.s(this.D)));
        }
    }

    public final void b(int i2, String str, Throwable th) {
        switch (tr1.y(this.D)) {
            case 0:
                d(i2, str, th);
                h();
                return;
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
                i(8);
                l(new w55((Object) this, i2, (Object) str, (Object) th, 0));
                return;
            default:
                return;
        }
    }

    public final void c() {
        while (true) {
            ArrayDeque arrayDeque = this.l;
            if (!arrayDeque.isEmpty()) {
                ArrayDeque arrayDeque2 = this.k;
                if (!arrayDeque2.isEmpty()) {
                    do1 do1 = (do1) arrayDeque.poll();
                    Objects.requireNonNull(do1);
                    Integer num = (Integer) arrayDeque2.poll();
                    Objects.requireNonNull(num);
                    try {
                        eg7 eg7 = new eg7(this.e, num.intValue());
                        if (do1.b(eg7)) {
                            this.m.add(eg7);
                            hd8.J(eg7.d).d(new bk4(11, this, eg7), this.h);
                        } else {
                            eg7.a();
                        }
                    } catch (MediaCodec.CodecException e2) {
                        b(1, e2.getMessage(), e2);
                        return;
                    }
                } else {
                    return;
                }
            } else {
                return;
            }
        }
    }

    public final void d(int i2, String str, Throwable th) {
        r55 r55;
        Executor executor;
        synchronized (this.b) {
            r55 = this.r;
            executor = this.s;
        }
        try {
            executor.execute(new x55(r55, i2, str, th));
        } catch (RejectedExecutionException unused) {
        }
    }

    public final void e() {
        this.q.getClass();
        this.h.execute(new v55(this, ejd.f(), 0));
    }

    public final void f() {
        Surface surface;
        HashSet hashSet;
        if (this.z) {
            this.e.stop();
            this.z = false;
        }
        this.e.release();
        n55 n55 = this.f;
        if (n55 instanceof f65) {
            f65 f65 = (f65) n55;
            synchronized (f65.a) {
                surface = f65.b;
                f65.b = null;
                hashSet = new HashSet(f65.c);
                f65.c.clear();
            }
            if (surface != null) {
                surface.release();
            }
            Iterator it = hashSet.iterator();
            while (it.hasNext()) {
                ((Surface) it.next()).release();
            }
        }
        i(9);
        this.j.b((Object) null);
    }

    public final void g() {
        this.e.setParameters(wj6.g(0, "request-sync"));
    }

    public final void h() {
        o55 o55;
        Executor executor;
        this.t = E;
        this.u = 0;
        this.o.clear();
        this.k.clear();
        Iterator it = this.l.iterator();
        while (it.hasNext()) {
            ((do1) it.next()).c();
        }
        this.l.clear();
        this.e.reset();
        this.z = false;
        this.A = false;
        this.B = false;
        this.v = false;
        ScheduledFuture scheduledFuture = this.x;
        Surface surface = null;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(true);
            this.x = null;
        }
        Future future = this.C;
        if (future != null) {
            future.cancel(false);
            this.C = null;
        }
        e65 e65 = this.y;
        if (e65 != null) {
            e65.j = true;
        }
        e65 e652 = new e65(this);
        this.y = e652;
        this.e.setCallback(e652);
        this.e.configure(this.d, (Surface) null, (MediaCrypto) null, 1);
        n55 n55 = this.f;
        if (n55 instanceof f65) {
            f65 f65 = (f65) n55;
            f65.getClass();
            EncoderNotUsePersistentInputSurfaceQuirk encoderNotUsePersistentInputSurfaceQuirk = (EncoderNotUsePersistentInputSurfaceQuirk) on4.a.g(EncoderNotUsePersistentInputSurfaceQuirk.class);
            synchronized (f65.a) {
                if (encoderNotUsePersistentInputSurfaceQuirk == null) {
                    try {
                        if (f65.b == null) {
                            surface = MediaCodec.createPersistentInputSurface();
                            f65.b = surface;
                        }
                        f65.w.e.setInputSurface(f65.b);
                    } catch (Throwable th) {
                        while (true) {
                            throw th;
                        }
                    }
                } else {
                    Surface surface2 = f65.b;
                    if (surface2 != null) {
                        f65.c.add(surface2);
                    }
                    surface = f65.w.e.createInputSurface();
                    f65.b = surface;
                }
                o55 = f65.o;
                executor = f65.v;
            }
            if (surface != null && o55 != null && executor != null) {
                try {
                    ((tsd) executor).execute(new bk4(21, (fkd) o55, surface));
                } catch (RejectedExecutionException unused) {
                    String str = f65.w.a;
                }
            }
        }
    }

    public final void i(int i2) {
        if (this.D != i2) {
            this.D = i2;
        }
    }

    public final void j() {
        n55 n55 = this.f;
        if (n55 instanceof c65) {
            ((c65) n55).a(false);
            ArrayList arrayList = new ArrayList();
            Iterator it = this.m.iterator();
            while (it.hasNext()) {
                arrayList.add(hd8.J(((eg7) it.next()).d));
            }
            hd8.W(arrayList).d(new u55(this, 0), this.h);
        } else if (n55 instanceof f65) {
            try {
                if (on4.a.g(SignalEosOutputBufferNotComeQuirk.class) != null) {
                    e65 e65 = this.y;
                    tsd tsd = this.h;
                    Future future = this.C;
                    if (future != null) {
                        future.cancel(false);
                    }
                    this.C = ryg.G().schedule((Runnable) new bk4(12, tsd, e65), 1000, TimeUnit.MILLISECONDS);
                }
                this.e.signalEndOfInputStream();
                this.B = true;
            } catch (MediaCodec.CodecException e2) {
                b(1, e2.getMessage(), e2);
            }
        }
    }

    public final void k() {
        this.q.getClass();
        this.h.execute(new v55(this, ejd.f(), 1));
    }

    public final void l(Runnable runnable) {
        ArrayList arrayList = new ArrayList();
        HashSet hashSet = this.n;
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            arrayList.add(hd8.J(((h55) it.next()).v));
        }
        HashSet hashSet2 = this.m;
        Iterator it2 = hashSet2.iterator();
        while (it2.hasNext()) {
            arrayList.add(hd8.J(((eg7) it2.next()).d));
        }
        if (!arrayList.isEmpty()) {
            hashSet.size();
            hashSet2.size();
        }
        hd8.W(arrayList).d(new x55((Object) this, (Object) arrayList, (Object) runnable, 1), this.h);
    }
}
