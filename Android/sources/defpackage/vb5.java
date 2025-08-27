package defpackage;

import android.content.Context;
import android.os.Looper;
import ru.ok.android.externcalls.analytics.internal.upload.MultiFileUploader;
import ru.ok.android.externcalls.sdk.audio.internal.impl3.CallsAudioManagerV3Impl;

/* renamed from: vb5  reason: default package */
public final class vb5 {
    public final Context a;
    public c7f b;
    public final s2f c;
    public s2f d;
    public s2f e;
    public s2f f;
    public final s2f g;
    public final yi6 h;
    public Looper i;
    public final int j;
    public final i30 k;
    public final int l;
    public final boolean m;
    public final und n;
    public final long o;
    public final long p;
    public final long q;
    public final qg4 r;
    public long s;
    public final long t;
    public boolean u;
    public boolean v;
    public final String w;

    public vb5(Context context) {
        this(context, new tb5(context, 0), new tb5(context, 1));
    }

    public final tc5 a() {
        n79.n(!this.v);
        this.v = true;
        return new tc5(this);
    }

    public vb5(Context context, s2f s2f, s2f s2f2) {
        tb5 tb5 = new tb5(context, 5);
        ad3 ad3 = new ad3(4);
        tb5 tb52 = new tb5(context, 7);
        lw4 lw4 = new lw4(9);
        context.getClass();
        this.a = context;
        this.c = s2f;
        this.d = s2f2;
        this.e = tb5;
        this.f = ad3;
        this.g = tb52;
        this.h = lw4;
        this.i = v0g.w();
        this.k = i30.g;
        this.l = 1;
        this.m = true;
        this.n = und.c;
        this.o = MultiFileUploader.UPLOAD_NEXT_INTERVAL;
        this.p = 15000;
        this.q = CallsAudioManagerV3Impl.USED_DEVICE_RECOVER_TIMEOUT_MS;
        this.r = new qg4(1, v0g.S(20), 0.999f, v0g.S(500));
        this.b = c7f.a;
        this.s = 500;
        this.t = 2000;
        this.u = true;
        this.w = "";
        this.j = -1000;
    }
}
