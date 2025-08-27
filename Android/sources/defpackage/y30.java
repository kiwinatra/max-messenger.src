package defpackage;

import android.content.Context;
import android.media.AudioDeviceInfo;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.provider.Settings;

/* renamed from: y30  reason: default package */
public final class y30 {
    public boolean a;
    public final Object b;
    public final Object c;
    public final Object d;
    public final Object e;
    public final Object f;
    public final Object g;
    public Object h;
    public Object i;
    public Object j;

    public y30(ywd ywd, g8b g8b, g8b g8b2, g8b g8b3, g8b g8b4, g8b g8b5, g8b g8b6, g8b g8b7, g8b g8b8, boolean z) {
        this.b = ywd;
        this.c = g8b;
        this.d = g8b2;
        this.e = g8b3;
        this.f = g8b4;
        this.g = g8b5;
        this.h = g8b6;
        this.i = g8b7;
        this.j = g8b8;
        this.a = z;
    }

    public void a(u30 u30) {
        q1d q1d;
        boolean z;
        lqf lqf;
        if (this.a && !u30.equals((u30) this.h)) {
            this.h = u30;
            sc4 sc4 = (sc4) ((rt3) this.c).b;
            sc4.getClass();
            Looper myLooper = Looper.myLooper();
            Looper looper = sc4.i0;
            if (looper != myLooper) {
                throw new IllegalStateException(rae.p("Current looper (", myLooper == null ? "null" : myLooper.getThread().getName(), ") is not the playback looper (", looper == null ? "null" : looper.getThread().getName(), ")"));
            } else if (!u30.equals(sc4.x)) {
                sc4.x = u30;
                e4 e4Var = sc4.s;
                if (e4Var != null) {
                    ln8 ln8 = (ln8) e4Var.b;
                    synchronized (ln8.a) {
                        q1d = ln8.z0;
                    }
                    if (q1d != null) {
                        sj4 sj4 = (sj4) q1d;
                        synchronized (sj4.c) {
                            z = sj4.g.w0;
                        }
                        if (z && (lqf = sj4.a) != null) {
                            ((fd5) lqf).y.f(26);
                        }
                    }
                }
            }
        }
    }

    public void b(AudioDeviceInfo audioDeviceInfo) {
        g40 g40 = (g40) this.i;
        g40 g402 = null;
        if (!v0g.a(audioDeviceInfo, g40 == null ? null : g40.a)) {
            if (audioDeviceInfo != null) {
                g402 = new g40(audioDeviceInfo);
            }
            this.i = g402;
            a(u30.b((Context) this.b, (i30) this.j, g402));
        }
    }

    public y30(Context context, rt3 rt3, i30 i30, g40 g40) {
        Uri uri;
        Context applicationContext = context.getApplicationContext();
        this.b = applicationContext;
        this.c = rt3;
        this.j = i30;
        this.i = g40;
        x30 x30 = null;
        Handler p = v0g.p((xp4) null);
        this.d = p;
        int i2 = v0g.a;
        this.e = i2 >= 23 ? new w30(this) : null;
        this.f = i2 >= 21 ? new ao(1, this) : null;
        u30 u30 = u30.c;
        String str = v0g.c;
        if ("Amazon".equals(str) || "Xiaomi".equals(str)) {
            uri = Settings.Global.getUriFor("external_surround_sound_enabled");
        } else {
            uri = null;
        }
        this.g = uri != null ? new x30(this, p, applicationContext.getContentResolver(), uri) : x30;
    }
}
