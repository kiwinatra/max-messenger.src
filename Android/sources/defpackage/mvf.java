package defpackage;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.regex.Pattern;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.webrtc.IceCandidate;
import org.webrtc.PeerConnection;
import org.webrtc.SessionDescription;

/* renamed from: mvf  reason: default package */
public final class mvf implements jbb, ebb {
    public static final Pattern H0 = Pattern.compile("a=ssrc:(\\d+)");
    public SessionDescription A0;
    public boolean B0;
    public final boolean C0;
    public boolean D0;
    public String E0;
    public final CopyOnWriteArraySet F0;
    public mz9 G0;
    public final HashSet X = new HashSet();
    public final g43 Y;
    public final hr6 Z;
    public final te1 a;
    public final ArrayList b;
    public final ArrayList c;
    public final ArrayList o;
    public final yoc v;
    public final ktd v0;
    public final voc w;
    public kbb w0;
    public final o9e x;
    public final boolean x0;
    public final gtb y;
    public final dbb y0;
    public final t6e z;
    public volatile fbb z0;

    public mvf(jtd jtd, ktd ktd) {
        te1 te1 = jtd.m;
        this.a = te1;
        this.b = jtd.j;
        this.c = jtd.k;
        this.o = jtd.l;
        this.v0 = ktd;
        yoc yoc = jtd.p;
        this.v = yoc;
        voc voc = jtd.o;
        this.w = voc;
        this.x = jtd.i;
        this.y = jtd.r;
        t6e t6e = jtd.a;
        this.z = t6e;
        this.Z = jtd.u;
        this.Y = jtd.n;
        this.F0 = new CopyOnWriteArraySet();
        this.x0 = jtd.s;
        this.C0 = jtd.m.m;
        dbb dbb = new dbb();
        dbb.a = t6e;
        dbb.b = jtd.b;
        dbb.q = 0;
        dbb.c = jtd.d;
        dbb.e = jtd.e;
        dbb.f = yoc;
        dbb.g = voc;
        boolean z2 = true;
        dbb.h = true;
        dbb.i = true;
        dbb.d = te1;
        dbb.j = te1.h;
        dbb.m = te1.i;
        dbb.s = te1.g <= 0 ? false : z2;
        dbb.w = jtd.t;
        te1 te12 = jtd.m;
        dbb.n = te12.p;
        dbb.o = te12.q;
        dbb.p = te12.r;
        hr6 hr6 = jtd.u;
        dbb.x = new kk(hr6, (ic3) hr6.c, 2);
        hr6 hr62 = jtd.u;
        dbb.y = new lj(hr62, (ic3) hr62.c);
        dbb.z = ji.a;
        dbb.v = te1.B.g;
        dbb.u = false;
        dbb.t = fbb.A().b;
        dbb.A = jtd.x;
        dbb.k = jtd.m.x;
        dbb.B = jtd.y;
        dbb.C = jtd.z;
        dbb.D = jtd.A;
        this.y0 = dbb;
        a();
        if (this.z0 != null) {
            this.z0.I(this.w0);
        }
    }

    public final void a() {
        dbb dbb = this.y0;
        dbb.l = this.D0;
        this.z0 = dbb.a();
        this.z0.Y0 = this;
        Iterator it = this.b.iterator();
        while (it.hasNext()) {
            r9d r9d = (r9d) it.next();
            o5h o5h = this.z0.B().n;
            if (r9d != null) {
                ((CopyOnWriteArrayList) o5h.b).add(r9d);
            } else {
                o5h.getClass();
                throw new IllegalArgumentException("Illegal 'listener' value: null");
            }
        }
        Iterator it2 = this.c.iterator();
        while (it2.hasNext()) {
            u9d u9d = (u9d) it2.next();
            n09 n09 = this.z0.O0;
            if (n09 == null) {
                throw new IllegalStateException("Notifications receiver is not enabled");
            } else if (u9d != null) {
                ((CopyOnWriteArrayList) n09.a).add(u9d);
            } else {
                throw new IllegalArgumentException("Illegal 'listener' value: null");
            }
        }
        Iterator it3 = this.o.iterator();
        while (it3.hasNext()) {
            py0 py0 = (py0) it3.next();
            if (this.z0.c != null) {
                ((CopyOnWriteArrayList) this.z0.c.o).add(py0);
            }
        }
        fbb fbb = this.z0;
        fbb.U0 = null;
        fbb.V0 = false;
        fbb.Z0 = null;
        fbb.a1 = null;
        fbb.b1 = null;
        fbb.d1 = null;
        fbb.i("createPeerConnectionFactoryInternal", new vab(fbb, 2));
    }

    public final void b(fbb fbb, SessionDescription sessionDescription) {
        if (sessionDescription.type != SessionDescription.Type.OFFER) {
            return;
        }
        if (!fbb.l1) {
            this.z0.w();
            return;
        }
        throw new IllegalStateException();
    }

    public final void c(fbb fbb) {
        this.w.log("UnifiedPeerConnection", "onPeerConnectionRenegotiationNeeded, " + fbb);
    }

    public final void d(fbb fbb) {
        if (this.z0.E()) {
            ktd ktd = this.v0;
            ktd.getClass();
            ktd.R("resendDisplayLayouts, " + ktd);
            ko4 ko4 = ktd.I0;
            List list = ko4.c;
            ktd.H0.getClass();
            ktd.G0.k(t9a.f(list));
            ko4.e = true;
            ko4.a(ko4.c);
            fm1 fm1 = ktd.w0;
            if (fm1 != null) {
                ((hz0) fm1).z(ktd);
            }
        }
        if (this.z0.l1 && this.A0 != null) {
            this.w.log("UnifiedPeerConnection", "apply postponed remote sdp=" + this.A0.type.canonicalForm() + " to just created " + fbb);
            this.z0.J(this.A0);
            this.A0 = null;
        }
        this.z0.s(this.G0);
    }

    public final void e() {
        this.w.reportException("PeerConnectionWrapperBase", "server.topology.create.sdp", new Exception("server.topology.create.sdp"));
    }

    public final void f(String str) {
        this.w.log("UnifiedPeerConnection", "audio-mix enabled");
        ktd ktd = this.v0;
        ktd.getClass();
        if (str != null && str.endsWith("audio-mix") && ktd.w0 != null) {
            ktd.v("audio-mix enabled");
        }
    }

    public final void g() {
        this.w.reportException("PeerConnectionWrapperBase", "server.topolog.set.sdp", new Exception("server.topolog.set.sdp"));
    }

    public final void h(fbb fbb, String str) {
        ue1 ue1;
        ktd ktd = this.v0;
        ktd.getClass();
        ktd.R("onPeerConnectionRemoteVideoTrackAdded, " + ktd + ", client=" + fbb + ", track=" + str);
        ue1 c0 = tf6.c0(str);
        ye1 z2 = c0 != null ? ktd.z(c0) : null;
        if (z2 == null || (ue1 = z2.a) == null) {
            ktd.w.log("ServerCallTopology", "Cant find participant  for " + str + " video track, " + fbb);
            return;
        }
        fl4 fl4 = ktd.C0;
        if (fl4.isEnabled()) {
            Map remoteVideoRenderers = fl4.getRemoteVideoRenderers(ue1);
            for (ln1 ln1 : remoteVideoRenderers.keySet()) {
                List list = (List) remoteVideoRenderers.get(ln1);
                if (list != null) {
                    fbb.o1.p(str, ln1, list);
                }
            }
        }
    }

    public final void i(fbb fbb, IceCandidate[] iceCandidateArr) {
    }

    public final void j() {
        this.z0.Y0 = null;
        Iterator it = this.b.iterator();
        while (it.hasNext()) {
            r9d r9d = (r9d) it.next();
            o5h o5h = this.z0.B().n;
            if (r9d != null) {
                ((CopyOnWriteArrayList) o5h.b).remove(r9d);
            } else {
                o5h.getClass();
                throw new IllegalArgumentException("Illegal 'listener' value: null");
            }
        }
        Iterator it2 = this.c.iterator();
        while (it2.hasNext()) {
            u9d u9d = (u9d) it2.next();
            n09 n09 = this.z0.O0;
            if (n09 == null) {
                throw new IllegalStateException("Notifications receiver is not enabled");
            } else if (u9d != null) {
                ((CopyOnWriteArrayList) n09.a).remove(u9d);
            } else {
                throw new IllegalArgumentException("Illegal 'listener' value: null");
            }
        }
        Iterator it3 = this.o.iterator();
        while (it3.hasNext()) {
            py0 py0 = (py0) it3.next();
            if (this.z0.c != null) {
                ((CopyOnWriteArrayList) this.z0.c.o).remove(py0);
            }
        }
        this.z0.p(false);
    }

    public final void k(z3a z3a) {
        ihd ihd = this.z0.b;
        if (ihd != null && !ihd.f) {
            ihd.h = Collections.unmodifiableSet((Set) z3a.b);
            Iterator it = ihd.a.entrySet().iterator();
            while (it.hasNext()) {
                Map.Entry entry = (Map.Entry) it.next();
                if (!ihd.h.contains(entry.getKey())) {
                    bug bug = (bug) entry.getValue();
                    if (bug != null) {
                        bug.a();
                    }
                    it.remove();
                }
            }
        }
    }

    public final void l(fbb fbb, PeerConnection.SignalingState signalingState) {
        if (signalingState == PeerConnection.SignalingState.STABLE && this.A0 != null) {
            this.w.log("UnifiedPeerConnection", "apply postponed remote sdp=" + this.A0.type.canonicalForm() + " to " + fbb);
            this.z0.J(this.A0);
            this.A0 = null;
        }
    }

    public final void m(fbb fbb, IceCandidate iceCandidate) {
    }

    public final void n(fbb fbb, SessionDescription sessionDescription) {
        SessionDescription.Type type = sessionDescription.type;
        SessionDescription.Type type2 = SessionDescription.Type.ANSWER;
        voc voc = this.w;
        if (type == type2) {
            voc.log("UnifiedPeerConnection", "sendRequestAcceptProducer," + this + ", sdp=" + sessionDescription.type.canonicalForm());
            try {
                o9e o9e = this.x;
                HashSet hashSet = this.X;
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("description", (Object) sessionDescription.description);
                if (!hashSet.isEmpty()) {
                    jSONObject.put("ssrcs", (Object) new JSONArray((Collection<?>) hashSet));
                }
                o9e.i(tf6.a(jSONObject, "accept-producer"));
            } catch (JSONException unused) {
                voc.reportException("PeerConnectionWrapperBase", "server.topology.send.accept.producer", new Exception("server.topology.send.accept.producer"));
            }
        } else {
            voc.reportException("UnifiedPeerConnection", "server.topology.producer.create.local.sdp", new Exception("answer.expected"));
        }
    }

    public final void o(fbb fbb, PeerConnection.IceConnectionState iceConnectionState) {
        this.w.log("UnifiedPeerConnection", "onPeerConnectionIceConnectionChange, " + fbb + " state=" + iceConnectionState);
        ktd ktd = this.v0;
        if (ktd.I()) {
            if (iceConnectionState == PeerConnection.IceConnectionState.FAILED) {
                if (this.C0) {
                    this.F0.add(this.E0);
                    this.x.i(tf6.a((JSONObject) null, "request-realloc"));
                } else {
                    this.B0 = true;
                }
            }
            fm1 fm1 = ktd.w0;
            if (fm1 != null) {
                ((hz0) fm1).A(ktd, iceConnectionState);
            }
        }
    }

    public final void r(fbb fbb) {
        ktd ktd = this.v0;
        sp5 sp5 = ktd.x;
        if (sp5 != null && !sp5.f.b && !sp5.d.b && !sp5.e.b) {
            ktd.O(new em1(sp5));
        }
    }
}
