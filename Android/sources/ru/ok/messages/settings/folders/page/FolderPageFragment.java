package ru.ok.messages.settings.folders.page;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatImageButton;
import androidx.appcompat.widget.Toolbar;
import androidx.fragment.app.a;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.appbar.AppBarLayout;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.math.MathKt;
import ru.ok.messages.views.fragments.base.FrgBase;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lru/ok/messages/settings/folders/page/FolderPageFragment;", "Lru/ok/messages/views/fragments/base/FrgBase;", "g26", "tamtam-app_release"}, k = 1, mv = {2, 0, 0})
@SourceDebugExtension({"SMAP\nFolderPageFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FolderPageFragment.kt\nru/ok/messages/settings/folders/page/FolderPageFragment\n+ 2 FragmentViewModelLazy.kt\nandroidx/fragment/app/FragmentViewModelLazyKt\n+ 3 ViewModelExt.kt\nru/ok/tamtam/shared/lifecycle/ViewModelExtKt\n+ 4 View.kt\nandroidx/core/view/ViewKt\n+ 5 Dimensions.kt\nru/ok/tamtam/shared/Dimensions\n*L\n1#1,311:1\n112#2:312\n106#2,15:314\n14#3:313\n21#3:329\n256#4,2:330\n157#4,8:333\n157#4,8:341\n24#5:332\n24#5:349\n*S KotlinDebug\n*F\n+ 1 FolderPageFragment.kt\nru/ok/messages/settings/folders/page/FolderPageFragment\n*L\n68#1:312\n68#1:314,15\n68#1:313\n68#1:329\n230#1:330,2\n235#1:333,8\n237#1:341,8\n235#1:332\n269#1:349\n*E\n"})
public final class FolderPageFragment extends FrgBase {
    public final r46 B1;
    public final x15 C1;
    public final g26 D1 = new g26();
    public final bbg E1;
    public final Lazy F1;
    public final fc6 G1;

    public FolderPageFragment(t36 t36, r46 r46, x15 x15) {
        this.B1 = r46;
        this.C1 = x15;
        rn2 rn2 = new rn2(27, new j35(12, (Object) t36, (Object) this));
        tc tcVar = new tc(6, this);
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        Lazy lazy = LazyKt.lazy(lazyThreadSafetyMode, new uc(5, tcVar));
        this.E1 = new bbg(Reflection.getOrCreateKotlinClass(FolderPageViewModel.class), (Function0) new vc(10, lazy), (Function0) rn2, (Function0) new vc(11, lazy));
        this.F1 = LazyKt.lazy(lazyThreadSafetyMode, new b26(this, 3));
        x8 x8Var = new x8(4);
        lc5 lc5 = new lc5(12, (Object) this);
        ic6 ic6 = new ic6(this);
        if (this.a <= 1) {
            AtomicReference atomicReference = new AtomicReference();
            jc6 jc6 = new jc6(this, ic6, atomicReference, x8Var, lc5);
            if (this.a >= 0) {
                jc6.a();
            } else {
                this.i1.add(jc6);
            }
            this.G1 = new fc6(atomicReference);
            return;
        }
        throw new IllegalStateException("Fragment " + this + " is attempting to registerForActivityResult after being created. Fragments must call registerForActivityResult() before they are created (i.e. initialization, onAttach(), or onCreate()).");
    }

    public final void A2(View view, Bundle bundle) {
        ev0.v(fqc.p(X1()), (CoroutineContext) null, (f14) null, new m26(this, (Continuation) null), 3);
        h3();
    }

    public final String V2() {
        return "CHAT_FOLDER";
    }

    public final void Z2(View view) {
        h3();
    }

    public final void h3() {
        View view = this.S0;
        if (view != null) {
            scf scf = this.r1;
            g26 g26 = this.D1;
            g26.L0(scf);
            view.setBackgroundColor(scf.n);
            b33 b33 = g26.x;
            if (b33 != null) {
                b33.a(scf);
            }
            f6e.C(g26.d());
            iq.f(this.r1, g26.e(), MathKt.roundToInt(((float) 24) * vo4.c().getDisplayMetrics().density), 0, 0, 60);
            g26.e().setTextColor(-1);
        }
    }

    public final void i2(Bundle bundle) {
        super.i2(bundle);
        b0h.b(E2().getOnBackPressedDispatcher(), this, new d26(this, 0));
    }

    public final FolderPageViewModel i3() {
        return (FolderPageViewModel) this.E1.getValue();
    }

    public final View k2(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(ujc.fragment_chat_folder, viewGroup, false);
        this.D1.a(inflate, X1());
        Toolbar toolbar = (Toolbar) this.D1.f().findViewById(lic.toolbar);
        g26 g26 = this.D1;
        obd obd = new obd(new fj((a) this), toolbar);
        obd.x = this.r1;
        obd.v = this.D1.f();
        b33 b33 = new b33(obd);
        b33.o();
        b33.i(new e26(this, 1));
        g26.x = b33;
        if (!Intrinsics.areEqual((Object) i3().p.a, (Object) "all.chat.folder")) {
            g26 g262 = this.D1;
            g262.getClass();
            AppCompatImageButton appCompatImageButton = (AppCompatImageButton) g262.z.getValue(g262, g26.X[4]);
            toolbar.addView(appCompatImageButton);
            ct.G(appCompatImageButton, 300, new e26(this, 2));
        }
        g26 g263 = this.D1;
        g263.getClass();
        AppBarLayout appBarLayout = (AppBarLayout) g263.c.getValue(g263, g26.X[0]);
        appBarLayout.a(h88.d0(this.D1.f(), appBarLayout, X1()));
        ct.G(this.D1.f().getExpandedAvatarView(), 300, new e26(this, 3));
        g26 g264 = this.D1;
        i3();
        g264.y = new t26(new c26(this, 1), new c26(this, 2), new d26(this, 2), new b26(this, 4), new b26(this, 0), this.C1, new c26(this, 0));
        RecyclerView d = this.D1.d();
        d.getContext();
        d.setLayoutManager(new FolderPageFragment$onCreateView$11$1(this));
        this.D1.d().setAdapter(this.D1.y);
        return inflate;
    }
}
