package defpackage;

import android.content.ContentResolver;
import android.content.Context;
import android.net.Uri;
import android.os.SystemClock;
import android.provider.MediaStore;
import java.util.List;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.Lazy;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;

/* renamed from: yd7  reason: default package */
public final class yd7 implements s48, d14 {
    public static final String C0 = s48.class.getSimpleName();
    public aje A0;
    public final Object B0;
    public final k26 X;
    public final xme Y;
    public final wb Z;
    public final /* synthetic */ jx3 a;
    public final s04 b;
    public final gaf c;
    public final ContentResolver o;
    public final Lazy v;
    public final AtomicInteger v0;
    public final xme w;
    public pm7 w0;
    public final k26 x;
    public final AtomicInteger x0;
    public final xme y = f6e.a(new wk6(tk6.a, 0, false, false));
    public final ConcurrentHashMap y0;
    public final xme z;
    public final ConcurrentHashMap z0;

    /* JADX WARNING: type inference failed for: r5v14, types: [java.lang.Object, hr6] */
    public yd7(Context context, s04 s04, gaf gaf, Lazy lazy) {
        this.a = e14.a(CoroutineContext.Element.DefaultImpls.plus(kr7.b(), ((osa) gaf).b()));
        this.b = s04;
        this.c = gaf;
        this.o = context.getContentResolver();
        this.v = lazy;
        xme a2 = f6e.a(new wk6(sk6.a, 0, false, true));
        this.w = a2;
        this.x = new k26(new etc(a2), 14);
        xme a3 = f6e.a(new wk6(rk6.a, 0, false, true));
        this.z = a3;
        this.X = new k26(new etc(a3), 15);
        xme a4 = f6e.a((Object) null);
        this.Y = a4;
        this.Z = new wb(21, new on2(a4, 28), this);
        this.v0 = new AtomicInteger(0);
        this.x0 = new AtomicInteger(-1);
        this.y0 = new ConcurrentHashMap();
        this.z0 = new ConcurrentHashMap();
        u44 u44 = new u44(this);
        for (Uri registerContentObserver : CollectionsKt.listOf(MediaStore.Images.Media.EXTERNAL_CONTENT_URI, MediaStore.Video.Media.EXTERNAL_CONTENT_URI, MediaStore.Images.Media.INTERNAL_CONTENT_URI, MediaStore.Video.Media.INTERNAL_CONTENT_URI)) {
            try {
                this.o.registerContentObserver(registerContentObserver, true, u44);
            } catch (Throwable th) {
                this.b.m0(th, EmptyCoroutineContext.INSTANCE);
            }
        }
        y35 y35 = new y35(24, (Object) this);
        u75 u75 = new u75(25, this);
        s04 s042 = this.b;
        gaf gaf2 = this.c;
        ? obj = new Object();
        obj.a = this;
        obj.b = s042;
        obj.c = y35;
        obj.o = u75;
        z68.c("hr6", "init", new Object[0]);
        ev0.v(this, ((osa) gaf2).c().plus(s042), (f14) null, new od8(obj, (Continuation) null), 2);
        this.B0 = new Object();
    }

    public static final Object a(vk6 vk6, yd7 yd7, Continuation continuation) {
        return ev0.I(((osa) yd7.c).b(), new wd7(vk6, yd7, (Continuation) null), continuation);
    }

    public final CoroutineContext U() {
        return this.a.a;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0006, code lost:
        r2 = (java.util.List) r2.y0.get(r3.a);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean b(defpackage.wk6 r3) {
        /*
            r2 = this;
            int r0 = r3.b
            r1 = 0
            if (r0 != 0) goto L_0x0006
            return r1
        L_0x0006:
            java.util.concurrent.ConcurrentHashMap r2 = r2.y0
            vk6 r0 = r3.a
            java.lang.Object r2 = r2.get(r0)
            java.util.List r2 = (java.util.List) r2
            if (r2 != 0) goto L_0x0013
            return r1
        L_0x0013:
            int r2 = r2.size()
            int r3 = r3.b
            if (r2 >= r3) goto L_0x001c
            r1 = 1
        L_0x001c:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.yd7.b(wk6):boolean");
    }

    public final void c() {
        ConcurrentHashMap concurrentHashMap = this.y0;
        for (vk6 vk6 : concurrentHashMap.keySet()) {
            if (vk6 instanceof qk6) {
                concurrentHashMap.put(vk6, CollectionsKt.emptyList());
            }
        }
    }

    public final List d(vk6 vk6) {
        List list = (List) this.y0.get(vk6);
        return list == null ? CollectionsKt.emptyList() : list;
    }

    public final Object e(wk6 wk6, int i, Continuation continuation) {
        return ev0.I(((osa) this.c).b(), new nd7(wk6, i, this, (Continuation) null), continuation);
    }

    public final void f() {
        aje aje;
        synchronized (this.B0) {
            try {
                z68.c(C0, "onContentChanged()", new Object[0]);
                aje aje2 = this.A0;
                if (!(aje2 == null || !aje2.isActive() || (aje = this.A0) == null)) {
                    aje.b((CancellationException) null);
                }
                this.A0 = ev0.v(this, this.b, (f14) null, new od7(this, (Continuation) null), 2);
                Unit unit = Unit.INSTANCE;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void g() {
        pm7 pm7 = this.w0;
        AtomicInteger atomicInteger = this.v0;
        String str = C0;
        Boolean bool = null;
        if (pm7 != null) {
            int i = atomicInteger.get();
            pm7 pm72 = this.w0;
            Boolean valueOf = pm72 != null ? Boolean.valueOf(pm72.isActive()) : null;
            pm7 pm73 = this.w0;
            if (pm73 != null) {
                bool = Boolean.valueOf(pm73.e0());
            }
            z68.c(str, "prefetch " + i + " is not null, prefetchJob.isActive = " + valueOf + ", prefetchJob.isCompleted = " + bool, new Object[0]);
        } else if (!((edb) this.v.getValue()).c()) {
            z68.c(str, "permission is not granted", new Object[0]);
        } else {
            int incrementAndGet = atomicInteger.incrementAndGet();
            long elapsedRealtime = SystemClock.elapsedRealtime();
            z68.c(str, "prefetch " + incrementAndGet + " start", new Object[0]);
            aje v2 = ev0.v(this, this.b, (f14) null, new sd7(this, incrementAndGet, (Continuation) null), 2);
            v2.V(new yc7(elapsedRealtime, incrementAndGet));
            this.w0 = v2;
        }
    }

    public final Object h(vk6 vk6, int i, Continuation continuation) {
        Object I = ev0.I(((osa) this.c).b().plus(this.b), new xd7(this, vk6, i, (Continuation) null), continuation);
        return I == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? I : Unit.INSTANCE;
    }
}
