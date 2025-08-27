package defpackage;

import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.os.Parcel;
import android.os.RemoteException;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.Group;
import androidx.fragment.app.c;
import com.google.android.gms.maps.model.CameraPosition;
import com.google.android.gms.maps.model.LatLng;
import java.util.Set;
import kotlin.collections.CollectionsKt;
import kotlin.math.MathKt;
import one.me.sdk.uikit.common.button.OneMeButton;
import ru.ok.messages.location.FrgLocationMap;
import ru.ok.messages.location.TamSupportMapFragment;
import ru.ok.messages.views.dialogs.FrgDlgRestartLocation;

/* renamed from: f3a  reason: default package */
public final class f3a extends q2 implements dof, bif, t18, f2a {
    public AppCompatImageView A0;
    public Group B0;
    public OneMeButton C0;
    public OneMeButton D0;
    public as7 E0;
    public l0a F0;
    public ViewStub G0;
    public e4a H0;
    public hr2 I0;
    public b18 J0;
    public vd8 K0;
    public qd8 L0;
    public ro4 M0;
    public ValueAnimator N0;
    public w58 O0;
    public final long X;
    public final ch Y;
    public final jtb Z;
    public final kc3 o = new Object();
    public final yva v;
    public final lfd v0;
    public final km3 w;
    public final fn4 w0;
    public final ae8 x;
    public final boolean x0;
    public final nd y;
    public final cxe y0;
    public final c z;
    public TamSupportMapFragment z0;

    /* JADX WARNING: type inference failed for: r1v0, types: [java.lang.Object, kc3] */
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public f3a(Context context, ViewGroup viewGroup, yva yva, km3 km3, ae8 ae8, nd ndVar, c cVar, long j, ch chVar, d18 d18, ltb ltb, lfd lfd, fn4 fn4, boolean z2, cxe cxe) {
        super(context);
        this.v = yva;
        this.w = km3;
        this.x = ae8;
        this.y = ndVar;
        this.z = cVar;
        this.X = j;
        this.Y = chVar;
        this.Z = ltb;
        this.v0 = lfd;
        this.w0 = fn4;
        this.x0 = z2;
        this.y0 = cxe;
        ViewGroup viewGroup2 = viewGroup;
        L(viewGroup, ujc.frg_location_map);
    }

    public final void K(long j) {
        for (g1a g1a : (Set) this.a) {
            g1a.Y(new zj0(15));
            g1a.e0((c1a) null);
        }
    }

    /* JADX WARNING: type inference failed for: r0v35, types: [hx3, as7, java.lang.Object] */
    public final void M() {
        ViewGroup viewGroup = (ViewGroup) ((View) this.c);
        h3b d = o54.d(viewGroup.getContext(), (AttributeSet) null);
        d.setId(lic.frg_location_map__toolbar);
        d.setLayoutParams(new fj3(-1, -2));
        fj3 fj3 = (fj3) d.getLayoutParams();
        fj3.i = 0;
        fj3.t = 0;
        fj3.v = 0;
        d.setLayoutParams(fj3);
        viewGroup.addView(d);
        ((View) this.c).getContext();
        this.M0 = ro4.b();
        h3b h3b = (h3b) ((View) this.c).findViewById(lic.frg_location_map__toolbar);
        h3b.setTitle(qad.x9);
        h3b.setForm(z2b.a);
        h3b.setLeftActions(new q2b(new l(14, this)));
        this.z0 = (TamSupportMapFragment) this.z.D(lic.frg_location_map__map);
        this.A0 = (AppCompatImageView) ((View) this.c).findViewById(lic.frg_location_map__marker_head);
        this.B0 = (Group) ((View) this.c).findViewById(lic.frg_location_map__marker_group);
        OneMeButton oneMeButton = (OneMeButton) ((View) this.c).findViewById(lic.frg_location_map__current_location_fab);
        this.C0 = oneMeButton;
        aqa aqa = aqa.c;
        oneMeButton.setSize(aqa);
        OneMeButton oneMeButton2 = this.C0;
        zpa zpa = zpa.a;
        oneMeButton2.setMode(zpa);
        OneMeButton oneMeButton3 = this.C0;
        xpa xpa = xpa.a;
        oneMeButton3.setAppearance(xpa);
        this.C0.d(Integer.valueOf(cad.r0), true);
        OneMeButton oneMeButton4 = (OneMeButton) ((View) this.c).findViewById(lic.frg_location_map__layer_fab);
        this.D0 = oneMeButton4;
        oneMeButton4.setSize(aqa);
        this.D0.setMode(zpa);
        this.D0.setAppearance(xpa);
        this.D0.d(Integer.valueOf(nad.t0), true);
        bk0 bk0 = new bk0(this, 0);
        bk0 bk02 = new bk0(this, 1);
        bk0 bk03 = new bk0(this, 2);
        int roundToInt = MathKt.roundToInt(((float) 240) * vo4.c().getDisplayMetrics().density);
        Context context = (Context) this.b;
        ? hx3 = new hx3(context, roundToInt);
        hx3.d = false;
        r6 r6Var = new r6(9, hx3);
        hx3.a.a(CollectionsKt.listOf(new nw3(new igf(qad.X3), (Integer) null, bk0, 14), new nw3(new igf(qad.Y3), (Integer) null, bk02, 14), new nw3(new igf(qad.W3), (Integer) null, bk03, 14)), r6Var);
        this.E0 = hx3;
        nf8 nf8 = new nf8(this.X, 0);
        jtb jtb = this.Z;
        fn4 fn4 = this.w0;
        this.F0 = new l0a(new q2a((Context) this.b, this.v, this.w, jtb, fn4, (ViewStub) ((View) this.c).findViewById(lic.frg_location_map__contact_location)), nf8, this);
        this.G0 = (ViewStub) ((View) this.c).findViewById(lic.frg_location_map__send_location);
        this.H0 = new e4a(context, this.x0);
        this.z0.n1.setListener(this);
        hr2 hr2 = new hr2((ViewStub) ((View) this.c).findViewById(lic.frg_location_map__no_permission_panel), ((View) this.c).findViewById(lic.frg_location_map__top_no_permission_panel_anchor), ((ltb) this.Z).c);
        this.I0 = hr2;
        b18 b18 = new b18(context, this);
        this.J0 = b18;
        hr2.o.add(b18);
        b18.a = hr2;
        y64.n(this.D0, new ck0(this, 0));
        y64.n(this.C0, new ck0(this, 1));
        this.w0.e();
        this.y0.getClass();
    }

    public final void Z(long j, boolean z2) {
        mka mka;
        vd8 vd8 = this.K0;
        if (vd8 != null) {
            long j2 = vd8.q;
            vd8.q = j;
            jbd.c(vd8.r);
            ae8 ae8 = vd8.e;
            Context context = (Context) this.b;
            synchronized (ae8) {
                mka = new mka(1, new g18(2, ae8, context));
            }
            fce j3 = mka.n(vd8.f).j(qe.a());
            ao1 ao1 = new ao1(3, new pj0(vd8, j2, z2, j), new rx0(26));
            j3.l(ao1);
            vd8.r = ao1;
        }
    }

    public final void a(boolean z2) {
    }

    public final void a0(double d, double d2, boolean z2) {
        if (this.K0 != null) {
            if (z2) {
                double[] d0 = d0();
                if (this.B0.getVisibility() == 0 && Math.abs(d0[0] - d) <= 0.001d && Math.abs(d0[1] - d2) <= 0.001d) {
                    g0();
                }
            }
            vd8 vd8 = this.K0;
            vd8.g.getClass();
            LatLng latLng = new LatLng(d, d2);
            try {
                qyg qyg = hsg.j;
                vzg.n(qyg, "CameraUpdateFactory is not initialized");
                Parcel H02 = qyg.H0();
                hzg.b(H02, latLng);
                Parcel R = qyg.R(H02, 8);
                p67 L02 = hha.L0(R.readStrongBinder());
                R.recycle();
                vd8.g(new xv1(10, (Object) new b8d(L02)), true);
            } catch (RemoteException e) {
                throw new RuntimeException(e);
            }
        }
    }

    public final void c() {
        View view = (View) this.c;
        if (view != null) {
            k2b f = fu4.k.e(view.getContext()).f();
            ((View) this.c).setBackgroundColor(f.c().f);
            AppCompatImageView appCompatImageView = this.A0;
            f.getIcon().getClass();
            appCompatImageView.setImageTintList(ColorStateList.valueOf(-16745729));
        }
    }

    /* JADX WARNING: type inference failed for: r8v13, types: [android.os.IInterface] */
    /* JADX WARNING: type inference failed for: r8v14, types: [bvg] */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x01bf, code lost:
        if (r6 != r4) goto L_0x01c9;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void c0(java.util.List r19, boolean r20) {
        /*
            r18 = this;
            r0 = r18
            r1 = r20
            r2 = 2
            r3 = 1
            vd8 r5 = r0.K0
            if (r5 != 0) goto L_0x000b
            return
        L_0x000b:
            int r5 = r19.size()
            if (r5 > r3) goto L_0x0017
            vd8 r0 = r0.K0
            r0.d()
            return
        L_0x0017:
            kotlin.Lazy r5 = defpackage.scf.b0
            java.lang.Object r5 = r0.b
            android.content.Context r5 = (android.content.Context) r5
            scf r6 = defpackage.j4b.k0(r5)
            if (r1 == 0) goto L_0x0026
            int r6 = r6.l
            goto L_0x0028
        L_0x0026:
            int r6 = r6.N
        L_0x0028:
            vd8 r7 = r0.K0
            ro4 r8 = r0.M0
            int r8 = r8.b
            float r8 = (float) r8
            w58 r0 = r0.O0
            long r9 = r0.o
            r7.e()
            java.util.ArrayList r0 = new java.util.ArrayList
            int r11 = r19.size()
            r0.<init>(r11)
            java.util.Iterator r11 = r19.iterator()
        L_0x0043:
            boolean r12 = r11.hasNext()
            er7 r13 = r7.d
            if (r12 == 0) goto L_0x00ab
            java.lang.Object r12 = r11.next()
            pf8 r12 = (defpackage.pf8) r12
            s58 r14 = new s58
            s58 r15 = r12.a
            double r3 = r15.a
            r16 = r9
            double r9 = r15.b
            r14.<init>(r3, r9)
            r0.add(r14)
            zc8 r14 = r7.j
            java.lang.Object r14 = r14.b()
            sf8 r14 = (defpackage.sf8) r14
            com.google.android.gms.maps.model.LatLng r15 = new com.google.android.gms.maps.model.LatLng
            r15.<init>(r3, r9)
            rf8 r3 = r14.a
            r3.a = r15
            r4 = 0
            r3.x = r4
            r9 = 1056964608(0x3f000000, float:0.5)
            r3.v = r9
            r3.w = r9
            r3.y = r4
            v02 r3 = r7.h
            r3.getClass()
            ao0 r3 = defpackage.v02.f()
            rf8 r4 = r14.a
            y35 r3 = r3.a
            r4.o = r3
            e4 r3 = r13.B(r14)
            long r9 = r12.j
            java.lang.Long r4 = java.lang.Long.valueOf(r9)
            r3.A(r4)
            java.util.LinkedHashMap r4 = r7.b
            java.lang.Long r9 = java.lang.Long.valueOf(r9)
            sj0 r10 = new sj0
            r10.<init>(r12, r3)
            r4.put(r9, r10)
            r9 = r16
            r3 = 1
            goto L_0x0043
        L_0x00ab:
            r16 = r9
            u6h r3 = r7.o
            if (r3 != 0) goto L_0x0154
            zc8 r3 = r7.l
            java.lang.Object r3 = r3.b()
            kqb r3 = (defpackage.kqb) r3
            java.util.ArrayList r4 = new java.util.ArrayList
            int r9 = kotlin.collections.CollectionsKt__IterablesKt.collectionSizeOrDefault(r0, 10)
            r4.<init>(r9)
            java.util.Iterator r0 = r0.iterator()
        L_0x00c6:
            boolean r9 = r0.hasNext()
            if (r9 == 0) goto L_0x00df
            java.lang.Object r9 = r0.next()
            s58 r9 = (defpackage.s58) r9
            com.google.android.gms.maps.model.LatLng r10 = new com.google.android.gms.maps.model.LatLng
            double r11 = r9.a
            double r14 = r9.b
            r10.<init>(r11, r14)
            r4.add(r10)
            goto L_0x00c6
        L_0x00df:
            jqb r0 = r3.a
            r0.getClass()
            java.util.Iterator r3 = r4.iterator()
        L_0x00e8:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L_0x00fa
            java.lang.Object r4 = r3.next()
            com.google.android.gms.maps.model.LatLng r4 = (com.google.android.gms.maps.model.LatLng) r4
            java.util.List r9 = r0.a
            r9.add(r4)
            goto L_0x00e8
        L_0x00fa:
            r0.b = r8
            r0.c = r6
            r0.X = r2
            r13.getClass()
            java.lang.Object r3 = r13.b
            wsb r3 = (defpackage.wsb) r3
            r3.getClass()
            iqb r4 = new iqb     // Catch:{ RemoteException -> 0x014d }
            java.lang.Object r3 = r3.a     // Catch:{ RemoteException -> 0x014d }
            o3h r3 = (defpackage.o3h) r3     // Catch:{ RemoteException -> 0x014d }
            android.os.Parcel r6 = r3.H0()     // Catch:{ RemoteException -> 0x014d }
            defpackage.hzg.b(r6, r0)     // Catch:{ RemoteException -> 0x014d }
            r0 = 9
            android.os.Parcel r0 = r3.R(r6, r0)     // Catch:{ RemoteException -> 0x014d }
            android.os.IBinder r3 = r0.readStrongBinder()     // Catch:{ RemoteException -> 0x014d }
            int r6 = defpackage.dyg.d     // Catch:{ RemoteException -> 0x014d }
            if (r3 != 0) goto L_0x0127
            r3 = 0
            goto L_0x013c
        L_0x0127:
            java.lang.String r6 = "com.google.android.gms.maps.model.internal.IPolylineDelegate"
            android.os.IInterface r8 = r3.queryLocalInterface(r6)     // Catch:{ RemoteException -> 0x014d }
            boolean r9 = r8 instanceof defpackage.fyg     // Catch:{ RemoteException -> 0x014d }
            if (r9 == 0) goto L_0x0135
            r3 = r8
            fyg r3 = (defpackage.fyg) r3     // Catch:{ RemoteException -> 0x014d }
            goto L_0x013c
        L_0x0135:
            byg r8 = new byg     // Catch:{ RemoteException -> 0x014d }
            r9 = 3
            r8.<init>(r3, r6, r9)     // Catch:{ RemoteException -> 0x014d }
            r3 = r8
        L_0x013c:
            r0.recycle()     // Catch:{ RemoteException -> 0x014d }
            r4.<init>(r3)     // Catch:{ RemoteException -> 0x014d }
            u6h r0 = new u6h
            r3 = 28
            r0.<init>(r3, r4)
            r7.o = r0
            goto L_0x0222
        L_0x014d:
            r0 = move-exception
            com.google.android.gms.maps.model.RuntimeRemoteException r1 = new com.google.android.gms.maps.model.RuntimeRemoteException
            r1.<init>(r0)
            throw r1
        L_0x0154:
            java.lang.Object r3 = r3.b
            iqb r3 = (defpackage.iqb) r3
            r3.getClass()
            fyg r3 = r3.a     // Catch:{ RemoteException -> 0x026f }
            byg r3 = (defpackage.byg) r3     // Catch:{ RemoteException -> 0x026f }
            android.os.Parcel r4 = r3.H0()     // Catch:{ RemoteException -> 0x026f }
            r8 = 4
            android.os.Parcel r3 = r3.R(r4, r8)     // Catch:{ RemoteException -> 0x026f }
            android.os.Parcelable$Creator<com.google.android.gms.maps.model.LatLng> r4 = com.google.android.gms.maps.model.LatLng.CREATOR     // Catch:{ RemoteException -> 0x026f }
            java.util.ArrayList r4 = r3.createTypedArrayList(r4)     // Catch:{ RemoteException -> 0x026f }
            r3.recycle()     // Catch:{ RemoteException -> 0x026f }
            java.util.ArrayList r3 = new java.util.ArrayList
            int r8 = kotlin.collections.CollectionsKt__IterablesKt.collectionSizeOrDefault(r4, 10)
            r3.<init>(r8)
            java.util.Iterator r4 = r4.iterator()
        L_0x017e:
            boolean r8 = r4.hasNext()
            if (r8 == 0) goto L_0x0197
            java.lang.Object r8 = r4.next()
            com.google.android.gms.maps.model.LatLng r8 = (com.google.android.gms.maps.model.LatLng) r8
            s58 r9 = new s58
            double r10 = r8.a
            double r12 = r8.b
            r9.<init>(r10, r12)
            r3.add(r9)
            goto L_0x017e
        L_0x0197:
            java.util.List r3 = kotlin.collections.CollectionsKt.toMutableList(r3)
            boolean r3 = r0.equals(r3)
            if (r3 == 0) goto L_0x01c9
            u6h r3 = r7.o
            java.lang.Object r3 = r3.b
            iqb r3 = (defpackage.iqb) r3
            r3.getClass()
            fyg r3 = r3.a     // Catch:{ RemoteException -> 0x01c2 }
            byg r3 = (defpackage.byg) r3     // Catch:{ RemoteException -> 0x01c2 }
            android.os.Parcel r4 = r3.H0()     // Catch:{ RemoteException -> 0x01c2 }
            r8 = 8
            android.os.Parcel r3 = r3.R(r4, r8)     // Catch:{ RemoteException -> 0x01c2 }
            int r4 = r3.readInt()     // Catch:{ RemoteException -> 0x01c2 }
            r3.recycle()     // Catch:{ RemoteException -> 0x01c2 }
            if (r6 == r4) goto L_0x0222
            goto L_0x01c9
        L_0x01c2:
            r0 = move-exception
            com.google.android.gms.maps.model.RuntimeRemoteException r1 = new com.google.android.gms.maps.model.RuntimeRemoteException
            r1.<init>(r0)
            throw r1
        L_0x01c9:
            u6h r3 = r7.o
            r3.getClass()
            java.util.ArrayList r4 = new java.util.ArrayList
            int r8 = kotlin.collections.CollectionsKt__IterablesKt.collectionSizeOrDefault(r0, 10)
            r4.<init>(r8)
            java.util.Iterator r0 = r0.iterator()
        L_0x01db:
            boolean r8 = r0.hasNext()
            if (r8 == 0) goto L_0x01f4
            java.lang.Object r8 = r0.next()
            s58 r8 = (defpackage.s58) r8
            com.google.android.gms.maps.model.LatLng r9 = new com.google.android.gms.maps.model.LatLng
            double r10 = r8.a
            double r12 = r8.b
            r9.<init>(r10, r12)
            r4.add(r9)
            goto L_0x01db
        L_0x01f4:
            java.lang.Object r0 = r3.b
            iqb r0 = (defpackage.iqb) r0
            r0.getClass()
            fyg r0 = r0.a     // Catch:{ RemoteException -> 0x0268 }
            byg r0 = (defpackage.byg) r0     // Catch:{ RemoteException -> 0x0268 }
            android.os.Parcel r3 = r0.H0()     // Catch:{ RemoteException -> 0x0268 }
            r3.writeTypedList(r4)     // Catch:{ RemoteException -> 0x0268 }
            r4 = 3
            r0.I0(r3, r4)     // Catch:{ RemoteException -> 0x0268 }
            u6h r0 = r7.o
            java.lang.Object r0 = r0.b
            iqb r0 = (defpackage.iqb) r0
            r0.getClass()
            fyg r0 = r0.a     // Catch:{ RemoteException -> 0x0261 }
            byg r0 = (defpackage.byg) r0     // Catch:{ RemoteException -> 0x0261 }
            android.os.Parcel r3 = r0.H0()     // Catch:{ RemoteException -> 0x0261 }
            r3.writeInt(r6)     // Catch:{ RemoteException -> 0x0261 }
            r4 = 7
            r0.I0(r3, r4)     // Catch:{ RemoteException -> 0x0261 }
        L_0x0222:
            ao1 r0 = r7.p
            defpackage.jbd.c(r0)
            ae8 r3 = r7.e
            monitor-enter(r3)
            g18 r0 = new g18     // Catch:{ all -> 0x025e }
            r0.<init>(r2, r3, r5)     // Catch:{ all -> 0x025e }
            mka r2 = new mka     // Catch:{ all -> 0x025e }
            r4 = 1
            r2.<init>(r4, r0)     // Catch:{ all -> 0x025e }
            monitor-exit(r3)
            lfd r0 = r7.f
            fce r0 = r2.n(r0)
            lfd r2 = defpackage.qe.a()
            fce r0 = r0.j(r2)
            rj0 r2 = new rj0
            r3 = r16
            r2.<init>((defpackage.vd8) r7, (boolean) r1, (long) r3)
            rx0 r1 = new rx0
            r3 = 29
            r1.<init>(r3)
            ao1 r3 = new ao1
            r4 = 3
            r3.<init>(r4, r2, r1)
            r0.l(r3)
            r7.p = r3
            return
        L_0x025e:
            r0 = move-exception
            monitor-exit(r3)     // Catch:{ all -> 0x025e }
            throw r0
        L_0x0261:
            r0 = move-exception
            com.google.android.gms.maps.model.RuntimeRemoteException r1 = new com.google.android.gms.maps.model.RuntimeRemoteException
            r1.<init>(r0)
            throw r1
        L_0x0268:
            r0 = move-exception
            com.google.android.gms.maps.model.RuntimeRemoteException r1 = new com.google.android.gms.maps.model.RuntimeRemoteException
            r1.<init>(r0)
            throw r1
        L_0x026f:
            r0 = move-exception
            com.google.android.gms.maps.model.RuntimeRemoteException r1 = new com.google.android.gms.maps.model.RuntimeRemoteException
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.f3a.c0(java.util.List, boolean):void");
    }

    public final double[] d0() {
        vd8 vd8 = this.K0;
        if (vd8 == null) {
            return new double[]{1.401298464324817E-45d, 1.401298464324817E-45d};
        }
        LatLng latLng = ((CameraPosition) vd8.d.H().b).a;
        return new double[]{latLng.a, latLng.b};
    }

    /* JADX WARNING: type inference failed for: r0v1, types: [qd8, java.lang.Object] */
    public final qd8 e0() {
        boolean z2;
        boolean z3;
        vd8 vd8 = this.K0;
        z3a z3a = null;
        if (vd8 == null) {
            return null;
        }
        er7 er7 = vd8.d;
        CameraPosition cameraPosition = (CameraPosition) er7.H().b;
        LatLng latLng = cameraPosition.a;
        double d = latLng.a;
        wsb wsb = (wsb) er7.b;
        if (wsb.a0() != null) {
            z3a = new z3a(13, wsb.a0());
        }
        boolean z4 = true;
        if (z3a != null) {
            p3a p3a = (p3a) z3a.b;
            p3a.getClass();
            uzg uzg = (uzg) p3a.a;
            try {
                Parcel R = uzg.R(uzg.H0(), 9);
                int i = hzg.a;
                z2 = R.readInt() != 0;
                R.recycle();
                try {
                    Parcel R2 = uzg.R(uzg.H0(), 13);
                    z3 = R2.readInt() != 0;
                    R2.recycle();
                } catch (RemoteException e) {
                    throw new RuntimeException(e);
                }
            } catch (RemoteException e2) {
                throw new RuntimeException(e2);
            }
        } else {
            z3 = false;
            z2 = false;
        }
        ? obj = new Object();
        obj.a = d;
        obj.b = latLng.b;
        obj.c = z2;
        obj.d = z3;
        wsb.getClass();
        try {
            o3h o3h = (o3h) wsb.a;
            Parcel R3 = o3h.R(o3h.H0(), 21);
            int i2 = hzg.a;
            if (R3.readInt() == 0) {
                z4 = false;
            }
            R3.recycle();
            obj.e = z4;
            obj.f = er7.K();
            obj.g = cameraPosition.b;
            obj.h = cameraPosition.c;
            obj.i = cameraPosition.o;
            return new qd8(obj);
        } catch (RemoteException e3) {
            throw new RuntimeException(e3);
        }
    }

    public final void g0() {
        ValueAnimator valueAnimator = this.N0;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(new float[]{0.0f, (float) (-this.M0.q)});
        this.N0 = ofFloat;
        ch chVar = this.Y;
        ofFloat.setInterpolator(chVar.a.n());
        this.N0.setDuration(chVar.a.b());
        this.N0.setRepeatMode(2);
        this.N0.setRepeatCount(1);
        this.N0.addUpdateListener(new z00(2, (Object) this));
        this.N0.start();
    }

    public final void l0(long j) {
    }

    public final void o(boolean z2, boolean z3, long j, long j2) {
        for (g1a g1a : (Set) this.a) {
            if (z3) {
                FrgLocationMap frgLocationMap = g1a.z0;
                frgLocationMap.getClass();
                FrgDlgRestartLocation.f3(j, j2).d3(frgLocationMap);
            } else if (z2) {
                g1a.v0.J();
            } else {
                g1a.getClass();
            }
        }
    }
}
