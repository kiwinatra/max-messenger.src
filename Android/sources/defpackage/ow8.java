package defpackage;

import android.app.ActivityManager;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.media.MediaRoute2Info;
import android.os.Build;
import android.os.Handler;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;

/* renamed from: ow8  reason: default package */
public final class ow8 implements x7f, e0d {
    public final er7 A = new er7(26, (Object) this);
    public final Context a;
    public boolean b;
    public s7f c;
    public boolean d;
    public yu8 e;
    public final ArrayList f = new ArrayList();
    public final ArrayList g = new ArrayList();
    public final HashMap h = new HashMap();
    public final ArrayList i = new ArrayList();
    public final ArrayList j = new ArrayList();
    public final ejd k = new Object();
    public final e4 l = new e4(26, (Object) this);
    public final mw8 m = new mw8(this);
    public final boolean n;
    public tw8 o;
    public rw8 p;
    public rw8 q;
    public rw8 r;
    public hw8 s;
    public rw8 t;
    public gw8 u;
    public final HashMap v = new HashMap();
    public pv8 w;
    public pv8 x;
    public int y;
    public pw8 z;

    /* JADX WARNING: type inference failed for: r0v5, types: [java.lang.Object, ejd] */
    public ow8(Context context) {
        this.a = context;
        this.n = ((ActivityManager) context.getSystemService("activity")).isLowRamDevice();
    }

    public final void a(iw8 iw8) {
        if (e(iw8) == null) {
            qw8 qw8 = new qw8(iw8);
            this.i.add(qw8);
            if (sw8.c) {
                qw8.toString();
            }
            this.m.b(513, qw8);
            l(qw8, iw8.x);
            sw8.b();
            iw8.o = this.l;
            iw8.h(this.w);
        }
    }

    public final String b(qw8 qw8, String str) {
        String flattenToShortString = ((ComponentName) qw8.c.b).flattenToShortString();
        String i2 = g63.i(flattenToShortString, ":", str);
        ArrayList arrayList = this.g;
        int size = arrayList.size();
        int i3 = 0;
        while (true) {
            if (i3 >= size) {
                i3 = -1;
                break;
            } else if (((rw8) arrayList.get(i3)).c.equals(i2)) {
                break;
            } else {
                i3++;
            }
        }
        HashMap hashMap = this.h;
        if (i3 < 0) {
            hashMap.put(new v7b(flattenToShortString, str), i2);
            return i2;
        }
        int i4 = 2;
        while (true) {
            Locale locale = Locale.US;
            String str2 = i2 + "_" + i4;
            int size2 = arrayList.size();
            int i5 = 0;
            while (true) {
                if (i5 >= size2) {
                    i5 = -1;
                    break;
                } else if (((rw8) arrayList.get(i5)).c.equals(str2)) {
                    break;
                } else {
                    i5++;
                }
            }
            if (i5 < 0) {
                hashMap.put(new v7b(flattenToShortString, str), str2);
                return str2;
            }
            i4++;
        }
    }

    public final rw8 c() {
        Iterator it = this.g.iterator();
        while (it.hasNext()) {
            rw8 rw8 = (rw8) it.next();
            if (rw8 != this.p && rw8.c() == this.c && rw8.m("android.media.intent.category.LIVE_AUDIO") && !rw8.m("android.media.intent.category.LIVE_VIDEO") && rw8.f()) {
                return rw8;
            }
        }
        return this.p;
    }

    /* JADX WARNING: type inference failed for: r1v2, types: [s7f, w7f] */
    public final void d() {
        if (!this.b) {
            this.b = true;
            int i2 = Build.VERSION.SDK_INT;
            boolean z2 = false;
            Context context = this.a;
            if (i2 >= 30) {
                int i3 = r09.b;
                Intent intent = new Intent(context, r09.class);
                intent.setPackage(context.getPackageName());
                if (context.getPackageManager().queryBroadcastReceivers(intent, 0).size() > 0) {
                    z2 = true;
                }
                this.d = z2;
            } else {
                this.d = false;
            }
            if (this.d) {
                this.e = new yu8(context, new wie(27, (Object) this));
            } else {
                this.e = null;
            }
            this.c = new w7f(context, this);
            this.o = new tw8(new tj7(11, this));
            a(this.c);
            yu8 yu8 = this.e;
            if (yu8 != null) {
                a(yu8);
            }
            cy3 cy3 = new cy3(context, this);
            if (!cy3.a) {
                cy3.a = true;
                IntentFilter intentFilter = new IntentFilter();
                intentFilter.addAction("android.intent.action.PACKAGE_ADDED");
                intentFilter.addAction("android.intent.action.PACKAGE_REMOVED");
                intentFilter.addAction("android.intent.action.PACKAGE_CHANGED");
                intentFilter.addAction("android.intent.action.PACKAGE_REPLACED");
                intentFilter.addAction("android.intent.action.PACKAGE_RESTARTED");
                intentFilter.addDataScheme("package");
                Handler handler = (Handler) cy3.d;
                ((Context) cy3.b).registerReceiver((ao) cy3.g, intentFilter, (String) null, handler);
                handler.post((tj7) cy3.h);
            }
        }
    }

    public final qw8 e(iw8 iw8) {
        ArrayList arrayList = this.i;
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            if (((qw8) arrayList.get(i2)).a == iw8) {
                return (qw8) arrayList.get(i2);
            }
        }
        return null;
    }

    public final rw8 f() {
        rw8 rw8 = this.r;
        if (rw8 != null) {
            return rw8;
        }
        throw new IllegalStateException("There is no currently selected route.  The media router has not yet been fully initialized.");
    }

    public final void g() {
        if (this.r.e()) {
            List<rw8> unmodifiableList = Collections.unmodifiableList(this.r.u);
            HashSet hashSet = new HashSet();
            for (rw8 rw8 : unmodifiableList) {
                hashSet.add(rw8.c);
            }
            HashMap hashMap = this.v;
            Iterator it = hashMap.entrySet().iterator();
            while (it.hasNext()) {
                Map.Entry entry = (Map.Entry) it.next();
                if (!hashSet.contains(entry.getKey())) {
                    hw8 hw8 = (hw8) entry.getValue();
                    hw8.h(0);
                    hw8.d();
                    it.remove();
                }
            }
            for (rw8 rw82 : unmodifiableList) {
                if (!hashMap.containsKey(rw82.c)) {
                    hw8 e2 = rw82.c().e(rw82.b, this.r.b);
                    e2.e();
                    hashMap.put(rw82.c, e2);
                }
            }
        }
    }

    public final void h(rw8 rw8, int i2) {
        yu8 yu8;
        if (!this.g.contains(rw8)) {
            Objects.toString(rw8);
        } else if (!rw8.g) {
            rw8.toString();
        } else if (Build.VERSION.SDK_INT < 30 || rw8.c() != (yu8 = this.e) || this.r == rw8) {
            i(rw8, i2);
        } else {
            MediaRoute2Info i3 = yu8.i(rw8.b);
            if (i3 != null) {
                yu8.z.transferTo(i3);
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0017, code lost:
        if (r0 == r11) goto L_0x0022;
     */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x004f A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0050  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void i(defpackage.rw8 r11, int r12) {
        /*
            r10 = this;
            ow8 r0 = defpackage.sw8.d
            r1 = 3
            if (r0 == 0) goto L_0x0022
            rw8 r0 = r10.q
            if (r0 == 0) goto L_0x004b
            r11.getClass()
            defpackage.sw8.b()
            ow8 r0 = defpackage.sw8.c()
            rw8 r0 = r0.p
            if (r0 == 0) goto L_0x001a
            if (r0 != r11) goto L_0x004b
            goto L_0x0022
        L_0x001a:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "There is no default route.  The media router has not yet been fully initialized."
            r10.<init>(r11)
            throw r10
        L_0x0022:
            java.lang.Thread r0 = java.lang.Thread.currentThread()
            java.lang.StackTraceElement[] r0 = r0.getStackTrace()
            r2 = r1
        L_0x002b:
            int r3 = r0.length
            if (r2 >= r3) goto L_0x003c
            r3 = r0[r2]
            r3.getClassName()
            r3.getMethodName()
            r3.getLineNumber()
            int r2 = r2 + 1
            goto L_0x002b
        L_0x003c:
            ow8 r0 = defpackage.sw8.d
            if (r0 != 0) goto L_0x0046
            android.content.Context r0 = r10.a
            r0.getPackageName()
            goto L_0x004b
        L_0x0046:
            android.content.Context r0 = r10.a
            r0.getPackageName()
        L_0x004b:
            rw8 r0 = r10.r
            if (r0 != r11) goto L_0x0050
            return
        L_0x0050:
            rw8 r0 = r10.t
            r2 = 0
            if (r0 == 0) goto L_0x0065
            r10.t = r2
            gw8 r0 = r10.u
            if (r0 == 0) goto L_0x0065
            r0.h(r1)
            gw8 r0 = r10.u
            r0.d()
            r10.u = r2
        L_0x0065:
            boolean r0 = r10.d
            if (r0 == 0) goto L_0x00d2
            qw8 r0 = r11.a
            jw8 r0 = r0.d
            if (r0 == 0) goto L_0x00d2
            boolean r0 = r0.b
            if (r0 == 0) goto L_0x00d2
            iw8 r0 = r11.c()
            java.lang.String r1 = r11.b
            gw8 r0 = r0.c(r1)
            if (r0 == 0) goto L_0x00cf
            android.content.Context r12 = r10.a
            java.util.concurrent.Executor r12 = defpackage.iw3.a(r12)
            er7 r5 = r10.A
            java.lang.Object r1 = r0.a
            monitor-enter(r1)
            if (r12 == 0) goto L_0x00c5
            if (r5 == 0) goto L_0x00bd
            r0.b = r12     // Catch:{ all -> 0x00b2 }
            r0.c = r5     // Catch:{ all -> 0x00b2 }
            java.util.ArrayList r12 = r0.e     // Catch:{ all -> 0x00b2 }
            if (r12 == 0) goto L_0x00b4
            boolean r12 = r12.isEmpty()     // Catch:{ all -> 0x00b2 }
            if (r12 != 0) goto L_0x00b4
            nv8 r6 = r0.d     // Catch:{ all -> 0x00b2 }
            java.util.ArrayList r7 = r0.e     // Catch:{ all -> 0x00b2 }
            r0.d = r2     // Catch:{ all -> 0x00b2 }
            r0.e = r2     // Catch:{ all -> 0x00b2 }
            java.util.concurrent.Executor r12 = r0.b     // Catch:{ all -> 0x00b2 }
            ew8 r2 = new ew8     // Catch:{ all -> 0x00b2 }
            r8 = 0
            r3 = r2
            r4 = r0
            r3.<init>(r4, r5, r6, r7, r8)     // Catch:{ all -> 0x00b2 }
            r12.execute(r2)     // Catch:{ all -> 0x00b2 }
            goto L_0x00b4
        L_0x00b2:
            r10 = move-exception
            goto L_0x00cd
        L_0x00b4:
            monitor-exit(r1)     // Catch:{ all -> 0x00b2 }
            r10.t = r11
            r10.u = r0
            r0.e()
            return
        L_0x00bd:
            java.lang.NullPointerException r10 = new java.lang.NullPointerException     // Catch:{ all -> 0x00b2 }
            java.lang.String r11 = "Listener shouldn't be null"
            r10.<init>(r11)     // Catch:{ all -> 0x00b2 }
            throw r10     // Catch:{ all -> 0x00b2 }
        L_0x00c5:
            java.lang.NullPointerException r10 = new java.lang.NullPointerException     // Catch:{ all -> 0x00b2 }
            java.lang.String r11 = "Executor shouldn't be null"
            r10.<init>(r11)     // Catch:{ all -> 0x00b2 }
            throw r10     // Catch:{ all -> 0x00b2 }
        L_0x00cd:
            monitor-exit(r1)     // Catch:{ all -> 0x00b2 }
            throw r10
        L_0x00cf:
            r11.toString()
        L_0x00d2:
            iw8 r0 = r11.c()
            java.lang.String r1 = r11.b
            hw8 r6 = r0.d(r1)
            if (r6 == 0) goto L_0x00e1
            r6.e()
        L_0x00e1:
            boolean r0 = defpackage.sw8.c
            if (r0 == 0) goto L_0x00e8
            r11.toString()
        L_0x00e8:
            rw8 r0 = r10.r
            if (r0 != 0) goto L_0x0103
            r10.r = r11
            r10.s = r6
            mw8 r10 = r10.m
            v7b r0 = new v7b
            r0.<init>(r2, r11)
            r11 = 262(0x106, float:3.67E-43)
            android.os.Message r10 = r10.obtainMessage(r11, r0)
            r10.arg1 = r12
            r10.sendToTarget()
            return
        L_0x0103:
            pw8 r0 = r10.z
            if (r0 == 0) goto L_0x0120
            boolean r1 = r0.i
            if (r1 != 0) goto L_0x011e
            boolean r1 = r0.j
            if (r1 == 0) goto L_0x0110
            goto L_0x011e
        L_0x0110:
            r1 = 1
            r0.j = r1
            hw8 r0 = r0.a
            if (r0 == 0) goto L_0x011e
            r1 = 0
            r0.h(r1)
            r0.d()
        L_0x011e:
            r10.z = r2
        L_0x0120:
            pw8 r0 = new pw8
            r8 = 0
            r9 = 0
            r3 = r0
            r4 = r10
            r5 = r11
            r7 = r12
            r3.<init>(r4, r5, r6, r7, r8, r9)
            r10.z = r0
            r0.a()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ow8.i(rw8, int):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:53:0x010f, code lost:
        if (r0.x.b() == r2) goto L_0x0139;
     */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0097  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0099  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x00aa  */
    /* JADX WARNING: Removed duplicated region for block: B:96:0x00ab A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void j() {
        /*
            r21 = this;
            r0 = r21
            rt6 r1 = new rt6
            r2 = 27
            r3 = 0
            r1.<init>((int) r2, (boolean) r3)
            tw8 r2 = r0.o
            r3 = 0
            r2.c = r3
            r5 = 0
            r2.b = r5
            long r6 = android.os.SystemClock.elapsedRealtime()
            r2.o = r6
            java.lang.Object r6 = r2.v
            android.os.Handler r6 = (android.os.Handler) r6
            java.lang.Object r2 = r2.w
            java.lang.Runnable r2 = (java.lang.Runnable) r2
            r6.removeCallbacks(r2)
            java.util.ArrayList r2 = r0.f
            int r6 = r2.size()
            r7 = r5
            r8 = r7
        L_0x002c:
            int r6 = r6 + -1
            if (r6 < 0) goto L_0x00ca
            java.lang.Object r9 = r2.get(r6)
            java.lang.ref.WeakReference r9 = (java.lang.ref.WeakReference) r9
            java.lang.Object r9 = r9.get()
            sw8 r9 = (defpackage.sw8) r9
            if (r9 != 0) goto L_0x0045
            r2.remove(r6)
            r16 = r6
            goto L_0x00c3
        L_0x0045:
            java.util.ArrayList r9 = r9.b
            int r10 = r9.size()
            int r7 = r7 + r10
            r11 = r5
        L_0x004d:
            if (r11 >= r10) goto L_0x00bd
            java.lang.Object r12 = r9.get(r11)
            lw8 r12 = (defpackage.lw8) r12
            kw8 r13 = r12.c
            if (r13 == 0) goto L_0x00b5
            java.util.ArrayList r13 = r13.b()
            r1.i(r13)
            int r13 = r12.d
            r14 = 1
            r13 = r13 & r14
            if (r13 == 0) goto L_0x0068
            r13 = r14
            goto L_0x0069
        L_0x0068:
            r13 = r5
        L_0x0069:
            tw8 r15 = r0.o
            r16 = r6
            long r5 = r12.e
            if (r13 != 0) goto L_0x0079
            r15.getClass()
        L_0x0074:
            r17 = r7
            r18 = r8
            goto L_0x0095
        L_0x0079:
            long r3 = r15.o
            long r17 = r3 - r5
            r19 = 30000(0x7530, double:1.4822E-319)
            int r17 = (r17 > r19 ? 1 : (r17 == r19 ? 0 : -1))
            if (r17 < 0) goto L_0x0084
            goto L_0x0074
        L_0x0084:
            r17 = r7
            r18 = r8
            long r7 = r15.c
            long r5 = r5 + r19
            long r5 = r5 - r3
            long r3 = java.lang.Math.max(r7, r5)
            r15.c = r3
            r15.b = r14
        L_0x0095:
            if (r13 == 0) goto L_0x0099
            r8 = r14
            goto L_0x009b
        L_0x0099:
            r8 = r18
        L_0x009b:
            int r3 = r12.d
            r4 = r3 & 4
            if (r4 == 0) goto L_0x00a6
            boolean r4 = r0.n
            if (r4 != 0) goto L_0x00a6
            r8 = r14
        L_0x00a6:
            r3 = r3 & 8
            if (r3 == 0) goto L_0x00ab
            r8 = r14
        L_0x00ab:
            int r11 = r11 + 1
            r6 = r16
            r7 = r17
            r3 = 0
            r5 = 0
            goto L_0x004d
        L_0x00b5:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "selector must not be null"
            r0.<init>(r1)
            throw r0
        L_0x00bd:
            r16 = r6
            r17 = r7
            r18 = r8
        L_0x00c3:
            r6 = r16
            r3 = 0
            r5 = 0
            goto L_0x002c
        L_0x00ca:
            tw8 r2 = r0.o
            boolean r3 = r2.b
            if (r3 == 0) goto L_0x00e3
            long r3 = r2.c
            r5 = 0
            int r5 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r5 <= 0) goto L_0x00e3
            java.lang.Object r5 = r2.v
            android.os.Handler r5 = (android.os.Handler) r5
            java.lang.Object r6 = r2.w
            java.lang.Runnable r6 = (java.lang.Runnable) r6
            r5.postDelayed(r6, r3)
        L_0x00e3:
            boolean r2 = r2.b
            r0.y = r7
            if (r8 == 0) goto L_0x00ee
            kw8 r3 = r1.l()
            goto L_0x00f0
        L_0x00ee:
            kw8 r3 = defpackage.kw8.c
        L_0x00f0:
            kw8 r1 = r1.l()
            boolean r4 = r0.d
            r5 = 0
            if (r4 != 0) goto L_0x00fa
            goto L_0x0139
        L_0x00fa:
            pv8 r4 = r0.x
            if (r4 == 0) goto L_0x0112
            r4.a()
            kw8 r4 = r4.b
            boolean r4 = r4.equals(r1)
            if (r4 == 0) goto L_0x0112
            pv8 r4 = r0.x
            boolean r4 = r4.b()
            if (r4 != r2) goto L_0x0112
            goto L_0x0139
        L_0x0112:
            boolean r4 = r1.c()
            if (r4 == 0) goto L_0x0122
            if (r2 != 0) goto L_0x0122
            pv8 r1 = r0.x
            if (r1 != 0) goto L_0x011f
            goto L_0x0139
        L_0x011f:
            r0.x = r5
            goto L_0x0129
        L_0x0122:
            pv8 r4 = new pv8
            r4.<init>(r1, r2)
            r0.x = r4
        L_0x0129:
            boolean r1 = defpackage.sw8.c
            if (r1 == 0) goto L_0x0132
            pv8 r1 = r0.x
            java.util.Objects.toString(r1)
        L_0x0132:
            yu8 r1 = r0.e
            pv8 r4 = r0.x
            r1.h(r4)
        L_0x0139:
            pv8 r1 = r0.w
            if (r1 == 0) goto L_0x0151
            r1.a()
            kw8 r1 = r1.b
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x0151
            pv8 r1 = r0.w
            boolean r1 = r1.b()
            if (r1 != r2) goto L_0x0151
            return
        L_0x0151:
            boolean r1 = r3.c()
            if (r1 == 0) goto L_0x0161
            if (r2 != 0) goto L_0x0161
            pv8 r1 = r0.w
            if (r1 != 0) goto L_0x015e
            return
        L_0x015e:
            r0.w = r5
            goto L_0x0168
        L_0x0161:
            pv8 r1 = new pv8
            r1.<init>(r3, r2)
            r0.w = r1
        L_0x0168:
            boolean r1 = defpackage.sw8.c
            if (r1 == 0) goto L_0x0171
            pv8 r1 = r0.w
            java.util.Objects.toString(r1)
        L_0x0171:
            java.util.ArrayList r1 = r0.i
            int r2 = r1.size()
            r5 = 0
        L_0x0178:
            if (r5 >= r2) goto L_0x018f
            java.lang.Object r3 = r1.get(r5)
            qw8 r3 = (defpackage.qw8) r3
            iw8 r3 = r3.a
            yu8 r4 = r0.e
            if (r3 != r4) goto L_0x0187
            goto L_0x018c
        L_0x0187:
            pv8 r4 = r0.w
            r3.h(r4)
        L_0x018c:
            int r5 = r5 + 1
            goto L_0x0178
        L_0x018f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ow8.j():void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:19:0x005a  */
    /* JADX WARNING: Removed duplicated region for block: B:22:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void k() {
        /*
            r4 = this;
            rw8 r0 = r4.r
            if (r0 == 0) goto L_0x0065
            int r1 = r0.o
            ejd r1 = r4.k
            r1.getClass()
            int r2 = r0.p
            r1.getClass()
            boolean r2 = r0.e()
            r3 = 0
            if (r2 == 0) goto L_0x0023
            ow8 r2 = defpackage.sw8.d
            if (r2 != 0) goto L_0x001c
            goto L_0x0025
        L_0x001c:
            ow8 r2 = defpackage.sw8.c()
            r2.getClass()
        L_0x0023:
            int r0 = r0.n
        L_0x0025:
            r1.getClass()
            rw8 r0 = r4.r
            int r2 = r0.l
            r1.getClass()
            int r2 = r0.k
            r1.getClass()
            boolean r1 = r4.d
            if (r1 == 0) goto L_0x0051
            iw8 r0 = r0.c()
            yu8 r1 = r4.e
            if (r0 != r1) goto L_0x0051
            hw8 r0 = r4.s
            boolean r1 = r0 instanceof defpackage.uu8
            if (r1 != 0) goto L_0x0047
            goto L_0x0051
        L_0x0047:
            uu8 r0 = (defpackage.uu8) r0
            android.media.MediaRouter2$RoutingController r0 = r0.g
            if (r0 != 0) goto L_0x004e
            goto L_0x0051
        L_0x004e:
            java.lang.String unused = r0.getId()
        L_0x0051:
            java.util.ArrayList r4 = r4.j
            int r0 = r4.size()
            if (r0 > 0) goto L_0x005a
            goto L_0x0065
        L_0x005a:
            java.lang.Object r4 = r4.get(r3)
            nw8 r4 = (defpackage.nw8) r4
            r4.getClass()
            r4 = 0
            throw r4
        L_0x0065:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ow8.k():void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0033, code lost:
        if (r2 != r0.c.x) goto L_0x013a;
     */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x0147 A[LOOP:5: B:65:0x0145->B:66:0x0147, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:69:0x0162  */
    /* JADX WARNING: Removed duplicated region for block: B:75:0x017b  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void l(defpackage.qw8 r18, defpackage.jw8 r19) {
        /*
            r17 = this;
            r0 = r17
            r1 = r18
            r2 = r19
            jw8 r3 = r1.d
            if (r3 == r2) goto L_0x0183
            r1.d = r2
            java.util.ArrayList r3 = r0.g
            java.util.ArrayList r4 = r1.b
            mw8 r7 = r0.m
            if (r2 == 0) goto L_0x013a
            java.util.List r8 = r2.c
            int r9 = r8.size()
            r10 = 0
        L_0x001b:
            if (r10 >= r9) goto L_0x0035
            java.lang.Object r11 = r8.get(r10)
            nv8 r11 = (defpackage.nv8) r11
            if (r11 == 0) goto L_0x002f
            boolean r11 = r11.d()
            if (r11 != 0) goto L_0x002c
            goto L_0x002f
        L_0x002c:
            int r10 = r10 + 1
            goto L_0x001b
        L_0x002f:
            s7f r9 = r0.c
            jw8 r9 = r9.x
            if (r2 != r9) goto L_0x013a
        L_0x0035:
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            java.util.ArrayList r9 = new java.util.ArrayList
            r9.<init>()
            java.util.Iterator r8 = r8.iterator()
            r10 = 0
            r11 = 0
        L_0x0045:
            boolean r12 = r8.hasNext()
            r13 = 257(0x101, float:3.6E-43)
            if (r12 == 0) goto L_0x00ec
            java.lang.Object r12 = r8.next()
            nv8 r12 = (defpackage.nv8) r12
            if (r12 == 0) goto L_0x00e7
            boolean r14 = r12.d()
            if (r14 != 0) goto L_0x005d
            goto L_0x00e7
        L_0x005d:
            java.lang.String r14 = r12.c()
            int r15 = r4.size()
            r5 = 0
        L_0x0066:
            if (r5 >= r15) goto L_0x007c
            java.lang.Object r16 = r4.get(r5)
            r6 = r16
            rw8 r6 = (defpackage.rw8) r6
            java.lang.String r6 = r6.b
            boolean r6 = r6.equals(r14)
            if (r6 == 0) goto L_0x0079
            goto L_0x007d
        L_0x0079:
            int r5 = r5 + 1
            goto L_0x0066
        L_0x007c:
            r5 = -1
        L_0x007d:
            if (r5 >= 0) goto L_0x00b2
            java.lang.String r5 = r0.b(r1, r14)
            rw8 r6 = new rw8
            r6.<init>(r1, r14, r5)
            int r5 = r10 + 1
            r4.add(r10, r6)
            r3.add(r6)
            java.util.List r10 = r12.b()
            int r10 = r10.size()
            if (r10 <= 0) goto L_0x00a3
            v7b r10 = new v7b
            r10.<init>(r6, r12)
            r2.add(r10)
            goto L_0x00b0
        L_0x00a3:
            r6.i(r12)
            boolean r10 = defpackage.sw8.c
            if (r10 == 0) goto L_0x00ad
            r6.toString()
        L_0x00ad:
            r7.b(r13, r6)
        L_0x00b0:
            r10 = r5
            goto L_0x0045
        L_0x00b2:
            if (r5 >= r10) goto L_0x00b8
            r12.toString()
            goto L_0x0045
        L_0x00b8:
            java.lang.Object r6 = r4.get(r5)
            rw8 r6 = (defpackage.rw8) r6
            int r13 = r10 + 1
            java.util.Collections.swap(r4, r5, r10)
            java.util.List r5 = r12.b()
            int r5 = r5.size()
            if (r5 <= 0) goto L_0x00d6
            v7b r5 = new v7b
            r5.<init>(r6, r12)
            r9.add(r5)
            goto L_0x00e4
        L_0x00d6:
            int r5 = r0.m(r6, r12)
            if (r5 == 0) goto L_0x00e4
            rw8 r5 = r0.r
            if (r6 != r5) goto L_0x00e4
            r10 = r13
            r11 = 1
            goto L_0x0045
        L_0x00e4:
            r10 = r13
            goto L_0x0045
        L_0x00e7:
            java.util.Objects.toString(r12)
            goto L_0x0045
        L_0x00ec:
            java.util.Iterator r2 = r2.iterator()
        L_0x00f0:
            boolean r5 = r2.hasNext()
            if (r5 == 0) goto L_0x0112
            java.lang.Object r5 = r2.next()
            v7b r5 = (defpackage.v7b) r5
            java.lang.Object r6 = r5.a
            rw8 r6 = (defpackage.rw8) r6
            java.lang.Object r5 = r5.b
            nv8 r5 = (defpackage.nv8) r5
            r6.i(r5)
            boolean r5 = defpackage.sw8.c
            if (r5 == 0) goto L_0x010e
            r6.toString()
        L_0x010e:
            r7.b(r13, r6)
            goto L_0x00f0
        L_0x0112:
            java.util.Iterator r2 = r9.iterator()
            r5 = r11
        L_0x0117:
            boolean r6 = r2.hasNext()
            if (r6 == 0) goto L_0x0137
            java.lang.Object r6 = r2.next()
            v7b r6 = (defpackage.v7b) r6
            java.lang.Object r8 = r6.a
            rw8 r8 = (defpackage.rw8) r8
            java.lang.Object r6 = r6.b
            nv8 r6 = (defpackage.nv8) r6
            int r6 = r0.m(r8, r6)
            if (r6 == 0) goto L_0x0117
            rw8 r6 = r0.r
            if (r8 != r6) goto L_0x0117
            r5 = 1
            goto L_0x0117
        L_0x0137:
            r2 = r5
            r5 = r10
            goto L_0x013f
        L_0x013a:
            java.util.Objects.toString(r19)
            r2 = 0
            r5 = 0
        L_0x013f:
            int r6 = r4.size()
            r8 = 1
            int r6 = r6 - r8
        L_0x0145:
            if (r6 < r5) goto L_0x0157
            java.lang.Object r8 = r4.get(r6)
            rw8 r8 = (defpackage.rw8) r8
            r9 = 0
            r8.i(r9)
            r3.remove(r8)
            int r6 = r6 + -1
            goto L_0x0145
        L_0x0157:
            r0.n(r2)
            int r0 = r4.size()
            r2 = 1
            int r0 = r0 - r2
        L_0x0160:
            if (r0 < r5) goto L_0x0177
            java.lang.Object r2 = r4.remove(r0)
            rw8 r2 = (defpackage.rw8) r2
            boolean r3 = defpackage.sw8.c
            if (r3 == 0) goto L_0x016f
            java.util.Objects.toString(r2)
        L_0x016f:
            r3 = 258(0x102, float:3.62E-43)
            r7.b(r3, r2)
            int r0 = r0 + -1
            goto L_0x0160
        L_0x0177:
            boolean r0 = defpackage.sw8.c
            if (r0 == 0) goto L_0x017e
            r18.toString()
        L_0x017e:
            r0 = 515(0x203, float:7.22E-43)
            r7.b(r0, r1)
        L_0x0183:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ow8.l(qw8, jw8):void");
    }

    public final int m(rw8 rw8, nv8 nv8) {
        int i2 = rw8.i(nv8);
        if (i2 != 0) {
            int i3 = i2 & 1;
            mw8 mw8 = this.m;
            if (i3 != 0) {
                if (sw8.c) {
                    rw8.toString();
                }
                mw8.b(259, rw8);
            }
            if ((i2 & 2) != 0) {
                if (sw8.c) {
                    rw8.toString();
                }
                mw8.b(260, rw8);
            }
            if ((i2 & 4) != 0) {
                if (sw8.c) {
                    rw8.toString();
                }
                mw8.b(261, rw8);
            }
        }
        return i2;
    }

    public final void n(boolean z2) {
        rw8 rw8 = this.p;
        if (rw8 != null && !rw8.f()) {
            Objects.toString(this.p);
            this.p = null;
        }
        rw8 rw82 = this.p;
        ArrayList arrayList = this.g;
        if (rw82 == null && !arrayList.isEmpty()) {
            Iterator it = arrayList.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                rw8 rw83 = (rw8) it.next();
                if (rw83.c() == this.c && rw83.b.equals("DEFAULT_ROUTE") && rw83.f()) {
                    this.p = rw83;
                    Objects.toString(rw83);
                    break;
                }
            }
        }
        rw8 rw84 = this.q;
        if (rw84 != null && !rw84.f()) {
            Objects.toString(this.q);
            this.q = null;
        }
        if (this.q == null && !arrayList.isEmpty()) {
            Iterator it2 = arrayList.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                rw8 rw85 = (rw8) it2.next();
                if (rw85.c() == this.c && rw85.m("android.media.intent.category.LIVE_AUDIO") && !rw85.m("android.media.intent.category.LIVE_VIDEO") && rw85.f()) {
                    this.q = rw85;
                    Objects.toString(rw85);
                    break;
                }
            }
        }
        rw8 rw86 = this.r;
        if (rw86 == null || !rw86.g) {
            Objects.toString(rw86);
            i(c(), 0);
        } else if (z2) {
            g();
            k();
        }
    }
}
