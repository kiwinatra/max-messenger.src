package one.me.stickerssettings.stickersscreen;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.TuplesKt;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.math.MathKt;
import kotlin.properties.ReadOnlyProperty;
import kotlin.reflect.KProperty;
import one.me.sdk.arch.Widget;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003:\u0001\bB\u000f\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B\u001b\b\u0010\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\u0006\u0010\f¨\u0006\r"}, d2 = {"Lone/me/stickerssettings/stickersscreen/StickersScreen;", "Lone/me/sdk/arch/Widget;", "Lcx3;", "Lqg3;", "Landroid/os/Bundle;", "args", "<init>", "(Landroid/os/Bundle;)V", "Lete;", "mode", "", "setId", "(Lete;J)V", "stickers-settings_release"}, k = 1, mv = {2, 0, 0})
@SourceDebugExtension({"SMAP\nStickersScreen.kt\nKotlin\n*S Kotlin\n*F\n+ 1 StickersScreen.kt\none/me/stickerssettings/stickersscreen/StickersScreen\n+ 2 Widget.kt\none/me/sdk/arch/Widget\n+ 3 ViewGroupBuilders.kt\none/me/sdk/uikit/common/ViewGroupBuildersKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 5 Dimensions.kt\nru/ok/tamtam/shared/Dimensions\n+ 6 View.kt\nandroidx/core/view/ViewKt\n+ 7 ViewExt.kt\none/me/sdk/uikit/common/ViewExtKt\n+ 8 BottomSheetWidget.kt\none/me/sdk/bottomsheet/BottomSheetWidget$Companion\n+ 9 WidgetExt.kt\none/me/sdk/arch/ext/WidgetExtKt\n*L\n1#1,331:1\n419#2:332\n235#2,10:333\n410#2,8:363\n410#2,8:371\n410#2,8:379\n9#3,6:343\n15#3:350\n1#4:349\n1#4:351\n24#5:352\n24#5:361\n24#5:416\n157#6,8:353\n81#6:362\n65#7,4:387\n135#8,3:391\n138#8,8:408\n33#9,14:394\n*S KotlinDebug\n*F\n+ 1 StickersScreen.kt\none/me/stickerssettings/stickersscreen/StickersScreen\n*L\n63#1:332\n75#1:333,10\n189#1:363,8\n213#1:371,8\n217#1:379,8\n145#1:343,6\n145#1:350\n145#1:349\n169#1:352\n173#1:361\n101#1:416\n169#1:353,8\n186#1:362\n226#1:387,4\n267#1:391,3\n267#1:408,8\n267#1:394,14\n*E\n"})
@SuppressLint({"ValidController"})
public final class StickersScreen extends Widget implements cx3, qg3 {
    public static final /* synthetic */ KProperty[] Y;
    public final t56 X;
    public final ete a;
    public final is b;
    public final Lazy c;
    public final ReadOnlyProperty o;
    public final ReadOnlyProperty v;
    public final sn0 w;
    public final sn0 x;
    public final Lazy y;
    public final hb8 z;

    static {
        Class<StickersScreen> cls = StickersScreen.class;
        Y = new KProperty[]{wj6.p(cls, "stickersSetId", "getStickersSetId()J", 0), wj6.p(cls, "toolbar", "getToolbar()Lone/me/sdk/uikit/common/toolbar/OneMeToolbar;", 0), wj6.p(cls, "recycler", "getRecycler()Landroidx/recyclerview/widget/RecyclerView;", 0)};
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v0, resolved type: ete} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v1, resolved type: ete} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v1, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v0, resolved type: ete} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v5, resolved type: ete} */
    /* JADX WARNING: type inference failed for: r0v12, types: [java.lang.Object, hb8] */
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public StickersScreen(android.os.Bundle r6) {
        /*
            r5 = this;
            r0 = 0
            r1 = 2
            r2 = 0
            r5.<init>(r6, r0, r1, r2)
            u9a r0 = defpackage.ete.b
            java.lang.String r1 = "mode"
            java.lang.String r6 = r6.getString(r1)
            java.lang.String r1 = "Required value was null."
            if (r6 == 0) goto L_0x00c2
            r0.getClass()
            kotlin.enums.EnumEntries r0 = defpackage.ete.x
            java.util.Iterator r0 = r0.iterator()
        L_0x001b:
            boolean r3 = r0.hasNext()
            if (r3 == 0) goto L_0x0031
            java.lang.Object r3 = r0.next()
            r4 = r3
            ete r4 = (defpackage.ete) r4
            java.lang.String r4 = r4.a
            boolean r4 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r4, (java.lang.Object) r6)
            if (r4 == 0) goto L_0x001b
            r2 = r3
        L_0x0031:
            if (r2 == 0) goto L_0x00b8
            ete r2 = (defpackage.ete) r2
            r5.a = r2
            r0 = -1
            java.lang.Long r6 = java.lang.Long.valueOf(r0)
            is r0 = new is
            java.lang.Class<java.lang.Long> r1 = java.lang.Long.class
            java.lang.String r2 = "set_id"
            r0.<init>(r1, r6, r2)
            r5.b = r0
            cte r6 = new cte
            r0 = 0
            r6.<init>(r5, r0)
            mle r0 = new mle
            r1 = 3
            r0.<init>(r1, r6)
            java.lang.Class<gwe> r6 = defpackage.gwe.class
            kotlin.Lazy r6 = r5.createViewModelLazy(r6, r0)
            r5.c = r6
            int r6 = defpackage.m1b.x
            kotlin.properties.ReadOnlyProperty r6 = r5.viewBinding(r6)
            r5.o = r6
            int r6 = defpackage.m1b.f
            kotlin.properties.ReadOnlyProperty r6 = r5.viewBinding(r6)
            r5.v = r6
            cte r6 = new cte
            r0 = 1
            r6.<init>(r5, r0)
            sn0 r6 = r5.binding(r6)
            r5.w = r6
            cte r6 = new cte
            r0 = 2
            r6.<init>(r5, r0)
            sn0 r6 = r5.binding(r6)
            r5.x = r6
            mue r6 = defpackage.mue.a
            q4 r0 = r6.getAccessor()
            java.lang.Class<jb8> r1 = defpackage.jb8.class
            kotlin.Lazy r0 = r0.h(r1)
            r5.y = r0
            hb8 r0 = new hb8
            r0.<init>()
            r5.z = r0
            t56 r0 = new t56
            q4 r6 = r6.getAccessor()
            java.lang.Class<aua> r1 = defpackage.aua.class
            java.lang.Object r6 = r6.g(r1)
            aua r6 = (defpackage.aua) r6
            java.util.concurrent.ExecutorService r6 = r6.a()
            yu9 r1 = new yu9
            r2 = 8
            r1.<init>((int) r2, (java.lang.Object) r5)
            r0.<init>(r6, r1)
            r5.X = r0
            return
        L_0x00b8:
            java.lang.IllegalArgumentException r5 = new java.lang.IllegalArgumentException
            java.lang.String r6 = r1.toString()
            r5.<init>(r6)
            throw r5
        L_0x00c2:
            java.lang.IllegalArgumentException r5 = new java.lang.IllegalArgumentException
            java.lang.String r6 = r1.toString()
            r5.<init>(r6)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: one.me.stickerssettings.stickersscreen.StickersScreen.<init>(android.os.Bundle):void");
    }

    public final RecyclerView c0() {
        return (RecyclerView) this.v.getValue(this, Y[2]);
    }

    public final h3b d0() {
        return (h3b) this.o.getValue(this, Y[1]);
    }

    public final gwe e0() {
        return (gwe) this.c.getValue();
    }

    public final void g(int i, Bundle bundle) {
        gwe e0 = e0();
        e0.getClass();
        int i2 = m1b.e;
        wie wie = e0.Y;
        jx3 jx3 = e0.a;
        gaf gaf = e0.v;
        if (i == i2) {
            wie.setValue(e0, gwe.B0[0], ev0.u(jx3, ((osa) gaf).b(), f14.b, new uve(e0, (Continuation) null)));
        } else if (i == m1b.d) {
            wie.setValue(e0, gwe.B0[0], ev0.u(jx3, ((osa) gaf).b(), f14.b, new tve(e0, (Continuation) null)));
        } else {
            int i3 = m1b.c;
            KProperty[] kPropertyArr = gwe.B0;
            if (i == i3) {
                aje u = ev0.u(jx3, ((osa) gaf).b(), f14.b, new wve(e0, ((vw9) e0.k().e.a.getValue()).b, (Continuation) null));
                e0.Z.setValue(e0, kPropertyArr[1], u);
                e0.k().a();
            } else if (i == m1b.b) {
                aje u2 = ev0.u(jx3, ((osa) gaf).b(), f14.b, new vve(e0, e0.c, (Continuation) null));
                e0.v0.setValue(e0, kPropertyArr[2], u2);
            }
        }
    }

    public final yh7 getInsetsConfig() {
        yh7 yh7 = yh7.c;
        return yh7.d;
    }

    public final void onActivityPaused(Activity activity) {
        ((jb8) this.y.getValue()).a(this.z);
    }

    public final void onActivityResumed(Activity activity) {
        ((jb8) this.y.getValue()).b(this.z);
    }

    public final void onChangeStarted(ey3 ey3, fy3 fy3) {
        super.onChangeStarted(ey3, fy3);
        fy3 fy32 = fy3.POP_ENTER;
        Lazy lazy = this.y;
        hb8 hb8 = this.z;
        if (fy3 == fy32 || fy3 == fy3.PUSH_ENTER) {
            ((jb8) lazy.getValue()).b(hb8);
        } else if (fy3 == fy3.PUSH_EXIT) {
            ((jb8) lazy.getValue()).a(hb8);
        }
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Context context = layoutInflater.getContext();
        ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-1, -1);
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setLayoutParams(layoutParams);
        RecyclerView recyclerView = new RecyclerView(frameLayout.getContext(), (AttributeSet) null);
        recyclerView.setId(m1b.f);
        recyclerView.setLayoutParams(new FrameLayout.LayoutParams(-1, -1, 48));
        float f = (float) 12;
        recyclerView.setPadding(MathKt.roundToInt(vo4.c().getDisplayMetrics().density * f), recyclerView.getPaddingTop(), MathKt.roundToInt(f * vo4.c().getDisplayMetrics().density), recyclerView.getPaddingBottom());
        recyclerView.setAdapter(this.X);
        int A = b0h.A(recyclerView.getContext());
        recyclerView.getContext();
        recyclerView.setLayoutManager(new GridLayoutManager(A));
        recyclerView.j(new jz0(A, MathKt.roundToInt(((float) 4) * vo4.c().getDisplayMetrics().density), 7));
        recyclerView.k(new xq7(2, this));
        frameLayout.addView(recyclerView);
        h3b d = o54.d(frameLayout.getContext(), (AttributeSet) null);
        d.setId(m1b.x);
        d.setLayoutParams(new FrameLayout.LayoutParams(-1, -2, 48));
        d.setForm(z2b.a);
        d.setLeftActions(new p2b(new jkb(23, (Object) this)));
        b0h.H(d, new vyb(3, (Continuation) null, 1));
        frameLayout.addView(d);
        return frameLayout;
    }

    public final void onDestroyView(View view) {
        this.z.a();
        c0().setAdapter((tyc) null);
        super.onDestroyView(view);
    }

    public final void onViewCreated(View view) {
        super.onViewCreated(view);
        h3b d0 = d0();
        u3b.a(d0, new vj6(21, (Object) d0, (Object) this));
        etc etc = e0().x0;
        iu7 iu7 = iu7.o;
        bs0.K(new ps5(ct.k(etc, getViewLifecycleOwner().getLifecycle(), iu7), new fte((Continuation) null, this, view), 5), getViewLifecycleScope());
        bs0.K(new ps5(ct.k(new on2(e0().y0, 28), getViewLifecycleOwner().getLifecycle(), iu7), new gte((Continuation) null, this), 5), getViewLifecycleScope());
        bs0.K(new ps5(ct.k(e0().z0, getViewLifecycleOwner().getLifecycle(), iu7), new hte((Continuation) null, this), 5), getViewLifecycleScope());
        RecyclerView c0 = c0();
        bx9 k = e0().k();
        hx9 hx9 = new hx9(c0, this.X, k, d0());
        bs0.K(new ps5(k.e, new wq0(2, hx9, hx9.class, "handleNewSelectedMessages", "handleNewSelectedMessages(Lone/me/stickerssettings/stickersscreen/multiselection/MultiSelectionLogic$Data;)V", 4, 22), 5), getViewLifecycleScope());
    }

    public final void s(int i, Bundle bundle) {
        gwe e0 = e0();
        e0.getClass();
        s0e s0e = null;
        if (i == m1b.u) {
            xme xme = e0.k().d;
            vw9 vw9 = new vw9(true, 6);
            xme.getClass();
            xme.m((Object) null, vw9);
            return;
        }
        int i2 = m1b.w;
        s85 s85 = e0.z0;
        if (i == i2) {
            xag.h(s85, new q0e(new igf(n1b.B), new igf(n1b.A), CollectionsKt.listOf(new pg3(m1b.e, new igf(n1b.D), og3.a), new pg3(m1b.a, new igf(n1b.i), og3.b))));
        } else if (i == m1b.t) {
            xag.h(s85, new q0e(new igf(n1b.w), new igf(n1b.v), CollectionsKt.listOf(new pg3(m1b.d, new igf(n1b.D), og3.a), new pg3(m1b.a, new igf(n1b.i), og3.b))));
        } else if (i == m1b.i) {
            sve sve = (sve) e0.y0.a.getValue();
            String str = sve != null ? sve.c : null;
            if (str != null && str.length() != 0) {
                b59.k(e0.o, str);
                if (b59.C()) {
                    s0e = new s0e(cad.v, new igf(n1b.g));
                }
                if (s0e != null) {
                    xag.h(s85, s0e);
                }
            }
        } else if (i == m1b.j) {
            xag.h(s85, new q0e(new igf(n1b.k), new igf(n1b.j), CollectionsKt.listOf(new pg3(m1b.b, new igf(n1b.h), og3.a), new pg3(m1b.a, new igf(n1b.i), og3.b))));
        }
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ StickersScreen(ete ete, long j, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(ete, (i & 2) != 0 ? -1 : j);
    }

    public StickersScreen(ete ete, long j) {
        this(o54.f(TuplesKt.to("mode", ete.a), TuplesKt.to("set_id", Long.valueOf(j))));
    }
}
