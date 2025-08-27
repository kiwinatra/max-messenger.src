package defpackage;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.text.style.ClickableSpan;
import android.util.Pair;
import android.view.MotionEvent;
import android.view.Surface;
import android.view.View;
import android.view.ViewGroup;
import java.util.List;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function1;
import kotlin.reflect.KProperty;
import one.me.messages.list.ui.MessagesListWidget;
import one.me.notifications.settings.NotificationsSettingsScreen;
import one.me.sdk.lists.widgets.EndlessRecyclerView2;
import org.apache.http.util.LangUtils;
import ru.ok.messages.utils.EmptyVideoTokenException;
import ru.ok.tamtam.nano.Protos;

/* renamed from: g18  reason: default package */
public final /* synthetic */ class g18 implements ice, qk3, lp8, i08, vp8, hy8, pk3, gz8, p23, u2f, jqc, ia7, knd, vla {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ g18(int i, Object obj, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    public void accept(Object obj) {
        k20 k20;
        Object obj2 = this.b;
        Object obj3 = this.c;
        switch (this.a) {
            case 1:
                o48 o48 = (o48) obj2;
                o48.getClass();
                if (((Boolean) obj).booleanValue()) {
                    o48.d(0, (String) obj3);
                    return;
                }
                sqd sqd = o48.b;
                d48 d48 = o48.v;
                dfb f = sqd.f(d48);
                Uri uri = f != null ? f.v : null;
                b58 b58 = o48.a;
                b58.B1(d48, (Uri) null, 0, uri);
                z68.a("o48", "requestThumbnail " + d48);
                long j = d48.b;
                if (j == j) {
                    Uri x = o5a.x(d48.c);
                    if (x == null) {
                        b58.B1(d48, (Uri) null, 0, (Uri) null);
                        return;
                    } else {
                        o48.d(0, x.toString());
                        return;
                    }
                } else {
                    return;
                }
            case Protos.Attaches.Attach.DAILY_MEDIA /*15*/:
                ypb ypb = (ypb) obj;
                hz8 hz8 = (hz8) obj2;
                hz8.getClass();
                kqf kqf = (kqf) obj3;
                if (!kqf.A.isEmpty()) {
                    iqf c2 = kqf.a().c();
                    wvf m = kqf.A.values().iterator();
                    while (m.hasNext()) {
                        dqf dqf = (dqf) m.next();
                        spf spf = (spf) hz8.g.z.get(dqf.a.b);
                        if (spf == null || dqf.a.a != spf.a) {
                            c2.a(dqf);
                        } else {
                            c2.a(new dqf(spf, dqf.b));
                        }
                    }
                    kqf = c2.b();
                }
                ypb.J(kqf);
                return;
            case 16:
                ypb ypb2 = (ypb) obj;
                yx8 yx8 = (yx8) ((hz8) obj2).c.get();
                if (yx8 != null && !yx8.i()) {
                    yx8.g((cx8) obj3, false);
                    return;
                }
                return;
            case 21:
                kr7.P((m20) obj, (String) obj2, (qk3) obj3);
                return;
            case 22:
                kr7.Q((j10) obj, (d20) obj3, ((ltb) ((fa9) obj2).c).a.m());
                return;
            case 23:
                l20 l20 = (l20) obj;
                sd3 sd3 = (sd3) obj2;
                sd3.getClass();
                if (l20.a.equals(g20.o) && (k20 = l20.d) != null && cvg.A(k20.l) && k20.a != 0) {
                    ((uta) ((m95) sd3.i)).c(new EmptyVideoTokenException(k20, (a32) obj3), true);
                    return;
                }
                return;
            default:
                kr7.P((m20) obj, (String) obj2, new uq(6, (Function1) obj3));
                return;
        }
    }

    public void b(cx8 cx8) {
        switch (this.a) {
            case 13:
                Bundle bundle = (Bundle) this.c;
                iy8 iy8 = (iy8) this.b;
                if (bundle == null) {
                    iy8.getClass();
                    Bundle bundle2 = Bundle.EMPTY;
                }
                iy8.w.m(cx8);
                return;
            default:
                iy8 iy82 = (iy8) this.b;
                iy82.getClass();
                String str = ((zp8) this.c).a;
                if (TextUtils.isEmpty(str)) {
                    i8b.V("onRemoveQueueItem(): Media ID shouldn't be null");
                    return;
                }
                ypb ypb = iy82.w.s;
                if (!ypb.J0(17)) {
                    i8b.V("Can't remove item by ID without COMMAND_GET_TIMELINE being available");
                    return;
                }
                jkf l0 = ypb.l0();
                hkf hkf = new hkf();
                for (int i = 0; i < l0.p(); i++) {
                    if (TextUtils.equals(l0.n(i, hkf, 0).c.a, str)) {
                        ypb.K(i);
                        return;
                    }
                }
                return;
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v6, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v7, resolved type: ppb} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void c(defpackage.np8 r11) {
        /*
            r10 = this;
            int r0 = r10.a
            switch(r0) {
                case 11: goto L_0x0082;
                default: goto L_0x0005;
            }
        L_0x0005:
            boolean r0 = r11.isConnected()
            if (r0 != 0) goto L_0x000d
            goto L_0x0081
        L_0x000d:
            pob r0 = r11.r
            java.lang.Object r1 = r10.c
            pob r1 = (defpackage.pob) r1
            boolean r0 = defpackage.v0g.a(r0, r1)
            r0 = r0 ^ 1
            zvd r2 = r11.q
            java.lang.Object r10 = r10.b
            zvd r10 = (defpackage.zvd) r10
            boolean r2 = defpackage.v0g.a(r2, r10)
            r2 = r2 ^ 1
            if (r0 != 0) goto L_0x002a
            if (r2 != 0) goto L_0x002a
            goto L_0x0081
        L_0x002a:
            r11.q = r10
            r3 = 0
            if (r0 == 0) goto L_0x0042
            r11.r = r1
            pob r0 = r11.t
            pob r4 = r11.s
            pob r1 = defpackage.np8.I0(r1, r4)
            r11.t = r1
            boolean r0 = r1.equals(r0)
            r0 = r0 ^ 1
            goto L_0x0043
        L_0x0042:
            r0 = r3
        L_0x0043:
            if (r2 != 0) goto L_0x0047
            if (r0 == 0) goto L_0x0059
        L_0x0047:
            k0d r1 = r11.p
            tb7 r3 = r11.o
            pob r4 = r11.t
            k0d r3 = defpackage.e63.a(r3, r10, r4)
            r11.p = r3
            boolean r1 = r3.equals(r1)
            r3 = r1 ^ 1
        L_0x0059:
            if (r0 == 0) goto L_0x0069
            ap8 r0 = new ap8
            r1 = 16
            r0.<init>((defpackage.np8) r11, (int) r1)
            m56 r1 = r11.h
            r4 = 13
            r1.m(r4, r0)
        L_0x0069:
            qo8 r0 = r11.a
            if (r2 == 0) goto L_0x0075
            ap8 r1 = new ap8
            r1.<init>((defpackage.np8) r11, (defpackage.zvd) r10)
            r0.F0(r1)
        L_0x0075:
            if (r3 == 0) goto L_0x0081
            ap8 r10 = new ap8
            r1 = 18
            r10.<init>((defpackage.np8) r11, (int) r1)
            r0.F0(r10)
        L_0x0081:
            return
        L_0x0082:
            boolean r0 = r11.isConnected()
            if (r0 != 0) goto L_0x008a
            goto L_0x012d
        L_0x008a:
            ppb r0 = r11.z
            java.lang.Object r1 = r10.b
            ppb r1 = (defpackage.ppb) r1
            java.lang.Object r10 = r10.c
            npb r10 = (defpackage.npb) r10
            if (r0 == 0) goto L_0x00a9
            npb r2 = r11.A
            if (r2 == 0) goto L_0x00a9
            pob r3 = r11.t
            android.util.Pair r10 = defpackage.kne.C(r0, r2, r1, r10, r3)
            java.lang.Object r0 = r10.first
            r1 = r0
            ppb r1 = (defpackage.ppb) r1
            java.lang.Object r10 = r10.second
            npb r10 = (defpackage.npb) r10
        L_0x00a9:
            r0 = 0
            r11.z = r0
            r11.A = r0
            ws r2 = r11.j
            boolean r2 = r2.isEmpty()
            if (r2 != 0) goto L_0x00bc
            r11.z = r1
            r11.A = r10
            goto L_0x012d
        L_0x00bc:
            ppb r4 = r11.n
            npb r2 = defpackage.npb.c
            pob r3 = r11.t
            android.util.Pair r10 = defpackage.kne.C(r4, r2, r1, r10, r3)
            java.lang.Object r10 = r10.first
            r5 = r10
            ppb r5 = (defpackage.ppb) r5
            r11.n = r5
            uob r10 = r4.d
            uob r2 = r1.d
            boolean r10 = r10.equals(r2)
            if (r10 == 0) goto L_0x00e4
            uob r10 = r4.e
            uob r1 = r1.e
            boolean r10 = r10.equals(r1)
            if (r10 != 0) goto L_0x00e2
            goto L_0x00e4
        L_0x00e2:
            r8 = r0
            goto L_0x00eb
        L_0x00e4:
            int r10 = r5.f
            java.lang.Integer r10 = java.lang.Integer.valueOf(r10)
            r8 = r10
        L_0x00eb:
            ir8 r10 = r4.s()
            ir8 r1 = r5.s()
            boolean r10 = defpackage.v0g.a(r10, r1)
            if (r10 != 0) goto L_0x0101
            int r10 = r5.b
            java.lang.Integer r10 = java.lang.Integer.valueOf(r10)
            r9 = r10
            goto L_0x0102
        L_0x0101:
            r9 = r0
        L_0x0102:
            jkf r10 = r4.j
            jkf r1 = r5.j
            boolean r10 = r10.equals(r1)
            if (r10 != 0) goto L_0x0114
            int r10 = r5.k
            java.lang.Integer r10 = java.lang.Integer.valueOf(r10)
            r6 = r10
            goto L_0x0115
        L_0x0114:
            r6 = r0
        L_0x0115:
            int r10 = r4.u
            int r1 = r5.u
            if (r10 != r1) goto L_0x0124
            boolean r10 = r4.t
            boolean r2 = r5.t
            if (r10 == r2) goto L_0x0122
            goto L_0x0124
        L_0x0122:
            r7 = r0
            goto L_0x0129
        L_0x0124:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r1)
            goto L_0x0122
        L_0x0129:
            r3 = r11
            r3.W0(r4, r5, r6, r7, r8, r9)
        L_0x012d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.g18.c(np8):void");
    }

    public void d(i67 i67, int i) {
        switch (this.a) {
            case 3:
                np8 np8 = (np8) this.b;
                np8.getClass();
                i67.v0(np8.c, i, ((us8) this.c).c());
                return;
            case 4:
                np8 np82 = (np8) this.b;
                np82.getClass();
                i67.c0(np82.c, i, ((ir8) this.c).d(true));
                return;
            case 5:
                i67.h0(((np8) this.b).c, i, (Surface) this.c);
                return;
            case 6:
                i67.B(((np8) this.b).c, i, ((kqf) this.c).c());
                return;
            case 7:
                np8 np83 = (np8) this.b;
                np83.getClass();
                gob gob = (gob) this.c;
                gob.getClass();
                Bundle bundle = new Bundle();
                bundle.putFloat(gob.e, gob.a);
                bundle.putFloat(gob.f, gob.b);
                i67.o0(np83.c, i, bundle);
                return;
            default:
                np8 np84 = (np8) this.b;
                np84.getClass();
                qb7 o = tb7.o();
                int i2 = 0;
                while (true) {
                    List list = (List) this.c;
                    if (i2 < list.size()) {
                        o.a(((ir8) list.get(i2)).d(true));
                        i2++;
                    } else {
                        i67.Q(np84.c, i, new gv0(o.j()));
                        return;
                    }
                }
        }
    }

    public boolean f(ClickableSpan clickableSpan, int i, int i2, String str, sy7 sy7, MotionEvent motionEvent) {
        pm7 pm7;
        sy7 sy72 = sy7;
        d99 d99 = (d99) this.c;
        long j = d99.H0;
        pn9 pn9 = (pn9) ((t89) this.b);
        pn9.getClass();
        KProperty[] kPropertyArr = MessagesListWidget.R0;
        MessagesListWidget messagesListWidget = pn9.a;
        messagesListWidget.getClass();
        KProperty[] kPropertyArr2 = MessagesListWidget.R0;
        KProperty kProperty = kPropertyArr2[1];
        long[] jArr = (long[]) messagesListWidget.c.a(messagesListWidget);
        wie wie = messagesListWidget.E0;
        if (jArr == null || ((pm7 = (pm7) wie.getValue(messagesListWidget, kPropertyArr2[4])) != null && !pm7.isActive())) {
            if (messagesListWidget.k0().v().e()) {
                messagesListWidget.k0().v().f(j);
            } else {
                sy7 sy73 = sy7.a;
                View view = d99.G0;
                if (sy72 == sy73 || sy72 == sy7.w) {
                    szf.a.getClass();
                    szf d = cd4.d(str);
                    ne9 o = messagesListWidget.k0().o();
                    if (o != null) {
                        g99 g99 = (g99) messagesListWidget.z.getValue();
                        e99 O = kr7.O(d);
                        g99.getClass();
                        g99.a(j, O, o, f99.CLICK);
                    }
                    wie.setValue(messagesListWidget, kPropertyArr2[4], ev0.v(messagesListWidget.getViewLifecycleScope(), (CoroutineContext) null, f14.b, new nn9(j, str, motionEvent, messagesListWidget, d, sy7, (ViewGroup) view, (Continuation) null), 1));
                    return true;
                }
                messagesListWidget.m0(j, view);
            }
        }
        return true;
    }

    public Object g(yx8 yx8, cx8 cx8, int i) {
        switch (this.a) {
            case LangUtils.HASH_SEED /*17*/:
                return yx8.i() ? o5a.F(new swd(-100)) : v0g.g0((zz7) ((gz8) this.b).g(yx8, cx8, i), new u00((Object) yx8, (Object) cx8, (Object) (vx8) this.c, 18));
            default:
                return yx8.i() ? o5a.F(new swd(-100)) : v0g.g0((zz7) ((gz8) this.b).g(yx8, cx8, i), new u00((Object) yx8, (Object) cx8, (Object) (fz8) this.c, 19));
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0025, code lost:
        r2 = (r2 = r0.Z).z;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object get() {
        /*
            r2 = this;
            java.lang.Object r0 = r2.b
            n99 r0 = (defpackage.n99) r0
            r0.getClass()
            java.lang.Object r2 = r2.c
            s3a r2 = (defpackage.s3a) r2
            boolean r1 = r2.g0()
            if (r1 == 0) goto L_0x0032
            java.lang.Object r2 = r2.c
            android.view.View r2 = (android.view.View) r2
            boolean r2 = r2.isEnabled()
            if (r2 == 0) goto L_0x0032
            s60 r2 = r0.Z
            if (r2 == 0) goto L_0x0030
            r60 r0 = r2.m
            r60 r1 = defpackage.r60.c
            if (r0 != r1) goto L_0x0032
            or7 r2 = r2.z
            if (r2 == 0) goto L_0x0030
            boolean r2 = r2.f()
            if (r2 != 0) goto L_0x0030
            goto L_0x0032
        L_0x0030:
            r2 = 0
            goto L_0x0033
        L_0x0032:
            r2 = 1
        L_0x0033:
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r2)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.g18.get():java.lang.Object");
    }

    /* JADX WARNING: type inference failed for: r16v1 */
    /* JADX WARNING: type inference failed for: r17v1, types: [wu9] */
    /* JADX WARNING: type inference failed for: r6v5, types: [atf] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void h(defpackage.pbe r25) {
        /*
            r24 = this;
            r0 = r24
            r1 = r25
            int r2 = r0.a
            switch(r2) {
                case 0: goto L_0x010a;
                case 1: goto L_0x0009;
                case 2: goto L_0x007a;
                default: goto L_0x0009;
            }
        L_0x0009:
            java.lang.Object r2 = r0.b
            b1a r2 = (defpackage.b1a) r2
            sqd r3 = r2.o
            java.lang.Object r0 = r0.c
            d48 r0 = (defpackage.d48) r0
            uqd r3 = r3.i(r0)
            java.lang.String r4 = r0.a()
            android.net.Uri r4 = android.net.Uri.parse(r4)
            android.content.Context r2 = r2.c
            iq5 r2 = defpackage.o5a.C(r2, r4)
            java.lang.Object r4 = r2.f
            android.graphics.Point r4 = (android.graphics.Point) r4
            if (r3 == 0) goto L_0x0053
            p4g r5 = r3.b
            if (r5 != 0) goto L_0x0030
            goto L_0x0053
        L_0x0030:
            atf r16 = new atf
            java.lang.String r7 = r0.a()
            int r8 = r4.x
            int r9 = r4.y
            p4g r0 = r3.b
            float r3 = r0.b
            long r10 = r2.c
            float r4 = (float) r10
            float r3 = r3 * r4
            long r11 = (long) r3
            float r0 = r0.c
            float r0 = r0 * r4
            long r13 = (long) r0
            int r10 = r2.d
            boolean r15 = r5.d
            r6 = r16
            r6.<init>(r7, r8, r9, r10, r11, r13, r15)
        L_0x0050:
            r0 = r16
            goto L_0x0076
        L_0x0053:
            wu9 r16 = new wu9
            uu9 r3 = new uu9
            java.lang.String r0 = r0.a()
            int r5 = r4.x
            int r4 = r4.y
            int r6 = r2.d
            r3.<init>(r0, r5, r4, r6)
            java.util.List r22 = java.util.Collections.singletonList(r3)
            r18 = 0
            long r2 = r2.c
            r23 = 0
            r17 = r16
            r20 = r2
            r17.<init>(r18, r20, r22, r23)
            goto L_0x0050
        L_0x0076:
            r1.a(r0)
            return
        L_0x007a:
            java.lang.Object r2 = r0.b
            ae8 r2 = (defpackage.ae8) r2
            r2.getClass()
            defpackage.ae8.a()
            abf r3 = r2.f
            r3.getClass()
            int r4 = defpackage.nad.r0
            r3.b()
            java.lang.Object r0 = r0.c
            android.content.Context r0 = (android.content.Context) r0
            android.graphics.Bitmap r4 = defpackage.o5a.i0(r4, r0)
            int r5 = r4.getWidth()
            double r5 = (double) r5
            r7 = 4609434218613702656(0x3ff8000000000000, double:1.5)
            double r5 = r5 * r7
            int r5 = (int) r5
            int r6 = r4.getHeight()
            double r9 = (double) r6
            double r9 = r9 * r7
            int r6 = (int) r9
            android.graphics.Bitmap r5 = defpackage.o5a.e0(r5, r6, r4)
            java.util.concurrent.ConcurrentHashMap r6 = r2.e
            zd8 r9 = defpackage.zd8.a
            v02 r10 = r2.g
            r10.getClass()
            ao0 r10 = defpackage.v02.g(r4)
            r6.put(r9, r10)
            boolean r2 = r2.h
            if (r2 == 0) goto L_0x00c1
            r4.recycle()
        L_0x00c1:
            zd8 r4 = defpackage.zd8.b
            ao0 r9 = defpackage.v02.g(r5)
            r6.put(r4, r9)
            if (r2 == 0) goto L_0x00cf
            r5.recycle()
        L_0x00cf:
            int r4 = defpackage.nad.s0
            r3.b()
            android.graphics.Bitmap r0 = defpackage.o5a.i0(r4, r0)
            int r3 = r0.getWidth()
            double r3 = (double) r3
            double r3 = r3 * r7
            int r3 = (int) r3
            int r4 = r0.getHeight()
            double r4 = (double) r4
            double r4 = r4 * r7
            int r4 = (int) r4
            android.graphics.Bitmap r3 = defpackage.o5a.e0(r3, r4, r0)
            zd8 r4 = defpackage.zd8.c
            ao0 r5 = defpackage.v02.g(r0)
            r6.put(r4, r5)
            if (r2 == 0) goto L_0x00f8
            r0.recycle()
        L_0x00f8:
            zd8 r0 = defpackage.zd8.o
            ao0 r4 = defpackage.v02.g(r3)
            r6.put(r0, r4)
            if (r2 == 0) goto L_0x0106
            r3.recycle()
        L_0x0106:
            r1.a(r6)
            return
        L_0x010a:
            java.lang.Object r2 = r0.b
            j18 r2 = (defpackage.j18) r2
            r2.getClass()
            defpackage.j18.a()
            java.lang.Object r0 = r0.c
            tv9 r0 = (defpackage.tv9) r0
            java.util.List r3 = r0.c
            boolean r3 = r3.isEmpty()
            if (r3 == 0) goto L_0x0121
            goto L_0x0139
        L_0x0121:
            r62 r3 = r2.Z
            long r4 = r0.b
            a32 r3 = r3.D(r4)
            if (r3 != 0) goto L_0x012c
            goto L_0x0139
        L_0x012c:
            long r3 = r3.a
            java.util.List r0 = r0.c
            fa9 r2 = r2.Y
            java.util.ArrayList r0 = r2.l(r3, r0)
            r1.a(r0)
        L_0x0139:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.g18.h(pbe):void");
    }

    public void i(ja7 ja7) {
        npg npg = (npg) this.b;
        npg.getClass();
        ((ia7) this.c).i(npg);
    }

    public void invoke(Object obj) {
        sob sob = (sob) obj;
        switch (this.a) {
            case 8:
                sob.H(((Integer) this.c).intValue(), (ir8) this.b);
                return;
            default:
                sob.H(((Integer) this.c).intValue(), ((ppb) ((ni3) this.b).a).s());
                return;
        }
    }

    public jnd j(int i) {
        jnd jnd;
        KProperty[] kPropertyArr = NotificationsSettingsScreen.Y;
        tyc adapter = ((EndlessRecyclerView2) this.b).getAdapter();
        rd3 rd3 = adapter instanceof rd3 ? (rd3) adapter : null;
        if (rd3 == null) {
            return null;
        }
        Pair G = rd3.G(i);
        Integer num = G.first instanceof k1e ? (Integer) G.second : -1;
        NotificationsSettingsScreen notificationsSettingsScreen = (NotificationsSettingsScreen) this.c;
        int j = notificationsSettingsScreen.v.j();
        int intValue = num.intValue();
        if (intValue < 0 || intValue >= j) {
            return null;
        }
        int intValue2 = num.intValue();
        k1e k1e = notificationsSettingsScreen.v;
        i1e i1e = (i1e) ((lz7) k1e.E(intValue2));
        if (i1e.s() == 0) {
            jnd = jnd.o;
        } else {
            if (num.intValue() == k1e.j() - 1) {
                jnd = jnd.o;
            } else {
                jnd = i1e.s() != ((i1e) ((lz7) k1e.E(num.intValue() + -1))).s() ? jnd.a : i1e.s() != ((i1e) ((lz7) k1e.E(num.intValue() + 1))).s() ? jnd.c : jnd.b;
            }
        }
        return jnd;
    }

    public iog z(View view, iog iog) {
        boolean z;
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams != null) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            int i = pq7.a;
            boolean b2 = pq7.b(pq7.c);
            j50 j50 = (j50) this.b;
            Context context = (Context) this.c;
            if (b2) {
                int a2 = pq7.a(context);
                int i2 = marginLayoutParams.bottomMargin;
                marginLayoutParams.bottomMargin = i2 >= a2 ? ((z0b) j50.o).v.c : a2 + i2;
                z = true;
            } else {
                if (!j50.b || marginLayoutParams.bottomMargin < pq7.a(context)) {
                    marginLayoutParams.bottomMargin = Math.max(marginLayoutParams.bottomMargin, iog.a.f(7).d);
                } else {
                    marginLayoutParams.bottomMargin -= pq7.a(context);
                }
                z = false;
            }
            j50.b = z;
            view.setLayoutParams(marginLayoutParams);
            return iog;
        }
        throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
    }

    public /* synthetic */ g18(Object obj, Object obj2, Object obj3, int i) {
        this.a = i;
        this.b = obj;
        this.c = obj3;
    }
}
