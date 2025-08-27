package defpackage;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Process;
import android.os.RemoteException;
import android.os.ResultReceiver;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import androidx.media3.common.VideoFrameProcessingException;
import androidx.recyclerview.widget.RecyclerView;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import one.me.android.media.service.OneMeDownloadService;
import one.me.common.drawable.SavedMessagesIconDrawable;
import org.apache.http.util.LangUtils;
import org.webrtc.AudioTrack;
import org.webrtc.IceCandidate;
import org.webrtc.MediaStream;
import org.webrtc.PeerConnection;
import ru.ok.messages.constructor.MessageConstructorView;
import ru.ok.tamtam.nano.Protos;
import ru.ok.tamtam.util.HandledException;

/* renamed from: sx8  reason: default package */
public final /* synthetic */ class sx8 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ sx8(int i, Object obj, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    public final void run() {
        swd swd;
        int i;
        boolean z = false;
        switch (this.a) {
            case 0:
                yx8 yx8 = (yx8) this.b;
                iy8 iy8 = yx8.h;
                ypb ypb = (ypb) this.c;
                yx8.s = ypb;
                wx8 wx8 = new wx8(yx8, ypb);
                ypb.v(wx8);
                yx8.u = wx8;
                try {
                    iy8.y.x(0, ypb);
                } catch (RemoteException e) {
                    i8b.p("Exception in using media1 API", e);
                }
                px8 px8 = iy8.X;
                px8.a.a.setActive(true);
                Iterator it = px8.c.iterator();
                if (!it.hasNext()) {
                    yx8.r = ypb.F0();
                    yx8.f(ypb.o());
                    return;
                }
                rae.w(it.next());
                throw null;
            case 1:
                try {
                    swd = (swd) ((zz7) this.b).get();
                    n79.k(swd, "SessionResult must not be null");
                } catch (CancellationException e2) {
                    i8b.W("Custom command cancelled", e2);
                    swd = new swd(1);
                } catch (InterruptedException | ExecutionException e3) {
                    i8b.W("Custom command failed", e3);
                    swd = new swd(-1);
                }
                ((ResultReceiver) this.c).send(swd.a, swd.b);
                return;
            case 2:
                yx8 yx82 = (yx8) this.b;
                cx8 e4 = yx82.e();
                Intent intent = (Intent) this.c;
                if (e4 == null) {
                    ComponentName component = intent.getComponent();
                    e4 = new cx8(new ly8(component != null ? component.getPackageName() : "androidx.media3.session.MediaSessionService", -1, -1), 1004001300, 6, false, (bx8) null, Bundle.EMPTY);
                }
                if (!yx82.n(e4, intent)) {
                    i8b.m("Ignored unrecognized media button intent.");
                    return;
                }
                return;
            case 3:
                ex8 ex8 = (ex8) this.c;
                zz7 zz7 = (zz7) ((HashMap) ((ef) this.b).i).remove(ex8);
                if (zz7 != null && !zz7.cancel(false)) {
                    try {
                        ((qo8) o5a.p(zz7)).release();
                    } catch (CancellationException | ExecutionException e5) {
                        i8b.W("MediaController future failed (so we couldn't release it)", e5);
                    }
                }
                ex8.a.v = null;
                return;
            case 4:
                hz8 hz8 = (hz8) this.b;
                hz8.getClass();
                IBinder asBinder = ((c67) this.c).asBinder();
                m7f m7f = hz8.e;
                cx8 k = m7f.k(asBinder);
                if (k != null) {
                    m7f.y(k);
                    return;
                }
                return;
            case 5:
                ((hz8) this.b).e.h((cx8) this.c);
                return;
            case 6:
                ek3 ek3 = ((MessageConstructorView) this.b).y;
                kne.K(ek3.w0, new ir1(16, ek3, (List) this.c));
                return;
            case 7:
                ((lf9) this.b).setLayout((jf9) this.c);
                return;
            case 8:
                vp9 vp9 = (vp9) this.b;
                vp9.getClass();
                ((ia7) this.c).i(vp9);
                return;
            case 9:
                qrf qrf = (qrf) this.b;
                qrf.getClass();
                qrf.v.a(VideoFrameProcessingException.a((InterruptedException) this.c));
                return;
            case 10:
                qrf qrf2 = (qrf) this.b;
                qrf2.getClass();
                Exception exc = (Exception) this.c;
                qrf2.v.a(exc instanceof VideoFrameProcessingException ? (VideoFrameProcessingException) exc : VideoFrameProcessingException.a(exc));
                return;
            case 11:
                ((j4a) this.b).y0.l((String) this.c);
                return;
            case 12:
                f7a f7a = (f7a) this.b;
                synchronized (f7a.b) {
                    i = f7a.a;
                }
                ((tc4) this.c).a(i);
                return;
            case 13:
                ((uc4) this.c).a(((g7a) this.b).d());
                return;
            case Protos.Attaches.Attach.LOCATION /*14*/:
                lta lta = (lta) this.b;
                ht4 ht4 = (ht4) this.c;
                try {
                    Context context = lta.a;
                    HashMap hashMap = jt4.z;
                    context.startService(new Intent(context, OneMeDownloadService.class).setAction("androidx.media3.exoplayer.downloadService.action.ADD_DOWNLOAD").putExtra("foreground", false).putExtra("download_request", ht4).putExtra("stop_reason", 0));
                    return;
                } catch (Throwable th) {
                    z68.f("OneMeDownloadController", "fail to sendAddDownload", th);
                    return;
                }
            case Protos.Attaches.Attach.DAILY_MEDIA /*15*/:
                ((InputMethodManager) ((zwa) this.b).getContext().getSystemService("input_method")).showSoftInput((EditText) this.c, 1);
                return;
            case 16:
                fbb fbb = (fbb) this.b;
                PeerConnection.SignalingState signalingState = (PeerConnection.SignalingState) this.c;
                fbb.getClass();
                fbb.k1 = signalingState == PeerConnection.SignalingState.HAVE_REMOTE_OFFER || signalingState == PeerConnection.SignalingState.HAVE_REMOTE_PRANSWER || signalingState == PeerConnection.SignalingState.STABLE;
                if (signalingState == PeerConnection.SignalingState.STABLE) {
                    z = true;
                }
                fbb.l1 = z;
                if (z) {
                    fbb.i("maybeUpdateSenders", new zug(fbb, 1));
                }
                ebb ebb = fbb.Y0;
                if (ebb != null) {
                    ebb.l(fbb, signalingState);
                    return;
                }
                return;
            case LangUtils.HASH_SEED /*17*/:
                fbb fbb2 = (fbb) this.b;
                fbb2.getClass();
                PeerConnection.IceConnectionState iceConnectionState = PeerConnection.IceConnectionState.CONNECTED;
                PeerConnection.IceConnectionState iceConnectionState2 = (PeerConnection.IceConnectionState) this.c;
                if (iceConnectionState2 == iceConnectionState) {
                    fbb2.i("maybeUpdateSenders", new zug(fbb2, 0));
                }
                ebb ebb2 = fbb2.Y0;
                if (ebb2 != null) {
                    ebb2.o(fbb2, iceConnectionState2);
                    return;
                }
                return;
            case 18:
                fbb fbb3 = (fbb) this.b;
                if (fbb3.Y0 != null) {
                    for (AudioTrack id : ((MediaStream[]) this.c)[0].audioTracks) {
                        fbb3.Y0.f(id.id());
                    }
                    return;
                }
                return;
            case 19:
                fbb fbb4 = (fbb) this.b;
                ebb ebb3 = fbb4.Y0;
                if (ebb3 != null) {
                    ebb3.m(fbb4, (IceCandidate) this.c);
                    return;
                }
                return;
            case 20:
                fbb fbb5 = (fbb) this.b;
                ebb ebb4 = fbb5.Y0;
                if (ebb4 != null) {
                    ebb4.i(fbb5, (IceCandidate[]) this.c);
                    return;
                }
                return;
            case 21:
                fbb fbb6 = (fbb) this.b;
                List list = (List) this.c;
                fbb6.getClass();
                try {
                    if (fbb6.U0 != null) {
                        fbb6.J0.log("PCRTCClient", fbb6.toString() + ": peer connection is already created");
                        return;
                    }
                    fbb6.c1 = list;
                    fbb6.t();
                    fbb6.z();
                    fbb6.B0.post(new vab(fbb6, 0));
                    return;
                } catch (Exception e6) {
                    fbb6.V0 = true;
                    fbb6.J0.reportException("PCRTCClient", "pc.create", e6);
                    throw e6;
                }
            case 22:
                o6f o6f = (o6f) this.c;
                oeb oeb = (oeb) this.b;
                oeb.getClass();
                try {
                    oeb.c(o6f.b, o6f.c, o6f.o);
                    return;
                } catch (Exception e7) {
                    z68.f("oeb", "onSyncSuccess: exception", e7);
                    ((uta) oeb.h).c(new HandledException(e7), true);
                    return;
                }
            case 23:
                ((nrb) this.b).b.f();
                Runnable runnable = (Runnable) this.c;
                if (runnable != null) {
                    runnable.run();
                    return;
                }
                return;
            case SavedMessagesIconDrawable.NORMAL_ICON_SIZE /*24*/:
                ((htb) this.b).b((RecyclerView) this.c, 0, 0);
                return;
            case 25:
                try {
                    ((ptb) this.b).i((jz9) this.c);
                    return;
                } catch (Throwable th2) {
                    z68.f("ptb", "updatePresence failure!", th2);
                    return;
                }
            case 26:
                ((aub) this.b).c((z3f) this.c);
                return;
            case 27:
                ((kub) ((yu9) this.b).b).A0.c((z3f) this.c);
                return;
            case 28:
                try {
                    ((j5a) this.b).getClass();
                    Process.setThreadPriority(10);
                } catch (Throwable unused) {
                }
                ((Runnable) this.c).run();
                return;
            default:
                k3d k3d = ((qvb) this.b).f;
                k3d.getClass();
                ev0.g();
                boolean z2 = k3d.g;
                ha7 ha7 = (ha7) this.c;
                if (z2) {
                    ha7.close();
                    return;
                }
                bs0.r("onImageCaptured() must be called before onFinalResult()", k3d.c.b.isDone());
                k3d.a();
                rc0 rc0 = k3d.a;
                rc0.getClass();
                rc0.b.execute(new s6e(10, rc0, ha7));
                return;
        }
    }
}
