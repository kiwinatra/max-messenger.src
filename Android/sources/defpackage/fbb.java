package defpackage;

import android.content.Context;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.SystemClock;
import android.util.Size;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import java.util.regex.Pattern;
import org.webrtc.AudioTrack;
import org.webrtc.DataChannel;
import org.webrtc.IceCandidate;
import org.webrtc.Logging;
import org.webrtc.MediaConstraints;
import org.webrtc.MediaStreamTrack;
import org.webrtc.NativeLibraryLoader;
import org.webrtc.PeerConnection;
import org.webrtc.PeerConnectionFactory;
import org.webrtc.RtpSender;
import org.webrtc.SessionDescription;
import org.webrtc.VideoFrame;
import org.webrtc.VideoTrack;

/* renamed from: fbb  reason: default package */
public final class fbb implements x48, w48, bp5, wug, z8b {
    public static final Pattern u1 = Pattern.compile("^a=rtpmap:(\\d+) H264(/\\d+)+[\r]?$", 8);
    public static final Pattern v1 = Pattern.compile("^a=animoji:(\\d+)", 8);
    public static volatile dm4 w1 = null;
    public static final b8d x1 = new Object();
    public final bad A0;
    public final Handler B0 = new Handler(Looper.getMainLooper());
    public final t6e C0;
    public final d D0;
    public final ExecutorService E0;
    public final w6b F0;
    public final int G0;
    public final Context H0;
    public final yoc I0;
    public final voc J0;
    public final te1 K0;
    public final eud L0;
    public final q67 M0;
    public final q9d N0;
    public final n09 O0;
    public final cp5 P0;
    public final boolean Q0;
    public final String[] R0;
    public final String[] S0;
    public long T0 = -1;
    public volatile PeerConnection U0;
    public boolean V0;
    public MediaConstraints W0;
    public boolean X;
    public MediaConstraints X0;
    public final lj Y;
    public ebb Y0;
    public final ji Z;
    public RtpSender Z0;
    public final boolean a;
    public RtpSender a1;
    public final ihd b;
    public RtpSender b1;
    public final qpg c;
    public List c1;
    public RtpSender d1;
    public final ArrayList e1 = new ArrayList();
    public v48 f1;
    public boolean g1 = true;
    public volatile boolean h1;
    public volatile boolean i1;
    public boolean j1;
    public volatile boolean k1;
    public volatile boolean l1 = true;
    public kbb m1;
    public final h44 n1;
    public final boolean o;
    public final qj3 o1;
    public final lgd p1;
    public final boolean q1;
    public final float r1;
    public final float s1;
    public final boolean t1;
    public final boolean v;
    public int v0 = 0;
    public final boolean w;
    public int w0 = 0;
    public final Integer x;
    public int x0 = 0;
    public final Integer y;
    public int y0 = 0;
    public final kk z;
    public final boolean z0;

    /* JADX WARNING: type inference failed for: r0v33, types: [qpg, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r1v12, types: [java.lang.Object, d19] */
    /* JADX WARNING: type inference failed for: r1v13, types: [n09, java.lang.Object] */
    public fbb(dbb dbb) {
        w6b w6b;
        dab dab;
        dbb dbb2 = dbb;
        int i = dbb2.q;
        this.G0 = i;
        Context applicationContext = dbb2.e.getApplicationContext();
        this.H0 = applicationContext;
        yoc yoc = dbb2.f;
        this.I0 = yoc;
        voc voc = dbb2.g;
        this.J0 = voc;
        te1 te1 = dbb2.d;
        this.K0 = te1;
        this.A0 = new bad(voc);
        t6e t6e = dbb2.a;
        this.C0 = t6e;
        ExecutorService executorService = t6e != null ? t6e.a : dbb2.c;
        this.E0 = executorService;
        this.Q0 = dbb2.n;
        this.R0 = dbb2.o;
        this.S0 = dbb2.p;
        this.z0 = dbb2.B;
        if (executorService == null) {
            te1.getClass();
            w6b = new w6b(yoc);
        } else {
            w6b = null;
        }
        this.F0 = w6b;
        this.D0 = dbb2.b;
        te1.getClass();
        this.M0 = new q67(yoc, voc, i);
        wie wie = dbb2.w;
        if (dbb2.h) {
            te1.A.a.getClass();
            o9a o9a = new o9a(18);
            dm4 dm4 = new dm4(23);
            dm4.c = o9a;
            dm4.b = voc;
            this.N0 = new q9d(dm4);
        } else {
            this.N0 = null;
        }
        if (dbb2.i) {
            fj fjVar = new fj(20, (byte) 0);
            fjVar.b = null;
            fjVar.c = null;
            ? obj = new Object();
            obj.b = wie;
            obj.c = new fj(27, (Object) wie, (Object) voc);
            obj.a = new cx1(voc);
            fjVar.b = obj;
            fjVar.c = voc;
            ? obj2 = new Object();
            obj2.a = new CopyOnWriteArrayList();
            obj2.w = new Handler(Looper.getMainLooper());
            obj2.x = new AtomicBoolean(false);
            obj2.y = new AtomicReference((Object) null);
            obj2.z = new msg(0, obj2);
            d19 d19 = (d19) fjVar.b;
            if (d19 != null) {
                voc voc2 = (voc) fjVar.c;
                if (voc2 != null) {
                    obj2.b = d19;
                    obj2.c = voc2;
                    HandlerThread handlerThread = new HandlerThread("RtcNotifRecv");
                    obj2.o = handlerThread;
                    handlerThread.start();
                    obj2.v = new Handler(handlerThread.getLooper());
                    this.O0 = obj2;
                } else {
                    throw new IllegalArgumentException("Illegal 'log' value: null");
                }
            } else {
                throw new IllegalArgumentException("Illegal 'serializer' value: null");
            }
        } else {
            this.O0 = null;
        }
        re1 re1 = te1.B;
        this.q1 = re1.b;
        this.r1 = re1.c;
        this.s1 = re1.d;
        Future submit = (executorService == null || t6e == null) ? null : executorService.submit(new h5(15, t6e));
        if (!dbb2.j || submit == null) {
            this.b = null;
        } else {
            this.b = new ihd(dbb2.g, wie, submit, this, dbb2.C);
        }
        if (dbb2.k) {
            ? obj3 = new Object();
            obj3.o = new CopyOnWriteArrayList();
            obj3.c = wie;
            this.c = obj3;
        } else {
            this.c = null;
        }
        this.X = dbb2.l;
        this.P0 = new cp5(this);
        this.a = dbb2.r;
        this.o = dbb2.t;
        this.w = dbb2.u;
        this.v = dbb2.v;
        hbb hbb = A().j;
        if (hbb != null) {
            this.x = hbb.g;
            this.y = hbb.h;
        } else {
            this.x = null;
            this.y = null;
        }
        if (dbb2.s) {
            this.o1 = new d9b(new yu9(16, (Object) this), voc, new xab(this), wie);
        } else {
            this.o1 = new xh4(new yu9(16, (Object) this), voc, new xab(this), wie);
        }
        this.z = dbb2.x;
        this.Y = dbb2.y;
        this.Z = dbb2.z;
        this.L0 = dbb2.A;
        if (!(t6e == null || (dab = t6e.j) == null)) {
            dab.w.add(this);
        }
        this.n1 = new h44(t6e, applicationContext, te1, voc);
        this.p1 = dbb2.D;
        this.t1 = dbb2.m;
    }

    public static ibb A() {
        if (w1 != null) {
            return (ibb) w1.b;
        }
        Boolean bool = Boolean.FALSE;
        return new ibb(true, true, (String) null, (String) null, (Integer) null, false, false, false, false, new hbb(false, (Integer) null, (Integer) null, bool, bool, (Boolean) null, (Integer) null, (Integer) null), false, (String) null);
    }

    public static void D(Context context, dm4 dm4, NativeLibraryLoader nativeLibraryLoader) {
        if (w1 == null) {
            w1 = dm4;
            voc voc = (voc) w1.c;
            if (voc != null) {
                b8d b8d = x1;
                b8d.getClass();
                b8d.a = new WeakReference(voc);
            }
            PeerConnectionFactory.InitializationOptions.Builder injectableLogger = PeerConnectionFactory.InitializationOptions.builder(context.getApplicationContext()).setInjectableLogger(x1, Logging.Severity.LS_VERBOSE);
            if (nativeLibraryLoader != null) {
                injectableLogger.setNativeLibraryLoader(nativeLibraryLoader);
            }
            PeerConnectionFactory.initialize(injectableLogger.createInitializationOptions());
        }
    }

    public static LinkedList f(String[] strArr) {
        if (strArr == null || strArr.length == 0) {
            return null;
        }
        LinkedList linkedList = new LinkedList();
        for (String str : strArr) {
            if (str != null && !str.isEmpty()) {
                int length = str.length();
                int i = 0;
                while (true) {
                    if (i >= length) {
                        break;
                    }
                    int codePointAt = str.codePointAt(i);
                    if (!Character.isWhitespace(codePointAt)) {
                        linkedList.add(str);
                        break;
                    }
                    i += Character.charCount(codePointAt);
                }
            }
        }
        if (linkedList.isEmpty()) {
            return null;
        }
        return linkedList;
    }

    public final q9d B() {
        q9d q9d = this.N0;
        if (q9d != null) {
            return q9d;
        }
        throw new IllegalStateException("Command executor is not enabled");
    }

    public final PeerConnection.IceConnectionState C() {
        PeerConnection peerConnection = this.U0;
        if (peerConnection == null) {
            return null;
        }
        try {
            return peerConnection.iceConnectionState();
        } catch (Exception e) {
            this.J0.reportException("PCRTCClient", "pc.conn.state", e);
            return null;
        }
    }

    public final boolean E() {
        return !this.h1 && !this.i1 && this.U0 != null;
    }

    public final void F() {
        v48 v48 = this.f1;
        if (v48 != null) {
            voc voc = this.J0;
            voc.log("PCRTCClient", "maybeUpdateSenders, " + this + ", " + ur9.c(v48));
            if (G() != null) {
                RtpSender rtpSender = this.a1;
                RtpSender rtpSender2 = this.Z0;
                v48.n.log("OKRTCLmsAdapter", "bindTracksWith, " + v48 + ", audio sender=" + ur9.c(rtpSender) + " & video sender= " + ur9.c(rtpSender2));
                v48.i.t(rtpSender);
                if (v48.f.d) {
                    v48.y.t(rtpSender2);
                }
            }
        }
    }

    public final PeerConnection G() {
        if (this.U0 != null && !this.h1 && !this.V0) {
            return this.U0;
        }
        StringBuilder sb = new StringBuilder();
        if (this.U0 == null) {
            sb.append("No web-rtc peer connection");
        }
        if (this.V0) {
            if (sb.length() > 0) {
                sb.append(", fatal error occurred");
            } else {
                sb.append("Fatal error occurred");
            }
        }
        if (this.h1) {
            voc voc = this.J0;
            voc.log("PCRTCClient", this + ": (closed) " + sb);
            return null;
        }
        voc voc2 = this.J0;
        voc2.log("PCRTCClient", this + ": (unclosed null peer connection) " + sb);
        return null;
    }

    public final void H(IceCandidate[] iceCandidateArr) {
        this.J0.log("PCRTCClient", "removeRemoteIceCandidates, " + this);
        i("removeRemoteIceCandidates", new yug(this, new ok3(2, iceCandidateArr), 1));
    }

    public final void I(kbb kbb) {
        if (kbb != null && !kbb.equals(this.m1)) {
            kbb kbb2 = this.m1;
            boolean z2 = kbb2 != null && !Objects.equals(kbb2.i, kbb.i);
            this.m1 = kbb;
            this.n1.j = kbb;
            this.J0.log("PCRTCClient", "setPeerVideoSettings, " + this + " settings=" + kbb.toString());
            i("setPeerVideoSettings", new yug(this, new qab(this, z2, 1), 1));
        }
    }

    public final void J(SessionDescription sessionDescription) {
        voc voc = this.J0;
        voc.log("PCRTCClient", "setRemoteDescription, " + this + ", sdp=" + sessionDescription.type);
        this.l1 = false;
        this.k1 = false;
        q67 q67 = this.M0;
        if (q67.f == 0) {
            q67.f = SystemClock.elapsedRealtime();
        }
        i("setRemoteDescription", new yug(this, new tab(this, sessionDescription, 1), 1));
    }

    public final void a(ue1 ue1, VideoFrame videoFrame) {
        eud eud = this.L0;
        if (eud != null) {
            ((sjf) ((rjf) eud.c)).getClass();
            long elapsedRealtime = SystemClock.elapsedRealtime();
            xfd.a().c(new sx5(eud, ue1, new Size(videoFrame.getRotatedWidth(), videoFrame.getRotatedHeight()), elapsedRealtime, 1));
        }
        this.o1.a(ue1, videoFrame);
    }

    public final void b(v48 v48) {
        this.J0.log("PCRTCClient", "onLocalMediaStreamChanged, " + this + " ms=" + ur9.c(v48));
        org.webrtc.Size h = v48.h();
        ngd ngd = v48.t;
        int i = 0;
        int i2 = ngd != null ? ngd.g : 0;
        ngd ngd2 = v48.t;
        if (ngd2 != null) {
            i = ngd2.f;
        }
        i("maybeUpdateSenders", new yug(this, new sab(this, h, i2, i), 1));
    }

    public final void c(long j) {
        ebb ebb = this.Y0;
        if (ebb != null) {
            ebb.p(this, j);
        }
    }

    public final u64 d(String str, DataChannel.Init init) {
        init.ordered = true;
        init.maxRetransmitTimeMs = 10000000;
        DataChannel createDataChannel = this.U0.createDataChannel(str, init);
        voc voc = this.J0;
        StringBuilder p = tr1.p("DATACH create data channel: name: ", str, ", id: ");
        p.append(createDataChannel.id());
        voc.log("PCRTCClient", p.toString());
        return new u64(createDataChannel, this.J0);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:32:0x00bc, code lost:
        r13 = defpackage.ld9.a(false, r6, r10);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x0102, code lost:
        if (r15.a.contains(java.lang.Integer.valueOf(r14)) != false) goto L_0x0107;
     */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x00e8  */
    /* JADX WARNING: Removed duplicated region for block: B:70:0x014a A[SYNTHETIC, Splitter:B:70:0x014a] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.String e(java.lang.String r23, boolean r24) {
        /*
            r22 = this;
            r0 = r22
            r1 = r23
            r2 = r24
            java.lang.String r3 = "\\r\\n"
            java.lang.String[] r4 = r0.R0
            java.util.LinkedList r4 = f(r4)
            java.lang.String[] r5 = r0.S0
            java.util.LinkedList r5 = f(r5)
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            java.lang.String r7 = "applyPreferCodec, local="
            r6.<init>(r7)
            r6.append(r2)
            java.lang.String r8 = ", filter="
            r6.append(r8)
            boolean r8 = r0.Q0
            r6.append(r8)
            java.lang.String r9 = ", video=["
            r6.append(r9)
            java.lang.String r9 = ", "
            java.lang.String r10 = "null"
            if (r5 != 0) goto L_0x0035
            r11 = r10
            goto L_0x005b
        L_0x0035:
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>()
            java.util.Iterator r12 = r5.iterator()
        L_0x003e:
            boolean r13 = r12.hasNext()
            if (r13 == 0) goto L_0x0057
            java.lang.Object r13 = r12.next()
            java.lang.String r13 = (java.lang.String) r13
            int r14 = r11.length()
            if (r14 <= 0) goto L_0x0053
            r11.append(r9)
        L_0x0053:
            r11.append(r13)
            goto L_0x003e
        L_0x0057:
            java.lang.String r11 = r11.toString()
        L_0x005b:
            r6.append(r11)
            java.lang.String r11 = "], audio=["
            r6.append(r11)
            if (r4 != 0) goto L_0x0066
            goto L_0x008c
        L_0x0066:
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            java.util.Iterator r11 = r4.iterator()
        L_0x006f:
            boolean r12 = r11.hasNext()
            if (r12 == 0) goto L_0x0088
            java.lang.Object r12 = r11.next()
            java.lang.String r12 = (java.lang.String) r12
            int r13 = r10.length()
            if (r13 <= 0) goto L_0x0084
            r10.append(r9)
        L_0x0084:
            r10.append(r12)
            goto L_0x006f
        L_0x0088:
            java.lang.String r10 = r10.toString()
        L_0x008c:
            java.lang.String r9 = "]"
            java.lang.String r6 = defpackage.wj6.n(r6, r10, r9)
            voc r10 = r0.J0
            java.lang.String r11 = "PCRTCClient"
            r10.log(r11, r6)
            java.lang.String r0 = "\r\n"
            java.lang.String[] r6 = r1.split(r0)
            r12 = 1
            r13 = 0
            r14 = 0
            if (r4 == 0) goto L_0x00b8
            gug r15 = defpackage.ld9.a(r12, r6, r10)
            if (r15 == 0) goto L_0x00b5
            boolean r16 = r15.d(r4)
            if (r16 != 0) goto L_0x00b2
            if (r8 == 0) goto L_0x00b5
        L_0x00b2:
            r16 = r12
            goto L_0x00ba
        L_0x00b5:
            r16 = r14
            goto L_0x00ba
        L_0x00b8:
            r15 = r13
            goto L_0x00b5
        L_0x00ba:
            if (r5 == 0) goto L_0x00cd
            gug r13 = defpackage.ld9.a(r14, r6, r10)
            if (r13 == 0) goto L_0x00cd
            boolean r17 = r13.d(r5)
            if (r17 != 0) goto L_0x00ca
            if (r8 == 0) goto L_0x00cd
        L_0x00ca:
            r17 = r12
            goto L_0x00cf
        L_0x00cd:
            r17 = r14
        L_0x00cf:
            if (r16 != 0) goto L_0x00da
            if (r17 != 0) goto L_0x00da
            r4 = r1
            r20 = r10
            r21 = r11
            goto L_0x0144
        L_0x00da:
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            r12.<init>()
            r20 = r10
            r18 = r14
            r19 = r18
        L_0x00e5:
            int r10 = r6.length
            if (r14 >= r10) goto L_0x013e
            if (r16 == 0) goto L_0x010f
            int r10 = r15.c
            if (r14 != r10) goto L_0x00f4
            r15.f(r12, r4, r8)
            r21 = r11
            goto L_0x0139
        L_0x00f4:
            if (r14 == r10) goto L_0x0105
            java.util.HashSet r10 = r15.a
            r21 = r11
            java.lang.Integer r11 = java.lang.Integer.valueOf(r14)
            boolean r10 = r10.contains(r11)
            if (r10 == 0) goto L_0x0111
            goto L_0x0107
        L_0x0105:
            r21 = r11
        L_0x0107:
            if (r18 != 0) goto L_0x0139
            r15.c(r12, r4, r8)
            r18 = 1
            goto L_0x0139
        L_0x010f:
            r21 = r11
        L_0x0111:
            if (r17 == 0) goto L_0x0131
            int r10 = r13.c
            if (r14 != r10) goto L_0x011b
            r13.f(r12, r5, r8)
            goto L_0x0139
        L_0x011b:
            if (r14 == r10) goto L_0x0129
            java.util.HashSet r10 = r13.a
            java.lang.Integer r11 = java.lang.Integer.valueOf(r14)
            boolean r10 = r10.contains(r11)
            if (r10 == 0) goto L_0x0131
        L_0x0129:
            if (r19 != 0) goto L_0x0139
            r13.c(r12, r5, r8)
            r19 = 1
            goto L_0x0139
        L_0x0131:
            r10 = r6[r14]
            r12.append(r10)
            r12.append(r0)
        L_0x0139:
            int r14 = r14 + 1
            r11 = r21
            goto L_0x00e5
        L_0x013e:
            r21 = r11
            java.lang.String r4 = r12.toString()
        L_0x0144:
            boolean r5 = r1.equals(r4)
            if (r5 != 0) goto L_0x0197
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ all -> 0x018d }
            r5.<init>(r7)     // Catch:{ all -> 0x018d }
            r5.append(r2)     // Catch:{ all -> 0x018d }
            java.lang.String r6 = ", description before=["
            r5.append(r6)     // Catch:{ all -> 0x018d }
            java.lang.String r1 = r1.replace(r0, r3)     // Catch:{ all -> 0x018d }
            r5.append(r1)     // Catch:{ all -> 0x018d }
            r5.append(r9)     // Catch:{ all -> 0x018d }
            java.lang.String r1 = r5.toString()     // Catch:{ all -> 0x018d }
            r5 = r20
            r6 = r21
            r5.log(r6, r1)     // Catch:{ all -> 0x018b }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x018b }
            r1.<init>(r7)     // Catch:{ all -> 0x018b }
            r1.append(r2)     // Catch:{ all -> 0x018b }
            java.lang.String r2 = ", description after=["
            r1.append(r2)     // Catch:{ all -> 0x018b }
            java.lang.String r0 = r4.replace(r0, r3)     // Catch:{ all -> 0x018b }
            r1.append(r0)     // Catch:{ all -> 0x018b }
            r1.append(r9)     // Catch:{ all -> 0x018b }
            java.lang.String r0 = r1.toString()     // Catch:{ all -> 0x018b }
            r5.log(r6, r0)     // Catch:{ all -> 0x018b }
            goto L_0x0197
        L_0x018b:
            r0 = move-exception
            goto L_0x0192
        L_0x018d:
            r0 = move-exception
            r5 = r20
            r6 = r21
        L_0x0192:
            java.lang.String r1 = "applyPreferCodec, failed to log sdp difference"
            r5.reportException(r6, r1, r0)
        L_0x0197:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fbb.e(java.lang.String, boolean):java.lang.String");
    }

    public final PeerConnection.RTCConfiguration g(List list) {
        ArrayList arrayList = new ArrayList();
        this.K0.getClass();
        Iterator it = list.iterator();
        boolean z2 = false;
        boolean z3 = false;
        int i = 1;
        while (it.hasNext()) {
            PeerConnection.IceServer iceServer = (PeerConnection.IceServer) it.next();
            String str = iceServer.uri;
            if (str == null || iceServer.password == null || iceServer.username == null) {
                throw new NullPointerException(iceServer.toString());
            } else if (str.startsWith("turn")) {
                if (!iceServer.username.isEmpty() && !iceServer.password.isEmpty()) {
                    arrayList.add(iceServer);
                    if (i > 0) {
                        arrayList.add(PeerConnection.IceServer.builder(iceServer.uri.concat("?transport=tcp")).setUsername(iceServer.username).setPassword(iceServer.password).setTlsCertPolicy(iceServer.tlsCertPolicy).setHostname(iceServer.hostname).createIceServer());
                        i--;
                    }
                    z2 = true;
                }
            } else if (iceServer.uri.startsWith("stun")) {
                arrayList.add(iceServer);
                z3 = true;
            }
        }
        voc voc = this.J0;
        if (!z2 || !z3) {
            voc.log("PCRTCClient", this + ": stun or turn servers are absent");
        }
        voc.log("PCRTCClient", this + ": iceServers=" + arrayList);
        PeerConnection.RTCConfiguration rTCConfiguration = new PeerConnection.RTCConfiguration(arrayList);
        rTCConfiguration.tcpCandidatePolicy = PeerConnection.TcpCandidatePolicy.ENABLED;
        rTCConfiguration.bundlePolicy = PeerConnection.BundlePolicy.MAXBUNDLE;
        rTCConfiguration.rtcpMuxPolicy = PeerConnection.RtcpMuxPolicy.REQUIRE;
        rTCConfiguration.continualGatheringPolicy = PeerConnection.ContinualGatheringPolicy.GATHER_CONTINUALLY;
        rTCConfiguration.keyType = PeerConnection.KeyType.ECDSA;
        rTCConfiguration.iceTransportsType = this.a ? PeerConnection.IceTransportsType.RELAY : PeerConnection.IceTransportsType.ALL;
        rTCConfiguration.sdpSemantics = PeerConnection.SdpSemantics.UNIFIED_PLAN;
        rTCConfiguration.suspendBelowMinBitrate = this.z0;
        return rTCConfiguration;
    }

    public final void h(String str) {
        this.J0.log("PCRTCClient", "handleSdpCreateFailure, " + this + ", error=" + str);
        i("handleSdpCreateFailure", new rab(this, str, 1));
    }

    public final void i(String str, Runnable runnable) {
        ExecutorService executorService = this.E0;
        if (executorService != null) {
            executorService.execute(runnable);
            return;
        }
        w6b w6b = this.F0;
        w6b.getClass();
        w6b.a.execute(new qug(w6b, str, runnable));
    }

    public final void j(String str, String str2) {
        this.J0.reportException("PCRTCClient", g63.j("reportError, ", str, " ", str2), new Exception(a81.m("peer.connection.error.", str)));
        i("reportError", new vab(this, 6));
    }

    public final void k(PeerConnection peerConnection, boolean z2) {
        voc voc = this.J0;
        try {
            l(peerConnection, z2, true, this.d1);
        } catch (IllegalStateException e) {
            voc.log("PCRTCClient", "IllegalStateException, " + this + " ex=" + e);
        } catch (Exception e2) {
            voc.log("PCRTCClient", "Exception, " + this + " ex=" + e2);
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v56, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v22, resolved type: java.util.List} */
    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void l(org.webrtc.PeerConnection r25, boolean r26, boolean r27, org.webrtc.RtpSender r28) {
        /*
            r24 = this;
            r1 = r24
            r0 = 0
            r2 = 1
            kbb r3 = r1.m1
            if (r3 != 0) goto L_0x0012
            voc r0 = r1.J0
            java.lang.String r1 = "PCRTCClient"
            java.lang.String r2 = "updatePVS(), no video settings, ignore this update"
            r0.log(r1, r2)
            return
        L_0x0012:
            java.lang.String r4 = "x"
            java.lang.String r5 = "VideoSettingCalculator"
            if (r27 == 0) goto L_0x00db
            h44 r7 = r1.n1
            v48 r8 = r1.f1
            r7.getClass()
            int r9 = r3.d
            int r10 = r3.a
            java.lang.Integer r10 = java.lang.Integer.valueOf(r10)
            java.lang.Integer[] r10 = new java.lang.Integer[]{r10}
            java.util.List r10 = kotlin.collections.CollectionsKt.mutableListOf(r10)
            int r11 = r7.g
            int r12 = r7.h
            int r13 = java.lang.Math.max(r11, r12)
            int r11 = java.lang.Math.min(r11, r12)
            java.lang.Object r12 = r7.i
            ykb r12 = (defpackage.ykb) r12
            java.lang.Integer r14 = java.lang.Integer.valueOf(r2)
            java.lang.Object r12 = r12.b
            java.util.Map r12 = (java.util.Map) r12
            java.lang.Object r12 = r12.get(r14)
            z7g r12 = (defpackage.z7g) r12
            if (r12 == 0) goto L_0x0052
            int r12 = r12.b
            goto L_0x0053
        L_0x0052:
            r12 = r0
        L_0x0053:
            java.lang.Integer r12 = java.lang.Integer.valueOf(r12)
            r10.add(r12)
            java.util.ArrayList r12 = new java.util.ArrayList
            r12.<init>()
            java.util.Iterator r10 = r10.iterator()
        L_0x0063:
            boolean r14 = r10.hasNext()
            if (r14 == 0) goto L_0x007a
            java.lang.Object r14 = r10.next()
            r15 = r14
            java.lang.Number r15 = (java.lang.Number) r15
            int r15 = r15.intValue()
            if (r15 <= 0) goto L_0x0063
            r12.add(r14)
            goto L_0x0063
        L_0x007a:
            java.lang.Comparable r10 = kotlin.collections.CollectionsKt___CollectionsKt.minOrNull(r12)
            java.lang.Integer r10 = (java.lang.Integer) r10
            if (r8 == 0) goto L_0x0085
            fhd r8 = r8.z
            goto L_0x0086
        L_0x0085:
            r8 = 0
        L_0x0086:
            if (r8 != 0) goto L_0x0089
            goto L_0x00db
        L_0x0089:
            java.lang.Object r7 = r7.e
            voc r7 = (defpackage.voc) r7
            if (r10 == 0) goto L_0x00c1
            int r12 = r10.intValue()
            if (r12 >= r13) goto L_0x00c1
            float r11 = (float) r11
            float r12 = (float) r13
            float r11 = r11 / r12
            int r12 = r10.intValue()
            float r12 = (float) r12
            float r12 = r12 * r11
            int r11 = java.lang.Math.round(r12)
            int r12 = r10.intValue()
            r8.u(r12, r11, r9)
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            java.lang.String r9 = "select screenshare dimension compressed: "
            r8.<init>(r9)
            r8.append(r10)
            r8.append(r4)
            r8.append(r11)
            java.lang.String r8 = r8.toString()
            r7.log(r5, r8)
            goto L_0x00db
        L_0x00c1:
            r8.u(r13, r11, r9)
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            java.lang.String r9 = "select screenshare dimension: "
            r8.<init>(r9)
            r8.append(r13)
            r8.append(r4)
            r8.append(r11)
            java.lang.String r8 = r8.toString()
            r7.log(r5, r8)
        L_0x00db:
            int r7 = r3.h
            int r8 = r3.d
            int r9 = r3.a
            if (r27 != 0) goto L_0x018b
            h44 r10 = r1.n1
            v48 r11 = r1.f1
            r10.getClass()
            java.lang.Integer r9 = java.lang.Integer.valueOf(r9)
            java.lang.Integer[] r9 = new java.lang.Integer[]{r9}
            java.util.List r9 = kotlin.collections.CollectionsKt.mutableListOf(r9)
            if (r11 == 0) goto L_0x00fb
            b8g r11 = r11.y
            goto L_0x00fc
        L_0x00fb:
            r11 = 0
        L_0x00fc:
            if (r11 != 0) goto L_0x0100
            goto L_0x018b
        L_0x0100:
            java.lang.Object r10 = r10.i
            ykb r10 = (defpackage.ykb) r10
            java.lang.Integer r12 = java.lang.Integer.valueOf(r0)
            java.lang.Object r10 = r10.b
            java.util.Map r10 = (java.util.Map) r10
            java.lang.Object r10 = r10.get(r12)
            z7g r10 = (defpackage.z7g) r10
            if (r10 == 0) goto L_0x0117
            int r10 = r10.b
            goto L_0x0118
        L_0x0117:
            r10 = r0
        L_0x0118:
            java.lang.Integer r10 = java.lang.Integer.valueOf(r10)
            r9.add(r10)
            java.util.ArrayList r10 = new java.util.ArrayList
            r10.<init>()
            java.util.Iterator r9 = r9.iterator()
        L_0x0128:
            boolean r12 = r9.hasNext()
            if (r12 == 0) goto L_0x013f
            java.lang.Object r12 = r9.next()
            r13 = r12
            java.lang.Number r13 = (java.lang.Number) r13
            int r13 = r13.intValue()
            if (r13 <= 0) goto L_0x0128
            r10.add(r12)
            goto L_0x0128
        L_0x013f:
            java.lang.Comparable r9 = kotlin.collections.CollectionsKt___CollectionsKt.minOrNull(r10)
            java.lang.Integer r9 = (java.lang.Integer) r9
            java.lang.Object r10 = r11.c
            voc r10 = (defpackage.voc) r10
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            java.lang.String r13 = "Set restriction to video frame max dimension: "
            r12.<init>(r13)
            r12.append(r9)
            java.lang.String r12 = r12.toString()
            java.lang.String r13 = "VideoRecord"
            r10.log(r13, r12)
            j6g r10 = r11.X
            if (r9 == 0) goto L_0x0185
            r10.getClass()
            int r12 = r9.intValue()
            if (r12 <= 0) goto L_0x0185
            int r12 = r9.intValue()
            int r13 = r10.c
            if (r12 >= r13) goto L_0x0185
            int r9 = r9.intValue()
            int r12 = r9 % 16
            int r9 = r9 - r12
            r12 = 320(0x140, float:4.48E-43)
            r13 = 4096(0x1000, float:5.74E-42)
            int r9 = kotlin.ranges.RangesKt.coerceIn((int) r9, (int) r12, (int) r13)
            java.lang.Integer r9 = java.lang.Integer.valueOf(r9)
            goto L_0x0186
        L_0x0185:
            r9 = 0
        L_0x0186:
            r10.d = r9
            r11.u()
        L_0x018b:
            h44 r9 = r1.n1
            java.lang.Object r10 = r9.j
            kbb r10 = (defpackage.kbb) r10
            java.lang.Object r11 = r9.a
            t6e r11 = (defpackage.t6e) r11
            if (r11 == 0) goto L_0x01a1
            dab r11 = r11.j
            org.webrtc.VideoCodecInfo r11 = r11.v
            if (r11 != 0) goto L_0x019e
            goto L_0x01a1
        L_0x019e:
            java.lang.String r11 = r11.name
            goto L_0x01a2
        L_0x01a1:
            r11 = 0
        L_0x01a2:
            if (r11 != 0) goto L_0x01a6
            java.lang.String r11 = "unknown"
        L_0x01a6:
            java.lang.Object r12 = r9.b
            android.content.Context r12 = (android.content.Context) r12
            java.lang.String r13 = "connectivity"
            java.lang.Object r13 = r12.getSystemService(r13)
            android.net.ConnectivityManager r13 = (android.net.ConnectivityManager) r13
            java.lang.String r14 = "phone"
            java.lang.Object r14 = r12.getSystemService(r14)
            android.telephony.TelephonyManager r14 = (android.telephony.TelephonyManager) r14
            java.lang.Object r15 = r9.d
            te1 r15 = (defpackage.te1) r15
            qe1 r15 = r15.a
            boolean r16 = defpackage.ur9.a
            android.net.NetworkInfo r13 = r13.getNetworkInfo(r2)
            if (r13 == 0) goto L_0x01d3
            boolean r13 = r13.isConnected()
            if (r13 == 0) goto L_0x01d3
            int r12 = r15.d
            int r13 = r15.h
            goto L_0x01fd
        L_0x01d3:
            int r13 = android.os.Process.myPid()
            int r6 = android.os.Process.myUid()
            java.lang.String r0 = "android.permission.READ_PHONE_STATE"
            int r0 = r12.checkPermission(r0, r13, r6)
            if (r0 == 0) goto L_0x01e8
            int r12 = r15.c
            int r13 = r15.g
            goto L_0x01fd
        L_0x01e8:
            int r0 = r14.getNetworkType()
            switch(r0) {
                case 1: goto L_0x01f9;
                case 2: goto L_0x01f9;
                case 3: goto L_0x01f4;
                case 4: goto L_0x01f9;
                case 5: goto L_0x01f4;
                case 6: goto L_0x01f4;
                case 7: goto L_0x01f9;
                case 8: goto L_0x01f4;
                case 9: goto L_0x01f4;
                case 10: goto L_0x01f4;
                case 11: goto L_0x01f9;
                case 12: goto L_0x01f4;
                case 13: goto L_0x01ef;
                case 14: goto L_0x01f4;
                case 15: goto L_0x01f4;
                default: goto L_0x01ef;
            }
        L_0x01ef:
            int r12 = r15.c
            int r13 = r15.g
            goto L_0x01fd
        L_0x01f4:
            int r12 = r15.b
            int r13 = r15.f
            goto L_0x01fd
        L_0x01f9:
            int r12 = r15.a
            int r13 = r15.e
        L_0x01fd:
            java.lang.String r0 = "; network maxBitrate="
            java.lang.String r0 = defpackage.wj6.h(r12, r0)
            java.lang.Object r6 = r9.e
            voc r6 = (defpackage.voc) r6
            if (r10 == 0) goto L_0x03c2
            if (r27 == 0) goto L_0x020e
            java.lang.String r14 = "for screenshare"
            goto L_0x0210
        L_0x020e:
            java.lang.String r14 = "for camera"
        L_0x0210:
            java.lang.String r15 = "select bitrate "
            java.lang.String r2 = " by videoSettings="
            java.lang.String r2 = defpackage.wj6.k(r15, r14, r2)
            if (r27 == 0) goto L_0x021d
            int r14 = r9.g
            goto L_0x021f
        L_0x021d:
            int r14 = r9.c
        L_0x021f:
            if (r27 == 0) goto L_0x0226
            int r15 = r9.h
        L_0x0223:
            r17 = r3
            goto L_0x0229
        L_0x0226:
            int r15 = r9.f
            goto L_0x0223
        L_0x0229:
            int r3 = java.lang.Math.max(r14, r15)
            r18 = r8
            int r8 = r10.c
            r19 = r7
            int r7 = r8 * 1000
            mbb r1 = r10.f
            if (r1 == 0) goto L_0x0315
            if (r3 <= 0) goto L_0x0315
            r20 = r13
            int r13 = r10.b
            r21 = r9
            int r9 = r10.g
            int r13 = r13 / r9
            int r9 = java.lang.Math.min(r13, r3)
            java.util.Locale r13 = java.util.Locale.ROOT
            java.lang.String r13 = r11.toLowerCase(r13)
            java.util.Map r1 = r1.a
            java.lang.Object r13 = r1.get(r13)
            java.util.List r13 = (java.util.List) r13
            if (r13 != 0) goto L_0x0267
            java.lang.String r13 = "generic"
            java.lang.Object r1 = r1.get(r13)
            r13 = r1
            java.util.List r13 = (java.util.List) r13
            if (r13 != 0) goto L_0x0267
            java.util.List r13 = kotlin.collections.CollectionsKt.emptyList()
        L_0x0267:
            boolean r1 = r13.isEmpty()
            if (r1 == 0) goto L_0x0273
            r22 = r0
            r23 = r12
            goto L_0x0313
        L_0x0273:
            java.util.Iterator r1 = r13.iterator()
        L_0x0277:
            boolean r22 = r1.hasNext()
            if (r22 == 0) goto L_0x028f
            java.lang.Object r22 = r1.next()
            r23 = r1
            r1 = r22
            lbb r1 = (defpackage.lbb) r1
            int r1 = r1.a
            if (r1 != r9) goto L_0x028c
            goto L_0x0291
        L_0x028c:
            r1 = r23
            goto L_0x0277
        L_0x028f:
            r22 = 0
        L_0x0291:
            r1 = r22
            lbb r1 = (defpackage.lbb) r1
            if (r1 == 0) goto L_0x029f
            int r1 = r1.b
            r22 = r0
            r23 = r12
            goto L_0x031f
        L_0x029f:
            ed7 r1 = new ed7
            r22 = r0
            r0 = 7
            r1.<init>(r0)
            java.util.List r0 = kotlin.collections.CollectionsKt.sortedWith(r13, r1)
            java.util.Iterator r1 = r0.iterator()
        L_0x02af:
            boolean r13 = r1.hasNext()
            if (r13 == 0) goto L_0x02c6
            java.lang.Object r13 = r1.next()
            r23 = r1
            r1 = r13
            lbb r1 = (defpackage.lbb) r1
            int r1 = r1.a
            if (r1 <= r9) goto L_0x02c3
            goto L_0x02c7
        L_0x02c3:
            r1 = r23
            goto L_0x02af
        L_0x02c6:
            r13 = 0
        L_0x02c7:
            lbb r13 = (defpackage.lbb) r13
            int r1 = r0.size()
            java.util.ListIterator r0 = r0.listIterator(r1)
        L_0x02d1:
            boolean r1 = r0.hasPrevious()
            if (r1 == 0) goto L_0x02e8
            java.lang.Object r1 = r0.previous()
            r23 = r0
            r0 = r1
            lbb r0 = (defpackage.lbb) r0
            int r0 = r0.a
            if (r0 >= r9) goto L_0x02e5
            goto L_0x02e9
        L_0x02e5:
            r0 = r23
            goto L_0x02d1
        L_0x02e8:
            r1 = 0
        L_0x02e9:
            lbb r1 = (defpackage.lbb) r1
            if (r1 == 0) goto L_0x0302
            if (r13 == 0) goto L_0x0302
            int r0 = r13.a
            r23 = r12
            int r12 = r1.a
            int r0 = r0 - r12
            int r13 = r13.b
            int r1 = r1.b
            int r13 = r13 - r1
            int r12 = r9 - r12
            int r12 = r12 * r13
            int r12 = r12 / r0
            int r12 = r12 + r1
            r1 = r12
            goto L_0x031f
        L_0x0302:
            r23 = r12
            if (r13 == 0) goto L_0x030e
            int r0 = r13.b
            int r0 = r0 * r9
            int r1 = r13.a
            int r0 = r0 / r1
        L_0x030c:
            r1 = r0
            goto L_0x031f
        L_0x030e:
            if (r1 == 0) goto L_0x0313
            int r0 = r1.b
            goto L_0x030c
        L_0x0313:
            r1 = 0
            goto L_0x031f
        L_0x0315:
            r22 = r0
            r21 = r9
            r23 = r12
            r20 = r13
            r1 = 0
            r9 = 0
        L_0x031f:
            if (r1 <= 0) goto L_0x0352
            int r0 = java.lang.Math.min(r7, r1)
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r3.append(r2)
            r3.append(r0)
            java.lang.String r2 = " by table; encoder="
            r3.append(r2)
            r3.append(r11)
            java.lang.String r2 = " maxDimensionForTable="
            r3.append(r2)
            java.lang.String r2 = " tableBitrate="
            java.lang.String r4 = " maxBitrateSetting="
            defpackage.g63.o(r3, r9, r2, r1, r4)
            r3.append(r7)
            java.lang.String r1 = r3.toString()
            r6.log(r5, r1)
            r7 = r0
        L_0x034f:
            r12 = r23
            goto L_0x03a5
        L_0x0352:
            if (r3 <= 0) goto L_0x038d
            int r0 = r10.a
            if (r3 >= r0) goto L_0x038d
            int r0 = r14 * r15
            int r0 = r0 / 256
            int r0 = r0 * 533
            double r0 = (double) r0
            r3 = 1024(0x400, float:1.435E-42)
            int r8 = r8 * r3
            double r7 = (double) r8
            double r0 = java.lang.Math.min(r0, r7)
            double r7 = (double) r3
            double r0 = r0 / r7
            int r0 = (int) r0
            int r7 = r0 * 1024
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r2)
            r0.append(r7)
            java.lang.String r1 = " by videoSize="
            r0.append(r1)
            r0.append(r14)
            r0.append(r4)
            r0.append(r15)
            java.lang.String r0 = r0.toString()
            r6.log(r5, r0)
            goto L_0x034f
        L_0x038d:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r2)
            r0.append(r7)
            java.lang.String r1 = " by maxBitrateSetting"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            r6.log(r5, r0)
            goto L_0x034f
        L_0x03a5:
            int r12 = java.lang.Math.min(r12, r7)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r1 = r22
            r0.append(r1)
            java.lang.String r1 = "; videoSettings maxBitrate="
            r0.append(r1)
            r0.append(r7)
            java.lang.String r0 = r0.toString()
            r1 = r21
            goto L_0x03cc
        L_0x03c2:
            r1 = r0
            r17 = r3
            r19 = r7
            r18 = r8
            r20 = r13
            r1 = r9
        L_0x03cc:
            java.lang.Object r1 = r1.i
            ykb r1 = (defpackage.ykb) r1
            if (r27 == 0) goto L_0x03e3
            r2 = 1
            java.lang.Integer r3 = java.lang.Integer.valueOf(r2)
            java.lang.Object r1 = r1.b
            java.util.Map r1 = (java.util.Map) r1
            java.lang.Object r1 = r1.get(r3)
            z7g r1 = (defpackage.z7g) r1
            r3 = 0
            goto L_0x03f3
        L_0x03e3:
            r2 = 1
            r3 = 0
            java.lang.Integer r4 = java.lang.Integer.valueOf(r3)
            java.lang.Object r1 = r1.b
            java.util.Map r1 = (java.util.Map) r1
            java.lang.Object r1 = r1.get(r4)
            z7g r1 = (defpackage.z7g) r1
        L_0x03f3:
            if (r1 == 0) goto L_0x0411
            int r1 = r1.a
            if (r1 <= 0) goto L_0x0411
            int r12 = java.lang.Math.min(r12, r1)
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            r4.append(r0)
            java.lang.String r0 = "; videoQualityUpdate b="
            r4.append(r0)
            r4.append(r1)
            java.lang.String r0 = r4.toString()
        L_0x0411:
            java.lang.String r1 = "getMaxBitrates() AudioBitrate="
            java.lang.String r4 = " VideoBitrate="
            r13 = r20
            java.lang.String r0 = defpackage.a81.l(r1, r13, r4, r12, r0)
            r6.log(r5, r0)
            r1 = r24
            bad r13 = r1.A0
            if (r12 <= 0) goto L_0x042a
            java.lang.Integer r0 = java.lang.Integer.valueOf(r12)
            r8 = r0
            goto L_0x042b
        L_0x042a:
            r8 = 0
        L_0x042b:
            if (r19 <= 0) goto L_0x0433
            java.lang.Integer r0 = java.lang.Integer.valueOf(r19)
            r9 = r0
            goto L_0x0434
        L_0x0433:
            r9 = 0
        L_0x0434:
            if (r18 <= 0) goto L_0x043e
            java.lang.Integer r6 = java.lang.Integer.valueOf(r18)
            r10 = r6
            r0 = r17
            goto L_0x0441
        L_0x043e:
            r0 = r17
            r10 = 0
        L_0x0441:
            java.lang.String r0 = r0.e
            if (r27 == 0) goto L_0x0449
            org.webrtc.RtpParameters$DegradationPreference r0 = org.webrtc.RtpParameters.DegradationPreference.MAINTAIN_FRAMERATE
        L_0x0447:
            r11 = r0
            goto L_0x0490
        L_0x0449:
            boolean r4 = android.text.TextUtils.isEmpty(r0)
            if (r4 != 0) goto L_0x048d
            java.lang.String r0 = r0.toLowerCase()
            r0.getClass()
            r4 = -1
            int r5 = r0.hashCode()
            switch(r5) {
                case 270940796: goto L_0x0476;
                case 1250482734: goto L_0x046b;
                case 1330699787: goto L_0x0460;
                default: goto L_0x045e;
            }
        L_0x045e:
            r0 = r4
            goto L_0x0480
        L_0x0460:
            java.lang.String r2 = "maintain-framerate"
            boolean r0 = r0.equals(r2)
            if (r0 != 0) goto L_0x0469
            goto L_0x045e
        L_0x0469:
            r0 = 2
            goto L_0x0480
        L_0x046b:
            java.lang.String r3 = "maintain-resolution"
            boolean r0 = r0.equals(r3)
            if (r0 != 0) goto L_0x0474
            goto L_0x045e
        L_0x0474:
            r0 = r2
            goto L_0x0480
        L_0x0476:
            java.lang.String r2 = "disabled"
            boolean r0 = r0.equals(r2)
            if (r0 != 0) goto L_0x047f
            goto L_0x045e
        L_0x047f:
            r0 = r3
        L_0x0480:
            switch(r0) {
                case 0: goto L_0x048a;
                case 1: goto L_0x0487;
                case 2: goto L_0x0484;
                default: goto L_0x0483;
            }
        L_0x0483:
            goto L_0x048d
        L_0x0484:
            org.webrtc.RtpParameters$DegradationPreference r0 = org.webrtc.RtpParameters.DegradationPreference.MAINTAIN_FRAMERATE
            goto L_0x0447
        L_0x0487:
            org.webrtc.RtpParameters$DegradationPreference r0 = org.webrtc.RtpParameters.DegradationPreference.MAINTAIN_RESOLUTION
            goto L_0x0447
        L_0x048a:
            org.webrtc.RtpParameters$DegradationPreference r0 = org.webrtc.RtpParameters.DegradationPreference.DISABLED
            goto L_0x0447
        L_0x048d:
            org.webrtc.RtpParameters$DegradationPreference r0 = org.webrtc.RtpParameters.DegradationPreference.BALANCED
            goto L_0x0447
        L_0x0490:
            r13.getClass()
            if (r27 == 0) goto L_0x0499
            java.lang.String r0 = "screen-share"
        L_0x0497:
            r2 = r0
            goto L_0x049c
        L_0x0499:
            java.lang.String r0 = "video"
            goto L_0x0497
        L_0x049c:
            r4 = r13
            r5 = r28
            r6 = r2
            r7 = r26
            r4.d(r5, r6, r7, r8, r9, r10, r11)     // Catch:{ all -> 0x04a6 }
            goto L_0x04b5
        L_0x04a6:
            r0 = move-exception
            r3 = r0
            java.lang.String r0 = "Error on update of sender "
            java.lang.String r0 = r0.concat(r2)
            java.lang.String r2 = "RtpSenderHelper"
            voc r4 = r13.a
            r4.reportException(r2, r0, r3)
        L_0x04b5:
            r24.v(r25)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fbb.l(org.webrtc.PeerConnection, boolean, boolean, org.webrtc.RtpSender):void");
    }

    public final void m(SessionDescription sessionDescription) {
        this.J0.log("PCRTCClient", "handleSdpCreateSuccess, " + this + ", sdp=" + sessionDescription.type);
        i("handleSdpCreateSuccess", new yug(this, new tab(this, sessionDescription, 0), 1));
    }

    public final void n(SessionDescription sessionDescription, boolean z2) {
        this.J0.log("PCRTCClient", "handleSdpSetSuccess, " + this + ", sdp=" + sessionDescription.type + ", local ? " + z2);
        i("handleSdpSetSuccess", new yug(this, new wab(this, z2, sessionDescription), 1));
    }

    public final void o(SessionDescription sessionDescription, boolean z2, String str) {
        voc voc = this.J0;
        voc.log("PCRTCClient", "handleSdpSetFailure " + sessionDescription.type + " " + z2 + " " + sessionDescription.description);
        voc.reportException("PCRTCClient", wj6.n(new StringBuilder("set."), z2 ? "local" : "remote", ".sdp.failed"), new Exception(str));
        i("onSetFailure", new rab(this, str, 0));
    }

    public final void p(boolean z2) {
        dab dab;
        this.h1 = true;
        this.l1 = false;
        this.k1 = false;
        this.Y0 = null;
        this.o1.f();
        t6e t6e = this.C0;
        if (!(t6e == null || (dab = t6e.j) == null)) {
            dab.w.remove(this);
        }
        this.B0.removeCallbacksAndMessages((Object) null);
        if (z2) {
            i("releaseInternal", new vab(this, 7));
        } else {
            i("closeInternal", new vab(this, 8));
        }
    }

    public final void q() {
        u64 u64;
        voc voc = this.J0;
        voc.log("PCRTCClient", "closeInternal, " + this);
        this.a1 = null;
        this.Z0 = null;
        this.b1 = null;
        this.d1 = null;
        v48 v48 = this.f1;
        if (v48 != null) {
            if (v48.v == this) {
                v48.v = null;
                lhd lhd = v48.u;
                if (lhd != null) {
                    lhd.b.c(new ovb(22, lhd, (Object) null));
                }
            }
            this.f1.c.remove(this);
            this.f1 = null;
        }
        q9d q9d = this.N0;
        if (q9d != null && q9d.j.compareAndSet(false, true)) {
            q9d.g.removeCallbacksAndMessages((Object) null);
            Handler handler = q9d.f;
            handler.removeCallbacksAndMessages((Object) null);
            handler.post(new c70(13, q9d));
            q9d.e.quitSafely();
        }
        n09 n09 = this.O0;
        if (n09 != null && ((AtomicBoolean) n09.x).compareAndSet(false, true)) {
            Handler handler2 = (Handler) n09.v;
            handler2.removeCallbacksAndMessages((Object) null);
            handler2.post(new c70(14, n09));
            ((HandlerThread) n09.o).quitSafely();
        }
        qpg qpg = this.c;
        if (!(qpg == null || (u64 = (u64) qpg.a) == null)) {
            msg msg = (msg) qpg.b;
            if (msg != null) {
                u64.c(msg);
            }
            qpg.a = null;
            qpg.b = null;
        }
        q9d q9d2 = this.N0;
        if (q9d2 != null) {
            try {
                q9d2.e.join(500);
            } catch (InterruptedException e) {
                this.J0.reportException("PCRTCClient", "command.exec.shutdown", e);
            }
        }
        n09 n092 = this.O0;
        if (n092 != null) {
            try {
                ((HandlerThread) n092.o).join((long) 500);
            } catch (InterruptedException e2) {
                this.J0.reportException("PCRTCClient", "notif.recv.shutdown", e2);
            }
        }
        ihd ihd = this.b;
        if (ihd != null) {
            ihd.f = true;
            for (bug bug : ihd.a.values()) {
                if (bug != null) {
                    bug.a();
                }
            }
            u64 u642 = ihd.d;
            if (u642 != null) {
                msg msg2 = ihd.g;
                if (msg2 != null) {
                    u642.c(msg2);
                }
                ihd.d = null;
                ihd.g = null;
            }
        }
        lj ljVar = this.Y;
        if (ljVar != null) {
            u64 u643 = ljVar.c;
            if (u643 != null) {
                u643.c(ljVar);
            }
            ljVar.c = null;
        }
        kk kkVar = this.z;
        if (kkVar != null) {
            kkVar.b();
        }
        kk kkVar2 = this.z;
        if (kkVar2 != null) {
            kkVar2.b();
        }
        lj ljVar2 = this.Y;
        if (ljVar2 != null) {
            u64 u644 = ljVar2.c;
            if (u644 != null) {
                u644.c(ljVar2);
            }
            ljVar2.c = null;
        }
        if (this.U0 != null) {
            this.U0.dispose();
            voc voc2 = this.J0;
            voc2.log("PCRTCClient", this + ": " + ur9.c(this.U0) + " was disposed");
            this.U0 = null;
        }
        voc voc3 = this.J0;
        voc3.log("PCRTCClient", this + ": " + ur9.c(this) + " was closed");
    }

    public final void r(IceCandidate iceCandidate) {
        this.J0.log("PCRTCClient", "addRemoteIceCandidate, " + this);
        i("addRemoteIceCandidate", new yug(this, new uab(this, iceCandidate, 0), 1));
    }

    public final void s(mz9 mz9) {
        lgd lgd = this.p1;
        if (lgd != null) {
            boolean z2 = mz9.b;
            if (z2 != this.j1) {
                this.j1 = z2;
                i("screenCaptureEnable", new x55((Object) this, (Object) mz9, (Object) lgd, 24));
                return;
            }
            return;
        }
        this.J0.reportException("PCRTCClient", "No permission provider passed", new IllegalStateException("No permission provider passed"));
    }

    public final void t() {
        MediaConstraints mediaConstraints = new MediaConstraints();
        this.W0 = mediaConstraints;
        mediaConstraints.optional.add(new MediaConstraints.KeyValuePair("DtlsSrtpKeyAgreement", "true"));
        if (this.G0 == 2) {
            this.J0.log("PCRTCClient", this + ": video capture is disabled.");
        }
        this.X0 = new MediaConstraints();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        boolean z2 = ur9.a;
        sb.append(Integer.toString(System.identityHashCode(this)));
        sb.append('@');
        int i = this.G0;
        sb.append(i != 0 ? i != 1 ? i != 2 ? "?" : "Receive" : "Send" : "SendReceive");
        sb.append("PeerConnection@");
        PeerConnection peerConnection = this.U0;
        sb.append(peerConnection != null ? Integer.toString(System.identityHashCode(peerConnection)) : "Ø");
        return sb.toString();
    }

    public final void u(PeerConnection peerConnection, boolean z2) {
        voc voc = this.J0;
        try {
            l(peerConnection, z2, false, this.Z0);
        } catch (IllegalStateException e) {
            voc.log("PCRTCClient", "IllegalStateException, " + this + " ex=" + e);
        } catch (Exception e2) {
            voc.log("PCRTCClient", "Exception, " + this + " ex=" + e2);
        }
    }

    public final void v(PeerConnection peerConnection) {
        bad bad = this.A0;
        bad.getClass();
        int e = bad.e(this.d1) + bad.e(this.Z0) + bad.e(this.b1) + bad.e(this.a1);
        peerConnection.setBitrate(6000, (Integer) null, Integer.valueOf(e));
        this.J0.log("PCRTCClient", "Bitrate constraints were set to [6000:" + e + "]");
    }

    public final void w() {
        voc voc = this.J0;
        voc.log("PCRTCClient", "createAnswer, " + this);
        this.l1 = false;
        i("createAnswer", new yug(this, new yab(this, 1), 1));
    }

    public final void x(boolean z2) {
        voc voc = this.J0;
        voc.log("PCRTCClient", "createOffer, " + this + " iceRestart=" + z2);
        this.l1 = false;
        i("createOffer", new yug(this, new qab(this, z2, 0), 1));
    }

    public final void y(List list) {
        if (w1 == null) {
            this.J0.log("PCRTCClient", "Creating peer connection without initializing factory.");
        } else if (this.i1) {
            voc voc = this.J0;
            voc.log("PCRTCClient", this + ": creation of a peer connection is already scheduled");
        } else {
            this.i1 = true;
            i("createPeerConnection", new sx8(21, this, list));
        }
    }

    public final void z() {
        voc voc = this.J0;
        voc.log("PCRTCClient", "createPeerConnectionInternal, " + this);
        if (this.V0) {
            voc voc2 = this.J0;
            voc2.log("PCRTCClient", this + ": fatal error occurred");
            return;
        }
        PeerConnectionFactory peerConnectionFactory = this.C0.d;
        if (peerConnectionFactory == null) {
            voc voc3 = this.J0;
            voc3.log("PCRTCClient", this + ": no peer connection factory");
            return;
        }
        voc voc4 = this.J0;
        voc4.log("PCRTCClient", this + ": peer connection constraints: " + this.W0.toString());
        PeerConnection.RTCConfiguration g = g(this.c1);
        if ((this.F0 == null || w6b.v.get() != w6b.o) && this.E0 == null) {
            this.B0.post(new o99(16, new RuntimeException()));
        }
        this.U0 = peerConnectionFactory.createPeerConnection(g, this.W0, (PeerConnection.Observer) new u6h(27, this));
        if (this.U0 != null) {
            if (this.G0 != 2) {
                v48 v48 = (v48) this.D0.a().b;
                this.f1 = v48;
                if (v48 != null) {
                    voc voc5 = this.J0;
                    voc5.log("PCRTCClient", this + ": has " + ur9.c(this.f1));
                    org.webrtc.Size h = this.f1.h();
                    this.x0 = h.width;
                    this.y0 = h.height;
                    ngd ngd = this.f1.t;
                    this.w0 = ngd != null ? ngd.f : 0;
                    ngd ngd2 = this.f1.t;
                    this.v0 = ngd2 != null ? ngd2.g : 0;
                    h44 h44 = this.n1;
                    h44.f = this.y0;
                    h44.c = this.x0;
                    ngd ngd3 = this.f1.t;
                    h44.h = ngd3 != null ? ngd3.f : 0;
                    h44 h442 = this.n1;
                    ngd ngd4 = this.f1.t;
                    h442.g = ngd4 != null ? ngd4.g : 0;
                    PeerConnection peerConnection = this.U0;
                    v48 v482 = this.f1;
                    List singletonList = Collections.singletonList(v482.m);
                    n60 n60 = v482.i;
                    AudioTrack audioTrack = n60 != null ? (AudioTrack) ((MediaStreamTrack) n60.v) : null;
                    if (audioTrack != null) {
                        bad bad = this.A0;
                        RtpSender addTrack = peerConnection.addTrack(audioTrack, singletonList);
                        bad.a(addTrack, MediaStreamTrack.AUDIO_TRACK_KIND);
                        this.a1 = addTrack;
                    }
                    VideoTrack videoTrack = (VideoTrack) ((MediaStreamTrack) v482.y.v);
                    if (videoTrack != null) {
                        bad bad2 = this.A0;
                        RtpSender addTrack2 = peerConnection.addTrack(videoTrack, singletonList);
                        bad2.b(addTrack2, MediaStreamTrack.VIDEO_TRACK_KIND, 30000, 2048000, (Double) null, false);
                        this.Z0 = addTrack2;
                    }
                    v(peerConnection);
                    RtpSender rtpSender = this.Z0;
                    if (this.q1 && rtpSender != null) {
                        rtpSender.setVideoEncoderObserver(new qr0((Object) this, true));
                    }
                    voc voc6 = this.J0;
                    voc6.log("PCRTCClient", this + ": " + ur9.c(this.a1) + "(audio) created");
                    voc voc7 = this.J0;
                    voc7.log("PCRTCClient", this + ": " + ur9.c(this.Z0) + "(video) created");
                    F();
                    this.f1.c.add(this);
                    if (this.t1) {
                        v48 v483 = this.f1;
                        u64 d = d("consumerScreenShare", new DataChannel.Init());
                        w48 w48 = v483.v;
                        if (w48 != null) {
                            fbb fbb = (fbb) w48;
                            fbb.J0.log("PCRTCClient", "Data channel screen capturer unbound from " + fbb);
                        }
                        v483.v = this;
                        this.J0.log("PCRTCClient", "Data channel screen capturer bound to " + this);
                        lhd lhd = v483.u;
                        if (lhd == null) {
                            lhd = new lhd(v483.a, v483.d.getApplicationContext(), v483.n, v483.E, v483.C);
                            v483.u = lhd;
                        }
                        lhd.b.c(new ovb(22, lhd, d));
                    }
                }
            }
            if (this.N0 != null) {
                u64 d2 = d("producerCommand", new DataChannel.Init());
                q9d q9d = this.N0;
                if (!q9d.j.get()) {
                    q9d.f.post(new ovb(18, q9d, d2));
                } else {
                    throw new IllegalStateException("Instance is disposed");
                }
            }
            if (this.O0 != null) {
                u64 d3 = d("producerNotification", new DataChannel.Init());
                n09 n09 = this.O0;
                if (!((AtomicBoolean) n09.x).get()) {
                    ((Handler) n09.v).post(new ovb(19, n09, d3));
                } else {
                    throw new IllegalStateException("Instance is disposed");
                }
            }
            ihd ihd = this.b;
            if (ihd != null) {
                u64 d4 = d("producerScreenShare", new DataChannel.Init());
                u64 u64 = ihd.d;
                if (u64 != null) {
                    msg msg = ihd.g;
                    if (msg != null) {
                        u64.c(msg);
                    }
                    ihd.d = null;
                    ihd.g = null;
                }
                ihd.d = d4;
                msg msg2 = new msg(3, ihd);
                ihd.g = msg2;
                d4.a(msg2);
            }
            if (this.c != null) {
                u64 d5 = d("asr", new DataChannel.Init());
                qpg qpg = this.c;
                u64 u642 = (u64) qpg.a;
                if (u642 != null) {
                    msg msg3 = (msg) qpg.b;
                    if (msg3 != null) {
                        u642.c(msg3);
                    }
                    qpg.a = null;
                    qpg.b = null;
                }
                qpg.a = d5;
                msg msg4 = new msg(1, qpg);
                qpg.b = msg4;
                d5.a(msg4);
            }
            ji jiVar = this.Z;
            if (jiVar == ji.a || jiVar == ji.c) {
                DataChannel.Init init = new DataChannel.Init();
                if (this.Z == ji.c) {
                    init.id = 1;
                    init.negotiated = true;
                }
                u64 d6 = d("animoji", init);
                kk kkVar = this.z;
                if (kkVar != null) {
                    kkVar.d(d6);
                }
                lj ljVar = this.Y;
                if (ljVar != null) {
                    u64 u643 = ljVar.c;
                    if (u643 != null) {
                        u643.c(ljVar);
                    }
                    ljVar.c = d6;
                    ic3 ic3 = ljVar.b;
                    ((AtomicInteger) ic3.v).set(0);
                    ((AtomicInteger) ic3.w).set(0);
                    d6.a(ljVar);
                }
            }
            voc voc8 = this.J0;
            voc8.log("PCRTCClient", this + ": peer connection created");
            return;
        }
        throw new IllegalStateException("peerconnection is null");
    }
}
