package ru.ok.messages.settings.folders.picker;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import androidx.fragment.app.a;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.math.MathKt;
import kotlin.reflect.KProperty;
import ru.ok.messages.views.fragments.base.FrgBase;
import ru.ok.utils.widgets.BadgeCountView;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003:\u0001\u0004¨\u0006\u0005"}, d2 = {"Lru/ok/messages/settings/folders/picker/FoldersPickerFragment;", "Lru/ok/messages/views/fragments/base/FrgBase;", "Lhkd;", "Likd;", "b76", "tamtam-app_release"}, k = 1, mv = {2, 0, 0})
@SourceDebugExtension({"SMAP\nFoldersPickerFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FoldersPickerFragment.kt\nru/ok/messages/settings/folders/picker/FoldersPickerFragment\n+ 2 FragmentViewModelLazy.kt\nandroidx/fragment/app/FragmentViewModelLazyKt\n+ 3 ViewModelExt.kt\nru/ok/tamtam/shared/lifecycle/ViewModelExtKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 5 View.kt\nandroidx/core/view/ViewKt\n+ 6 Dimensions.kt\nru/ok/tamtam/shared/Dimensions\n*L\n1#1,339:1\n112#2:340\n106#2,15:342\n14#3:341\n21#3:357\n1#4:358\n256#5,2:359\n256#5,2:361\n256#5,2:363\n256#5,2:365\n256#5,2:367\n256#5,2:369\n254#5:371\n254#5:372\n24#6:373\n*S KotlinDebug\n*F\n+ 1 FoldersPickerFragment.kt\nru/ok/messages/settings/folders/picker/FoldersPickerFragment\n*L\n64#1:340\n64#1:342,15\n64#1:341\n64#1:357\n191#1:359,2\n192#1:361,2\n213#1:363,2\n214#1:365,2\n215#1:367,2\n219#1:369,2\n240#1:371\n255#1:372\n314#1:373\n*E\n"})
public final class FoldersPickerFragment extends FrgBase implements hkd, ikd {
    public final m86 B1;
    public final r46 C1;
    public final yva D1;
    public final x15 E1;
    public final ch F1;
    public final bbg G1;
    public final b76 H1 = new b76();
    public b33 I1;
    public jkd J1;
    public dm4 K1;
    public dm4 L1;

    public FoldersPickerFragment(m86 m86, r46 r46, yva yva, x15 x15, ch chVar) {
        this.B1 = m86;
        this.C1 = r46;
        this.D1 = yva;
        this.E1 = x15;
        this.F1 = chVar;
        i76 i76 = new i76(0, new u75(9, this));
        Lazy lazy = LazyKt.lazy(LazyThreadSafetyMode.NONE, new uc(7, new tc(8, this)));
        this.G1 = new bbg(Reflection.getOrCreateKotlinClass(FoldersPickerViewModel.class), (Function0) new vc(14, lazy), (Function0) i76, (Function0) new vc(15, lazy));
    }

    public final void A0(String str) {
        i3().n(str);
    }

    public final void A2(View view, Bundle bundle) {
        ev0.v(fqc.p(X1()), (CoroutineContext) null, (f14) null, new h76(this, (Continuation) null), 3);
        h3();
    }

    public final void V0() {
        i3().n((String) null);
    }

    public final String V2() {
        return "CHAT_FOLDERS_PICKER";
    }

    public final void Y0(String str) {
        i3().n(str);
    }

    public final void Z2(View view) {
        h3();
    }

    public final void h3() {
        View view = this.S0;
        if (view != null) {
            scf scf = this.r1;
            view.setBackgroundColor(scf.I);
            b33 b33 = this.I1;
            if (b33 != null) {
                b33.a(scf);
            }
            b76 b76 = this.H1;
            f6e.C(b76.d());
            f6e.C(b76.f());
            RecyclerView f = b76.f();
            int i = scf.n;
            f.setBackgroundColor(i);
            KProperty[] kPropertyArr = b76.x0;
            ((ImageView) b76.w.getValue(b76, kPropertyArr[3])).setColorFilter(scf.m);
            ((BadgeCountView) b76.y.getValue(b76, kPropertyArr[5])).c();
            ((LinearLayout) b76.X.getValue(b76, kPropertyArr[7])).setBackgroundColor(i);
            KProperty kProperty = kPropertyArr[6];
            int i2 = scf.l;
            ((FrameLayout) b76.z.getValue(b76, kProperty)).setBackground(i8b.K(Integer.valueOf(i2), (Integer) null, (Integer) null));
            ((TextView) b76.Z.getValue(b76, kPropertyArr[9])).setTextColor(scf.N);
            scf scf2 = scf;
            iq.f(scf2, (TextView) b76.v0.getValue(b76, kPropertyArr[10]), MathKt.roundToInt(((float) 24) * vo4.c().getDisplayMetrics().density), 0, 0, 60);
            b76.e().setBackground(i8b.H(i, scf.j));
            b76.e().setTextColor(i2);
        }
    }

    public final void i2(Bundle bundle) {
        super.i2(bundle);
        b0h.b(E2().getOnBackPressedDispatcher(), this, new rx2(18, this));
    }

    public final FoldersPickerViewModel i3() {
        return (FoldersPickerViewModel) this.G1.getValue();
    }

    public final View k2(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(ujc.fragment_folders_picker, viewGroup, false);
        jv7 X1 = X1();
        b76 b76 = this.H1;
        b76.a(inflate, X1);
        fj fjVar = new fj((a) this);
        int i = lic.menu_search__search;
        String string = G2().getString(qad.i3);
        scf scf = this.r1;
        od6 od6 = (od6) X1();
        od6.b();
        jkd jkd = new jkd(fjVar, i, string, scf, this, this.D1, od6.v);
        jkd.X = this;
        this.J1 = jkd;
        fj fjVar2 = new fj((a) this);
        KProperty[] kPropertyArr = b76.x0;
        obd obd = new obd(fjVar2, (Toolbar) b76.c.getValue(b76, kPropertyArr[0]));
        obd.x = this.r1;
        obd.w = this.J1;
        b33 b33 = new b33(obd);
        b33.l(G2().getString(qad.m3));
        b33.i(new a76(this, 0));
        this.I1 = b33;
        jkd jkd2 = this.J1;
        if (jkd2 != null) {
            jkd2.i(G2(), bundle != null, this.I1);
        }
        RecyclerView d = b76.d();
        d.getContext();
        d.setLayoutManager(new LinearLayoutManager());
        f fVar = new f(i3(), 23);
        x15 x15 = this.E1;
        d.setAdapter(new ekb(x15, fVar));
        d.setItemAnimator((yyc) null);
        RecyclerView f = b76.f();
        f.getContext();
        f.setLayoutManager(new LinearLayoutManager(0, false));
        f.setAdapter(new lqd(x15, new f(i3(), 24)));
        ImageView imageView = (ImageView) b76.w.getValue(b76, kPropertyArr[3]);
        imageView.setImageResource(nad.G);
        ct.G(imageView, 300, new a76(this, 1));
        ct.G((TextView) b76.v0.getValue(b76, kPropertyArr[10]), 300, new a76(this, 2));
        ct.G(b76.e(), 300, new a76(this, 3));
        return inflate;
    }

    public final void m2() {
        super.m2();
        dm4 dm4 = this.K1;
        if (dm4 != null) {
            dm4.f();
        }
        this.K1 = null;
        dm4 dm42 = this.L1;
        if (dm42 != null) {
            dm42.f();
        }
        this.L1 = null;
        this.I1 = null;
        this.J1 = null;
    }
}
