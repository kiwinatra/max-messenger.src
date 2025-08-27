package ru.ok.messages.suggests;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.Rect;
import android.os.Bundle;
import android.text.style.ClickableSpan;
import android.view.View;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.fragment.app.a;
import java.util.Iterator;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.collections.IntIterator;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.RangesKt;
import one.me.sdk.lists.widgets.EndlessRecyclerView;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003:\u0001\u0006B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, d2 = {"Lru/ok/messages/suggests/SuggestsFragment;", "Landroidx/fragment/app/a;", "Lwcf;", "Lfr7;", "<init>", "()V", "f1f", "tamtam-app_release"}, k = 1, mv = {2, 0, 0})
@SourceDebugExtension({"SMAP\nSuggestsFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SuggestsFragment.kt\nru/ok/messages/suggests/SuggestsFragment\n+ 2 FragmentViewModelLazy.kt\nandroidx/fragment/app/FragmentViewModelLazyKt\n+ 3 ThemeHelper.kt\nru/ok/tamtam/themes/ThemeHelper\n+ 4 LiveDataExt.kt\nru/ok/tamtam/shared/lifecycle/LiveDataExtKt\n+ 5 Transform.kt\nkotlinx/coroutines/flow/FlowKt__TransformKt\n+ 6 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt\n+ 7 SafeCollector.common.kt\nkotlinx/coroutines/flow/internal/SafeCollector_commonKt\n+ 8 View.kt\nandroidx/core/view/ViewKt\n+ 9 Animator.kt\nandroidx/core/animation/AnimatorKt\n+ 10 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,375:1\n106#2,15:376\n54#3:391\n45#3:392\n131#4,10:393\n131#4,10:408\n49#5:403\n51#5:407\n49#5:418\n51#5:422\n46#6:404\n51#6:406\n46#6:419\n51#6:421\n105#7:405\n105#7:420\n65#8,4:423\n37#8:427\n53#8:428\n72#8:429\n256#8,2:430\n256#8,2:432\n65#8,4:434\n37#8:438\n53#8:439\n72#8:440\n254#8:441\n30#9:442\n91#9,14:443\n1863#10,2:457\n*S KotlinDebug\n*F\n+ 1 SuggestsFragment.kt\nru/ok/messages/suggests/SuggestsFragment\n*L\n45#1:376,15\n74#1:391\n74#1:392\n79#1:393,10\n119#1:408,10\n79#1:403\n79#1:407\n119#1:418\n119#1:422\n79#1:404\n79#1:406\n119#1:419\n119#1:421\n79#1:405\n119#1:420\n196#1:423,4\n196#1:427\n196#1:428\n196#1:429\n228#1:430,2\n229#1:432,2\n235#1:434,4\n235#1:438\n235#1:439\n235#1:440\n264#1:441\n276#1:442\n276#1:443,14\n327#1:457,2\n*E\n"})
public final class SuggestsFragment extends a implements wcf, fr7 {
    public final f1f l1 = new f1f();
    public final bbg m1;
    public d1f n1;
    public final Lazy o1;
    public h5a p1;

    public SuggestsFragment() {
        super(ujc.fragment_suggests);
        e1f e1f = new e1f(this, 0);
        e1f e1f2 = new e1f(this, 1);
        Lazy lazy = LazyKt.lazy(LazyThreadSafetyMode.NONE, new uc(12, e1f));
        this.m1 = new bbg(Reflection.getOrCreateKotlinClass(SuggestsViewModel.class), (Function0) new vc(22, lazy), (Function0) e1f2, (Function0) new vc(23, lazy));
        this.o1 = LazyKt.lazy(LazyThreadSafetyMode.PUBLICATION, new e1f(this, 2));
    }

    public static final void T2(SuggestsFragment suggestsFragment) {
        suggestsFragment.getClass();
        z68.c("SuggestsFragment", "hide()", new Object[0]);
        h5a h5a = suggestsFragment.p1;
        if (h5a != null) {
            h5a.dismiss();
        }
        suggestsFragment.p1 = null;
        f1f f1f = suggestsFragment.l1;
        SuggestsView f = f1f.f();
        tyc adapter = f1f.g().getAdapter();
        d1f d1f = adapter instanceof d1f ? (d1f) adapter : null;
        if (f.getVisibility() == 0) {
            ch d = ((qra) ryg.x(suggestsFragment)).d();
            if (!f.isAttachedToWindow() || !d.q()) {
                suggestsFragment.U2(false);
                if (d1f != null) {
                    d1f.G((List) null);
                }
            } else {
                Animator animator = f1f.w;
                if (animator != null) {
                    animator.removeAllListeners();
                    animator.cancel();
                }
                ObjectAnimator d2 = f1f.d(c44.DEFAULT_ASPECT_RATIO, (float) f.getHeight());
                d2.setInterpolator(d.a.l());
                d2.addListener(new uf(9, suggestsFragment));
                d2.start();
            }
            SuggestsViewModel V2 = suggestsFragment.V2();
            Boolean bool = Boolean.FALSE;
            xme xme = V2.n;
            xme.getClass();
            xme.m((Object) null, bool);
        } else if (d1f != null) {
            d1f.G((List) null);
        }
    }

    public final void A2(View view, Bundle bundle) {
        jv7 X1 = X1();
        f1f f1f = this.l1;
        f1f.a(view, X1);
        Context G2 = G2();
        Lazy lazy = scf.b0;
        L0(j4b.k0(G2));
        hr7 hr7 = (hr7) this.o1.getValue();
        lv7 lv7 = this.b1;
        hr7.getClass();
        lv7.a(hr7);
        etc etc = V2().p;
        bs0.K(new kyd(new ps5(new on2(etc, 28), new h1f(etc, (Continuation) null, this), 5), 7), fqc.p(X1()));
        this.n1 = new d1f(new z3a(11, this));
        EndlessRecyclerView g = f1f.g();
        g.setItemAnimator((yyc) null);
        d1f d1f = this.n1;
        if (d1f == null) {
            d1f = null;
        }
        g.setAdapter(d1f);
        g.setPager(new k71(13, this));
        g.setThreshold(3);
        g.k(new xq7(5, g));
        if (!((Boolean) V2().n.getValue()).booleanValue() || Intrinsics.areEqual(((o85) V2().s.a.getValue()).a, (Object) y1f.a)) {
            U2(false);
        }
        etc etc2 = V2().s;
        bs0.K(new kyd(new ps5(new on2(etc2, 28), new j1f(etc2, (Continuation) null, this), 5), 8), fqc.p(X1()));
        if (!view.isLaidOut() || view.isLayoutRequested()) {
            view.addOnLayoutChangeListener(new g1f(this, 0));
        } else {
            SuggestsViewModel V2 = V2();
            view.getHeight();
            V2.getClass();
        }
        bs0.K(new ps5(V2().q, new l1f(view, (Continuation) null), 5), fqc.p(X1()));
        bs0.K(new ps5(V2().A, new m1f(this, (Continuation) null), 5), fqc.p(X1()));
        bs0.K(new ps5(V2().C, new n1f(this, (Continuation) null), 5), fqc.p(X1()));
        SuggestsViewModel V22 = V2();
        V22.o((b2f) ((o85) V22.r.getValue()).a);
    }

    public final void L0(scf scf) {
        f1f f1f = this.l1;
        f1f.L0(scf);
        f1f.f().c();
        EndlessRecyclerView g = f1f.g();
        tyc adapter = g.getAdapter();
        if (adapter != null) {
            int j = adapter.j();
            for (int i = 0; i < j; i++) {
                pzc M = f1f.g().M(i);
                c1f c1f = M instanceof c1f ? (c1f) M : null;
                if (c1f != null) {
                    c1f.L0(scf);
                }
            }
        }
        Iterator it = RangesKt.until(0, g.getItemDecorationCount()).iterator();
        while (it.hasNext()) {
            zyc Y = g.Y(((IntIterator) it).nextInt());
            wcf wcf = Y instanceof wcf ? (wcf) Y : null;
            if (wcf != null) {
                wcf.L0(scf);
            }
        }
        f1f.g().setBackgroundColor(scf.L);
        AppCompatTextView e = f1f.e();
        e.setTextColor(scf.N);
        e.setBackgroundColor(scf.n);
    }

    public final void P() {
        W2();
    }

    public final void U2(boolean z) {
        z68.c("SuggestsFragment", "changeVisibility " + z, new Object[0]);
        f1f f1f = this.l1;
        int i = 8;
        f1f.f().setVisibility(z ? 0 : 8);
        View view = (View) f1f.f().getParent();
        if (z) {
            i = 0;
        }
        view.setVisibility(i);
    }

    public final SuggestsViewModel V2() {
        return (SuggestsViewModel) this.m1.getValue();
    }

    public final void W2() {
        int i;
        zuf zuf;
        View view;
        ClickableSpan clickableSpan;
        SuggestsViewModel V2 = V2();
        b2f b2f = (b2f) ((o85) V2.r.getValue()).a;
        View view2 = null;
        if (!(b2f instanceof z1f) || (clickableSpan = ((z1f) b2f).c) == null) {
            i = 0;
        } else {
            p1a p1a = V2.D;
            if (p1a == null) {
                p1a = null;
            }
            i = p1a.Z(clickableSpan).y;
        }
        if (i > 0) {
            h5a h5a = this.p1;
            if (h5a != null) {
                h5a.a(i);
                return;
            }
            return;
        }
        Object obj = ((o85) V2().s.a.getValue()).a;
        z1f z1f = obj instanceof z1f ? (z1f) obj : null;
        if (z1f != null && (zuf = z1f.a) != null) {
            EndlessRecyclerView g = this.l1.g();
            d1f d1f = this.n1;
            if (d1f == null) {
                d1f = null;
            }
            pzc M = g.M(((ov) d1f.o).f.indexOf(zuf));
            if (!(M == null || (view = M.a) == null)) {
                view2 = view.findViewById(lic.row_suggest__suggest_icon);
            }
            Rect rect = rcg.a;
            rcg.d(rect, view2);
            h5a h5a2 = this.p1;
            if (h5a2 != null) {
                h5a2.a(rect.bottom);
            }
        }
    }

    public final void g1() {
        W2();
    }
}
