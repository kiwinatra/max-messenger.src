package defpackage;

import android.app.PendingIntent;
import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Process;
import android.os.RemoteException;
import android.os.SystemClock;
import android.util.SparseBooleanArray;
import android.view.KeyEvent;
import java.util.Objects;
import java.util.concurrent.ExecutionException;
import ru.ok.android.externcalls.sdk.audio.internal.impl3.CallsAudioManagerV3Impl;

/* renamed from: yx8  reason: default package */
public class yx8 {
    public final tb7 A;
    public final Bundle B;
    public final Object a = new Object();
    public final Uri b;
    public final ux8 c;
    public final hm8 d;
    public final o9a e;
    public final Context f;
    public final hz8 g;
    public final iy8 h;
    public final String i;
    public final oxd j;
    public final ex8 k;
    public final Handler l;
    public final fo0 m;
    public final qx8 n;
    public final Handler o;
    public final boolean p;
    public final boolean q;
    public ppb r;
    public ypb s;
    public final PendingIntent t;
    public wx8 u;
    public u6h v;
    public sy8 w;
    public boolean x;
    public final long y;
    public boolean z;

    static {
        new swd(1);
    }

    public yx8(ex8 ex8, Context context, tc5 tc5, k0d k0d, o9a o9a, Bundle bundle, Bundle bundle2, ox0 ox0) {
        i8b.F("Init " + Integer.toHexString(System.identityHashCode(this)) + " [AndroidXMedia3/1.4.1] [" + v0g.e + "]");
        this.k = ex8;
        this.f = context;
        this.i = "";
        this.t = null;
        this.A = k0d;
        this.e = o9a;
        this.B = bundle2;
        this.m = ox0;
        this.p = true;
        this.q = true;
        hz8 hz8 = new hz8(this);
        this.g = hz8;
        this.o = new Handler(Looper.getMainLooper());
        Looper looper = tc5.B0;
        Handler handler = new Handler(looper);
        this.l = handler;
        this.r = ppb.F;
        this.c = new ux8(this, looper);
        this.d = new hm8(this, looper);
        Uri build = new Uri.Builder().scheme(yx8.class.getName()).appendPath("").appendPath(String.valueOf(SystemClock.elapsedRealtime())).build();
        this.b = build;
        this.j = new oxd(Process.myUid(), 1004001300, 4, context.getPackageName(), hz8, bundle);
        this.h = new iy8(this, build, handler);
        tc5 tc52 = tc5;
        k0d k0d2 = k0d;
        ypb ypb = new ypb(tc52, k0d2, ax8.d, ax8.e, bundle2);
        this.s = ypb;
        v0g.W(handler, new sx8(0, this, ypb));
        this.y = CallsAudioManagerV3Impl.USED_DEVICE_RECOVER_TIMEOUT_MS;
        this.n = new qx8(this, 2);
        v0g.W(handler, new qx8(this, 3));
    }

    public static boolean j(cx8 cx8) {
        return cx8 != null && cx8.b == 0 && Objects.equals(cx8.a.a.a, "com.android.systemui");
    }

    public final boolean a(KeyEvent keyEvent, boolean z2) {
        hh3 hh3;
        cx8 e2 = this.k.a.e();
        e2.getClass();
        int keyCode = keyEvent.getKeyCode();
        if ((keyCode == 85 || keyCode == 79) && z2) {
            keyCode = 87;
        }
        if (keyCode == 126) {
            hh3 = new hh3(this, e2, 6);
        } else if (keyCode != 127) {
            if (keyCode != 272) {
                if (keyCode != 273) {
                    switch (keyCode) {
                        case 85:
                            if (!this.s.q()) {
                                hh3 = new hh3(this, e2, 5);
                                break;
                            } else {
                                hh3 = new hh3(this, e2, 4);
                                break;
                            }
                        case 86:
                            hh3 = new hh3(this, e2, 3);
                            break;
                        case 87:
                            break;
                        case 88:
                            break;
                        case 89:
                            hh3 = new hh3(this, e2, 2);
                            break;
                        case 90:
                            hh3 = new hh3(this, e2, 1);
                            break;
                        default:
                            return false;
                    }
                }
                hh3 = new hh3(this, e2, 9);
            }
            hh3 = new hh3(this, e2, 8);
        } else {
            hh3 = new hh3(this, e2, 7);
        }
        v0g.W(this.l, new x55((Object) this, (Object) hh3, (Object) e2, 15));
        return true;
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x002a A[Catch:{ DeadObjectException -> 0x004a, RemoteException -> 0x000f }, RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x002b A[Catch:{ DeadObjectException -> 0x004a, RemoteException -> 0x000f }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void b(defpackage.cx8 r4, defpackage.xx8 r5) {
        /*
            r3 = this;
            hz8 r0 = r3.g
            m7f r1 = r0.e     // Catch:{ DeadObjectException -> 0x004a, RemoteException -> 0x000f }
            bs6 r1 = r1.l(r4)     // Catch:{ DeadObjectException -> 0x004a, RemoteException -> 0x000f }
            if (r1 == 0) goto L_0x0011
            int r3 = r1.g()     // Catch:{ DeadObjectException -> 0x004a, RemoteException -> 0x000f }
            goto L_0x002c
        L_0x000f:
            r3 = move-exception
            goto L_0x0034
        L_0x0011:
            m7f r1 = r0.e     // Catch:{ DeadObjectException -> 0x004a, RemoteException -> 0x000f }
            boolean r1 = r1.p(r4)     // Catch:{ DeadObjectException -> 0x004a, RemoteException -> 0x000f }
            r2 = 0
            if (r1 != 0) goto L_0x0027
            iy8 r3 = r3.h     // Catch:{ DeadObjectException -> 0x004a, RemoteException -> 0x000f }
            m7f r3 = r3.v     // Catch:{ DeadObjectException -> 0x004a, RemoteException -> 0x000f }
            boolean r3 = r3.p(r4)     // Catch:{ DeadObjectException -> 0x004a, RemoteException -> 0x000f }
            if (r3 == 0) goto L_0x0025
            goto L_0x0027
        L_0x0025:
            r3 = r2
            goto L_0x0028
        L_0x0027:
            r3 = 1
        L_0x0028:
            if (r3 != 0) goto L_0x002b
            return
        L_0x002b:
            r3 = r2
        L_0x002c:
            bx8 r1 = r4.d     // Catch:{ DeadObjectException -> 0x004a, RemoteException -> 0x000f }
            if (r1 == 0) goto L_0x004f
            r5.a(r1, r3)     // Catch:{ DeadObjectException -> 0x004a, RemoteException -> 0x000f }
            goto L_0x004f
        L_0x0034:
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            java.lang.String r0 = "Exception in "
            r5.<init>(r0)
            java.lang.String r4 = r4.toString()
            r5.append(r4)
            java.lang.String r4 = r5.toString()
            defpackage.i8b.W(r4, r3)
            goto L_0x004f
        L_0x004a:
            m7f r3 = r0.e
            r3.y(r4)
        L_0x004f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.yx8.b(cx8, xx8):void");
    }

    public final void c(xx8 xx8) {
        tb7 j2 = this.g.e.j();
        for (int i2 = 0; i2 < j2.size(); i2++) {
            b((cx8) j2.get(i2), xx8);
        }
        try {
            xx8.a(this.h.y, 0);
        } catch (RemoteException e2) {
            i8b.p("Exception in using media1 API", e2);
        }
    }

    public final Handler d() {
        return this.l;
    }

    public final cx8 e() {
        tb7 j2 = this.g.I0().j();
        for (int i2 = 0; i2 < j2.size(); i2++) {
            cx8 cx8 = (cx8) j2.get(i2);
            if (h(cx8)) {
                return cx8;
            }
        }
        return null;
    }

    public final void f(pob pob) {
        this.c.a(false, false);
        c(new up8(pob));
        try {
            gy8 gy8 = this.h.y;
            in4 in4 = this.r.q;
            gy8.p();
        } catch (RemoteException e2) {
            i8b.p("Exception in using media1 API", e2);
        }
    }

    /* JADX WARNING: type inference failed for: r1v4, types: [n1, java.lang.Object] */
    public final void g(cx8 cx8, boolean z2) {
        if (o()) {
            boolean z3 = this.s.J0(16) && this.s.C0() != null;
            boolean z4 = this.s.J0(31) || this.s.J0(20);
            cx8 s2 = s(cx8);
            SparseBooleanArray sparseBooleanArray = new SparseBooleanArray();
            n79.n(!false);
            sparseBooleanArray.append(1, true);
            n79.n(!false);
            pob pob = new pob(new xq5(sparseBooleanArray));
            if (z3 || !z4) {
                if (!z3) {
                    i8b.V("Play requested without current MediaItem, but playback resumption prevented by missing available commands");
                }
                v0g.I(this.s);
                if (z2) {
                    p(s2);
                    return;
                }
                return;
            }
            this.e.getClass();
            UnsupportedOperationException unsupportedOperationException = new UnsupportedOperationException();
            ? obj = new Object();
            obj.m(unsupportedOperationException);
            obj.d(new uj6(0, obj, new he(this, s2, z2, pob)), new ro1(2, this));
        }
    }

    public final boolean h(cx8 cx8) {
        return Objects.equals(cx8.a.a.a, this.f.getPackageName()) && cx8.b != 0 && new Bundle(cx8.e).getBoolean("androidx.media3.session.MediaNotificationManager", false);
    }

    public final boolean i() {
        boolean z2;
        synchronized (this.a) {
            z2 = this.x;
        }
        return z2;
    }

    public final zz7 k(cx8 cx8, k0d k0d) {
        return this.e.o(this.k, s(cx8), k0d);
    }

    public final ax8 l(cx8 cx8) {
        tb7 tb7 = null;
        if (!this.z || !j(cx8)) {
            this.e.getClass();
            pob pob = ax8.e;
            zvd zvd = ax8.d;
            ax8 ax8 = new ax8(zvd, pob, (tb7) null);
            if (h(cx8)) {
                boolean z2 = true;
                this.z = true;
                ypb ypb = this.s;
                ypb.c = this.k.a.A;
                if (ypb.v.a(17) == pob.a(17)) {
                    z2 = false;
                }
                ypb ypb2 = this.s;
                ypb2.o = zvd;
                ypb2.v = pob;
                iy8 iy8 = this.h;
                if (z2) {
                    v0g.W(iy8.w.l, new by8(iy8, ypb2, 0));
                } else {
                    iy8.Z(ypb2);
                }
            }
            return ax8;
        }
        zvd zvd2 = ax8.d;
        zvd zvd3 = this.s.o;
        zvd3.getClass();
        pob pob2 = this.s.v;
        pob2.getClass();
        tb7 tb72 = this.s.c;
        if (tb72 != null) {
            tb7 = tb7.p(tb72);
        }
        return new ax8(zvd3, pob2, tb7);
    }

    public final ya7 m(cx8 cx8) {
        s(cx8);
        this.e.getClass();
        return o5a.F(new swd(-6));
    }

    /* JADX WARNING: Removed duplicated region for block: B:48:0x00c8  */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x00e5  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean n(defpackage.cx8 r10, android.content.Intent r11) {
        /*
            r9 = this;
            android.os.Bundle r0 = r11.getExtras()
            r1 = 0
            if (r0 == 0) goto L_0x0016
            java.lang.String r2 = "android.intent.extra.KEY_EVENT"
            boolean r3 = r0.containsKey(r2)
            if (r3 == 0) goto L_0x0016
            android.os.Parcelable r0 = r0.getParcelable(r2)
            android.view.KeyEvent r0 = (android.view.KeyEvent) r0
            goto L_0x0017
        L_0x0016:
            r0 = r1
        L_0x0017:
            android.content.ComponentName r2 = r11.getComponent()
            java.lang.String r11 = r11.getAction()
            java.lang.String r3 = "android.intent.action.MEDIA_BUTTON"
            boolean r11 = java.util.Objects.equals(r11, r3)
            r3 = 0
            if (r11 == 0) goto L_0x00ea
            android.content.Context r11 = r9.f
            if (r2 == 0) goto L_0x003a
            java.lang.String r2 = r2.getPackageName()
            java.lang.String r4 = r11.getPackageName()
            boolean r2 = java.util.Objects.equals(r2, r4)
            if (r2 == 0) goto L_0x00ea
        L_0x003a:
            if (r0 == 0) goto L_0x00ea
            int r2 = r0.getAction()
            if (r2 == 0) goto L_0x0044
            goto L_0x00ea
        L_0x0044:
            r9.u()
            o9a r2 = r9.e
            r2.getClass()
            int r2 = r0.getKeyCode()
            int r4 = defpackage.v0g.a
            r5 = 21
            r6 = 1
            if (r4 < r5) goto L_0x005f
            boolean r11 = defpackage.tx8.a(r11)
            if (r11 == 0) goto L_0x005f
            r11 = r6
            goto L_0x0060
        L_0x005f:
            r11 = r3
        L_0x0060:
            int r4 = r10.b
            r5 = 85
            r7 = 79
            hm8 r8 = r9.d
            if (r2 == r7) goto L_0x0082
            if (r2 == r5) goto L_0x0082
            java.lang.Object r10 = r8.b
            x55 r10 = (defpackage.x55) r10
            if (r10 == 0) goto L_0x007c
            r8.removeCallbacks(r10)
            java.lang.Object r10 = r8.b
            x55 r10 = (defpackage.x55) r10
            r8.b = r1
            r1 = r10
        L_0x007c:
            if (r1 == 0) goto L_0x00c3
            defpackage.v0g.W(r8, r1)
            goto L_0x00c3
        L_0x0082:
            if (r11 != 0) goto L_0x00ae
            if (r4 != 0) goto L_0x00ae
            int r11 = r0.getRepeatCount()
            if (r11 == 0) goto L_0x008d
            goto L_0x00ae
        L_0x008d:
            java.lang.Object r11 = r8.b
            x55 r11 = (defpackage.x55) r11
            if (r11 == 0) goto L_0x009c
            if (r11 == 0) goto L_0x009a
            r8.removeCallbacks(r11)
            r8.b = r1
        L_0x009a:
            r10 = r6
            goto L_0x00c4
        L_0x009c:
            x55 r9 = new x55
            r11 = 16
            r9.<init>((java.lang.Object) r8, (java.lang.Object) r10, (java.lang.Object) r0, (int) r11)
            r8.b = r9
            int r10 = android.view.ViewConfiguration.getDoubleTapTimeout()
            long r10 = (long) r10
            r8.postDelayed(r9, r10)
            return r6
        L_0x00ae:
            java.lang.Object r10 = r8.b
            x55 r10 = (defpackage.x55) r10
            if (r10 == 0) goto L_0x00be
            r8.removeCallbacks(r10)
            java.lang.Object r10 = r8.b
            x55 r10 = (defpackage.x55) r10
            r8.b = r1
            r1 = r10
        L_0x00be:
            if (r1 == 0) goto L_0x00c3
            defpackage.v0g.W(r8, r1)
        L_0x00c3:
            r10 = r3
        L_0x00c4:
            boolean r11 = r9.z
            if (r11 != 0) goto L_0x00e5
            iy8 r9 = r9.h
            if (r2 == r5) goto L_0x00ce
            if (r2 != r7) goto L_0x00d4
        L_0x00ce:
            if (r10 == 0) goto L_0x00d4
            r9.F()
            return r6
        L_0x00d4:
            if (r4 == 0) goto L_0x00e4
            px8 r9 = r9.X
            xe8 r9 = r9.b
            java.lang.Object r9 = r9.b
            uo8 r9 = (defpackage.uo8) r9
            android.media.session.MediaController r9 = r9.a
            r9.dispatchMediaButtonEvent(r0)
            return r6
        L_0x00e4:
            return r3
        L_0x00e5:
            boolean r9 = r9.a(r0, r10)
            return r9
        L_0x00ea:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.yx8.n(cx8, android.content.Intent):boolean");
    }

    /* JADX WARNING: type inference failed for: r0v4, types: [n1, java.lang.Object] */
    public final boolean o() {
        if (Looper.myLooper() != Looper.getMainLooper()) {
            ? obj = new Object();
            this.o.post(new uo5(28, (Object) this, (Object) obj));
            try {
                return ((Boolean) obj.get()).booleanValue();
            } catch (InterruptedException | ExecutionException e2) {
                throw new IllegalStateException(e2);
            }
        } else {
            u6h u6h = this.v;
            if (u6h == null) {
                return true;
            }
            u6h.getClass();
            int i2 = v0g.a;
            if (i2 < 31 || i2 >= 33) {
                return true;
            }
            ry8 ry8 = (ry8) u6h.b;
            if (!ry8.c().b) {
                return ry8.f(this.k, true);
            }
            return true;
        }
    }

    public final void p(cx8 cx8) {
        s(cx8);
        this.e.getClass();
    }

    public final byd q(cx8 cx8, k0d k0d, int i2, long j2) {
        return v0g.g0(this.e.o(this.k, s(cx8), k0d), new ph5(i2, j2));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0044, code lost:
        r0 = r8.d;
        r1 = (defpackage.x55) r0.b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x004b, code lost:
        if (r1 == null) goto L_0x0052;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x004d, code lost:
        r0.removeCallbacks(r1);
        r0.b = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0052, code lost:
        r8.l.removeCallbacksAndMessages((java.lang.Object) null);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:?, code lost:
        defpackage.v0g.W(r8.l, new defpackage.qx8(r8, 0));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0063, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0064, code lost:
        defpackage.i8b.W("Exception thrown while closing", r0);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void r() {
        /*
            r8 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Release "
            r0.<init>(r1)
            int r1 = java.lang.System.identityHashCode(r8)
            java.lang.String r1 = java.lang.Integer.toHexString(r1)
            r0.append(r1)
            java.lang.String r1 = " [AndroidXMedia3/1.4.1] ["
            r0.append(r1)
            java.lang.String r1 = defpackage.v0g.e
            r0.append(r1)
            java.lang.String r1 = "] ["
            r0.append(r1)
            java.lang.String r1 = defpackage.cs8.b()
            r0.append(r1)
            java.lang.String r1 = "]"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            defpackage.i8b.F(r0)
            java.lang.Object r0 = r8.a
            monitor-enter(r0)
            boolean r1 = r8.x     // Catch:{ all -> 0x003d }
            if (r1 == 0) goto L_0x0040
            monitor-exit(r0)     // Catch:{ all -> 0x003d }
            return
        L_0x003d:
            r8 = move-exception
            goto L_0x00fa
        L_0x0040:
            r1 = 1
            r8.x = r1     // Catch:{ all -> 0x003d }
            monitor-exit(r0)     // Catch:{ all -> 0x003d }
            hm8 r0 = r8.d
            java.lang.Object r1 = r0.b
            x55 r1 = (defpackage.x55) r1
            r2 = 0
            if (r1 == 0) goto L_0x0052
            r0.removeCallbacks(r1)
            r0.b = r2
        L_0x0052:
            android.os.Handler r0 = r8.l
            r0.removeCallbacksAndMessages(r2)
            android.os.Handler r0 = r8.l     // Catch:{ Exception -> 0x0063 }
            qx8 r1 = new qx8     // Catch:{ Exception -> 0x0063 }
            r3 = 0
            r1.<init>(r8, r3)     // Catch:{ Exception -> 0x0063 }
            defpackage.v0g.W(r0, r1)     // Catch:{ Exception -> 0x0063 }
            goto L_0x0069
        L_0x0063:
            r0 = move-exception
            java.lang.String r1 = "Exception thrown while closing"
            defpackage.i8b.W(r1, r0)
        L_0x0069:
            iy8 r0 = r8.h
            r0.getClass()
            int r1 = defpackage.v0g.a
            yx8 r3 = r0.w
            px8 r4 = r0.X
            r5 = 31
            if (r1 >= r5) goto L_0x00a0
            android.content.ComponentName r1 = r0.Z
            if (r1 != 0) goto L_0x0084
            kx8 r1 = r4.a
            android.media.session.MediaSession r1 = r1.a
            r1.setMediaButtonReceiver(r2)
            goto L_0x00a0
        L_0x0084:
            android.content.Intent r5 = new android.content.Intent
            android.net.Uri r6 = r3.b
            java.lang.String r7 = "android.intent.action.MEDIA_BUTTON"
            r5.<init>(r7, r6)
            r5.setComponent(r1)
            android.content.Context r1 = r3.f
            int r6 = defpackage.iy8.z0
            r7 = 0
            android.app.PendingIntent r1 = android.app.PendingIntent.getBroadcast(r1, r7, r5, r6)
            kx8 r5 = r4.a
            android.media.session.MediaSession r5 = r5.a
            r5.setMediaButtonReceiver(r1)
        L_0x00a0:
            ao r0 = r0.Y
            if (r0 == 0) goto L_0x00a9
            android.content.Context r1 = r3.f
            r1.unregisterReceiver(r0)
        L_0x00a9:
            kx8 r0 = r4.a
            android.os.RemoteCallbackList r1 = r0.f
            r1.kill()
            android.media.session.MediaSession r1 = r0.a
            r1.setCallback(r2)
            ix8 r0 = r0.b
            java.util.concurrent.atomic.AtomicReference r0 = r0.c
            r0.set(r2)
            r1.release()
            hz8 r8 = r8.g
            m7f r0 = r8.e
            tb7 r0 = r0.j()
            java.util.Iterator r0 = r0.iterator()
        L_0x00cb:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x00df
            java.lang.Object r1 = r0.next()
            cx8 r1 = (defpackage.cx8) r1
            bx8 r1 = r1.d
            if (r1 == 0) goto L_0x00cb
            r1.onDisconnected()     // Catch:{ RemoteException -> 0x00cb }
            goto L_0x00cb
        L_0x00df:
            java.util.Set r8 = r8.f
            java.util.Iterator r8 = r8.iterator()
        L_0x00e5:
            boolean r0 = r8.hasNext()
            if (r0 == 0) goto L_0x00f9
            java.lang.Object r0 = r8.next()
            cx8 r0 = (defpackage.cx8) r0
            bx8 r0 = r0.d
            if (r0 == 0) goto L_0x00e5
            r0.onDisconnected()     // Catch:{ RemoteException -> 0x00e5 }
            goto L_0x00e5
        L_0x00f9:
            return
        L_0x00fa:
            monitor-exit(r0)     // Catch:{ all -> 0x003d }
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.yx8.r():void");
    }

    public final cx8 s(cx8 cx8) {
        if (!this.z || !j(cx8)) {
            return cx8;
        }
        cx8 e2 = e();
        e2.getClass();
        return e2;
    }

    public final void t() {
        Handler handler = this.l;
        qx8 qx8 = this.n;
        handler.removeCallbacks(qx8);
        if (this.q) {
            long j2 = this.y;
            if (j2 <= 0) {
                return;
            }
            if (this.s.a() || this.s.d()) {
                handler.postDelayed(qx8, j2);
            }
        }
    }

    public final void u() {
        if (Looper.myLooper() != this.l.getLooper()) {
            throw new IllegalStateException("Player callback method is called from a wrong thread. See javadoc of MediaSession for details.");
        }
    }
}
