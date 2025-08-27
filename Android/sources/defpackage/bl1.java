package defpackage;

import android.content.Context;
import android.net.ConnectivityManager;
import android.telephony.TelephonyManager;
import java.util.concurrent.TimeUnit;
import ru.ok.android.externcalls.analytics.CallAnalyticsSender;
import ru.ok.android.externcalls.analytics.internal.upload.MultiFileUploader;

/* renamed from: bl1  reason: default package */
public final class bl1 {
    public final p7d a;
    public final d6a b;
    public final nfd c;
    public final rt6 d;
    public final zqd e;
    public final tgg f;
    public final m7f g;
    public final xk1 h;
    public final fx i;
    public final d51 j;
    public volatile boolean k;
    public final q01 l;
    public final h8 m;

    /* JADX WARNING: type inference failed for: r3v5, types: [java.lang.Object, m7f] */
    public bl1(Context context, p7d p7d, sjf sjf, ConnectivityManager connectivityManager, TelephonyManager telephonyManager, voc voc, ny0 ny0, lz3 lz3) {
        p7d p7d2 = p7d;
        sjf sjf2 = sjf;
        ConnectivityManager connectivityManager2 = connectivityManager;
        TelephonyManager telephonyManager2 = telephonyManager;
        voc voc2 = voc;
        this.a = p7d2;
        d6a d6a = new d6a(13, (Object) ny0);
        this.b = d6a;
        nfd nfd = new nfd(9);
        this.c = nfd;
        rt6 rt6 = new rt6(13, (Object) lz3);
        this.d = rt6;
        zqd zqd = new zqd(18, connectivityManager2, telephonyManager2);
        this.e = zqd;
        this.f = new tgg(p7d, connectivityManager2, telephonyManager2, voc2);
        ? obj = new Object();
        obj.a = p7d2;
        obj.b = connectivityManager2;
        obj.c = telephonyManager2;
        obj.o = new Object();
        this.g = obj;
        this.h = new xk1(p7d, voc, d6a, nfd, rt6, zqd, sjf);
        fx fxVar = new fx();
        this.i = fxVar;
        CallAnalyticsSender callAnalyticsSender = (CallAnalyticsSender) p7d2.c;
        d51 d51 = new d51(callAnalyticsSender, sjf2);
        this.j = d51;
        Context context2 = context;
        this.l = new q01(callAnalyticsSender, new zc4(context, voc2, sjf2), sjf2);
        this.m = new h8(d51, sjf2);
        or7 or7 = (or7) fxVar.c;
        if (or7 != null) {
            qq4.a(or7);
        }
        fxVar.c = jha.o(MultiFileUploader.UPLOAD_NEXT_INTERVAL, MultiFileUploader.UPLOAD_NEXT_INTERVAL, TimeUnit.MILLISECONDS, xfd.b()).v(new p3a((Object) fxVar));
    }
}
