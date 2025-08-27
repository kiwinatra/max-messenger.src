package defpackage;

import android.graphics.SurfaceTexture;
import android.media.Image;
import android.net.Uri;
import android.os.Handler;
import android.view.Surface;
import android.view.View;
import android.view.Window;
import androidx.media3.common.ParserException;
import androidx.media3.exoplayer.dash.DashManifestStaleException;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.UShort;
import kotlin.jvm.internal.LongCompanionObject;
import kotlin.properties.ReadWriteProperty;
import kotlin.reflect.KProperty;
import one.me.calls.ui.ui.call.panels.CallTopPanelWidget;
import one.me.chatmedia.viewer.ChatMediaViewerScreen;
import one.me.chatmedia.viewer.photo.GifViewerWidget;
import one.me.chatmedia.viewer.video.VideoViewerWidget;
import ru.ok.tamtam.errors.TamErrorException;

/* renamed from: wie  reason: default package */
public class wie implements h79, e80, sl1, btc, qk3, psd, ReadWriteProperty, q28, b0a, kr4, umb, f9g, nj6, b69, aq9, pr4 {
    public final /* synthetic */ int a;
    public Object b;

    public /* synthetic */ wie(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    public void A(long j) {
        for (psd A : (psd[]) this.b) {
            A.A(j);
        }
    }

    public int B() {
        g4g g4g = ((GifViewerWidget) this.b).y;
        if (g4g != null) {
            return g4g.getHeight();
        }
        return 0;
    }

    public tb7 C(int i) {
        return ((yl4) this.b).C(i);
    }

    public void E(t28 t28, long j, long j2, boolean z) {
        ((o64) this.b).w((q8b) t28, j, j2);
    }

    public void G(Object obj) {
        qx0 qx0 = (qx0) obj;
        ((t9a) this.b).getClass();
    }

    /* JADX WARNING: type inference failed for: r1v5, types: [o8b, java.lang.Object] */
    public void H(t28 t28, long j, long j2) {
        long j3 = j;
        long j4 = j2;
        q8b q8b = (q8b) t28;
        o64 o64 = (o64) this.b;
        o64.getClass();
        long j5 = q8b.a;
        tne tne = q8b.o;
        Uri uri = tne.c;
        l28 l28 = new l28(j4, tne.o);
        o64.m.getClass();
        o64.q.x(l28, q8b.c, -1, (ea6) null, 0, (Object) null, -9223372036854775807L, -9223372036854775807L);
        y54 y54 = (y54) q8b.w;
        y54 y542 = o64.H;
        int size = y542 == null ? 0 : y542.m.size();
        long j6 = y54.b(0).b;
        int i = 0;
        while (i < size && o64.H.b(i).b < j6) {
            i++;
        }
        if (y54.d) {
            if (size - i > y54.m.size()) {
                i8b.V("Loaded out of sync manifest");
            } else {
                long j7 = o64.N;
                if (j7 == -9223372036854775807L || y54.h * 1000 > j7) {
                    o64.M = 0;
                } else {
                    i8b.V("Loaded stale dynamic manifest: " + y54.h + ", " + o64.N);
                }
            }
            int i2 = o64.M;
            o64.M = i2 + 1;
            if (i2 < o64.m.p(q8b.c)) {
                o64.D.postDelayed(o64.v, (long) Math.min((o64.M - 1) * 1000, 5000));
                return;
            } else {
                o64.C = new DashManifestStaleException();
                return;
            }
        }
        o64.H = y54;
        o64.I = y54.d & o64.I;
        o64.J = j3 - j4;
        o64.K = j3;
        o64.O += i;
        synchronized (o64.t) {
            try {
                if (q8b.b.a == o64.F) {
                    Uri uri2 = o64.H.k;
                    if (uri2 == null) {
                        uri2 = q8b.o.c;
                    }
                    o64.F = uri2;
                }
            } catch (Throwable th) {
                while (true) {
                    throw th;
                }
            }
        }
        y54 y543 = o64.H;
        if (!y543.d || o64.L != -9223372036854775807L) {
            o64.y(true);
            return;
        }
        te4 te4 = y543.i;
        if (te4 != null) {
            String str = te4.b;
            if (v0g.a(str, "urn:mpeg:dash:utc:direct:2014") || v0g.a(str, "urn:mpeg:dash:utc:direct:2012")) {
                try {
                    o64.L = v0g.V(te4.c) - o64.K;
                    o64.y(true);
                } catch (ParserException e) {
                    o64.x(e);
                }
            } else if (v0g.a(str, "urn:mpeg:dash:utc:http-iso:2014") || v0g.a(str, "urn:mpeg:dash:utc:http-iso:2012")) {
                q8b q8b2 = new q8b(o64.z, Uri.parse(te4.c), 5, new Object());
                o64.q.C(new l28(q8b2.a, q8b2.b, o64.A.F(q8b2, new b8d((Object) o64), 1)), q8b2.c, -1, (ea6) null, 0, (Object) null, -9223372036854775807L, -9223372036854775807L);
            } else if (v0g.a(str, "urn:mpeg:dash:utc:http-xsdate:2014") || v0g.a(str, "urn:mpeg:dash:utc:http-xsdate:2012")) {
                q8b q8b3 = new q8b(o64.z, Uri.parse(te4.c), 5, new sx6(10));
                o64.q.C(new l28(q8b3.a, q8b3.b, o64.A.F(q8b3, new b8d((Object) o64), 1)), q8b3.c, -1, (ea6) null, 0, (Object) null, -9223372036854775807L, -9223372036854775807L);
            } else if (v0g.a(str, "urn:mpeg:dash:utc:ntp:2014") || v0g.a(str, "urn:mpeg:dash:utc:ntp:2012")) {
                o64.v();
            } else {
                o64.x(new IOException("Unsupported UTC timing scheme"));
            }
        } else {
            o64.v();
        }
    }

    public void J(Object obj) {
        qx0 qx0 = (qx0) obj;
        ((t9a) this.b).getClass();
    }

    public int K() {
        return ((ByteBuffer) this.b).getInt();
    }

    public boolean M(long j) {
        boolean z;
        long j2 = j;
        boolean z2 = false;
        do {
            long i = i();
            if (i == Long.MIN_VALUE) {
                break;
            }
            z = false;
            for (psd psd : (psd[]) this.b) {
                long i2 = psd.i();
                boolean z3 = i2 != Long.MIN_VALUE && i2 <= j2;
                if (i2 == i || z3) {
                    z |= psd.M(j2);
                }
            }
            z2 |= z;
        } while (z);
        return z2;
    }

    public e0a N(String str) {
        return new e4(14, (Object) ((yl4) this.b).N(str));
    }

    public void R(int i) {
        ByteBuffer byteBuffer = (ByteBuffer) this.b;
        byteBuffer.position(byteBuffer.position() + i);
    }

    public void U(Object obj) {
        qx0 qx0 = (qx0) obj;
        ((t9a) this.b).getClass();
    }

    public long W() {
        return ((long) ((ByteBuffer) this.b).getInt()) & 4294967295L;
    }

    /* JADX WARNING: Removed duplicated region for block: B:19:0x005a  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x005d  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public defpackage.p01 Z(defpackage.t28 r9, long r10, long r12, java.io.IOException r14, int r15) {
        /*
            r8 = this;
            q8b r9 = (defpackage.q8b) r9
            java.lang.Object r8 = r8.b
            o64 r8 = (defpackage.o64) r8
            r8.getClass()
            l28 r10 = new l28
            long r0 = r9.a
            tne r11 = r9.o
            android.net.Uri r0 = r11.c
            java.util.Map r11 = r11.o
            r10.<init>(r12, r11)
            nfd r11 = r8.m
            r11.getClass()
            boolean r11 = r14 instanceof androidx.media3.common.ParserException
            r12 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            if (r11 != 0) goto L_0x0055
            boolean r11 = r14 instanceof java.io.FileNotFoundException
            if (r11 != 0) goto L_0x0055
            boolean r11 = r14 instanceof androidx.media3.datasource.HttpDataSource$CleartextNotPermittedException
            if (r11 != 0) goto L_0x0055
            boolean r11 = r14 instanceof androidx.media3.exoplayer.upstream.Loader$UnexpectedLoaderException
            if (r11 != 0) goto L_0x0055
            int r11 = androidx.media3.datasource.DataSourceException.b
            r11 = r14
        L_0x0033:
            if (r11 == 0) goto L_0x0048
            boolean r0 = r11 instanceof androidx.media3.datasource.DataSourceException
            if (r0 == 0) goto L_0x0043
            r0 = r11
            androidx.media3.datasource.DataSourceException r0 = (androidx.media3.datasource.DataSourceException) r0
            int r0 = r0.a
            r1 = 2008(0x7d8, float:2.814E-42)
            if (r0 != r1) goto L_0x0043
            goto L_0x0055
        L_0x0043:
            java.lang.Throwable r11 = r11.getCause()
            goto L_0x0033
        L_0x0048:
            int r15 = r15 + -1
            int r15 = r15 * 1000
            r11 = 5000(0x1388, float:7.006E-42)
            int r11 = java.lang.Math.min(r15, r11)
            long r0 = (long) r11
            r3 = r0
            goto L_0x0056
        L_0x0055:
            r3 = r12
        L_0x0056:
            int r11 = (r3 > r12 ? 1 : (r3 == r12 ? 0 : -1))
            if (r11 != 0) goto L_0x005d
            p01 r11 = defpackage.l15.w
            goto L_0x0066
        L_0x005d:
            p01 r11 = new p01
            r5 = 0
            r6 = 5
            r7 = 0
            r2 = r11
            r2.<init>(r3, r5, r6, r7)
        L_0x0066:
            boolean r12 = r11.a()
            r12 = r12 ^ 1
            cs r8 = r8.q
            int r9 = r9.c
            r8.A(r10, r9, r14, r12)
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.wie.Z(t28, long, long, java.io.IOException, int):p01");
    }

    public /* bridge */ /* synthetic */ void a(Object obj) {
        Void voidR = (Void) obj;
    }

    public boolean a0(m69 m69) {
        Window.Callback callback = ((eo) this.b).Z.getCallback();
        if (callback == null) {
            return true;
        }
        callback.onMenuOpened(108, m69);
        return true;
    }

    public void accept(Object obj) {
        Throwable th = (Throwable) obj;
        u02 u02 = (u02) this.b;
        z68.f(u02.x, "onUploadFailed: failed", th);
        eef t = u02.t();
        long j = u02.b;
        t.d(j);
        long j2 = u02.o;
        if (j2 != 0) {
            a32 G = u02.e().G(j2);
            if (G != null) {
                u02.e().g0(j2, x62.b);
                ((jna) u02.a()).l(G.b.a);
            }
        } else {
            hud hud = u02.a;
            if (hud == null) {
                hud = null;
            }
            ((km3) hud.n.getValue()).f((String) null, 0, (String) null, (String) null);
            long s = ((qjd) u02.i()).s();
            if (s > 0) {
                ((jna) u02.a()).x(s);
            }
        }
        u02.u().c(new hj0(j, th instanceof TamErrorException ? ((TamErrorException) th).a : new qaf("internal-error", th.toString(), (String) null)));
    }

    public void b0() {
        ArrayList arrayList;
        synchronized (this) {
            arrayList = new ArrayList(((HashMap) this.b).values());
            ((HashMap) this.b).clear();
        }
        for (int i = 0; i < arrayList.size(); i++) {
            j55 j55 = (j55) arrayList.get(i);
            if (j55 != null) {
                j55.close();
            }
        }
    }

    public void c() {
        ((ng5) this.b).d(50);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0043, code lost:
        r0 = r6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x004a, code lost:
        return r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized defpackage.j55 c0(defpackage.uae r6) {
        /*
            r5 = this;
            monitor-enter(r5)
            java.lang.Object r0 = r5.b     // Catch:{ all -> 0x0047 }
            java.util.HashMap r0 = (java.util.HashMap) r0     // Catch:{ all -> 0x0047 }
            java.lang.Object r0 = r0.get(r6)     // Catch:{ all -> 0x0047 }
            j55 r0 = (defpackage.j55) r0     // Catch:{ all -> 0x0047 }
            if (r0 == 0) goto L_0x0049
            monitor-enter(r0)     // Catch:{ all -> 0x0047 }
            boolean r1 = defpackage.j55.k0(r0)     // Catch:{ all -> 0x003c }
            if (r1 != 0) goto L_0x003e
            java.lang.Object r1 = r5.b     // Catch:{ all -> 0x003c }
            java.util.HashMap r1 = (java.util.HashMap) r1     // Catch:{ all -> 0x003c }
            r1.remove(r6)     // Catch:{ all -> 0x003c }
            java.lang.Class<wie> r1 = defpackage.wie.class
            java.lang.String r2 = "Found closed reference %d for key %s (%d)"
            int r3 = java.lang.System.identityHashCode(r0)     // Catch:{ all -> 0x003c }
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)     // Catch:{ all -> 0x003c }
            java.lang.String r4 = r6.a     // Catch:{ all -> 0x003c }
            int r6 = java.lang.System.identityHashCode(r6)     // Catch:{ all -> 0x003c }
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)     // Catch:{ all -> 0x003c }
            java.lang.Object[] r6 = new java.lang.Object[]{r3, r4, r6}     // Catch:{ all -> 0x003c }
            defpackage.bg5.l(r1, r2, r6)     // Catch:{ all -> 0x003c }
            monitor-exit(r0)     // Catch:{ all -> 0x003c }
            monitor-exit(r5)
            r5 = 0
            return r5
        L_0x003c:
            r6 = move-exception
            goto L_0x0045
        L_0x003e:
            j55 r6 = defpackage.j55.a(r0)     // Catch:{ all -> 0x003c }
            monitor-exit(r0)     // Catch:{ all -> 0x003c }
            r0 = r6
            goto L_0x0049
        L_0x0045:
            monitor-exit(r0)     // Catch:{ all -> 0x003c }
            throw r6     // Catch:{ all -> 0x0047 }
        L_0x0047:
            r6 = move-exception
            goto L_0x004b
        L_0x0049:
            monitor-exit(r5)
            return r0
        L_0x004b:
            monitor-exit(r5)     // Catch:{ all -> 0x0047 }
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.wie.c0(uae):j55");
    }

    public boolean d() {
        for (psd d : (psd[]) this.b) {
            if (d.d()) {
                return true;
            }
        }
        return false;
    }

    public ByteBuffer d0() {
        return ((Image.Plane) this.b).getBuffer();
    }

    public void e() {
        switch (this.a) {
            case 18:
                xga xga = (xga) ((nr4) this.b).e;
                xga.getClass();
                KProperty[] kPropertyArr = VideoViewerWidget.X;
                j9g e0 = ((VideoViewerWidget) xga.b).e0();
                if (e0 != null) {
                    ((ChatMediaViewerScreen) e0).v0(true);
                    return;
                }
                return;
            default:
                x2a x2a = ((m0a) this.b).z;
                if (x2a != null) {
                    x2a.N(new zj0(21));
                    return;
                }
                return;
        }
    }

    public int e0() {
        return ((Image.Plane) this.b).getPixelStride();
    }

    public void f() {
        g4g g4g = ((GifViewerWidget) this.b).y;
    }

    public int f0() {
        return ((Image.Plane) this.b).getRowStride();
    }

    public void g(Throwable th) {
        ((ha7) this.b).close();
    }

    public void g0(String str) {
        z68.a(((y2) this.b).e, str);
    }

    public je3 getConfig() {
        return (je3) this.b;
    }

    public Object getValue(Object obj, KProperty kProperty) {
        switch (this.a) {
            case 13:
                return (pm7) ((AtomicReference) this.b).get();
            default:
                Object b2 = ((hdd) this.b).b("CreateChannelViewModel:taken_photo_file_name");
                if (b2 == null) {
                    return null;
                }
                return b2;
        }
    }

    public long h() {
        return (long) ((ByteBuffer) this.b).position();
    }

    public synchronized void h0() {
        bg5.f(wie.class, Integer.valueOf(((HashMap) this.b).size()), "Count = %d");
    }

    public long i() {
        long j = Long.MAX_VALUE;
        for (psd i : (psd[]) this.b) {
            long i2 = i.i();
            if (i2 != Long.MIN_VALUE) {
                j = Math.min(j, i2);
            }
        }
        if (j == LongCompanionObject.MAX_VALUE) {
            return Long.MIN_VALUE;
        }
        return j;
    }

    public void i0(Exception exc) {
        iq.a("Audio sink error", exc);
        wsb wsb = ((kn8) this.b).P1;
        Handler handler = (Handler) wsb.a;
        if (handler != null) {
            handler.post(new f70(wsb, exc, 1));
        }
    }

    public void j(Surface surface) {
        String str = ((GifViewerWidget) this.b).a;
        a67 a67 = z68.b;
        if (a67 != null && a67.c()) {
            w78 w78 = w78.o;
            a67.d(w78, str, "Media viewer. Video viewer, set surface " + surface, (Throwable) null);
        }
        n7g f0 = ((GifViewerWidget) this.b).f0();
        if (f0 != null) {
            f0.L0(surface);
        }
    }

    public void j0(View view) {
        if (view.getParent() != null) {
            view.setVisibility(8);
        }
        ((il0) this.b).a(0);
    }

    public void k0(vag vag) {
        KProperty[] kPropertyArr = CallTopPanelWidget.o;
        xag.h(((jj1) ((CallTopPanelWidget) this.b).d0().b).K0, new rh1(vag));
    }

    public synchronized void l0(qx0 qx0, j55 j55) {
        qx0.getClass();
        if (j55.k0(j55)) {
            j55.b((j55) ((HashMap) this.b).put(qx0, j55.a(j55)));
            h0();
        } else {
            throw new IllegalArgumentException();
        }
    }

    public void m(m69 m69, boolean z) {
        ((eo) this.b).q(m69);
    }

    public ue1 m0(int i) {
        ln1 ln1 = (ln1) ((ConcurrentHashMap) this.b).get(Integer.valueOf(i));
        if (ln1 != null) {
            return ln1.b;
        }
        return null;
    }

    /* JADX INFO: finally extract failed */
    public synchronized void n0(qx0 qx0, j55 j55) {
        qx0.getClass();
        j55.getClass();
        if (j55.k0(j55)) {
            j55 j552 = (j55) ((HashMap) this.b).get(qx0);
            if (j552 != null) {
                y33 o = y33.o(j552.a);
                y33 o2 = y33.o(j55.a);
                if (!(o == null || o2 == null)) {
                    try {
                        if (o.e0() == o2.e0()) {
                            ((HashMap) this.b).remove(qx0);
                            y33.U(o2);
                            y33.U(o);
                            j55.b(j552);
                            h0();
                            return;
                        }
                    } catch (Throwable th) {
                        y33.U(o2);
                        y33.U(o);
                        j55.b(j552);
                        throw th;
                    }
                }
                y33.U(o2);
                y33.U(o);
                j55.b(j552);
                return;
            }
            return;
        }
        throw new IllegalArgumentException();
    }

    public void onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        String str = ((GifViewerWidget) this.b).a;
        a67 a67 = z68.b;
        if (a67 != null && a67.c()) {
            w78 w78 = w78.o;
            a67.d(w78, str, "Media viewer. Video viewer, surface destroyed " + surfaceTexture, (Throwable) null);
        }
    }

    public int p() {
        g4g g4g = ((GifViewerWidget) this.b).y;
        if (g4g != null) {
            return g4g.getWidth();
        }
        return 0;
    }

    public int readUnsignedShort() {
        return ((ByteBuffer) this.b).getShort() & UShort.MAX_VALUE;
    }

    /* JADX WARNING: type inference failed for: r2v1, types: [java.lang.Object, java.util.function.BinaryOperator] */
    public void setValue(Object obj, KProperty kProperty, Object obj2) {
        switch (this.a) {
            case 13:
                pm7 pm7 = (pm7) ((AtomicReference) this.b).accumulateAndGet((pm7) obj2, new Object());
                if (pm7 != null) {
                    pm7.start();
                    return;
                }
                return;
            default:
                getValue(obj, kProperty);
                ((hdd) this.b).c(obj2, "CreateChannelViewModel:taken_photo_file_name");
                return;
        }
    }

    public void t(int i) {
        switch (this.a) {
            case 18:
                nr4.a((nr4) this.b, false, i * 10);
                return;
            default:
                m0a m0a = (m0a) this.b;
                m0a.b.c = 0;
                m0a.W(m0a, true, i * 10);
                return;
        }
    }

    public long y() {
        long j = Long.MAX_VALUE;
        for (psd y : (psd[]) this.b) {
            long y2 = y.y();
            if (y2 != Long.MIN_VALUE) {
                j = Math.min(j, y2);
            }
        }
        if (j == LongCompanionObject.MAX_VALUE) {
            return Long.MIN_VALUE;
        }
        return j;
    }

    public /* synthetic */ wie(int i, boolean z) {
        this.a = i;
    }

    public wie(int i) {
        this.a = i;
        switch (i) {
            case 21:
                this.b = new wi6(5, 0, (byte) 0);
                return;
            case 25:
                this.b = new ConcurrentHashMap();
                return;
            default:
                this.b = new yl4(9);
                return;
        }
    }

    public wie(ByteBuffer byteBuffer) {
        this.a = 28;
        this.b = byteBuffer;
        byteBuffer.order(ByteOrder.BIG_ENDIAN);
    }
}
