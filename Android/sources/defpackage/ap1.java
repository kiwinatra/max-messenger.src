package defpackage;

import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.time.Duration;
import kotlin.time.DurationKt;
import kotlin.time.DurationUnit;
import ru.ok.android.externcalls.sdk.AudioLevelListener;
import ru.ok.android.externcalls.sdk.audio.CallsAudioDeviceInfo;
import ru.ok.android.externcalls.sdk.audio.CallsAudioManager;
import ru.ok.android.externcalls.sdk.audio.MicrophoneManager;
import ru.ok.android.externcalls.sdk.video.CameraManager;

/* renamed from: ap1  reason: default package */
public final class ap1 {
    public final dp1 a;
    public final m01 b;
    public final by4 c;
    public final h9b d;
    public final q11 e;
    public final a21 f;
    public final nq1 g;
    public final kgd h;
    public final ahd i;
    public final p9c j;
    public final Lazy k;
    public final xme l;
    public final etc m;
    public final Lazy n = LazyKt.lazy(new uo1(this, 0));
    public final Lazy o = LazyKt.lazy(new uo1(this, 1));
    public final Lazy p = LazyKt.lazy(new lj1(14));
    public final f94 q;
    public final Lazy r;
    public final Lazy s;
    public final Lazy t;

    public ap1(dp1 dp1, m01 m01, by4 by4, h9b h9b, q11 q11, a21 a21, nq1 nq1, kgd kgd, ahd ahd, p9c p9c, cp1 cp1, Lazy lazy) {
        this.a = dp1;
        this.b = m01;
        this.c = by4;
        this.d = h9b;
        this.e = q11;
        this.f = a21;
        this.g = nq1;
        this.h = kgd;
        this.i = ahd;
        this.j = p9c;
        this.k = lazy;
        xme a2 = f6e.a(new zm1((ze1) null, (ze1) null, (ze1) null, true, vag.b));
        this.l = a2;
        this.m = new etc(a2);
        int i2 = f94.g;
        Duration.Companion companion = Duration.Companion;
        this.q = new f94(new c94(DurationKt.toDuration(10, DurationUnit.SECONDS)), new si0(2, new uo1(this, 2)), (Function1) null, xfd.a());
        this.r = LazyKt.lazy(new uo1(this, 3));
        this.s = LazyKt.lazy(new uo1(this, 4));
        this.t = LazyKt.lazy(new uo1(this, 5));
        ((mp1) dp1).I.add(new vo1(this));
        bs0.K(new ps5(new on2(bs0.w(new pc(c(), 22)), 28), new wo1(this, (Continuation) null), 5), cp1);
    }

    public final void a(vag vag) {
        xme xme;
        Object value;
        do {
            xme = this.l;
            value = xme.getValue();
        } while (!xme.b(value, zm1.a((zm1) value, (ze1) null, (ze1) null, (ze1) null, vag, 15)));
    }

    public final s44 b() {
        return (s44) ((mp1) this.a).K.getValue();
    }

    public final ome c() {
        return ((v9b) this.d).Y;
    }

    public final void d(boolean z) {
        if (!this.h.c()) {
            CameraManager a2 = this.e.a();
            if (a2 != null) {
                a2.setCameraEnabled(z);
            }
            CallsAudioManager callsAudioManager = (CallsAudioManager) ((o01) this.b).c.get();
            if (callsAudioManager != null) {
                CallsAudioManager.setSpeakerEnabledAsync$default(callsAudioManager, z, false, (Function0) null, (Function1) null, 12, (Object) null);
            }
        }
    }

    public final void e(ze1 ze1, boolean z) {
        xme xme;
        Object value;
        zm1 zm1;
        ze1 ze12;
        do {
            xme = this.l;
            value = xme.getValue();
            zm1 = (zm1) value;
            ze12 = (!z && Intrinsics.areEqual((Object) zm1.a, (Object) ze1)) ? null : ze1;
        } while (!xme.b(value, zm1.a(zm1, ze12, (ze1) null, (ze1) null, ze12 != null ? vag.b : zm1.e, 14)));
    }

    public final void f(ze1 ze1) {
        xme xme;
        Object value;
        do {
            xme = this.l;
            value = xme.getValue();
        } while (!xme.b(value, zm1.a((zm1) value, (ze1) null, ze1, (ze1) null, (vag) null, 29)));
    }

    public final void g() {
        tq1 tq1 = (tq1) this.k.getValue();
        String str = b().c;
        q11 q11 = this.e;
        int i2 = q11.b() ? 2 : 1;
        boolean z = b().h;
        tq1.getClass();
        tq1.a(tq1, "CAMERA_CHANGED", str, (String) null, Integer.valueOf(i2), (String) null, (String) null, z, 52);
        cv1 cv1 = q11.b() ? cv1.b : cv1.a;
        CameraManager a2 = q11.a();
        if (a2 != null) {
            a2.switchCamera(new dv1(cv1));
        }
    }

    public final void h(CallsAudioDeviceInfo callsAudioDeviceInfo) {
        tq1 tq1 = (tq1) this.k.getValue();
        String str = b().c;
        int i2 = xo1.$EnumSwitchMapping$0[callsAudioDeviceInfo.getDeviceType().ordinal()];
        String str2 = i2 != 1 ? i2 != 2 ? "HEADPHONES" : "DYNAMIC" : "PHONE";
        boolean z = b().h;
        tq1.getClass();
        tq1.a(tq1, "SPEAKER_MODE_CHANGED", str, str2, (Integer) null, (String) null, (String) null, z, 56);
        CallsAudioManager callsAudioManager = (CallsAudioManager) ((o01) this.b).c.get();
        if (callsAudioManager != null) {
            CallsAudioManager.setAudioDeviceAsync$default(callsAudioManager, callsAudioDeviceInfo, (Function0) null, (Function1) null, 6, (Object) null);
        }
    }

    public final void i() {
        Object value;
        o01 o01;
        tz9 tz9 = (tz9) this.n.getValue();
        do {
            value = tz9.getValue();
            CallsAudioDeviceInfo callsAudioDeviceInfo = (CallsAudioDeviceInfo) value;
            o01 = (o01) this.b;
        } while (!tz9.b(value, o01.b()));
        d9d d9d = new d9d(24, this);
        CallsAudioManager callsAudioManager = (CallsAudioManager) o01.c.get();
        if (callsAudioManager != null) {
            callsAudioManager.setOnAudioDeviceChangeListener(d9d);
        }
    }

    public final void j() {
        AudioLevelListener audioLevelListener = (AudioLevelListener) this.s.getValue();
        o01 o01 = (o01) this.b;
        o01.getClass();
        try {
            MicrophoneManager c2 = o01.c();
            if (c2 != null) {
                c2.registerAudioSampleCallback(250, audioLevelListener);
            }
        } catch (Exception e2) {
            String message = e2.getMessage();
            z68.o("CallAudioController", "CallAudioController can't register mic audio listener due to: " + message + ".", e2);
        }
    }
}
