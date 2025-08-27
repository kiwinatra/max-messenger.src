package defpackage;

import android.app.Activity;
import android.content.Context;
import android.graphics.drawable.Drawable;
import java.io.File;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.TimeZone;
import java.util.concurrent.TimeUnit;
import kotlin.Lazy;
import ru.ok.android.externcalls.analytics.internal.upload.MultiFileUploader;

/* renamed from: tcf  reason: default package */
public final class tcf implements hsd, xhf {
    public static final /* synthetic */ int B0 = 0;
    public scf A0;
    public boolean X;
    public mq4 Y;
    public Drawable Z;
    public final Context a;
    public final ltb b;
    public final k8 c;
    public final esb o;
    public final km3 v;
    public boolean v0;
    public final r62 w;
    public final Object w0 = new Object();
    public final Lazy x;
    public or7 x0;
    public final po5 y;
    public scf y0;
    public float z = 100.0f;
    public scf z0;

    public tcf(Context context, ltb ltb, k8 k8Var, esb esb, r62 r62, km3 km3, Lazy lazy, po5 po5) {
        this.a = context;
        this.b = ltb;
        this.c = k8Var;
        this.o = esb;
        this.w = r62;
        this.v = km3;
        this.x = lazy;
        this.y = po5;
        scf.c0 = this;
        c();
    }

    public final scf K0() {
        return c();
    }

    public final void a(String str, boolean z2) {
        ltb ltb = this.b;
        if (z2) {
            this.z0 = null;
            ltb.c.l("app.theme", str);
            fu4.k.e(this.a).l(str);
        }
        this.y0 = null;
        xme xme = scf.d0;
        xme.setValue((Object) null);
        this.o.a();
        this.v.i();
        this.w.w();
        scf c2 = c();
        this.y0 = c2;
        xme.setValue(c2);
        h(this.y0, ltb.a);
        Iterator it = this.c.a.iterator();
        while (it.hasNext()) {
            Activity activity = (Activity) ((WeakReference) it.next()).get();
            if (activity instanceof m5) {
                z68.c("tcf", "changeTamTheme: call recreate for ".concat(activity.getClass().getName()), new Object[0]);
                m5 m5Var = (m5) activity;
                scf scf = this.y0;
                if (m5Var.Q()) {
                    m5Var.X = scf;
                    try {
                        m5Var.F();
                        m5.C(scf, m5Var.v().c.f());
                    } catch (Exception unused) {
                        m5Var.recreate();
                    }
                } else {
                    m5Var.recreate();
                }
            }
        }
    }

    public final void b(boolean z2) {
        or7 or7;
        if (!this.b.c.w().equals("app.night.mode")) {
            if (z2 || (or7 = this.x0) == null || or7.f()) {
                scf e = e(g());
                if (!e.e.equals(c().e)) {
                    if (z2) {
                        or7 or72 = this.x0;
                        if (or72 != null) {
                            if (!or72.f()) {
                                or7 or73 = this.x0;
                                or73.getClass();
                                qq4.a(or73);
                            }
                            this.x0 = null;
                        }
                        StringBuilder sb = new StringBuilder("checkNightModeState: change theme to ");
                        String str = e.e;
                        sb.append(str);
                        z68.c("tcf", sb.toString(), new Object[0]);
                        a(str, false);
                    } else {
                        z68.c("tcf", "changeThemeAfterNightModeCheck: schedule theme change after delay", new Object[0]);
                        lja s = jha.A(MultiFileUploader.UPLOAD_NEXT_INTERVAL, TimeUnit.MILLISECONDS, xfd.a()).s(qe.a());
                        or7 or74 = new or7(new dre(26), new dre(27), new ivc(7, this));
                        s.a(or74);
                        this.x0 = or74;
                    }
                    if (z2) {
                        j();
                    }
                }
            }
        }
    }

    public final scf c() {
        if (this.y0 == null) {
            scf e = e(g());
            this.y0 = e;
            scf.d0.setValue(e);
            h(this.y0, this.b.a);
        }
        return this.y0;
    }

    public final ArrayList d() {
        ArrayList arrayList = new ArrayList();
        File[] listFiles = po5.g(this.y.b(), "themes").listFiles();
        if (listFiles == null) {
            return arrayList;
        }
        for (File a2 : listFiles) {
            try {
                arrayList.add(scf.a(a2));
            } catch (Exception e) {
                z68.f("tcf", "getCustomThemes: failed to parse theme", e);
            }
        }
        return arrayList;
    }

    /* JADX WARNING: Removed duplicated region for block: B:51:0x00ca  */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x00cd  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final defpackage.scf e(boolean r8) {
        /*
            r7 = this;
            if (r8 == 0) goto L_0x0007
            scf r0 = r7.A0
            if (r0 == 0) goto L_0x0007
            return r0
        L_0x0007:
            if (r8 != 0) goto L_0x000e
            scf r0 = r7.z0
            if (r0 == 0) goto L_0x000e
            return r0
        L_0x000e:
            ltb r0 = r7.b
            hq r0 = r0.c
            r0.getClass()
            if (r8 == 0) goto L_0x0024
            l9a r1 = defpackage.l9a.f0
            java.lang.String r1 = r1.e
            ls7 r0 = r0.g
            java.lang.String r2 = "app.night.theme"
            java.lang.String r0 = r0.getString(r2, r1)
            goto L_0x0030
        L_0x0024:
            vi4 r1 = defpackage.vi4.f0
            java.lang.String r1 = r1.e
            ls7 r0 = r0.g
            java.lang.String r2 = "app.theme"
            java.lang.String r0 = r0.getString(r2, r1)
        L_0x0030:
            r1 = 0
            boolean r1 = defpackage.scf.f(r0, r1)
            r2 = 1
            boolean r3 = defpackage.scf.f(r0, r2)
            kotlin.Lazy r4 = defpackage.scf.b0
            java.lang.Object r4 = r4.getValue()
            java.util.Set r4 = (java.util.Set) r4
            boolean r5 = r4 instanceof java.util.Collection
            java.lang.String r6 = "tcf"
            if (r5 == 0) goto L_0x004f
            boolean r5 = r4.isEmpty()
            if (r5 == 0) goto L_0x004f
            goto L_0x0068
        L_0x004f:
            java.util.Iterator r4 = r4.iterator()
        L_0x0053:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L_0x0068
            java.lang.Object r5 = r4.next()
            scf r5 = (defpackage.scf) r5
            java.lang.String r5 = r5.e
            boolean r5 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r5, (java.lang.Object) r0)
            if (r5 == 0) goto L_0x0053
            goto L_0x0082
        L_0x0068:
            if (r3 == 0) goto L_0x0082
            java.io.File r1 = new java.io.File     // Catch:{ Exception -> 0x0074 }
            r1.<init>(r0)     // Catch:{ Exception -> 0x0074 }
            scf r0 = defpackage.scf.a(r1)     // Catch:{ Exception -> 0x0074 }
            goto L_0x00c8
        L_0x0074:
            r0 = move-exception
            java.lang.String r1 = "failed to get file theme"
            defpackage.z68.f(r6, r1, r0)
            if (r8 == 0) goto L_0x007f
            l9a r0 = defpackage.l9a.f0
            goto L_0x00c8
        L_0x007f:
            vi4 r0 = defpackage.vi4.f0
            goto L_0x00c8
        L_0x0082:
            if (r1 != 0) goto L_0x00b9
            kotlin.Lazy r1 = defpackage.scf.b0     // Catch:{ Exception -> 0x00ae }
            java.lang.Object r1 = r1.getValue()     // Catch:{ Exception -> 0x00ae }
            java.util.Set r1 = (java.util.Set) r1     // Catch:{ Exception -> 0x00ae }
            java.util.Iterator r1 = r1.iterator()     // Catch:{ Exception -> 0x00ae }
        L_0x0090:
            boolean r2 = r1.hasNext()     // Catch:{ Exception -> 0x00ae }
            if (r2 == 0) goto L_0x00a6
            java.lang.Object r2 = r1.next()     // Catch:{ Exception -> 0x00ae }
            scf r2 = (defpackage.scf) r2     // Catch:{ Exception -> 0x00ae }
            java.lang.String r3 = r2.e     // Catch:{ Exception -> 0x00ae }
            boolean r3 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r3, (java.lang.Object) r0)     // Catch:{ Exception -> 0x00ae }
            if (r3 == 0) goto L_0x0090
            r0 = r2
            goto L_0x00c8
        L_0x00a6:
            java.util.NoSuchElementException r7 = new java.util.NoSuchElementException     // Catch:{ Exception -> 0x00ae }
            java.lang.String r8 = "Collection contains no element matching the predicate."
            r7.<init>(r8)     // Catch:{ Exception -> 0x00ae }
            throw r7     // Catch:{ Exception -> 0x00ae }
        L_0x00ae:
            r7 = move-exception
            java.lang.String r8 = "TamTheme.getThemeBy(themeId) failure, themeId = %s"
            java.lang.Object[] r0 = new java.lang.Object[]{r0}
            defpackage.z68.h(r6, r7, r8, r0)
            throw r7
        L_0x00b9:
            if (r8 == 0) goto L_0x00c0
            l9a r1 = defpackage.l9a.f0     // Catch:{ Exception -> 0x00be }
            goto L_0x00c2
        L_0x00be:
            r7 = move-exception
            goto L_0x00d0
        L_0x00c0:
            vi4 r1 = defpackage.vi4.f0     // Catch:{ Exception -> 0x00be }
        L_0x00c2:
            java.lang.String r3 = r1.e     // Catch:{ Exception -> 0x00be }
            r7.a(r3, r2)     // Catch:{ Exception -> 0x00be }
            r0 = r1
        L_0x00c8:
            if (r8 == 0) goto L_0x00cd
            r7.A0 = r0
            goto L_0x00cf
        L_0x00cd:
            r7.z0 = r0
        L_0x00cf:
            return r0
        L_0x00d0:
            java.lang.String r8 = "TamTheme.changeCurrentTheme(themeId) failure, themeId = %s"
            java.lang.Object[] r0 = new java.lang.Object[]{r0}
            defpackage.z68.h(r6, r7, r8, r0)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.tcf.e(boolean):scf");
    }

    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* JADX WARNING: Missing exception handler attribute for start block: B:2:0x0003 */
    /* JADX WARNING: Removed duplicated region for block: B:2:0x0003 A[LOOP:0: B:2:0x0003->B:15:0x0003, LOOP_START, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean f() {
        /*
            r2 = this;
            java.lang.Object r0 = r2.w0
            monitor-enter(r0)
        L_0x0003:
            android.graphics.drawable.Drawable r1 = r2.Z     // Catch:{ all -> 0x000d }
            if (r1 != 0) goto L_0x000f
            java.lang.Object r1 = r2.w0     // Catch:{ InterruptedException -> 0x0003 }
            r1.wait()     // Catch:{ InterruptedException -> 0x0003 }
            goto L_0x0003
        L_0x000d:
            r2 = move-exception
            goto L_0x0013
        L_0x000f:
            monitor-exit(r0)     // Catch:{ all -> 0x000d }
            boolean r2 = r2.v0
            return r2
        L_0x0013:
            monitor-exit(r0)     // Catch:{ all -> 0x000d }
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.tcf.f():boolean");
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean g() {
        /*
            r15 = this;
            ltb r0 = r15.b
            hq r1 = r0.c
            java.lang.String r1 = r1.w()
            r1.getClass()
            r2 = 0
            java.lang.Integer r11 = java.lang.Integer.valueOf(r2)
            hq r0 = r0.c
            r12 = 1
            r13 = -1
            int r3 = r1.hashCode()
            switch(r3) {
                case -700569351: goto L_0x003e;
                case -123544841: goto L_0x0033;
                case 1712040927: goto L_0x0028;
                case 2051489143: goto L_0x001d;
                default: goto L_0x001b;
            }
        L_0x001b:
            r1 = r13
            goto L_0x0048
        L_0x001d:
            java.lang.String r3 = "app.night.mode.system"
            boolean r1 = r1.equals(r3)
            if (r1 != 0) goto L_0x0026
            goto L_0x001b
        L_0x0026:
            r1 = 3
            goto L_0x0048
        L_0x0028:
            java.lang.String r3 = "app.night.mode.schedule"
            boolean r1 = r1.equals(r3)
            if (r1 != 0) goto L_0x0031
            goto L_0x001b
        L_0x0031:
            r1 = 2
            goto L_0x0048
        L_0x0033:
            java.lang.String r3 = "app.night.mode.auto"
            boolean r1 = r1.equals(r3)
            if (r1 != 0) goto L_0x003c
            goto L_0x001b
        L_0x003c:
            r1 = r12
            goto L_0x0048
        L_0x003e:
            java.lang.String r3 = "app.night.mode.enabled"
            boolean r1 = r1.equals(r3)
            if (r1 != 0) goto L_0x0047
            goto L_0x001b
        L_0x0047:
            r1 = r2
        L_0x0048:
            switch(r1) {
                case 0: goto L_0x00f2;
                case 1: goto L_0x00db;
                case 2: goto L_0x0061;
                case 3: goto L_0x004d;
                default: goto L_0x004b;
            }
        L_0x004b:
            goto L_0x00f3
        L_0x004d:
            android.content.Context r15 = r15.a
            android.content.res.Resources r15 = r15.getResources()
            android.content.res.Configuration r15 = r15.getConfiguration()
            int r15 = r15.uiMode
            r15 = r15 & 48
            r0 = 32
            if (r15 != r0) goto L_0x00f3
            goto L_0x00f2
        L_0x0061:
            v7b r15 = r0.y()
            v7b r0 = r0.x()
            java.util.TimeZone r1 = java.util.TimeZone.getDefault()
            long r3 = java.lang.System.currentTimeMillis()
            d84 r1 = defpackage.d84.g(r3, r1)
            d84 r14 = new d84
            java.lang.Integer r4 = r1.a
            java.lang.Integer r5 = r1.b
            java.lang.Integer r6 = r1.c
            java.lang.Object r3 = r15.a
            r7 = r3
            java.lang.Integer r7 = (java.lang.Integer) r7
            java.lang.Object r15 = r15.b
            r8 = r15
            java.lang.Integer r8 = (java.lang.Integer) r8
            r3 = r14
            r9 = r11
            r10 = r11
            r3.<init>(r4, r5, r6, r7, r8, r9, r10)
            d84 r15 = new d84
            java.lang.Integer r4 = r1.a
            java.lang.Integer r5 = r1.b
            java.lang.Integer r6 = r1.c
            java.lang.Object r3 = r0.a
            r7 = r3
            java.lang.Integer r7 = (java.lang.Integer) r7
            java.lang.Object r0 = r0.b
            r8 = r0
            java.lang.Integer r8 = (java.lang.Integer) r8
            r3 = r15
            r9 = r11
            r10 = r11
            r3.<init>(r4, r5, r6, r7, r8, r9, r10)
            int r0 = r1.compareTo(r14)
            if (r0 >= 0) goto L_0x00c0
            int r0 = r1.compareTo(r15)
            if (r0 >= 0) goto L_0x00c0
            int r0 = r14.compareTo(r15)
            if (r0 <= 0) goto L_0x00c0
            java.lang.Integer r0 = java.lang.Integer.valueOf(r13)
            d84 r14 = r14.l(r0)
            goto L_0x00ce
        L_0x00c0:
            int r0 = r15.compareTo(r14)
            if (r0 >= 0) goto L_0x00ce
            java.lang.Integer r0 = java.lang.Integer.valueOf(r12)
            d84 r15 = r15.l(r0)
        L_0x00ce:
            int r0 = r1.compareTo(r14)
            if (r0 < 0) goto L_0x00f3
            int r15 = r1.compareTo(r15)
            if (r15 >= 0) goto L_0x00f3
            goto L_0x00f2
        L_0x00db:
            boolean r1 = r15.X
            if (r1 == 0) goto L_0x00e0
            goto L_0x00f3
        L_0x00e0:
            ls7 r0 = r0.g
            java.lang.String r1 = "app.night.mode.brightness"
            r3 = 30
            int r0 = r0.getInt(r1, r3)
            float r15 = r15.z
            int r15 = defpackage.ksd.a(r15)
            if (r15 > r0) goto L_0x00f3
        L_0x00f2:
            r2 = r12
        L_0x00f3:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.tcf.g():boolean");
    }

    public final void h(scf scf, x23 x23) {
        this.Z = null;
        jbd.a.r(new xbf(this, scf, x23), new dre(25));
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v0, resolved type: android.graphics.Bitmap} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v8, resolved type: android.graphics.Bitmap} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v23, resolved type: android.graphics.drawable.ColorDrawable} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v24, resolved type: android.graphics.Bitmap} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v25, resolved type: android.graphics.Bitmap} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v26, resolved type: android.graphics.Bitmap} */
    /* JADX WARNING: type inference failed for: r4v1 */
    /* JADX WARNING: type inference failed for: r4v2, types: [android.graphics.drawable.Drawable] */
    /* JADX WARNING: type inference failed for: r4v4 */
    /* JADX WARNING: type inference failed for: r4v9 */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x0118, code lost:
        if (r5[2] < 0.6f) goto L_0x011c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x0140, code lost:
        if (r5[2] < 0.6f) goto L_0x011c;
     */
    /* JADX WARNING: Failed to insert additional move for type inference */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void i(defpackage.x23 r9) {
        /*
            r8 = this;
            boolean r0 = r8.g()
            android.net.Uri r0 = defpackage.nf0.c(r9, r0)
            r1 = 1
            android.content.Context r2 = r8.a
            r3 = 0
            if (r0 != 0) goto L_0x0056
            boolean r4 = r8.g()
            if (r4 == 0) goto L_0x001e
            r4 = r9
            a33 r4 = (defpackage.a33) r4
            java.lang.String r5 = "app.chat.background.was.set.as.solid.color.dark"
            boolean r4 = r4.c(r5, r3)
            goto L_0x0027
        L_0x001e:
            r4 = r9
            a33 r4 = (defpackage.a33) r4
            java.lang.String r5 = "app.chat.background.was.set.as.solid.color.light"
            boolean r4 = r4.c(r5, r3)
        L_0x0027:
            if (r4 != 0) goto L_0x0056
            boolean r0 = r8.g()
            android.content.res.Resources r4 = r2.getResources()
            int[] r5 = defpackage.nf0.b
            r5 = r5[r3]
            android.net.Uri r4 = defpackage.o5a.y(r4, r5)
            android.content.res.Resources r5 = r2.getResources()
            int[] r6 = defpackage.nf0.c
            r6 = r6[r3]
            android.net.Uri r5 = defpackage.o5a.y(r5, r6)
            ltb r6 = r8.b
            a33 r7 = r6.a
            defpackage.nf0.f(r4, r7, r3)
            a33 r6 = r6.a
            defpackage.nf0.f(r5, r6, r1)
            if (r0 == 0) goto L_0x0055
            r0 = r5
            goto L_0x0056
        L_0x0055:
            r0 = r4
        L_0x0056:
            r4 = 0
            if (r0 == 0) goto L_0x00c7
            android.graphics.drawable.ColorDrawable r5 = defpackage.nf0.d(r0)
            if (r5 != 0) goto L_0x00c6
            java.lang.String r6 = r0.getScheme()
            boolean r6 = defpackage.cvg.A(r6)
            if (r6 != 0) goto L_0x00c6
            java.lang.String r6 = r0.getPath()
            boolean r6 = defpackage.cvg.A(r6)
            if (r6 != 0) goto L_0x00c6
            java.lang.String r6 = r0.getScheme()     // Catch:{ all -> 0x0084 }
            java.lang.String r7 = "file"
            boolean r6 = r6.equalsIgnoreCase(r7)     // Catch:{ all -> 0x0084 }
            if (r6 == 0) goto L_0x0086
            android.graphics.Bitmap r4 = defpackage.m5a.A(r0)     // Catch:{ all -> 0x0084 }
            goto L_0x00a3
        L_0x0084:
            r0 = move-exception
            goto L_0x00b0
        L_0x0086:
            java.lang.String r6 = r0.getScheme()     // Catch:{ all -> 0x0084 }
            java.lang.String r7 = "android.resource"
            boolean r6 = r6.equalsIgnoreCase(r7)     // Catch:{ all -> 0x0084 }
            if (r6 == 0) goto L_0x00a3
            android.content.ContentResolver r4 = r2.getContentResolver()     // Catch:{ all -> 0x0084 }
            java.io.InputStream r0 = r4.openInputStream(r0)     // Catch:{ all -> 0x0084 }
            android.graphics.Bitmap r4 = android.graphics.BitmapFactory.decodeStream(r0)     // Catch:{ all -> 0x0084 }
            if (r0 == 0) goto L_0x00a3
            r0.close()     // Catch:{ all -> 0x0084 }
        L_0x00a3:
            if (r4 == 0) goto L_0x00c6
            android.graphics.drawable.BitmapDrawable r0 = new android.graphics.drawable.BitmapDrawable     // Catch:{ all -> 0x0084 }
            android.content.res.Resources r6 = r2.getResources()     // Catch:{ all -> 0x0084 }
            r0.<init>(r6, r4)     // Catch:{ all -> 0x0084 }
            r4 = r0
            goto L_0x00c7
        L_0x00b0:
            scf r4 = r8.e(r3)
            android.net.Uri r4 = r4.b(r2)
            boolean r6 = r8.g()
            defpackage.nf0.f(r4, r9, r6)
            java.lang.String r9 = "tcf"
            java.lang.String r4 = "prefetchBackground: failed: "
            defpackage.z68.f(r9, r4, r0)
        L_0x00c6:
            r4 = r5
        L_0x00c7:
            if (r4 != 0) goto L_0x00de
            android.graphics.drawable.ColorDrawable r4 = new android.graphics.drawable.ColorDrawable
            js9 r9 = defpackage.fu4.k
            fu4 r9 = r9.e(r2)
            k2b r9 = r9.f()
            df0 r9 = r9.c()
            int r9 = r9.i
            r4.<init>(r9)
        L_0x00de:
            boolean r9 = r4 instanceof android.graphics.drawable.BitmapDrawable
            r0 = 1058642330(0x3f19999a, float:0.6)
            r2 = 2
            r5 = 3
            if (r9 == 0) goto L_0x011e
            r9 = r4
            android.graphics.drawable.BitmapDrawable r9 = (android.graphics.drawable.BitmapDrawable) r9
            android.graphics.Bitmap r9 = r9.getBitmap()
            x7b r6 = new x7b
            r6.<init>(r9)
            zc4 r9 = r6.a()
            java.lang.Object r9 = r9.v
            y7b r9 = (defpackage.y7b) r9
            if (r9 == 0) goto L_0x0100
            int r9 = r9.d
            goto L_0x0101
        L_0x0100:
            r9 = r3
        L_0x0101:
            float[] r5 = new float[r5]
            java.lang.ThreadLocal r6 = defpackage.w53.a
            int r6 = android.graphics.Color.red(r9)
            int r7 = android.graphics.Color.green(r9)
            int r9 = android.graphics.Color.blue(r9)
            defpackage.w53.a(r6, r7, r9, r5)
            r9 = r5[r2]
            int r9 = (r9 > r0 ? 1 : (r9 == r0 ? 0 : -1))
            if (r9 >= 0) goto L_0x011b
            goto L_0x011c
        L_0x011b:
            r1 = r3
        L_0x011c:
            r3 = r1
            goto L_0x0143
        L_0x011e:
            boolean r9 = r4 instanceof android.graphics.drawable.ColorDrawable
            if (r9 == 0) goto L_0x0143
            r9 = r4
            android.graphics.drawable.ColorDrawable r9 = (android.graphics.drawable.ColorDrawable) r9
            int r9 = r9.getColor()
            float[] r5 = new float[r5]
            java.lang.ThreadLocal r6 = defpackage.w53.a
            int r6 = android.graphics.Color.red(r9)
            int r7 = android.graphics.Color.green(r9)
            int r9 = android.graphics.Color.blue(r9)
            defpackage.w53.a(r6, r7, r9, r5)
            r9 = r5[r2]
            int r9 = (r9 > r0 ? 1 : (r9 == r0 ? 0 : -1))
            if (r9 >= 0) goto L_0x011b
            goto L_0x011c
        L_0x0143:
            r8.v0 = r3
            r8.Z = r4
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.tcf.i(x23):void");
    }

    public final void j() {
        long j;
        mq4 mq4 = this.Y;
        if (mq4 != null) {
            if (!mq4.f()) {
                this.Y.dispose();
            }
            this.Y = null;
        }
        ltb ltb = this.b;
        if ((!ltb.c.w().equals("app.night.mode")) && ltb.c.w().equals("app.night.mode.schedule")) {
            d84 g = d84.g(System.currentTimeMillis(), TimeZone.getDefault());
            hq hqVar = ltb.c;
            v7b y2 = hqVar.y();
            v7b x2 = hqVar.x();
            d84 d84 = new d84(g.a, g.b, g.c, (Integer) y2.a, (Integer) y2.b, 0, 0);
            Integer num = g.a;
            Integer num2 = g.b;
            d84 d842 = new d84(num, num2, g.c, (Integer) x2.a, (Integer) x2.b, 0, 0);
            if (d84.compareTo(g) < 0) {
                d84 = d84.l(1);
            }
            if (d842.compareTo(g) < 0) {
                d842 = d842.l(1);
            }
            if (d84.compareTo(d842) >= 0) {
                d84 = d842;
            }
            if (!g.n(1, 2, 3) || !d84.n(1, 2, 3)) {
                j = 0;
            } else {
                d84.f();
                g.f();
                j = (long) (((d84.c() - 2400001) - (g.c() - 2400001)) * 86400);
            }
            long k = (j - ((long) g.k())) + ((long) d84.k());
            z68.c("tcf", "createScheduledJobsIfNeed: next time to check: " + d84.toString() + " delay: " + k, new Object[0]);
            this.Y = qe.a().d(new mgd(27, this), k, TimeUnit.SECONDS);
        }
    }

    public final void n1(float f, boolean z2) {
        this.z = f;
        this.X = z2;
        b(false);
    }
}
