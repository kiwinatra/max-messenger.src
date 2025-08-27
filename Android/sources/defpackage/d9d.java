package defpackage;

import android.app.Activity;
import android.hardware.camera2.CameraCharacteristics;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.reflect.KMutableProperty0;
import kotlin.reflect.KProperty;
import one.me.calllist.ui.callinfo.CallLinkInfoScreen;
import one.me.calls.ui.bottomsheet.more.CallMoreBottomSheet;
import one.me.calls.ui.bottomsheet.opponents.CallOpponentsListWidget;
import org.apache.http.util.LangUtils;
import org.webrtc.NativeDoubleArrayConsumer;
import ru.ok.android.externcalls.analytics.internal.api.CallAnalyticsApiRequest;
import ru.ok.android.externcalls.sdk.audio.CallsAudioDeviceInfo;
import ru.ok.android.externcalls.sdk.audio.CallsAudioManager;
import ru.ok.android.externcalls.sdk.audio.VideoTracker;
import ru.ok.messages.video.widgets.LiveVideoPlaceHolderView;

/* renamed from: d9d  reason: default package */
public final /* synthetic */ class d9d implements NativeDoubleArrayConsumer.Consumer, lma, qk3, eo1, op7, knd, hqa, mn1, VideoTracker, CallsAudioManager.OnAudioDeviceInfoChangeListener, vu {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ d9d(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    public void a(fqa fqa) {
        KProperty[] kPropertyArr = CallOpponentsListWidget.B0;
        int id = fqa.getId();
        int i = qqa.u0;
        CallOpponentsListWidget callOpponentsListWidget = (CallOpponentsListWidget) this.b;
        if (id == i) {
            he1 f0 = callOpponentsListWidget.f0();
            xag.h(f0.w0, new th1(f6e.J(((s44) ((mp1) f0.o.a).K.getValue()).d)));
        } else if (id == qqa.t0) {
            he1 f02 = callOpponentsListWidget.f0();
            xag.h(f02.w0, new ei1(f6e.J(((s44) ((mp1) f02.o.a).K.getValue()).d)));
        } else if (id == qqa.v0) {
            callOpponentsListWidget.f0().getClass();
        }
    }

    public void accept(Object obj) {
        boolean z = false;
        switch (this.a) {
            case 4:
                ((gv) this.b).G((List) obj);
                return;
            case 5:
                Long l = (Long) obj;
                vz vzVar = (vz) this.b;
                LiveVideoPlaceHolderView liveVideoPlaceHolderView = vzVar.s;
                if (liveVideoPlaceHolderView != null && liveVideoPlaceHolderView.getVisibility() == 0) {
                    if (!ld8.y0(((qra) ym.e()).y(), vzVar.i)) {
                        vzVar.s.setVisibility(8);
                    } else {
                        vzVar.s.M();
                    }
                    uz uzVar = vzVar.h;
                    if (uzVar != null) {
                        uzVar.h();
                        return;
                    }
                    return;
                }
                return;
            case 6:
                Throwable th = (Throwable) obj;
                z68.f("m00", "Can't download attach", (Throwable) null);
                ((m00) this.b).a.U0(false);
                return;
            case 7:
                ((kc3) this.b).a((mq4) obj);
                return;
            case 8:
                ((Map) this.b).putAll((Map) obj);
                return;
            case 9:
                j10 j10 = (j10) obj;
                if (j10.e != null) {
                    z = true;
                }
                if (!z && j10.d == null && j10.r == null) {
                    z68.f("t20", "Attach is not audio/video/file. Ignore", (Throwable) null);
                    return;
                } else if (j10.w == z10.c) {
                    z68.f("t20", "Try to update processingOnServerStatus from PROCESSED. Ignore", (Throwable) null);
                    return;
                } else {
                    j10.w = (z10) this.b;
                    return;
                }
            case 11:
                sj0 sj0 = (sj0) this.b;
                sj0.a.z((ao0) obj);
                sj0.a.B();
                return;
            default:
                gc1 gc1 = (gc1) this.b;
                List list = (List) obj;
                synchronized (gc1) {
                    z68.c("gc1", "onLoaded: " + list.size(), new Object[0]);
                    gc1.d = list;
                    Iterator it = gc1.f.iterator();
                    if (it.hasNext()) {
                        rae.w(it.next());
                        throw null;
                    }
                }
                return;
        }
    }

    public zz7 apply(Object obj) {
        ks1 ks1 = (ks1) this.b;
        ks1.getClass();
        if (!Boolean.TRUE.equals((Boolean) obj)) {
            return xa7.c;
        }
        long j = ks1.g;
        fm0 fm0 = new fm0(15);
        long millis = TimeUnit.NANOSECONDS.toMillis(j);
        ns1 ns1 = new ns1(fm0);
        lr1 lr1 = ks1.d;
        lr1.p(ns1);
        ir1 ir1 = new ir1(5, lr1, ns1);
        go1 go1 = ns1.b;
        go1.b.d(ir1, lr1.c);
        return m5a.F(new cr0(go1, ks1.c, millis));
    }

    public void b(boolean z) {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 21:
                tm1.S((tm1) obj, z);
                return;
            default:
                gn1.M((gn1) obj, z);
                return;
        }
    }

    public Object c(CameraCharacteristics.Key key) {
        return ((qt1) this.b).a(key);
    }

    public void consume(Double[] dArr) {
        hr6 hr6 = (hr6) this.b;
        hr6.getClass();
        ((AtomicInteger) ((ic3) hr6.c).x).incrementAndGet();
    }

    public void d() {
        e9d e9d = (e9d) this.b;
        if (e9d.f) {
            Iterator it = e9d.e().iterator();
            int i = 0;
            while (it.hasNext()) {
                xla xla = ((i9d) it.next()).a.onBackPressedCallback;
                int i2 = i + 1;
                boolean z = true;
                if (i <= 0 && e9d.e == 1) {
                    z = false;
                }
                xla.f(z);
                i = i2;
            }
        }
    }

    public jnd j(int i) {
        switch (this.a) {
            case LangUtils.HASH_SEED /*17*/:
                return ((ob1) ((lz7) ((CallLinkInfoScreen) this.b).x0.E(i))).t();
            default:
                ((kz0) ((lz7) ((CallMoreBottomSheet) this.b).Z.E(i))).getClass();
                return jnd.o;
        }
    }

    public void onAudioDeviceChanged(CallsAudioManager.AudioDeviceInfoChangedEvent audioDeviceInfoChangedEvent) {
        Object value;
        tz9 tz9 = (tz9) ((ap1) this.b).n.getValue();
        do {
            value = tz9.getValue();
            CallsAudioDeviceInfo callsAudioDeviceInfo = (CallsAudioDeviceInfo) value;
        } while (!tz9.b(value, audioDeviceInfoChangedEvent.getNewDevice()));
    }

    public void onFailure(Exception exc) {
        sq.a.getClass();
        kw3.b((Activity) this.b, rq.b);
    }

    public Object parse(sp7 sp7) {
        return ((CallAnalyticsApiRequest) this.b).lambda$getOkParser$0(sp7);
    }

    public boolean preferSpeakerOverEarpiece() {
        return ((Boolean) ((KMutableProperty0) this.b).invoke()).booleanValue();
    }

    public Object r(do1 do1) {
        switch (this.a) {
            case 10:
                m70 m70 = (m70) this.b;
                m70.a.execute(new c(11, m70, do1));
                return "AudioSource-release";
            case 25:
                lr1 lr1 = (lr1) this.b;
                lr1.getClass();
                lr1.c.execute(new c(29, lr1, do1));
                return "updateSessionConfigAsync";
            case 27:
                fs1 fs1 = (fs1) this.b;
                fs1.a.h.d(do1);
                fs1.b.b = true;
                return "AePreCapture";
            default:
                ((hs1) this.b).b.i.c();
                do1.b((Object) null);
                return "invokePostCaptureFuture";
        }
    }
}
