package ru.ok.messages.settings.folders.filters.presentation;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.appcompat.widget.Toolbar;
import androidx.fragment.app.a;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.flexbox.FlexboxLayoutManager;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.KProperty;
import ru.ok.messages.views.fragments.base.FrgBase;
import ru.ok.utils.widgets.LongRoundedTitleSubtitleButton;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lru/ok/messages/settings/folders/filters/presentation/FolderFiltersFragment;", "Lru/ok/messages/views/fragments/base/FrgBase;", "s06", "tamtam-app_release"}, k = 1, mv = {2, 0, 0})
@SourceDebugExtension({"SMAP\nFolderFiltersFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FolderFiltersFragment.kt\nru/ok/messages/settings/folders/filters/presentation/FolderFiltersFragment\n+ 2 FragmentViewModelLazy.kt\nandroidx/fragment/app/FragmentViewModelLazyKt\n+ 3 ViewModelExt.kt\nru/ok/tamtam/shared/lifecycle/ViewModelExtKt\n*L\n1#1,209:1\n112#2:210\n106#2,15:212\n14#3:211\n21#3:227\n*S KotlinDebug\n*F\n+ 1 FolderFiltersFragment.kt\nru/ok/messages/settings/folders/filters/presentation/FolderFiltersFragment\n*L\n52#1:210\n52#1:212,15\n52#1:211\n52#1:227\n*E\n"})
public final class FolderFiltersFragment extends FrgBase {
    public final r46 B1;
    public final s06 C1 = new s06();
    public p06 D1 = new p06(new r06(this, 1));
    public p06 E1 = new p06(new r06(this, 2));
    public p06 F1 = new p06(new r06(this, 3));
    public final bbg G1;

    public FolderFiltersFragment(h16 h16, r46 r46) {
        this.B1 = r46;
        rn2 rn2 = new rn2(26, new j35(11, (Object) h16, (Object) this));
        Lazy lazy = LazyKt.lazy(LazyThreadSafetyMode.NONE, new uc(4, new tc(5, this)));
        this.G1 = new bbg(Reflection.getOrCreateKotlinClass(FolderFiltersViewModel.class), (Function0) new vc(8, lazy), (Function0) rn2, (Function0) new vc(9, lazy));
    }

    public final void A2(View view, Bundle bundle) {
        View view2 = this.S0;
        if (view2 != null) {
            scf scf = this.r1;
            view2.setBackgroundColor(scf.n);
            s06 s06 = this.C1;
            b33 b33 = s06.Y;
            if (b33 != null) {
                b33.a(scf);
            }
            AppCompatTextView d = s06.d();
            int i = scf.G;
            d.setTextColor(i);
            ((AppCompatTextView) s06.x.getValue(s06, s06.Z[5])).setTextColor(i);
        }
        ev0.v(fqc.p(X1()), (CoroutineContext) null, (f14) null, new a16(this, (Continuation) null), 3);
    }

    public final String V2() {
        return "CHAT_FOLDERS_FILTERS";
    }

    public final FolderFiltersViewModel h3() {
        return (FolderFiltersViewModel) this.G1.getValue();
    }

    public final void i2(Bundle bundle) {
        super.i2(bundle);
        b0h.b(E2().getOnBackPressedDispatcher(), this, new r06(this, 0));
    }

    public final View k2(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(ujc.fragment_folder_filters, viewGroup, false);
        s06 s06 = this.C1;
        s06.a(inflate, this);
        fj fjVar = new fj((a) this);
        KProperty[] kPropertyArr = s06.Z;
        obd obd = new obd(fjVar, (Toolbar) s06.c.getValue(s06, kPropertyArr[1]));
        obd.x = this.r1;
        b33 b33 = new b33(obd);
        b33.g(nad.u);
        b33.i(new q06(this, 0));
        s06.Y = b33;
        RecyclerView recyclerView = (RecyclerView) s06.o.getValue(s06, kPropertyArr[2]);
        recyclerView.setLayoutManager(new FlexboxLayoutManager(G2()));
        recyclerView.setAdapter(this.D1);
        RecyclerView recyclerView2 = (RecyclerView) s06.w.getValue(s06, kPropertyArr[4]);
        recyclerView2.setLayoutManager(new FlexboxLayoutManager(G2()));
        recyclerView2.setAdapter(this.E1);
        recyclerView2.setVisibility(8);
        RecyclerView recyclerView3 = (RecyclerView) s06.y.getValue(s06, kPropertyArr[6]);
        recyclerView3.setLayoutManager(new FlexboxLayoutManager(G2()));
        recyclerView3.setAdapter(this.F1);
        s06.d().setVisibility(8);
        ct.G((LongRoundedTitleSubtitleButton) s06.z.getValue(s06, kPropertyArr[7]), 300, new q06(this, 1));
        return inflate;
    }

    public final void m2() {
        super.m2();
        this.D1 = null;
        this.E1 = null;
        this.F1 = null;
    }
}
