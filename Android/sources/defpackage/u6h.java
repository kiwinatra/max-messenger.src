package defpackage;

import android.content.Context;
import android.media.MediaCodec;
import android.os.Looper;
import android.os.SystemClock;
import android.util.Log;
import android.util.Range;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.locks.ReentrantLock;
import javax.inject.Provider;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import one.me.chatmedia.viewer.ChatMediaViewerScreen;
import one.me.rlottie.network.LottieCacheDirProvider;
import org.json.JSONArray;
import org.json.JSONObject;
import org.webrtc.DataChannel;
import org.webrtc.IceCandidate;
import org.webrtc.MediaStream;
import org.webrtc.PeerConnection;
import org.webrtc.RtpReceiver;
import org.webrtc.VideoTrack;
import ru.ok.tamtam.android.emoji.font.LoadEmojiFontWorker;

/* renamed from: u6h  reason: default package */
public final class u6h implements h79, rv, v2f, x33, Provider, p28, nj6, qk3, tt, LottieCacheDirProvider, PeerConnection.Observer {
    public static u6h c;
    public final /* synthetic */ int a;
    public Object b;

    public /* synthetic */ u6h(int i) {
        this.a = i;
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x003a  */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x0039 A[RETURN] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static defpackage.cu9 d(org.json.JSONObject r16, defpackage.zwd r17) {
        /*
            r0 = r16
            java.lang.String r1 = "movieId"
            long r1 = r0.getLong(r1)
            java.lang.String r3 = "initiatorId"
            java.lang.String r3 = r0.getString(r3)
            ue1 r3 = defpackage.ue1.a(r3)
            java.lang.String r4 = "title"
            java.lang.String r8 = r0.getString(r4)
            java.lang.String r4 = "source"
            java.lang.String r4 = r0.getString(r4)
            java.lang.String r5 = "MOVIE"
            boolean r5 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r4, (java.lang.Object) r5)
            r6 = 0
            if (r5 == 0) goto L_0x002b
            au9 r4 = defpackage.au9.a
        L_0x0029:
            r9 = r4
            goto L_0x0037
        L_0x002b:
            java.lang.String r5 = "STREAM"
            boolean r4 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r4, (java.lang.Object) r5)
            if (r4 == 0) goto L_0x0036
            au9 r4 = defpackage.au9.b
            goto L_0x0029
        L_0x0036:
            r9 = r6
        L_0x0037:
            if (r9 != 0) goto L_0x003a
            return r6
        L_0x003a:
            java.lang.String r4 = "externalMovieId"
            java.lang.String r7 = r0.getString(r4)
            java.lang.String r4 = "duration"
            long r4 = r0.optLong(r4)
            r10 = 0
            int r6 = (r4 > r10 ? 1 : (r4 == r10 ? 0 : -1))
            if (r6 > 0) goto L_0x0050
            tt9 r4 = defpackage.tt9.i
            r10 = r4
            goto L_0x0058
        L_0x0050:
            ut9 r6 = new ut9
            java.util.concurrent.TimeUnit r10 = java.util.concurrent.TimeUnit.SECONDS
            r6.<init>(r4, r10)
            r10 = r6
        L_0x0058:
            cu9 r4 = new cu9
            st9 r12 = new st9
            vt9 r6 = new vt9
            r6.<init>(r1)
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            java.lang.String r2 = "thumbnails"
            org.json.JSONArray r0 = r0.optJSONArray(r2)
            if (r0 == 0) goto L_0x009a
            int r2 = r0.length()
            r5 = 0
        L_0x0073:
            if (r5 >= r2) goto L_0x009a
            org.json.JSONObject r11 = r0.getJSONObject(r5)
            gu9 r13 = new gu9
            java.lang.String r14 = "url"
            java.lang.String r14 = r11.optString(r14)
            java.lang.String r15 = "width"
            int r15 = r11.optInt(r15)
            r16 = r0
            java.lang.String r0 = "height"
            int r0 = r11.optInt(r0)
            r13.<init>(r14, r15, r0)
            r1.add(r13)
            int r5 = r5 + 1
            r0 = r16
            goto L_0x0073
        L_0x009a:
            hu9 r11 = new hu9
            r11.<init>(r1)
            r5 = r12
            r5.<init>(r6, r7, r8, r9, r10, r11)
            r0 = r17
            r4.<init>(r3, r0, r12)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.u6h.d(org.json.JSONObject, zwd):cu9");
    }

    public static fu9 f(JSONObject jSONObject) {
        long j = jSONObject.getLong("movieId");
        ue1 a2 = ue1.a(jSONObject.getString("initiatorId"));
        String string = jSONObject.getString("source");
        Integer num = null;
        au9 au9 = Intrinsics.areEqual((Object) string, (Object) "MOVIE") ? au9.a : Intrinsics.areEqual((Object) string, (Object) "STREAM") ? au9.b : null;
        if (au9 == null) {
            return null;
        }
        if (jSONObject.has("roomId")) {
            num = Integer.valueOf(jSONObject.optInt("roomId"));
        }
        return new fu9(a2, num != null ? new ywd(num.intValue()) : xwd.a, new vt9(j), au9);
    }

    public static synchronized u6h r(Context context) {
        u6h u6h;
        synchronized (u6h.class) {
            Context applicationContext = context.getApplicationContext();
            synchronized (u6h.class) {
                u6h = c;
                if (u6h == null) {
                    u6h = new u6h(0);
                    twe a2 = twe.a(applicationContext);
                    u6h.b = a2;
                    a2.b();
                    a2.c();
                    c = u6h;
                }
            }
        }
        return u6h;
    }

    public p01 C(s28 s28, long j, long j2, IOException iOException, int i) {
        IOException iOException2 = iOException;
        p8b p8b = (p8b) s28;
        n64 n64 = (n64) this.b;
        n64.getClass();
        long j3 = p8b.a;
        sne sne = p8b.o;
        n64.q.i(new k28(j3, p8b.b, sne.c, sne.o, j, j2, sne.b), p8b.c, iOException2, true);
        n64.n.getClass();
        iq.a("Failed to resolve time offset.", iOException2);
        n64.s(true);
        return w28.w;
    }

    public /* bridge */ /* synthetic */ void a(Object obj) {
        Void voidR = (Void) obj;
    }

    public boolean a0(m69 m69) {
        w7 w7Var = (w7) this.b;
        if (m69 == w7Var.c) {
            return false;
        }
        ((lye) m69).J0.getClass();
        w7Var.getClass();
        h79 h79 = w7Var.v;
        if (h79 != null) {
            return h79.a0(m69);
        }
        return false;
    }

    public void accept(Object obj) {
        Objects.requireNonNull(obj, "value is null");
        ((qk3) this.b).accept(new eca(obj));
    }

    public vt b(e05 e05, Looper looper, ut utVar, qd3 qd3) {
        return new o87(e05, utVar, (k74) ((fo0) this.b), qd3.a);
    }

    public void c() {
        ((bk3) this.b).getClass();
    }

    public void e(w6e w6e, Throwable th) {
        ((bk3) this.b).getClass();
        Object b2 = w6e.b();
        bg5.o("Fresco", "Finalized without closing: %x %x (type = %s).\nStack:\n%s", Integer.valueOf(System.identityHashCode(this)), Integer.valueOf(System.identityHashCode(w6e)), b2 != null ? b2.getClass().getName() : "<value is null>", th == null ? "" : Log.getStackTraceString(th));
    }

    public void g(Throwable th) {
        boolean z = th instanceof MediaCodec.CodecException;
        b8d b8d = (b8d) this.b;
        if (z) {
            g65 g65 = (g65) b8d.a;
            MediaCodec.CodecException codecException = (MediaCodec.CodecException) th;
            g65.getClass();
            g65.b(1, codecException.getMessage(), codecException);
            return;
        }
        ((g65) b8d.a).b(0, th.getMessage(), th);
    }

    public Object get() {
        switch (this.a) {
            case 4:
                z90 z90 = (z90) this.b;
                int i = z90.c;
                if (i == -1) {
                    i = 5;
                }
                int i2 = z90.b;
                if (i2 == -1) {
                    i2 = 2;
                }
                int i3 = z90.e;
                if (i3 == -1) {
                    i3 = 1;
                }
                Range range = z90.g;
                Range range2 = z90.d;
                int y = range.equals(range2) ? 44100 : te8.y(range2, i3, i2, ((Integer) range2.getUpper()).intValue());
                List list = y90.e;
                eud eud = new eud(2);
                eud.b = -1;
                eud.c = -1;
                eud.o = -1;
                eud.v = -1;
                eud.b = Integer.valueOf(i);
                eud.v = Integer.valueOf(i2);
                eud.o = Integer.valueOf(i3);
                eud.c = Integer.valueOf(y);
                return eud.e();
            default:
                return ((Function0) this.b).invoke();
        }
    }

    public File getCacheDir() {
        po5 po5 = (po5) ((q4) this.b).g(po5.class);
        po5.getClass();
        return po5.g(po5.b(), "stickerCache");
    }

    public synchronized void h() {
        twe twe = (twe) this.b;
        ReentrantLock reentrantLock = twe.a;
        reentrantLock.lock();
        try {
            twe.b.edit().clear().apply();
        } finally {
            reentrantLock.unlock();
        }
    }

    public y33 i(int i) {
        return ((do0) ((pv0) this.b).c).A(i);
    }

    public void j() {
        ((oc6) this.b).y0.S();
    }

    /* JADX WARNING: type inference failed for: r0v1, types: [java.lang.Object, h28] */
    public void k() {
        z68.f(LoadEmojiFontWorker.TAG, "onDownloadEmojiFontFailed", (Throwable) null);
        ((LoadEmojiFontWorker) this.b).state = new Object();
    }

    public void l(boolean z) {
        if (z) {
            ChatMediaViewerScreen chatMediaViewerScreen = (ChatMediaViewerScreen) this.b;
            if (ChatMediaViewerScreen.j0(chatMediaViewerScreen)) {
                View view = chatMediaViewerScreen.getView();
                if (view != null) {
                    view.setKeepScreenOn(true);
                }
                n09 n09 = chatMediaViewerScreen.x0;
                if (n09 != null) {
                    n09.l(m09.c);
                }
            }
        }
    }

    public void m(m69 m69, boolean z) {
        if (m69 instanceof lye) {
            ((lye) m69).I0.k().c(false);
        }
        h79 h79 = ((w7) this.b).v;
        if (h79 != null) {
            h79.m(m69, z);
        }
    }

    public void n(s28 s28, long j, long j2, boolean z) {
        ((n64) this.b).r((p8b) s28, j, j2);
    }

    public void o() {
        n09 n09;
        ChatMediaViewerScreen chatMediaViewerScreen = (ChatMediaViewerScreen) this.b;
        View view = chatMediaViewerScreen.getView();
        if (view != null) {
            view.setKeepScreenOn(true);
        }
        if (chatMediaViewerScreen.p0().a() && ChatMediaViewerScreen.j0(chatMediaViewerScreen) && (n09 = chatMediaViewerScreen.x0) != null) {
            n09.l(m09.c);
        }
    }

    public void onAddStream(MediaStream mediaStream) {
        String str;
        fbb fbb = (fbb) this.b;
        voc voc = fbb.J0;
        StringBuilder sb = new StringBuilder("handlePeerConnectionAddStream, ");
        sb.append(fbb);
        sb.append(", stream =");
        sb.append(ur9.c(mediaStream));
        sb.append(", video tracks=");
        List<VideoTrack> list = mediaStream.videoTracks;
        if (list == null || list.isEmpty()) {
            str = "[Ø]";
        } else {
            StringBuilder sb2 = new StringBuilder("[");
            boolean z = true;
            for (VideoTrack next : list) {
                if (!z) {
                    sb2.append(", ");
                }
                if (next != null) {
                    sb2.append(next.getClass().getSimpleName());
                    sb2.append('@');
                    sb2.append(System.identityHashCode(next));
                } else {
                    sb2.append(216);
                }
                z = false;
            }
            sb2.append(']');
            str = sb2.toString();
        }
        sb.append(str);
        voc.log("PCRTCClient", sb.toString());
    }

    public void onAddTrack(RtpReceiver rtpReceiver, MediaStream[] mediaStreamArr) {
        String str;
        fbb fbb = (fbb) this.b;
        voc voc = fbb.J0;
        StringBuilder sb = new StringBuilder("handlePeerConnectionAddTrack, ");
        sb.append(fbb);
        sb.append(", receiver=");
        sb.append(rtpReceiver);
        sb.append(", streams=");
        boolean z = ur9.a;
        if (mediaStreamArr == null || mediaStreamArr.length == 0) {
            str = "[Ø]";
        } else {
            StringBuilder sb2 = new StringBuilder("[");
            int length = mediaStreamArr.length;
            boolean z2 = true;
            int i = 0;
            while (i < length) {
                MediaStream mediaStream = mediaStreamArr[i];
                if (!z2) {
                    sb2.append(", ");
                }
                if (mediaStream != null) {
                    sb2.append(mediaStream.getClass().getSimpleName());
                    sb2.append('@');
                    sb2.append(System.identityHashCode(mediaStream));
                } else {
                    sb2.append(216);
                }
                i++;
                z2 = false;
            }
            sb2.append(']');
            str = sb2.toString();
        }
        sb.append(str);
        voc.log("PCRTCClient", sb.toString());
        rtpReceiver.SetObserver(new xab(fbb));
        fbb.o1.k(rtpReceiver, mediaStreamArr);
        fbb.B0.post(new sx8(18, fbb, mediaStreamArr));
    }

    public void onDataChannel(DataChannel dataChannel) {
        fbb fbb = (fbb) this.b;
        fbb.getClass();
        boolean equals = "animoji".equals(dataChannel.label());
        voc voc = fbb.J0;
        if (equals && fbb.Z == ji.b) {
            u64 u64 = new u64(dataChannel, voc);
            lj ljVar = fbb.Y;
            if (ljVar != null) {
                u64 u642 = ljVar.c;
                if (u642 != null) {
                    u642.c(ljVar);
                }
                ljVar.c = u64;
                ic3 ic3 = ljVar.b;
                ((AtomicInteger) ic3.v).set(0);
                ((AtomicInteger) ic3.w).set(0);
                u64.a(ljVar);
            }
            kk kkVar = fbb.z;
            if (kkVar != null) {
                kkVar.d(u64);
            }
        }
        voc.log("handlePeerConnectionDataChannel", "created channel: " + dataChannel.label() + "/" + dataChannel.id());
    }

    public void onIceCandidate(IceCandidate iceCandidate) {
        fbb fbb = (fbb) this.b;
        fbb.getClass();
        fbb.J0.log("PCRTCClient", "handlePeerConnectionIceCandidate, " + fbb);
        fbb.i("onIceCandidate", new yug(fbb, new uab(fbb, iceCandidate, 1), 1));
    }

    public void onIceCandidatesRemoved(IceCandidate[] iceCandidateArr) {
        fbb fbb = (fbb) this.b;
        fbb.getClass();
        fbb.J0.log("PCRTCClient", "handlePeerConnectionIceCandidatesRemoved, " + fbb);
        fbb.i("onIceCandidatesRemoved", new yug(fbb, new zab(3, fbb, iceCandidateArr), 1));
    }

    public void onIceConnectionChange(PeerConnection.IceConnectionState iceConnectionState) {
        fbb fbb = (fbb) this.b;
        fbb.getClass();
        fbb.J0.log("PCRTCClient", "handlePeerConnectionIceConnectionChange, " + fbb + " state=" + iceConnectionState);
        PeerConnection.IceConnectionState iceConnectionState2 = PeerConnection.IceConnectionState.CONNECTED;
        q67 q67 = fbb.M0;
        if (iceConnectionState == iceConnectionState2) {
            q67.a(true);
        } else if (iceConnectionState == PeerConnection.IceConnectionState.CLOSED) {
            q67.a(false);
        }
        if (iceConnectionState == iceConnectionState2 && fbb.X) {
            z2d z2d = new z2d(true);
            q9d q9d = fbb.N0;
            if (q9d != null) {
                q9d.d(new o9d(new o9d((n9d) z2d)));
            }
        }
        fbb.B0.post(new sx8(17, fbb, iceConnectionState));
    }

    public void onIceConnectionReceivingChange(boolean z) {
        ((fbb) this.b).getClass();
    }

    public void onIceGatheringChange(PeerConnection.IceGatheringState iceGatheringState) {
        fbb fbb = (fbb) this.b;
        fbb.getClass();
        fbb.J0.log("PCRTCClient", "handlePeerConnectionIceGatheringChange, " + fbb + ", state=" + iceGatheringState);
        if (iceGatheringState == PeerConnection.IceGatheringState.GATHERING) {
            q67 q67 = fbb.M0;
            q67.getClass();
            q67.e = SystemClock.elapsedRealtime();
        }
        fbb.i("onIceGatheringChange", new yug(fbb, new zab(0, fbb, iceGatheringState), 1));
    }

    public void onRemoveStream(MediaStream mediaStream) {
        fbb fbb = (fbb) this.b;
        voc voc = fbb.J0;
        voc.log("PCRTCClient", "handlePeerConnectionRemoveStream, " + fbb + ", stream=" + ur9.c(mediaStream));
    }

    public void onRenegotiationNeeded() {
        fbb fbb = (fbb) this.b;
        fbb.getClass();
        fbb.J0.log("PCRTCClient", "handlePeerConnectionRenegotiationNeeded, " + fbb);
        fbb.B0.post(new vab(fbb, 4));
    }

    public void onSignalingChange(PeerConnection.SignalingState signalingState) {
        fbb fbb = (fbb) this.b;
        fbb.getClass();
        fbb.J0.log("PCRTCClient", "handlePeerConnectionSignalingChange, " + fbb + ", state=" + signalingState);
        fbb.B0.post(new sx8(16, fbb, signalingState));
    }

    public List p(JSONObject jSONObject, zwd zwd) {
        cu9 cu9;
        st9 st9;
        voc voc = (voc) this.b;
        try {
            JSONArray optJSONArray = jSONObject.optJSONArray("movieShareInfos");
            if (optJSONArray == null) {
                return CollectionsKt.emptyList();
            }
            ArrayList arrayList = new ArrayList();
            int length = optJSONArray.length();
            for (int i = 0; i < length; i++) {
                cu9 = d(optJSONArray.getJSONObject(i), zwd);
                if (!(cu9 == null || (st9 = cu9.c) == null)) {
                    arrayList.add(st9);
                }
            }
            return arrayList;
        } catch (Throwable th) {
            voc.logException("VideoStreamsParser", "Can't parse movies", th);
            return CollectionsKt.emptyList();
        }
    }

    public void q(int i) {
        RecyclerView recyclerView = (RecyclerView) this.b;
        View childAt = recyclerView.getChildAt(i);
        if (childAt != null) {
            recyclerView.u(childAt);
            childAt.clearAnimation();
        }
        recyclerView.removeViewAt(i);
    }

    public Unit s(long j, List list) {
        if (list.isEmpty()) {
            return Unit.INSTANCE;
        }
        ((gx) this.b).B();
        ((gx) this.b).o(j, list, false, true);
        return Unit.INSTANCE;
    }

    public void u(s28 s28, long j, long j2) {
        p8b p8b = (p8b) s28;
        n64 n64 = (n64) this.b;
        n64.getClass();
        long j3 = p8b.a;
        p74 p74 = p8b.b;
        sne sne = p8b.o;
        k28 k28 = new k28(j3, p74, sne.c, sne.o, j, j2, sne.b);
        n64.n.getClass();
        n64.q.f(k28, p8b.c, -1, (ca6) null, 0, (Object) null, -9223372036854775807L, -9223372036854775807L);
        n64.L = ((Long) p8b.w).longValue() - j;
        n64.s(true);
    }

    public /* synthetic */ u6h(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    public u6h() {
        this.a = 11;
        this.b = new ntc(fef.h, TimeUnit.MINUTES);
    }

    public u6h(Context context) {
        this.a = 5;
        this.b = context.getApplicationContext();
    }
}
