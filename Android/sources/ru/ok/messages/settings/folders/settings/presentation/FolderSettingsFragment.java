package ru.ok.messages.settings.folders.settings.presentation;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.text.TextPaint;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import androidx.fragment.app.a;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import java.util.WeakHashMap;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.math.MathKt;
import kotlin.reflect.KProperty;
import ru.ok.messages.settings.folders.tutor.FolderTutorLayout;
import ru.ok.messages.views.fragments.base.FrgBase;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lru/ok/messages/settings/folders/settings/presentation/FolderSettingsFragment;", "Lru/ok/messages/views/fragments/base/FrgBase;", "f46", "tamtam-app_release"}, k = 1, mv = {2, 0, 0})
@SourceDebugExtension({"SMAP\nFolderSettingsFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FolderSettingsFragment.kt\nru/ok/messages/settings/folders/settings/presentation/FolderSettingsFragment\n+ 2 FragmentViewModelLazy.kt\nandroidx/fragment/app/FragmentViewModelLazyKt\n+ 3 ViewModelExt.kt\nru/ok/tamtam/shared/lifecycle/ViewModelExtKt\n+ 4 Dimensions.kt\nru/ok/tamtam/shared/Dimensions\n*L\n1#1,347:1\n112#2:348\n106#2,15:350\n14#3:349\n21#3:365\n108#4:366\n99#4:367\n111#4:368\n105#4:369\n111#4:370\n105#4:371\n111#4:372\n105#4:373\n*S KotlinDebug\n*F\n+ 1 FolderSettingsFragment.kt\nru/ok/messages/settings/folders/settings/presentation/FolderSettingsFragment\n*L\n65#1:348\n65#1:350,15\n65#1:349\n65#1:365\n92#1:366\n92#1:367\n260#1:368\n260#1:369\n261#1:370\n261#1:371\n262#1:372\n262#1:373\n*E\n"})
public final class FolderSettingsFragment extends FrgBase {
    public final r46 B1;
    public final f46 C1 = new f46();
    public final bbg D1;
    public b33 E1;
    public m56 F1;

    public FolderSettingsFragment(f56 f56, r46 r46) {
        this.B1 = r46;
        rn2 rn2 = new rn2(28, new j35(13, (Object) f56, (Object) this));
        Lazy lazy = LazyKt.lazy(LazyThreadSafetyMode.NONE, new uc(6, new tc(7, this)));
        this.D1 = new bbg(Reflection.getOrCreateKotlinClass(FolderSettingsViewModel.class), (Function0) new vc(12, lazy), (Function0) rn2, (Function0) new vc(13, lazy));
    }

    public final void A2(View view, Bundle bundle) {
        ev0.v(fqc.p(X1()), (CoroutineContext) null, (f14) null, new k46(this, (Continuation) null), 3);
        N1().g0("ContextActionsDialog:result:request", X1(), new uq(3, new d46(this, 4)));
        h3();
    }

    public final String V2() {
        return "CHAT_FOLDERS_SETTINGS";
    }

    public final void Z2(View view) {
        h3();
    }

    public final void h3() {
        scf scf;
        scf scf2;
        View view = this.S0;
        if (view != null) {
            view.setBackgroundColor(this.r1.I);
            f46 f46 = this.C1;
            f6e.C(f46.d());
            KProperty[] kPropertyArr = f46.v0;
            ((TextView) f46.w.getValue(f46, kPropertyArr[3])).setTextColor(this.r1.N);
            ((TextView) f46.y.getValue(f46, kPropertyArr[5])).setTextColor(this.r1.N);
            ((TextView) f46.X.getValue(f46, kPropertyArr[7])).setTextColor(this.r1.G);
            ((TextView) f46.Y.getValue(f46, kPropertyArr[8])).setTextColor(this.r1.N);
            KProperty kProperty = kPropertyArr[9];
            scf scf3 = this.r1;
            ((View) f46.Z.getValue(f46, kProperty)).setBackground(i8b.H(scf3.n, scf3.j));
            f6e.C(f46.e());
            b33 b33 = this.E1;
            if (b33 != null) {
                b33.a(this.r1);
            }
            m56 m56 = this.F1;
            if (m56 != null) {
                FolderTutorLayout folderTutorLayout = (FolderTutorLayout) m56.c;
                if (folderTutorLayout.isInEditMode()) {
                    scf = vi4.f0;
                } else {
                    Context context = folderTutorLayout.getContext();
                    Lazy lazy = scf.b0;
                    scf = j4b.k0(context);
                }
                ((TextPaint) m56.f).setColor(scf.m);
                if (folderTutorLayout.isInEditMode()) {
                    scf2 = vi4.f0;
                } else {
                    Context context2 = folderTutorLayout.getContext();
                    Lazy lazy2 = scf.b0;
                    scf2 = j4b.k0(context2);
                }
                folderTutorLayout.b.setColor(scf2.m);
            }
        }
    }

    public final void i2(Bundle bundle) {
        super.i2(bundle);
        b0h.b(E2().getOnBackPressedDispatcher(), this, new d46(this, 3));
    }

    public final FolderSettingsViewModel i3() {
        return (FolderSettingsViewModel) this.D1.getValue();
    }

    public final View k2(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(ujc.fragment_chat_folder_settings, viewGroup, false);
        jv7 X1 = X1();
        f46 f46 = this.C1;
        f46.a(inflate, X1);
        fj fjVar = new fj((a) this);
        KProperty[] kPropertyArr = f46.v0;
        obd obd = new obd(fjVar, (Toolbar) f46.v.getValue(f46, kPropertyArr[2]));
        obd.x = this.r1;
        b33 b33 = new b33(obd);
        b33.k(qad.V0);
        int roundToInt = MathKt.roundToInt(((float) 2) * R1().getDisplayMetrics().density);
        Toolbar toolbar = (Toolbar) b33.c;
        if (toolbar != null) {
            WeakHashMap weakHashMap = gag.a;
            v9g.s(toolbar, (float) roundToInt);
        }
        b33.i(new c46(this, 0));
        this.E1 = b33;
        RecyclerView d = f46.d();
        d.getContext();
        d.setLayoutManager(new LinearLayoutManager());
        d.setItemAnimator((yyc) null);
        Ref.ObjectRef objectRef = new Ref.ObjectRef();
        g46 g46 = new g46(objectRef, this);
        s01 s01 = new s01(i3());
        b46 b46 = r11;
        s01 s012 = s01;
        b46 b462 = new b46((d46) null, new d46(this, 0), new ir0(3, this), s012, g46, true, 1);
        d.setAdapter(b46);
        T yl7 = new yl7(new rl7((ql7) d.getAdapter()));
        objectRef.element = yl7;
        yl7.i(d);
        ((TextView) f46.w.getValue(f46, kPropertyArr[3])).setText(G2().getString(qad.d3));
        ((TextView) f46.y.getValue(f46, kPropertyArr[5])).setText(G2().getString(qad.l3));
        ((TextView) f46.X.getValue(f46, kPropertyArr[7])).setText(G2().getString(qad.E2));
        KProperty kProperty = kPropertyArr[6];
        Drawable b = ew3.b(G2(), nad.P0);
        b.setTint(this.r1.x);
        ((ImageView) f46.z.getValue(f46, kProperty)).setImageDrawable(b);
        ct.G((View) f46.Z.getValue(f46, kPropertyArr[9]), 300, new c46(this, 1));
        RecyclerView e = f46.e();
        e.getContext();
        e.setLayoutManager(new LinearLayoutManager());
        e.setAdapter(new b46(new d46(this, 1), new d46(this, 2), (ir0) null, (s01) null, (g46) null, false, 60));
        e.setItemAnimator((yyc) null);
        this.F1 = new m56((FolderTutorLayout) inflate, f46.e(), f46.f());
        return inflate;
    }

    public final void m2() {
        super.m2();
        this.E1 = null;
        this.F1 = null;
    }
}
