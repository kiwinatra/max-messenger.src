package defpackage;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.os.Looper;
import android.os.PowerManager;
import android.util.AttributeSet;
import android.util.Size;
import android.util.TypedValue;
import android.widget.FrameLayout;
import androidx.camera.core.ProcessingException;
import androidx.fragment.app.a;
import androidx.media3.common.VideoFrameProcessingException;
import androidx.media3.transformer.ExportException;
import java.io.ByteArrayOutputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicLong;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.collections.SetsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.math.MathKt;
import kotlin.text.Regex;
import org.webrtc.CapturerObserver;
import org.webrtc.VideoFrame;

/* renamed from: g6d  reason: default package */
public final class g6d implements ola, CapturerObserver, trf, k6g, wdf {
    public final /* synthetic */ int a;
    public Object b;
    public Object c;
    public Object o;

    public /* synthetic */ g6d(int i, Object obj, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    public static g6d w(Context context, AttributeSet attributeSet, int[] iArr, int i, int i2) {
        return new g6d(17, (Object) context, (Object) context.obtainStyledAttributes(attributeSet, iArr, i, i2));
    }

    public void F(long j) {
    }

    public void a(VideoFrameProcessingException videoFrameProcessingException) {
        ((pk3) this.c).accept(new ExportException("Video frame processing error", videoFrameProcessingException, 5001));
    }

    public void b() {
        ((ee5) this.b).b();
        ((hm4) this.c).e = true;
    }

    public void c() {
        ((trf) this.b).c();
    }

    public gu6 d(int i) {
        return ((trf) this.b).d(i);
    }

    public void e(long j) {
        ((r8g) this.o).i = j;
        try {
            ((r8g) this.o).f.b();
        } catch (ExportException e) {
            ((pk3) this.c).accept(e);
        }
    }

    public boolean f() {
        return ((trf) this.b).f();
    }

    public void g(int i, int i2) {
        r3f r3f;
        try {
            r3f = ((r8g) this.o).f.a(i, i2);
        } catch (ExportException e) {
            ((pk3) this.c).accept(e);
            r3f = null;
        }
        j(r3f);
    }

    public void i(jm jmVar) {
        k47 k47 = (k47) this.o;
        if (k47 instanceof k47) {
            k47.e = jmVar;
        }
    }

    public void j(r3f r3f) {
        ((trf) this.b).j(r3f);
    }

    public tc0 k() {
        String str = ((String) this.b) == null ? " backendName" : "";
        if (((tub) this.o) == null) {
            str = str.concat(" priority");
        }
        if (str.isEmpty()) {
            return new tc0((String) this.b, (byte[]) this.c, (tub) this.o);
        }
        throw new IllegalStateException("Missing required properties:".concat(str));
    }

    public void l(q3f q3f, Map.Entry entry) {
        q3f q3f2 = (q3f) entry.getValue();
        kc0 kc0 = new kc0(q3f.g.a, ((nb0) entry.getKey()).d, q3f.c ? (su1) this.c : null, ((nb0) entry.getKey()).f, ((nb0) entry.getKey()).g);
        int i = ((nb0) entry.getKey()).c;
        q3f2.getClass();
        ev0.g();
        q3f2.b();
        bs0.r("Consumer can only be linked once.", !q3f2.j);
        q3f2.j = true;
        p3f p3f = q3f2.l;
        hd8.a(hd8.b0(p3f.c(), new o3f(q3f2, p3f, i, kc0, (kc0) null), ryg.G()), new dm4(this, q3f2, false, 27), ryg.G());
    }

    public void m(Object obj, ByteArrayOutputStream byteArrayOutputStream) {
        Map map = (Map) this.b;
        w8c w8c = new w8c(byteArrayOutputStream, map, (Map) this.c, (dha) this.o);
        if (obj != null) {
            dha dha = (dha) map.get(obj.getClass());
            if (dha != null) {
                dha.a(obj, w8c);
                return;
            }
            throw new RuntimeException("No encoder for " + obj.getClass());
        }
    }

    public ByteBuffer n() {
        AtomicLong atomicLong = (AtomicLong) this.o;
        long j = atomicLong.get();
        ByteBuffer byteBuffer = (ByteBuffer) this.c;
        if (!byteBuffer.hasRemaining()) {
            byteBuffer.clear();
            if (j < ((long) byteBuffer.capacity())) {
                byteBuffer.limit((int) j);
            }
            atomicLong.addAndGet((long) (-byteBuffer.remaining()));
        }
        return byteBuffer;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x0011, code lost:
        r2 = defpackage.q8.j((r1 = r0.getResourceId(r3, 0)), (android.content.Context) r2.b);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.content.res.ColorStateList o(int r3) {
        /*
            r2 = this;
            java.lang.Object r0 = r2.c
            android.content.res.TypedArray r0 = (android.content.res.TypedArray) r0
            boolean r1 = r0.hasValue(r3)
            if (r1 == 0) goto L_0x001c
            r1 = 0
            int r1 = r0.getResourceId(r3, r1)
            if (r1 == 0) goto L_0x001c
            java.lang.Object r2 = r2.b
            android.content.Context r2 = (android.content.Context) r2
            android.content.res.ColorStateList r2 = defpackage.q8.j(r1, r2)
            if (r2 == 0) goto L_0x001c
            return r2
        L_0x001c:
            android.content.res.ColorStateList r2 = r0.getColorStateList(r3)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.g6d.o(int):android.content.res.ColorStateList");
    }

    public void onCapturerStarted(boolean z) {
        if (z) {
            ((hz0) ((p1e) this.c).a).T0.log("OKRTCCall", "Screen capture has started, fast=true");
        }
    }

    public void onCapturerStopped() {
        ((p1e) this.c).e(true);
    }

    public void onFrameCaptured(VideoFrame videoFrame) {
        if (videoFrame != null) {
            ((i8d) this.b).getClass();
        } else {
            videoFrame = null;
        }
        CapturerObserver capturerObserver = (CapturerObserver) this.o;
        if (capturerObserver != null) {
            capturerObserver.onFrameCaptured(videoFrame);
        }
    }

    public ht3 p() {
        return (ht3) ((Lazy) this.c).getValue();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x000a, code lost:
        r1 = r0.getResourceId(r3, 0);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.graphics.drawable.Drawable q(int r3) {
        /*
            r2 = this;
            java.lang.Object r0 = r2.c
            android.content.res.TypedArray r0 = (android.content.res.TypedArray) r0
            boolean r1 = r0.hasValue(r3)
            if (r1 == 0) goto L_0x001a
            r1 = 0
            int r1 = r0.getResourceId(r3, r1)
            if (r1 == 0) goto L_0x001a
            java.lang.Object r2 = r2.b
            android.content.Context r2 = (android.content.Context) r2
            android.graphics.drawable.Drawable r2 = defpackage.iq.D(r2, r1)
            return r2
        L_0x001a:
            android.graphics.drawable.Drawable r2 = r0.getDrawable(r3)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.g6d.q(int):android.graphics.drawable.Drawable");
    }

    public Drawable r(int i) {
        int resourceId;
        Drawable e;
        if (!((TypedArray) this.c).hasValue(i) || (resourceId = ((TypedArray) this.c).getResourceId(i, 0)) == 0) {
            return null;
        }
        ho a2 = ho.a();
        Context context = (Context) this.b;
        synchronized (a2) {
            e = a2.a.e(resourceId, context, true);
        }
        return e;
    }

    public void release() {
        switch (this.a) {
            case 16:
                ((t3f) this.b).release();
                ev0.E(new mgd(18, this));
                return;
            default:
                ((trf) this.b).release();
                return;
        }
    }

    public Typeface s(int i, int i2, bp bpVar) {
        int resourceId = ((TypedArray) this.c).getResourceId(i, 0);
        if (resourceId == 0) {
            return null;
        }
        if (((TypedValue) this.o) == null) {
            this.o = new TypedValue();
        }
        TypedValue typedValue = (TypedValue) this.o;
        ThreadLocal threadLocal = h4d.a;
        Context context = (Context) this.b;
        if (context.isRestricted()) {
            return null;
        }
        return h4d.b(context, resourceId, typedValue, i2, bpVar, true, false);
    }

    public PowerManager.WakeLock t() {
        if (((PowerManager.WakeLock) this.o) == null) {
            PowerManager powerManager = (PowerManager) ((Context) this.b).getSystemService("power");
            if (!powerManager.isWakeLockLevelSupported(32)) {
                return null;
            }
            this.o = powerManager.newWakeLock(32, "tamtam:callsproximitylock");
        }
        return (PowerManager.WakeLock) this.o;
    }

    public String toString() {
        switch (this.a) {
            case 11:
                StringBuilder sb = new StringBuilder(32);
                sb.append((String) this.b);
                sb.append('{');
                ox0 ox0 = (ox0) ((ox0) this.c).b;
                String str = "";
                while (ox0 != null) {
                    Object obj = ox0.c;
                    sb.append(str);
                    if (obj == null || !obj.getClass().isArray()) {
                        sb.append(obj);
                    } else {
                        String deepToString = Arrays.deepToString(new Object[]{obj});
                        sb.append(deepToString, 1, deepToString.length() - 1);
                    }
                    ox0 = (ox0) ox0.b;
                    str = ", ";
                }
                sb.append('}');
                return sb.toString();
            default:
                return super.toString();
        }
    }

    public boolean u() {
        return ((ByteBuffer) this.c).hasRemaining() || ((AtomicLong) this.o).get() > 0;
    }

    /* JADX INFO: finally extract failed */
    public long v(um3 um3) {
        ht3 p = p();
        long j = um3.a;
        qn3 qn3 = new qn3(0, j, 0, 0, um3);
        ConcurrentHashMap concurrentHashMap = ((qi6) ((Lazy) this.o).getValue()).a;
        i6d i6d = p.a;
        i6d.b();
        i6d.c();
        try {
            long d0 = p.b.d0(qn3);
            i6d.r();
            i6d.l();
            if (um3.j == 0 || !um3.a()) {
                Object obj = concurrentHashMap.get(Long.valueOf(j));
                List list = um3.f;
                if (!(obj == null ? false : Intrinsics.areEqual(obj, (Object) Integer.valueOf(list.hashCode())))) {
                    concurrentHashMap.remove(Long.valueOf(j));
                    Regex regex = ti6.a;
                    ri6 b2 = ti6.b(list);
                    if (b2 != null) {
                        String c2 = hhf.c(um3.p);
                        if (cvg.A(c2)) {
                            c2 = "";
                        }
                        String k = tld.k(c2);
                        String str = null;
                        ri6 ri6 = b2.c;
                        String str2 = ri6 != null ? ri6.a : null;
                        if (ri6 != null) {
                            str = ri6.b;
                        }
                        p.b(k, b2.a, b2.b, str2, str, j);
                        concurrentHashMap.put(Long.valueOf(j), Integer.valueOf(list.hashCode()));
                        String name = ht3.class.getName();
                        z68.c(name, "update_fts_title_contacts2 for #" + j, new Object[0]);
                    }
                }
            }
            return d0;
        } catch (Throwable th) {
            i6d.l();
            throw th;
        }
    }

    public void x() {
        ((TypedArray) this.c).recycle();
    }

    public void y(String str) {
        if (str != null) {
            this.b = str;
            return;
        }
        throw new NullPointerException("Null backendName");
    }

    public rx4 z(mc0 mc0) {
        q3f q3f;
        boolean z;
        Rect rect;
        mc0 mc02 = mc0;
        ev0.g();
        this.o = new HashMap();
        Iterator it = mc02.b.iterator();
        while (true) {
            boolean hasNext = it.hasNext();
            q3f = mc02.a;
            if (hasNext) {
                nb0 nb0 = (nb0) it.next();
                rx4 rx4 = (rx4) this.o;
                Rect rect2 = nb0.d;
                Matrix matrix = new Matrix(q3f.b);
                RectF rectF = new RectF(rect2);
                RectF rectF2 = grf.a;
                float f = (float) 0;
                Size size = nb0.e;
                RectF rectF3 = new RectF(f, f, (float) size.getWidth(), (float) size.getHeight());
                int i = nb0.f;
                boolean z2 = nb0.g;
                Matrix a2 = grf.a(rectF, rectF3, i, z2);
                matrix.postConcat(a2);
                bs0.n(grf.d(grf.g(grf.e(rect2), i), false, size));
                if (nb0.h) {
                    Rect rect3 = nb0.d;
                    Rect rect4 = q3f.d;
                    boolean contains = rect3.contains(rect4);
                    bs0.m("Output crop rect " + rect3 + " must contain input crop rect " + rect4, contains);
                    rect = new Rect();
                    RectF rectF4 = new RectF(rect4);
                    a2.mapRect(rectF4);
                    rectF4.round(rect);
                    z = false;
                } else {
                    z = false;
                    rect = new Rect(0, 0, size.getWidth(), size.getHeight());
                }
                q13 a3 = q3f.g.a();
                a3.b = size;
                hc0 h = a3.h();
                int i2 = q3f.i - i;
                boolean z3 = q3f.e != z2 ? true : z;
                Rect rect5 = rect;
                q3f q3f2 = r8;
                q3f q3f3 = new q3f(nb0.b, nb0.c, h, matrix, false, rect5, i2, -1, z3);
                rx4.put(nb0, q3f2);
            } else {
                try {
                    break;
                } catch (ProcessingException unused) {
                }
            }
        }
        ((t3f) this.b).a(q3f.d((su1) this.c, true));
        for (Map.Entry entry : ((rx4) this.o).entrySet()) {
            l(q3f, entry);
            ((q3f) entry.getValue()).a(new o6d((Object) this, (Object) q3f, (Object) entry, 8));
        }
        a0 a0Var = new a0(16, (rx4) this.o);
        q3f.getClass();
        q3f.o.add(a0Var);
        return (rx4) this.o;
    }

    public /* synthetic */ g6d(int i, boolean z) {
        this.a = i;
    }

    public g6d(it8 it8, a aVar, FrameLayout frameLayout) {
        this.a = 9;
        this.o = it8;
        this.b = aVar;
        this.c = frameLayout;
    }

    public /* synthetic */ g6d(Object obj, Object obj2, Object obj3, int i) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
        this.o = obj3;
    }

    public g6d(int i) {
        this.a = i;
        switch (i) {
            case 10:
                this.b = new vs6(26, false);
                this.c = new vs6(26, false);
                this.o = SetsKt.emptySet();
                return;
            default:
                Bitmap[] bitmapArr = new Bitmap[25];
                for (int i2 = 0; i2 < 25; i2++) {
                    bitmapArr[i2] = null;
                }
                this.b = bitmapArr;
                Integer num = 50;
                this.c = new go0(MathKt.roundToInt(num.doubleValue() * ((double) 1048576)), 0);
                this.o = new tb8(100);
                return;
        }
    }

    public g6d(j6d j6d) {
        this.a = 0;
        this.b = j6d;
        this.c = LazyKt.lazy(new ifb(15, this));
        this.o = LazyKt.lazy(gy3.v0);
    }

    public g6d(Context context) {
        this.a = 4;
        this.b = context;
        this.c = (ksd) ((qra) ym.e()).getAccessor().g(ksd.class);
    }

    public g6d(j60 j60) {
        this.a = 15;
        this.b = j60;
        ByteBuffer order = ByteBuffer.allocateDirect(j60.d * 1024).order(ByteOrder.nativeOrder());
        this.c = order;
        order.flip();
        this.o = new AtomicLong();
    }

    public g6d(Executor executor) {
        this.a = 19;
        this.c = new Handler(Looper.getMainLooper());
        this.o = new ky6(this);
        this.b = new qn(executor, 1);
    }

    public g6d(su1 su1, ti4 ti4) {
        this.a = 16;
        this.c = su1;
        this.b = ti4;
    }

    public g6d(String str) {
        this.a = 11;
        ox0 ox0 = new ox0(17, false);
        this.c = ox0;
        this.o = ox0;
        this.b = str;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v6, resolved type: k60[]} */
    /* JADX WARNING: type inference failed for: r1v0, types: [ufe, java.lang.Object] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public g6d(defpackage.k60[] r6) {
        /*
            r5 = this;
            r0 = 6
            r5.a = r0
            hae r0 = new hae
            r0.<init>()
            ufe r1 = new ufe
            r1.<init>()
            r2 = 1065353216(0x3f800000, float:1.0)
            r1.c = r2
            r1.d = r2
            i60 r2 = defpackage.i60.e
            r1.e = r2
            r1.f = r2
            r1.g = r2
            r1.h = r2
            java.nio.ByteBuffer r2 = defpackage.k60.a
            r1.k = r2
            java.nio.ShortBuffer r3 = r2.asShortBuffer()
            r1.l = r3
            r1.m = r2
            r2 = -1
            r1.b = r2
            r5.<init>()
            int r2 = r6.length
            int r2 = r2 + 2
            k60[] r2 = new defpackage.k60[r2]
            r5.b = r2
            r3 = 0
            int r4 = r6.length
            java.lang.System.arraycopy(r6, r3, r2, r3, r4)
            r5.c = r0
            r5.o = r1
            int r5 = r6.length
            r2[r5] = r0
            int r5 = r6.length
            int r5 = r5 + 1
            r2[r5] = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.g6d.<init>(k60[]):void");
    }

    public g6d(r8g r8g, Context context, srf srf, m53 m53, jrf jrf, rx0 rx0, t9a t9a, List list) {
        r8g r8g2 = r8g;
        this.a = 18;
        this.o = r8g2;
        this.c = jrf;
        this.b = srf.h(context, m53, rx0, this, t9a, list, r8g2.h);
    }
}
