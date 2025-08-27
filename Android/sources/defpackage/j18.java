package defpackage;

import android.location.Location;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.TimeUnit;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.jvm.internal.IntCompanionObject;
import kotlin.jvm.internal.LongCompanionObject;
import kotlin.reflect.KProperty;
import ru.ok.android.externcalls.sdk.api.ApiProtocol;
import ru.ok.tamtam.android.prefs.PmsKey;
import ru.ok.tamtam.location.live.LiveLocationWorker;

/* renamed from: j18  reason: default package */
public final class j18 implements d18, c68 {
    public final taf A0;
    public final pwe B0;
    public final fn4 C0;
    public final gcf D0;
    public final hs7 E0;
    public or7 F0;
    public ao1 G0;
    public volatile long H0 = 0;
    public volatile s58 I0 = s58.x;
    public volatile long J0 = 0;
    public final jtb X;
    public final fa9 Y;
    public final r62 Z;
    public final dac a;
    public final dac b;
    public final dac c;
    public final dac o;
    public final kc3 v;
    public final rl v0;
    public final ConcurrentHashMap w = new ConcurrentHashMap();
    public final g68 w0;
    public final HashSet x = new HashSet();
    public final m95 x0;
    public final pq3 y;
    public final lfd y0;
    public final cc2 z;
    public final lfd z0;

    /* JADX WARNING: type inference failed for: r7v0, types: [java.lang.Object, kc3] */
    public j18(sv0 sv0, pq3 pq3, cc2 cc2, jtb jtb, fa9 fa9, r62 r62, rl rlVar, g68 g68, m95 m95, lfd lfd, lfd lfd2, taf taf, pwe pwe, fn4 fn4, gcf gcf, hs7 hs7) {
        lfd lfd3 = lfd;
        lfd lfd4 = lfd2;
        dac dac = new dac();
        this.a = dac;
        dac dac2 = new dac();
        this.b = dac2;
        dac dac3 = new dac();
        this.c = dac3;
        dac dac4 = new dac();
        this.o = dac4;
        ? obj = new Object();
        this.v = obj;
        this.y = pq3;
        this.z = cc2;
        this.X = jtb;
        this.Y = fa9;
        this.Z = r62;
        this.v0 = rlVar;
        this.w0 = g68;
        this.x0 = m95;
        this.y0 = lfd3;
        this.z0 = lfd4;
        this.A0 = taf;
        this.B0 = pwe;
        this.C0 = fn4;
        this.D0 = gcf;
        this.E0 = hs7;
        sv0 sv02 = sv0;
        lfd3.c(new uo5(22, (Object) this, (Object) sv0));
        lja s = dac.s(lfd4);
        e18 e18 = new e18(this, 1);
        n77 n77 = new n77(13);
        dj6 dj6 = m58.e;
        or7 or7 = new or7(e18, n77, dj6);
        s.a(or7);
        obj.a(or7);
        lja s2 = dac2.s(lfd4);
        or7 or72 = new or7(new e18(this, 0), new n77(10), dj6);
        s2.a(or72);
        obj.a(or72);
        lja s3 = dac3.s(lfd4);
        or7 or73 = new or7(new e18(this, 11), new n77(21), dj6);
        s3.a(or73);
        obj.a(or73);
        lja s4 = dac4.s(lfd3);
        or7 or74 = new or7(new e18(this, 7), new n77(19), dj6);
        s4.a(or74);
        obj.a(or74);
        e();
    }

    public static void a() {
        if (cvg.c(Thread.currentThread().getName(), "main")) {
            throw new RuntimeException("This thread is main!");
        }
    }

    public final void L(s58 s58) {
        j18 j18 = this;
        s58 s582 = s58;
        z68.c("j18", "On location: location = %s", s58);
        if (s582.o < c44.DEFAULT_ASPECT_RATIO) {
            ((uta) j18.x0).c(new Exception("Location accuracy can't be < 0"), true);
            return;
        }
        long currentTimeMillis = System.currentTimeMillis();
        Locale locale = Locale.ENGLISH;
        new StringBuilder("New location: location = ").append(s582);
        System.currentTimeMillis();
        Iterator it = j18.x.iterator();
        while (it.hasNext()) {
            rae.w(it.next());
            j18.y0.c(new gc(9));
        }
        long millis = TimeUnit.SECONDS.toMillis((long) ((ltb) j18.X).b.q());
        if (j18.H0 == 0 || !j18.I0.a()) {
            z68.c("j18", "lastLocationSendTime == 0 || !lastLocation.hasLocation()", new Object[0]);
            j18.I0 = s582;
        } else {
            long j = currentTimeMillis - j18.H0;
            if (j < millis) {
                z68.c("j18", "On location: Time delta %sms less then send timeout", Long.valueOf(j));
                StringBuilder sb = new StringBuilder("Have only ");
                sb.append(j);
                sb.append("ms after previous location. Ignore");
                System.currentTimeMillis();
                Iterator it2 = j18.x.iterator();
                while (it2.hasNext()) {
                    rae.w(it2.next());
                    j18.y0.c(new gc(9));
                }
                return;
            }
            taf taf = j18.A0;
            double d = j18.I0.a;
            double d2 = j18.I0.b;
            double d3 = s582.a;
            Locale locale2 = locale;
            double d4 = s582.b;
            ((be) taf).getClass();
            float[] fArr = new float[1];
            Location.distanceBetween(d, d2, d3, d4, fArr);
            float f = fArr[0];
            float f2 = s582.o;
            if (f < f2) {
                z68.c("j18", "New location is in accuracy radius. Distance = %f", Float.valueOf(f));
                String.format(locale2, "New location is in accuracy radius. Ignore it. Distance = %f accuracy = %f", new Object[]{Float.valueOf(f), Float.valueOf(f2)});
                System.currentTimeMillis();
                j18 = this;
                Iterator it3 = j18.x.iterator();
                while (it3.hasNext()) {
                    rae.w(it3.next());
                    j18.y0.c(new gc(9));
                }
                s582 = j18.I0;
            } else {
                j18 = this;
                j18.I0 = s582;
            }
        }
        s58 s583 = s582;
        z68.c("j18", "Send new location = %s", s583);
        j18.H0 = currentTimeMillis;
        new StringBuilder("Send location: location = ").append(s583);
        System.currentTimeMillis();
        Iterator it4 = j18.x.iterator();
        while (it4.hasNext()) {
            rae.w(it4.next());
            j18.y0.c(new gc(9));
        }
        jbd.c(j18.G0);
        long m = ((ltb) j18.X).a.m();
        long currentTimeMillis2 = System.currentTimeMillis();
        rl rlVar = j18.v0;
        fbf fbf = new fbf((x3b) null);
        fbf.f("lat", s583.a);
        fbf.f("lng", s583.b);
        double d5 = s583.c;
        if (d5 != 0.0d) {
            fbf.f("alt", d5);
        }
        float f3 = s583.o;
        if (f3 != c44.DEFAULT_ASPECT_RATIO) {
            fbf.f("epu", (double) f3);
        }
        float f4 = s583.v;
        if (f4 != c44.DEFAULT_ASPECT_RATIO) {
            fbf.f("hdn", (double) f4);
        }
        float f5 = s583.w;
        if (f5 != c44.DEFAULT_ASPECT_RATIO) {
            fbf.f("spd", (double) f5);
        }
        fce U = ((jna) rlVar).U(fbf, j18.z0);
        j18.D0.getClass();
        wbe wbe = new wbe(U, new ac2(4, millis, currentTimeMillis2), 2);
        gcf gcf = j18.D0;
        gcf.getClass();
        dx5 k = wbe.k(new ecf(gcf, 1, 0));
        ao1 ao1 = new ao1(3, new u52((Object) this, (Object) s583, m, 10), new n77(18));
        k.l(ao1);
        j18.G0 = ao1;
    }

    public final wh8 b(long j, String str) {
        return new wh8(2, new yia(new oa3(1, new wh8(2, this.z.a(), new v52(3, j, ((ltb) this.X).a.m() - 2000, str)), new q0a(0)), new zb2(0), 3).B(), new zb2(4));
    }

    public final wh8 c(long j) {
        return new wh8(2, new yia(new oa3(1, this.z.b(j, ((ltb) this.X).a.m()), new q0a(0)), new e18(this, 10), 0).B(), new n77(20));
    }

    /* JADX WARNING: Removed duplicated region for block: B:18:0x003e  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final defpackage.qq3 d(defpackage.ha9 r10) {
        /*
            r9 = this;
            u10 r9 = r10.j()
            if (r9 != 0) goto L_0x0009
            qq3 r9 = defpackage.qq3.e
            return r9
        L_0x0009:
            long r0 = r10.w
            java.lang.String r2 = r9.f
            v10 r3 = r9.i
            if (r3 == 0) goto L_0x002a
            boolean r4 = r10.q()
            if (r4 == 0) goto L_0x002a
            s58 r9 = r3.a
            vy r9 = defpackage.qq3.a(r9)
            long r3 = r3.b
            r9.c = r3
            r9.b = r0
            r9.o = r2
            qq3 r9 = r9.d()
            return r9
        L_0x002a:
            long r4 = r10.o
            if (r3 == 0) goto L_0x0038
            long r6 = r3.b
            int r10 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
            if (r10 <= 0) goto L_0x0038
            s58 r10 = r3.a
            r4 = r6
            goto L_0x003a
        L_0x0038:
            s58 r10 = r9.a
        L_0x003a:
            java.util.List r9 = r9.e
            if (r9 == 0) goto L_0x0058
            java.util.Iterator r9 = r9.iterator()
        L_0x0042:
            boolean r3 = r9.hasNext()
            if (r3 == 0) goto L_0x0058
            java.lang.Object r3 = r9.next()
            v10 r3 = (defpackage.v10) r3
            long r6 = r3.b
            int r8 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
            if (r8 <= 0) goto L_0x0042
            s58 r10 = r3.a
            r4 = r6
            goto L_0x0042
        L_0x0058:
            vy r9 = defpackage.qq3.a(r10)
            r9.c = r4
            r9.o = r2
            r9.b = r0
            qq3 r9 = r9.d()
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.j18.d(ha9):qq3");
    }

    public final void e() {
        z68.c("j18", "Run invalidate", new Object[0]);
        xa3 l = new qa3(0, new e18(this, 8)).l(this.z0);
        ao1 ao1 = new ao1(0, new n77(17), new b5(21, this));
        l.j(ao1);
        this.v.a(ao1);
    }

    public final boolean f(ha9 ha9) {
        u10 j;
        if (ha9.q() || ha9.Y == qe9.DELETED || (j = ha9.j()) == null) {
            return false;
        }
        return j.d - ((ltb) this.X).a.m() > 1000;
    }

    public final boolean g(ha9 ha9) {
        return !ha9.q() && ha9.j() != null && ha9.j().b > 0;
    }

    public final void h() {
        a();
        cud cud = ((ltb) this.X).b;
        cud.getClass();
        if (!cud.m(PmsKey.f55livelocationenabled, true)) {
            this.w0.c(this);
            this.w0.e(this);
            return;
        }
        List<ec2> list = (List) b(((ltb) this.X).a.s(), this.C0.a()).c(Collections.emptyList());
        HashSet hashSet = new HashSet();
        int i = 0;
        int i2 = 0;
        for (ec2 ec2 : list) {
            if (ec2.e == LongCompanionObject.MAX_VALUE) {
                i2++;
            } else {
                i++;
                hashSet.add(Long.valueOf(ec2.b));
            }
        }
        if (i > 0) {
            ipg ipg = (ipg) this.E0.get();
            Iterator it = hashSet.iterator();
            while (it.hasNext()) {
                long longValue = ((Number) it.next()).longValue();
                String i3 = wj6.i(longValue, "LIVE_LOCATION_WORKER-");
                fb5 fb5 = fb5.b;
                v3b v3b = (v3b) new v3b(LiveLocationWorker.class).setExpedited(t5b.a);
                Pair[] pairArr = {TuplesKt.to("workName", i3), TuplesKt.to(ApiProtocol.PARAM_CHAT_ID, Long.valueOf(longValue))};
                xv1 xv1 = new xv1(15);
                for (int i4 = 0; i4 < 2; i4++) {
                    Pair pair = pairArr[i4];
                    xv1.w(pair.getSecond(), (String) pair.getFirst());
                }
                KProperty[] kPropertyArr = ipg.n;
                ipg.b(i3, fb5, (w3b) ((v3b) ((v3b) v3b.setInputData(xv1.m())).addTag("LIVE_LOCATION_WORKER")).build(), false).v();
            }
            g68 g68 = this.w0;
            synchronized (g68.b) {
                try {
                    if (g68.b.isEmpty()) {
                        e68 e68 = (e68) g68.x.get();
                        e68.getClass();
                        y64.B(new d68(e68, 1));
                        z68.c("g68", "requestBalancedPowerUpdates", new Object[0]);
                    }
                    g68.b.add(this);
                } catch (Throwable th) {
                    throw th;
                }
            }
        } else {
            this.w0.c(this);
        }
        if (i2 > 0) {
            g68 g682 = this.w0;
            synchronized (g682.a) {
                try {
                    if (g682.a.isEmpty()) {
                        e68 e682 = (e68) g682.w.get();
                        e682.getClass();
                        y64.B(new d68(e682, 1));
                        z68.c("g68", "requestNoPowerUpdates", new Object[0]);
                    }
                    g682.a.add(this);
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        } else {
            this.w0.e(this);
        }
        if (list.isEmpty()) {
            System.currentTimeMillis();
            Iterator it2 = this.x.iterator();
            while (it2.hasNext()) {
                rae.w(it2.next());
                this.y0.c(new gc(9));
            }
            return;
        }
        ArrayList arrayList = new ArrayList(list.size());
        for (ec2 ec22 : list) {
            arrayList.add(Long.valueOf(ec22.b));
        }
        String.format(Locale.ENGLISH, "You start live location service chats %s = ", new Object[]{arrayList});
        System.currentTimeMillis();
        Iterator it3 = this.x.iterator();
        while (it3.hasNext()) {
            rae.w(it3.next());
            this.y0.c(new gc(9));
        }
    }

    public final void i(c18 c18, long j) {
        synchronized (this.w) {
            try {
                Set set = (Set) this.w.get(Long.valueOf(j));
                if (set == null) {
                    set = Collections.newSetFromMap(new ConcurrentHashMap());
                    this.w.put(Long.valueOf(j), set);
                }
                set.add(c18);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void j() {
        a32 G = this.Z.G(this.J0);
        if (G != null) {
            yia yia = new yia(new yia(new yia(jha.o(0, (long) (((ltb) this.X).b.q() / 2), TimeUnit.SECONDS, xfd.a()).x(this.z0), new e18(this, 2), 1), new e18(this, 3), 0), new e18(this, 4), 1);
            gcf gcf = this.D0;
            gcf.getClass();
            jha m = new yia(new yia(yia, new ecf(gcf, 1, 2), 6), new n77(14), 3).m(new n77(15), IntCompanionObject.MAX_VALUE);
            ib4 ib4 = new ib4(29, this, G);
            gga gga = m58.f;
            dj6 dj6 = m58.e;
            or7 or7 = new or7(gga, new e18(this, 5), dj6);
            Objects.requireNonNull(or7, "observer is null");
            try {
                m.a(new hia(or7, ib4, gga, dj6));
                this.F0 = or7;
            } catch (NullPointerException e) {
                throw e;
            } catch (Throwable th) {
                hd8.Z(th);
                n54.D(th);
                NullPointerException nullPointerException = new NullPointerException("Actually not, but can't throw other exceptions due to RS");
                nullPointerException.initCause(th);
                throw nullPointerException;
            }
        }
    }

    public final void k(long j) {
        cud cud = ((ltb) this.X).b;
        cud.getClass();
        if (!cud.m(PmsKey.f55livelocationenabled, true)) {
            jbd.c(this.F0);
        } else if (jbd.d(this.F0)) {
            z68.c("j18", "startRequestLocation chatId = %d", Long.valueOf(j));
            this.J0 = j;
            j();
        } else if (j != this.J0) {
            z68.c("j18", "startRequestLocation chatId = %d. Chat changed from = %d", Long.valueOf(j), Long.valueOf(this.J0));
            n();
            this.J0 = j;
            j();
        }
    }

    public final void l(long j) {
        oi8 h = new ai8(new wh8(2, this.z.a(), new ac2(0, j, ((ltb) this.X).a.m())), new zb2(0), 1).h(this.z0);
        oh8 oh8 = new oh8(new i18(this, j, 2), new c10(j, 27), m58.e);
        h.a(oh8);
        this.v.a(oh8);
    }

    public final void m(long j) {
        List list;
        jtb jtb = this.X;
        a32 G = this.Z.G(j);
        if (G != null) {
            List emptyList = Collections.emptyList();
            try {
                list = (List) this.z.c(j, ((ltb) jtb).a.s(), ((ltb) jtb).a.m()).c(Collections.emptyList());
            } catch (Throwable th) {
                z68.f("j18", "stopMyLocationSync failure!", th);
                list = emptyList;
            }
            cjf.u(list, new u52((Object) this, j, (Object) G, 9));
            h();
        }
    }

    public final void n() {
        jbd.c(this.F0);
        this.F0 = null;
        this.J0 = 0;
    }

    public final void o(c18 c18, long j) {
        synchronized (this.w) {
            try {
                Set set = (Set) this.w.get(Long.valueOf(j));
                if (set != null) {
                    set.remove(c18);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @oye
    public void onEvent(ke7 ke7) {
        this.a.d(Long.valueOf(ke7.c));
    }

    public final void w() {
    }

    @oye
    public void onEvent(twf twf) {
        this.a.d(Long.valueOf(twf.c));
    }

    @oye
    public void onEvent(w5b w5b) {
        this.a.d(Long.valueOf(w5b.o));
    }

    @oye
    public void onEvent(tv9 tv9) {
        pka x2 = new oa3(4, new mka(1, new g18(0, this, tv9)), new q0a(0)).x(this.z0);
        or7 or7 = new or7(new e18(this, 6), new n77(16), m58.e);
        x2.a(or7);
        this.v.a(or7);
    }

    @oye
    public void onEvent(kv9 kv9) {
        na3 na3;
        long j = kv9.c;
        int i = (j > 0 ? 1 : (j == 0 ? 0 : -1));
        jtb jtb = this.X;
        cc2 cc2 = this.z;
        if (i > 0 || kv9.o > 0) {
            na3 = new na3(3, new wh8(2, new yia(new oa3(1, new wh8(2, cc2.a(), new xb2(kv9.b, j, kv9.o, ((ltb) jtb).a.m())), new q0a(0)), new zb2(0), 3).B(), new fm0(26)), new f18(this, kv9, 0));
        } else {
            na3 = new na3(3, new wh8(2, new yia(new oa3(1, new wh8(2, cc2.a(), new dr1((Object) kv9.v, ((ltb) jtb).a.m(), 1)), new q0a(0)), new zb2(0), 3).B(), new zb2(2)), new f18(this, kv9, 1));
        }
        xa3 l = na3.l(this.z0);
        ao1 ao1 = new ao1(0, new n77(12), m58.e);
        l.j(ao1);
        this.v.a(ao1);
    }

    @oye
    public void onEvent(w88 w88) {
        r62 r62 = this.Z;
        Objects.requireNonNull(r62);
        pka x2 = new oa3(4, new mka(2, new h5(10, r62)), new q0a(0)).x(this.z0);
        or7 or7 = new or7(new e18(this, 12), new n77(9), m58.e);
        x2.a(or7);
        this.v.a(or7);
    }

    @oye
    public void onEvent(fb2 fb2) {
        this.b.d(Long.valueOf(fb2.b));
    }

    @oye
    public void onEvent(xy2 xy2) {
        for (Long l : xy2.b) {
            l.longValue();
            this.b.d(l);
        }
    }

    @oye
    public void onEvent(hjf hjf) {
        this.H0 = 0;
    }
}
