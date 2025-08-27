package defpackage;

import android.os.Handler;
import android.text.Spannable;
import android.text.SpannableString;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import androidx.camera.core.CameraUnavailableException;
import com.google.android.gms.tasks.Task;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import java.io.InputStream;
import java.lang.reflect.Constructor;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.WeakHashMap;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.uuid.Uuid;
import org.json.JSONObject;
import org.webrtc.DataChannel;
import ru.ok.android.externcalls.analytics.CallAnalyticsSender;
import ru.ok.messages.views.widgets.TamAvatarView;
import ru.ok.tamtam.nano.Protos;

/* renamed from: p7d  reason: default package */
public final class p7d implements n1e, a8, uz2, DataChannel.Observer, a35, q17, ima, gce, h65, nj6, zi6, cnd, vla {
    public final /* synthetic */ int a;
    public Object b;
    public Object c;

    public /* synthetic */ p7d(int i) {
        this.a = i;
    }

    public void A(List list) {
        kse kse = (kse) ((Lazy) this.c).getValue();
        Iterable<boe> iterable = list;
        ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(iterable, 10));
        for (boe boe : iterable) {
            arrayList.add(new soe(0, boe.a, boe.b, boe.c, boe.o, boe.v, boe.w, boe.x, boe.y, boe.z, boe.X, boe.Z, boe.v0, boe.w0, boe.y0));
        }
        i6d i6d = kse.a;
        i6d.b();
        i6d.c();
        try {
            kse.b.a0(arrayList);
            i6d.r();
        } finally {
            i6d.l();
        }
    }

    public void B(InputStream inputStream, int i) {
        f69 f69;
        tf6.P();
        u6a u6a = (u6a) this.c;
        p7d p7d = (p7d) u6a.b;
        if (i > 0) {
            p7d.getClass();
            f69 = new f69((d69) p7d.b, i);
        } else {
            p7d.getClass();
            f69 = new f69((d69) p7d.b);
        }
        qp6 qp6 = (qp6) u6a.c;
        byte[] bArr = (byte[]) qp6.get(16384);
        while (true) {
            try {
                int read = inputStream.read(bArr);
                lk5 lk5 = (lk5) this.b;
                if (read < 0) {
                    ((kne) u6a.d).F(lk5);
                    u6a.c(f69, lk5);
                    qp6.b(bArr);
                    f69.close();
                    tf6.P();
                    return;
                } else if (read > 0) {
                    f69.write(bArr, 0, read);
                    u6a.d(f69, lk5);
                    int i2 = f69.c;
                    lk5.a.i(i > 0 ? ((float) i2) / ((float) i) : 1.0f - ((float) Math.exp(((double) (-i2)) / 50000.0d)));
                }
            } catch (Throwable th) {
                qp6.b(bArr);
                f69.close();
                throw th;
            }
        }
    }

    public void C(c96 c96) {
        int i = c96.b;
        Handler handler = (Handler) this.c;
        syc syc = (syc) this.b;
        if (i == 0) {
            handler.post(new vj6(2, (Object) syc, (Object) c96.a));
        } else {
            handler.post(new tk0(syc, i, 1));
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:34:0x00c0, code lost:
        defpackage.bs0.r("Unexpectedly invoke onConfigured() when there's a non-persistent in-progress recording", r10.o());
        r4 = null;
        r6 = null;
        r5 = 0;
        r7 = 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x00e7, code lost:
        if (r10.n == null) goto L_0x00ee;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x00e9, code lost:
        r4 = null;
        r6 = null;
        r5 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x00ec, code lost:
        r7 = r5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x00f1, code lost:
        if (r10.g0 != 3) goto L_0x00fe;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x00f3, code lost:
        r4 = r10.o;
        r10.o = null;
        r10.y();
        r6 = defpackage.lyc.m0;
        r7 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x00fe, code lost:
        r6 = null;
        r5 = 0;
        r7 = 0;
        r0 = r10.q(r10.k);
        r4 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x010f, code lost:
        r4 = null;
        r6 = null;
        r11 = false;
        r5 = 0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void a(java.lang.Object r11) {
        /*
            r10 = this;
            int r0 = r10.a
            switch(r0) {
                case 16: goto L_0x0151;
                default: goto L_0x0005;
            }
        L_0x0005:
            q55 r11 = (defpackage.q55) r11
            java.util.Objects.toString(r11)
            if (r11 != 0) goto L_0x000e
            goto L_0x014e
        L_0x000e:
            java.lang.Object r11 = r10.c
            mo4 r11 = (defpackage.mo4) r11
            java.lang.Object r11 = r11.g
            lyc r11 = (defpackage.lyc) r11
            nr4 r11 = r11.a0
            java.lang.Object r0 = r10.b
            nr4 r0 = (defpackage.nr4) r0
            r1 = 0
            r2 = 1
            if (r11 != r0) goto L_0x0022
            r11 = r2
            goto L_0x0023
        L_0x0022:
            r11 = r1
        L_0x0023:
            r0 = 0
            defpackage.bs0.r(r0, r11)
            java.lang.Object r11 = r10.c
            mo4 r11 = (defpackage.mo4) r11
            java.lang.Object r11 = r11.g
            lyc r11 = (defpackage.lyc) r11
            q55 r11 = r11.F
            if (r11 != 0) goto L_0x0035
            r11 = r2
            goto L_0x0036
        L_0x0035:
            r11 = r1
        L_0x0036:
            defpackage.bs0.r(r0, r11)
            java.lang.Object r11 = r10.c
            mo4 r11 = (defpackage.mo4) r11
            java.lang.Object r11 = r11.g
            lyc r11 = (defpackage.lyc) r11
            java.lang.Object r3 = r10.b
            nr4 r3 = (defpackage.nr4) r3
            r11.getClass()
            java.lang.Object r4 = r3.f
            g65 r4 = (defpackage.g65) r4
            r11.F = r4
            j3h r4 = r4.g
            a5g r4 = (defpackage.a5g) r4
            r4.E0()
            q55 r4 = r11.F
            g65 r4 = (defpackage.g65) r4
            android.media.MediaFormat r4 = r4.d
            java.lang.String r5 = "bitrate"
            boolean r6 = r4.containsKey(r5)
            if (r6 == 0) goto L_0x0066
            r4.getInteger(r5)
        L_0x0066:
            int r4 = r3.b
            r5 = 4
            if (r4 == r5) goto L_0x006d
            r4 = r0
            goto L_0x0071
        L_0x006d:
            java.lang.Object r4 = r3.g
            android.view.Surface r4 = (android.view.Surface) r4
        L_0x0071:
            r11.B = r4
            r11.A(r4)
            tsd r4 = r11.e
            byc r6 = new byc
            r6.<init>(r11)
            r3.i = r4
            r3.j = r6
            java.lang.Object r6 = r3.m
            zz7 r6 = (defpackage.zz7) r6
            zz7 r6 = defpackage.hd8.J(r6)
            ata r7 = new ata
            r8 = 22
            r9 = 0
            r7.<init>(r11, r3, r9, r8)
            defpackage.hd8.a(r6, r7, r4)
            java.lang.Object r10 = r10.c
            mo4 r10 = (defpackage.mo4) r10
            java.lang.Object r10 = r10.g
            lyc r10 = (defpackage.lyc) r10
            java.lang.String r11 = "Incorrectly invoke onConfigured() in state "
            java.lang.Object r3 = r10.h
            monitor-enter(r3)
            kyc r4 = r10.k     // Catch:{ all -> 0x00ba }
            int r4 = r4.ordinal()     // Catch:{ all -> 0x00ba }
            switch(r4) {
                case 0: goto L_0x010a;
                case 1: goto L_0x00e4;
                case 2: goto L_0x00e2;
                case 3: goto L_0x00ce;
                case 4: goto L_0x00bf;
                case 5: goto L_0x00bd;
                case 6: goto L_0x00ac;
                case 7: goto L_0x00ce;
                default: goto L_0x00aa;
            }     // Catch:{ all -> 0x00ba }
        L_0x00aa:
            goto L_0x010f
        L_0x00ac:
            boolean r11 = r10.i     // Catch:{ all -> 0x00ba }
            if (r11 == 0) goto L_0x00b2
            goto L_0x010f
        L_0x00b2:
            java.lang.AssertionError r10 = new java.lang.AssertionError     // Catch:{ all -> 0x00ba }
            java.lang.String r11 = "Unexpectedly invoke onConfigured() in a STOPPING state when it's not waiting for a new surface."
            r10.<init>(r11)     // Catch:{ all -> 0x00ba }
            throw r10     // Catch:{ all -> 0x00ba }
        L_0x00ba:
            r10 = move-exception
            goto L_0x014f
        L_0x00bd:
            r11 = r2
            goto L_0x00c0
        L_0x00bf:
            r11 = r1
        L_0x00c0:
            boolean r4 = r10.o()     // Catch:{ all -> 0x00ba }
            java.lang.String r5 = "Unexpectedly invoke onConfigured() when there's a non-persistent in-progress recording"
            defpackage.bs0.r(r5, r4)     // Catch:{ all -> 0x00ba }
            r4 = r0
            r6 = r4
            r5 = r1
            r7 = r2
            goto L_0x0114
        L_0x00ce:
            java.lang.AssertionError r0 = new java.lang.AssertionError     // Catch:{ all -> 0x00ba }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x00ba }
            r1.<init>(r11)     // Catch:{ all -> 0x00ba }
            kyc r10 = r10.k     // Catch:{ all -> 0x00ba }
            r1.append(r10)     // Catch:{ all -> 0x00ba }
            java.lang.String r10 = r1.toString()     // Catch:{ all -> 0x00ba }
            r0.<init>(r10)     // Catch:{ all -> 0x00ba }
            throw r0     // Catch:{ all -> 0x00ba }
        L_0x00e2:
            r11 = r2
            goto L_0x00e5
        L_0x00e4:
            r11 = r1
        L_0x00e5:
            zb0 r4 = r10.n     // Catch:{ all -> 0x00ba }
            if (r4 == 0) goto L_0x00ee
            r4 = r0
            r6 = r4
            r5 = r1
        L_0x00ec:
            r7 = r5
            goto L_0x0114
        L_0x00ee:
            int r4 = r10.g0     // Catch:{ all -> 0x00ba }
            r6 = 3
            if (r4 != r6) goto L_0x00fe
            zb0 r4 = r10.o     // Catch:{ all -> 0x00ba }
            r10.o = r0     // Catch:{ all -> 0x00ba }
            r10.y()     // Catch:{ all -> 0x00ba }
            java.lang.RuntimeException r6 = defpackage.lyc.m0     // Catch:{ all -> 0x00ba }
            r7 = r1
            goto L_0x0114
        L_0x00fe:
            kyc r4 = r10.k     // Catch:{ all -> 0x00ba }
            zb0 r4 = r10.q(r4)     // Catch:{ all -> 0x00ba }
            r6 = r0
            r5 = r1
            r7 = r5
            r0 = r4
            r4 = r6
            goto L_0x0114
        L_0x010a:
            kyc r11 = defpackage.kyc.o     // Catch:{ all -> 0x00ba }
            r10.B(r11)     // Catch:{ all -> 0x00ba }
        L_0x010f:
            r4 = r0
            r6 = r4
            r11 = r1
            r5 = r11
            goto L_0x00ec
        L_0x0114:
            monitor-exit(r3)     // Catch:{ all -> 0x00ba }
            if (r7 == 0) goto L_0x0143
            zb0 r0 = r10.q
            r10.G(r0, r2)
            q55 r0 = r10.F
            g65 r0 = (defpackage.g65) r0
            r0.k()
            boolean r0 = r10.d0
            if (r0 == 0) goto L_0x0139
            zb0 r0 = r10.q
            an5 r2 = r0.y
            ac0 r3 = r10.k()
            e8g r4 = new e8g
            r4.<init>(r2, r3)
            r0.j(r4)
            r10.d0 = r1
        L_0x0139:
            if (r11 == 0) goto L_0x014e
            q55 r10 = r10.F
            g65 r10 = (defpackage.g65) r10
            r10.e()
            goto L_0x014e
        L_0x0143:
            if (r0 == 0) goto L_0x0149
            r10.E(r0, r11)
            goto L_0x014e
        L_0x0149:
            if (r4 == 0) goto L_0x014e
            r10.j(r4, r5, r6)
        L_0x014e:
            return
        L_0x014f:
            monitor-exit(r3)     // Catch:{ all -> 0x00ba }
            throw r10
        L_0x0151:
            java.lang.Object r10 = r10.c
            pi8 r10 = (defpackage.pi8) r10
            r10.a(r11)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.p7d.a(java.lang.Object):void");
    }

    public Object apply(Object obj) {
        return gy8.m((gy8) this.b, (jj2) obj, (String) this.c);
    }

    public boolean b(b8 b8Var, MenuItem menuItem) {
        return ((a8) this.b).b(b8Var, menuItem);
    }

    public void c(mq4 mq4) {
        qq4.c((AtomicReference) this.b, mq4);
    }

    public void d(long j, boolean z) {
        ((Function2) this.b).invoke(Long.valueOf(j), Boolean.valueOf(z));
    }

    public void e(qkf qkf, wf5 wf5, qtf qtf) {
    }

    public o8b f() {
        return new npg(12, (Object) ((q17) this.b).f(), (Object) (List) this.c);
    }

    public void g(Throwable th) {
        zb0 zb0;
        switch (this.a) {
            case 18:
                ((u6a) this.c).getClass();
                lk5 lk5 = (lk5) this.b;
                bwb a2 = lk5.a();
                yvb yvb = lk5.b;
                a2.d(yvb, "NetworkFetchProducer", th, (Map) null);
                lk5.a().e(yvb, "NetworkFetchProducer", false);
                ((ik0) yvb).h("network", "default");
                lk5.a.e(th);
                return;
            default:
                Objects.toString(th);
                mo4 mo4 = (mo4) this.c;
                int i = mo4.c;
                if (i < mo4.a) {
                    mo4.c = i + 1;
                    o99 o99 = new o99(27, this);
                    tsd tsd = ((lyc) mo4.g).e;
                    mo4.f = ryg.G().schedule((Runnable) new ovb(10, tsd, o99), lyc.q0, TimeUnit.MILLISECONDS);
                    return;
                }
                lyc lyc = (lyc) mo4.g;
                synchronized (lyc.h) {
                    try {
                        zb0 = null;
                        switch (lyc.k.ordinal()) {
                            case 0:
                                break;
                            case 1:
                            case 2:
                                zb0 zb02 = lyc.o;
                                lyc.o = null;
                                zb0 = zb02;
                                break;
                            case 3:
                            case 4:
                            case 5:
                            case 6:
                            case 7:
                                throw new AssertionError("Encountered encoder setup error while in unexpected state " + lyc.k + ": " + th);
                        }
                        if (lyc.m != -1) {
                            lyc.m = -1;
                            lyc.a.s(new gc0(-1, lyc.m(lyc.k), lyc.s));
                        }
                        lyc.B(kyc.z);
                    } catch (Throwable th2) {
                        while (true) {
                            throw th2;
                            break;
                        }
                    }
                }
                if (zb0 != null) {
                    lyc.j(zb0, 7, th);
                    return;
                }
                return;
        }
    }

    public void h(g1g g1g) {
        mtf mtf;
        if (g1g.v() == 0 && (g1g.v() & Uuid.SIZE_BITS) != 0) {
            g1g.I(6);
            int c2 = g1g.c() / 4;
            int i = 0;
            while (true) {
                mtf = (mtf) this.c;
                if (i >= c2) {
                    break;
                }
                ky1 ky1 = (ky1) this.b;
                g1g.g(0, ky1.b, 4);
                ky1.q(0);
                int i2 = ky1.i(16);
                ky1.t(3);
                if (i2 == 0) {
                    ky1.t(13);
                } else {
                    int i3 = ky1.i(13);
                    if (mtf.f.get(i3) == null) {
                        mtf.f.put(i3, new end(new mqf(mtf, i3)));
                        mtf.l++;
                    }
                }
                i++;
            }
            if (mtf.a != 2) {
                mtf.f.remove(0);
            }
        }
    }

    public void i(b8 b8Var) {
        ((a8) this.b).i(b8Var);
        eo eoVar = (eo) this.c;
        if (eoVar.F0 != null) {
            eoVar.Z.getDecorView().removeCallbacks(eoVar.G0);
        }
        if (eoVar.E0 != null) {
            ecg ecg = eoVar.H0;
            if (ecg != null) {
                ecg.b();
            }
            ecg a2 = gag.a(eoVar.E0);
            a2.a(c44.DEFAULT_ASPECT_RATIO);
            eoVar.H0 = a2;
            a2.d(new tn(2, this));
        }
        eoVar.D0 = null;
        ViewGroup viewGroup = eoVar.J0;
        WeakHashMap weakHashMap = gag.a;
        t9g.c(viewGroup);
        eoVar.H();
    }

    public o8b j(k17 k17, c17 c17) {
        return new npg(12, (Object) ((q17) this.b).j(k17, c17), (Object) (List) this.c);
    }

    public boolean k(b8 b8Var, m69 m69) {
        return ((a8) this.b).k(b8Var, m69);
    }

    public Object l() {
        return (awf) this.b;
    }

    public boolean m(int i) {
        return x(i) != null;
    }

    public boolean n(TamAvatarView tamAvatarView, int i, int i2) {
        vk3 vk3 = (vk3) this.c;
        if (vk3 != null) {
            tamAvatarView.b(vk3, false);
            return true;
        }
        n10 n10 = (n10) this.b;
        if (n10.d.length() > 0) {
            tamAvatarView.g(!cvg.A(n10.h) ? n10.h : n10.g, n10.c, (Long) null, 0, i, i2);
            return true;
        }
        int i3 = lad.k;
        tamAvatarView.z = false;
        yd0 yd0 = new yd0(tamAvatarView.o, tamAvatarView.v, tamAvatarView.w, i3);
        tamAvatarView.c = yd0;
        tamAvatarView.e(yd0);
        tamAvatarView.a.i((gv4) null);
        return false;
    }

    public i65 o(int i) {
        return x(i);
    }

    public void onBufferedAmountChange(long j) {
        u64 u64 = (u64) this.c;
        Iterator it = u64.e.iterator();
        while (it.hasNext()) {
            pe6 pe6 = (pe6) it.next();
            try {
                if (u64 == pe6.b) {
                    pe6.b(pe6.g);
                }
            } catch (Throwable th) {
                u64.b.reportException("DataChannelRtcTransport", "rtc.datachannel.buffer.listen", new Exception(th));
            }
        }
    }

    public void onError(Throwable th) {
        ((pi8) this.c).onError(th);
    }

    public void onMessage(DataChannel.Buffer buffer) {
        ByteBuffer byteBuffer = buffer.data;
        byte[] bArr = new byte[byteBuffer.remaining()];
        int i = buffer.binary ? 2 : 1;
        byteBuffer.get(bArr);
        u64 u64 = (u64) this.c;
        Iterator it = u64.d.iterator();
        while (it.hasNext()) {
            try {
                ((z9d) it.next()).a(u64, bArr, i);
            } catch (Throwable th) {
                u64.b.reportException("DataChannelRtcTransport", "rtc.datachannel.listen.response", new Exception(th));
            }
        }
    }

    public void onStateChange() {
        boolean z = ((DataChannel) this.b).state() == DataChannel.State.OPEN;
        u64 u64 = (u64) this.c;
        Iterator it = u64.c.iterator();
        while (it.hasNext()) {
            try {
                ((y9d) it.next()).a(u64, z);
            } catch (Throwable th) {
                u64.b.reportException("DataChannelRtcTransport", "rtc.datachannel.handle.connection", new Exception(th));
            }
        }
    }

    public boolean p(b8 b8Var, Menu menu) {
        ViewGroup viewGroup = ((eo) this.c).J0;
        WeakHashMap weakHashMap = gag.a;
        t9g.c(viewGroup);
        return ((a8) this.b).p(b8Var, menu);
    }

    public void q(Task task) {
        switch (this.a) {
            case Protos.Attaches.Attach.LOCATION /*14*/:
                Exception e = task.e();
                if (e != null) {
                    z68.f(((xt6) this.c).b, "fail deletePushToken", new Exception("failure to delete token", e));
                }
                Result.Companion companion = Result.Companion;
                ((Continuation) this.b).resumeWith(Result.m23constructorimpl(Unit.INSTANCE));
                return;
            default:
                h7h h7h = (h7h) this.b;
                qdf qdf = (qdf) this.c;
                synchronized (h7h.f) {
                    h7h.e.remove(qdf);
                }
                return;
        }
    }

    public boolean r(CharSequence charSequence, int i, int i2, juf juf) {
        if ((juf.c & 4) > 0) {
            return true;
        }
        if (((awf) this.b) == null) {
            this.b = new awf(charSequence instanceof Spannable ? (Spannable) charSequence : new SpannableString(charSequence));
        }
        ((o9a) this.c).getClass();
        ((awf) this.b).setSpan(new kuf(juf), i, i2, 33);
        return true;
    }

    public void s(long j) {
        ((Function1) this.c).invoke(Long.valueOf(j));
    }

    public void t(z94 z94) {
        synchronized (z94) {
        }
        Handler handler = (Handler) this.b;
        if (handler != null) {
            handler.post(new y60(this, z94, 1));
        }
    }

    public String toString() {
        switch (this.a) {
            case 22:
                JSONObject jSONObject = new JSONObject((Map<?, ?>) (Map) this.b);
                return "ServerSettings(" + jSONObject + ")";
            default:
                return super.toString();
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v2, resolved type: android.graphics.Bitmap} */
    /* JADX WARNING: type inference failed for: r4v0 */
    /* JADX WARNING: type inference failed for: r4v1, types: [java.io.Closeable] */
    /* JADX WARNING: type inference failed for: r4v4 */
    /* JADX WARNING: type inference failed for: r4v5 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x008e A[SYNTHETIC, Splitter:B:26:0x008e] */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x00c4  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.graphics.Bitmap u(android.net.Uri r17, boolean r18) {
        /*
            r16 = this;
            r1 = r17
            java.lang.String r0 = "r"
            r2 = r16
            java.lang.Object r2 = r2.b
            android.content.ContentResolver r2 = (android.content.ContentResolver) r2
            r3 = 1
            r4 = 0
            android.os.ParcelFileDescriptor r5 = r2.openFileDescriptor(r1, r0)     // Catch:{ IOException -> 0x0086, all -> 0x0084 }
            java.io.FileDescriptor r6 = r5.getFileDescriptor()     // Catch:{ IOException -> 0x0041 }
            int r7 = defpackage.o5a.f     // Catch:{ IOException -> 0x0041 }
            ab5 r7 = new ab5     // Catch:{ IOException -> 0x0041 }
            r7.<init>((java.io.FileDescriptor) r6)     // Catch:{ IOException -> 0x0041 }
            java.lang.String r6 = "Orientation"
            int r6 = r7.e(r3, r6)     // Catch:{ IOException -> 0x0041 }
            r5.close()     // Catch:{ IOException -> 0x0041 }
            android.os.ParcelFileDescriptor r5 = r2.openFileDescriptor(r1, r0)     // Catch:{ IOException -> 0x0041 }
            java.io.FileDescriptor r7 = r5.getFileDescriptor()     // Catch:{ IOException -> 0x0041 }
            android.graphics.Point r7 = defpackage.o5a.l(r7, r6)     // Catch:{ IOException -> 0x0041 }
            r5.close()     // Catch:{ IOException -> 0x0041 }
            android.graphics.BitmapFactory$Options r8 = new android.graphics.BitmapFactory$Options     // Catch:{ IOException -> 0x0041 }
            r8.<init>()     // Catch:{ IOException -> 0x0041 }
            if (r18 == 0) goto L_0x0043
            r8.inMutable = r3     // Catch:{ IOException -> 0x0041 }
            goto L_0x0043
        L_0x003d:
            r0 = move-exception
            r4 = r5
            goto L_0x00cd
        L_0x0041:
            r0 = move-exception
            goto L_0x0088
        L_0x0043:
            r9 = 2048(0x800, float:2.87E-42)
            int r7 = defpackage.o5a.q(r7, r9, r9)     // Catch:{ IOException -> 0x0041 }
            r8.inSampleSize = r7     // Catch:{ IOException -> 0x0041 }
            android.os.ParcelFileDescriptor r5 = r2.openFileDescriptor(r1, r0)     // Catch:{ IOException -> 0x0041 }
            java.io.FileDescriptor r0 = r5.getFileDescriptor()     // Catch:{ IOException -> 0x0041 }
            android.graphics.Bitmap r0 = android.graphics.BitmapFactory.decodeFileDescriptor(r0, r4, r8)     // Catch:{ IOException -> 0x0041 }
            r5.close()     // Catch:{ IOException -> 0x0041 }
            int r2 = defpackage.o5a.w(r6)     // Catch:{ IOException -> 0x0041 }
            if (r2 != 0) goto L_0x0064
            defpackage.j4b.j(r5)
            return r0
        L_0x0064:
            android.graphics.Matrix r14 = new android.graphics.Matrix     // Catch:{ IOException -> 0x0041 }
            r14.<init>()     // Catch:{ IOException -> 0x0041 }
            float r2 = (float) r2     // Catch:{ IOException -> 0x0041 }
            r14.setRotate(r2)     // Catch:{ IOException -> 0x0041 }
            int r12 = r0.getWidth()     // Catch:{ IOException -> 0x0041 }
            int r13 = r0.getHeight()     // Catch:{ IOException -> 0x0041 }
            r10 = 0
            r11 = 0
            r15 = 1
            r9 = r0
            android.graphics.Bitmap r2 = android.graphics.Bitmap.createBitmap(r9, r10, r11, r12, r13, r14, r15)     // Catch:{ IOException -> 0x0041 }
            r0.recycle()     // Catch:{ IOException -> 0x0041 }
            defpackage.j4b.j(r5)
            return r2
        L_0x0084:
            r0 = move-exception
            goto L_0x00cd
        L_0x0086:
            r0 = move-exception
            r5 = r4
        L_0x0088:
            boolean r2 = r0 instanceof java.io.FileNotFoundException     // Catch:{ all -> 0x003d }
            java.lang.String r6 = "p7d"
            if (r2 == 0) goto L_0x00c4
            java.lang.String r0 = r17.toString()     // Catch:{ all -> 0x003d }
            java.io.File r1 = new java.io.File     // Catch:{ all -> 0x00ab }
            r1.<init>(r0)     // Catch:{ all -> 0x00ab }
            boolean r1 = r1.exists()     // Catch:{ all -> 0x00ab }
            if (r1 != 0) goto L_0x00ad
            java.lang.String r1 = "file by path %s not exists"
            java.lang.Object[] r0 = new java.lang.Object[]{r0}     // Catch:{ all -> 0x00ab }
            java.lang.Object[] r0 = java.util.Arrays.copyOf(r0, r3)     // Catch:{ all -> 0x00ab }
            defpackage.z68.n(r6, r4, r1, r0)     // Catch:{ all -> 0x00ab }
            goto L_0x00c0
        L_0x00ab:
            r0 = move-exception
            goto L_0x00bb
        L_0x00ad:
            android.graphics.BitmapFactory$Options r1 = new android.graphics.BitmapFactory$Options     // Catch:{ all -> 0x00ab }
            r1.<init>()     // Catch:{ all -> 0x00ab }
            if (r18 == 0) goto L_0x00b6
            r1.inMutable = r3     // Catch:{ all -> 0x00ab }
        L_0x00b6:
            android.graphics.Bitmap r4 = android.graphics.BitmapFactory.decodeFile(r0, r1)     // Catch:{ all -> 0x00ab }
            goto L_0x00c0
        L_0x00bb:
            java.lang.String r1 = "getBitmapFromExternalStorage fail"
            defpackage.z68.o(r6, r1, r0)     // Catch:{ all -> 0x003d }
        L_0x00c0:
            defpackage.j4b.j(r5)
            return r4
        L_0x00c4:
            java.lang.String r1 = "getBitmapFromPath: failed to get bitmap"
            defpackage.z68.f(r6, r1, r0)     // Catch:{ all -> 0x003d }
            defpackage.j4b.j(r5)
            return r4
        L_0x00cd:
            defpackage.j4b.j(r4)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.p7d.u(android.net.Uri, boolean):android.graphics.Bitmap");
    }

    public LinkedHashSet v() {
        LinkedHashSet linkedHashSet;
        synchronized (this.b) {
            linkedHashSet = new LinkedHashSet(((LinkedHashMap) this.c).values());
        }
        return linkedHashSet;
    }

    public tf5 w(Object... objArr) {
        Constructor constructor;
        synchronized (((AtomicBoolean) this.c)) {
            if (!((AtomicBoolean) this.c).get()) {
                try {
                    constructor = ((tb4) this.b).a();
                } catch (ClassNotFoundException unused) {
                    ((AtomicBoolean) this.c).set(true);
                } catch (Exception e) {
                    throw new RuntimeException("Error instantiating extension", e);
                }
            }
            constructor = null;
        }
        if (constructor == null) {
            return null;
        }
        try {
            return (tf5) constructor.newInstance(objArr);
        } catch (Exception e2) {
            throw new IllegalStateException("Unexpected error creating extractor", e2);
        }
    }

    public i65 x(int i) {
        HashMap hashMap = (HashMap) this.c;
        return (hashMap == null || !hashMap.containsKey(Integer.valueOf(i))) ? ((h65) this.b).o(i) : (i65) hashMap.get(Integer.valueOf(i));
    }

    public void y(vf2 vf2) {
        synchronized (this.b) {
            try {
                vf2.getClass();
                for (String str : new LinkedHashSet((ArrayList) vf2.g)) {
                    ((LinkedHashMap) this.c).put(str, vf2.e(str));
                }
            } catch (CameraUnavailableException e) {
                throw new Exception(e);
            }
        }
    }

    public iog z(View view, iog iog) {
        boolean z;
        int i;
        r3 r3Var = (r3) this.c;
        int i2 = r3Var.a;
        qr0 qr0 = (qr0) this.b;
        qr0.getClass();
        fog fog = iog.a;
        wh7 f = fog.f(7);
        wh7 f2 = fog.f(32);
        int i3 = f.b;
        BottomSheetBehavior bottomSheetBehavior = (BottomSheetBehavior) qr0.b;
        bottomSheetBehavior.w = i3;
        boolean x = ct.x(view);
        int paddingBottom = view.getPaddingBottom();
        int paddingLeft = view.getPaddingLeft();
        int paddingRight = view.getPaddingRight();
        boolean z2 = bottomSheetBehavior.o;
        if (z2) {
            int a2 = iog.a();
            bottomSheetBehavior.v = a2;
            paddingBottom = a2 + r3Var.c;
        }
        int i4 = r3Var.b;
        boolean z3 = bottomSheetBehavior.p;
        int i5 = f.a;
        if (z3) {
            paddingLeft = (x ? i4 : i2) + i5;
        }
        boolean z4 = bottomSheetBehavior.q;
        int i6 = f.c;
        if (z4) {
            if (!x) {
                i2 = i4;
            }
            paddingRight = i2 + i6;
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        boolean z5 = true;
        if (!bottomSheetBehavior.s || marginLayoutParams.leftMargin == i5) {
            z = false;
        } else {
            marginLayoutParams.leftMargin = i5;
            z = true;
        }
        if (bottomSheetBehavior.t && marginLayoutParams.rightMargin != i6) {
            marginLayoutParams.rightMargin = i6;
            z = true;
        }
        if (!bottomSheetBehavior.u || marginLayoutParams.topMargin == (i = f.b)) {
            z5 = z;
        } else {
            marginLayoutParams.topMargin = i;
        }
        if (z5) {
            view.setLayoutParams(marginLayoutParams);
        }
        view.setPadding(paddingLeft, view.getPaddingTop(), paddingRight, paddingBottom);
        boolean z6 = qr0.a;
        if (z6) {
            bottomSheetBehavior.m = f2.d;
        }
        if (z2 || z6) {
            bottomSheetBehavior.R();
        }
        return iog;
    }

    public /* synthetic */ p7d(int i, Object obj, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    public /* synthetic */ p7d(Object obj, Object obj2, boolean z, int i) {
        this.a = i;
        this.c = obj;
        this.b = obj2;
    }

    public p7d(yoc yoc, CallAnalyticsSender callAnalyticsSender) {
        this.a = 4;
        this.b = yoc;
        this.c = callAnalyticsSender;
        callAnalyticsSender.setIdle(false);
    }

    public p7d(Map map) {
        this.a = 22;
        this.b = map;
        boolean z = map.get("chats-list-promo-link-enabled") instanceof Boolean;
        this.c = LazyKt.lazy(new ifb(29, this));
    }

    public p7d(j6d j6d) {
        this.a = 0;
        this.b = j6d;
        this.c = LazyKt.lazy(new ifb(20, this));
    }

    public p7d(n10 n10) {
        this.a = 8;
        this.b = n10;
        this.c = ((bl3) ((qra) ym.e()).getAccessor().g(bl3.class)).b(n10);
    }

    public p7d() {
        this.a = 6;
        this.b = new Object();
        this.c = new LinkedHashMap();
        new HashSet();
    }

    /* JADX WARNING: type inference failed for: r3v0 */
    /* JADX WARNING: type inference failed for: r3v1, types: [java.util.Map] */
    /* JADX WARNING: type inference failed for: r3v3, types: [a5g] */
    /* JADX WARNING: type inference failed for: r3v7 */
    /* JADX WARNING: type inference failed for: r3v8 */
    /* JADX WARNING: type inference failed for: r3v9 */
    /* JADX WARNING: type inference failed for: r3v10 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public p7d(defpackage.qu1 r6, defpackage.h65 r7, defpackage.ykb r8) {
        /*
            r5 = this;
            r0 = 20
            r5.a = r0
            r5.<init>()
            r5.b = r7
            java.lang.Class<androidx.camera.video.internal.compat.quirk.ExtraSupportedQualityQuirk> r0 = androidx.camera.video.internal.compat.quirk.ExtraSupportedQualityQuirk.class
            java.util.ArrayList r8 = r8.h(r0)
            boolean r0 = r8.isEmpty()
            if (r0 != 0) goto L_0x00e2
            int r0 = r8.size()
            r1 = 0
            r2 = 1
            if (r0 != r2) goto L_0x001f
            r0 = r2
            goto L_0x0020
        L_0x001f:
            r0 = r1
        L_0x0020:
            r3 = 0
            defpackage.bs0.r(r3, r0)
            java.lang.Object r8 = r8.get(r1)
            androidx.camera.video.internal.compat.quirk.ExtraSupportedQualityQuirk r8 = (androidx.camera.video.internal.compat.quirk.ExtraSupportedQualityQuirk) r8
            r8.getClass()
            java.lang.String r8 = "motorola"
            java.lang.String r0 = android.os.Build.BRAND
            boolean r8 = r8.equalsIgnoreCase(r0)
            if (r8 == 0) goto L_0x00d5
            java.lang.String r8 = "moto c"
            java.lang.String r0 = android.os.Build.MODEL
            boolean r8 = r8.equalsIgnoreCase(r0)
            if (r8 == 0) goto L_0x00d5
            java.lang.String r8 = "1"
            java.lang.String r6 = r6.e()
            boolean r6 = r8.equals(r6)
            if (r6 == 0) goto L_0x00d9
            r6 = 4
            boolean r8 = r7.m(r6)
            if (r8 == 0) goto L_0x0056
            goto L_0x00d9
        L_0x0056:
            i65 r7 = r7.o(r2)
            if (r7 == 0) goto L_0x0071
            java.util.List r8 = r7.d()
            boolean r8 = r8.isEmpty()
            if (r8 != 0) goto L_0x0071
            java.util.List r8 = r7.d()
            java.lang.Object r8 = r8.get(r1)
            sa0 r8 = (defpackage.sa0) r8
            goto L_0x0072
        L_0x0071:
            r8 = r3
        L_0x0072:
            if (r8 != 0) goto L_0x0075
            goto L_0x00d9
        L_0x0075:
            uc0 r0 = defpackage.e4g.d(r8)
            b5g r0 = defpackage.b5g.n1(r0)     // Catch:{ InvalidConfigException -> 0x0081 }
            a5g r3 = defpackage.c5g.a(r0, r3)     // Catch:{ InvalidConfigException -> 0x0081 }
        L_0x0081:
            if (r3 == 0) goto L_0x0088
            android.util.Range r0 = r3.E0()
            goto L_0x008a
        L_0x0088:
            android.util.Range r0 = defpackage.yc0.f
        L_0x008a:
            android.util.Size r1 = defpackage.pde.d
            sa0 r0 = defpackage.n79.y(r8, r1, r0)
            int r3 = r7.a()
            int r4 = r7.b()
            java.util.List r7 = r7.c()
            java.util.List r0 = java.util.Collections.singletonList(r0)
            ra0 r7 = defpackage.ra0.e(r3, r4, r7, r0)
            java.util.HashMap r3 = new java.util.HashMap
            r3.<init>()
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            r3.put(r6, r7)
            android.util.Size r6 = new android.util.Size
            int r0 = r8.e
            int r8 = r8.f
            r6.<init>(r0, r8)
            int r8 = r1.getWidth()
            int r0 = r1.getHeight()
            int r0 = r0 * r8
            int r8 = r6.getWidth()
            int r6 = r6.getHeight()
            int r6 = r6 * r8
            if (r0 <= r6) goto L_0x00d9
            java.lang.Integer r6 = java.lang.Integer.valueOf(r2)
            r3.put(r6, r7)
            goto L_0x00d9
        L_0x00d5:
            java.util.Map r3 = java.util.Collections.emptyMap()
        L_0x00d9:
            if (r3 == 0) goto L_0x00e2
            java.util.HashMap r6 = new java.util.HashMap
            r6.<init>(r3)
            r5.c = r6
        L_0x00e2:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.p7d.<init>(qu1, h65, ykb):void");
    }

    public p7d(mtf mtf) {
        this.a = 24;
        this.c = mtf;
        this.b = new ky1(new byte[4], (byte) 0, 4, 1);
    }

    public p7d(tb4 tb4) {
        this.a = 10;
        this.b = tb4;
        this.c = new AtomicBoolean(false);
    }
}
