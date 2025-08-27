package defpackage;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.hardware.Camera;
import android.net.ConnectivityManager;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.telephony.TelephonyManager;
import java.util.ArrayList;
import java.util.EnumSet;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.NoWhenBranchMatchedException;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.MapsKt;
import kotlin.collections.SetsKt;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.webrtc.AndroidVideoDecoder;
import org.webrtc.EglBase;
import org.webrtc.MediaStreamTrack;
import org.webrtc.NativeDoubleArrayConsumer;
import org.webrtc.NetworkChangeDetector;
import org.webrtc.NetworkMonitor;
import org.webrtc.PeerConnection;
import org.webrtc.VideoSink;
import ru.ok.android.externcalls.analytics.CallAnalyticsSender;
import ru.ok.android.externcalls.analytics.events.EventItemValue;
import ru.ok.android.externcalls.analytics.events.EventItemValueKt;
import ru.ok.android.externcalls.analytics.events.EventItemsMap;
import ru.ok.android.externcalls.analytics.events.SdkIntervalStatEvent;
import ru.ok.android.externcalls.sdk.AudioLevelListener;
import ru.ok.android.externcalls.sdk.b;
import ru.ok.android.externcalls.sdk.events.end.ConversationEndReason;

/* renamed from: hz0  reason: default package */
public final class hz0 implements fm1, x48, NetworkMonitor.NetworkObserver {
    public static final ExecutorService m2 = Executors.newSingleThreadExecutor();
    public static final ExecutorService n2 = Executors.newSingleThreadExecutor();
    public final boolean A0;
    public final boolean A1;
    public final kz3 B0;
    public final wie B1;
    public final boolean C0;
    public final hr6 C1;
    public String D0;
    public final rjf D1;
    public long E0;
    public final lgd E1;
    public long F0;
    public int F1 = 0;
    public boolean G0 = false;
    public ue1 G1;
    public final haf H0 = new haf(12, (Object) this);
    public List H1;
    public boolean I0 = false;
    public volatile boolean I1;
    public List J0;
    public final mc1 J1;
    public final ArrayList K0 = new ArrayList();
    public final ox0 K1;
    public boolean L0;
    public final o60 L1;
    public final int M0;
    public final jz2 M1;
    public boolean N0;
    public final d19 N1;
    public nw6 O0;
    public final bk3 O1;
    public boolean P0;
    public final j09 P1;
    public final pv0 Q0;
    public final bl1 Q1;
    public final pv0 R0;
    public final bae R1;
    public final yoc S0;
    public final n09 S1;
    public final voc T0;
    public final ykb T1;
    public final fg0 U0;
    public final jc1 U1;
    public final boolean V0;
    public final ata V1;
    public boolean W0 = true;
    public final yj1 W1;
    public final te1 X;
    public boolean X0 = true;
    public final lg1 X1;
    public String Y;
    public boolean Y0;
    public final d01 Y1;
    public boolean Z;
    public b Z0;
    public final eud Z1;
    public boolean a;
    public boolean a1;
    public final sp5 a2;
    public baa b;
    public rk3 b1;
    public final boolean b2;
    public final oy0 c = new oy0(this, 2);
    public final g43 c1;
    public final jl4 c2;
    public long d1;
    public gme d2;
    public final hug e1 = new hug(this);
    public final wsb e2;
    public final zh3 f1 = new zh3(1, this);
    public final ce f2;
    public final d6a g1 = new d6a(16, (Object) this);
    public volatile boolean g2;
    public final pt6 h1;
    public final w28 h2;
    public final t6e i1;
    public final zqd i2;
    public final d j1;
    public kbb j2;
    public final j50 k1;
    public kbb k2;
    public final l48 l1;
    public final v02 l2;
    public final gtb m1;
    public final ef1 n1;
    public final oy0 o = new oy0(this, 0);
    public final CopyOnWriteArraySet o1 = new CopyOnWriteArraySet();
    public final CopyOnWriteArraySet p1 = new CopyOnWriteArraySet();
    public boolean q1;
    public gm1 r1;
    public gm1 s1;
    public fl4 t1;
    public volatile dz0 u1;
    public final ptg v = new ptg(this);
    public final EglBase v0;
    public boolean v1;
    public final py0 w = new py0(this);
    public final nd1 w0;
    public final mz9 w1;
    public o9e x;
    public final EnumSet x0 = EnumSet.noneOf(gz0.class);
    public final zq0 x1;
    public final Handler y = new Handler(Looper.getMainLooper());
    public boolean y0;
    public boolean y1;
    public final Context z;
    public boolean z0;
    public final boolean z1;

    /* JADX WARNING: type inference failed for: r2v8, types: [v02, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r12v2, types: [zq0, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r2v26, types: [pt6, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r3v35, types: [ce, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r10v1, types: [java.lang.Object, p6e] */
    /* JADX WARNING: type inference failed for: r5v21, types: [java.lang.Object, d19] */
    /* JADX WARNING: type inference failed for: r1v29, types: [java.lang.Object, bk3] */
    /* JADX WARNING: type inference failed for: r1v30, types: [java.lang.Object, hr6] */
    /* JADX WARNING: type inference failed for: r3v53, types: [n09, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r1v41, types: [wsb, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r1v43, types: [ce, java.lang.Object] */
    public hz0(Context context, te1 te1, boolean z2, boolean z3, ye1 ye1, lz3 lz3, boolean z4, boolean z5, yoc yoc, voc voc, woc woc, wga wga, boolean z6, i8d i8d, ui uiVar, sjf sjf, CallAnalyticsSender callAnalyticsSender, gtb gtb, lgd lgd) {
        Context context2 = context;
        te1 te12 = te1;
        boolean z7 = z2;
        ye1 ye12 = ye1;
        yoc yoc2 = yoc;
        voc voc2 = voc;
        sjf sjf2 = sjf;
        jc1 jc1 = new jc1();
        this.U1 = jc1;
        ata ata = new ata(jc1);
        this.V1 = ata;
        this.l2 = new Object();
        this.D1 = sjf2;
        ef1 ef1 = new ef1(ye12, jc1, ata, voc2);
        this.n1 = ef1;
        this.X = te12;
        this.c1 = new g43(0);
        this.z0 = z7;
        this.A0 = z3;
        mz9 mz9 = ye12.c;
        this.w1 = mz9;
        this.x1 = new Object();
        this.B0 = lz3;
        this.C0 = z5;
        this.S0 = yoc2;
        this.T0 = voc2;
        o9g o9g = new o9g(voc2);
        this.m1 = gtb;
        this.z1 = z6;
        this.b2 = te12.i;
        ef1 ef12 = ef1;
        this.B1 = new wie(25);
        this.L1 = new o60(voc2);
        te12.A.getClass();
        te12.A.a.getClass();
        this.U0 = new fg0();
        this.M1 = new jz2(1, (Object) voc2);
        ata ata2 = ata;
        o9g o9g2 = o9g;
        mz9 mz92 = mz9;
        this.P1 = new j09(voc, o9g2, new yy0(this, 0), new yy0(this, 1), new py0(this), sjf);
        Context applicationContext = context.getApplicationContext();
        this.z = applicationContext;
        NetworkMonitor.init(applicationContext);
        bl1 bl1 = new bl1(applicationContext, new p7d(yoc2, callAnalyticsSender), sjf, (ConnectivityManager) context2.getSystemService("connectivity"), (TelephonyManager) context2.getSystemService("phone"), voc, new ny0(this, 1), lz3);
        this.Q1 = bl1;
        bl1.m.c.getClass();
        voc2.log("OKRTCCall", "Call<init> caller = " + z7 + " " + Build.MANUFACTURER + " " + Build.MODEL + " " + Build.DEVICE);
        ef1 ef13 = ef12;
        ata ata3 = ata2;
        jc1 jc12 = jc1;
        bl1 bl12 = bl1;
        sjf sjf3 = sjf2;
        ui uiVar2 = uiVar;
        voc voc3 = voc2;
        this.r1 = new tx4(ef13, te1, voc, yoc, jc12);
        ? obj = new Object();
        obj.d = new Hashtable();
        obj.e = new k09();
        obj.f = te12;
        obj.g = yoc2;
        obj.h = voc3;
        obj.i = ye12;
        this.h1 = obj;
        v("rtc.init.sw.codec.false");
        v("rtc.abi." + Build.CPU_ABI);
        w28 w28 = new w28(voc3, yoc2);
        this.h2 = w28;
        xa3 l = new qa3(2, new h5(4, w28)).l(xfd.a());
        mw1 mw1 = new mw1(1);
        l.j(mw1);
        ((kc3) w28.o).a(mw1);
        EglBase create = EglBase.create();
        this.v0 = create;
        voc3.log("OKRTCCall", ur9.c(create) + " was created");
        this.w0 = new nd1(voc3, create.getEglBaseContext(), EglBase.CONFIG_PLAIN, (String) null);
        int numberOfCameras = Camera.getNumberOfCameras();
        this.M0 = numberOfCameras;
        jme jme = jme.callDevices;
        u(jme, numberOfCameras + "_1");
        this.Q0 = new pv0("pc_created", voc3);
        this.R0 = new pv0("accepted", voc3);
        jl4 jl4 = new jl4(voc3);
        this.c2 = jl4;
        t6e t6e = new t6e(create, voc3, te12, jl4);
        this.i1 = t6e;
        l48 l48 = new l48(context2, voc3);
        this.l1 = l48;
        ? obj2 = new Object();
        obj2.a = false;
        obj2.w = context2;
        obj2.o = te12.j;
        obj2.b = wga;
        obj2.v = l48;
        obj2.a = te12.B.a;
        obj2.c = voc3;
        if (((wga) obj2.b) == null || ((l48) obj2.v) == null) {
            throw new IllegalStateException();
        }
        j50 j50 = new j50((ce) obj2);
        this.k1 = j50;
        p1e p1e = new p1e((Object) this);
        ? obj3 = new Object();
        obj3.a = t6e;
        obj3.b = j50;
        obj3.j = te12.B.e;
        mz9 mz93 = mz92;
        obj3.c = mz93;
        obj3.i = null;
        obj3.d = context2;
        obj3.e = voc3;
        obj3.k = te12.c;
        obj3.l = create.getEglBaseContext();
        obj3.f = te12;
        obj3.g = new py0(this);
        obj3.m = l48;
        obj3.o = i8d;
        obj3.n = sjf3;
        o9g o9g3 = o9g2;
        obj3.p = new d9d(15, o9g3);
        obj3.h = p1e;
        if (obj3.a == null || obj3.b == null || obj3.m == null || obj3.d == null || obj3.c == null || obj3.e == null || obj3.f == null || obj3.g == null || obj3.o == null || obj3.h == null) {
            throw new IllegalStateException();
        }
        d dVar = new d(obj3);
        this.j1 = dVar;
        dVar.w0.add(this);
        ykb ykb = new ykb(13, this);
        dVar.F0 = ykb;
        if (dVar.x0 != null) {
            dVar.x0.x = ykb;
        }
        this.A1 = z4;
        mz93.a.add(new qy0(this));
        mz93.a.add(new t44(new d9d(13, ef13)));
        AndroidVideoDecoder.errorCallback = new ry0(this);
        NetworkMonitor.getInstance().addObserver(this);
        this.V0 = te12.k;
        this.K1 = new ox0(22, (Object) voc3, (Object) woc);
        j50 j502 = new j50(new bpa(15, this), new nob((Object) this), voc3, te12);
        ? obj4 = new Object();
        obj4.b = j502;
        dac dac = new dac();
        obj4.c = dac;
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        lfd a3 = xfd.a();
        Objects.requireNonNull(timeUnit, "unit is null");
        Objects.requireNonNull(a3, "scheduler is null");
        obj4.a = new ika(dac, 50, timeUnit, a3, false).s(qe.a()).v(new nqd(27, j502));
        this.N1 = obj4;
        this.O1 = new Object();
        ? obj5 = new Object();
        obj5.a = voc3;
        ui uiVar3 = uiVar;
        voc voc4 = voc3;
        obj5.b = uiVar3;
        ic3 ic3 = new ic3(2);
        obj5.c = ic3;
        fj fjVar = new fj((hr6) obj5, t6e, uiVar3, ic3);
        obj5.o = fjVar;
        CopyOnWriteArraySet copyOnWriteArraySet = new CopyOnWriteArraySet();
        obj5.v = new nj(obj5, new gga(16), uiVar, create, ic3);
        uiVar.getClass();
        d9d d9d = new d9d(2, obj5);
        if (!Intrinsics.areEqual((Object) (NativeDoubleArrayConsumer.Consumer) fjVar.c, (Object) d9d)) {
            fjVar.c = d9d;
            ((AtomicInteger) ic3.x).set(0);
        }
        copyOnWriteArraySet.add(new Object());
        this.C1 = obj5;
        mc1 mc1 = new mc1(ef13, voc, new r6(3, this), new nfd(18), new cz0(ef13, 0), l48);
        this.J1 = mc1;
        bae bae = new bae(voc4, ef13.a, mc1);
        this.R1 = bae;
        ef1 ef14 = ef13;
        yj1 yj1 = new yj1(voc, ef13, ata2, mc1, jc12, new xe8(14, bae.g, new ny0(this, 2)), new ox0(13, (Object) bae.o, (Object) new ny0(this, 3)), this.D1);
        this.W1 = yj1;
        r6 r6Var = new r6(3, this);
        jc1 jc13 = this.U1;
        te1 te13 = this.X;
        ? obj6 = new Object();
        obj6.b = new aqg(ef14, bae.a, r6Var);
        obj6.c = new eud(3, r6Var, voc, bae.b, bae.d);
        boolean z8 = te13.t;
        obj6.a = new pv0((Object) bae.m, (Object) bae.n, (Object) bae.o, (Object) yj1, z8, 7);
        obj6.o = new m7f(voc4, bae.c, bae.h, jc13.j);
        obj6.v = new m8g(bae.p, jc13.d);
        obj6.w = jc13.p;
        obj6.x = new o5h(ef14, bae.q, jc13.k);
        obj6.y = new npg(26, (Object) jc13.q, (Object) bae.k);
        obj6.z = new xe8(7, jc13.r, bae.l);
        this.S1 = obj6;
        jc1 jc14 = jc12;
        this.T1 = new ykb(jc14);
        this.X1 = new lg1(bae.i, jc14);
        this.Y1 = new d01(bae.j, jc14);
        bl1 bl13 = bl12;
        this.Z1 = new eud((c51) bl13.j, sjf3);
        d51 d51 = bl13.j;
        voc voc5 = voc4;
        this.a2 = new sp5(d51, o9g3, sjf, z2, new ny0(this, 4), new cz0(ef14, 1), voc);
        ? obj7 = new Object();
        obj7.a = this;
        this.e2 = obj7;
        this.E1 = lgd;
        ny0 ny0 = new ny0(this, 0);
        ? obj8 = new Object();
        obj8.b = voc5;
        obj8.c = ny0;
        dac dac2 = new dac();
        obj8.o = dac2;
        obj8.v = dac2.i(1000, TimeUnit.MILLISECONDS).s(qe.a()).v(new yu9(15, (Object) obj8));
        this.f2 = obj8;
        obj8.w = new d9d(13, ef14);
        AudioLevelListener audioLevelListener = new AudioLevelListener(500, new Handler(Looper.getMainLooper()), new qof(11, new d9d(14, obj8)));
        t6e t6e2 = this.i1;
        t6e2.getClass();
        t6e2.a.execute(new ca2((Object) t6e2, (Object) audioLevelListener, 200, 6));
        this.i2 = new zqd(4, (Object) voc5);
    }

    /* JADX WARNING: Removed duplicated region for block: B:3:0x000c  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean t(defpackage.ye1 r2) {
        /*
            java.util.List r2 = r2.e
            java.util.Iterator r2 = r2.iterator()
        L_0x0006:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x001c
            java.lang.Object r0 = r2.next()
            xe1 r0 = (defpackage.xe1) r0
            xe1 r1 = defpackage.xe1.b
            if (r0 == r1) goto L_0x001a
            xe1 r1 = defpackage.xe1.a
            if (r0 != r1) goto L_0x0006
        L_0x001a:
            r2 = 1
            return r2
        L_0x001c:
            r2 = 0
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.hz0.t(ye1):boolean");
    }

    public final void A(gm1 gm1, PeerConnection.IceConnectionState iceConnectionState) {
        int i;
        this.T0.log("OKRTCCall", "handleTopologyIceConnectionChange, " + gm1 + ", state=" + iceConnectionState);
        u(jme.callIceConnectionState, iceConnectionState.toString());
        if (gm1 == this.r1) {
            boolean z2 = iceConnectionState == PeerConnection.IceConnectionState.CONNECTED;
            this.Q1.k = z2;
            if (z2) {
                bl1 bl1 = this.Q1;
                xk1 xk1 = bl1.h;
                xk1.i.reset();
                xk1.j.h();
                xe8 xe8 = (xe8) xk1.l.a;
                xe8.b = null;
                xe8.c = null;
                xk1.k.h();
                g6d g6d = xk1.m;
                ((vs6) g6d.b).b = null;
                ((vs6) g6d.c).b = null;
                ((nob) bl1.g.o).a = null;
                this.I0 = true;
                if (this.W0) {
                    tgg tgg = this.Q1.f;
                    tgg.getClass();
                    long x2 = gm1.x();
                    if (x2 != -1) {
                        gm1.C(new wk1(tgg, SystemClock.elapsedRealtime() - x2));
                    }
                }
                this.W0 = false;
                this.F0 = SystemClock.elapsedRealtime();
                k(b51.a, (Object) null);
                this.y.removeCallbacks(this.H0);
                if (this.V0) {
                    fg0 fg0 = this.U0;
                    fg0.c.b = 0.0d;
                    fg0.b.b = 0.0d;
                    fg0.m = false;
                    fg0.p = Double.NaN;
                    fg0.o = Double.NaN;
                    fg0.a();
                }
                this.F1 = 0;
                gm1 gm12 = this.s1;
                if (gm12 != null) {
                    gm12.L();
                    this.s1 = null;
                }
            } else if (iceConnectionState == PeerConnection.IceConnectionState.DISCONNECTED) {
                if (this.I0) {
                    this.E0 = (SystemClock.elapsedRealtime() - this.F0) + this.E0;
                }
                this.I0 = false;
                k(b51.b, (Object) null);
            } else if (iceConnectionState == PeerConnection.IceConnectionState.FAILED) {
                gm1 gm13 = this.r1;
                xnf xnf = xnf.o;
                if (gm13.H(xnf) && NetworkMonitor.isOnline() && (i = this.F1) < 3) {
                    this.F1 = i + 1;
                    e(xnf, true);
                    c(this.r1);
                }
                this.y.removeCallbacks(this.H0);
                boolean H = gm1.H(xnf.c);
                if ((this.D0 == null && this.d1 == 0 && this.A1) || !H) {
                    Handler handler = this.y;
                    haf haf = this.H0;
                    this.X.b.getClass();
                    handler.postDelayed(haf, (long) 30000);
                }
            }
        } else if (gm1 != this.s1) {
            this.T0.reportException("OKRTCCall", "topology.ice.conn.change", new Exception("unexpected.topology"));
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:29:0x0096  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x0099  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x00b5  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x00be  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x00c3  */
    /* JADX WARNING: Removed duplicated region for block: B:45:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void B(boolean r7) {
        /*
            r6 = this;
            voc r0 = r6.T0
            java.lang.String r1 = "OKRTCCall"
            java.lang.String r2 = "onUserAnswered"
            r0.log(r1, r2)
            boolean r0 = r6.I1
            r1 = 1
            if (r0 == 0) goto L_0x004c
            wsb r0 = r6.e2
            gz0 r2 = defpackage.gz0.v
            java.lang.Object r0 = r0.a
            hz0 r0 = (defpackage.hz0) r0
            java.util.EnumSet r0 = r0.x0
            boolean r0 = r0.contains(r2)
            if (r0 != 0) goto L_0x001f
            return
        L_0x001f:
            wsb r0 = r6.e2
            java.lang.Object r2 = r0.a
            hz0 r2 = (defpackage.hz0) r2
            ef1 r3 = r2.n1
            java.util.Collection r3 = r3.i()
            boolean r3 = r3.isEmpty()
            r3 = r3 ^ r1
            if (r3 == 0) goto L_0x0033
            goto L_0x004c
        L_0x0033:
            java.lang.Object r6 = r0.b
            g9b r6 = (defpackage.g9b) r6
            if (r6 != 0) goto L_0x004b
            g9b r6 = new g9b
            r6.<init>(r0)
            jc1 r7 = r2.U1
            g9b r7 = r7.c
            java.lang.Object r7 = r7.b
            java.util.concurrent.CopyOnWriteArraySet r7 = (java.util.concurrent.CopyOnWriteArraySet) r7
            r7.add(r6)
            r0.b = r6
        L_0x004b:
            return
        L_0x004c:
            wsb r0 = r6.e2
            java.lang.Object r2 = r0.b
            g9b r2 = (defpackage.g9b) r2
            r3 = 0
            if (r2 == 0) goto L_0x0066
            java.lang.Object r4 = r0.a
            hz0 r4 = (defpackage.hz0) r4
            jc1 r4 = r4.U1
            g9b r4 = r4.c
            java.lang.Object r4 = r4.b
            java.util.concurrent.CopyOnWriteArraySet r4 = (java.util.concurrent.CopyOnWriteArraySet) r4
            r4.remove(r2)
            r0.b = r3
        L_0x0066:
            boolean r0 = r6.y1
            r0 = r0 ^ r1
            r6.y1 = r1
            boolean r2 = r6.i()
            if (r2 != 0) goto L_0x0072
            return
        L_0x0072:
            boolean r2 = r6.g2
            r4 = 0
            if (r2 == 0) goto L_0x008f
            if (r7 == 0) goto L_0x0090
            l48 r2 = r6.l1
            boolean r2 = r2.d
            if (r2 != 0) goto L_0x0090
            l48 r7 = r6.l1
            boolean r7 = r7.a()
            if (r7 == 0) goto L_0x008f
            l48 r7 = r6.l1
            boolean r7 = r7.d
            if (r7 == 0) goto L_0x008f
            r7 = r1
            goto L_0x0090
        L_0x008f:
            r7 = r4
        L_0x0090:
            r6.q1 = r1
            jme r2 = defpackage.jme.callAcceptIncoming
            if (r7 == 0) goto L_0x0099
            java.lang.String r5 = "video"
            goto L_0x009b
        L_0x0099:
            java.lang.String r5 = "audio"
        L_0x009b:
            r6.u(r2, r5)
            r6.m(r7)
            ef1 r7 = r6.n1
            ye1 r7 = r7.a
            if (r0 == 0) goto L_0x00ae
            boolean r0 = r7.b()
            if (r0 == 0) goto L_0x00ae
            goto L_0x00af
        L_0x00ae:
            r1 = r4
        L_0x00af:
            boolean r0 = r7.b()
            if (r0 != 0) goto L_0x00be
            kotlin.Pair r0 = defpackage.ye1.r
            r7.e(r0)
            r6.w()
            goto L_0x00c1
        L_0x00be:
            r6.x()
        L_0x00c1:
            if (r1 == 0) goto L_0x00cd
            gm1 r7 = r6.r1
            r6.c(r7)
            b51 r7 = defpackage.b51.X
            r6.k(r7, r3)
        L_0x00cd:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.hz0.B(boolean):void");
    }

    public final void C() {
        if (this.G0) {
            this.T0.log("OKRTCCall", "Can't start interaction twice. Ignore");
            return;
        }
        this.G0 = true;
        x();
        for (ye1 u : this.n1.i()) {
            this.r1.u(u, true);
        }
        boolean z2 = this.C0;
        m(z2);
        u(jme.callStart, z2 ? MediaStreamTrack.VIDEO_TRACK_KIND : MediaStreamTrack.AUDIO_TRACK_KIND);
    }

    /* JADX WARNING: Removed duplicated region for block: B:19:0x003e  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0063  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void D(boolean r7) {
        /*
            r6 = this;
            boolean r0 = r6.i()
            if (r0 != 0) goto L_0x0007
            return
        L_0x0007:
            gm1 r0 = r6.r1
            xnf r1 = defpackage.xnf.o
            boolean r0 = r0.H(r1)
            if (r0 == 0) goto L_0x0088
            r0 = 0
            if (r7 == 0) goto L_0x0039
            d r7 = r6.j1
            mz9 r1 = r6.w1
            boolean r1 = r1.c
            v48 r7 = r7.x0
            if (r7 == 0) goto L_0x0039
            if (r1 == 0) goto L_0x002b
            ngd r7 = r7.t
            if (r7 == 0) goto L_0x0039
            org.webrtc.ScreenCapturerAndroid r7 = r7.a
            android.media.projection.MediaProjection r7 = r7.getMediaProjection()
            goto L_0x003a
        L_0x002b:
            lhd r7 = r7.u
            if (r7 != 0) goto L_0x0030
            goto L_0x0039
        L_0x0030:
            xd6 r7 = r7.o
            org.webrtc.ScreenCapturerAndroid r7 = r7.w
            android.media.projection.MediaProjection r7 = r7.getMediaProjection()
            goto L_0x003a
        L_0x0039:
            r7 = r0
        L_0x003a:
            b51 r1 = defpackage.b51.v
            if (r7 == 0) goto L_0x0063
            t6e r2 = r6.i1
            d r3 = r6.j1
            r2.getClass()
            o6d r4 = new o6d
            r5 = 4
            r4.<init>((java.lang.Object) r2, (java.lang.Object) r3, (java.lang.Object) r7, (int) r5)
            java.util.concurrent.ExecutorService r7 = r2.a
            r7.execute(r4)
            mz9 r7 = r6.w1
            boolean r2 = r7.b
            if (r2 == 0) goto L_0x0088
            r2 = 1
            r7.d = r2
            r7.a()
            r6.x()
            r6.k(r1, r0)
            goto L_0x0088
        L_0x0063:
            t6e r7 = r6.i1
            d r2 = r6.j1
            r7.getClass()
            ovb r3 = new ovb
            r4 = 29
            r3.<init>(r4, r7, r2)
            java.util.concurrent.ExecutorService r7 = r7.a
            r7.execute(r3)
            mz9 r7 = r6.w1
            boolean r2 = r7.b
            if (r2 == 0) goto L_0x0088
            r2 = 0
            r7.d = r2
            r7.a()
            r6.x()
            r6.k(r1, r0)
        L_0x0088:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.hz0.D(boolean):void");
    }

    public final void E(boolean z2) {
        if (i()) {
            if (!z2) {
                if (!this.l1.c && this.l1.a() && this.l1.c) {
                    t6e t6e = this.i1;
                    t6e.getClass();
                    t6e.a.execute(new r6e(t6e, 0));
                } else if (fbb.A().g) {
                    t6e t6e2 = this.i1;
                    t6e2.getClass();
                    t6e2.a.execute(new r6e(t6e2, 0));
                }
            }
            mc1 mc1 = this.J1;
            if (z2) {
                mc1.getClass();
            } else if (!mc1.f.c || !mc1.d(new mo1(1, mc1.i))) {
                return;
            }
            t6e t6e3 = this.i1;
            t6e3.getClass();
            t6e3.a.execute(new q6e(t6e3, z2, 0));
            mz9 mz9 = this.w1;
            boolean z3 = !z2;
            if (mz9.e != z3) {
                mz9.e = z3;
                mz9.a();
            }
            x();
        }
    }

    public final void F(baa baa) {
        t6e t6e = this.i1;
        if (t6e != null) {
            boolean z2 = baa.c;
            boolean z3 = this.Y0;
            boolean z4 = baa.d;
            boolean z5 = baa.b;
            if (z3) {
                z2 |= z4;
                z5 |= z4;
                z4 = false;
            }
            boolean z6 = z5;
            boolean z7 = z2;
            this.b = baa;
            this.T0.log("OKRTCCall", "new debug params " + baa);
            boolean z8 = this.Y0;
            String str = baa.f;
            m2.execute(new xy0(this, baa, t6e, z7, !z8 && z4 && str != null, str));
            zq0 zq0 = this.x1;
            zq0.a = baa.a;
            zq0.b = z6;
            this.x.i(new s9e(zq0));
        }
    }

    public final void G(boolean z2) {
        if (i()) {
            v("rtc.video.switch");
            m(z2);
            x();
        }
    }

    public final void H(ue1 ue1) {
        this.n1.f(new v8b(ue1, new v9a(16), new v9a(16), new v9a(16), new v9a(16), new v9a(16), new v9a(16)), xwd.a);
    }

    public final void a(gz0 gz0) {
        int i = ftg.a[gz0.ordinal()];
        k(i != 1 ? i != 2 ? i != 3 ? i != 4 ? b51.N0 : b51.M0 : b51.L0 : b51.K0 : b51.J0, (Object) null);
    }

    public final void b(v48 v48) {
        this.T0.log("OKRTCCall", "onLocalMediaStreamChanged, " + ur9.c(v48));
        this.y.post(new my0(this, 2));
    }

    public final void c(gm1 gm1) {
        voc voc = this.T0;
        voc.log("OKRTCCall", "maybeSetTopologyState, " + gm1 + ", state=" + gm1.B(1));
        if (!this.a1) {
            voc.log("OKRTCCall", "cant set " + gm1 + " to active state, conversation is not ready yet");
            return;
        }
        if (!this.z0) {
            if (!this.q1) {
                voc.log("OKRTCCall", "cant set " + gm1 + " to active state, conversation is not started yet");
                return;
            } else if (!this.y1) {
                voc.log("OKRTCCall", "cant set " + gm1 + " to active state, user is not accepted call yet");
                return;
            }
        }
        gm1.P(this.J0);
        ur9.e();
        if (true != gm1.y0) {
            gm1.y0 = true;
            gm1.F();
        }
        ur9.e();
        if (1 != gm1.x0) {
            gm1.x0 = 1;
            gm1.G();
        }
        this.w1.a();
    }

    public final void d(nw6 nw6) {
        this.T0.log("OKRTCCall", "hangup, " + ur9.c(nw6) + ", unknown");
        ur9.e();
        u(jme.callHangup, nw6.toString());
        if (this.x == null) {
            p(nw6, "hangup." + nw6 + ".unknown");
            return;
        }
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("reason", (Object) nw6.toString());
            o9e o9e = this.x;
            JSONObject jSONObject2 = new JSONObject();
            try {
                jSONObject2.put("command", (Object) "hangup");
                Iterator<String> keys = jSONObject.keys();
                while (keys.hasNext()) {
                    String next = keys.next();
                    jSONObject2.put(next, jSONObject.get(next));
                }
                o9e.p = false;
                ur9.e();
                mgd mgd = new mgd(8, o9e);
                o9e.c.postDelayed(mgd, 8000);
                o9e.d(new rp6(jSONObject2), true, new xw0(o9e, mgd), (n9e) null);
                this.X0 = false;
                p(nw6, "hangup." + nw6 + ".unknown");
            } catch (JSONException e) {
                throw new RuntimeException(e);
            }
        } catch (JSONException e3) {
            throw new RuntimeException(e3);
        }
    }

    /* JADX WARNING: type inference failed for: r15v29, types: [java.lang.Object, zo4] */
    public final void e(xnf xnf, boolean z2) {
        gm1 gm1;
        jj8 jj8;
        qr0 qr0;
        jj8 jj82;
        qr0 qr02;
        xnf y2 = this.r1.y();
        this.c2.a(this.r1);
        gm1 gm12 = this.s1;
        if (gm12 != null) {
            gm12.L();
            this.s1 = null;
        }
        if (this.r1.H(xnf)) {
            this.r1.L();
        } else {
            this.s1 = this.r1;
        }
        xnf xnf2 = xnf.c;
        if (xnf == xnf2) {
            ? obj = new Object();
            obj.e = this.z;
            obj.h = this.n1;
            obj.g = this.w1;
            obj.i = this.x;
            obj.l = this.S0;
            voc voc = this.T0;
            obj.k = voc;
            obj.m = this.a2;
            te1 te1 = this.X;
            obj.j = te1;
            obj.a = this.i1;
            obj.d = m2;
            obj.f = this.v0;
            obj.c = this.g1;
            obj.b = this.j1;
            obj.n = this.z1;
            obj.o = this.B1;
            obj.p = this.C1;
            obj.q = this.U1;
            obj.s = this.D1;
            dm4 dm4 = te1.w;
            if (dm4 == null || (qr02 = (qr0) dm4.b) == null || !qr02.a) {
                jj82 = null;
            } else {
                if (this.d2 == null) {
                    j09 j09 = this.P1;
                    te1.A.getClass();
                    this.d2 = new gme(j09, voc);
                }
                jj82 = new jj8(this.d2, (gj8) ((qr0) this.X.w.b).b, this.S0, this.D1, this.T0, this.B0);
            }
            obj.r = jj82;
            if (obj.a == null || obj.e == null || obj.h == null || obj.g == null || obj.i == null || obj.j == null || obj.k == null || obj.l == null || obj.f == null || obj.c == null || obj.b == null || obj.o == null || obj.q == null || obj.s == null) {
                throw new IllegalStateException();
            }
            gm1 = new ap4(obj);
        } else if (xnf == xnf.o) {
            jtd jtd = new jtd();
            jtd.e = this.z;
            jtd.h = this.n1;
            jtd.g = this.w1;
            jtd.i = this.x;
            jtd.j.add(new r9d(this.T0));
            jtd.k.add(this.v);
            jtd.k.add(new v9d(this.T0));
            jtd.p = this.S0;
            jtd.q = this.a2;
            jtd.o = this.T0;
            jtd.m = this.X;
            jtd.n = this.c1;
            jtd.a = this.i1;
            jtd.d = m2;
            jtd.f = this.v0;
            jtd.c = this.g1;
            jtd.b = this.j1;
            jtd.r = this.m1;
            jtd.s = z2;
            jtd.t = this.B1;
            jtd.u = this.C1;
            jtd.v = this.U1;
            jtd.x = this.Z1;
            jtd.l.add(this.w);
            te1 te12 = this.X;
            dm4 dm42 = te12.w;
            if (dm42 == null || (qr0 = (qr0) dm42.c) == null || !qr0.a) {
                jj8 = null;
            } else {
                if (this.d2 == null) {
                    j09 j092 = this.P1;
                    voc voc2 = this.T0;
                    te12.A.getClass();
                    this.d2 = new gme(j092, voc2);
                }
                jj8 = new jj8(this.d2, (gj8) ((qr0) this.X.w.c).b, this.S0, this.D1, this.T0, this.B0);
            }
            jtd.w = jj8;
            jtd.y = this.X.z;
            rjf rjf = this.D1;
            jtd.z = rjf;
            jtd.A = this.E1;
            if (jtd.e == null || jtd.h == null || jtd.g == null || jtd.i == null || jtd.m == null || jtd.o == null || jtd.p == null || jtd.f == null || jtd.c == null || jtd.b == null || jtd.t == null || jtd.v == null || rjf == null) {
                throw new IllegalStateException();
            }
            gm1 = new ktd(jtd);
        } else {
            throw new IllegalArgumentException("Unsupported topology: " + xnf);
        }
        gm1.P(this.J0);
        ur9.e();
        gm1.w0 = this;
        this.r1 = gm1;
        jl4 jl4 = this.c2;
        jj8 jj83 = gm1.v0;
        boolean z3 = false;
        jl4.a.log("MediaAdaptation", "Set new condition provider source. Is null = " + (jj83 == null));
        p6a p6a = jl4.b;
        if (p6a != null) {
            p6a.a(jl4.e);
        }
        jl4.b = jj83;
        if (jj83 == null) {
            dj8 dj8 = new dj8(cj8.a, (kbb) null, true);
            jl4.a.log("MediaAdaptation", "Since there are no new provider, trigger state change to " + dj8);
            jl4.e.q(dj8);
        } else {
            jj83.d(jl4.e);
        }
        this.c2.b(this.r1);
        boolean z4 = y2 == xnf2;
        if (xnf == xnf.o) {
            z3 = true;
        }
        if (z4 && z3) {
            k(b51.P0, (Object) null);
        }
        xnf y3 = this.r1.y();
        Iterator it = this.p1.iterator();
        while (it.hasNext()) {
            ((ynf) it.next()).onTopologyUpdated(y2, y3);
        }
    }

    public final void f(JSONArray jSONArray) {
        ArrayList arrayList = new ArrayList(jSONArray.length());
        for (int i = 0; i < jSONArray.length(); i++) {
            String string = jSONArray.getString(i);
            try {
                arrayList.add(gz0.valueOf(string));
            } catch (IllegalArgumentException unused) {
                this.T0.log("OKRTCCall", wj6.k("got unknown conversation option '", string, "'"));
            }
        }
        EnumSet enumSet = this.x0;
        ArrayList arrayList2 = new ArrayList(enumSet);
        arrayList2.removeAll(arrayList);
        ArrayList arrayList3 = new ArrayList(arrayList);
        arrayList3.removeAll(enumSet);
        enumSet.clear();
        enumSet.addAll(arrayList);
        Iterator it = arrayList2.iterator();
        while (it.hasNext()) {
            a((gz0) it.next());
        }
        Iterator it2 = arrayList3.iterator();
        while (it2.hasNext()) {
            a((gz0) it2.next());
        }
    }

    public final void g(JSONObject jSONObject) {
        boolean z2 = true;
        JSONArray optJSONArray = jSONObject.optJSONArray("features");
        n09 n09 = this.S1;
        ((eud) n09.c).z(jSONObject);
        ((eud) n09.c).H(jSONObject);
        if (optJSONArray != null) {
            int i = 0;
            while (true) {
                if (i >= optJSONArray.length()) {
                    break;
                } else if ("ADD_PARTICIPANT".equalsIgnoreCase(optJSONArray.optString(i))) {
                    break;
                } else {
                    i++;
                }
            }
        }
        z2 = false;
        StringBuilder sb = new StringBuilder("setFeatureAddParticipantEnabled, ");
        boolean z3 = ur9.a;
        sb.append(z2 ? "yes" : "no");
        this.T0.log("OKRTCCall", sb.toString());
        if (this.v1 != z2) {
            this.v1 = z2;
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v35, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v36, resolved type: java.lang.Object} */
    /* JADX WARNING: type inference failed for: r7v2 */
    /* JADX WARNING: type inference failed for: r7v3, types: [ue1, java.lang.Object, java.lang.String] */
    /* JADX WARNING: type inference failed for: r3v37 */
    /* JADX WARNING: type inference failed for: r7v11 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:227:0x06bc  */
    /* JADX WARNING: Removed duplicated region for block: B:230:0x06d8 A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:237:0x06fb A[Catch:{ JSONException -> 0x0704 }] */
    /* JADX WARNING: Removed duplicated region for block: B:242:0x0715  */
    /* JADX WARNING: Removed duplicated region for block: B:247:0x0738 A[Catch:{ JSONException -> 0x075d }] */
    /* JADX WARNING: Removed duplicated region for block: B:252:0x0770  */
    /* JADX WARNING: Removed duplicated region for block: B:293:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x025e  */
    /* JADX WARNING: Removed duplicated region for block: B:71:0x026e  */
    /* JADX WARNING: Removed duplicated region for block: B:79:0x029c  */
    /* JADX WARNING: Removed duplicated region for block: B:82:0x02b7  */
    /* JADX WARNING: Removed duplicated region for block: B:92:0x02f1  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void h(org.json.JSONObject r43, boolean r44, boolean r45) {
        /*
            r42 = this;
            r1 = r42
            r2 = r43
            java.lang.String r3 = "RecordInfoParser"
            java.lang.String r4 = "Can't parse record info from parent"
            r42.g(r43)
            ef1 r0 = r1.n1
            ye1 r0 = r0.a
            boolean r5 = r1.Z
            b51 r6 = defpackage.b51.c
            b51 r7 = defpackage.b51.o
            xwd r15 = defpackage.xwd.a
            java.lang.String r12 = "topology"
            java.lang.String r11 = "CALLED"
            java.lang.String r10 = "hangup.in.connection.notification"
            java.lang.String r9 = "HUNGUP"
            java.lang.String r8 = "accepted.on.other.device.con"
            java.lang.String r13 = "state"
            java.lang.String r14 = "participants"
            r18 = r4
            java.lang.String r4 = "ACCEPTED"
            r19 = r3
            java.lang.String r3 = "OKRTCCall"
            r20 = r0
            if (r5 == 0) goto L_0x0166
            if (r45 != 0) goto L_0x0166
            java.lang.String r5 = "connection already handled"
            voc r0 = r1.T0
            r0.log(r3, r5)
            ef1 r0 = r1.n1
            ye1 r0 = r0.a
            java.util.HashSet r5 = new java.util.HashSet
            r5.<init>()
            org.json.JSONArray r14 = r2.getJSONArray(r14)
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            r22 = r3
            r21 = r12
            r12 = 0
            r18 = 0
        L_0x0053:
            int r3 = r14.length()
            if (r12 >= r3) goto L_0x00ca
            org.json.JSONObject r3 = r14.getJSONObject(r12)
            r44 = r14
            ue1 r14 = defpackage.tf6.F(r3)
            r19 = r12
            java.lang.String r12 = r3.getString(r13)
            r23 = r13
            ue1 r13 = r0.a
            boolean r13 = r14.equals(r13)
            if (r13 == 0) goto L_0x009a
            boolean r3 = r0.b()
            if (r3 == 0) goto L_0x007c
            r18 = 1
            goto L_0x00c3
        L_0x007c:
            boolean r3 = r4.equals(r12)
            if (r3 == 0) goto L_0x008b
            r3 = 0
            r1.k(r7, r3)
            r1.p(r3, r8)
            goto L_0x0165
        L_0x008b:
            r3 = 0
            boolean r12 = r9.equals(r12)
            if (r12 == 0) goto L_0x00c3
            r1.k(r6, r3)
            r1.p(r3, r10)
            goto L_0x0165
        L_0x009a:
            boolean r13 = r4.equals(r12)
            if (r13 == 0) goto L_0x00af
            r5.add(r14)
            bae r12 = r1.R1
            qpg r12 = r12.f
            v8b r3 = r12.e(r14, r3, r15)
            r2.add(r3)
            goto L_0x00c3
        L_0x00af:
            boolean r12 = r11.equals(r12)
            if (r12 == 0) goto L_0x00c3
            r5.add(r14)
            bae r12 = r1.R1
            qpg r12 = r12.f
            v8b r3 = r12.f(r14, r3, r15)
            r2.add(r3)
        L_0x00c3:
            int r12 = r19 + 1
            r14 = r44
            r13 = r23
            goto L_0x0053
        L_0x00ca:
            ef1 r0 = r1.n1
            r3 = 0
            r0.g(r3, r2)
            boolean r0 = r5.isEmpty()
            if (r0 == 0) goto L_0x00fe
            if (r18 != 0) goto L_0x00fe
            java.lang.String r0 = "Conversation has no participants"
            voc r2 = r1.T0
            r3 = r22
            r2.log(r3, r0)
            zqd r0 = r1.i2
            ru.ok.android.externcalls.sdk.events.end.ConversationEndReason$Error r2 = new ru.ok.android.externcalls.sdk.events.end.ConversationEndReason$Error
            java.lang.IllegalStateException r3 = new java.lang.IllegalStateException
            java.lang.String r4 = "Conversation without participants and current user"
            r3.<init>(r4)
            r2.<init>(r3)
            r0.B(r2)
            b51 r0 = defpackage.b51.Z
            r2 = 0
            r1.k(r0, r2)
            java.lang.String r0 = "conversation.without.participants"
            r1.p(r2, r0)
            goto L_0x0165
        L_0x00fe:
            r3 = r22
            ef1 r0 = r1.n1
            zwd r2 = r0.k
            java.util.Map r0 = r0.d(r2)
            java.util.Set r0 = r0.keySet()
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            java.util.Iterator r0 = r0.iterator()
        L_0x0115:
            boolean r4 = r0.hasNext()
            if (r4 == 0) goto L_0x012b
            java.lang.Object r4 = r0.next()
            ue1 r4 = (defpackage.ue1) r4
            boolean r6 = r5.contains(r4)
            if (r6 != 0) goto L_0x0115
            r2.add(r4)
            goto L_0x0115
        L_0x012b:
            ef1 r0 = r1.n1
            r4 = 0
            r0.m(r4, r2)
            bk3 r0 = r1.O1
            mz9 r2 = r1.w1
            r0.getClass()
            aae r0 = defpackage.bk3.j(r2)
            d19 r2 = r1.N1
            r2.c(r0)
            java.lang.String r0 = "handleNewTopology"
            voc r2 = r1.T0
            r2.log(r3, r0)
            r2 = r43
            r0 = r21
            java.lang.String r0 = r2.getString(r0)
            xnf r0 = defpackage.xnf.a(r0)
            gm1 r2 = r1.r1
            boolean r2 = r2.H(r0)
            if (r2 != 0) goto L_0x0160
            r2 = 0
            r1.e(r0, r2)
        L_0x0160:
            gm1 r0 = r1.r1
            r1.c(r0)
        L_0x0165:
            return
        L_0x0166:
            r0 = r12
            r23 = r13
            r5 = 1
            r1.Z = r5
            java.lang.String r5 = "connected"
            voc r12 = r1.T0
            r12.log(r3, r5)
            java.lang.String r5 = "id"
            java.lang.String r5 = r2.getString(r5)
            kz3 r12 = r1.B0
            boolean r13 = r12 instanceof defpackage.lz3
            if (r13 == 0) goto L_0x0183
            lz3 r12 = (defpackage.lz3) r12
            r12.a = r5
        L_0x0183:
            java.lang.String r5 = "joinLink"
            boolean r12 = r2.has(r5)
            if (r12 == 0) goto L_0x0191
            java.lang.String r5 = r2.getString(r5)
            r1.D0 = r5
        L_0x0191:
            if (r44 == 0) goto L_0x0197
            r5 = 1
            r1.P0 = r5
            goto L_0x01a2
        L_0x0197:
            boolean r5 = r1.P0
            if (r5 == 0) goto L_0x01a2
            java.lang.String r5 = "onConnected isConcurrent from api"
            voc r12 = r1.T0
            r12.log(r3, r5)
        L_0x01a2:
            org.json.JSONArray r5 = r2.getJSONArray(r14)
            ef1 r12 = r1.n1
            ye1 r14 = r12.a
            java.util.ArrayList r13 = new java.util.ArrayList
            r13.<init>()
            java.util.ArrayList r12 = new java.util.ArrayList
            r12.<init>()
            r21 = r0
            r22 = r3
            r24 = r11
            r44 = r13
            r0 = 0
            r2 = 0
            r3 = 0
            r11 = 0
        L_0x01c0:
            int r13 = r5.length()
            if (r3 >= r13) goto L_0x0413
            org.json.JSONObject r13 = r5.getJSONObject(r3)
            r25 = r5
            r5 = r23
            r23 = r0
            java.lang.String r0 = r13.getString(r5)
            r34 = r5
            ue1 r5 = defpackage.tf6.F(r13)
            r35 = r2
            if (r3 != 0) goto L_0x01e6
            te1 r2 = r1.X
            re1 r2 = r2.B
            boolean r2 = r2.j
            if (r2 != 0) goto L_0x01ee
        L_0x01e6:
            ue1 r2 = r14.a
            boolean r2 = r5.equals(r2)
            if (r2 == 0) goto L_0x038e
        L_0x01ee:
            te1 r2 = r1.X
            re1 r2 = r2.B
            boolean r2 = r2.j
            if (r2 == 0) goto L_0x0251
            e51 r2 = r14.p
            if (r2 != 0) goto L_0x0200
            e51 r2 = defpackage.tf6.m(r13)
            r14.p = r2
        L_0x0200:
            ue1 r2 = r14.a
            if (r2 != 0) goto L_0x0251
            r14.a = r5
            v9a r2 = new v9a
            r11 = 16
            r2.<init>((int) r11)
            v9a r11 = new v9a
            r36 = r3
            r3 = 16
            r11.<init>((int) r3)
            v9a r3 = new v9a
            r37 = r15
            r15 = 16
            r3.<init>((int) r15)
            v9a r15 = new v9a
            r38 = r10
            r10 = 16
            r15.<init>((int) r10)
            v9a r10 = new v9a
            r39 = r6
            r6 = 16
            r10.<init>((int) r6)
            v9a r6 = new v9a
            r40 = r9
            r9 = 16
            r6.<init>((int) r9)
            v8b r9 = new v8b
            r26 = r9
            r27 = r5
            r28 = r2
            r29 = r11
            r30 = r3
            r31 = r15
            r32 = r10
            r33 = r6
            r26.<init>(r27, r28, r29, r30, r31, r32, r33)
            r3 = r9
            goto L_0x025c
        L_0x0251:
            r36 = r3
            r39 = r6
            r40 = r9
            r38 = r10
            r37 = r15
            r3 = 0
        L_0x025c:
            if (r3 == 0) goto L_0x0261
            r12.add(r3)
        L_0x0261:
            java.lang.String r2 = "restricted"
            r3 = 0
            boolean r2 = r13.optBoolean(r2, r3)
            boolean r3 = r14.b()
            if (r3 != 0) goto L_0x029c
            boolean r3 = r4.equals(r0)
            if (r3 == 0) goto L_0x0283
            r3 = 0
            r1.k(r7, r3)
            r1.p(r3, r8)
        L_0x027b:
            r7 = r3
            r14 = r7
            r2 = r21
            r15 = r37
            goto L_0x0481
        L_0x0283:
            r5 = r40
            r3 = 0
            boolean r0 = r5.equals(r0)
            if (r0 == 0) goto L_0x0297
            r6 = r39
            r1.k(r6, r3)
            r0 = r38
            r1.p(r3, r0)
            goto L_0x027b
        L_0x0297:
            r0 = r38
            r6 = r39
            goto L_0x02a3
        L_0x029c:
            r0 = r38
            r6 = r39
            r5 = r40
            r3 = 0
        L_0x02a3:
            java.lang.String r9 = "permissions"
            org.json.JSONArray r9 = r13.optJSONArray(r9)
            bae r10 = r1.R1
            u6h r10 = r10.a
            r15 = r37
            java.util.List r10 = r10.p(r13, r15)
            r14.q = r10
            if (r9 == 0) goto L_0x02d3
            r10 = 0
        L_0x02b8:
            int r11 = r9.length()
            if (r10 >= r11) goto L_0x02d3
            java.lang.String r11 = r9.optString(r10)
            java.lang.String r3 = "MUTE_PARTICIPANTS"
            boolean r3 = r3.equals(r11)
            if (r3 == 0) goto L_0x02ce
            r3 = 1
            r1.a = r3
            goto L_0x02d4
        L_0x02ce:
            r3 = 1
            int r10 = r10 + 1
            r3 = 0
            goto L_0x02b8
        L_0x02d3:
            r3 = 1
        L_0x02d4:
            java.util.ArrayList r11 = new java.util.ArrayList
            r11.<init>()
            java.lang.String r9 = "offerTo"
            org.json.JSONArray r9 = r13.optJSONArray(r9)
            java.lang.String r10 = "offerToTypes"
            org.json.JSONArray r10 = r13.optJSONArray(r10)
            java.lang.String r3 = "offerToDeviceIdxs"
            org.json.JSONArray r3 = r13.optJSONArray(r3)
            r38 = r0
            r23 = r2
            if (r9 == 0) goto L_0x0346
            r0 = 0
        L_0x02f2:
            int r2 = r9.length()
            if (r0 >= r2) goto L_0x0346
            if (r10 == 0) goto L_0x030d
            int r2 = r10.length()
            if (r0 >= r2) goto L_0x030d
            java.lang.String r2 = r10.optString(r0)
            r40 = r5
            java.lang.String r5 = "GROUP"
            boolean r2 = r5.equals(r2)
            goto L_0x0310
        L_0x030d:
            r40 = r5
            r2 = 0
        L_0x0310:
            if (r3 == 0) goto L_0x031f
            int r5 = r3.length()
            if (r0 >= r5) goto L_0x031f
            int r5 = r3.optInt(r0)
            r26 = r3
            goto L_0x0322
        L_0x031f:
            r26 = r3
            r5 = 0
        L_0x0322:
            ue1 r3 = new ue1
            java.lang.String r27 = r9.optString(r0)
            r39 = r6
            r28 = r7
            long r6 = java.lang.Long.parseLong(r27)
            if (r2 == 0) goto L_0x0334
            r2 = 2
            goto L_0x0335
        L_0x0334:
            r2 = 1
        L_0x0335:
            r3.<init>(r2, r5, r6)
            r11.add(r3)
            int r0 = r0 + 1
            r3 = r26
            r7 = r28
            r6 = r39
            r5 = r40
            goto L_0x02f2
        L_0x0346:
            r40 = r5
            r39 = r6
            r28 = r7
            java.util.ArrayList r0 = defpackage.tf6.A(r13)
            java.util.ArrayList r2 = r14.d
            r2.clear()
            r2.addAll(r0)
            b51 r0 = defpackage.b51.E0
            r1.k(r0, r14)
            mc1 r0 = r1.J1
            kc1 r2 = defpackage.kc1.a
            java.util.Map r2 = r0.g(r15, r2)
            java.lang.String r10 = "handleConversationParticipants"
            r3 = 1
            r6 = r8
            r8 = r0
            r7 = r40
            r9 = r13
            r26 = r38
            r5 = r11
            r0 = r24
            r11 = r2
            r2 = r21
            r21 = r6
            r6 = r12
            r12 = r3
            r3 = r44
            r41 = r13
            r16 = r34
            r13 = r15
            r17 = r14
            r7 = 0
            r14 = r15
            r8.n(r9, r10, r11, r12, r13, r14)
            r8 = r0
            r0 = r5
            r11 = r23
            r9 = r41
            goto L_0x03e2
        L_0x038e:
            r36 = r3
            r39 = r6
            r28 = r7
            r40 = r9
            r26 = r10
            r6 = r12
            r41 = r13
            r17 = r14
            r2 = r21
            r16 = r34
            r7 = 0
            r3 = r44
            r21 = r8
            r8 = r24
            boolean r9 = r4.equals(r0)
            if (r9 == 0) goto L_0x03bc
            bae r0 = r1.R1
            qpg r0 = r0.f
            r9 = r41
            v8b r0 = r0.e(r5, r9, r15)
            r6.add(r0)
            goto L_0x03e0
        L_0x03bc:
            r9 = r41
            boolean r0 = r8.equals(r0)
            if (r0 == 0) goto L_0x03dd
            bae r0 = r1.R1
            qpg r0 = r0.f
            v8b r0 = r0.f(r5, r9, r15)
            r6.add(r0)
            int r0 = r5.b
            r5 = 2
            boolean r0 = defpackage.tr1.c(r0, r5)
            if (r0 == 0) goto L_0x03e0
            r0 = r23
            r35 = 1
            goto L_0x03e2
        L_0x03dd:
            r3.add(r5)
        L_0x03e0:
            r0 = r23
        L_0x03e2:
            bae r5 = r1.R1
            dd4 r5 = r5.e
            we1 r5 = r5.d(r9)
            if (r5 == 0) goto L_0x03f5
            jc1 r9 = r1.U1
            a9b r9 = r9.n
            ue1 r10 = r5.b
            r9.onStateChanged(r10, r5)
        L_0x03f5:
            int r5 = r36 + 1
            r44 = r3
            r3 = r5
            r12 = r6
            r24 = r8
            r23 = r16
            r14 = r17
            r8 = r21
            r5 = r25
            r10 = r26
            r7 = r28
            r6 = r39
            r9 = r40
            r21 = r2
            r2 = r35
            goto L_0x01c0
        L_0x0413:
            r3 = r44
            r23 = r0
            r35 = r2
            r6 = r12
            r2 = r21
            r7 = 0
            java.util.HashSet r0 = new java.util.HashSet
            r0.<init>()
            java.util.Iterator r4 = r6.iterator()
        L_0x0426:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L_0x0438
            java.lang.Object r5 = r4.next()
            v8b r5 = (defpackage.v8b) r5
            ue1 r5 = r5.a
            r0.add(r5)
            goto L_0x0426
        L_0x0438:
            ef1 r4 = r1.n1
            zwd r5 = r4.k
            java.util.Map r4 = r4.d(r5)
            java.util.Set r4 = r4.keySet()
            java.util.Iterator r4 = r4.iterator()
        L_0x0448:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L_0x045e
            java.lang.Object r5 = r4.next()
            ue1 r5 = (defpackage.ue1) r5
            boolean r8 = r0.contains(r5)
            if (r8 != 0) goto L_0x0448
            r3.add(r5)
            goto L_0x0448
        L_0x045e:
            ef1 r0 = r1.n1
            r0.m(r7, r3)
            ef1 r0 = r1.n1
            r0.g(r7, r6)
            bk3 r0 = r1.O1
            mz9 r3 = r1.w1
            r0.getClass()
            aae r0 = defpackage.bk3.j(r3)
            d19 r3 = r1.N1
            r3.c(r0)
            sug r14 = new sug
            r0 = r23
            r3 = r35
            r14.<init>(r0, r11, r3)
        L_0x0481:
            if (r14 != 0) goto L_0x0484
            return
        L_0x0484:
            r3 = r43
            java.lang.String r0 = r3.optString(r2)
            xnf r0 = defpackage.xnf.a(r0)
            xnf r2 = defpackage.xnf.b
            if (r0 != r2) goto L_0x04d9
            voc r2 = r1.T0
            java.lang.Exception r4 = new java.lang.Exception
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            java.lang.String r6 = "invalid.topology.identity."
            r5.<init>(r6)
            r5.append(r0)
            java.lang.String r5 = r5.toString()
            r4.<init>(r5)
            java.lang.String r5 = "conn.notify.topology"
            r6 = r22
            r2.logException(r6, r5, r4)
            ef1 r2 = r1.n1
            int r2 = r2.r()
            r4 = 1
            if (r2 <= r4) goto L_0x04ba
            xnf r2 = defpackage.xnf.o
            goto L_0x04bc
        L_0x04ba:
            xnf r2 = defpackage.xnf.c
        L_0x04bc:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            java.lang.String r5 = "Unknown topology specified ("
            r4.<init>(r5)
            r4.append(r0)
            java.lang.String r0 = ") , use "
            r4.append(r0)
            r4.append(r2)
            java.lang.String r0 = r4.toString()
            voc r4 = r1.T0
            r4.log(r6, r0)
            r0 = r2
            goto L_0x04db
        L_0x04d9:
            r6 = r22
        L_0x04db:
            boolean r2 = r1.P0
            if (r2 == 0) goto L_0x04f3
            java.lang.String r2 = "   isConcurrent"
            voc r4 = r1.T0
            r4.log(r6, r2)
            boolean r2 = r1.z0
            if (r2 == 0) goto L_0x04ef
            r2 = 0
            r1.e(r0, r2)
            goto L_0x04f0
        L_0x04ef:
            r2 = 0
        L_0x04f0:
            r1.z0 = r2
            goto L_0x04f4
        L_0x04f3:
            r2 = 0
        L_0x04f4:
            gm1 r4 = r1.r1
            boolean r4 = r4.H(r0)
            if (r4 == 0) goto L_0x04fe
            if (r45 == 0) goto L_0x0501
        L_0x04fe:
            r1.e(r0, r2)
        L_0x0501:
            java.util.List r0 = r14.b
            if (r0 == 0) goto L_0x0537
            gm1 r2 = r1.r1
            xnf r4 = defpackage.xnf.c
            boolean r2 = r2.H(r4)
            if (r2 == 0) goto L_0x0537
            java.util.Iterator r0 = r0.iterator()
        L_0x0513:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L_0x0537
            java.lang.Object r2 = r0.next()
            ue1 r2 = (defpackage.ue1) r2
            ef1 r4 = r1.n1     // Catch:{ NumberFormatException -> 0x0526 }
            ye1 r2 = r4.j(r2)     // Catch:{ NumberFormatException -> 0x0526 }
            goto L_0x052e
        L_0x0526:
            java.lang.String r2 = "Cant get participant id from responders"
            voc r4 = r1.T0
            r4.log(r6, r2)
            r2 = r7
        L_0x052e:
            if (r2 == 0) goto L_0x0513
            gm1 r4 = r1.r1
            r5 = 0
            r4.u(r2, r5)
            goto L_0x0513
        L_0x0537:
            java.lang.String r0 = "options"
            org.json.JSONArray r0 = r3.optJSONArray(r0)
            if (r0 == 0) goto L_0x0542
            r1.f(r0)
        L_0x0542:
            boolean r0 = r1.z0
            if (r0 != 0) goto L_0x0551
            boolean r0 = r1.A0
            if (r0 == 0) goto L_0x054b
            goto L_0x0551
        L_0x054b:
            gm1 r0 = r1.r1
            r1.c(r0)
            goto L_0x057e
        L_0x0551:
            boolean r0 = r14.a
            r1.I1 = r0
            boolean r0 = r14.a
            if (r0 == 0) goto L_0x0562
            jc1 r0 = r1.U1
            peg r0 = r0.d
            r2 = 1
            r0.onMeInWaitingRoomChanged(r2)
            goto L_0x057e
        L_0x0562:
            jc1 r0 = r1.U1
            peg r0 = r0.d
            r2 = 0
            r0.onMeInWaitingRoomChanged(r2)
            gm1 r0 = r1.r1
            r1.c(r0)
            gz0 r0 = defpackage.gz0.b
            java.util.EnumSet r2 = r1.x0
            boolean r0 = r2.contains(r0)
            if (r0 == 0) goto L_0x057e
            b51 r0 = defpackage.b51.N0
            r1.k(r0, r7)
        L_0x057e:
            boolean r0 = r1.P0
            if (r0 == 0) goto L_0x059b
            boolean r0 = r14.a
            if (r0 != 0) goto L_0x059b
            jme r0 = defpackage.jme.callAcceptConcurrent
            r1.u(r0, r7)
            boolean r0 = r20.b()
            mz9 r2 = r1.w1
            boolean r2 = r2.f
            r1.B(r2)
            if (r0 == 0) goto L_0x059b
            r42.w()
        L_0x059b:
            j09 r0 = r1.P1
            hug r2 = r1.e1
            java.lang.Object r4 = r0.k
            android.os.Handler r4 = (android.os.Handler) r4
            android.os.Looper r5 = r4.getLooper()
            java.lang.Thread r5 = r5.getThread()
            java.lang.Thread r6 = java.lang.Thread.currentThread()
            boolean r5 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r5, (java.lang.Object) r6)
            if (r5 == 0) goto L_0x05bd
            java.lang.Object r0 = r0.f
            java.util.LinkedHashSet r0 = (java.util.LinkedHashSet) r0
            r0.remove(r2)
            goto L_0x05c6
        L_0x05bd:
            kme r5 = new kme
            r6 = 1
            r5.<init>(r0, r2, r6)
            r4.post(r5)
        L_0x05c6:
            j09 r0 = r1.P1
            hug r2 = r1.e1
            r0.m(r2)
            j09 r0 = r1.P1
            zh3 r2 = r1.f1
            java.lang.Object r0 = r0.d
            java.util.HashMap r0 = (java.util.HashMap) r0
            r0.remove(r2)
            j09 r0 = r1.P1
            zh3 r2 = r1.f1
            java.util.concurrent.TimeUnit r4 = java.util.concurrent.TimeUnit.SECONDS
            r5 = 5
            r0.c(r2, r5, r4)
            j09 r0 = r1.P1
            sp5 r2 = r1.a2
            r8 = 1
            r0.c(r2, r8, r4)
            j09 r0 = r1.P1
            java.lang.Object r2 = r0.k
            android.os.Handler r2 = (android.os.Handler) r2
            java.lang.Object r10 = r0.m
            nme r10 = (defpackage.nme) r10
            r2.removeCallbacks(r10)
            r11 = 1000(0x3e8, double:4.94E-321)
            r2.postDelayed(r10, r11)
            java.lang.Object r2 = r0.l
            or7 r2 = (defpackage.or7) r2
            if (r2 == 0) goto L_0x0607
            defpackage.qq4.a(r2)
        L_0x0607:
            r0.l = r7
            hja r2 = defpackage.jha.p(r8, r4)
            lfd r8 = defpackage.qe.a()
            lja r2 = r2.s(r8)
            ch2 r8 = new ch2
            r9 = 27
            r8.<init>(r9, r0)
            yia r9 = new yia
            r10 = 1
            r9.<init>(r2, r8, r10)
            lfd r2 = defpackage.xfd.a()
            lja r2 = r9.s(r2)
            ch2 r8 = new ch2
            java.lang.Object r9 = r0.b
            o9g r9 = (defpackage.o9g) r9
            r10 = 28
            r8.<init>(r10, r9)
            yia r9 = new yia
            r10 = 3
            r9.<init>(r2, r8, r10)
            lfd r2 = defpackage.qe.a()
            lja r2 = r9.s(r2)
            z3a r8 = new z3a
            r9 = 16
            r8.<init>(r9, r0)
            or7 r2 = r2.v(r8)
            r0.l = r2
            zh3 r2 = new zh3
            java.lang.Object r8 = r0.h
            voc r8 = (defpackage.voc) r8
            r9 = 0
            r2.<init>(r9, r8)
            r0.c(r2, r5, r4)
            boolean r0 = r14.c
            if (r0 == 0) goto L_0x0666
            b51 r0 = defpackage.b51.Y
            r1.k(r0, r7)
        L_0x0666:
            java.lang.String r0 = "tamtamMultichatId"
            long r4 = r3.optLong(r0)
            long r4 = -r4
            r1.d1 = r4
            r8 = 0
            int r0 = (r4 > r8 ? 1 : (r4 == r8 ? 0 : -1))
            if (r0 == 0) goto L_0x067e
            b51 r0 = defpackage.b51.y0
            java.lang.Long r2 = java.lang.Long.valueOf(r4)
            r1.k(r0, r2)
        L_0x067e:
            lg1 r2 = r1.X1
            java.lang.String r0 = "recordInfo"
            ox0 r4 = r2.a
            r4.getClass()
            boolean r5 = r3.has(r0)     // Catch:{ JSONException -> 0x06a9 }
            if (r5 == 0) goto L_0x06ad
            org.json.JSONObject r0 = r3.getJSONObject(r0)     // Catch:{ JSONException -> 0x06a9 }
            dae r14 = defpackage.ox0.p(r0)     // Catch:{ JSONException -> 0x0696 }
            goto L_0x06a4
        L_0x0696:
            r0 = move-exception
            r5 = r0
            java.lang.String r0 = "Can't parse record info"
            java.lang.Object r6 = r4.c     // Catch:{ JSONException -> 0x06a9 }
            voc r6 = (defpackage.voc) r6     // Catch:{ JSONException -> 0x06a9 }
            r8 = r19
            r6.logException(r8, r0, r5)     // Catch:{ JSONException -> 0x06a7 }
            goto L_0x06ad
        L_0x06a4:
            r5 = r18
            goto L_0x06b9
        L_0x06a7:
            r0 = move-exception
            goto L_0x06af
        L_0x06a9:
            r0 = move-exception
            r8 = r19
            goto L_0x06af
        L_0x06ad:
            r14 = r7
            goto L_0x06a4
        L_0x06af:
            java.lang.Object r4 = r4.c
            voc r4 = (defpackage.voc) r4
            r5 = r18
            r4.logException(r8, r5, r0)
            r14 = r7
        L_0x06b9:
            if (r14 != 0) goto L_0x06bc
            goto L_0x06cc
        L_0x06bc:
            jc1 r0 = r2.b
            yxc r0 = r0.i
            ig1 r2 = new ig1
            gg1 r4 = defpackage.te8.A(r14)
            r2.<init>(r15, r4)
            r0.onRecordStarted(r2)
        L_0x06cc:
            java.lang.String r0 = "pinnedParticipantId"
            boolean r2 = r3.isNull(r0)
            java.lang.String r0 = r3.optString(r0, r7)
            if (r2 != 0) goto L_0x06e1
            if (r0 == 0) goto L_0x06e1
            ue1 r0 = defpackage.ue1.a(r0)
            r1.G1 = r0
            goto L_0x06e3
        L_0x06e1:
            r1.G1 = r7
        L_0x06e3:
            n09 r0 = r1.S1
            java.lang.Object r0 = r0.o
            m7f r0 = (defpackage.m7f) r0
            r0.n(r3)
            d01 r2 = r1.Y1
            java.lang.String r0 = "asrInfo"
            npg r4 = r2.a
            r4.getClass()
            boolean r6 = r3.has(r0)     // Catch:{ JSONException -> 0x0704 }
            if (r6 == 0) goto L_0x0706
            org.json.JSONObject r0 = r3.getJSONObject(r0)     // Catch:{ JSONException -> 0x0704 }
            yz0 r14 = defpackage.npg.P(r0)     // Catch:{ JSONException -> 0x0704 }
            goto L_0x0712
        L_0x0704:
            r0 = move-exception
            goto L_0x0708
        L_0x0706:
            r14 = r7
            goto L_0x0712
        L_0x0708:
            java.lang.Object r4 = r4.b
            voc r4 = (defpackage.voc) r4
            java.lang.String r6 = "AsrParser"
            r4.logException(r6, r5, r0)
            goto L_0x0706
        L_0x0712:
            if (r14 != 0) goto L_0x0715
            goto L_0x0721
        L_0x0715:
            jc1 r0 = r2.b
            lt r0 = r0.m
            zz0 r2 = new zz0
            r2.<init>(r15, r14)
            r0.onAsrRecordStarted(r2)
        L_0x0721:
            n09 r0 = r1.S1
            java.lang.Object r0 = r0.y
            r1 = r0
            npg r1 = (defpackage.npg) r1
            java.lang.Object r0 = r1.c
            r2 = r0
            dm4 r2 = (defpackage.dm4) r2
            r2.getClass()
            java.lang.String r0 = "urlSharingInfo"
            boolean r4 = r3.has(r0)     // Catch:{ JSONException -> 0x075d }
            if (r4 == 0) goto L_0x075f
            org.json.JSONObject r0 = r3.getJSONObject(r0)     // Catch:{ JSONException -> 0x075d }
            java.lang.String r3 = "initiatorId"
            java.lang.String r3 = r0.getString(r3)     // Catch:{ JSONException -> 0x075d }
            ue1 r3 = defpackage.ue1.a(r3)     // Catch:{ JSONException -> 0x075d }
            java.lang.String r4 = "sharedUrl"
            java.lang.String r4 = defpackage.ct.C(r0, r4)     // Catch:{ JSONException -> 0x075d }
            java.lang.Object r5 = r2.c     // Catch:{ JSONException -> 0x075d }
            nfd r5 = (defpackage.nfd) r5     // Catch:{ JSONException -> 0x075d }
            r5.getClass()     // Catch:{ JSONException -> 0x075d }
            zwd r0 = defpackage.nfd.s(r0)     // Catch:{ JSONException -> 0x075d }
            e7d r14 = new e7d     // Catch:{ JSONException -> 0x075d }
            r14.<init>(r3, r4, r0)     // Catch:{ JSONException -> 0x075d }
            goto L_0x076d
        L_0x075d:
            r0 = move-exception
            goto L_0x0761
        L_0x075f:
            r14 = r7
            goto L_0x076d
        L_0x0761:
            java.lang.Object r2 = r2.b
            voc r2 = (defpackage.voc) r2
            java.lang.String r3 = "UrlSharingParser"
            java.lang.String r4 = "Can't parse url sharing"
            r2.logException(r3, r4, r0)
            goto L_0x075f
        L_0x076d:
            if (r14 != 0) goto L_0x0770
            goto L_0x078b
        L_0x0770:
            java.lang.String r0 = r14.b
            if (r0 == 0) goto L_0x077c
            gae r2 = new gae
            ue1 r3 = r14.a
            r2.<init>(r3, r0)
            goto L_0x077d
        L_0x077c:
            r2 = r7
        L_0x077d:
            hm1 r0 = new hm1
            zwd r3 = r14.c
            r0.<init>(r3, r2)
            java.lang.Object r1 = r1.b
            rzf r1 = (defpackage.rzf) r1
            r1.onUrlSharingInfoUpdated(r0)
        L_0x078b:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.hz0.h(org.json.JSONObject, boolean, boolean):void");
    }

    public final boolean i() {
        if (!this.y0) {
            return true;
        }
        this.T0.log("OKRTCCall", "Call is already destroyed, reason=" + this.Y);
        return false;
    }

    public final void j(ue1 ue1, Boolean bool, Boolean bool2, n9e n9e) {
        voc voc = this.T0;
        voc.log("OKRTCCall", "addParticipant, participant=" + ue1);
        if (i()) {
            ye1 j = this.n1.j(ue1);
            m7f m7f = this.Q1.g;
            Long t = ((nob) m7f.o).t();
            if (t != null) {
                long longValue = t.longValue();
                HashMap hashMap = new HashMap();
                p7d p7d = (p7d) m7f.a;
                hashMap.put("vcid", ((yoc) p7d.b).conversationId);
                hashMap.put("stat_time_delta", String.valueOf(longValue));
                hashMap.put("network_type", ur9.b((ConnectivityManager) m7f.b, (TelephonyManager) m7f.c));
                m7f.b(ue1, j, hashMap);
                ((yoc) p7d.b).log(yoc.COLLECTOR_WEBRTC, "callAddParticipant", (Map) hashMap);
            }
            try {
                this.x.d(tf6.u(ue1, bool, bool2.booleanValue()), false, new vy0(this, ue1, n9e), n9e);
            } catch (JSONException e) {
                voc.reportException("OKRTCCall", "add.participant", e);
            }
        }
    }

    public final Unit k(b51 b51, Object obj) {
        voc voc = this.T0;
        voc.log("OKRTCCall", "dispatch [ " + b51 + " ]");
        if (Looper.myLooper() == Looper.getMainLooper()) {
            Iterator it = this.K0.iterator();
            while (it.hasNext()) {
                try {
                    ((ez0) it.next()).onEvent(this, b51, obj);
                } catch (Throwable th) {
                    voc.logException("OKRTCCall", "Error on dispatch event " + b51, th);
                }
            }
        } else {
            this.y.post(new ktg(this, b51, obj, 9));
        }
        return Unit.INSTANCE;
    }

    public final void l(JSONObject jSONObject) {
        try {
            if (jSONObject.has("rooms")) {
                pv0 pv0 = (pv0) this.S1.a;
                JSONObject jSONObject2 = jSONObject.getJSONObject("rooms");
                if (pv0.b) {
                    fae o2 = ((jk3) pv0.v).o(jSONObject2);
                    if (o2 != null) {
                        ((yj1) pv0.w).e(o2);
                    }
                }
            }
        } catch (JSONException e) {
            this.T0.logException("OKRTCCall", "Can't parse rooms from connection", e);
        }
    }

    public final void m(boolean z2) {
        if (i()) {
            if (z2) {
                this.l1.a();
            }
            mc1 mc1 = this.J1;
            if (!z2) {
                mc1.getClass();
            } else if (!mc1.f.d || !mc1.d(new mo1(3, mc1.i))) {
                return;
            }
            if (z2 && this.w1.g) {
                this.C1.getClass();
            }
            voc voc = this.T0;
            voc.log("OKRTCCall", "Update my settings with video enabled=" + z2);
            mz9 mz9 = this.w1;
            if (mz9.f != z2) {
                mz9.f = z2;
                mz9.a();
            }
            k(b51.v, (Object) null);
        }
    }

    public final void n(JSONObject jSONObject) {
        JSONObject optJSONObject = jSONObject.optJSONObject("data");
        if (optJSONObject == null) {
            return;
        }
        if (optJSONObject.opt("sdk") != null) {
            JSONObject optJSONObject2 = optJSONObject.optJSONObject("sdk");
            if (optJSONObject2 != null && optJSONObject2.optString("type").equals("bad-net") && this.V0) {
                fg0 fg0 = this.U0;
                fg0.getClass();
                if ("bad-net".equals(optJSONObject2.optString("type"))) {
                    fg0.m = optJSONObject2.optBoolean("value");
                    fg0.n = optJSONObject2.has("value");
                    fg0.o = optJSONObject2.optDouble("rtt");
                    fg0.p = optJSONObject2.optDouble("loss");
                    fg0.a();
                    return;
                }
                return;
            }
            return;
        }
        this.y.post(new ktg(this, tf6.E(jSONObject), optJSONObject, 10));
    }

    public final void o(String str) {
        k(b51.c, (Object) null);
        o9e o9e = this.x;
        if (o9e != null) {
            o9e.g();
        }
        p((nw6) null, "conversation_ended." + str);
    }

    public final void onConnectionTypeChanged(NetworkChangeDetector.ConnectionType connectionType) {
        this.y.post(new my0(this, connectionType != NetworkChangeDetector.ConnectionType.CONNECTION_NONE));
    }

    public final void p(nw6 nw6, String str) {
        ConversationEndReason conversationEndReason;
        long j;
        int i;
        this.T0.log("OKRTCCall", a81.m("destroy.reason=", str));
        ur9.e();
        if (this.y0) {
            this.T0.log("OKRTCCall", "   already destroyed, reason=" + this.Y);
            return;
        }
        this.y0 = true;
        zqd zqd = this.i2;
        switch (nw6 == null ? -1 : ow6.$EnumSwitchMapping$0[nw6.ordinal()]) {
            case -1:
                conversationEndReason = null;
                break;
            case 1:
                conversationEndReason = ConversationEndReason.SignalingTimeout.INSTANCE;
                break;
            case 2:
                conversationEndReason = ConversationEndReason.Busy.INSTANCE;
                break;
            case 3:
                conversationEndReason = ConversationEndReason.Missed.INSTANCE;
                break;
            case 4:
                conversationEndReason = ConversationEndReason.Rejected.INSTANCE;
                break;
            case 5:
                conversationEndReason = new ConversationEndReason.Error(new RuntimeException("Call error"));
                break;
            case 6:
                conversationEndReason = ConversationEndReason.Hangup.INSTANCE;
                break;
            case 7:
                conversationEndReason = ConversationEndReason.Canceled.INSTANCE;
                break;
            case 8:
                conversationEndReason = ConversationEndReason.CallTimeout.INSTANCE;
                break;
            case 9:
                conversationEndReason = ConversationEndReason.RemovedFromCall.INSTANCE;
                break;
            case 10:
                conversationEndReason = new ConversationEndReason.ObsoleteClient((String) null);
                break;
            default:
                throw new NoWhenBranchMatchedException();
        }
        zqd.B(conversationEndReason);
        q01 q01 = this.Q1.l;
        zc4 zc4 = (zc4) q01.c;
        zc4.o = null;
        try {
            ((Context) zc4.a).unregisterReceiver((ao) zc4.v);
        } catch (Exception e) {
            ((voc) zc4.b).log("CallBatteryRetriever", a81.m("Can't unregister BroadcastReceiver: ", e.getMessage()));
        }
        p01 p01 = (p01) q01.e;
        if (p01 != null && q01.a) {
            p01 p012 = (p01) q01.f;
            p01 p013 = (p01) q01.g;
            rjf rjf = (rjf) q01.d;
            if (p012 == null || p013 == null) {
                ((sjf) rjf).getClass();
                j = SystemClock.elapsedRealtime() - p01.c;
                i = 0;
            } else {
                i = p013.b - p012.b;
                j = p013.c - p012.c;
            }
            Long a3 = ((sjf) rjf).a();
            if (a3 != null) {
                long longValue = a3.longValue();
                yk1[] yk1Arr = yk1.b;
                Map mapOf = MapsKt.mapOf(TuplesKt.to("battery_level_change", EventItemValueKt.toEventItemValue(Math.abs(i))), TuplesKt.to("stat_time_delta", EventItemValueKt.toEventItemValue(j)), TuplesKt.to("timestamp", EventItemValueKt.toEventItemValue(longValue)));
                EventItemsMap eventItemsMap = (EventItemsMap) q01.i;
                if (eventItemsMap != null) {
                    ((CallAnalyticsSender) q01.b).send(new SdkIntervalStatEvent.Builder().addAll(new EventItemsMap(MapsKt.plus(eventItemsMap.getItems(), (Map<String, EventItemValue>) mapOf))).build());
                }
            }
        }
        h8 h8Var = this.Q1.m;
        h8Var.b.a();
        h8Var.c.c = null;
        nd1 nd1 = this.w0;
        if (nd1 != null) {
            nd1.a();
        }
        hr6 hr6 = this.C1;
        ((ui) ((fj) hr6.o).b).getClass();
        nj njVar = (nj) hr6.v;
        if (!njVar.i) {
            njVar.i = true;
            njVar.c.removeCallbacksAndMessages((Object) null);
            njVar.c.postAtFrontOfQueue(new b(9, (Object) njVar));
            njVar.h.a();
            njVar.b.quitSafely();
            njVar.f.clear();
            njVar.d.quitSafely();
            njVar.a.getClass();
        }
        NetworkMonitor.getInstance().removeObserver(this);
        this.o1.clear();
        this.p1.clear();
        j09 j09 = this.P1;
        j09.g = true;
        ((Handler) j09.k).removeCallbacks((nme) j09.m);
        ((LinkedHashSet) j09.f).clear();
        or7 or7 = (or7) j09.l;
        if (or7 != null) {
            qq4.a(or7);
        }
        j09.l = null;
        this.y.removeCallbacks(this.H0);
        this.r1.L();
        jl4 jl4 = this.c2;
        if (jl4 != null) {
            jl4.a(this.r1);
        }
        this.r1 = new tx4(this.n1, this.X, this.T0, this.S0, this.U1);
        gm1 gm1 = this.s1;
        if (gm1 != null) {
            gm1.L();
            this.s1 = null;
        }
        gme gme = this.d2;
        if (gme != null) {
            ((HashMap) gme.a.d).remove(gme);
        }
        v("rtc.destroy." + str);
        this.Y = str;
        if (this.I0) {
            this.E0 = (SystemClock.elapsedRealtime() - this.F0) + this.E0;
            this.I0 = false;
        }
        long j3 = this.E0;
        if (j3 == 0) {
            v("rtc.connected.time2.-1");
        } else {
            long j4 = j3 / 60000;
            this.E0 = j4;
            this.E0 = Math.min(j4, 10);
            v("rtc.connected.time2." + this.E0);
        }
        o9e o9e = this.x;
        if (o9e != null && this.X0) {
            o9e.k.remove(this.c);
            this.x.l.remove(this.o);
            this.x.g();
            this.x = null;
        }
        this.n1.h();
        ef1 ef1 = this.n1;
        yu9 yu9 = ef1.e;
        yu9.getClass();
        yu9.b = SetsKt.emptySet();
        ef1.i = null;
        ef1.f.clear();
        ef1.g.clear();
        ef1.h.clear();
        ef1.c.clear();
        d dVar = this.j1;
        dVar.y0 = null;
        v48 v48 = dVar.x0;
        if (v48 != null) {
            v48.k((VideoSink) null);
        }
        d dVar2 = this.j1;
        dVar2.Y.log("SlmsSource", "release");
        dVar2.w0.clear();
        dVar2.v.a.remove(dVar2);
        dVar2.c.a.execute(new b(0, (Object) dVar2));
        this.k1.y = null;
        t6e t6e = this.i1;
        t6e.b.log("SharedPeerConnectionFac", "release");
        t6e.a.execute(new r6e(t6e, 1));
        this.X.getClass();
        m2.execute(new my0(this, 1));
        k(b51.y, (Object) null);
        this.G1 = null;
        this.J1.getClass();
        or7 or72 = (or7) this.N1.a;
        or72.getClass();
        qq4.a(or72);
        bl1 bl1 = this.Q1;
        ((CallAnalyticsSender) bl1.a.c).setIdle(true);
        or7 or73 = (or7) bl1.i.c;
        if (or73 != null) {
            qq4.a(or73);
        }
        or7 or74 = (or7) this.f2.v;
        or74.getClass();
        qq4.a(or74);
        AndroidVideoDecoder.errorCallback = null;
        ((kc3) this.h2.o).dispose();
    }

    public final ue1 q() {
        ef1 ef1 = this.n1;
        ef1.getClass();
        ArrayList arrayList = new ArrayList(ef1.d(ef1.k).keySet());
        if (arrayList.size() == 1) {
            return (ue1) arrayList.get(0);
        }
        return null;
    }

    public final void r(meg meg, List list, boolean z2) {
        Intent intent;
        voc voc = this.T0;
        voc.log("OKRTCCall", "init");
        ur9.e();
        if (!this.L0) {
            boolean z3 = true;
            this.L0 = true;
            te1 te1 = this.X;
            te1.b.getClass();
            re1 re1 = te1.B;
            meg meg2 = meg;
            o9e o9e = new o9e(meg2, (lz3) this.B0, this.T0, this.S0, te1.l, re1.i);
            this.x = o9e;
            o9e.k.add(this.c);
            this.x.l.add(this.o);
            this.J0 = list;
            StringBuilder sb = new StringBuilder();
            ef1 ef1 = this.n1;
            sb.append(ef1.r());
            sb.append(" participants");
            voc.log("OKRTCCall", sb.toString());
            if (ef1.r() > 1) {
                e(xnf.o, false);
            } else if (ef1.r() == 1) {
                e(xnf.c, false);
                if (z2) {
                    gm1 gm1 = this.r1;
                    gm1.getClass();
                    ur9.e();
                    if (1 != gm1.x0) {
                        gm1.x0 = 1;
                        gm1.G();
                    }
                }
            }
            if (this.z0 && !re1.j) {
                C();
            }
            if (this.V0) {
                this.U0.k.add(new tug(this));
            }
            q01 q01 = this.Q1.l;
            zc4 zc4 = (zc4) q01.c;
            zc4.o = (e4) q01.h;
            p01 p01 = null;
            try {
                intent = ((Context) zc4.a).registerReceiver((ao) zc4.v, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
            } catch (Exception e) {
                ((voc) zc4.b).log("CallBatteryRetriever", a81.m("Can't register BroadcastReceiver: ", e.getMessage()));
                intent = null;
            }
            if (intent != null) {
                int intExtra = intent.getIntExtra("level", 0);
                ((sjf) ((rjf) zc4.c)).getClass();
                long elapsedRealtime = SystemClock.elapsedRealtime();
                int intExtra2 = intent.getIntExtra("status", -1);
                if (!(intExtra2 == 2 || intExtra2 == 5)) {
                    z3 = false;
                }
                p01 = new p01(intExtra, elapsedRealtime, z3);
            }
            q01.e = p01;
            return;
        }
        throw new IllegalStateException("Is already initialized");
    }

    public final boolean s() {
        return this.z0 ? this.R0.b : this.y1;
    }

    public final void u(jme jme, String str) {
        this.S0.log(jme, str, (String) null);
    }

    public final void v(String str) {
        u(jme.app_event, str);
    }

    public final void w() {
        this.O1.getClass();
        aae j = bk3.j(this.w1);
        this.N1.c(j);
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("command", (Object) "accept-call");
            jSONObject.put("mediaSettings", (Object) tf6.r(j, false, false));
            this.x.h(new rp6(jSONObject), new oy0(this, 1));
        } catch (JSONException e) {
            throw new RuntimeException(e);
        }
    }

    public final void x() {
        this.T0.log("OKRTCCall", "sendMediaSettingsChange");
        this.O1.getClass();
        this.N1.b(bk3.j(this.w1));
    }

    public final int y(ue1 ue1, JSONObject jSONObject) {
        ye1 ye1;
        JSONObject jSONObject2 = jSONObject;
        xwd xwd = xwd.a;
        ef1 ef1 = this.n1;
        if (jSONObject2 == null) {
            ye1 = ef1.f(new v8b(ue1, new v9a(16), new v9a(16), new v9a(16), new v9a(16), new v9a(16), new v9a(16)), xwd);
        } else if ("ACCEPTED".equals(jSONObject2.optString("state"))) {
            return 2;
        } else {
            mc1 mc1 = this.J1;
            kz9 f = mc1.f(jSONObject, ue1, "onParticipantAddedToCall", mc1.h(xwd).a(), true);
            g8b v9a = new v9a(16);
            g8b v9a2 = new v9a(16);
            xga xga = new xga(1, tf6.s(jSONObject));
            xga xga2 = new xga(1, f);
            mz9 q = tf6.q(jSONObject);
            if (q != null) {
                v9a = new xga(1, q);
            }
            g8b g8b = v9a;
            xga xga3 = new xga(1, tf6.A(jSONObject));
            e51 m = tf6.m(jSONObject);
            if (m != null) {
                v9a2 = new xga(1, m);
            }
            ye1 = ef1.f(new v8b(ue1, xga, xga2, g8b, xga3, v9a2, new xga(1, this.R1.a.p(jSONObject2, xwd))), xwd);
        }
        this.r1.u(ye1, true);
        return 1;
    }

    public final void z(gm1 gm1) {
        this.T0.log("OKRTCCall", "handleTopologyCreated, " + gm1);
        pv0 pv0 = this.Q0;
        if (!pv0.b) {
            pv0.b();
        }
    }
}
