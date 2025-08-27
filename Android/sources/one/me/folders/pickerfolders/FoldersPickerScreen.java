package one.me.folders.pickerfolders;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.math.MathKt;
import kotlin.properties.ReadOnlyProperty;
import kotlin.reflect.KProperty;
import one.me.sdk.arch.Widget;
import one.me.sdk.uikit.common.button.OneMeButton;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B\u0011\b\u0016\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0004\u0010\b¨\u0006\t"}, d2 = {"Lone/me/folders/pickerfolders/FoldersPickerScreen;", "Lone/me/sdk/arch/Widget;", "Landroid/os/Bundle;", "args", "<init>", "(Landroid/os/Bundle;)V", "", "serverChatId", "(J)V", "folders_release"}, k = 1, mv = {2, 0, 0})
@SourceDebugExtension({"SMAP\nFoldersPickerScreen.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FoldersPickerScreen.kt\none/me/folders/pickerfolders/FoldersPickerScreen\n+ 2 Widget.kt\none/me/sdk/arch/Widget\n+ 3 Dimensions.kt\nru/ok/tamtam/shared/Dimensions\n+ 4 View.kt\nandroidx/core/view/ViewKt\n*L\n1#1,209:1\n419#2:210\n235#2,10:211\n410#2,8:231\n410#2,8:239\n410#2,8:247\n24#3:221\n24#3:230\n157#4,8:222\n256#4,2:255\n256#4,2:257\n*S KotlinDebug\n*F\n+ 1 FoldersPickerScreen.kt\none/me/folders/pickerfolders/FoldersPickerScreen\n*L\n53#1:210\n55#1:211,10\n162#1:231,8\n165#1:239,8\n170#1:247,8\n105#1:221\n153#1:230\n105#1:222,8\n187#1:255,2\n188#1:257,2\n*E\n"})
@SuppressLint({"ValidController"})
public final class FoldersPickerScreen extends Widget {
    public static final /* synthetic */ KProperty[] z;
    public final yh7 a;
    public final is b;
    public final Lazy c;
    public final t56 o;
    public final ReadOnlyProperty v;
    public final ReadOnlyProperty w;
    public final ReadOnlyProperty x;
    public final sn0 y;

    static {
        Class<FoldersPickerScreen> cls = FoldersPickerScreen.class;
        z = new KProperty[]{wj6.p(cls, "serverChatId", "getServerChatId()J", 0), wj6.p(cls, "foldersRecycler", "getFoldersRecycler()Landroidx/recyclerview/widget/RecyclerView;", 0), wj6.p(cls, "toolbar", "getToolbar()Lone/me/sdk/uikit/common/toolbar/OneMeToolbar;", 0), wj6.p(cls, "createButton", "getCreateButton()Lone/me/sdk/uikit/common/button/OneMeButton;", 0), wj6.p(cls, "emptyView", "getEmptyView()Lone/me/sdk/uikit/common/emptyview/OneMeEmptyView;", 0)};
    }

    public FoldersPickerScreen(Bundle bundle) {
        super(bundle, 0, 2, (DefaultConstructorMarker) null);
        this.a = yh7.d;
        this.b = new is(Long.class, 0L, "arg_chat_id");
        this.c = createViewModelLazy(l86.class, new i76(1, new j76(this, 0)));
        this.o = new t56(((aua) i66.a.getAccessor().g(aua.class)).a(), (Object) new f(25, (Object) this), 12);
        this.v = viewBinding(gua.m);
        this.w = viewBinding(gua.o);
        this.x = viewBinding(gua.d);
        this.y = binding(new j76(this, 1));
    }

    public final l86 c0() {
        return (l86) this.c.getValue();
    }

    public final yh7 getInsetsConfig() {
        return this.a;
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        h3b d = o54.d(getContext(), (AttributeSet) null);
        d.setId(gua.o);
        d.setForm(z2b.a);
        d.setTitle(iua.q);
        d.setLeftActions(new p2b(new k76(this, 0)));
        OneMeButton oneMeButton = new OneMeButton(getContext(), (AttributeSet) null);
        oneMeButton.setId(gua.d);
        oneMeButton.setLayoutParams(new FrameLayout.LayoutParams(-1, -2, 80));
        oneMeButton.setEnabled(false);
        oneMeButton.setAppearance(xpa.o);
        oneMeButton.setSize(aqa.c);
        oneMeButton.setMode(zpa.a);
        oneMeButton.setText(iua.h);
        ct.G(oneMeButton, 300, new l76(this, 0));
        RecyclerView recyclerView = new RecyclerView(getContext(), (AttributeSet) null);
        recyclerView.setId(gua.m);
        recyclerView.setLayoutParams(new LinearLayout.LayoutParams(-1, -1));
        recyclerView.setItemAnimator((yyc) null);
        recyclerView.setClipChildren(false);
        recyclerView.getContext();
        recyclerView.setLayoutManager(new LinearLayoutManager());
        recyclerView.setAdapter(this.o);
        float f = (float) 6;
        recyclerView.setPadding(MathKt.roundToInt(vo4.c().getDisplayMetrics().density * f), recyclerView.getPaddingTop(), MathKt.roundToInt(f * vo4.c().getDisplayMetrics().density), recyclerView.getPaddingBottom());
        k76 k76 = new k76(this, 1);
        recyclerView.j(new fz2(new m76(recyclerView, 0), new k76(this, 2), k76, k76));
        recyclerView.l(new ia4(recyclerView));
        recyclerView.j(new fr(6));
        ConstraintLayout constraintLayout = new ConstraintLayout(getContext());
        constraintLayout.setId(gua.n);
        fj3 fj3 = new fj3(0, -2);
        fj3.i = 0;
        fj3.e = 0;
        fj3.h = 0;
        Unit unit = Unit.INSTANCE;
        constraintLayout.addView(d, fj3);
        fj3 fj32 = new fj3(0, 0);
        fj32.j = d.getId();
        fj32.e = 0;
        fj32.h = 0;
        fj32.k = oneMeButton.getId();
        constraintLayout.addView(recyclerView, fj32);
        fj3 fj33 = new fj3(0, -2);
        fj33.e = 0;
        fj33.h = 0;
        fj33.l = 0;
        float f2 = (float) 12;
        fj33.setMargins(MathKt.roundToInt(vo4.c().getDisplayMetrics().density * f2), 0, MathKt.roundToInt(vo4.c().getDisplayMetrics().density * f2), MathKt.roundToInt(f2 * vo4.c().getDisplayMetrics().density));
        constraintLayout.addView(oneMeButton, fj33);
        b0h.H(constraintLayout, new sa(3, (Continuation) null, 12));
        return constraintLayout;
    }

    public final void onViewCreated(View view) {
        etc etc = c0().z;
        iu7 iu7 = iu7.o;
        bs0.K(new ps5(ct.k(etc, getViewLifecycleOwner().getLifecycle(), iu7), new o76((Continuation) null, this), 5), getViewLifecycleScope());
        bs0.K(new ps5(ct.k(c0().w0, getViewLifecycleOwner().getLifecycle(), iu7), new p76((Continuation) null, this), 5), getViewLifecycleScope());
        bs0.K(new ps5(ct.k(c0().Y, getViewLifecycleOwner().getLifecycle(), iu7), new q76((Continuation) null, this), 5), getViewLifecycleScope());
    }

    public FoldersPickerScreen(long j) {
        this(o54.f(TuplesKt.to("arg_chat_id", Long.valueOf(j))));
    }
}
