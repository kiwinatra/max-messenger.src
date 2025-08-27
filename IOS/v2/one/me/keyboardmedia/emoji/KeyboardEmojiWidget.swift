package one.me.keyboardmedia.emoji;

import android.os.Bundle;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.math.MathKt;
import kotlin.properties.ReadOnlyProperty;
import kotlin.ranges.RangesKt;
import kotlin.reflect.KProperty;
import one.me.sdk.arch.Widget;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B\u0011\b\u0016\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0004\u0010\b¨\u0006\t"}, d2 = {"Lone/me/keyboardmedia/emoji/KeyboardEmojiWidget;", "Lone/me/sdk/arch/Widget;", "Landroid/os/Bundle;", "args", "<init>", "(Landroid/os/Bundle;)V", "Legd;", "scopeId", "(Ljava/lang/String;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "keyboard-media_release"}, k = 1, mv = {2, 0, 0})
@SourceDebugExtension({"SMAP\nKeyboardEmojiWidget.kt\nKotlin\n*S Kotlin\n*F\n+ 1 KeyboardEmojiWidget.kt\none/me/keyboardmedia/emoji/KeyboardEmojiWidget\n+ 2 Widget.kt\none/me/sdk/arch/Widget\n+ 3 BundleExt.kt\nru/ok/tamtam/shared/BundleExtKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 5 Dimensions.kt\nru/ok/tamtam/shared/Dimensions\n+ 6 View.kt\nandroidx/core/view/ViewKt\n*L\n1#1,181:1\n235#2,10:182\n255#2,9:194\n9#3:192\n1#4:193\n1#4:208\n24#5:203\n24#5:204\n24#5:205\n24#5:209\n24#5:210\n24#5:219\n24#5:220\n24#5:221\n24#5:222\n163#6,2:206\n157#6,8:211\n*S KotlinDebug\n*F\n+ 1 KeyboardEmojiWidget.kt\none/me/keyboardmedia/emoji/KeyboardEmojiWidget\n*L\n41#1:182,10\n51#1:194,9\n52#1:192\n52#1:193\n99#1:203\n103#1:204\n104#1:205\n128#1:209\n129#1:210\n136#1:219\n157#1:220\n158#1:221\n159#1:222\n105#1:206,2\n129#1:211,8\n*E\n"})
public final class KeyboardEmojiWidget extends Widget {
    public static final /* synthetic */ KProperty[] y;
    public final Lazy a;
    public final Lazy b;
    public final ReadOnlyProperty c;
    public final ReadOnlyProperty o;
    public final t56 v;
    public final r35 w;
    public final yx1 x;

    static {
        Class<KeyboardEmojiWidget> cls = KeyboardEmojiWidget.class;
        y = new KProperty[]{wj6.p(cls, "contentRecyclerView", "getContentRecyclerView()Landroidx/recyclerview/widget/RecyclerView;", 0), wj6.p(cls, "tabsRecyclerView", "getTabsRecyclerView()Landroidx/recyclerview/widget/RecyclerView;", 0)};
    }

    public KeyboardEmojiWidget(Bundle bundle) {
        super(bundle, 0, 2, (DefaultConstructorMarker) null);
        Lazy<VM> createViewModelLazy = createViewModelLazy(i45.class, new i76(8, new ck7(7)));
        this.a = createViewModelLazy;
        Class<egd> cls = egd.class;
        Object k = n54.k(bundle, Widget.ARG_SCOPE_ID, cls);
        if (k != null) {
            this.b = m1571getSharedViewModelcp94BC8(((egd) ((Parcelable) k)).a, sr8.class, (Function0) null);
            this.c = viewBinding(zua.c);
            this.o = viewBinding(zua.d);
            fq7 fq7 = fq7.a;
            Class<aua> cls2 = aua.class;
            t56 t56 = new t56(((aua) fq7.getAccessor().g(cls2)).a(), (Object) new rt6(24, (Object) this), 10);
            this.v = t56;
            this.w = new r35(((aua) fq7.getAccessor().g(cls2)).a(), new rx2(29, this));
            this.x = new yx1((pae) t56, (Function1) new hq7((i45) createViewModelLazy.getValue()));
            bs0.K(new ps5(((i45) createViewModelLazy.getValue()).X, new gq7(this, (Continuation) null), 5), getLifecycleScope());
            return;
        }
        throw new IllegalArgumentException(wj6.k("No value passed for key arg_key_scope_id of type ", cls.getSimpleName(), " in bundle").toString());
    }

    public final RecyclerView c0() {
        return (RecyclerView) this.c.getValue(this, y[0]);
    }

    public final RecyclerView d0() {
        return (RecyclerView) this.o.getValue(this, y[1]);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        FrameLayout frameLayout = new FrameLayout(getContext());
        frameLayout.setId(zua.b);
        int roundToInt = MathKt.roundToInt(((float) 44) * vo4.c().getDisplayMetrics().density);
        RecyclerView recyclerView = new RecyclerView(frameLayout.getContext(), (AttributeSet) null);
        recyclerView.setId(zua.d);
        recyclerView.setLayoutParams(new FrameLayout.LayoutParams(-1, roundToInt));
        int roundToInt2 = MathKt.roundToInt(((float) 4) * vo4.c().getDisplayMetrics().density);
        int roundToInt3 = MathKt.roundToInt(((float) 8) * vo4.c().getDisplayMetrics().density);
        recyclerView.setPadding(roundToInt3, roundToInt2, roundToInt3, roundToInt2);
        recyclerView.setClipToPadding(false);
        recyclerView.getContext();
        recyclerView.setLayoutManager(new LinearLayoutManager(0, false));
        recyclerView.setNestedScrollingEnabled(false);
        b0h.H(recyclerView, new iq7(3, (Continuation) null, 0));
        frameLayout.addView(recyclerView);
        RecyclerView recyclerView2 = new RecyclerView(frameLayout.getContext(), (AttributeSet) null);
        recyclerView2.setId(zua.c);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -2);
        layoutParams.topMargin = roundToInt;
        recyclerView2.setLayoutParams(layoutParams);
        b0h.H(recyclerView2, new iq7(3, (Continuation) null, 1));
        recyclerView2.setClipToPadding(false);
        recyclerView2.setClipChildren(false);
        recyclerView2.setItemAnimator((yyc) null);
        int roundToInt4 = MathKt.roundToInt(((float) 12) * vo4.c().getDisplayMetrics().density);
        recyclerView2.setPadding(roundToInt4, recyclerView2.getPaddingTop(), roundToInt4, MathKt.roundToInt(((float) 48) * vo4.c().getDisplayMetrics().density));
        frameLayout.addView(recyclerView2);
        return frameLayout;
    }

    public final void onDestroyView(View view) {
        c0().setAdapter((tyc) null);
        c0().u0(this.x);
        d0().setAdapter((tyc) null);
    }

    public final void onViewCreated(View view) {
        d0().setAdapter(this.w);
        d0().j(new w51(MathKt.roundToInt(((float) 2) * vo4.c().getDisplayMetrics().density), 4));
        RecyclerView c0 = c0();
        int roundToInt = MathKt.roundToInt(((float) 32) * vo4.c().getDisplayMetrics().density);
        int roundToInt2 = MathKt.roundToInt(((float) 12) * vo4.c().getDisplayMetrics().density);
        int roundToInt3 = MathKt.roundToInt(((float) 11) * vo4.c().getDisplayMetrics().density);
        int coerceAtLeast = RangesKt.coerceAtLeast((c0.getContext().getResources().getDisplayMetrics().widthPixels - (roundToInt2 * 2)) / (roundToInt + roundToInt3), 1);
        mse mse = new mse(this, c0);
        c0.getContext();
        GridLayoutManager gridLayoutManager = new GridLayoutManager(coerceAtLeast);
        gridLayoutManager.K = mse;
        c0.setLayoutManager(gridLayoutManager);
        c0.m(this.x);
        c0.j(new jz0(coerceAtLeast, roundToInt3, 1));
        c0.setAdapter(this.v);
        bs0.K(new ps5(((i45) this.a.getValue()).x, new jq7(this, (Continuation) null), 5), getViewLifecycleScope());
    }

    public KeyboardEmojiWidget(String str, DefaultConstructorMarker defaultConstructorMarker) {
        this(o54.f(i2a.l(str, Widget.ARG_SCOPE_ID)));
    }
}
