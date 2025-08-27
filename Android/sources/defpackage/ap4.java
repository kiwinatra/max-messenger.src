package defpackage;

import android.content.Context;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import kotlin.Pair;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.webrtc.IceCandidate;
import org.webrtc.NetworkChangeDetector;
import org.webrtc.NetworkMonitor;
import org.webrtc.PeerConnection;
import org.webrtc.SessionDescription;

/* renamed from: ap4  reason: default package */
public final class ap4 extends gm1 implements n9e, ebb, NetworkMonitor.NetworkObserver {
    public final hr6 B0;
    public final Context C0;
    public final o9e D0;
    public final fl4 E0;
    public final t6e F0;
    public final ExecutorService G0;
    public final HashMap H0 = new HashMap();
    public final HashMap I0 = new HashMap();
    public final HashMap J0 = new HashMap();
    public final he K0;
    public final HashMap L0 = new HashMap();
    public final HashMap M0 = new HashMap();
    public final wie N0;
    public final rjf O0;
    public final yo4 P0 = new yo4(this, 1);
    public final boolean Q0;

    public ap4(zo4 zo4) {
        super(zo4.h, zo4.g, zo4.j, zo4.k, zo4.l, zo4.m, zo4.b, zo4.q, zo4.r, (lgd) null);
        R(this + " ctor");
        this.N0 = zo4.o;
        this.O0 = zo4.s;
        this.K0 = new he(zo4.k);
        this.C0 = zo4.e;
        o9e o9e = zo4.i;
        this.D0 = o9e;
        this.F0 = zo4.a;
        this.G0 = zo4.d;
        this.E0 = zo4.c;
        this.Q0 = zo4.n;
        this.B0 = zo4.p;
        o9e.k.add(this);
        for (ye1 ye1 : this.Y.i()) {
            this.H0.put(ye1.a, W());
        }
        gg0 gg0 = this.o.A.b;
        NetworkMonitor.getInstance().addObserver(this);
    }

    public static ue1 V(fbb fbb, HashMap hashMap) {
        for (Map.Entry entry : hashMap.entrySet()) {
            if (entry.getValue() == fbb) {
                return (ue1) entry.getKey();
            }
        }
        return null;
    }

    public final void C(xne xne) {
        ur9.e();
        for (Map.Entry entry : this.I0.entrySet()) {
            fbb fbb = (fbb) entry.getValue();
            u00 u00 = new u00((Object) this, (Object) (ue1) entry.getKey(), (Object) xne, 7);
            fbb.getClass();
            fbb.i("getStats.legacy", new yug(fbb, new zab(2, fbb, u00), 1));
        }
    }

    public final String D() {
        return "DirectCallTopology";
    }

    public final void E(ue1 ue1, List list, boolean z, sy0 sy0) {
        try {
            this.D0.h(tf6.w(ue1, list, z), sy0);
        } catch (JSONException unused) {
            this.w.logException("DirectCallTopology", "direct.topology.send.grantRoles", new Exception("direct.topology.send.grantRoles"));
        }
    }

    public final void F() {
        v("handleIceApplyPermissionChanged, " + this + ", isPermitted=true");
        he heVar = this.K0;
        heVar.b = true;
        if (I()) {
            for (Map.Entry entry : this.I0.entrySet()) {
                ye1 z = z((ue1) entry.getKey());
                if (z != null) {
                    heVar.b(z, (fbb) entry.getValue());
                }
            }
        }
    }

    public final void G() {
        StringBuilder sb = new StringBuilder("handleStateChanged, ");
        sb.append(this);
        sb.append(", state=");
        String B = gm1.B(1);
        sb.append(B);
        R(sb.toString());
        boolean I = I();
        o9e o9e = this.D0;
        if (I) {
            this.w.log("DirectCallTopology", "enable processing signaling replies in " + B + " state");
            o9e.k.add(this);
            T(this.z0);
        } else {
            U("disable processing signaling replies in " + B + " state");
            o9e.k.remove(this);
        }
        Z();
    }

    public final void K(ue1 ue1, zwd zwd, boolean z, ty0 ty0) {
        try {
            this.D0.h(tf6.x(ue1, zwd, z), ty0);
        } catch (JSONException unused) {
            this.w.logException("DirectCallTopology", "direct.topology.send.pinParticipant", new Exception("direct.topology.send.pinParticipant"));
        }
    }

    public final void L() {
        U(this + " release");
        NetworkMonitor.getInstance().removeObserver(this);
        this.a.removeCallbacksAndMessages((Object) null);
        this.D0.k.remove(this);
        HashMap hashMap = this.H0;
        for (fbb fbb : hashMap.values()) {
            fbb.Y0 = null;
            fbb.p(true);
        }
        HashMap hashMap2 = this.I0;
        for (fbb fbb2 : hashMap2.values()) {
            fbb2.Y0 = null;
            fbb2.p(true);
        }
        hashMap.clear();
        hashMap2.clear();
        this.J0.clear();
        ((HashMap) this.K0.c).clear();
        this.L0.clear();
        this.M0.clear();
        super.L();
    }

    public final void O(one one2) {
        ur9.e();
        for (Map.Entry value : this.I0.entrySet()) {
            fbb fbb = (fbb) value.getValue();
            fbb.getClass();
            fbb.i("getStats.new", new yug(fbb, new ok3(3, one2), 1));
        }
    }

    public final void P(List list) {
        R("setIceServers, " + this);
        super.P(list);
        List unmodifiableList = Collections.unmodifiableList(new ArrayList(this.z));
        for (fbb fbb : this.I0.values()) {
            fbb.getClass();
            fbb.J0.log("PCRTCClient", "setConfig, servers=" + unmodifiableList + ", " + fbb);
            fbb.i("setConfig", new yug(fbb, new zab(4, fbb, unmodifiableList), 1));
        }
    }

    public final void Q(ln1 ln1, List list) {
        R("setRemoteVideoRenderers, " + this + ", " + ln1);
        ur9.e();
        fbb fbb = (fbb) this.I0.get(ln1.b);
        if (fbb == null) {
            U("peer connection not found for " + ln1);
            return;
        }
        String str = (String) this.J0.get(ln1.b);
        if (TextUtils.isEmpty(str)) {
            U(this + ": video track not found for " + ln1);
            return;
        }
        fbb.o1.p(str, ln1, list);
    }

    public final void T(kbb kbb) {
        for (Map.Entry value : this.I0.entrySet()) {
            fbb fbb = (fbb) value.getValue();
            if (fbb != null) {
                fbb.I(kbb);
                return;
            }
        }
    }

    public final fbb W() {
        hbb hbb;
        v("> createPeerConnectionClient, " + this);
        dbb dbb = new dbb();
        dbb.a = this.F0;
        dbb.b = this.y;
        dbb.c = this.G0;
        dbb.e = this.C0;
        dbb.q = 0;
        dbb.f = this.v;
        dbb.g = this.w;
        te1 te1 = this.o;
        dbb.d = te1;
        dbb.r = this.Q0;
        dbb.w = this.N0;
        dbb.n = te1.p;
        dbb.o = te1.q;
        dbb.p = te1.r;
        dbb.t = fbb.A().a;
        ibb A = fbb.A();
        boolean z = true;
        if (!A.i && ((hbb = A.j) == null || !hbb.a)) {
            z = false;
        }
        dbb.u = z;
        dbb.v = te1.B.g;
        hr6 hr6 = this.B0;
        ic3 ic3 = (ic3) hr6.c;
        dbb.y = new lj(hr6, ic3);
        dbb.x = new kk(hr6, ic3, (Integer) null);
        ((bk3) ((ui) hr6.b)).getClass();
        dbb.z = ji.o;
        dbb.B = false;
        dbb.C = this.O0;
        dbb.D = this.A0;
        fbb a = dbb.a();
        a.Y0 = this;
        a.U0 = null;
        a.V0 = false;
        a.Z0 = null;
        a.a1 = null;
        a.b1 = null;
        a.d1 = null;
        a.i("createPeerConnectionFactoryInternal", new vab(a, 2));
        v("< createPeerConnectionClient, " + this);
        return a;
    }

    public final void X(ye1 ye1) {
        R("maybeProcessRemoteAnswers, for " + ye1);
        if (!ye1.b()) {
            U(ye1 + " still not accepted call");
            return;
        }
        vsg vsg = (vsg) this.M0.get(ye1.a);
        if (vsg != null && vsg.e) {
            HashMap hashMap = vsg.a;
            SessionDescription sessionDescription = (SessionDescription) hashMap.get(ye1.j);
            if (sessionDescription != null) {
                StringBuilder sb = new StringBuilder("Found answer for ");
                sb.append(ye1);
                sb.append(", peerid=");
                this.w.log("DirectCallTopology", wj6.n(sb, (String) ye1.j.getFirst(), ", apply it"));
                vsg.c = sessionDescription;
                hashMap.clear();
                ((fbb) this.I0.get(ye1.a)).J(sessionDescription);
            }
        }
    }

    public final void Y(fbb fbb, PeerConnection.IceConnectionState iceConnectionState) {
        R("maybeRestart, " + this);
        if (!I()) {
            U(this + ": is not active yet");
        } else if (!NetworkMonitor.isOnline()) {
            U("No net connectivity");
        } else if (iceConnectionState == PeerConnection.IceConnectionState.FAILED) {
            v(fbb + " has " + iceConnectionState + " state");
            if (!fbb.E() || !fbb.l1) {
                U(fbb + " not ready or not stable");
                return;
            }
            vsg vsg = (vsg) this.M0.get(V(fbb, this.I0));
            if (vsg != null && !vsg.d) {
                U("Ice failed, restart " + fbb);
                vsg.d = true;
                vsg.e = false;
                vsg.c = null;
                vsg.a.clear();
                fbb.x(true);
            }
        }
    }

    public final void Z() {
        R("maybeCreateConnection, " + this);
        if (!I()) {
            this.w.log("DirectCallTopology", this + ": is not active yet");
            return;
        }
        List unmodifiableList = Collections.unmodifiableList(new ArrayList(this.z));
        for (fbb fbb : this.H0.values()) {
            if (!fbb.E() && !fbb.i1) {
                fbb.y(unmodifiableList);
            }
        }
        b0();
        a0();
    }

    public final void a0() {
        fbb fbb;
        R("maybeProcessSelfAnswers");
        if (!I()) {
            U(this + ": is not active yet");
            return;
        }
        for (Map.Entry entry : this.L0.entrySet()) {
            ue1 ue1 = (ue1) entry.getKey();
            vsg vsg = (vsg) entry.getValue();
            if (vsg.b == null) {
                throw new IllegalStateException("Offer not found for participant=" + ue1);
            } else if (!vsg.d && !vsg.e && (fbb = (fbb) this.I0.get(ue1)) != null) {
                this.w.log("DirectCallTopology", this + ": start processing scheduled answer for participant=" + ue1);
                vsg.d = true;
                fbb.J(vsg.b);
            }
        }
    }

    public final void b(fbb fbb, SessionDescription sessionDescription) {
        R("onPeerConnectionRemoteDescription, " + this + ", type=" + sessionDescription.type + ", " + fbb);
        ue1 V = V(fbb, this.I0);
        if (sessionDescription.type == SessionDescription.Type.OFFER && this.L0.get(V) != null) {
            fbb.w();
        }
    }

    public final void b0() {
        fbb fbb;
        R("maybeProcessSelfOffers");
        if (!I()) {
            U(this + ": is not active yet");
            return;
        }
        for (Map.Entry entry : this.M0.entrySet()) {
            ue1 ue1 = (ue1) entry.getKey();
            vsg vsg = (vsg) entry.getValue();
            if (!vsg.d && !vsg.e && (fbb = (fbb) this.I0.get(ue1)) != null) {
                this.w.log("DirectCallTopology", this + ": start processing scheduled offer for participant=" + ue1);
                vsg.d = true;
                vsg.a.clear();
                vsg.c = null;
                fbb.x(false);
            }
        }
    }

    public final void c(fbb fbb) {
        R("onPeerConnectionRenegotiationNeeded, " + this + ", " + fbb);
    }

    public final void d(fbb fbb) {
        fm1 fm1;
        R("onPeerConnectionCreated, " + this + ", " + fbb);
        HashMap hashMap = this.H0;
        Iterator it = hashMap.entrySet().iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            Map.Entry entry = (Map.Entry) it.next();
            if (entry.getValue() == fbb) {
                hashMap.remove(entry.getKey());
                if (this.z0 != null) {
                    ((fbb) entry.getValue()).I(this.z0);
                }
                this.I0.put((ue1) entry.getKey(), (fbb) entry.getValue());
            }
        }
        Z();
        if (hashMap.size() == 0 && (fm1 = this.w0) != null) {
            ((hz0) fm1).z(this);
        }
    }

    public final void e() {
        this.w.logException("DirectCallTopology", "direct.topology.create.sdp.failed", new Exception("direct.topology.create.sdp.failed"));
    }

    public final void f(String str) {
    }

    public final void g() {
        this.w.logException("DirectCallTopology", "direct.topology.set.sdp.failed", new Exception("direct.topology.set.sdp.failed"));
    }

    public final void h(fbb fbb, String str) {
        ue1 ue1;
        R("onPeerConnectionRemoteVideoTrackAdded, " + this + ", track=" + str + ", " + fbb);
        ye1 z = z(V(fbb, this.I0));
        if (z == null || (ue1 = z.a) == null) {
            U(this + ": participant not found for " + ur9.c(fbb));
            return;
        }
        this.J0.put(ue1, str);
        ue1 ue12 = z.a;
        fl4 fl4 = this.E0;
        if (fl4.isEnabled()) {
            Map remoteVideoRenderers = fl4.getRemoteVideoRenderers(ue12);
            for (ln1 ln1 : remoteVideoRenderers.keySet()) {
                List list = (List) remoteVideoRenderers.get(ln1);
                if (list != null) {
                    fbb.o1.p(str, ln1, list);
                }
            }
        }
    }

    public final void i(fbb fbb, IceCandidate[] iceCandidateArr) {
        R("onPeerConnectionIceCandidatesRemoved, " + this + ", " + fbb);
        ue1 V = V(fbb, this.I0);
        StringBuilder sb = new StringBuilder("sendRemovedIceCandidatesRequest, participant=");
        sb.append(V);
        R(sb.toString());
        try {
            this.D0.i(tf6.z(V, iceCandidateArr));
        } catch (JSONException unused) {
            this.w.logException("DirectCallTopology", "direct.topology.send.remove.ice", new Exception("direct.topology.create.remove.ice.request"));
        }
    }

    public final void k(JSONObject jSONObject) {
        String string = jSONObject.getString("notification");
        string.getClass();
        if (string.equals("custom-data")) {
            ig0 ig0 = this.o.A;
            gg0 gg0 = ig0.b;
            ig0.a.getClass();
            gg0.getClass();
        } else if (string.equals("transmitted-data")) {
            ue1 E = tf6.E(jSONObject);
            ye1 z = z(E);
            voc voc = this.w;
            if (z == null) {
                voc.reportException("DirectCallTopology", "transmitted.data.npe", new Exception("td.unknown.participant.in.p2p"));
                return;
            }
            JSONObject optJSONObject = jSONObject.getJSONObject("data").optJSONObject("sdp");
            ArrayList arrayList = null;
            SessionDescription sessionDescription = optJSONObject != null ? new SessionDescription(SessionDescription.Type.fromCanonicalForm(optJSONObject.getString("type")), optJSONObject.getString("sdp")) : null;
            if (sessionDescription == null) {
                fbb fbb = (fbb) this.I0.get(E);
                he heVar = this.K0;
                ((voc) heVar.o).log("IceCandidatesHandler", "handleTransmittedData, " + z);
                Pair s = tf6.s(jSONObject);
                if (s == null) {
                    ((voc) heVar.o).log("IceCandidatesHandler", "No peer specified for " + z);
                    return;
                }
                JSONObject jSONObject2 = jSONObject.getJSONObject("data");
                JSONObject optJSONObject2 = jSONObject2.optJSONObject("candidate");
                IceCandidate iceCandidate = optJSONObject2 != null ? new IceCandidate(optJSONObject2.getString("sdpMid"), optJSONObject2.getInt("sdpMLineIndex"), optJSONObject2.getString("candidate")) : null;
                JSONArray optJSONArray = jSONObject2.optJSONArray("candidates-removed");
                if (optJSONArray != null) {
                    ArrayList arrayList2 = new ArrayList(optJSONArray.length());
                    for (int i = 0; i < optJSONArray.length(); i++) {
                        JSONObject jSONObject3 = optJSONArray.getJSONObject(i);
                        arrayList2.add(jSONObject3 != null ? new IceCandidate(jSONObject3.getString("sdpMid"), jSONObject3.getInt("sdpMLineIndex"), jSONObject3.getString("candidate")) : null);
                    }
                    arrayList = arrayList2;
                }
                if (iceCandidate != null || arrayList != null) {
                    HashMap hashMap = (HashMap) heVar.c;
                    Map map = (Map) hashMap.get(z);
                    if (map == null) {
                        map = new HashMap();
                        hashMap.put(z, map);
                    }
                    Pair pair = (Pair) map.get(s);
                    if (pair == null) {
                        pair = new Pair(new ArrayList(), new ArrayList());
                        map.put(s, pair);
                    }
                    if (iceCandidate != null) {
                        ((List) pair.getFirst()).add(iceCandidate);
                    }
                    if (arrayList != null) {
                        ((List) pair.getSecond()).addAll(arrayList);
                    }
                    heVar.b(z, fbb);
                }
            } else if (sessionDescription.type == SessionDescription.Type.ANSWER) {
                vsg vsg = (vsg) this.M0.get(E);
                if (vsg == null) {
                    StringBuilder sb = new StringBuilder("no.scheduled.offer.found");
                    if (this.L0.get(E) != null) {
                        sb.append(".but.answer.found");
                    }
                    voc.logException("DirectCallTopology", "answer.invariant", new Exception(sb.toString()));
                } else if (!vsg.e) {
                    voc.logException("DirectCallTopology", "direct.topology.no.offer.for.answer", new Exception("offer.is.not.ready.yet"));
                } else if (vsg.c == null) {
                    Pair s2 = tf6.s(jSONObject);
                    if (s2 != null) {
                        vsg.a.put(s2, sessionDescription);
                        X(z);
                        return;
                    }
                    voc.log("DirectCallTopology", "sdp=" + jSONObject.toString());
                    voc.logException("DirectCallTopology", "direct.topology.bad.sdp", new Exception("bad.sdp.answer.from.participant"));
                } else {
                    voc.log("DirectCallTopology", "Answer was already applied from " + z);
                }
            }
        }
    }

    public final void l(fbb fbb, PeerConnection.SignalingState signalingState) {
        R("onPeerConnectionSignalingState, " + this + " state=" + signalingState + ", " + fbb);
        if (signalingState == PeerConnection.SignalingState.STABLE) {
            Y(fbb, fbb.C());
        }
        ye1 z = z(V(fbb, this.I0));
        if (z != null) {
            this.K0.b(z, fbb);
        }
    }

    public final void m(fbb fbb, IceCandidate iceCandidate) {
        R("onPeerConnectionIceCandidate, " + this + ", " + fbb);
        ue1 V = V(fbb, this.I0);
        R("sendIceCandidateRequest, participant=" + V + ", candidate=" + iceCandidate);
        try {
            this.D0.i(tf6.y(V, iceCandidate));
        } catch (JSONException unused) {
            this.w.logException("DirectCallTopology", "direct.topology.send.add.ice", new Exception("direct.topology.create.add.ice.request"));
        }
    }

    public final void n(fbb fbb, SessionDescription sessionDescription) {
        fm1 fm1;
        R("onPeerConnectionLocalDescription, " + this + ", type=" + sessionDescription.type + ", " + fbb);
        ue1 V = V(fbb, this.I0);
        ye1 z = z(V);
        if (z == null) {
            this.w.logException("DirectCallTopology", "local.sdp.npe", new Exception("set.local.sdp.for.died.participant"));
            return;
        }
        SessionDescription.Type type = sessionDescription.type;
        SessionDescription.Type type2 = SessionDescription.Type.OFFER;
        if (type == type2) {
            vsg vsg = (vsg) this.M0.get(V);
            if (vsg != null) {
                vsg.d = false;
                vsg.e = true;
            } else {
                throw new IllegalStateException();
            }
        } else {
            vsg vsg2 = (vsg) this.L0.get(V);
            if (vsg2 != null) {
                vsg2.d = false;
                vsg2.e = true;
            } else {
                throw new IllegalStateException();
            }
        }
        R("sendOfferAnswerRequest, participant=" + V + ", sdp type=" + sessionDescription.type.canonicalForm());
        try {
            this.D0.i(tf6.a(tf6.n(V, sessionDescription), "transmit-data"));
            if (sessionDescription.type == type2 && (fm1 = this.w0) != null) {
                ((hz0) fm1).T0.log("OKRTCCall", "handleTopologyOfferCreated, " + this + ", " + z + ", sdp=" + sessionDescription.type);
            }
        } catch (JSONException e) {
            throw new RuntimeException("sdp " + sessionDescription.type + " " + sessionDescription.description, e);
        }
    }

    public final void o(fbb fbb, PeerConnection.IceConnectionState iceConnectionState) {
        Runnable runnable;
        R("onPeerConnectionIceConnectionChange, " + this + ", state=" + iceConnectionState + ", " + fbb);
        Y(fbb, iceConnectionState);
        fm1 fm1 = this.w0;
        if (fm1 != null) {
            ((hz0) fm1).A(this, iceConnectionState);
        }
        if (iceConnectionState == PeerConnection.IceConnectionState.CONNECTED && (runnable = this.c) != null) {
            this.a.removeCallbacks(runnable);
        }
    }

    public final void onActiveParticipantUpdated(qz0 qz0) {
        onActiveParticipantsRemoved(new pz0(qz0.a, Collections.emptyList()));
        Collection collection = qz0.b;
        onActiveParticipantsAdded(new mz0(collection, collection));
    }

    public final void onActiveParticipantsAdded(mz0 mz0) {
        StringBuilder sb = new StringBuilder("onCallParticipantsAdded, ");
        sb.append(this);
        sb.append(", ");
        Collection<ye1> collection = mz0.a;
        sb.append(collection.size());
        R(sb.toString());
        for (ye1 ye1 : collection) {
            HashMap hashMap = this.H0;
            if (hashMap.get(ye1.a) == null && this.I0.get(ye1.a) == null) {
                hashMap.put(ye1.a, W());
            } else {
                throw new IllegalStateException("Peer connection is already created for " + ye1);
            }
        }
        Z();
    }

    public final void onActiveParticipantsChanged(nz0 nz0) {
        StringBuilder sb = new StringBuilder("onCallParticipantsChanged, ");
        Collection<ye1> collection = nz0.a;
        sb.append(collection.size());
        R(sb.toString());
        for (ye1 ye1 : collection) {
            fbb fbb = (fbb) this.I0.get(ye1.a);
            if (fbb != null) {
                X(ye1);
                this.K0.b(ye1, fbb);
            }
        }
    }

    public final void onActiveParticipantsDeAnonimized(oz0 oz0) {
    }

    public final void onActiveParticipantsRemoved(pz0 pz0) {
        StringBuilder sb = new StringBuilder("onCallParticipantsRemoved, ");
        sb.append(this);
        sb.append(", ");
        Collection<ye1> collection = pz0.a;
        sb.append(collection.size());
        R(sb.toString());
        for (ye1 ye1 : collection) {
            fbb fbb = (fbb) this.H0.remove(ye1.a);
            if (fbb == null) {
                fbb = (fbb) this.I0.remove(ye1.a);
            }
            if (fbb != null) {
                fbb.Y0 = null;
                fbb.p(true);
            }
            this.J0.remove(ye1.a);
            this.L0.remove(ye1.a);
            this.M0.remove(ye1.a);
            ((HashMap) this.K0.c).remove(ye1);
        }
    }

    public final void onConnectionTypeChanged(NetworkChangeDetector.ConnectionType connectionType) {
        R("onConnectionTypeChanged, " + this + ", type=" + connectionType);
        this.a.post(new yo4(this, 0));
    }

    public final void p(fbb fbb, long j) {
        ue1 V = V(fbb, this.H0);
        if (V == null) {
            V = V(fbb, this.I0);
        }
        if (V != null) {
            ye1 z = z(V);
            fm1 fm1 = this.w0;
            if (fm1 != null && z != null) {
                ((hz0) fm1).U1.b.onCallParticipantFingerprint(z, j);
            }
        }
    }

    public final void r(fbb fbb) {
        sp5 sp5 = this.x;
        if (sp5 != null && !sp5.f.b && !sp5.d.b && !sp5.e.b) {
            O(new em1(sp5));
        }
    }

    public final void s() {
        R("clearRemoteVideoRenderers");
        ur9.e();
        for (fbb fbb : this.I0.values()) {
            fbb.o1.d();
        }
    }

    public final void t(ue1 ue1, SessionDescription sessionDescription) {
        v("createAnswerFor, " + this + ", participant=" + ue1 + ", " + sessionDescription.type);
        ur9.e();
        SessionDescription.Type type = sessionDescription.type;
        SessionDescription.Type type2 = SessionDescription.Type.OFFER;
        if (type == type2) {
            ye1 z = z(ue1);
            if (z != null) {
                HashMap hashMap = this.M0;
                vsg vsg = (vsg) hashMap.get(ue1);
                voc voc = this.w;
                if (vsg != null) {
                    if (vsg.e) {
                        voc.log("DirectCallTopology", "Opponent " + ue1 + " is requesting for renegotiation, let us accept the request, ");
                        hashMap.remove(ue1);
                    } else {
                        voc.log("DirectCallTopology", this + ": unexpected offer (is concurrent call?) from " + z);
                        return;
                    }
                }
                HashMap hashMap2 = this.L0;
                vsg vsg2 = (vsg) hashMap2.get(ue1);
                if (vsg2 != null) {
                    SessionDescription sessionDescription2 = vsg2.b;
                    if (TextUtils.equals(sessionDescription2 != null ? sessionDescription2.description : "", sessionDescription.description)) {
                        voc.reportException("DirectCallTopology", "answer.scheduled", new Exception("answer.creation.already.scheduled"));
                        return;
                    } else if (!vsg2.d) {
                        U(this + ": re-schedule answer creation for " + z);
                        hashMap2.remove(ue1);
                    } else {
                        voc.reportException("DirectCallTopology", "repeated.answer", new Exception("repeated.answer.creation"));
                        return;
                    }
                }
                hashMap2.put(ue1, new vsg(sessionDescription));
                a0();
                return;
            }
            throw new IllegalStateException("Participant(" + ue1 + ") not found");
        }
        throw new IllegalArgumentException(type2 + " expected, but " + sessionDescription.type + " specified");
    }

    public final void u(ye1 ye1, boolean z) {
        R("createOfferFor, " + this + ", " + ye1);
        ur9.e();
        if (this.Y.k(ye1)) {
            HashMap hashMap = this.M0;
            vsg vsg = (vsg) hashMap.get(ye1.a);
            if (vsg == null) {
                hashMap.put(ye1.a, new vsg((SessionDescription) null));
            } else if (vsg.d) {
                this.w.reportException("DirectCallTopology", "offer.scheduled", new Exception("offer.creation.already.scheduled"));
            } else if (z) {
                U(this + ": re-schedule offer creation for " + ye1);
                vsg.e = false;
            } else {
                U(this + ": offer already created for " + ye1);
            }
            b0();
            return;
        }
        throw new IllegalStateException("Participant not found");
    }

    public final Runnable w() {
        return this.P0;
    }

    public final long x() {
        ur9.e();
        Iterator it = this.I0.values().iterator();
        if (it.hasNext()) {
            return ((fbb) it.next()).T0;
        }
        return -1;
    }

    public final xnf y() {
        return xnf.c;
    }
}
