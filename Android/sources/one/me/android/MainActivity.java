package one.me.android;

import android.app.Activity;
import android.content.Intent;
import android.content.res.Configuration;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.SystemClock;
import android.view.KeyEvent;
import android.view.View;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import one.me.android.root.RootController;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003:\u0001\u0006B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, d2 = {"Lone/me/android/MainActivity;", "Lm5;", "Lt7d;", "Lg9;", "<init>", "()V", "js9", "oneme_playGoogleRelease"}, k = 1, mv = {2, 0, 0})
@SourceDebugExtension({"SMAP\nMainActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MainActivity.kt\none/me/android/MainActivity\n+ 2 Tag.kt\nru/ok/tamtam/logger/TagKt\n+ 3 Log.kt\nru/ok/tamtam/logger/Log\n+ 4 ContextExt.kt\none/me/common/ext/ContextExtKt\n*L\n1#1,320:1\n295#1,4:326\n295#1,4:335\n5#2:321\n5#2:330\n32#3,4:322\n32#3,4:331\n23#4:339\n*S KotlinDebug\n*F\n+ 1 MainActivity.kt\none/me/android/MainActivity\n*L\n160#1:326,4\n190#1:335,4\n83#1:321\n186#1:330\n83#1:322,4\n186#1:331,4\n278#1:339\n*E\n"})
public final class MainActivity extends m5 implements t7d, g9 {
    public static final  int E0 = 0;
    public final boolean A0 = true;
    public o81 B0;
    public final i25 C0;
    public final ec8 D0;
    public e9d z0;

    public MainActivity() {
        qra qra = qra.a;
        this.C0 = (i25) qra.getAccessor().g(i25.class);
        ec8 ec8 = (ec8) qra.getAccessor().g(ec8.class);
        this.D0 = ec8;
        ec8.getClass();
        ybb ybb = ybb.MAIN_ACTIVITY_INIT_TO_RENDER;
        ec8.e.k(ybb, new xbb(ybb, SystemClock.elapsedRealtime()));
        ec8.h = true;   
    }

    public final String E() {
        return null;
    }

    public final void H(int i, int i2, Intent intent) {
        if (i == 102 && i2 != 0) {
            ((meb) ((deb) qra.a.getAccessor().g(deb.class))).c();
            q8.P(this, new z0b(new o0b(cad.o), q8.p(rkc.oneme_contact_saved_snackbar_title, this), (CharSequence) null, v0b.a, new n0b(0, 0, 7)));
        }
    }

    public final void J() {
    }

    public final void T() {

        throw new UnsupportedOperationException("Method not decompiled: one.me.android.MainActivity.T():void");
    }

    public final e9d h() {
        e9d e9d = this.z0;
        if (e9d != null) {
            return e9d;
        }
        return null;
    }

    public final boolean i() {
        return this.A0;
    }

    public final void onCreate(Bundle bundle) {
        String name = MainActivity.class.getName();
        a67 a67 = z68.b;
        if (a67 != null && a67.c()) {
            w78 w78 = w78.o;
            Uri data = getIntent().getData();
            a67.d(w78, name, "@deep_link: onCreate: intent.data = " + data, (Throwable) null);
        }
        this.D0.d(getIntent());
        oz1 a = kv0.a(this);
        a.setId(dgc.root);
        b0h.H(a, new mh0((Object) this, (Continuation) null, 8));
        getWindow().setSoftInputMode(Build.VERSION.SDK_INT >= 30 ? 48 : 16);
        setContentView((View) a);
        hz4.a(this);
        super.onCreate(bundle);
        e9d e = cvg.e(this, a, bundle);
        e.e = 1;
        e.Q(false);
        this.z0 = e;
        RootController i = q8.i(this);
        qra qra = qra.a;
        qra.z().f(new vra(17, this, i));
        q8.Q(this, (Intent) null);
        h2g h2g = h2g.a;
        h2g.c().getClass();
        h2g.c().getClass();
        o81 o81 = (o81) qra.getAccessor().g(o81.class);
        getOnBackPressedDispatcher().a(this, o81.w0);
        z68.c("PipAppController", "CallIndicatorAppController attached", new Object[0]);
        o81.x = this;
        o81.c().a((k81) o81.v0.getValue());
        o81.h(true);
        ((mp1) o81.a).I.add((j81) o81.Z.getValue());
        o81.o.c(o81);
        this.B0 = o81;
        bs0.K(new ps5(((x88) qra.getAccessor().g(x88.class)).stream(), new vb8(this, (Continuation) null), 5), i8b.t(getLifecycle()));
        ev0.v(i8b.t(getLifecycle()), (CoroutineContext) null, (f14) null, new xb8(this, (Continuation) null), 3);
        bs0.K(new ps5(this.C0.a(), new yb8(this, (Continuation) null), 5), i8b.t(getLifecycle()));
        setIntent((Intent) null);
    }

    public final void onDestroy() {
        super.onDestroy();
        o81 o81 = this.B0;
        if (o81 != null) {
            z68.c("PipAppController", "CallIndicatorAppController dettached", new Object[0]);
            o81.x = null;
            o81.c().K((k81) o81.v0.getValue());
            ((mp1) o81.a).I.remove((j81) o81.Z.getValue());
            o81.o.a().remove(o81);
        }
    }

    public final boolean onKeyDown(int i, KeyEvent keyEvent) {
        s61 s61 = (s61) ((o81) qra.a.getAccessor().g(o81.class)).v.getValue();
        boolean q = ((mp1) ((dp1) s61.a.getValue())).q();
        boolean z = keyEvent.getAction() == 0 && (keyEvent.getKeyCode() == 24 || keyEvent.getKeyCode() == 25);
        if (!z || !q) {
            z68.c("HandleSilenceMode", "skip handle buttons, isIncoming=" + q + " isNeededAction=" + z, new Object[0]);
        } else {
            s61.a();
        }
        return super.onKeyDown(i, keyEvent);
    }

    public final void onNewIntent(Intent intent) {
        String name = MainActivity.class.getName();
        a67 a67 = z68.b;
        if (a67 != null && a67.c()) {
            w78 w78 = w78.o;
            Uri data = intent.getData();
            a67.d(w78, name, "@deep_link: onNewIntent: intent.data = " + data, (Throwable) null);
        }
        this.D0.d(intent);
        super.onNewIntent(intent);
        q8.b(q8.i(this));
        qra.a.z().f(new vra(16, this, intent));
        q8.Q(this, intent);
        setIntent((Intent) null);
    }

    public final void onPause() {
        super.onPause();
        rz9 rz9 = zh7.a;
        Object[] objArr = rz9.b;
        long[] jArr = rz9.a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i = 0;
            while (true) {
                long j = jArr[i];
                if ((((~j) << 7) & j & -9187201950435737472L) != -9187201950435737472L) {
                    int i2 = 8 - ((~(i - length)) >>> 31);
                    for (int i3 = 0; i3 < i2; i3++) {
                        if ((255 & j) < 128) {
                            ((hne) objArr[(i << 3) + i3]).g = true;
                        }
                        j >>= 8;
                    }
                    if (i2 != 8) {
                        return;
                    }
                }
                if (i != length) {
                    i++;
                } else {
                    return;
                }
            }
        }
    }

    public final void onPictureInPictureModeChanged(boolean z, Configuration configuration) {
        o81 o81;
        Activity activity;
        super.onPictureInPictureModeChanged(z, configuration);
        if (!z && (o81 = this.B0) != null && (activity = o81.x) != null) {
            z68.c("PipAppController", "hide global pip", new Object[0]);
            o81.j(false);
            e9d c = o81.c();
            i9d i9d = (i9d) CollectionsKt.lastOrNull(c.e());
            if (!Intrinsics.areEqual((Object) i9d != null ? i9d.b : null, (Object) ":call-pip")) {
                z68.c("PipAppController", "last screen wasn't pip, skip navigation to call.", new Object[0]);
            } else if (((mp1) o81.a).p() && !eq1.a(c)) {
                z68.c("PipAppController", "open active call after pip mode.", new Object[0]);
                zb8.b.W0().b(":call-active", (Bundle) null);
            }
            zx3 g = c.g(":call-pip");
            if (g != null) {
                c.B(g);
                if (!c.n()) {
                    activity.finish();
                }
            }
        }
    }

    public final void onResume() {
        super.onResume();
        qra qra = qra.a;
        ((uc7) qra.getAccessor().g(uc7.class)).getClass();
        tc7 tc7 = uc7.b;
        if (tc7 != null) {
            qc7 r = qra.r();
            if (r != null) {
                r.k = tc7.e;
            }
            Unit unit = Unit.INSTANCE;
        }
        zh7.a();
    }

    public final void onStart() {
        super.onStart();
        T();
    }

    public final void onStop() {
        super.onStop();
        qra qra = qra.a;
        ((uc7) qra.getAccessor().g(uc7.class)).getClass();
        if (uc7.b != null) {
            qc7 r = qra.r();
            if (r != null) {
                r.k = null;
            }
            Unit unit = Unit.INSTANCE;
        }
    }

    public final void onUserLeaveHint() {
        super.onUserLeaveHint();
        o81 o81 = this.B0;
        if (o81 != null) {
            o81.i();
        }
    }

    public final void onWindowFocusChanged(boolean z) {
        super.onWindowFocusChanged(z);
        if (z) {
            zh7.a();
        }
    }
}