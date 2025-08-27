package one.me.sdk.bottomsheet;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.math.MathKt;
import kotlin.reflect.KProperty;
import one.me.sdk.arch.Widget;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b&\u0018\u00002\u00020\u0001B\u0013\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lone/me/sdk/bottomsheet/BottomSheetWidget;", "Lone/me/sdk/bottomsheet/BaseBottomSheetWidget;", "Landroid/os/Bundle;", "args", "<init>", "(Landroid/os/Bundle;)V", "bottom-sheet_release"}, k = 1, mv = {2, 0, 0})
@SourceDebugExtension({"SMAP\nBottomSheetWidget.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BottomSheetWidget.kt\none/me/sdk/bottomsheet/BottomSheetWidget\n+ 2 Widget.kt\none/me/sdk/arch/Widget\n+ 3 Dimensions.kt\nru/ok/tamtam/shared/Dimensions\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 5 WidgetExt.kt\none/me/sdk/arch/ext/WidgetExtKt\n*L\n1#1,147:1\n419#2:148\n24#3:149\n24#3:150\n24#3:151\n1#4:152\n26#5:153\n42#5,5:154\n*S KotlinDebug\n*F\n+ 1 BottomSheetWidget.kt\none/me/sdk/bottomsheet/BottomSheetWidget\n*L\n44#1:148\n47#1:149\n48#1:150\n56#1:151\n99#1:153\n99#1:154,5\n*E\n"})
public abstract class BottomSheetWidget extends BaseBottomSheetWidget {
    public static final /* synthetic */ KProperty[] v0 = {rae.s(BottomSheetWidget.class, "wasKeyboardOpened", "getWasKeyboardOpened()Z", 0)};
    public View X;
    public final is Y;
    public final ky3 Z;
    public final boolean y;
    public nu4 z;

    public BottomSheetWidget() {
        this((Bundle) null, 1, (DefaultConstructorMarker) null);
    }

    public final void m0(FrameLayout frameLayout, LayoutInflater layoutInflater, Bundle bundle) {
        int roundToInt = MathKt.roundToInt(((float) 10) * vo4.c().getDisplayMetrics().density);
        float f = (float) 12;
        frameLayout.setPadding(MathKt.roundToInt(vo4.c().getDisplayMetrics().density * f), roundToInt, MathKt.roundToInt(f * vo4.c().getDisplayMetrics().density), MathKt.roundToInt(((float) 15) * vo4.c().getDisplayMetrics().density));
        frameLayout.addView(n0(layoutInflater, frameLayout), new ViewGroup.LayoutParams(-1, -2));
        nu4 nu4 = new nu4(frameLayout.getContext());
        nu4.setTranslationY((float) g63.b((float) 6, vo4.c().getDisplayMetrics().density, -roundToInt));
        this.z = nu4;
        frameLayout.addView(nu4);
    }

    public abstract View n0(LayoutInflater layoutInflater, FrameLayout frameLayout);

    public boolean o0() {
        return this.y;
    }

    public final void onContextAvailable(Context context) {
        super.onContextAvailable(context);
        getRouter().a(this.Z);
    }

    public final void onContextUnavailable() {
        super.onContextUnavailable();
        getRouter().K(this.Z);
    }

    public void onDestroyView(View view) {
        this.z = null;
        super.onDestroyView(view);
    }

    public final void p0(Widget widget) {
        zx3 zx3;
        while (true) {
            zx3 parentController = zx3.getParentController();
            zx3 = widget;
            if (parentController == null) {
                break;
            }
            zx3 = zx3.getParentController();
        }
        e9d e9d = null;
        l9d l9d = zx3 instanceof l9d ? (l9d) zx3 : null;
        if (l9d != null) {
            e9d = l9d.x();
        }
        if (e9d != null) {
            e9d.a(new zr0(e9d, this));
        }
    }

    public BottomSheetWidget(Bundle bundle) {
        super(bundle);
        this.y = true;
        this.Y = new is(Boolean.class, Boolean.FALSE, "was_keyboard_opened");
        this.Z = new ky3(getInstanceId(), new yr0(this, 0), new yr0(this, 1));
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ BottomSheetWidget(Bundle bundle, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : bundle);
    }
}
