package defpackage;

import android.location.Location;
import android.os.Build;
import android.os.Bundle;
import android.os.SystemClock;
import android.util.LruCache;
import android.util.SparseArray;
import android.view.MenuItem;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import androidx.profileinstaller.ProfileInstallReceiver;
import androidx.recyclerview.widget.a;
import com.google.android.gms.location.LocationResult;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.TimeUnit;
import kotlin.Lazy;
import kotlin.collections.SetsKt;
import kotlin.reflect.KProperty;
import one.me.stickerssearch.StickersSearchScreen;

/* renamed from: p3a  reason: default package */
public final class p3a implements l99, y1c, n9g, knd, uoe, k69, b6g, ncg, qk3, g08 {
    public Object a;

    public /* synthetic */ p3a(Object obj) {
        this.a = obj;
    }

    public static List r(List list, nsb nsb) {
        if (list == null) {
            return Collections.emptyList();
        }
        ArrayList arrayList = new ArrayList(list.size());
        for (int i = 0; i < list.size(); i++) {
            sq0 sq0 = (sq0) list.get(i);
            try {
                if (nsb.test(sq0)) {
                    sze sze = sze.c;
                    String str = sq0.c;
                    arrayList.add(new tze((sq0.a * 31) + ((long) i), sze, str, sq0.d, str, (String) null, (mtb) null, (String) null));
                }
            } catch (Throwable unused) {
            }
        }
        return arrayList;
    }

    public static g0f s(String str, int i, l72 l72) {
        String str2;
        int i2;
        boolean z = true;
        boolean z2 = !str.isEmpty() && str.charAt(0) == '/';
        l72 l722 = l72.a;
        g0f g0f = g0f.c;
        g0f g0f2 = g0f.o;
        if (l72 == l722) {
            if (hhf.e.matcher(str).matches()) {
                return g0f2;
            }
            if (z2) {
                return g0f;
            }
        }
        if (hhf.c.matcher(str).matches() || hhf.f.matcher(str).matches() || z2) {
            return g0f;
        }
        if (hhf.g.matcher(str).matches()) {
            return g0f2;
        }
        if (!str.isEmpty() && str.charAt(0) == '@') {
            if (cvg.A(str)) {
                i2 = 0;
            } else {
                i2 = 0;
                for (int i3 = 0; i3 < str.length(); i3++) {
                    if (str.charAt(i3) == '@') {
                        i2++;
                    }
                }
            }
            if (i2 == 1 && !str.contains(" ") && !str.endsWith("\n")) {
                return g0f.a;
            }
        }
        if (cvg.A(str)) {
            str2 = str;
        } else {
            int t = t(str, i);
            int i4 = i;
            while (true) {
                if (i4 >= str.length()) {
                    i4 = str.length();
                    break;
                }
                char charAt = str.charAt(i4);
                if (charAt == ' ' || charAt == 10) {
                    break;
                }
                i4++;
            }
            str2 = (t == i4 || t < 0 || i4 < 0) ? "" : str.substring(t, i4);
        }
        int t2 = t(str, i);
        boolean A = cvg.A(str2);
        g0f g0f3 = g0f.v;
        if (A) {
            return g0f3;
        }
        if (t2 != 0) {
            char charAt2 = str.charAt(t2 - 1);
            if (!(charAt2 == ' ' || charAt2 == 10)) {
                z = false;
            }
        }
        return (str2.charAt(0) != '@' || !z || str2.endsWith(" ") || str2.endsWith("\n")) ? g0f3 : g0f.b;
    }

    public static int t(CharSequence charSequence, int i) {
        for (int i2 = i - 1; i2 >= 0; i2--) {
            char charAt = charSequence.charAt(i2);
            if (charAt == ' ' || charAt == 10) {
                return -1;
            }
            if (charSequence.charAt(i2) == '@') {
                return i2;
            }
        }
        return 0;
    }

    public void a(int i, Serializable serializable) {
        if (i == 6 || i == 7 || i == 8) {
            Throwable th = (Throwable) serializable;
        }
        ((ProfileInstallReceiver) this.a).setResultCode(i);
    }

    public void accept(Object obj) {
        ((Number) obj).longValue();
        fx fxVar = (fx) this.a;
        jk3 jk3 = (jk3) fxVar.b;
        tvb tvb = (tvb) jk3.a;
        z14 z14 = null;
        if (((Number) tvb.b.getValue()).longValue() > 0 && ((Number) tvb.a.getValue()).longValue() > 0) {
            ssg ssg = (ssg) jk3.c;
            svb a2 = tvb.a();
            ssg ssg2 = a2 == null ? null : new ssg(TimeUnit.MILLISECONDS.toSeconds(SystemClock.elapsedRealtime()), a2);
            svb a3 = tvb.a();
            jk3.c = a3 == null ? null : new ssg(TimeUnit.MILLISECONDS.toSeconds(SystemClock.elapsedRealtime()), a3);
            if (!(ssg == null || ssg2 == null)) {
                svb svb = ssg2.b;
                long j = svb.b + svb.c + svb.d;
                Lazy lazy = (Lazy) jk3.b;
                float floatValue = ((float) (svb.a + j)) / ((Number) lazy.getValue()).floatValue();
                svb svb2 = ssg.b;
                float floatValue2 = floatValue - (((float) (svb2.a + (svb2.b + (svb2.c + svb2.d)))) / ((Number) lazy.getValue()).floatValue());
                float floatValue3 = (((float) ssg2.a) - (((float) svb.e) / ((Number) lazy.getValue()).floatValue())) - (((float) ssg.a) - (((float) svb2.e) / ((Number) lazy.getValue()).floatValue()));
                if (!Float.isInfinite(floatValue3) && !Float.isNaN(floatValue3) && floatValue3 != c44.DEFAULT_ASPECT_RATIO) {
                    float longValue = (floatValue2 / floatValue3) / ((float) ((Number) tvb.a.getValue()).longValue());
                    if (c44.DEFAULT_ASPECT_RATIO <= longValue && longValue <= 1.0f) {
                        z14 = new z14(longValue);
                    }
                }
            }
        }
        fxVar.o = z14;
    }

    public void b(gpe gpe) {
        jte jte = jte.b;
        long j = gpe.a;
        KProperty[] kPropertyArr = StickersSearchScreen.X;
        StickersSearchScreen stickersSearchScreen = (StickersSearchScreen) this.a;
        stickersSearchScreen.getClass();
        KProperty kProperty = StickersSearchScreen.X[0];
        long longValue = ((Number) stickersSearchScreen.a.a(stickersSearchScreen)).longValue();
        ta4 W0 = jte.W0();
        StringBuilder n = tr1.n(j, ":stickers/preview?sticker_id=", "&chat_id=");
        n.append(longValue);
        W0.b(n.toString(), (Bundle) null);
    }

    public b6a c(int i) {
        List list = (List) ((SparseArray) this.a).get(i);
        if (list != null && !list.isEmpty()) {
            return (b6a) list.get(0);
        }
        throw new IllegalArgumentException(wj6.h(i, "Cannot find the wrapper for global view type "));
    }

    public int d(View view) {
        ((a) this.a).getClass();
        return a.B(view) - ((bzc) view.getLayoutParams()).leftMargin;
    }

    public int e() {
        return ((a) this.a).J();
    }

    public void f(gpe gpe) {
        KProperty[] kPropertyArr = StickersSearchScreen.X;
        ute d0 = ((StickersSearchScreen) this.a).d0();
        long j = d0.b;
        if (j > 0) {
            ((jqg) d0.v.getValue()).a(new yud(new xud(1, j, gpe.a)));
            xag.h(d0.y, p33.b);
        }
        qc7 qc7 = (qc7) ite.a.getAccessor().j(qc7.class);
        if (qc7 != null) {
            qc7.f(SetsKt.setOf(new pc7(nc7.SEND_5_MESSAGES, 1), new pc7(nc7.SEND_3_STICKERS, 1)), jgd.CHAT);
        }
    }

    public void g(jrf jrf) {
        jrf.c(((WindowManager) this.a).getDefaultDisplay());
    }

    public boolean h(m69 m69, MenuItem menuItem) {
        return false;
    }

    public mcg i(b6a b6a) {
        return new wsb(this, b6a, false);
    }

    /* JADX WARNING: Removed duplicated region for block: B:23:0x005c  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x005e  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x009f  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x00d7  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x00da  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public defpackage.jnd j(int r6) {
        /*
            r5 = this;
            java.lang.Object r5 = r5.a
            one.me.sdk.sections.SectionRecyclerWidget r5 = (one.me.sdk.sections.SectionRecyclerWidget) r5
            r5.getClass()
            kotlin.reflect.KProperty[] r0 = one.me.sdk.sections.SectionRecyclerWidget.c
            r1 = 0
            r0 = r0[r1]
            kotlin.properties.ReadOnlyProperty r1 = r5.a
            java.lang.Object r0 = r1.getValue(r5, r0)
            androidx.recyclerview.widget.RecyclerView r0 = (androidx.recyclerview.widget.RecyclerView) r0
            tyc r0 = r0.getAdapter()
            r1 = 0
            if (r0 != 0) goto L_0x001c
            return r1
        L_0x001c:
            int r2 = r0.j()
            if (r6 < r2) goto L_0x0023
            return r1
        L_0x0023:
            if (r6 >= 0) goto L_0x0026
            return r1
        L_0x0026:
            boolean r2 = r0 instanceof defpackage.rd3
            if (r2 == 0) goto L_0x002e
            r2 = r0
            rd3 r2 = (defpackage.rd3) r2
            goto L_0x002f
        L_0x002e:
            r2 = r1
        L_0x002f:
            if (r2 == 0) goto L_0x0050
            android.util.Pair r2 = r2.G(r6)
            java.lang.Object r3 = r2.first
            k1e r4 = r5.d0()
            boolean r3 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r3, (java.lang.Object) r4)
            if (r3 == 0) goto L_0x0042
            goto L_0x0043
        L_0x0042:
            r2 = r1
        L_0x0043:
            if (r2 == 0) goto L_0x0050
            java.lang.Object r2 = r2.second
            java.lang.Integer r2 = (java.lang.Integer) r2
            if (r2 == 0) goto L_0x0050
            int r6 = r2.intValue()
            goto L_0x005a
        L_0x0050:
            k1e r2 = r5.d0()
            boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r0, (java.lang.Object) r2)
            if (r0 == 0) goto L_0x00e9
        L_0x005a:
            if (r6 > 0) goto L_0x005e
            r0 = r1
            goto L_0x0078
        L_0x005e:
            k1e r0 = r5.d0()
            java.lang.Object r0 = r0.o
            ov r0 = (defpackage.ov) r0
            java.util.List r0 = r0.f
            int r2 = r6 + -1
            java.lang.Object r0 = r0.get(r2)
            i1e r0 = (defpackage.i1e) r0
            int r0 = r0.s()
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
        L_0x0078:
            k1e r2 = r5.d0()
            java.lang.Object r2 = r2.o
            ov r2 = (defpackage.ov) r2
            java.util.List r2 = r2.f
            java.lang.Object r2 = r2.get(r6)
            i1e r2 = (defpackage.i1e) r2
            int r2 = r2.s()
            k1e r3 = r5.d0()
            java.lang.Object r3 = r3.o
            ov r3 = (defpackage.ov) r3
            java.util.List r3 = r3.f
            int r3 = r3.size()
            int r3 = r3 + -1
            if (r6 != r3) goto L_0x009f
            goto L_0x00b9
        L_0x009f:
            k1e r5 = r5.d0()
            java.lang.Object r5 = r5.o
            ov r5 = (defpackage.ov) r5
            java.util.List r5 = r5.f
            int r6 = r6 + 1
            java.lang.Object r5 = r5.get(r6)
            i1e r5 = (defpackage.i1e) r5
            int r5 = r5.s()
            java.lang.Integer r1 = java.lang.Integer.valueOf(r5)
        L_0x00b9:
            if (r0 != 0) goto L_0x00bc
            goto L_0x00c2
        L_0x00bc:
            int r5 = r0.intValue()
            if (r5 == r2) goto L_0x00ce
        L_0x00c2:
            if (r1 != 0) goto L_0x00c5
            goto L_0x00cb
        L_0x00c5:
            int r5 = r1.intValue()
            if (r2 == r5) goto L_0x00ce
        L_0x00cb:
            jnd r5 = defpackage.jnd.o
            goto L_0x00e8
        L_0x00ce:
            if (r0 != 0) goto L_0x00d1
            goto L_0x00d7
        L_0x00d1:
            int r5 = r0.intValue()
            if (r5 == r2) goto L_0x00da
        L_0x00d7:
            jnd r5 = defpackage.jnd.a
            goto L_0x00e8
        L_0x00da:
            if (r1 != 0) goto L_0x00dd
            goto L_0x00e3
        L_0x00dd:
            int r5 = r1.intValue()
            if (r2 == r5) goto L_0x00e6
        L_0x00e3:
            jnd r5 = defpackage.jnd.c
            goto L_0x00e8
        L_0x00e6:
            jnd r5 = defpackage.jnd.b
        L_0x00e8:
            return r5
        L_0x00e9:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.p3a.j(int):jnd");
    }

    public void k(Object obj) {
        kt6 kt6 = (kt6) obj;
        kt6.getClass();
        List list = ((LocationResult) this.a).a;
        int size = list.size();
        Location location = size == 0 ? null : (Location) list.get(size - 1);
        kt6.a.c.L(new s58(location.getLatitude(), location.getLongitude(), location.getAltitude(), location.getAccuracy(), location.getBearing(), location.getSpeed()));
    }

    public void l() {
    }

    public int m() {
        a aVar = (a) this.a;
        return aVar.n - aVar.K();
    }

    public View n(int i) {
        return ((a) this.a).v(i);
    }

    public void o(m69 m69) {
        jmf jmf = (jmf) this.a;
        boolean p = jmf.w.a.p();
        Window.Callback callback = jmf.x;
        if (p) {
            callback.onPanelClosed(108, m69);
        } else if (callback.onPreparePanel(0, (View) null, m69)) {
            callback.onMenuOpened(108, m69);
        }
    }

    public int p(View view) {
        ((a) this.a).getClass();
        return a.E(view) + ((bzc) view.getLayoutParams()).rightMargin;
    }

    public c7e q() {
        c7e c7e = (c7e) this.a;
        int i = c7e.e;
        int[] iArr = c7e.b;
        iArr[0] = i;
        iArr[1] = i;
        iArr[2] = c7e.d;
        iArr[3] = i;
        iArr[4] = i;
        float[] fArr = c7e.a;
        fArr[0] = 0.0f;
        fArr[1] = 0.25f;
        fArr[2] = 0.5f;
        fArr[3] = 0.75f;
        fArr[4] = 1.0f;
        return c7e;
    }

    /* JADX WARNING: Removed duplicated region for block: B:19:0x004c  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x004f  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x005b  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x0090  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.util.List u(java.lang.String r11, int r12, java.util.List r13, defpackage.yze r14) {
        /*
            r10 = this;
            java.lang.Object r10 = r10.a
            l72 r10 = (defpackage.l72) r10
            g0f r0 = s(r11, r12, r10)
            int r0 = r0.ordinal()
            r1 = 64
            r2 = 0
            r3 = 1
            if (r0 == 0) goto L_0x00f8
            if (r0 == r3) goto L_0x00af
            r12 = 2
            if (r0 == r12) goto L_0x0096
            r14 = 3
            if (r0 == r14) goto L_0x0020
            java.util.List r10 = java.util.Collections.emptyList()
            goto L_0x0112
        L_0x0020:
            java.lang.String r14 = "\\s"
            java.lang.String[] r14 = r11.split(r14)
            l72 r0 = defpackage.l72.a
            if (r10 != r0) goto L_0x0032
            int r12 = r14.length
            if (r12 < r3) goto L_0x0030
            r12 = r14[r2]
            goto L_0x003f
        L_0x0030:
            r12 = r11
            goto L_0x003f
        L_0x0032:
            int r1 = r14.length
            if (r1 < r12) goto L_0x0030
            r12 = r14[r2]
            r14 = r14[r3]
            java.lang.String r1 = " "
            java.lang.String r12 = defpackage.g63.i(r12, r1, r14)
        L_0x003f:
            a62 r14 = new a62
            r1 = 10
            r14.<init>(r12, r1)
            java.util.List r12 = r(r13, r14)
            if (r10 != r0) goto L_0x004f
            java.util.regex.Pattern r10 = defpackage.hhf.e
            goto L_0x0051
        L_0x004f:
            java.util.regex.Pattern r10 = defpackage.hhf.g
        L_0x0051:
            java.util.regex.Matcher r10 = r10.matcher(r11)
            boolean r10 = r10.matches()
            if (r10 == 0) goto L_0x0090
            java.util.ArrayList r10 = new java.util.ArrayList
            int r11 = r12.size()
            r10.<init>(r11)
            java.util.Iterator r11 = r12.iterator()
        L_0x0068:
            boolean r12 = r11.hasNext()
            if (r12 == 0) goto L_0x0112
            java.lang.Object r12 = r11.next()
            tze r12 = (defpackage.tze) r12     // Catch:{ all -> 0x0089 }
            tze r13 = new tze     // Catch:{ all -> 0x0089 }
            long r1 = r12.a     // Catch:{ all -> 0x0089 }
            sze r3 = defpackage.sze.o     // Catch:{ all -> 0x0089 }
            java.lang.String r6 = r12.d     // Catch:{ all -> 0x0089 }
            r7 = 0
            r8 = 0
            r9 = 0
            r4 = 0
            r0 = r13
            r5 = r6
            r0.<init>(r1, r3, r4, r5, r6, r7, r8, r9)     // Catch:{ all -> 0x0089 }
            r10.add(r13)     // Catch:{ all -> 0x0089 }
            goto L_0x0068
        L_0x0089:
            r10 = move-exception
            java.lang.RuntimeException r11 = new java.lang.RuntimeException
            r11.<init>(r10)
            throw r11
        L_0x0090:
            java.util.List r10 = java.util.Collections.emptyList()
            goto L_0x0112
        L_0x0096:
            a62 r10 = new a62
            r12 = 9
            r10.<init>(r11, r12)
            java.util.List r10 = r(r13, r10)
            boolean r11 = r10.isEmpty()
            if (r11 != 0) goto L_0x00a9
            goto L_0x0112
        L_0x00a9:
            java.util.List r10 = java.util.Collections.emptyList()
            goto L_0x0112
        L_0x00af:
            boolean r10 = defpackage.cvg.A(r11)
            if (r10 == 0) goto L_0x00b6
            goto L_0x00e2
        L_0x00b6:
            int r10 = t(r11, r12)
        L_0x00ba:
            int r13 = r11.length()
            if (r12 >= r13) goto L_0x00d0
            char r13 = r11.charAt(r12)
            r0 = 32
            if (r13 == r0) goto L_0x00d4
            r0 = 10
            if (r13 != r0) goto L_0x00cd
            goto L_0x00d4
        L_0x00cd:
            int r12 = r12 + 1
            goto L_0x00ba
        L_0x00d0:
            int r12 = r11.length()
        L_0x00d4:
            if (r10 == r12) goto L_0x00e0
            if (r10 < 0) goto L_0x00e0
            if (r12 >= 0) goto L_0x00db
            goto L_0x00e0
        L_0x00db:
            java.lang.String r11 = r11.substring(r10, r12)
            goto L_0x00e2
        L_0x00e0:
            java.lang.String r11 = ""
        L_0x00e2:
            int r10 = r11.length()
            if (r10 != r3) goto L_0x00f3
            char r10 = r11.charAt(r2)
            if (r10 != r1) goto L_0x00f3
            java.util.List r10 = r14.c()
            goto L_0x0112
        L_0x00f3:
            java.util.List r10 = r14.f(r11)
            goto L_0x0112
        L_0x00f8:
            java.util.ArrayList r10 = new java.util.ArrayList
            int r12 = r11.length()
            if (r12 != r3) goto L_0x010b
            char r12 = r11.charAt(r2)
            if (r12 != r1) goto L_0x010b
            java.util.List r11 = r14.c()
            goto L_0x010f
        L_0x010b:
            java.util.List r11 = r14.f(r11)
        L_0x010f:
            r10.<init>(r11)
        L_0x0112:
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.p3a.u(java.lang.String, int, java.util.List, yze):java.util.List");
    }

    public void v(wu7 wu7) {
        f0 f0Var = (f0) this.a;
        f0Var.a = wu7;
        Iterator it = ((LinkedList) f0Var.c).iterator();
        while (it.hasNext()) {
            ((owg) it.next()).b();
        }
        ((LinkedList) f0Var.c).clear();
        f0Var.b = null;
    }

    public void w() {
        c7e c7e = (c7e) this.a;
        c7e.e = (((int) (Math.min(1.0f, Math.max(c44.DEFAULT_ASPECT_RATIO, 1.0f)) * 255.0f)) << 24) | (c7e.e & 16777215);
    }

    public void x(int i) {
        c7e c7e = (c7e) this.a;
        c7e.e = (i & 16777215) | (c7e.e & -16777216);
    }

    public void y(long j) {
        if (j >= 0) {
            ((c7e) this.a).o = j;
            return;
        }
        throw new IllegalArgumentException(wj6.i(j, "Given a negative duration: ").toString());
    }

    public void z(int i) {
        if (i >= 0) {
            ((c7e) this.a).f = i;
            return;
        }
        throw new IllegalArgumentException(wj6.h(i, "Given invalid width: ").toString());
    }

    public /* synthetic */ p3a(u13 u13) {
        m5h m5h = new m5h(u13);
        this.a = ixg.a(new bpa(17, ixg.a(new jk3(ixg.a(new fj(29, (Object) m5h, (Object) ixg.a(new yu9(18, (Object) m5h)))), ixg.a(new syc(14, m5h)), m5h))));
    }

    public p3a(int i) {
        switch (i) {
            case 6:
                c7e c7e = new c7e();
                this.a = c7e;
                c7e.l = false;
                return;
            default:
                this.a = new LruCache(10);
                return;
        }
    }

    /* JADX WARNING: type inference failed for: r0v2, types: [rfe, java.lang.Object, yu9] */
    public p3a(View view) {
        if (Build.VERSION.SDK_INT >= 30) {
            ? yu9 = new yu9(7, (Object) view);
            yu9.c = view;
            this.a = yu9;
            return;
        }
        this.a = new yu9(7, (Object) view);
    }
}
