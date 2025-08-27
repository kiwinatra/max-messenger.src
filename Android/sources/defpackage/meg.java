package defpackage;

import android.net.Uri;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import java.util.Locale;
import java.util.Set;
import java.util.concurrent.ExecutorService;
import org.apache.http.cookie.ClientCookie;
import ru.ok.android.externcalls.analytics.internal.upload.AbstractUploader;
import ru.ok.android.externcalls.sdk.api.ApiProtocol;
import ru.ok.android.externcalls.sdk.n;
import ru.ok.android.externcalls.sdk.stat.signaling.SignalingStat;

/* renamed from: meg  reason: default package */
public final class meg {
    public final Runnable a;
    public final Object b = new Object();
    public jlg c;
    public final Handler d;
    public final Object e = new Object();
    public boolean f;
    public final ExecutorService g;
    public volatile String h;
    public long i;
    public volatile long j = SystemClock.elapsedRealtime();
    public final boolean k;
    public volatile long l = 0;
    public xv1 m;
    public final SignalingStat n;
    public final rla o;
    public final a75 p;
    public final xe8 q;
    public long r;

    public meg(long j2, n nVar, SignalingStat signalingStat, ExecutorService executorService, voc voc, woc woc, rla rla, boolean z, a75 a75) {
        Uri.Builder buildUpon = Uri.parse(a75.d).buildUpon();
        String str = a75.c;
        if (str != null) {
            buildUpon.appendQueryParameter("userId", str);
        }
        buildUpon.appendQueryParameter(ApiProtocol.KEY_TOKEN, a75.b).appendQueryParameter(ApiProtocol.PARAM_CONVERSATION_ID, a75.a);
        if (a75.h >= 6) {
            buildUpon.appendQueryParameter("deviceIdx", String.valueOf(a75.o));
        }
        Long l2 = a75.f;
        if (l2 != null) {
            buildUpon.appendQueryParameter(ApiProtocol.PARAM_PEER_ID, String.valueOf(l2));
        }
        Locale locale = a75.n;
        if (locale != null) {
            buildUpon.appendQueryParameter("locale", locale.getLanguage());
        }
        this.h = c(buildUpon, a75);
        this.i = j2;
        this.a = nVar;
        this.n = signalingStat;
        this.g = executorService;
        this.o = rla;
        this.r = 20000;
        this.k = z;
        this.p = a75;
        this.q = new xe8(24, voc, woc);
        this.d = new Handler(Looper.myLooper(), new xp4(7, this));
        a("init");
    }

    public static String c(Uri.Builder builder, a75 a75) {
        Uri.Builder appendQueryParameter = builder.appendQueryParameter(ClientCookie.VERSION_ATTR, Integer.toString(a75.h)).appendQueryParameter("capabilities", a75.i);
        Uri.Builder appendQueryParameter2 = appendQueryParameter.appendQueryParameter("device", Build.MANUFACTURER + "/" + Build.MODEL).appendQueryParameter("platform", AbstractUploader.SDK_TYPE_STRING).appendQueryParameter("clientType", a75.g).appendQueryParameter("appVersion", a75.e).appendQueryParameter("osVersion", String.valueOf(Build.VERSION.SDK_INT)).appendQueryParameter("ispAsOrg", a75.k).appendQueryParameter("locCc", a75.l).appendQueryParameter("locReg", a75.m);
        Integer num = a75.j;
        if (num != null) {
            appendQueryParameter2.appendQueryParameter("ispAsNo", String.valueOf(num));
        }
        return appendQueryParameter2.build().toString();
    }

    public static String e(String str, String str2, String str3) {
        Uri.Builder builder;
        Uri parse = Uri.parse(str);
        Set<String> queryParameterNames = parse.getQueryParameterNames();
        if (queryParameterNames.contains(str2)) {
            builder = parse.buildUpon().clearQuery();
            for (String next : queryParameterNames) {
                if (str2.equals(next)) {
                    builder.appendQueryParameter(next, str3);
                } else {
                    builder.appendQueryParameter(next, parse.getQueryParameter(next));
                }
            }
        } else {
            builder = parse.buildUpon();
            builder.appendQueryParameter(str2, str3);
        }
        return builder.build().toString();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:24:0x007a, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(java.lang.String r10) {
        /*
            r9 = this;
            java.lang.String r0 = "not connecting, lastPongTime = "
            xe8 r1 = r9.q
            java.lang.String r2 = "connect, "
            java.lang.String r10 = r2.concat(r10)
            r1.v(r10)
            long r1 = r9.r
            r3 = 0
            int r10 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r10 <= 0) goto L_0x001b
            android.os.Handler r10 = r9.d
            r1 = 2
            r10.removeMessages(r1)
        L_0x001b:
            java.lang.Object r10 = r9.e
            monitor-enter(r10)
            boolean r1 = r9.f     // Catch:{ all -> 0x002b }
            if (r1 == 0) goto L_0x002d
            xe8 r9 = r9.q     // Catch:{ all -> 0x002b }
            java.lang.String r0 = "cant connect because released"
            r9.v(r0)     // Catch:{ all -> 0x002b }
            monitor-exit(r10)     // Catch:{ all -> 0x002b }
            return
        L_0x002b:
            r9 = move-exception
            goto L_0x007b
        L_0x002d:
            long r1 = android.os.SystemClock.elapsedRealtime()     // Catch:{ all -> 0x002b }
            long r5 = r9.j     // Catch:{ all -> 0x002b }
            int r3 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r3 == 0) goto L_0x0069
            long r3 = r1 - r5
            long r7 = r9.i     // Catch:{ all -> 0x002b }
            int r3 = (r3 > r7 ? 1 : (r3 == r7 ? 0 : -1))
            if (r3 > 0) goto L_0x0040
            goto L_0x0069
        L_0x0040:
            ru.ok.android.externcalls.sdk.stat.signaling.SignalingStat r3 = r9.n     // Catch:{ all -> 0x002b }
            r3.onTimeout()     // Catch:{ all -> 0x002b }
            xe8 r3 = r9.q     // Catch:{ all -> 0x002b }
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ all -> 0x002b }
            r4.<init>(r0)     // Catch:{ all -> 0x002b }
            r4.append(r5)     // Catch:{ all -> 0x002b }
            java.lang.String r0 = " time = "
            r4.append(r0)     // Catch:{ all -> 0x002b }
            r4.append(r1)     // Catch:{ all -> 0x002b }
            java.lang.String r0 = r4.toString()     // Catch:{ all -> 0x002b }
            r3.v(r0)     // Catch:{ all -> 0x002b }
            java.lang.Runnable r0 = r9.a     // Catch:{ all -> 0x002b }
            if (r0 == 0) goto L_0x0065
            r0.run()     // Catch:{ all -> 0x002b }
        L_0x0065:
            r9.b()     // Catch:{ all -> 0x002b }
            goto L_0x0079
        L_0x0069:
            ru.ok.android.externcalls.sdk.stat.signaling.SignalingStat r0 = r9.n     // Catch:{ all -> 0x002b }
            r0.onConnect()     // Catch:{ all -> 0x002b }
            java.util.concurrent.ExecutorService r0 = r9.g     // Catch:{ all -> 0x002b }
            leg r1 = new leg     // Catch:{ all -> 0x002b }
            r2 = 0
            r1.<init>(r9, r2)     // Catch:{ all -> 0x002b }
            r0.execute(r1)     // Catch:{ all -> 0x002b }
        L_0x0079:
            monitor-exit(r10)     // Catch:{ all -> 0x002b }
            return
        L_0x007b:
            monitor-exit(r10)     // Catch:{ all -> 0x002b }
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.meg.a(java.lang.String):void");
    }

    public final void b() {
        this.q.v("transport.dispose");
        synchronized (this.e) {
            try {
                if (!this.f) {
                    this.f = true;
                    this.d.removeCallbacksAndMessages((Object) null);
                    this.g.execute(new leg(this, 1));
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void d() {
        this.q.v("handleDisconnected");
        if (this.r > 0) {
            this.d.removeMessages(2);
        }
        synchronized (this.b) {
            this.c = null;
        }
        synchronized (this.e) {
            try {
                if (!this.f) {
                    this.d.sendEmptyMessageDelayed(1, 2000);
                }
            } catch (Throwable th) {
                while (true) {
                    throw th;
                }
            }
        }
        xv1 xv1 = this.m;
        if (xv1 != null) {
            synchronized (((o9e) xv1.b).f) {
                ((o9e) xv1.b).r = false;
            }
        }
    }

    public final void f(String str) {
        this.g.execute(new keg(this, str, 0));
    }
}
