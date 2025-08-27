package defpackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import java.util.regex.Matcher;
import org.json.JSONException;
import org.json.JSONObject;
import org.webrtc.NetworkChangeDetector;
import org.webrtc.NetworkMonitor;
import org.webrtc.SessionDescription;

/* renamed from: ktd  reason: default package */
public final class ktd extends gm1 implements n9e, NetworkMonitor.NetworkObserver {
    public final gtb B0;
    public final fl4 C0;
    public final o9e D0;
    public long E0;
    public long F0;
    public final mvf G0;
    public final t9a H0 = new t9a(21);
    public final ko4 I0;

    public ktd(jtd jtd) {
        super(jtd.h, jtd.g, jtd.m, jtd.o, jtd.p, jtd.q, jtd.b, jtd.v, jtd.w, jtd.A);
        R(this + " ctor");
        o9e o9e = jtd.i;
        this.D0 = o9e;
        this.C0 = jtd.c;
        this.B0 = jtd.r;
        o9e.k.add(this);
        mvf mvf = new mvf(jtd, this);
        this.G0 = mvf;
        this.I0 = new ko4(jtd.o, mvf);
        NetworkMonitor.getInstance().addObserver(this);
    }

    public final Map A() {
        int i;
        ihd ihd = this.G0.z0.b;
        if (ihd == null) {
            return null;
        }
        HashMap hashMap = new HashMap();
        Iterator it = ihd.a.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            bug bug = (bug) entry.getValue();
            if (bug != null) {
                fa4 fa4 = bug.g;
                long j = (long) bug.l.get();
                long j2 = (long) bug.m.get();
                long j3 = (long) bug.n.get();
                long j4 = (long) bug.o.get();
                Iterator it2 = it;
                HashMap hashMap2 = hashMap;
                long j5 = (long) bug.p.get();
                long j6 = (long) bug.q.get();
                long j7 = (long) bug.r.get();
                long j8 = (long) bug.s.get();
                long j9 = (long) bug.t.get();
                long j10 = (long) bug.y.get();
                long j11 = (long) bug.z.get();
                zjf zjf = bug.u;
                Map.Entry entry2 = entry;
                TimeUnit timeUnit = TimeUnit.MILLISECONDS;
                long j12 = j11;
                TimeUnit timeUnit2 = TimeUnit.NANOSECONDS;
                double convert = (double) timeUnit.convert((long) zjf.b.b, timeUnit2);
                double convert2 = (double) timeUnit.convert((long) bug.v.b.b, timeUnit2);
                double convert3 = (double) timeUnit.convert((long) bug.w.b.b, timeUnit2);
                double convert4 = (double) timeUnit.convert((long) bug.x.b.b, timeUnit2);
                if (fa4 == null || (i = fa4.w) == 1 || i == 2) {
                    if (fa4 != null) {
                        fa4.v0.get();
                    }
                    if (fa4 != null) {
                        fa4.w0.get();
                    }
                    jhd jhd = r5;
                    jhd jhd2 = new jhd(j, j2, j3, j4, j5, j6, j7, j8, j9, j10, j12, convert, convert2, convert3, convert4, (hf6) bug.A.o);
                    hashMap = hashMap2;
                    hashMap.put((ue1) entry2.getKey(), jhd);
                    it = it2;
                } else {
                    throw null;
                }
            }
        }
        return hashMap;
    }

    public final void C(xne xne) {
        pbb pbb = new pbb(16, this, xne);
        mvf mvf = this.G0;
        if (mvf.z0 != null) {
            fbb fbb = mvf.z0;
            fbb.getClass();
            fbb.i("getStats.legacy", new yug(fbb, new zab(2, fbb, pbb), 1));
        }
    }

    public final String D() {
        return "ServerCallTopology";
    }

    public final void E(ue1 ue1, List list, boolean z, sy0 sy0) {
        try {
            this.D0.h(tf6.w(ue1, list, z), sy0);
        } catch (JSONException unused) {
            this.w.reportException("ServerCallTopology", "server.topology.send.grantRoles", new Exception("server.topology.send.grantRoles"));
        }
    }

    public final void G() {
        List list;
        int i;
        StringBuilder sb = new StringBuilder("handleStateChanged, ");
        sb.append(this);
        sb.append(", state = ");
        String B = gm1.B(1);
        sb.append(B);
        R(sb.toString());
        if (I()) {
            v("enable processing signaling replies in " + B + " state");
            this.D0.k.add(this);
            Integer num = null;
            this.v.log(jme.app_event, "rtc.disable.hw.vpx", (String) null);
            mvf mvf = this.G0;
            if (I()) {
                if (mvf.x0) {
                    mvf.x.i(tf6.a((JSONObject) null, "request-realloc"));
                } else {
                    gtb gtb = mvf.y;
                    voc voc = mvf.w;
                    te1 te1 = mvf.a;
                    mvf.w.log("UnifiedPeerConnection", "sendRequestAllocConsumer," + mvf + ", sdp=null");
                    try {
                        int intValue = ((Number) mvf.Y.a.getValue()).intValue();
                        int i2 = te1.g;
                        if (i2 > 0) {
                            voc.log("PeerConnectionWrapperBase", "video tracks count enabled: " + i2);
                            i = i2;
                        } else {
                            voc.log("PeerConnectionWrapperBase", "video tracks count disabled");
                            i = 0;
                        }
                        o9e o9e = mvf.x;
                        if (gtb.a.contains("estimatedPerformanceIndex")) {
                            num = Integer.valueOf(gtb.a.getInt("estimatedPerformanceIndex", 0));
                        }
                        Integer num2 = num;
                        te1.A.a.getClass();
                        o9e.i(tf6.v(intValue, num2, te1.g > 0 ? 2 : 1, te1.e, te1.f, te1.h, te1.i, fbb.A().b, mvf.Z != null, i, te1.x, te1.u, te1.v));
                    } catch (JSONException unused) {
                        voc.reportException("PeerConnectionWrapperBase", "server.topology.send.alloc.consumer", new Exception("server.topology.send.alloc.consumer"));
                    }
                }
                if (!mvf.z0.E()) {
                    mvf.z.e.c = false;
                    if (!mvf.z0.E()) {
                        fbb fbb = mvf.z0;
                        if (mvf.a.d) {
                            ktd ktd = mvf.v0;
                            ktd.getClass();
                            list = Collections.unmodifiableList(new ArrayList(ktd.z));
                        } else {
                            list = Collections.emptyList();
                        }
                        fbb.y(list);
                        return;
                    }
                    return;
                }
                return;
            }
            mvf.getClass();
            return;
        }
        U("disable processing signaling replies in " + B + " state");
        this.D0.k.remove(this);
    }

    public final void K(ue1 ue1, zwd zwd, boolean z, ty0 ty0) {
        try {
            this.D0.h(tf6.x(ue1, zwd, z), ty0);
        } catch (JSONException unused) {
            this.w.reportException("ServerCallTopology", "server.topology.send.pinParticipant", new Exception("server.topology.send.pinParticipant"));
        }
    }

    public final void L() {
        U(this + " release");
        NetworkMonitor.getInstance().removeObserver(this);
        this.a.removeCallbacksAndMessages((Object) null);
        this.D0.k.remove(this);
        mvf mvf = this.G0;
        mvf.j();
        mvf.z0.p(true);
        super.L();
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v10, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v8, resolved type: lie} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void M(defpackage.xoc r8) {
        /*
            r7 = this;
            java.util.List r0 = r8.c
            java.util.ArrayList r1 = new java.util.ArrayList
            int r2 = r0.size()
            r3 = 2
            int r2 = r2 / r3
            r1.<init>(r2)
            java.util.Iterator r0 = r0.iterator()
        L_0x0011:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L_0x002c
            java.lang.Object r2 = r0.next()
            nie r2 = (defpackage.nie) r2
            int r4 = r2.b
            r5 = 1
            if (r4 != r5) goto L_0x0011
            int r4 = r2.a
            if (r4 != r3) goto L_0x0011
            lie r2 = (defpackage.lie) r2
            r1.add(r2)
            goto L_0x0011
        L_0x002c:
            boolean r0 = r1.isEmpty()
            if (r0 != 0) goto L_0x0097
            r0 = 0
            java.lang.Object r2 = r1.get(r0)
            lie r2 = (defpackage.lie) r2
            uw1 r8 = r8.c()
            if (r8 == 0) goto L_0x0050
            java.util.ArrayList r8 = defpackage.f6e.H(r1, r8)
            boolean r1 = r8.isEmpty()
            if (r1 != 0) goto L_0x0050
            java.lang.Object r8 = r8.get(r0)
            r2 = r8
            lie r2 = (defpackage.lie) r2
        L_0x0050:
            te1 r8 = r7.o
            r8.getClass()
            long r0 = r2.o
            long r3 = r7.E0
            int r8 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r8 != 0) goto L_0x0065
            long r3 = r2.p
            long r5 = r7.F0
            int r8 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r8 == 0) goto L_0x0097
        L_0x0065:
            long r2 = r2.p
            r4 = 0
            int r8 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r8 <= 0) goto L_0x0097
            int r8 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r8 <= 0) goto L_0x0097
            r7.E0 = r0
            r7.F0 = r2
            q2d r8 = new q2d
            r8.<init>(r2, r0)
            mvf r0 = r7.G0
            fbb r0 = r0.z0
            q9d r0 = r0.B()
            nqd r1 = new nqd
            r2 = 2
            r1.<init>(r2, r7)
            o9d r7 = new o9d
            r7.<init>((defpackage.n9d) r8)
            r7.c = r1
            o9d r8 = new o9d
            r8.<init>((defpackage.o9d) r7)
            r0.d(r8)
        L_0x0097:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ktd.M(xoc):void");
    }

    public final void N(boolean z) {
        this.G0.z0.B().d(new o9d(new o9d((n9d) new z2d(z))));
        mvf mvf = this.G0;
        mvf.D0 = z;
        mvf.z0.X = mvf.D0;
    }

    public final void O(one one2) {
        mvf mvf = this.G0;
        if (mvf.z0 != null) {
            fbb fbb = mvf.z0;
            fbb.getClass();
            fbb.i("getStats.new", new yug(fbb, new ok3(3, one2), 1));
        }
    }

    public final void Q(ln1 ln1, List list) {
        mvf mvf = this.G0;
        if (mvf.z0.E()) {
            ue1 ue1 = ln1.b;
            mvf.z0.o1.p("video-" + ue1.c(), ln1, list);
        }
    }

    public final void S(List list) {
        R("updateDisplayLayouts, " + this);
        this.I0.a(list);
        this.H0.getClass();
        this.G0.k(t9a.f(list));
    }

    public final void T(kbb kbb) {
        mvf mvf = this.G0;
        mvf.w0 = kbb;
        if (mvf.z0 != null) {
            mvf.z0.I(mvf.w0);
        }
    }

    public final void V() {
        this.G0.a();
    }

    public final void a(e4 e4Var) {
        mvf mvf = this.G0;
        z7g z7g = (z7g) e4Var.b;
        if (mvf.z0 != null) {
            fbb fbb = mvf.z0;
            fbb.getClass();
            Integer valueOf = Integer.valueOf(z7g.c);
            h44 h44 = fbb.n1;
            if (!z7g.equals((z7g) ((Map) ((ykb) h44.i).b).get(valueOf))) {
                ykb ykb = (ykb) h44.i;
                ykb.getClass();
                ((Map) ykb.b).put(Integer.valueOf(z7g.c), z7g);
                fbb.J0.log("PCRTCClient", "updateVideoQuality, " + fbb + " update=" + z7g);
                fbb.i("updateVideoQuality", new yug(fbb, new zab(1, fbb, z7g), 1));
            }
        }
    }

    public final void j(mz9 mz9) {
        mvf mvf = this.G0;
        mvf.z0.s(mz9);
        mvf.G0 = mz9;
    }

    public final void k(JSONObject jSONObject) {
        String str;
        List list;
        String string = jSONObject.getString("notification");
        if ("producer-updated".equals(string)) {
            mvf mvf = this.G0;
            mvf.getClass();
            mvf.w.log("UnifiedPeerConnection", "handleProducerUpdatedNotify, " + mvf + " " + jSONObject);
            String string2 = jSONObject.getString("sessionId");
            if (!mvf.C0 || !mvf.F0.contains(string2)) {
                String string3 = jSONObject.getString("description");
                SessionDescription sessionDescription = new SessionDescription(SessionDescription.Type.OFFER, string3);
                Matcher matcher = mvf.H0.matcher(string3);
                HashSet hashSet = mvf.X;
                hashSet.clear();
                while (matcher.find()) {
                    hashSet.add(matcher.group(1));
                }
                if (!mvf.C0 || (str = mvf.E0) == null || str.equals(string2)) {
                    if (mvf.z0.l1 && mvf.A0 != null) {
                        mvf.w.log("UnifiedPeerConnection", "producer is stable but offerForProducer exists");
                        mvf.A0 = null;
                    }
                    if (mvf.z0.l1) {
                        mvf.w.log("UnifiedPeerConnection", "set remote sdp=" + sessionDescription.type.canonicalForm() + " to " + mvf.z0);
                        mvf.z0.J(sessionDescription);
                    } else {
                        mvf.w.log("UnifiedPeerConnection", mvf.z0 + " is NOT STABLE, postpone set remote " + sessionDescription.type.canonicalForm() + " to it");
                        mvf.A0 = sessionDescription;
                    }
                } else {
                    mvf.F0.add(mvf.E0);
                    mvf.w.log("UnifiedPeerConnection", mvf.z0 + " is JUST RECREATED, postpone set remote " + sessionDescription.type.canonicalForm() + " to it");
                    mvf.A0 = sessionDescription;
                    mvf.j();
                    mvf.a();
                    if (mvf.z0 != null) {
                        mvf.z0.I(mvf.w0);
                    }
                    mvf.z.e.c = false;
                    if (!mvf.z0.E()) {
                        fbb fbb = mvf.z0;
                        if (mvf.a.d) {
                            ktd ktd = mvf.v0;
                            ktd.getClass();
                            list = Collections.unmodifiableList(new ArrayList(ktd.z));
                        } else {
                            list = Collections.emptyList();
                        }
                        fbb.y(list);
                    }
                }
                mvf.E0 = string2;
            } else {
                mvf.w.log("UnifiedPeerConnection", a81.m("producer-updated contains expired sessionId: ", string2));
            }
            R("resendDisplayLayouts, " + this);
            List list2 = this.I0.c;
            this.H0.getClass();
            this.G0.k(t9a.f(list2));
            ko4 ko4 = this.I0;
            ko4.e = true;
            ko4.a(ko4.c);
        } else if ("consumer-answered".equals(string)) {
            this.G0.getClass();
        }
    }

    public final void onActiveParticipantUpdated(qz0 qz0) {
        onActiveParticipantsRemoved(new pz0(qz0.a, Collections.emptyList()));
    }

    public final void onActiveParticipantsAdded(mz0 mz0) {
    }

    public final void onActiveParticipantsChanged(nz0 nz0) {
    }

    public final void onActiveParticipantsDeAnonimized(oz0 oz0) {
    }

    /* JADX WARNING: type inference failed for: r0v8, types: [java.lang.Object, ntd] */
    public final void onActiveParticipantsRemoved(pz0 pz0) {
        R("onCallParticipantsRemoved, " + pz0.a.size());
        for (ye1 ye1 : pz0.a) {
            ue1 ue1 = ye1.a;
            if (ue1 != null) {
                mvf mvf = this.G0;
                if (mvf.z0.E()) {
                    mvf.z0.o1.e(ue1, "video-" + ue1.c());
                }
            }
            ue1 ue12 = ye1.a;
            if (ue12 != null) {
                ko4 ko4 = this.I0;
                Set<ln1> set = (Set) ko4.d.get(ue12);
                if (set == null) {
                    set = new HashSet<>();
                }
                l15 l15 = new l15();
                l15.a = ue12;
                l15.b = a9g.a;
                set.add(l15.e());
                l15 l152 = new l15();
                l152.a = ue12;
                l152.b = a9g.b;
                set.add(l152.e());
                ? obj = new Object();
                obj.a = true;
                ArrayList arrayList = new ArrayList();
                for (ln1 otd : set) {
                    arrayList.add(new otd(otd, obj));
                }
                kwf kwf = new kwf(arrayList, false);
                q9d B = ((mvf) ko4.b).z0.B();
                jo4 jo4 = new jo4(ko4, 2);
                jo4 jo42 = new jo4(ko4, 3);
                o9d o9d = new o9d((n9d) kwf);
                o9d.c = jo4;
                o9d.d = jo42;
                B.d(new o9d(o9d));
            }
        }
    }

    public final void onConnectionTypeChanged(NetworkChangeDetector.ConnectionType connectionType) {
        R("onConnectionTypeChanged, " + this + ", type=" + connectionType);
        if (NetworkMonitor.isOnline()) {
            this.a.post(new itd(this, 0));
        }
    }

    public final Runnable w() {
        this.o.b.getClass();
        return new itd(this, 1);
    }

    public final xnf y() {
        return xnf.o;
    }
}
