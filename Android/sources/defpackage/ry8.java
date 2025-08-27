package defpackage;

import android.app.Service;
import android.content.Intent;
import android.media.session.MediaSessionManager;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import android.os.RemoteException;
import android.text.TextUtils;
import java.util.Iterator;
import one.me.android.media.service.OneMeMediaSessionService;

/* renamed from: ry8  reason: default package */
public abstract class ry8 extends Service {
    public final Object a = new Object();
    public final Handler b = new Handler(Looper.getMainLooper());
    public final ts c = new qae(0);
    public qy8 o;
    public ef v;
    public ah4 w;
    public ni0 x;

    public final void a(ex8 ex8) {
        ex8 ex82;
        boolean z = true;
        n79.f("session is already released", !ex8.a.i());
        synchronized (this.a) {
            ex82 = (ex8) this.c.get(ex8.a.i);
            if (ex82 != null) {
                if (ex82 != ex8) {
                    z = false;
                }
            }
            n79.f("Session ID should be unique", z);
            this.c.put(ex8.a.i, ex8);
        }
        if (ex82 == null) {
            v0g.W(this.b, new x55((Object) this, (Object) c(), (Object) ex8, 17));
        }
    }

    public final ni0 b() {
        ni0 ni0;
        synchronized (this.a) {
            try {
                if (this.x == null) {
                    this.x = new ni0(5, (Object) this);
                }
                ni0 = this.x;
            } catch (Throwable th) {
                throw th;
            }
        }
        return ni0;
    }

    public final ef c() {
        ef efVar;
        synchronized (this.a) {
            try {
                if (this.v == null) {
                    if (this.w == null) {
                        ur0 ur0 = new ur0(getApplicationContext());
                        n79.n(!ur0.c);
                        ah4 ah4 = new ah4(ur0);
                        ur0.c = true;
                        this.w = ah4;
                    }
                    this.v = new ef(this, this.w, b());
                }
                efVar = this.v;
            } catch (Throwable th) {
                throw th;
            }
        }
        return efVar;
    }

    public final boolean d(ex8 ex8) {
        boolean containsKey;
        synchronized (this.a) {
            containsKey = this.c.containsKey(ex8.a.i);
        }
        return containsKey;
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:0x0046  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x005c  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void e(defpackage.ex8 r9, boolean r10) {
        /*
            r8 = this;
            ef r1 = r8.c()
            java.lang.Object r8 = r1.c
            ry8 r8 = (defpackage.ry8) r8
            boolean r8 = r8.d(r9)
            r0 = 1
            if (r8 == 0) goto L_0x0082
            qo8 r8 = r1.b(r9)
            if (r8 == 0) goto L_0x0082
            jkf r2 = r8.l0()
            boolean r2 = r2.q()
            if (r2 != 0) goto L_0x0082
            int r8 = r8.getPlaybackState()
            if (r8 == r0) goto L_0x0082
            int r8 = r1.a
            int r8 = r8 + r0
            r1.a = r8
            java.lang.Object r0 = r1.i
            java.util.HashMap r0 = (java.util.HashMap) r0
            java.lang.Object r0 = r0.get(r9)
            zz7 r0 = (defpackage.zz7) r0
            if (r0 == 0) goto L_0x0043
            boolean r2 = r0.isDone()
            if (r2 == 0) goto L_0x0043
            java.lang.Object r0 = defpackage.o5a.p(r0)     // Catch:{ ExecutionException -> 0x0043 }
            qo8 r0 = (defpackage.qo8) r0     // Catch:{ ExecutionException -> 0x0043 }
            goto L_0x0044
        L_0x0043:
            r0 = 0
        L_0x0044:
            if (r0 == 0) goto L_0x005c
            r0.I0()
            po8 r0 = r0.c
            boolean r2 = r0.isConnected()
            if (r2 == 0) goto L_0x0056
            tb7 r0 = r0.G0()
            goto L_0x005a
        L_0x0056:
            lx5 r0 = defpackage.tb7.b
            k0d r0 = defpackage.k0d.v
        L_0x005a:
            r3 = r0
            goto L_0x0061
        L_0x005c:
            lx5 r0 = defpackage.tb7.b
            k0d r0 = defpackage.k0d.v
            goto L_0x005a
        L_0x0061:
            oj0 r4 = new oj0
            r0 = 8
            r4.<init>((java.lang.Object) r1, (int) r8, (java.lang.Object) r9, (int) r0)
            android.os.Handler r8 = new android.os.Handler
            vob r0 = r9.c()
            android.os.Looper r0 = r0.O0()
            r8.<init>(r0)
            bt8 r7 = new bt8
            r6 = 0
            r0 = r7
            r2 = r9
            r5 = r10
            r0.<init>(r1, r2, r3, r4, r5, r6)
            defpackage.v0g.W(r8, r7)
            goto L_0x0085
        L_0x0082:
            r1.d(r0)
        L_0x0085:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ry8.e(ex8, boolean):void");
    }

    public final boolean f(ex8 ex8, boolean z) {
        try {
            e(ex8, c().i(ex8, z));
            return true;
        } catch (IllegalStateException e) {
            if (v0g.a < 31 || !py8.a(e)) {
                throw e;
            }
            i8b.p("Failed to start foreground", e);
            this.b.post(new y86(29, (Object) this));
            return false;
        }
    }

    public final void g(ex8 ex8) {
        synchronized (this.a) {
            n79.f("session not found", this.c.containsKey(ex8.a.i));
            this.c.remove(ex8.a.i);
        }
        v0g.W(this.b, new sx8(3, c(), ex8));
    }

    public final IBinder onBind(Intent intent) {
        String action;
        qy8 qy8;
        sy8 sy8;
        if (intent == null || (action = intent.getAction()) == null) {
            return null;
        }
        if (action.equals("androidx.media3.session.MediaSessionService")) {
            synchronized (this.a) {
                qy8 = this.o;
                n79.o(qy8);
            }
            return qy8;
        } else if (!action.equals("android.media.browse.MediaBrowserService")) {
            return null;
        } else {
            if (!TextUtils.isEmpty("android.media.session.MediaController")) {
                new MediaSessionManager.RemoteUserInfo("android.media.session.MediaController", -1, -1);
                Bundle bundle = Bundle.EMPTY;
                z68.c("OneMeMediaSessionService", "onGetSession", new Object[0]);
                ex8 ex8 = ((OneMeMediaSessionService) this).y;
                if (ex8 == null) {
                    return null;
                }
                a(ex8);
                yx8 yx8 = ex8.a;
                synchronized (yx8.a) {
                    try {
                        if (yx8.w == null) {
                            ox8 ox8 = yx8.k.a.h.X.a.c;
                            sy8 sy82 = new sy8(yx8);
                            sy82.a(ox8);
                            yx8.w = sy82;
                        }
                        sy8 = yx8.w;
                    } catch (Throwable th) {
                        while (true) {
                            throw th;
                        }
                    }
                }
                return sy8.onBind(new Intent("android.media.browse.MediaBrowserService"));
            }
            throw new IllegalArgumentException("packageName should be nonempty");
        }
    }

    public void onCreate() {
        super.onCreate();
        synchronized (this.a) {
            this.o = new qy8(this);
        }
    }

    public void onDestroy() {
        super.onDestroy();
        synchronized (this.a) {
            try {
                qy8 qy8 = this.o;
                if (qy8 != null) {
                    qy8.c.clear();
                    qy8.d.removeCallbacksAndMessages((Object) null);
                    for (c67 d : qy8.f) {
                        try {
                            d.d(0);
                        } catch (RemoteException unused) {
                        }
                    }
                    this.o = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public int onStartCommand(Intent intent, int i, int i2) {
        ex8 ex8;
        ex8 ex82;
        if (intent == null) {
            return 1;
        }
        ni0 b2 = b();
        Uri data = intent.getData();
        Object obj = null;
        if (data != null) {
            synchronized (ex8.b) {
                try {
                    Iterator it = ex8.c.values().iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            ex82 = null;
                            break;
                        }
                        ex82 = (ex8) it.next();
                        if (v0g.a(ex82.a.b, data)) {
                            break;
                        }
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            ex8 = ex82;
        } else {
            ex8 = null;
        }
        b2.getClass();
        if ("android.intent.action.MEDIA_BUTTON".equals(intent.getAction())) {
            if (ex8 == null) {
                if (!TextUtils.isEmpty("android.media.session.MediaController")) {
                    new MediaSessionManager.RemoteUserInfo("android.media.session.MediaController", -1, -1);
                    Bundle bundle = Bundle.EMPTY;
                    z68.c("OneMeMediaSessionService", "onGetSession", new Object[0]);
                    ex8 = ((OneMeMediaSessionService) this).y;
                    if (ex8 == null) {
                        return 1;
                    }
                    a(ex8);
                } else {
                    throw new IllegalArgumentException("packageName should be nonempty");
                }
            }
            yx8 yx8 = ex8.a;
            yx8.l.post(new sx8(2, yx8, intent));
        } else if (ex8 != null && "androidx.media3.session.CUSTOM_NOTIFICATION_ACTION".equals(intent.getAction())) {
            Bundle extras = intent.getExtras();
            Object obj2 = extras != null ? extras.get("androidx.media3.session.EXTRAS_KEY_CUSTOM_NOTIFICATION_ACTION") : null;
            String str = obj2 instanceof String ? (String) obj2 : null;
            if (str == null) {
                return 1;
            }
            Bundle extras2 = intent.getExtras();
            if (extras2 != null) {
                obj = extras2.get("androidx.media3.session.EXTRAS_KEY_CUSTOM_NOTIFICATION_ACTION_EXTRAS");
            }
            Bundle bundle2 = obj instanceof Bundle ? (Bundle) obj : Bundle.EMPTY;
            ef c2 = c();
            qo8 b3 = c2.b(ex8);
            if (b3 != null) {
                v0g.W(new Handler(ex8.c().O0()), new at8(c2, ex8, str, bundle2, b3));
            }
        }
        return 1;
    }
}
