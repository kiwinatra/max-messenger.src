package defpackage;

import android.view.View;
import com.google.android.material.sidesheet.SideSheetBehavior;
import com.my.tracker.obfuscated.i2;
import java.io.IOException;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.concurrent.ScheduledFuture;
import one.me.calls.impl.service.CallServiceImpl;
import one.me.sdk.lists.widgets.EndlessRecyclerView;
import org.apache.http.util.LangUtils;
import org.webrtc.HardwareVideoEncoder;
import org.webrtc.SurfaceTextureHelper;
import org.webrtc.VpxDecoderWrapper;
import ru.ok.messages.calls.views.FinishedCallControlsView;
import ru.ok.tamtam.nano.Protos;

/* renamed from: l40  reason: default package */
public final /* synthetic */ class l40 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ l40(Object obj, int i, int i2) {
        this.a = i2;
        this.c = obj;
        this.b = i;
    }

    public final void run() {
        List<lk4> list;
        ScheduledFuture scheduledFuture;
        q55 q55;
        su1 c2;
        int i = 2;
        int i2 = 1;
        switch (this.a) {
            case 0:
                n40 n40 = (n40) ((m40) this.c).c;
                n40.getClass();
                int i3 = this.b;
                if (i3 == -3 || i3 == -2) {
                    if (i3 != -2) {
                        h30 h30 = (h30) n40.i;
                        if (!(h30 != null && h30.a == 1)) {
                            n40.c(3);
                            return;
                        }
                    }
                    mc5 mc5 = (mc5) n40.h;
                    if (mc5 != null) {
                        sc5 sc5 = mc5.a;
                        boolean q = sc5.q();
                        if (q) {
                            i2 = 2;
                        }
                        sc5.D1(0, i2, q);
                    }
                    n40.c(2);
                    return;
                } else if (i3 == -1) {
                    mc5 mc52 = (mc5) n40.h;
                    if (mc52 != null) {
                        sc5 sc52 = mc52.a;
                        boolean q2 = sc52.q();
                        if (!q2) {
                            i = 1;
                        }
                        sc52.D1(-1, i, q2);
                    }
                    n40.a();
                    return;
                } else if (i3 == 1) {
                    n40.c(1);
                    mc5 mc53 = (mc5) n40.h;
                    if (mc53 != null) {
                        sc5 sc53 = mc53.a;
                        sc53.D1(1, 1, sc53.q());
                        return;
                    }
                    return;
                } else {
                    return;
                }
            case 1:
                n40 n402 = (n40) ((m40) this.c).c;
                n402.getClass();
                int i4 = this.b;
                if (i4 == -3 || i4 == -2) {
                    if (i4 != -2) {
                        i30 i30 = (i30) n402.i;
                        if (!(i30 != null && i30.a == 1)) {
                            n402.c(4);
                            return;
                        }
                    }
                    nc5 nc5 = (nc5) n402.h;
                    if (nc5 != null) {
                        tc5 tc5 = nc5.a;
                        tc5.G1(0, 1, tc5.q());
                    }
                    n402.c(3);
                    return;
                } else if (i4 == -1) {
                    nc5 nc52 = (nc5) n402.h;
                    if (nc52 != null) {
                        tc5 tc52 = nc52.a;
                        tc52.G1(-1, 2, tc52.q());
                    }
                    n402.a();
                    n402.c(1);
                    return;
                } else if (i4 != 1) {
                    i2a.m(i4, "Unknown focus change type: ");
                    return;
                } else {
                    n402.c(2);
                    nc5 nc53 = (nc5) n402.h;
                    if (nc53 != null) {
                        tc5 tc53 = nc53.a;
                        tc53.G1(1, 1, tc53.q());
                        return;
                    }
                    return;
                }
            case 2:
                iu0 iu0 = (iu0) this.c;
                int i5 = iu0.l;
                int i6 = this.b;
                if (i5 != i6) {
                    int i7 = iu0.h;
                    iu0.l = (i6 / i7) * i7;
                    return;
                }
                return;
            case 3:
                nj1 nj1 = CallServiceImpl.y;
                CallServiceImpl callServiceImpl = (CallServiceImpl) this.c;
                if (!((mp1) ((dp1) callServiceImpl.b.getValue())).o()) {
                    dud.a(callServiceImpl, 1);
                    callServiceImpl.stopSelfResult(this.b);
                    return;
                }
                return;
            case 4:
                ((bt1) this.c).a(this.b);
                return;
            case 5:
                ((eu1) this.c).b = this.b;
                return;
            case 6:
                int i8 = this.b;
                Iterator it = ((LinkedHashSet) this.c).iterator();
                while (it.hasNext()) {
                    u6f u6f = (u6f) ((t6f) it.next());
                    if (i8 == 5) {
                        synchronized (u6f.o) {
                            try {
                                if (u6f.l() && (list = u6f.p) != null) {
                                    for (lk4 a2 : list) {
                                        a2.a();
                                    }
                                }
                            } finally {
                            }
                        }
                    } else {
                        u6f.getClass();
                    }
                }
                return;
            case 7:
                fa4 fa4 = (fa4) this.c;
                fa4.getClass();
                VpxDecoderWrapper.DecoderKind decoderKind = VpxDecoderWrapper.DecoderKind.values()[tr1.y(this.b)];
                VpxDecoderWrapper vpxDecoderWrapper = fa4.a;
                vpxDecoderWrapper.init(decoderKind);
                vpxDecoderWrapper.setFrameHandler(fa4);
                vpxDecoderWrapper.setErrorCallback(fa4);
                vpxDecoderWrapper.setDesiredFps(10);
                return;
            case 8:
                e65 e65 = (e65) this.c;
                boolean z = e65.j;
                g65 g65 = e65.k;
                if (z) {
                    String str = g65.a;
                    return;
                }
                switch (tr1.y(g65.D)) {
                    case 0:
                    case 7:
                    case 8:
                        return;
                    case 1:
                    case 2:
                    case 3:
                    case 4:
                    case 5:
                    case 6:
                        g65.k.offer(Integer.valueOf(this.b));
                        g65.c();
                        return;
                    default:
                        throw new IllegalStateException("Unknown state: ".concat(g63.s(g65.D)));
                }
            case 9:
                int i9 = EndlessRecyclerView.h2;
                ((EndlessRecyclerView) this.c).S0(this.b + 1);
                return;
            case 10:
                ((FinishedCallControlsView) this.c).b.setTextColor(this.b);
                return;
            case 11:
                ((HardwareVideoEncoder) this.c).lambda$deliverEncodedImage$0(this.b);
                return;
            case 12:
                ((np8) this.c).j.remove(Integer.valueOf(this.b));
                return;
            case 13:
                dc9 dc9 = (dc9) this.c;
                int i10 = this.b;
                if (i10 == -1) {
                    dc9.getClass();
                    return;
                }
                bc9 bc9 = dc9.c;
                bc9.setSelection(Math.min(i10, bc9.length()));
                return;
            case Protos.Attaches.Attach.LOCATION /*14*/:
                lyc lyc = (lyc) this.c;
                int i11 = lyc.g0;
                int i12 = this.b;
                lyc.g0 = i12;
                if (i11 == i12) {
                    return;
                }
                if (i12 == 3) {
                    if (lyc.B == null) {
                        mo4 mo4 = lyc.e0;
                        if (mo4 != null) {
                            if (!mo4.b) {
                                mo4.b = true;
                                ScheduledFuture scheduledFuture2 = (ScheduledFuture) mo4.f;
                                if (scheduledFuture2 != null) {
                                    scheduledFuture2.cancel(false);
                                    mo4.f = null;
                                }
                            }
                            lyc.e0 = null;
                        }
                        lyc.v(false);
                        return;
                    }
                    lyc.Z = true;
                    zb0 zb0 = lyc.q;
                    if (zb0 != null && !zb0.Z) {
                        lyc.s(zb0, 4, (IOException) null);
                        return;
                    }
                    return;
                } else if (i12 == 2 && (scheduledFuture = lyc.Y) != null && scheduledFuture.cancel(false) && (q55 = lyc.F) != null) {
                    lyc.r(q55);
                    return;
                } else {
                    return;
                }
            case Protos.Attaches.Attach.DAILY_MEDIA /*15*/:
                ((vzg) this.c).z(this.b);
                return;
            case 16:
                h8d h8d = (h8d) this.c;
                if (h8d.c.get()) {
                    eu1 eu1 = (eu1) h8d.a.b;
                    g87 g87 = eu1.e;
                    int i13 = this.b;
                    if (g87.z(i13) && (c2 = g87.c()) != null) {
                        g87.o.a = g87.h(c2, false);
                    }
                    y87 y87 = eu1.d;
                    int Y = ((x97) y87.f).Y(0);
                    if (y87.z(i13) && y87.s != null) {
                        y87.s = ld9.D(Math.abs(kne.N(i13) - kne.N(Y)), y87.s);
                    }
                    r3g r3g = eu1.f;
                    if (r3g.z(i13)) {
                        r3g.N();
                        return;
                    }
                    return;
                }
                return;
            case LangUtils.HASH_SEED /*17*/:
                SideSheetBehavior sideSheetBehavior = (SideSheetBehavior) this.c;
                View view = (View) sideSheetBehavior.p.get();
                if (view != null) {
                    sideSheetBehavior.z(this.b, view, false);
                    return;
                }
                return;
            case 18:
                ((SurfaceTextureHelper) this.c).lambda$setFrameRotation$4(this.b);
                return;
            default:
                ((i2) this.c).c(this.b);
                return;
        }
    }
}
