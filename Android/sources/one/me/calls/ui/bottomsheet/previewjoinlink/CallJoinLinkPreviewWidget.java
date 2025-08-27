package one.me.calls.ui.bottomsheet.previewjoinlink;

import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.TuplesKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.math.MathKt;
import kotlin.properties.ReadOnlyProperty;
import kotlin.reflect.KProperty;
import one.me.sdk.arch.Widget;
import one.me.sdk.uikit.common.button.OneMeButton;

@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\u0018\u00002\u00020\u00012\u00020\u0002B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006B\u0011\b\u0016\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\u0005\u0010\t¨\u0006\n"}, d2 = {"Lone/me/calls/ui/bottomsheet/previewjoinlink/CallJoinLinkPreviewWidget;", "Lone/me/sdk/arch/Widget;", "Lqg3;", "Landroid/os/Bundle;", "args", "<init>", "(Landroid/os/Bundle;)V", "", "link", "(Ljava/lang/String;)V", "calls-ui_release"}, k = 1, mv = {2, 0, 0})
@SourceDebugExtension({"SMAP\nCallJoinLinkPreviewWidget.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CallJoinLinkPreviewWidget.kt\none/me/calls/ui/bottomsheet/previewjoinlink/CallJoinLinkPreviewWidget\n+ 2 LazyExt.kt\none/me/sdk/kotlintools/delegates/LazyExtKt\n+ 3 Widget.kt\none/me/sdk/arch/Widget\n+ 4 ConstraintSetExt.kt\none/me/sdk/uikit/common/ConstraintSetExtKt\n+ 5 ConstraintSetExt.kt\none/me/sdk/uikit/common/ConstraintSetBuilder\n+ 6 Dimensions.kt\nru/ok/tamtam/shared/Dimensions\n+ 7 ContextExt.kt\none/me/sdk/arch/ext/ContextExtKt\n*L\n1#1,376:1\n5#2:377\n5#2:388\n5#2:389\n5#2:390\n5#2:391\n235#3,10:378\n410#3,8:424\n410#3,8:432\n20#4:392\n21#4:423\n186#5:393\n187#5:397\n186#5:398\n187#5:400\n186#5:401\n187#5:405\n186#5:406\n187#5:411\n186#5:412\n187#5:414\n186#5:415\n187#5:417\n186#5:418\n187#5:422\n24#6:394\n24#6:395\n24#6:396\n24#6:399\n24#6:402\n24#6:403\n24#6:404\n24#6:407\n24#6:408\n24#6:409\n24#6:410\n24#6:413\n24#6:416\n24#6:419\n24#6:420\n24#6:421\n24#6:440\n24#6:441\n24#6:442\n24#6:443\n24#6:444\n24#6:445\n23#7:446\n23#7:447\n23#7:448\n23#7:449\n*S KotlinDebug\n*F\n+ 1 CallJoinLinkPreviewWidget.kt\none/me/calls/ui/bottomsheet/previewjoinlink/CallJoinLinkPreviewWidget\n*L\n55#1:377\n156#1:388\n157#1:389\n158#1:390\n159#1:391\n61#1:378,10\n257#1:424,8\n277#1:432,8\n204#1:392\n204#1:423\n205#1:393\n205#1:397\n212#1:398\n212#1:400\n218#1:401\n218#1:405\n225#1:406\n225#1:411\n232#1:412\n232#1:414\n239#1:415\n239#1:417\n246#1:418\n246#1:422\n206#1:394\n207#1:395\n208#1:396\n215#1:399\n219#1:402\n220#1:403\n221#1:404\n226#1:407\n227#1:408\n228#1:409\n229#1:410\n233#1:413\n243#1:416\n247#1:419\n248#1:420\n249#1:421\n99#1:440\n100#1:441\n122#1:442\n123#1:443\n137#1:444\n138#1:445\n156#1:446\n157#1:447\n158#1:448\n159#1:449\n*E\n"})
public final class CallJoinLinkPreviewWidget extends Widget implements qg3 {
    public static final /* synthetic */ KProperty[] z0;
    public final sn0 X;
    public final ReadOnlyProperty Y;
    public final Lazy Z;
    public final eng a;
    public final qcb b;
    public final Lazy c;
    public final Lazy o;
    public final sn0 v;
    public final Lazy v0;
    public final sn0 w;
    public final Lazy w0;
    public final sn0 x;
    public final Lazy x0;
    public final sn0 y;
    public final w28 y0;
    public final sn0 z;

    static {
        Class<CallJoinLinkPreviewWidget> cls = CallJoinLinkPreviewWidget.class;
        z0 = new KProperty[]{wj6.p(cls, "titleView", "getTitleView()Landroid/widget/TextView;", 0), wj6.p(cls, "closeView", "getCloseView()Lone/me/calls/ui/view/RoundButtonView;", 0), wj6.p(cls, "oneMeStackAvatarView", "getOneMeStackAvatarView()Lone/me/sdk/uikit/common/avatar/OneMeStackAvatarView;", 0), wj6.p(cls, "microphoneSwitch", "getMicrophoneSwitch()Lone/me/calls/ui/view/RoundButtonView;", 0), wj6.p(cls, "videoSwitch", "getVideoSwitch()Lone/me/calls/ui/view/RoundButtonView;", 0), wj6.p(cls, "button", "getButton()Lone/me/sdk/uikit/common/button/OneMeButton;", 0), wj6.p(cls, "previewView", "getPreviewView()Lone/me/calls/ui/view/CallUserView;", 0)};
    }

    public CallJoinLinkPreviewWidget(Bundle bundle) {
        super(bundle, 0, 2, (DefaultConstructorMarker) null);
        this.a = new eng(this, 1);
        this.b = new qcb(fdb.a.c());
        za1 za1 = new za1(this, 0);
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        this.c = LazyKt.lazy(lazyThreadSafetyMode, za1);
        this.o = createViewModelLazy(ya1.class, new s(10, new s2(bundle, (Widget) this, 8)));
        this.v = binding(new za1(this, 7));
        this.w = binding(new za1(this, 8));
        this.x = binding(new za1(this, 9));
        this.y = binding(new za1(this, 10));
        this.z = binding(new za1(this, 11));
        this.X = binding(new za1(this, 1));
        this.Y = viewBinding(qqa.N);
        this.Z = LazyKt.lazy(lazyThreadSafetyMode, new za1(this, 2));
        this.v0 = LazyKt.lazy(lazyThreadSafetyMode, new za1(this, 3));
        this.w0 = LazyKt.lazy(lazyThreadSafetyMode, new za1(this, 5));
        this.x0 = LazyKt.lazy(lazyThreadSafetyMode, new za1(this, 6));
        this.y0 = new w28(new v11(11), (Function0) null, 6);
    }

    public static void h0(p8d p8d, Drawable drawable, Drawable drawable2, aj8 aj8, igf igf, igf igf2) {
        int ordinal = aj8.ordinal();
        if (ordinal == 0) {
            l2b.f.getClass();
            p8d.O(drawable2, -15987442);
            p8d.setMode(k8d.o);
            p8d.setAccessibility((ngf) igf2);
        } else if (ordinal == 1) {
            l2b.f.getClass();
            p8d.O(drawable, -1);
            p8d.setMode(k8d.v);
            p8d.setAccessibility((ngf) igf);
        } else if (ordinal == 2 || ordinal == 3) {
            p8d.O(drawable2, l2b.f.c);
            p8d.setMode(k8d.o);
            p8d.setAccessibility((ngf) igf2);
        } else {
            throw new NoWhenBranchMatchedException();
        }
    }

    public final p8d c0() {
        KProperty kProperty = z0[3];
        return (p8d) this.y.getValue();
    }

    public final e1b d0() {
        KProperty kProperty = z0[2];
        return (e1b) this.x.getValue();
    }

    public final TextView e0() {
        KProperty kProperty = z0[0];
        return (TextView) this.v.getValue();
    }

    public final p8d f0() {
        KProperty kProperty = z0[4];
        return (p8d) this.z.getValue();
    }

    public final void g(int i, Bundle bundle) {
        ((lf1) this.c.getValue()).g(i);
    }

    public final ya1 g0() {
        return (ya1) this.o.getValue();
    }

    public final yh7 getInsetsConfig() {
        yh7 yh7 = yh7.c;
        return yh7.d;
    }

    public final pgd getScreenDelegate() {
        return this.y0;
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        ConstraintLayout constraintLayout = new ConstraintLayout(layoutInflater.getContext());
        constraintLayout.setLayoutParams(new fj3(-1, -1));
        l2b l2b = l2b.a;
        constraintLayout.setBackgroundColor(l2b.d.h);
        FrameLayout frameLayout = new FrameLayout(constraintLayout.getContext());
        frameLayout.setId(qqa.O);
        gn1 gn1 = new gn1(frameLayout.getContext(), (AttributeSet) null);
        gn1.setId(qqa.N);
        gn1.setMode(en1.o);
        gn1.T(gn1.getContext().getString(sqa.D), (String) null);
        cb1 cb1 = new cb1(this);
        gn1.e1 = ze1.c;
        gn1.Z0 = cb1;
        gn1.setCustomTheme(l2b);
        frameLayout.addView(gn1, -1, -1);
        constraintLayout.addView(frameLayout, -1, 0);
        constraintLayout.addView(e0(), -2, -2);
        KProperty[] kPropertyArr = z0;
        KProperty kProperty = kPropertyArr[1];
        sn0 sn0 = this.w;
        constraintLayout.addView((p8d) sn0.getValue());
        constraintLayout.addView(d0());
        constraintLayout.addView(c0(), -2, -2);
        constraintLayout.addView(f0(), -2, -2);
        KProperty kProperty2 = kPropertyArr[5];
        sn0 sn02 = this.X;
        constraintLayout.addView((OneMeButton) sn02.getValue(), -1, -2);
        pj3 h = ct.h(constraintLayout);
        int id = e0().getId();
        h.e(id, 6, 0, 6);
        float f = (float) 60;
        tr1.u(f, vo4.c().getDisplayMetrics().density, new ila(h, 6, id, 4));
        h.e(id, 3, 0, 3);
        float f2 = (float) 16;
        tr1.u(f2, vo4.c().getDisplayMetrics().density, new ila(h, 3, id, 4));
        h.e(id, 7, 0, 7);
        new ila(h, 7, id, 4).e(MathKt.roundToInt(f * vo4.c().getDisplayMetrics().density));
        h.j(id).d.l0 = true;
        KProperty kProperty3 = kPropertyArr[1];
        int id2 = ((p8d) sn0.getValue()).getId();
        h.e(id2, 3, e0().getId(), 3);
        h.e(id2, 4, e0().getId(), 4);
        h.e(id2, 7, 0, 7);
        new ila(h, 7, id2, 4).e(MathKt.roundToInt(vo4.c().getDisplayMetrics().density * f2));
        int id3 = d0().getId();
        h.e(id3, 3, e0().getId(), 4);
        float f3 = (float) 24;
        tr1.u(f3, vo4.c().getDisplayMetrics().density, new ila(h, 3, id3, 4));
        h.e(id3, 7, 0, 7);
        tr1.u(f2, vo4.c().getDisplayMetrics().density, new ila(h, 7, id3, 4));
        h.e(id3, 6, 0, 6);
        new ila(h, 6, id3, 4).e(MathKt.roundToInt(vo4.c().getDisplayMetrics().density * f2));
        h.e(id3, 4, frameLayout.getId(), 3);
        int id4 = frameLayout.getId();
        h.e(id4, 3, d0().getId(), 4);
        tr1.u(f3, vo4.c().getDisplayMetrics().density, new ila(h, 3, id4, 4));
        h.e(id4, 7, 0, 7);
        tr1.u(f2, vo4.c().getDisplayMetrics().density, new ila(h, 7, id4, 4));
        h.e(id4, 6, 0, 6);
        tr1.u(f2, vo4.c().getDisplayMetrics().density, new ila(h, 6, id4, 4));
        KProperty kProperty4 = kPropertyArr[5];
        h.e(id4, 4, ((OneMeButton) sn02.getValue()).getId(), 3);
        new ila(h, 4, id4, 4).e(MathKt.roundToInt(vo4.c().getDisplayMetrics().density * f2));
        int id5 = c0().getId();
        h.e(id5, 4, frameLayout.getId(), 4);
        new ila(h, 4, id5, 4).e(MathKt.roundToInt(f3 * vo4.c().getDisplayMetrics().density));
        h.e(id5, 7, f0().getId(), 6);
        h.e(id5, 6, 0, 6);
        h.j(id5).d.V = 2;
        int id6 = f0().getId();
        h.e(id6, 4, c0().getId(), 4);
        h.e(id6, 3, c0().getId(), 3);
        h.e(id6, 7, 0, 7);
        h.e(id6, 6, c0().getId(), 7);
        tr1.u(f2, vo4.c().getDisplayMetrics().density, new ila(h, 6, id6, 4));
        KProperty kProperty5 = kPropertyArr[5];
        int id7 = ((OneMeButton) sn02.getValue()).getId();
        h.e(id7, 7, frameLayout.getId(), 7);
        new ila(h, 7, id7, 4).e(MathKt.roundToInt(vo4.c().getDisplayMetrics().density * f2));
        h.e(id7, 6, frameLayout.getId(), 6);
        tr1.u(f2, vo4.c().getDisplayMetrics().density, new ila(h, 6, id7, 4));
        h.e(id7, 4, 0, 4);
        new ila(h, 4, id7, 4).e(MathKt.roundToInt(f2 * vo4.c().getDisplayMetrics().density));
        h.a(constraintLayout);
        return constraintLayout;
    }

    public final void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        super.onRequestPermissionsResult(i, strArr, iArr);
        qcb qcb = this.b;
        if (i == 159 && qcb.a().b(edb.l)) {
            g0().l(true);
        } else if (i != 160 || !qcb.a().b(edb.h)) {
            ((lf1) this.c.getValue()).b(i, strArr, iArr);
        } else {
            g0().k(true);
        }
    }

    public final void onViewCreated(View view) {
        super.onViewCreated(view);
        s85 s85 = g0().y0;
        iu7 iu7 = iu7.o;
        bs0.K(new ps5(ct.k(s85, getViewLifecycleOwner().getLifecycle(), iu7), new db1((Continuation) null, this), 5), getViewLifecycleScope());
        bs0.K(new ps5(ct.k(g0().v0, getViewLifecycleOwner().getLifecycle(), iu7), new eb1((Continuation) null, this), 5), getViewLifecycleScope());
    }

    public CallJoinLinkPreviewWidget(String str) {
        this(o54.f(TuplesKt.to("call_join_link", str)));
    }
}
