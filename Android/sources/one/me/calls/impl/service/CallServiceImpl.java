package one.me.calls.impl.service;

import android.app.Application;
import android.app.Notification;
import android.app.PendingIntent;
import android.app.Service;
import android.content.Intent;
import android.graphics.Bitmap;
import android.media.session.MediaSession;
import android.media.session.PlaybackState;
import android.os.Build;
import android.os.Handler;
import android.os.IBinder;
import java.util.Set;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.SetsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.enums.EnumEntries;
import kotlin.jvm.internal.Intrinsics;
import kotlin.uuid.Uuid;
import one.me.android.calls.CallNotifierBroadcastReceiver;
import one.me.android.calls.CallNotifierFixActivity;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0006"}, d2 = {"Lone/me/calls/impl/service/CallServiceImpl;", "Landroid/app/Service;", "<init>", "()V", "mj1", "nj1", "calls-impl_release"}, k = 1, mv = {2, 0, 0})
public final class CallServiceImpl extends Service {
    public static final Set X;
    public static final nj1 y = new Object();
    public static Handler z;
    public final Lazy a = LazyKt.lazy(new v11(25));
    public final Lazy b = LazyKt.lazy(new v11(26));
    public final Lazy c = LazyKt.lazy(new v11(27));
    public final Lazy o = LazyKt.lazy(new v11(28));
    public final Lazy v = LazyKt.lazy(new v11(29));
    public final Lazy w = LazyKt.lazy(new lj1(0));
    public MediaSession x;

    /* JADX WARNING: type inference failed for: r0v0, types: [nj1, java.lang.Object] */
    static {
        Set createSetBuilder = SetsKt.createSetBuilder();
        createSetBuilder.add(-1);
        createSetBuilder.add(2);
        createSetBuilder.add(32);
        if (Build.VERSION.SDK_INT >= 30) {
            createSetBuilder.add(Integer.valueOf(Uuid.SIZE_BITS));
            createSetBuilder.add(64);
        }
        X = SetsKt.build(createSetBuilder);
    }

    public final kq1 a() {
        return (kq1) this.a.getValue();
    }

    public final void b(int i, Notification notification, boolean z2, boolean z3) {
        int i2;
        Lazy lazy = this.v;
        int i3 = 2;
        try {
            if (Build.VERSION.SDK_INT < 34) {
                i2 = -1;
            } else {
                i2 = ((edb) lazy.getValue()).b(edb.h) ? 130 : 2;
                if (((edb) lazy.getValue()).b(edb.l)) {
                    i2 |= 64;
                }
                if (((kgd) this.o.getValue()).c() || z3) {
                    i2 |= 32;
                }
            }
            z68.c("CallServiceTag", "CallService start foreground with particular types: " + nj1.a(i2), new Object[0]);
            a().a();
            startForeground(i, notification, i2);
            z68.c("CallServiceTag", "CallService crosscheck types: " + nj1.a(getForegroundServiceType()), new Object[0]);
        } catch (Throwable th) {
            z68.f("CallServiceTag", "CallService can't start foreground service due to " + th.getMessage() + ". Try to start with simple permissions.", th);
            try {
                if (Build.VERSION.SDK_INT < 34) {
                    i3 = -1;
                }
                startForeground(i, notification, i3);
                z68.c("CallServiceTag", "CallService started with types: " + nj1.a(getForegroundServiceType()), new Object[0]);
            } catch (Exception unused) {
                z68.f("CallServiceTag", "CallService can't start foreground service. Try show usual notification isIncoming=" + z2 + ".", th);
                if (z2) {
                    kq1 a2 = a();
                    a2.getClass();
                    z68.c("CallsNotification", "showNotification id=" + i + " notification", new Object[0]);
                    a2.e().a((String) null, i, notification);
                }
            }
        }
    }

    public final void c(s44 s44, y11 y11, boolean z2) {
        PendingIntent broadcast;
        PendingIntent pendingIntent;
        boolean z3;
        PendingIntent broadcast2;
        s44 s442 = s44;
        y11 y112 = y11;
        boolean z4 = z2;
        boolean areEqual = Intrinsics.areEqual((Object) y112, (Object) y11.f);
        boolean z5 = s442.g;
        ld9 ld9 = s442.a;
        if (areEqual) {
            z68.c("CallServiceTag", "CallService show default push due to chat info is empty.", new Object[0]);
            b(239, a().c(this, y112, ld9 != null ? ld9.J() : false, z5), true, z4);
            return;
        }
        Class<CallNotifierFixActivity> cls = CallNotifierFixActivity.class;
        Class<CallNotifierBroadcastReceiver> cls2 = CallNotifierBroadcastReceiver.class;
        if (!z5 || s442.f) {
            boolean z6 = z4;
            z68.c("CallServiceTag", "CallService show active notification.", new Object[0]);
            kq1 a2 = a();
            CharSequence charSequence = y112.b;
            String obj = charSequence != null ? charSequence.toString() : null;
            a2.getClass();
            z68.c("CallsNotification", "showActiveCallNotification", new Object[0]);
            ((pwa) a2.e.getValue()).l();
            if (obj == null) {
                obj = (String) a2.g.getValue();
            }
            Bitmap bitmap = (Bitmap) ev0.C(EmptyCoroutineContext.INSTANCE, new iq1(a2, y112.c, (Continuation) null));
            ((ed4) a2.d.getValue()).getClass();
            eda eda = new eda(this, "ru.oneme.app.new.activeCalls");
            eda.k = -1;
            eda.v = "call";
            eda.F.icon = ((Number) a2.k.getValue()).intValue();
            Lazy lazy = a2.j;
            eda.f = eda.c((String) lazy.getValue());
            eda.e = eda.c(obj);
            y91 d = a2.d();
            eda.g = d.a(d.c(), new h9(20));
            eda.i(2, true);
            y91 d2 = a2.d();
            eda.h = d2.a(d2.c(), new h9(20));
            eda.i(Uuid.SIZE_BITS, false);
            Application c2 = a2.d().c();
            if (o2g.a >= 31) {
                Intent intent = new Intent(c2, cls);
                intent.setAction("action-finished-call");
                Unit unit = Unit.INSTANCE;
                broadcast = PendingIntent.getActivity(c2, 0, intent, 201326592);
            } else {
                Intent intent2 = new Intent(c2, cls2);
                intent2.setAction("action-finished-call");
                Unit unit2 = Unit.INSTANCE;
                broadcast = PendingIntent.getBroadcast(c2, 0, intent2, 201326592);
            }
            PendingIntent pendingIntent2 = broadcast;
            if (pendingIntent2 != null) {
                eda.q(new jda(2, kq1.b(obj, (String) lazy.getValue(), bitmap), pendingIntent2, (PendingIntent) null, (PendingIntent) null));
            }
            b(239, eda.b(), false, z6);
            return;
        }
        z68.c("CallServiceTag", "CallService show incoming notification.", new Object[0]);
        kq1 a3 = a();
        boolean J = ld9 != null ? ld9.J() : false;
        a3.getClass();
        z68.c("CallsNotification", "showIncomingCallNotification", new Object[0]);
        CharSequence charSequence2 = y112.b;
        if (charSequence2 == null) {
            charSequence2 = (String) a3.g.getValue();
        }
        Bitmap bitmap2 = (Bitmap) ev0.C(EmptyCoroutineContext.INSTANCE, new jq1(a3, y112, (Continuation) null));
        ((ed4) a3.d.getValue()).getClass();
        eda eda2 = new eda(this, "ru.oneme.app.new.incomingCalls.");
        eda2.F.icon = J ? ((Number) a3.l.getValue()).intValue() : ((Number) a3.k.getValue()).intValue();
        eda2.e = eda.c(charSequence2);
        Lazy lazy2 = a3.h;
        Lazy lazy3 = a3.i;
        eda2.f = eda.c(J ? (String) lazy3.getValue() : (String) lazy2.getValue());
        eda2.k = 2;
        eda2.i(2, true);
        eda2.i(16, true);
        Application c3 = a3.d().c();
        int i = o2g.a;
        if (i >= 31) {
            Intent intent3 = new Intent(c3, cls);
            y91.b(intent3, y112, J);
            Unit unit3 = Unit.INSTANCE;
            z3 = false;
            pendingIntent = PendingIntent.getActivity(c3, 0, intent3, 201326592);
        } else {
            z3 = false;
            Intent intent4 = new Intent(c3, cls2);
            y91.b(intent4, y112, J);
            Unit unit4 = Unit.INSTANCE;
            pendingIntent = PendingIntent.getBroadcast(c3, 0, intent4, 201326592);
        }
        eda2.h = pendingIntent;
        eda2.i(Uuid.SIZE_BITS, true);
        eda2.l = z3;
        eda2.v = "call";
        y91 d3 = a3.d();
        PendingIntent a4 = d3.a(d3.c(), new x91(d3, y112, J));
        if (a4 != null) {
            Application c4 = a3.d().c();
            if (i >= 31) {
                Intent intent5 = new Intent(c4, cls);
                intent5.setAction("action-decline-call");
                broadcast2 = PendingIntent.getActivity(c4, 0, intent5, 201326592);
            } else {
                Intent intent6 = new Intent(c4, cls2);
                intent6.setAction("action-decline-call");
                broadcast2 = PendingIntent.getBroadcast(c4, 0, intent6, 201326592);
            }
            PendingIntent pendingIntent3 = broadcast2;
            if (pendingIntent3 != null) {
                eda2.q(new jda(1, kq1.b(charSequence2, J ? (String) lazy3.getValue() : (String) lazy2.getValue(), bitmap2), (PendingIntent) null, pendingIntent3, a4));
            }
        }
        b(240, eda2.b(), true, z2);
    }

    public final /* bridge */ /* synthetic */ IBinder onBind(Intent intent) {
        return null;
    }

    public final void onCreate() {
        super.onCreate();
        z68.c("CallServiceTag", "CallService onCreate", new Object[0]);
        s44 s44 = (s44) ((mp1) ((dp1) this.b.getValue())).K.getValue();
        y11 y11 = (y11) ((k21) ((a21) this.c.getValue())).k.getValue();
        kq1 a2 = a();
        ld9 ld9 = s44.a;
        b(239, a2.c(this, y11, ld9 != null ? ld9.J() : false, s44.g), true, false);
    }

    public final void onDestroy() {
        z68.c("CallServiceTag", "service call onDestroy", new Object[0]);
        a().a();
        MediaSession mediaSession = this.x;
        if (mediaSession != null) {
            mediaSession.release();
            z68.c("CallServiceTag", "media session stop", new Object[0]);
        }
    }

    public final int onStartCommand(Intent intent, int i, int i2) {
        z68.c("CallServiceTag", "CallService onStartCommand", new Object[0]);
        Lazy lazy = this.b;
        s44 s44 = (s44) ((mp1) ((dp1) lazy.getValue())).K.getValue();
        y11 y11 = (y11) ((k21) ((a21) this.c.getValue())).k.getValue();
        if (!s44.g || ((mp1) ((dp1) lazy.getValue())).p()) {
            MediaSession mediaSession = this.x;
            if (mediaSession != null) {
                mediaSession.release();
                z68.c("CallServiceTag", "media session stop", new Object[0]);
            }
        } else if (this.x == null) {
            pj1 pj1 = new pj1(this);
            MediaSession mediaSession2 = new MediaSession(this, "CallServiceTag");
            mediaSession2.setFlags(3);
            mediaSession2.setPlaybackState(new PlaybackState.Builder().setState(3, 0, c44.DEFAULT_ASPECT_RATIO).build());
            mediaSession2.setPlaybackToRemote(pj1);
            mediaSession2.setCallback(new MediaSession.Callback());
            mediaSession2.setActive(true);
            this.x = mediaSession2;
            z68.c("CallServiceTag", "media session started", new Object[0]);
        }
        if (intent != null) {
            EnumEntries enumEntries = mj1.w;
            if (enumEntries.get(intent.getIntExtra("ACTION", 0)) != mj1.b) {
                if (enumEntries.get(intent.getIntExtra("ACTION", 0)) == mj1.a) {
                    z68.c("CallServiceTag", "CallService start.", new Object[0]);
                    return 2;
                }
                me5 me5 = s44.j;
                if ((me5 instanceof he5) || (me5 instanceof ge5) || (me5 instanceof ie5)) {
                    z68.c("CallServiceTag", "CallService finished due to call is failed or finished.", new Object[0]);
                    nj1.c().postDelayed(new l40(this, i2, 3), 500);
                    return 2;
                } else if (enumEntries.get(intent.getIntExtra("ACTION", 0)) == mj1.c) {
                    z68.c("CallServiceTag", "CallService restart.", new Object[0]);
                    c(s44, y11, false);
                    return 2;
                } else if (enumEntries.get(intent.getIntExtra("ACTION", 0)) == mj1.o) {
                    z68.c("CallServiceTag", "CallService restart for screen sharing.", new Object[0]);
                    c(s44, y11, true);
                    return 2;
                } else {
                    z68.c("CallServiceTag", "CallService simple start, no action.", new Object[0]);
                    return 2;
                }
            }
        }
        z68.c("CallServiceTag", "CallService finished.", new Object[0]);
        nj1.c().postDelayed(new l40(this, -1, 3), 500);
        return 2;
    }
}
