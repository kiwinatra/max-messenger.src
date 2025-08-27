package one.me.stickerspreview.set;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.math.MathKt;
import kotlin.properties.ReadOnlyProperty;
import kotlin.reflect.KProperty;
import one.me.sdk.arch.Widget;
import one.me.sdk.bottomsheet.BaseBottomSheetWidget;
import one.me.stickerspreview.StickerPreviewScreen;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001:\u0001\tB\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B\u0011\b\u0016\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0004\u0010\b¨\u0006\n"}, d2 = {"Lone/me/stickerspreview/set/StickerSetBottomSheet;", "Lone/me/sdk/bottomsheet/BaseBottomSheetWidget;", "Landroid/os/Bundle;", "args", "<init>", "(Landroid/os/Bundle;)V", "Legd;", "scopeId", "(Ljava/lang/String;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "eqe", "stickers-preview_release"}, k = 1, mv = {2, 0, 0})
@SourceDebugExtension({"SMAP\nStickerSetBottomSheet.kt\nKotlin\n*S Kotlin\n*F\n+ 1 StickerSetBottomSheet.kt\none/me/stickerspreview/set/StickerSetBottomSheet\n+ 2 BundleExt.kt\nru/ok/tamtam/shared/BundleExtKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 Widget.kt\none/me/sdk/arch/Widget\n+ 5 Dimensions.kt\nru/ok/tamtam/shared/Dimensions\n+ 6 View.kt\nandroidx/core/view/ViewKt\n*L\n1#1,236:1\n9#2:237\n1#3:238\n1#3:255\n255#4,9:239\n419#4:248\n24#5:249\n24#5:250\n24#5:251\n24#5:252\n24#5:253\n24#5:254\n24#5:256\n81#6:257\n256#6,2:258\n*S KotlinDebug\n*F\n+ 1 StickerSetBottomSheet.kt\none/me/stickerspreview/set/StickerSetBottomSheet\n*L\n54#1:237\n54#1:238\n53#1:239,9\n57#1:248\n80#1:249\n129#1:250\n130#1:251\n139#1:252\n158#1:253\n159#1:254\n173#1:256\n175#1:257\n198#1:258,2\n*E\n"})
@SuppressLint({"ValidController"})
public final class StickerSetBottomSheet extends BaseBottomSheetWidget {
    public static final /* synthetic */ KProperty[] x0;
    public final ReadOnlyProperty X;
    public final ReadOnlyProperty Y;
    public final t56 Z;
    public final int v0;
    public final sn0 w0;
    public final Lazy y;
    public final is z;

    static {
        Class<StickerSetBottomSheet> cls = StickerSetBottomSheet.class;
        x0 = new KProperty[]{wj6.p(cls, "stickerId", "getStickerId()J", 0), wj6.p(cls, "headerView", "getHeaderView()Lone/me/sdk/stickers/set/StickersSetHeaderView;", 0), wj6.p(cls, "stickerSetRecycler", "getStickerSetRecycler()Landroidx/recyclerview/widget/RecyclerView;", 0), wj6.p(cls, "loadingView", "getLoadingView()Landroid/view/View;", 0)};
    }

    public StickerSetBottomSheet(Bundle bundle) {
        super(bundle);
        Class<egd> cls = egd.class;
        Object k = n54.k(bundle, Widget.ARG_SCOPE_ID, cls);
        if (k != null) {
            this.y = m1571getSharedViewModelcp94BC8(((egd) ((Parcelable) k)).a, upe.class, (Function0) null);
            this.z = new is(Long.class, 0L, "arg_key_sticker_id");
            this.X = viewBinding(h1b.j);
            this.Y = viewBinding(h1b.i);
            this.Z = new t56(((aua) sse.a.getAccessor().g(aua.class)).a(), new xga(5, this));
            this.v0 = MathKt.roundToInt(((float) 183) * vo4.c().getDisplayMetrics().density);
            this.w0 = binding(new lce(6, this));
            l0(false);
            return;
        }
        throw new IllegalArgumentException(wj6.k("No value passed for key arg_key_scope_id of type ", cls.getSimpleName(), " in bundle").toString());
    }

    public static final int n0(StickerSetBottomSheet stickerSetBottomSheet) {
        zx3 parentController = stickerSetBottomSheet.getParentController();
        eqe eqe = parentController instanceof eqe ? (eqe) parentController : null;
        if (eqe == null) {
            return 0;
        }
        StickerPreviewScreen stickerPreviewScreen = (StickerPreviewScreen) eqe;
        KProperty[] kPropertyArr = StickerPreviewScreen.v0;
        return ((ViewGroup) stickerPreviewScreen.x.getValue(stickerPreviewScreen, kPropertyArr[4])).getMeasuredHeight() + ((h3b) stickerPreviewScreen.w.getValue(stickerPreviewScreen, kPropertyArr[3])).getBottom();
    }

    public final frb d0() {
        return new qa(this, 5);
    }

    public final yh7 e0() {
        yh7 yh7 = yh7.c;
        return yh7.c;
    }

    public final boolean handleBack() {
        return false;
    }

    public final void j0() {
    }

    public final void m0(FrameLayout frameLayout, LayoutInflater layoutInflater, Bundle bundle) {
        float f = (float) 10;
        int roundToInt = MathKt.roundToInt(vo4.c().getDisplayMetrics().density * f);
        float f2 = (float) 12;
        frameLayout.setPadding(MathKt.roundToInt(vo4.c().getDisplayMetrics().density * f2), roundToInt, MathKt.roundToInt(f2 * vo4.c().getDisplayMetrics().density), 0);
        frameLayout.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        LinearLayout linearLayout = new LinearLayout(getContext());
        linearLayout.setOrientation(1);
        linearLayout.setLayoutParams(new LinearLayout.LayoutParams(-1, -1));
        yte yte = new yte(linearLayout.getContext());
        yte.setId(h1b.j);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
        layoutParams.topMargin = MathKt.roundToInt(f * vo4.c().getDisplayMetrics().density);
        float f3 = (float) 4;
        layoutParams.bottomMargin = MathKt.roundToInt(vo4.c().getDisplayMetrics().density * f3);
        yte.setLayoutParams(layoutParams);
        ct.G(yte.getHeaderButton(), 300, new dqe(this, 1));
        linearLayout.addView(yte);
        RecyclerView recyclerView = new RecyclerView(linearLayout.getContext(), (AttributeSet) null);
        recyclerView.setId(h1b.i);
        recyclerView.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
        int A = b0h.A(recyclerView.getContext());
        recyclerView.getContext();
        recyclerView.setLayoutManager(new GridLayoutManager(A));
        recyclerView.j(new jz0(A, MathKt.roundToInt(f3 * vo4.c().getDisplayMetrics().density), 7));
        recyclerView.setAdapter(this.Z);
        u3b.a(recyclerView, new uj6((ViewGroup) recyclerView, recyclerView, (Widget) this, 23));
        linearLayout.addView(recyclerView);
        KProperty kProperty = x0[3];
        linearLayout.addView((View) this.w0.getValue());
        frameLayout.addView(linearLayout, new ViewGroup.LayoutParams(-1, -1));
        nu4 nu4 = new nu4(frameLayout.getContext());
        nu4.setTranslationY((float) g63.b((float) 6, vo4.c().getDisplayMetrics().density, -roundToInt));
        frameLayout.addView(nu4);
    }

    public final void onAttach(View view) {
        KProperty kProperty = x0[0];
        ((upe) this.y.getValue()).j(Long.valueOf(((Number) this.z.a(this)).longValue()));
    }

    public final void onViewCreated(View view) {
        ct.G(view, 300, new dqe(this, 0));
        bs0.K(new ps5(((upe) this.y.getValue()).A0, new p2c(2, this, StickerSetBottomSheet.class, "handleStickerSet", "handleStickerSet(Lone/me/sdk/stickers/model/StickerSetModel;)V", 4, 9), 5), getViewLifecycleScope());
    }

    public StickerSetBottomSheet(String str, DefaultConstructorMarker defaultConstructorMarker) {
        this(o54.f(i2a.l(str, Widget.ARG_SCOPE_ID)));
    }
}
