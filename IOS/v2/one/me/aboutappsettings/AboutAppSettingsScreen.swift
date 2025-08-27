package one.me.aboutappsettings;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.math.MathKt;
import one.me.sdk.arch.Widget;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lone/me/aboutappsettings/AboutAppSettingsScreen;", "Lone/me/sdk/arch/Widget;", "<init>", "()V", "about-app-settings_release"}, k = 1, mv = {2, 0, 0})
@SourceDebugExtension({"SMAP\nAboutAppSettingsScreen.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AboutAppSettingsScreen.kt\none/me/aboutappsettings/AboutAppSettingsScreen\n+ 2 Widget.kt\none/me/sdk/arch/Widget\n+ 3 Dimensions.kt\nru/ok/tamtam/shared/Dimensions\n+ 4 View.kt\nandroidx/core/view/ViewKt\n*L\n1#1,98:1\n235#2,10:99\n410#2,8:118\n410#2,8:126\n24#3:109\n142#4,8:110\n*S KotlinDebug\n*F\n+ 1 AboutAppSettingsScreen.kt\none/me/aboutappsettings/AboutAppSettingsScreen\n*L\n31#1:99,10\n83#1:118,8\n87#1:126,8\n57#1:109\n57#1:110,8\n*E\n"})
@SuppressLint({"ValidController"})
public final class AboutAppSettingsScreen extends Widget {
    public static final /* synthetic */ int c = 0;
    public final Lazy a = createViewModelLazy(v.class, new s(0, new m(0)));
    public final t56 b = new t56(((aua) h.a.getAccessor().h(aua.class).getValue()).a(), (Object) new n(this), 1);

    public AboutAppSettingsScreen() {
        super((Bundle) null, 0, 3, (DefaultConstructorMarker) null);
    }

    public final yh7 getInsetsConfig() {
        yh7 yh7 = yh7.c;
        return yh7.d;
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        h3b d = o54.d(getContext(), (AttributeSet) null);
        d.setForm(z2b.a);
        d.setTitle(fna.a);
        d.setLeftActions(new p2b(new l(0, this)));
        RecyclerView recyclerView = new RecyclerView(getContext(), (AttributeSet) null);
        ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-1, -1);
        float f = (float) 12;
        recyclerView.setPaddingRelative(MathKt.roundToInt(vo4.c().getDisplayMetrics().density * f), recyclerView.getPaddingTop(), MathKt.roundToInt(f * vo4.c().getDisplayMetrics().density), recyclerView.getPaddingBottom());
        recyclerView.setLayoutParams(layoutParams);
        recyclerView.getContext();
        recyclerView.setLayoutManager(new LinearLayoutManager());
        recyclerView.setAdapter(this.b);
        recyclerView.j(new mnd(fu4.k.e(recyclerView.getContext()).f(), new rx0(6), (h9) null, 8));
        LinearLayout linearLayout = new LinearLayout(getContext());
        linearLayout.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        linearLayout.setOrientation(1);
        linearLayout.addView(d);
        linearLayout.addView(recyclerView);
        b0h.H(linearLayout, new o(3, (Continuation) null, 0));
        return linearLayout;
    }

    public final void onViewCreated(View view) {
        super.onViewCreated(view);
        Lazy lazy = this.a;
        etc etc = ((v) lazy.getValue()).o;
        iu7 iu7 = iu7.o;
        bs0.K(new ps5(ct.k(etc, getViewLifecycleOwner().getLifecycle(), iu7), new p((Continuation) null, this), 5), getViewLifecycleScope());
        bs0.K(new ps5(ct.k(((v) lazy.getValue()).b, getViewLifecycleOwner().getLifecycle(), iu7), new q((Continuation) null, this), 5), getViewLifecycleScope());
    }
}
