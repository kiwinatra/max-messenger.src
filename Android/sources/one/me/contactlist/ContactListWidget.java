package one.me.contactlist;

import android.app.Activity;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ExecutorService;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.properties.ReadOnlyProperty;
import kotlin.reflect.KProperty;
import one.me.sdk.arch.Widget;
import one.me.sdk.lists.widgets.EndlessRecyclerView2;
import one.me.sdk.uikit.common.emptyview.OneMeEmptyView;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u00042\u00020\u00052\u00020\u00062\u00020\u00072\u00020\bB\u0013\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u000b\u0010\fB\u0011\b\u0016\u0012\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000b\u0010\u000f¨\u0006\u0010"}, d2 = {"Lone/me/contactlist/ContactListWidget;", "Lone/me/sdk/arch/Widget;", "Lu5a;", "Lro3;", "Lps6;", "Lys3;", "Lnt3;", "Lcx3;", "Lqg3;", "Landroid/os/Bundle;", "args", "<init>", "(Landroid/os/Bundle;)V", "Leq3;", "type", "(Leq3;)V", "contact-list_release"}, k = 1, mv = {2, 0, 0})
@SourceDebugExtension({"SMAP\nContactListWidget.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ContactListWidget.kt\none/me/contactlist/ContactListWidget\n+ 2 Widget.kt\none/me/sdk/arch/Widget\n+ 3 LazyExt.kt\nru/ok/tamtam/shared/utils/LazyExtKt\n+ 4 Transform.kt\nkotlinx/coroutines/flow/FlowKt__TransformKt\n+ 5 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt\n+ 6 SafeCollector.common.kt\nkotlinx/coroutines/flow/internal/SafeCollector_commonKt\n+ 7 BottomSheetWidget.kt\none/me/sdk/bottomsheet/BottomSheetWidget$Companion\n+ 8 WidgetExt.kt\none/me/sdk/arch/ext/WidgetExtKt\n+ 9 EnumExt.kt\nru/ok/tamtam/shared/EnumExtKt\n+ 10 ContextExt.kt\none/me/common/ext/ContextExtKt\n+ 11 StringExt.kt\nru/ok/tamtam/shared/StringExtKt\n*L\n1#1,745:1\n235#2,10:746\n235#2,10:757\n419#2:768\n419#2:769\n419#2:770\n419#2:771\n419#2:772\n8#3:756\n8#3:767\n32#4:773\n17#4:774\n19#4:778\n46#5:775\n51#5:777\n105#6:776\n135#7,3:779\n138#7,8:796\n33#8,14:782\n4#9,4:804\n4#9,4:809\n20#10:808\n4#11:813\n*S KotlinDebug\n*F\n+ 1 ContactListWidget.kt\none/me/contactlist/ContactListWidget\n*L\n117#1:746,10\n164#1:757,10\n216#1:768\n217#1:769\n218#1:770\n219#1:771\n220#1:772\n156#1:756\n175#1:767\n257#1:773\n257#1:774\n257#1:778\n257#1:775\n257#1:777\n257#1:776\n628#1:779,3\n628#1:796,8\n628#1:782,14\n119#1:804,4\n170#1:809,4\n145#1:808\n459#1:813\n*E\n"})
public final class ContactListWidget extends Widget implements u5a, ro3, ps6, ys3, nt3, cx3, qg3 {
    public static final /* synthetic */ KProperty[] N0;
    public final List A0;
    public final Lazy B0;
    public final Lazy C0;
    public final Lazy D0;
    public final Lazy E0;
    public final Lazy F0;
    public final wie G0;
    public final is H0;
    public final is I0;
    public final is J0;
    public final is K0;
    public final is L0;
    public final w28 M0;
    public final rd3 X;
    public final Lazy Y;
    public final sn0 Z;
    public final yh7 a;
    public final Lazy b;
    public final Lazy c;
    public final ExecutorService o;
    public final t56 v;
    public final Lazy v0;
    public final t56 w;
    public final Lazy w0;
    public final t56 x;
    public final sn0 x0;
    public final t56 y;
    public final ReadOnlyProperty y0;
    public final t56 z;
    public final Lazy z0;

    static {
        Class<ContactListWidget> cls = ContactListWidget.class;
        N0 = new KProperty[]{wj6.p(cls, "toolbar", "getToolbar()Lone/me/sdk/uikit/common/toolbar/OneMeToolbar;", 0), wj6.p(cls, "snackBar", "getSnackBar()Lone/me/sdk/snackbar/OneMeSnackbar;", 0), wj6.p(cls, "recyclerView", "getRecyclerView()Lone/me/sdk/lists/widgets/EndlessRecyclerView2;", 0), rae.s(cls, "contextMenuJob", "getContextMenuJob()Lkotlinx/coroutines/Job;", 0), rae.s(cls, "selectedContactIdForAction", "getSelectedContactIdForAction()Ljava/lang/Long;", 0), rae.s(cls, "searchQuery", "getSearchQuery()Ljava/lang/CharSequence;", 0), rae.s(cls, "isInSearch", "isInSearch()Z", 0), rae.s(cls, "isNeedScrollToTop", "isNeedScrollToTop()Z", 0), rae.s(cls, "isPermissionChecked", "isPermissionChecked()Z", 0)};
    }

    public ContactListWidget() {
        this((Bundle) null, 1, (DefaultConstructorMarker) null);
    }

    public final void B(qs6 qs6) {
        Activity activity = getActivity();
        if (activity != null) {
            kr7.A(activity);
        }
        ev0.v(getViewLifecycleScope(), (CoroutineContext) null, (f14) null, new hq3(this, qs6, (Continuation) null), 3);
    }

    public final void E(qs6 qs6, boolean z2) {
        ((tq1) this.c.getValue()).c(rq1.CALL_CONTACT, z2);
        ev0.v(getViewLifecycleScope(), (CoroutineContext) null, (f14) null, new gq3(this, qs6, z2, (Continuation) null), 3);
    }

    public final void H(long j, View view) {
        int ordinal = f0().b.ordinal();
        if (ordinal == 0) {
            return;
        }
        if (ordinal == 1) {
            aje v2 = ev0.v(getViewLifecycleScope(), (CoroutineContext) null, f14.b, new lq3(this, j, view, (Continuation) null), 1);
            this.G0.setValue(this, N0[3], v2);
            return;
        }
        throw new NoWhenBranchMatchedException();
    }

    public final void I() {
        h0();
    }

    public final void b1() {
        KProperty kProperty = N0[1];
        e0b e0b = (e0b) this.x0.getValue();
        e0b.i(getContext().getString(sra.s));
        e0b.j();
    }

    public final edb c0() {
        return (edb) this.B0.getValue();
    }

    public final CharSequence d0() {
        KProperty kProperty = N0[5];
        return (CharSequence) this.I0.a(this);
    }

    public final h3b e0() {
        KProperty kProperty = N0[0];
        return (h3b) this.Z.getValue();
    }

    public final void f(xs3 xs3) {
        h0();
    }

    public final yp3 f0() {
        return (yp3) this.Y.getValue();
    }

    public final void g(int i, Bundle bundle) {
        if (!((lf1) this.z0.getValue()).g(i) && bundle != null) {
            f0().j(i, bundle.getLong("selected.contactId.Action"));
        }
    }

    public final boolean g0() {
        KProperty kProperty = N0[6];
        return ((Boolean) this.J0.a(this)).booleanValue();
    }

    public final yh7 getInsetsConfig() {
        return this.a;
    }

    public final pgd getScreenDelegate() {
        return this.M0;
    }

    public final void h0() {
        c0().f(new eng(this, 1), edb.e, 156);
    }

    public final void i0() {
        boolean b2 = ((po3) f0().w0.i.a.getValue()).b();
        t56 t56 = this.y;
        t56 t562 = this.z;
        if (!b2 || !g0()) {
            CharSequence d0 = d0();
            t562.G((d0 == null || d0.length() == 0) ? (List) ((wh0) this.w0.getValue()).y.a.getValue() : CollectionsKt.emptyList());
            t56.G((List) null);
            return;
        }
        boolean b3 = c0().b(edb.f);
        pt3 pt3 = new pt3(cad.M0, sra.r, b3 ? sra.q : sra.p, b3 ? null : Integer.valueOf(sra.o));
        t562.G((List) null);
        t56.G(CollectionsKt.listOf(pt3));
    }

    public final jgd m() {
        return g0() ? jgd.CONTACTS_SEARCH : jgd.CONTACTS_TAB;
    }

    public final void onAttach(View view) {
        super.onAttach(view);
        KProperty[] kPropertyArr = N0;
        KProperty kProperty = kPropertyArr[8];
        is isVar = this.L0;
        if (!((Boolean) isVar.a(this)).booleanValue()) {
            KProperty kProperty2 = kPropertyArr[8];
            isVar.b(this, Boolean.TRUE);
            boolean b2 = c0().b(edb.f);
            Lazy lazy = this.C0;
            if (!b2) {
                ((qjd) ((x23) lazy.getValue())).i("app.writeConctatsRequested", true);
                c0().e(new eng(this, 1));
                return;
            }
            edb c0 = c0();
            String[] strArr = edb.g;
            if (!c0.b(strArr)) {
                qjd qjd = (qjd) ((x23) lazy.getValue());
                qjd.getClass();
                if (!((a33) qjd).g.getBoolean("app.writeConctatsRequested", false)) {
                    ((qjd) ((x23) lazy.getValue())).i("app.writeConctatsRequested", true);
                    c0().f(new eng(this, 1), strArr, 156);
                }
            }
        }
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        ConstraintLayout constraintLayout = new ConstraintLayout(layoutInflater.getContext());
        constraintLayout.setId(rra.n);
        h3b e0 = e0();
        fj3 fj3 = new fj3(-1, -2);
        fj3.i = 0;
        fj3.e = 0;
        fj3.h = 0;
        Unit unit = Unit.INSTANCE;
        constraintLayout.addView(e0, fj3);
        OneMeEmptyView oneMeEmptyView = new OneMeEmptyView(constraintLayout.getContext(), (AttributeSet) null);
        oneMeEmptyView.setIcon(cad.m0);
        oneMeEmptyView.setTitle(new igf(sra.n));
        oneMeEmptyView.setSubtitle(new igf(sra.m));
        EndlessRecyclerView2 endlessRecyclerView2 = new EndlessRecyclerView2(constraintLayout.getContext(), (AttributeSet) null, 6);
        endlessRecyclerView2.setId(qgc.oneme_contactlist_rv);
        endlessRecyclerView2.setItemAnimator((yyc) null);
        rd3 rd3 = this.X;
        endlessRecyclerView2.setAdapter(rd3);
        endlessRecyclerView2.getContext();
        endlessRecyclerView2.setLayoutManager(new LinearLayoutManager(1, false));
        endlessRecyclerView2.setClipToPadding(false);
        endlessRecyclerView2.setEmptyView(oneMeEmptyView);
        fl2 fl2 = new fl2(4, new bq3(this, 2));
        nwe nwe = new nwe(endlessRecyclerView2, rd3, fl2);
        endlessRecyclerView2.j(nwe);
        endlessRecyclerView2.j(new vo3(fl2, fu4.k.e(endlessRecyclerView2.getContext()).f(), (uo3) new ms1(27, this)));
        nwe nwe2 = new nwe(endlessRecyclerView2, rd3, new fl2(2, new wk(12, this, endlessRecyclerView2)));
        endlessRecyclerView2.j(nwe2);
        b0h.H(endlessRecyclerView2, new x2(nwe, nwe2, (Continuation) null, 7));
        fj3 fj32 = new fj3(-1, 0);
        fj32.j = e0().getId();
        fj32.e = 0;
        fj32.h = 0;
        fj32.l = 0;
        constraintLayout.addView(endlessRecyclerView2, fj32);
        fj3 fj33 = new fj3(-1, 0);
        fj33.j = e0().getId();
        fj33.e = 0;
        fj33.h = 0;
        fj33.l = 0;
        constraintLayout.addView(oneMeEmptyView, fj33);
        return constraintLayout;
    }

    public final void onDestroyView(View view) {
        super.onDestroyView(view);
        ((EndlessRecyclerView2) this.y0.getValue(this, N0[2])).setAdapter((tyc) null);
        ((iq3) this.v0.getValue()).e();
    }

    public final void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        if (!((lf1) this.z0.getValue()).b(i, strArr, iArr)) {
            if (i == 156) {
                edb c0 = c0();
                eng eng = new eng(this, 1);
                String[] strArr2 = edb.e;
                int i2 = qad.t6;
                int i3 = qad.U6;
                c0.getClass();
                edb.k(eng, strArr, iArr, strArr2, i2, i3);
            }
            i0();
        }
    }

    public final void onViewCreated(View view) {
        super.onViewCreated(view);
        fma h = getRouter().h();
        if (h != null) {
            h.b((iq3) this.v0.getValue());
        }
        bs0.K(new i21(f0().v0, ((wh0) this.w0.getValue()).y, new x2(this, (Continuation) null, 8), 4), getViewLifecycleScope());
        bs0.K(new ps5(f0().A0, new jq3(this, (Continuation) null), 5), getViewLifecycleScope());
        bs0.K(new ps5(f0().w0.i, new kq3(this, (Continuation) null), 5), getViewLifecycleScope());
    }

    public final void q() {
        h0();
    }

    public final void s(int i, Bundle bundle) {
        KProperty[] kPropertyArr = N0;
        KProperty kProperty = kPropertyArr[4];
        is isVar = this.H0;
        Long l = (Long) isVar.a(this);
        long longValue = l != null ? l.longValue() : 0;
        KProperty kProperty2 = kPropertyArr[4];
        isVar.b(this, (Object) null);
        f0().j(i, longValue);
    }

    public final void t0(long j) {
        Activity activity = getActivity();
        if (activity != null) {
            kr7.A(activity);
        }
        f0().j(rra.i, j);
    }

    public final void v(long j) {
        Object obj;
        List list = ((po3) f0().v0.a.getValue()).c;
        qdb qdb = null;
        if (list != null) {
            Iterator it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                if (((zo3) obj).a == j) {
                    break;
                }
            }
            zo3 zo3 = (zo3) obj;
            if (zo3 != null) {
                qdb = zo3.Z;
            }
        }
        if (qdb != null) {
            ((oo3) this.F0.getValue()).a(requireActivity());
        }
    }

    public final void z(long j, boolean z2) {
        ((tq1) this.c.getValue()).c(rq1.CALL_CONTACT, z2);
        Activity activity = getActivity();
        if (activity != null) {
            kr7.A(activity);
        }
        ((lf1) this.z0.getValue()).j(j, z2, new aq3(j, z2));
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ContactListWidget(Bundle bundle, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : bundle);
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public ContactListWidget(android.os.Bundle r29) {
        /*
            r28 = this;
            r0 = r28
            r1 = r29
            r3 = 3
            r4 = 1
            r5 = 4
            r6 = 7
            r7 = 5
            r8 = 0
            r9 = 2
            r10 = 0
            r0.<init>(r1, r8, r9, r10)
            yh7 r11 = defpackage.yh7.d
            r0.a = r11
            gt3 r11 = defpackage.gt3.a
            q4 r12 = r11.getAccessor()
            java.lang.Class<z5a> r13 = defpackage.z5a.class
            kotlin.Lazy r12 = r12.h(r13)
            r0.b = r12
            q4 r12 = r11.getAccessor()
            java.lang.Class<tq1> r13 = defpackage.tq1.class
            kotlin.Lazy r12 = r12.h(r13)
            r0.c = r12
            q4 r12 = r11.getAccessor()
            java.lang.Class<aua> r13 = defpackage.aua.class
            java.lang.Object r12 = r12.g(r13)
            aua r12 = (defpackage.aua) r12
            java.util.concurrent.ExecutorService r12 = r12.a()
            r0.o = r12
            t56 r13 = new t56
            r13.<init>((java.lang.Object) r0, (java.util.concurrent.ExecutorService) r12, (int) r6)
            r0.v = r13
            t56 r14 = new t56
            r15 = 13
            r14.<init>((java.lang.Object) r0, (java.util.concurrent.ExecutorService) r12, (int) r15)
            r0.w = r14
            t56 r15 = new t56
            r15.<init>((java.lang.Object) r0, (java.util.concurrent.ExecutorService) r12, (int) r6)
            r0.x = r15
            t56 r6 = new t56
            r10 = 8
            r6.<init>((java.lang.Object) r0, (java.util.concurrent.ExecutorService) r12, (int) r10)
            r0.y = r6
            t56 r10 = new t56
            r10.<init>((java.lang.Object) r0, (java.util.concurrent.ExecutorService) r12, (int) r5)
            r0.z = r10
            rd3 r12 = new rd3
            qd3 r2 = new qd3
            r2.<init>((boolean) r8, (int) r4)
            tyc[] r5 = new defpackage.tyc[r7]
            r5[r8] = r10
            r5[r4] = r13
            r5[r9] = r14
            r5[r3] = r15
            r9 = 4
            r5[r9] = r6
            r12.<init>(r2, r5)
            t45 r2 = new t45
            zp3 r5 = new zp3
            r5.<init>(r0, r8)
            r6 = 9
            r2.<init>(r6, r5)
            r12.A(r2)
            r0.X = r12
            bg2 r2 = new bg2
            r2.<init>(r1, r4)
            rn2 r4 = new rn2
            r5 = 19
            r4.<init>(r5, r2)
            java.lang.Class<yp3> r2 = defpackage.yp3.class
            kotlin.Lazy r2 = r0.createViewModelLazy(r2, r4)
            r0.Y = r2
            zp3 r2 = new zp3
            r2.<init>(r0, r3)
            sn0 r2 = r0.binding(r2)
            r0.Z = r2
            zp3 r2 = new zp3
            r3 = 4
            r2.<init>(r0, r3)
            kotlin.LazyThreadSafetyMode r3 = kotlin.LazyThreadSafetyMode.NONE
            kotlin.Lazy r2 = kotlin.LazyKt.lazy((kotlin.LazyThreadSafetyMode) r3, r2)
            r0.v0 = r2
            s2 r2 = new s2
            r4 = 26
            r2.<init>((android.os.Bundle) r1, (one.me.sdk.arch.Widget) r0, (int) r4)
            rn2 r1 = new rn2
            r4 = 20
            r1.<init>(r4, r2)
            java.lang.Class<wh0> r2 = defpackage.wh0.class
            kotlin.Lazy r1 = r0.createViewModelLazy(r2, r1)
            r0.w0 = r1
            zp3 r1 = new zp3
            r1.<init>(r0, r7)
            sn0 r1 = r0.binding(r1)
            r0.x0 = r1
            int r1 = defpackage.qgc.oneme_contactlist_rv
            kotlin.properties.ReadOnlyProperty r1 = r0.viewBinding(r1)
            r0.y0 = r1
            zp3 r1 = new zp3
            r2 = 6
            r1.<init>(r0, r2)
            kotlin.Lazy r1 = kotlin.LazyKt.lazy((kotlin.LazyThreadSafetyMode) r3, r1)
            r0.z0 = r1
            ow3 r1 = new ow3
            int r17 = defpackage.rra.q
            int r2 = defpackage.sra.i
            igf r3 = new igf
            r3.<init>(r2)
            int r2 = defpackage.cad.P0
            java.lang.Integer r19 = java.lang.Integer.valueOf(r2)
            r21 = 20
            r20 = 0
            r16 = r1
            r18 = r3
            r16.<init>((int) r17, (defpackage.ngf) r18, (java.lang.Integer) r19, (java.lang.Integer) r20, (int) r21)
            ow3 r2 = new ow3
            int r23 = defpackage.rra.r
            int r3 = defpackage.qad.b
            igf r4 = new igf
            r4.<init>(r3)
            int r3 = defpackage.cad.f2
            java.lang.Integer r25 = java.lang.Integer.valueOf(r3)
            r27 = 20
            r26 = 0
            r22 = r2
            r24 = r4
            r22.<init>((int) r23, (defpackage.ngf) r24, (java.lang.Integer) r25, (java.lang.Integer) r26, (int) r27)
            ow3 r3 = new ow3
            int r17 = defpackage.wua.d
            int r4 = defpackage.xua.f
            igf r5 = new igf
            r5.<init>(r4)
            int r4 = defpackage.cad.h1
            java.lang.Integer r19 = java.lang.Integer.valueOf(r4)
            r21 = 20
            r20 = 0
            r16 = r3
            r18 = r5
            r16.<init>((int) r17, (defpackage.ngf) r18, (java.lang.Integer) r19, (java.lang.Integer) r20, (int) r21)
            ow3 r4 = new ow3
            int r23 = defpackage.wua.k
            int r5 = defpackage.xua.l
            igf r6 = new igf
            r6.<init>(r5)
            int r5 = defpackage.cad.N1
            java.lang.Integer r25 = java.lang.Integer.valueOf(r5)
            r27 = 20
            r26 = 0
            r22 = r4
            r24 = r6
            r22.<init>((int) r23, (defpackage.ngf) r24, (java.lang.Integer) r25, (java.lang.Integer) r26, (int) r27)
            ow3 r5 = new ow3
            int r17 = defpackage.wua.e
            int r6 = defpackage.xua.g
            igf r8 = new igf
            r8.<init>(r6)
            int r6 = defpackage.cad.c0
            java.lang.Integer r19 = java.lang.Integer.valueOf(r6)
            r21 = 20
            r20 = 0
            r16 = r5
            r18 = r8
            r16.<init>((int) r17, (defpackage.ngf) r18, (java.lang.Integer) r19, (java.lang.Integer) r20, (int) r21)
            ow3[] r1 = new defpackage.ow3[]{r1, r2, r3, r4, r5}
            java.util.List r1 = kotlin.collections.CollectionsKt.listOf(r1)
            r0.A0 = r1
            fdb r1 = defpackage.fdb.a
            kotlin.Lazy r1 = r1.c()
            r0.B0 = r1
            q4 r1 = r11.getAccessor()
            java.lang.Class<x23> r2 = defpackage.x23.class
            kotlin.Lazy r1 = r1.h(r2)
            r0.C0 = r1
            q4 r1 = r11.getAccessor()
            java.lang.Class<bud> r2 = defpackage.bud.class
            kotlin.Lazy r1 = r1.h(r2)
            r0.D0 = r1
            q4 r1 = r11.getAccessor()
            java.lang.Class<deb> r2 = defpackage.deb.class
            kotlin.Lazy r1 = r1.h(r2)
            r0.E0 = r1
            oq2 r1 = new oq2
            r2 = 29
            r1.<init>(r2)
            kotlin.Lazy r1 = kotlin.LazyKt.lazy(r1)
            r0.F0 = r1
            wie r1 = defpackage.o5a.U()
            r0.G0 = r1
            is r1 = new is
            java.lang.Class<java.lang.Long> r2 = java.lang.Long.class
            java.lang.String r3 = "selected.contactId.Action"
            r4 = 0
            r1.<init>(r2, r4, r3)
            r0.H0 = r1
            is r1 = new is
            java.lang.Class<java.lang.CharSequence> r2 = java.lang.CharSequence.class
            java.lang.String r3 = "contact_list_widget_search_query"
            r1.<init>(r2, r4, r3)
            r0.I0 = r1
            java.lang.Boolean r1 = java.lang.Boolean.FALSE
            is r2 = new is
            java.lang.String r3 = "contact_list_widget_is_in_search"
            java.lang.Class<java.lang.Boolean> r4 = java.lang.Boolean.class
            r2.<init>(r4, r1, r3)
            r0.J0 = r2
            is r2 = new is
            java.lang.String r3 = "contact_list_widget_is_need_scroll_to_top"
            r2.<init>(r4, r1, r3)
            r0.K0 = r2
            is r2 = new is
            java.lang.String r3 = "contact_list_widget_permission_check"
            r2.<init>(r4, r1, r3)
            r0.L0 = r2
            w28 r1 = new w28
            zp3 r2 = new zp3
            r3 = 7
            r2.<init>(r0, r3)
            r3 = 0
            r4 = 6
            r1.<init>(r2, r3, r4)
            r0.M0 = r1
            yp3 r1 = r28.f0()
            s85 r1 = r1.x0
            jv7 r2 = r0.lifecycleOwner
            ju7 r2 = r2.getLifecycle()
            iu7 r4 = defpackage.iu7.o
            co1 r1 = defpackage.ct.k(r1, r2, r4)
            cq3 r2 = new cq3
            r2.<init>(r0, r3)
            ps5 r3 = new ps5
            r3.<init>(r1, r2, r7)
            tu7 r1 = r28.getLifecycleScope()
            defpackage.bs0.K(r3, r1)
            yp3 r1 = r28.f0()
            s85 r1 = r1.y0
            jv7 r2 = r0.lifecycleOwner
            ju7 r2 = r2.getLifecycle()
            co1 r1 = defpackage.ct.k(r1, r2, r4)
            on2 r2 = new on2
            r3 = 15
            r2.<init>(r1, r3)
            dq3 r1 = new dq3
            r3 = 0
            r1.<init>(r0, r3)
            ps5 r3 = new ps5
            r3.<init>(r2, r1, r7)
            tu7 r0 = r28.getLifecycleScope()
            defpackage.bs0.K(r3, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: one.me.contactlist.ContactListWidget.<init>(android.os.Bundle):void");
    }

    public ContactListWidget(eq3 eq3) {
        this(o54.f(TuplesKt.to("contact_screen_open_mode", eq3.name())));
    }
}
