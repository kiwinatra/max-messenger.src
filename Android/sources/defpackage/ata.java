package defpackage;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.hardware.camera2.CameraCaptureSession;
import android.media.MediaCodec;
import android.net.Uri;
import android.text.TextUtils;
import android.util.Base64;
import android.view.Surface;
import android.view.ViewParent;
import android.view.animation.Animation;
import android.widget.ScrollView;
import io.reactivex.rxjava3.exceptions.CompositeException;
import java.nio.charset.CharsetDecoder;
import java.nio.charset.CodingErrorAction;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.collections.CollectionsKt;
import kotlin.collections.SetsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.properties.ReadWriteProperty;
import kotlin.reflect.KProperty;
import one.me.chats.picker.PickerChatController;
import one.me.chats.search.ChatsListSearchScreen;
import one.me.sdk.uikit.common.views.OneMeContactsChipGroup;

/* renamed from: ata  reason: default package */
public final class ata implements ReadWriteProperty, qk3, mza, tg3, b4d, ebe, u4b, xra, on0, nj6, gce {
    public static final Object o = new Object();
    public static oog v;
    public final /* synthetic */ int a;
    public Object b;
    public Object c;

    public /* synthetic */ ata(int i, Object obj, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    public static s7h q(Context context, Intent intent, boolean z) {
        oog oog;
        synchronized (o) {
            try {
                if (v == null) {
                    v = new oog(context);
                }
                oog = v;
            } finally {
                while (true) {
                }
            }
        }
        if (!z) {
            return oog.b(intent).j(new fs(2), new ci5(19));
        }
        if (eud.j().q(context)) {
            synchronized (seg.b) {
                try {
                    seg.a(context);
                    boolean booleanExtra = intent.getBooleanExtra("com.google.firebase.iid.WakeLockHolder.wakefulintent", false);
                    intent.putExtra("com.google.firebase.iid.WakeLockHolder.wakefulintent", true);
                    if (!booleanExtra) {
                        seg.c.a(seg.a);
                    }
                    oog.b(intent).i(new jrf(13, (Object) intent));
                } catch (Throwable th) {
                    throw th;
                }
            }
        } else {
            oog.b(intent);
        }
        return hsg.o(-1);
    }

    public static float r(float[] fArr, int i) {
        float f = 0.0f;
        for (int i2 = 0; i2 < i; i2++) {
            f += fArr[i2];
        }
        return i > 0 ? f / ((float) i) : c44.DEFAULT_ASPECT_RATIO;
    }

    public static oe4 s(cvg cvg) {
        wf4 wf4 = new wf4();
        wf4.b = null;
        cvg.getClass();
        cvg.getClass();
        new lf6((String) null, false, wf4);
        cvg.getClass();
        throw null;
    }

    public s7h A(Intent intent) {
        String stringExtra = intent.getStringExtra("gcm.rawData64");
        boolean z = false;
        if (stringExtra != null) {
            intent.putExtra("rawData", Base64.decode(stringExtra, 0));
            intent.removeExtra("gcm.rawData64");
        }
        Context context = (Context) this.b;
        boolean z2 = context.getApplicationInfo().targetSdkVersion >= 26;
        if ((intent.getFlags() & 268435456) != 0) {
            z = true;
        }
        if (z2 && !z) {
            return q(context, intent, z);
        }
        z52 z52 = new z52(5, context, intent);
        fs fsVar = (fs) this.c;
        return hsg.f(z52, fsVar).k(fsVar, new ij5(context, intent, z, 0));
    }

    public void B() {
        o67 o67 = (o67) this.b;
        if (o67.b) {
            o67.e();
            for (int i = 0; i < 2; i++) {
                ((float[]) o67.d)[i] = ((float[]) o67.f)[i];
                ((float[]) o67.e)[i] = ((float[]) o67.g)[i];
            }
            if (!o67.b) {
                o67.b = true;
            }
        }
    }

    public void C(CharSequence charSequence) {
        String str;
        KProperty[] kPropertyArr = ChatsListSearchScreen.F0;
        ov2 d0 = ((ChatsListSearchScreen) this.b).d0();
        String str2 = "";
        if (charSequence == null || (str = charSequence.toString()) == null) {
            str = str2;
        }
        xme xme = d0.C0;
        if (Intrinsics.areEqual((Object) str, (Object) ((vu2) xme.getValue()).b)) {
            z68.c(d0.H0, "Same query for search, ignore it", new Object[0]);
            return;
        }
        String str3 = ((vu2) xme.getValue()).b;
        if (str3 != null) {
            str2 = str3;
        }
        xme.m((Object) null, new vu2(uu2.a, str, z77.d, (str.length() <= 0 || !StringsKt__StringsKt.startsWith$default((CharSequence) str2, (CharSequence) str, false, 2, (Object) null)) ? CollectionsKt.emptyList() : ((vu2) xme.getValue()).d, true));
        if (str.length() == 0) {
            d0.l(false);
            return;
        }
        aje aje = d0.K0;
        if (aje != null) {
            aje.b((CancellationException) null);
        }
        d0.o.d();
        aje aje2 = d0.L0;
        if (aje2 != null) {
            aje2.b((CancellationException) null);
        }
        pm7 pm7 = (pm7) d0.N0.getValue(d0, ov2.O0[0]);
        if (pm7 != null) {
            pm7.b((CancellationException) null);
        }
        xme xme2 = d0.E0;
        xme2.getClass();
        xme2.m((Object) null, str);
    }

    public void D(l9d l9d) {
        Activity d;
        z68.c(ata.class.getName(), "set new router", new Object[0]);
        l9d l9d2 = (l9d) this.b;
        if (l9d2 != null && (d = l9d2.x().d()) != null && !d.isDestroyed() && !d.isFinishing()) {
            ((e24) ((bta) this.c).a.getValue()).a((String) null, new IllegalStateException("Overriding active router"));
        }
        this.b = l9d;
    }

    public void a(Object obj) {
        q55 q55;
        switch (this.a) {
            case 22:
                q55 q552 = (q55) obj;
                Objects.toString(q552);
                if (q552 != null) {
                    lyc lyc = (lyc) this.c;
                    ScheduledFuture scheduledFuture = lyc.Y;
                    if (scheduledFuture != null && scheduledFuture.cancel(false) && (q55 = lyc.F) != null && q55 == q552) {
                        lyc.r(q55);
                    }
                    lyc.b0 = (nr4) this.b;
                    lyc.A((Surface) null);
                    lyc.v(lyc.o());
                    return;
                }
                return;
            default:
                ((gce) this.b).a(obj);
                return;
        }
    }

    public void accept(Object obj) {
        mv4 c2;
        Uri uri = (Uri) obj;
        Iterator it = ((o20) this.b).g.iterator();
        while (it.hasNext()) {
            p89 p89 = (p89) ((s00) it.next());
            w28 w28 = p89.z;
            if (w28 != null && w28.G() == 1) {
                l20 F = p89.z.F(0);
                g20 g20 = F.a;
                g20 g202 = g20.o;
                if (g20 == g202 || ld8.Y(F)) {
                    if (TextUtils.equals(F.q, ((l20) this.c).q) && p89.z.G() == 1) {
                        l20 F2 = p89.z.F(0);
                        if ((F2.a == g202 || ld8.Y(F2)) && (c2 = p89.o.c(0)) != null) {
                            knb a2 = ld9.p.get();
                            a2.e = qa7.a(p89.N0.a(F2));
                            a2.l = c2.v;
                            c2.i(a2.a());
                        }
                    }
                }
            }
        }
    }

    /*  JADX ERROR: IndexOutOfBoundsException in pass: RegionMakerVisitor
        java.lang.IndexOutOfBoundsException: Index: 0, Size: 0
        	at java.util.ArrayList.rangeCheck(ArrayList.java:659)
        	at java.util.ArrayList.get(ArrayList.java:435)
        	at jadx.core.dex.nodes.InsnNode.getArg(InsnNode.java:101)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:611)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:561)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:598)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:49)
        */
    public void b(java.lang.Object r4) {
        /*
            r3 = this;
            java.lang.Object r4 = r3.c
            ub8 r4 = (defpackage.ub8) r4
            java.lang.Object r3 = r3.b
            s14 r3 = (defpackage.s14) r3
            r4.getClass()
            r3.getClass()
            monitor-enter(r4)
            monitor-enter(r4)     // Catch:{ all -> 0x0056 }
            int r0 = r3.c     // Catch:{ all -> 0x005a }
            r1 = 0
            r2 = 1
            if (r0 <= 0) goto L_0x0018
            r0 = r2
            goto L_0x0019
        L_0x0018:
            r0 = r1
        L_0x0019:
            defpackage.cvg.q(r0)     // Catch:{ all -> 0x005a }
            int r0 = r3.c     // Catch:{ all -> 0x005a }
            int r0 = r0 - r2
            r3.c = r0     // Catch:{ all -> 0x005a }
            monitor-exit(r4)     // Catch:{ all -> 0x0056 }
            monitor-enter(r4)     // Catch:{ all -> 0x0056 }
            boolean r0 = r3.d     // Catch:{ all -> 0x0035 }
            if (r0 != 0) goto L_0x0037
            int r0 = r3.c     // Catch:{ all -> 0x0035 }
            if (r0 != 0) goto L_0x0037
            cs r0 = r4.b     // Catch:{ all -> 0x0035 }
            java.lang.Object r1 = r3.a     // Catch:{ all -> 0x0035 }
            r0.G(r1, r3)     // Catch:{ all -> 0x0035 }
            monitor-exit(r4)     // Catch:{ all -> 0x0056 }
            r1 = r2
            goto L_0x0038
        L_0x0035:
            r3 = move-exception
            goto L_0x0058
        L_0x0037:
            monitor-exit(r4)     // Catch:{ all -> 0x0056 }
        L_0x0038:
            y33 r0 = r4.g(r3)     // Catch:{ all -> 0x0056 }
            monitor-exit(r4)     // Catch:{ all -> 0x0056 }
            defpackage.y33.U(r0)
            if (r1 == 0) goto L_0x0043
            goto L_0x0044
        L_0x0043:
            r3 = 0
        L_0x0044:
            if (r3 == 0) goto L_0x004f
            xv1 r0 = r3.e
            if (r0 == 0) goto L_0x004f
            java.lang.Object r3 = r3.a
            r0.t(r3, r2)
        L_0x004f:
            r4.e()
            r4.c()
            return
        L_0x0056:
            r3 = move-exception
            goto L_0x005d
        L_0x0058:
            monitor-exit(r4)     // Catch:{ all -> 0x0035 }
            throw r3     // Catch:{ all -> 0x0056 }
        L_0x005a:
            r3 = move-exception
            monitor-exit(r4)     // Catch:{ all -> 0x005a }
            throw r3     // Catch:{ all -> 0x0056 }
        L_0x005d:
            monitor-exit(r4)     // Catch:{ all -> 0x0056 }
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ata.b(java.lang.Object):void");
    }

    public void c(mq4 mq4) {
        ((gce) this.b).c(mq4);
    }

    /* JADX WARNING: Removed duplicated region for block: B:2:0x0005 A[LOOP:0: B:2:0x0005->B:5:0x000f, LOOP_START] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void clear() {
        /*
            r4 = this;
            int r0 = r4.a
            switch(r0) {
                case 5: goto L_0x0013;
                default: goto L_0x0005;
            }
        L_0x0005:
            java.lang.Object r0 = r4.poll()
            if (r0 == 0) goto L_0x0012
            boolean r0 = r4.isEmpty()
            if (r0 != 0) goto L_0x0012
            goto L_0x0005
        L_0x0012:
            return
        L_0x0013:
            java.lang.Object r0 = r4.c
            java.util.HashMap r0 = (java.util.HashMap) r0
            java.util.Set r1 = r0.keySet()
            java.util.List r1 = kotlin.collections.CollectionsKt.toList(r1)
            r0.clear()
            java.util.Iterator r0 = r1.iterator()
        L_0x0026:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x0041
            java.lang.Object r1 = r0.next()
            ywd r1 = (defpackage.ywd) r1
            java.lang.Object r2 = r4.b
            jc1 r2 = (defpackage.jc1) r2
            exd r2 = r2.f
            vj1 r3 = new vj1
            r3.<init>(r1)
            r2.onRoomRemoved(r3)
            goto L_0x0026
        L_0x0041:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ata.clear():void");
    }

    public void e() {
        byte[] bArr = t0g.f;
        g1g g1g = (g1g) this.c;
        g1g.getClass();
        g1g.F(bArr.length, bArr);
    }

    public nn0 f(gf4 gf4, long j) {
        int f;
        nn0 nn0;
        gf4 gf42 = gf4;
        long j2 = gf42.o;
        int min = (int) Math.min(20000, gf42.c - j2);
        g1g g1g = (g1g) this.c;
        g1g.E(min);
        gf42.q(g1g.a, 0, min, false);
        int i = -1;
        int i2 = -1;
        long j3 = -9223372036854775807L;
        while (g1g.c() >= 4) {
            if (nq5.f(g1g.b, g1g.a) != 442) {
                g1g.I(1);
            } else {
                g1g.I(4);
                long f2 = u9c.f(g1g);
                if (f2 != -9223372036854775807L) {
                    long b2 = ((qkf) this.b).b(f2);
                    if (b2 > j) {
                        if (j3 == -9223372036854775807L) {
                            return new nn0(-1, b2, j2);
                        }
                        nn0 = new nn0(0, -9223372036854775807L, j2 + ((long) i2));
                    } else if (100000 + b2 > j) {
                        nn0 = new nn0(0, -9223372036854775807L, j2 + ((long) g1g.b));
                    } else {
                        i2 = g1g.b;
                        j3 = b2;
                    }
                    return nn0;
                }
                int i3 = g1g.c;
                if (g1g.c() >= 10) {
                    g1g.I(9);
                    int v2 = g1g.v() & 7;
                    if (g1g.c() >= v2) {
                        g1g.I(v2);
                        if (g1g.c() >= 4) {
                            if (nq5.f(g1g.b, g1g.a) == 443) {
                                g1g.I(4);
                                int A = g1g.A();
                                if (g1g.c() < A) {
                                    g1g.H(i3);
                                } else {
                                    g1g.I(A);
                                }
                            }
                            while (true) {
                                if (g1g.c() < 4 || (f = nq5.f(g1g.b, g1g.a)) == 442 || f == 441 || (f >>> 8) != 1) {
                                    break;
                                }
                                g1g.I(4);
                                if (g1g.c() < 2) {
                                    g1g.H(i3);
                                    break;
                                }
                                g1g.H(Math.min(g1g.c, g1g.b + g1g.A()));
                            }
                        } else {
                            g1g.H(i3);
                        }
                    } else {
                        g1g.H(i3);
                    }
                } else {
                    g1g.H(i3);
                }
                i = g1g.b;
            }
        }
        return j3 != -9223372036854775807L ? new nn0(-2, j3, j2 + ((long) i)) : nn0.d;
    }

    public void g(Throwable th) {
        Objects.toString(th);
    }

    public /* bridge */ /* synthetic */ Object getValue(Object obj, KProperty kProperty) {
        return y(kProperty);
    }

    public void h() {
        ((Function0) this.b).invoke();
    }

    public void i() {
        ViewParent parent = ((OneMeContactsChipGroup) this.c).getParent();
        ScrollView scrollView = parent instanceof ScrollView ? (ScrollView) parent : null;
        if (scrollView != null) {
            scrollView.fullScroll(130);
        }
    }

    public boolean isEmpty() {
        return ((ev9) ((AtomicReference) this.c).get()) == ((ev9) ((AtomicReference) this.b).get());
    }

    public void j() {
        ((Function0) this.c).invoke();
    }

    public qj1 k(y30 y30) {
        qj1 qj1;
        Object obj;
        List list;
        Set set;
        HashMap hashMap = (HashMap) this.c;
        qj1 qj12 = (qj1) hashMap.get((ywd) y30.b);
        if (qj12 != null || !y30.a) {
            if (qj12 == null || (obj = qj12.b) == null) {
                obj = "";
            }
            g8b g8b = (g8b) y30.c;
            if (g8b.h()) {
                obj = g8b.d();
            }
            String str = (String) obj;
            int i = 0;
            Object valueOf = Boolean.valueOf(qj12 != null ? qj12.c : false);
            g8b g8b2 = (g8b) y30.d;
            if (g8b2.h()) {
                valueOf = g8b2.d();
            }
            boolean booleanValue = ((Boolean) valueOf).booleanValue();
            List list2 = qj12 != null ? qj12.d : null;
            List list3 = (List) ((g8b) y30.e).k();
            List list4 = (List) ((g8b) y30.f).k();
            List list5 = (List) ((g8b) y30.g).k();
            if (list3 != null) {
                list = list3;
            } else {
                if (list5 == null || (set = CollectionsKt.toSet(list5)) == null) {
                    set = SetsKt.emptySet();
                }
                if (list4 == null) {
                    list4 = CollectionsKt.emptyList();
                }
                list = list2 != null ? CollectionsKt.plus(CollectionsKt.minus(list2, (List) set), list4) : CollectionsKt.minus(list4, (List) set);
            }
            if (qj12 != null) {
                i = qj12.e;
            }
            Object valueOf2 = Integer.valueOf(i);
            g8b g8b3 = (g8b) y30.h;
            if (g8b3.h()) {
                valueOf2 = g8b3.d();
            }
            int intValue = ((Number) valueOf2).intValue();
            Object obj2 = qj12 != null ? qj12.f : null;
            g8b g8b4 = (g8b) y30.i;
            if (g8b4.h()) {
                obj2 = g8b4.d();
            }
            ue1 ue1 = (ue1) obj2;
            Object obj3 = qj12 != null ? qj12.g : null;
            g8b g8b5 = (g8b) y30.j;
            if (g8b5.h()) {
                obj3 = g8b5.d();
            }
            ywd ywd = (ywd) y30.b;
            qj1 = new qj1(intValue, ue1, ywd, (Long) obj3, str, list, booleanValue);
            hashMap.put(ywd, qj1);
        } else {
            qj1 = null;
        }
        if (qj1 == null) {
            return null;
        }
        ((jc1) this.b).f.onRoomUpdated(new wj1(qj1.a, b59.e0(qj1)));
        return qj1;
    }

    public void n() {
        kr7.C((h3b) this.c);
        ox2.b.W0().d();
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [ev9, java.lang.Object, java.util.concurrent.atomic.AtomicReference] */
    public boolean offer(Object obj) {
        if (obj != null) {
            ? atomicReference = new AtomicReference();
            atomicReference.a = obj;
            ((ev9) ((AtomicReference) this.b).getAndSet(atomicReference)).lazySet(atomicReference);
            return true;
        }
        throw new NullPointerException("Null is not a valid element");
    }

    public void onError(Throwable th) {
        Object obj;
        hce hce = (hce) this.c;
        zi6 zi6 = hce.b;
        gce gce = (gce) this.b;
        if (zi6 != null) {
            try {
                obj = zi6.apply(th);
            } catch (Throwable th2) {
                hd8.Z(th2);
                gce.onError(new CompositeException(th, th2));
                return;
            }
        } else {
            obj = hce.c;
        }
        if (obj == null) {
            NullPointerException nullPointerException = new NullPointerException("Value supplied was null");
            nullPointerException.initCause(th);
            gce.onError(nullPointerException);
            return;
        }
        gce.a(obj);
    }

    public Object poll() {
        ev9 ev9;
        AtomicReference atomicReference = (AtomicReference) this.c;
        ev9 ev92 = (ev9) atomicReference.get();
        ev9 ev93 = (ev9) ev92.get();
        if (ev93 != null) {
            Object obj = ev93.a;
            ev93.a = null;
            atomicReference.lazySet(ev93);
            return obj;
        } else if (ev92 == ((ev9) ((AtomicReference) this.b).get())) {
            return null;
        } else {
            do {
                ev9 = (ev9) ev92.get();
            } while (ev9 == null);
            Object obj2 = ev9.a;
            ev9.a = null;
            atomicReference.lazySet(ev9);
            return obj2;
        }
    }

    public /* bridge */ /* synthetic */ void setValue(Object obj, KProperty kProperty, Object obj2) {
        D((l9d) obj2);
    }

    public void t(wf5 wf5, qtf qtf) {
        int i = 0;
        while (true) {
            ypf[] ypfArr = (ypf[]) this.c;
            if (i < ypfArr.length) {
                qtf.a();
                qtf.b();
                ypf B = wf5.B(qtf.e, 3);
                ca6 ca6 = (ca6) ((List) this.b).get(i);
                String str = ca6.Z;
                boolean z = "application/cea-608".equals(str) || "application/cea-708".equals(str);
                String valueOf = String.valueOf(str);
                y64.f(valueOf.length() != 0 ? "Invalid closed caption mime type provided: ".concat(valueOf) : new String("Invalid closed caption mime type provided: "), z);
                String str2 = ca6.a;
                if (str2 == null) {
                    qtf.b();
                    str2 = qtf.f;
                }
                aa6 aa6 = new aa6();
                aa6.a = str2;
                aa6.k = str;
                aa6.d = ca6.o;
                aa6.c = ca6.c;
                aa6.C = ca6.M0;
                aa6.m = ca6.w0;
                B.d(new ca6(aa6));
                ypfArr[i] = B;
                i++;
            } else {
                return;
            }
        }
    }

    public String toString() {
        switch (this.a) {
            case 29:
                String str = (String) this.b;
                int f = g63.f(2, str);
                String str2 = (String) this.c;
                StringBuilder sb = new StringBuilder(g63.f(f, str2));
                sb.append(str);
                sb.append(", ");
                sb.append(str2);
                return sb.toString();
            default:
                return super.toString();
        }
    }

    public ow4 u(gr8 gr8) {
        gr8.b.getClass();
        gr8.b.getClass();
        return ow4.a;
    }

    public twd v(ywd ywd) {
        qj1 qj1 = (qj1) ((HashMap) this.c).get(ywd);
        if (qj1 != null) {
            return b59.e0(qj1);
        }
        return null;
    }

    public String w(String str) {
        Resources resources = (Resources) this.b;
        int identifier = resources.getIdentifier(str, "string", (String) this.c);
        if (identifier == 0) {
            return null;
        }
        return resources.getString(identifier);
    }

    public void x(long j) {
        KProperty[] kPropertyArr = PickerChatController.z0;
        ((PickerChatController) this.b).f0().k(j);
    }

    public l9d y(KProperty kProperty) {
        l9d l9d = (l9d) this.b;
        if (l9d != null) {
            return l9d;
        }
        throw new IllegalStateException(wj6.k("Property ", kProperty.getName(), " should be initialized before get."));
    }

    public void z(y64 y64) {
        ((fz9) this.b).i(y64);
        boolean z = y64 instanceof t4b;
        cyd cyd = (cyd) this.c;
        if (z) {
            cyd.j((t4b) y64);
        } else if (y64 instanceof r4b) {
            cyd.k(((r4b) y64).f);
        }
    }

    public /* synthetic */ ata(Object obj, Object obj2, boolean z, int i) {
        this.a = i;
        this.b = obj2;
        this.c = obj;
    }

    public ata(jc1 jc1) {
        this.a = 5;
        this.b = jc1;
        this.c = new HashMap();
    }

    public ata(km kmVar, Object obj) {
        this.a = 2;
        this.b = obj;
        this.c = kmVar.a;
    }

    public ata(String str) {
        this.a = 27;
        this.b = str;
        CharsetDecoder newDecoder = StandardCharsets.UTF_8.newDecoder();
        CodingErrorAction codingErrorAction = CodingErrorAction.REPORT;
        this.c = newDecoder.onMalformedInput(codingErrorAction).onUnmappableCharacter(codingErrorAction);
    }

    public ata(ox0 ox0) {
        this.a = 15;
        this.b = (HashMap) ox0.c;
        this.c = (ArrayList) ox0.b;
    }

    public ata(List list) {
        this.a = 23;
        this.b = list;
        this.c = new ypf[list.size()];
    }

    public ata(CameraCaptureSession cameraCaptureSession, i8b i8b) {
        this.a = 6;
        cameraCaptureSession.getClass();
        this.b = cameraCaptureSession;
        this.c = i8b;
    }

    public ata(int i) {
        this.a = i;
        switch (i) {
            case 18:
                AtomicReference atomicReference = new AtomicReference();
                this.b = atomicReference;
                AtomicReference atomicReference2 = new AtomicReference();
                this.c = atomicReference2;
                AtomicReference atomicReference3 = new AtomicReference();
                atomicReference2.lazySet(atomicReference3);
                ev9 ev9 = (ev9) atomicReference.getAndSet(atomicReference3);
                return;
            case 19:
                this.b = new u08();
                this.c = new Object();
                z(u4b.V);
                return;
            default:
                this.b = new Object();
                return;
        }
    }

    public ata(o67 o67) {
        this.a = 28;
        this.c = null;
        this.b = o67;
        o67.h = this;
    }

    public ata(Context context, int i) {
        this.a = i;
        switch (i) {
            case 26:
                vzg.m(context);
                Resources resources = context.getResources();
                this.b = resources;
                this.c = resources.getResourcePackageName(xmc.common_google_play_services_unknown_issue);
                return;
            default:
                this.b = context;
                this.c = new fs(2);
                return;
        }
    }

    public ata(qkf qkf) {
        this.a = 21;
        this.b = qkf;
        this.c = new g1g(3, false);
    }

    public ata(MediaCodec.CryptoInfo cryptoInfo) {
        this.a = 9;
        this.b = cryptoInfo;
        this.c = new MediaCodec.CryptoInfo.Pattern(0, 0);
    }

    public ata(Animation animation) {
        this.a = 13;
        this.b = animation;
        this.c = null;
    }

    public ata(Animator animator) {
        this.a = 13;
        this.b = null;
        AnimatorSet animatorSet = new AnimatorSet();
        this.c = animatorSet;
        animatorSet.play(animator);
    }

    public ata(bta bta) {
        this.a = 0;
        this.c = bta;
    }
}
