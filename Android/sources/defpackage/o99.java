package defpackage;

import android.app.Activity;
import android.os.Handler;
import android.view.View;
import android.view.ViewGroup;
import androidx.camera.video.internal.compat.quirk.DeactivateEncoderSurfaceBeforeStopEncoderQuirk;
import androidx.media3.transformer.ExportException;
import java.lang.ref.WeakReference;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Lazy;
import kotlin.collections.CollectionsKt;
import kotlin.ranges.RangesKt;
import one.me.common.drawable.SavedMessagesIconDrawable;
import one.me.rlottie.RLottieDrawable;
import one.me.rlottie.c;
import org.apache.http.util.LangUtils;
import org.webrtc.VideoSink;
import org.webrtc.VideoTrack;
import ru.ok.android.externcalls.sdk.participant.state.internal.ParticipantStatesListenerProxy;
import ru.ok.android.externcalls.sdk.record.internal.RecordManagerImpl;
import ru.ok.messages.constructor.MessageConstructorView;
import ru.ok.tamtam.nano.Protos;

/* renamed from: o99  reason: default package */
public final /* synthetic */ class o99 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ o99(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    public final void run() {
        int i = 0;
        switch (this.a) {
            case 0:
                k0a k0a = ((p99) this.b).f;
                if (k0a != null && k0a.U()) {
                    l2a l2a = (l2a) k0a.a;
                    if (l2a.w0 == 2) {
                        l2a.d0(Collections.unmodifiableList(k0a.v.g));
                        return;
                    }
                    return;
                }
                return;
            case 1:
                int i2 = MessageConstructorView.U0;
                MessageConstructorView messageConstructorView = (MessageConstructorView) this.b;
                if (messageConstructorView.getContext() instanceof Activity) {
                    hd8.B((Activity) messageConstructorView.getContext());
                    return;
                }
                return;
            case 2:
                rf9 rf9 = (rf9) this.b;
                if (!((doa) rf9.b.getValue()).e()) {
                    z68.f("rf9", "restoreUploads: not authorized", (Throwable) null);
                    return;
                }
                z68.c("rf9", "restoreUploadsFromStorage", new Object[0]);
                try {
                    for (qf9 d : (List) ((yf9) rf9.a.getValue()).a().c(CollectionsKt.emptyList())) {
                        ((gl5) rf9.c.getValue()).d(d);
                    }
                    return;
                } catch (Throwable th) {
                    z68.f("rf9", "restoreUploadsFromStorage failure!", th);
                    return;
                }
            case 3:
                qrf qrf = (qrf) ((vs6) this.b).b;
                qrf.v.e(qrf.D0);
                return;
            case 4:
                ((xx9) this.b).getClass();
                return;
            case 5:
                xy9 xy9 = (xy9) this.b;
                Handler handler = xy9.s;
                o99 o99 = xy9.t;
                if (handler != null) {
                    handler.removeCallbacks(o99);
                }
                qo8 qo8 = xy9.o;
                long j = 0;
                long h = qo8 != null ? qo8.h() : 0;
                qo8 qo82 = xy9.o;
                if (qo82 != null) {
                    j = qo82.T();
                }
                Long valueOf = Long.valueOf(h);
                xme xme = xy9.u;
                xme.getClass();
                xme.m((Object) null, valueOf);
                Long valueOf2 = Long.valueOf(j);
                xme xme2 = xy9.w;
                xme2.getClass();
                xme2.m((Object) null, valueOf2);
                Float valueOf3 = Float.valueOf(RangesKt.coerceIn((float) (((double) h) / ((double) xy9.G)), (float) c44.DEFAULT_ASPECT_RATIO, 1.0f));
                xme xme3 = xy9.J;
                xme3.getClass();
                xme3.m((Object) null, valueOf3);
                Handler handler2 = xy9.s;
                if (handler2 != null) {
                    handler2.postDelayed(o99, 17);
                    return;
                }
                return;
            case 6:
                g0a g0a = (g0a) this.b;
                if (!g0a.p) {
                    g0a.p = true;
                    bpa bpa = g0a.c;
                    long j2 = g0a.h;
                    LinkedHashMap linkedHashMap = p94.a;
                    synchronized (p94.class) {
                    }
                    Locale locale = Locale.US;
                    ExportException d2 = ExportException.d(new IllegalStateException(wj6.j(j2, "Abort: no output sample written in the last ", " milliseconds. DebugTrace: \"Tracing disabled\"")), 7002);
                    prf prf = ((lrf) bpa.b).r;
                    prf.getClass();
                    prf.g();
                    prf.j.b(d2, 4, 2, 0).b();
                    return;
                }
                return;
            case 7:
                ((m0a) this.b).X();
                return;
            case 8:
                k1a k1a = (k1a) this.b;
                k1a.getClass();
                k1a.V(new j1a(k1a));
                return;
            case 9:
                ((b4a) this.b).d0(false);
                return;
            case 10:
                ((b4a) ((z3a) this.b).b).p0();
                return;
            case 11:
                qma qma = (qma) this.b;
                boolean isAlive = qma.o.isAlive();
                View view = qma.a;
                if (isAlive) {
                    qma.o.removeOnPreDrawListener(qma);
                } else {
                    view.getViewTreeObserver().removeOnPreDrawListener(qma);
                }
                view.removeOnAttachStateChangeListener(qma);
                return;
            case 12:
                ((AtomicBoolean) this.b).set(true);
                return;
            case 13:
                j50 j50 = (j50) this.b;
                ViewGroup viewGroup = (ViewGroup) ((WeakReference) j50.c).get();
                if (viewGroup != null) {
                    viewGroup.removeView((f6f) j50.v);
                }
                j50.v = null;
                j50.w = null;
                return;
            case Protos.Attaches.Attach.LOCATION /*14*/:
                ParticipantStatesListenerProxy.raiseRunnable$lambda$0((ParticipantStatesListenerProxy) this.b);
                return;
            case Protos.Attaches.Attach.DAILY_MEDIA /*15*/:
                d9b d9b = (d9b) this.b;
                synchronized (d9b) {
                    while (i < d9b.w.size()) {
                        try {
                            ((VideoTrack) d9b.w.get(i)).removeSink((VideoSink) d9b.x.get(i));
                            ((VideoTrack) d9b.w.get(i)).removeSink((VideoSink) d9b.y.get(i));
                            i++;
                        } catch (Throwable th2) {
                            ((voc) d9b.b).log("ParticipantsAgnosticVideoTracks", "close error: " + th2.getMessage());
                        }
                    }
                }
                return;
            case 16:
                throw ((RuntimeException) this.b);
            case LangUtils.HASH_SEED /*17*/:
                vlb vlb = (vlb) this.b;
                if (((doa) vlb.c.getValue()).e() && ((fn4) vlb.b.getValue()).d()) {
                    z68.c("vlb", "processScheduledPing: app is visible, ping and schedule", new Object[0]);
                    ((jna) ((rl) vlb.a.getValue())).O(true);
                    vlb.a();
                    rvd.A((jqg) vlb.d.getValue());
                    return;
                }
                return;
            case 18:
                z68.c("ev0", "execute()", new Object[0]);
                ((yd7) ((s48) ((Lazy) this.b).getValue())).g();
                z68.c("ev0", "repository prefetch ok", new Object[0]);
                return;
            case 19:
                ((bub) this.b).o();
                return;
            case 20:
                ivb ivb = (ivb) this.b;
                int i3 = ivb.b;
                lv7 lv7 = ivb.w;
                if (i3 == 0) {
                    ivb.c = true;
                    lv7.e(hu7.ON_PAUSE);
                }
                if (ivb.a == 0 && ivb.c) {
                    lv7.e(hu7.ON_STOP);
                    ivb.o = true;
                    return;
                }
                return;
            case 21:
                jwb jwb = ((kwb) this.b).v;
                if (jwb != null) {
                    jwb.w();
                    return;
                }
                return;
            case 22:
                RLottieDrawable rLottieDrawable = ((qoc) this.b).b;
                try {
                    c cVar = rLottieDrawable.q1;
                    if (cVar != null) {
                        cVar.b();
                    }
                } catch (Throwable unused) {
                }
                RLottieDrawable.F1.post(rLottieDrawable.p1);
                return;
            case 23:
                ((apc) this.b).L();
                return;
            case SavedMessagesIconDrawable.NORMAL_ICON_SIZE /*24*/:
                ((urc) this.b).d.a0();
                return;
            case 25:
                RecordManagerImpl.onRecordStarted$lambda$5((RecordManagerImpl) this.b);
                return;
            case 26:
                q55 q55 = (q55) this.b;
                if (on4.a.g(DeactivateEncoderSurfaceBeforeStopEncoderQuirk.class) != null) {
                    lyc.r(q55);
                    return;
                }
                return;
            case 27:
                mo4 mo4 = (mo4) ((p7d) this.b).c;
                if (!mo4.b) {
                    lyc lyc = (lyc) mo4.g;
                    Objects.toString(lyc.F);
                    nr4 nr4 = lyc.a0;
                    nr4.e();
                    hd8.J((zz7) nr4.k).d(new x55((Object) mo4, (Object) (z3f) mo4.d, (Object) (xjf) mo4.e, 28), lyc.e);
                    return;
                }
                return;
            case 28:
                ((d8d) this.b).a.release();
                return;
            default:
                ((e9d) this.b).A();
                return;
        }
    }
}
