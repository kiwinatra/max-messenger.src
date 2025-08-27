package one.me.folders.list;

import android.annotation.SuppressLint;
import android.content.Context;
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
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.properties.ReadOnlyProperty;
import kotlin.reflect.KProperty;
import one.me.sdk.arch.Widget;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004B\u0007¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lone/me/folders/list/FoldersListScreen;", "Lone/me/sdk/arch/Widget;", "Lql7;", "Lqg3;", "Lcx3;", "<init>", "()V", "folders_release"}, k = 1, mv = {2, 0, 0})
@SourceDebugExtension({"SMAP\nFoldersListScreen.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FoldersListScreen.kt\none/me/folders/list/FoldersListScreen\n+ 2 Widget.kt\none/me/sdk/arch/Widget\n*L\n1#1,189:1\n235#2,10:190\n*S KotlinDebug\n*F\n+ 1 FoldersListScreen.kt\none/me/folders/list/FoldersListScreen\n*L\n60#1:190,10\n*E\n"})
@SuppressLint({"ValidController"})
public final class FoldersListScreen extends Widget implements ql7, qg3, cx3 {
    public static final /* synthetic */ KProperty[] x = {wj6.p(FoldersListScreen.class, "foldersRecycler", "getFoldersRecycler()Landroidx/recyclerview/widget/RecyclerView;", 0)};
    public final w28 a = new w28(new a46(1), (Function0) null, 6);
    public final yh7 b = yh7.d;
    public final Lazy c = createViewModelLazy(w66.class, new rn2(29, new a46(2)));
    public final yl7 o = new yl7(new rl7(this));
    public final l66 v = new l66(((aua) i66.a.getAccessor().g(aua.class)).a(), new f(22, (Object) this), new mu0(2, this), new e4(18, (Object) this));
    public final ReadOnlyProperty w = viewBinding(gua.m);

    /* JADX WARNING: type inference failed for: r2v12, types: [kotlin.coroutines.jvm.internal.SuspendLambda, kotlin.jvm.functions.Function2] */
    public FoldersListScreen() {
        super((Bundle) null, 0, 3, (DefaultConstructorMarker) null);
        bs0.K(new ps5(ct.k(c0().x, this.lifecycleOwner.getLifecycle(), iu7.o), new SuspendLambda(2, (Continuation<Object>) null), 5), getLifecycleScope());
    }

    public final void M(int i, int i2) {
        this.v.M(i, i2);
    }

    public final w66 c0() {
        return (w66) this.c.getValue();
    }

    public final void g(int i, Bundle bundle) {
        if (i == gua.c) {
            w66 c0 = c0();
            ev0.v(c0.a, ((osa) c0.c).a(), (f14) null, new s66(c0, (Continuation) null), 2);
        }
    }

    public final yh7 getInsetsConfig() {
        return this.b;
    }

    public final pgd getScreenDelegate() {
        return this.a;
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        h3b d = o54.d(getContext(), (AttributeSet) null);
        d.setId(gua.o);
        d.setForm(z2b.a);
        d.setTitle(iua.c);
        d.setLeftActions(new p2b(new rx2(17, this)));
        RecyclerView recyclerView = new RecyclerView(getContext(), (AttributeSet) null);
        recyclerView.setId(gua.m);
        recyclerView.setLayoutParams(new LinearLayout.LayoutParams(-1, -1));
        recyclerView.setItemAnimator((yyc) null);
        recyclerView.getContext();
        recyclerView.setLayoutManager(new LinearLayoutManager());
        recyclerView.setAdapter(this.v);
        this.o.i(recyclerView);
        recyclerView.j(new fr(5));
        js9 js9 = fu4.k;
        js9.e(recyclerView.getContext()).f();
        recyclerView.j(new ue8(2));
        recyclerView.j(new m66((Context) i66.a.getAccessor().g(Context.class)));
        recyclerView.j(new m66(js9.e(recyclerView.getContext()).f()));
        LinearLayout linearLayout = new LinearLayout(viewGroup.getContext());
        linearLayout.setId(gua.n);
        linearLayout.setLayoutParams(new LinearLayout.LayoutParams(-1, -1));
        linearLayout.setOrientation(1);
        linearLayout.addView(d);
        linearLayout.addView(recyclerView);
        b0h.H(linearLayout, new o(3, (Continuation) null, 4));
        return linearLayout;
    }

    public final void onDestroyView(View view) {
        super.onDestroyView(view);
        this.o.i((RecyclerView) null);
    }

    public final void onViewCreated(View view) {
        bs0.K(new ps5(c0().w, new q66(this, (Continuation) null), 5), getViewLifecycleScope());
    }

    public final void s(int i, Bundle bundle) {
        g0g g0g;
        zx5 zx5;
        CharSequence charSequence;
        zx5 zx52;
        String str;
        if (i == gua.j) {
            w66 c0 = c0();
            g0g g0g2 = c0.z;
            if (g0g2 != null && (zx52 = g0g2.a) != null && (str = zx52.a) != null) {
                xag.h(c0.x, new o66(new z26(str, false)));
            }
        } else if (i == gua.k && (g0g = c0().z) != null && (zx5 = g0g.a) != null && (charSequence = zx5.b) != null) {
            kr7.N(charSequence, this);
        }
    }
}
