package one.me.sdk.contextmenu.bottomsheet;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Rect;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import java.util.Collection;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.KProperty;
import one.me.sdk.arch.Widget;
import one.me.sdk.bottomsheet.BaseBottomSheetWidget;
import one.me.sdk.bottomsheet.BottomSheetWidget;
import ru.ok.android.externcalls.sdk.api.ApiProtocol;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0001\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0007B\u0013\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\b"}, d2 = {"Lone/me/sdk/contextmenu/bottomsheet/ContextMenuBottomSheet;", "Lone/me/sdk/bottomsheet/BottomSheetWidget;", "Lmw3;", "Landroid/os/Bundle;", "args", "<init>", "(Landroid/os/Bundle;)V", "yw3", "context-menu_release"}, k = 1, mv = {2, 0, 0})
@SourceDebugExtension({"SMAP\nContextMenuBottomSheet.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ContextMenuBottomSheet.kt\none/me/sdk/contextmenu/bottomsheet/ContextMenuBottomSheet\n+ 2 Widget.kt\none/me/sdk/arch/Widget\n+ 3 WidgetExt.kt\none/me/sdk/arch/ext/WidgetExtKt\n+ 4 BottomSheetWidget.kt\none/me/sdk/bottomsheet/BottomSheetWidget$Companion\n+ 5 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,150:1\n419#2:151\n420#2:152\n420#2:153\n420#2:154\n420#2:155\n420#2:156\n419#2:157\n55#3,12:158\n33#3,14:173\n135#4,3:170\n138#4,8:187\n1#5:195\n*S KotlinDebug\n*F\n+ 1 ContextMenuBottomSheet.kt\none/me/sdk/contextmenu/bottomsheet/ContextMenuBottomSheet\n*L\n24#1:151\n29#1:152\n30#1:153\n31#1:154\n32#1:155\n33#1:156\n35#1:157\n45#1:158,12\n54#1:173,14\n54#1:170,3\n54#1:187,8\n*E\n"})
@SuppressLint({"ValidController"})
public final class ContextMenuBottomSheet extends BottomSheetWidget implements mw3 {
    public static final /* synthetic */ KProperty[] E0;
    public final is A0;
    public final is B0;
    public final is C0;
    public final ekd D0;
    public final is w0;
    public final is x0;
    public final is y0;
    public final is z0;

    static {
        Class<ContextMenuBottomSheet> cls = ContextMenuBottomSheet.class;
        E0 = new KProperty[]{wj6.p(cls, ApiProtocol.PARAM_PAYLOAD, "getPayload()Landroid/os/Bundle;", 0), wj6.p(cls, "anchorViewId", "getAnchorViewId()Ljava/lang/Integer;", 0), wj6.p(cls, "anchorClass", "getAnchorClass()Ljava/lang/Class;", 0), wj6.p(cls, "highlightPadding", "getHighlightPadding()Landroid/graphics/Rect;", 0), wj6.p(cls, "highlightRadius", "getHighlightRadius()Ljava/lang/Float;", 0), wj6.p(cls, "parentId", "getParentId()Ljava/lang/Integer;", 0), rae.s(cls, "isCallbackSent", "isCallbackSent()Z", 0)};
    }

    public ContextMenuBottomSheet() {
        this((Bundle) null, 1, (DefaultConstructorMarker) null);
    }

    public final void dismiss() {
        i0(true);
    }

    public final View n0(LayoutInflater layoutInflater, FrameLayout frameLayout) {
        Context context = layoutInflater.getContext();
        Bundle bundle = getArgs().getBundle("actions");
        Collection g = bundle != null ? kr7.g(bundle) : null;
        if (g == null) {
            g = CollectionsKt.emptyList();
        }
        rx2 rx2 = new rx2(7, this);
        this.D0.getClass();
        return ekd.e(context, g, rx2);
    }

    public final void o(Widget widget) {
        setTargetController(widget);
        zx3 zx3 = widget;
        while (zx3.getParentController() != null) {
            zx3 = zx3.getParentController();
        }
        e9d e9d = null;
        l9d l9d = zx3 instanceof l9d ? (l9d) zx3 : null;
        if (l9d != null) {
            e9d = l9d.K();
        }
        p0(widget);
        if (e9d != null) {
            i9d i9d = new i9d(this, (String) null, (ey3) null, (ey3) null, false, -1);
            a81.t(false, i9d, true, "BottomSheetWidget");
            e9d.G(i9d);
        }
    }

    public final void onAttach(View view) {
        super.onAttach(view);
        zr0 zr0 = new zr0((zx3) this, (Function0) new nm1(20, this));
        if (getRouter() != null) {
            getRouter().a(zr0);
        } else {
            addLifecycleListener(new la(this, zr0, 2));
        }
    }

    public final void onViewCreated(View view) {
        super.onViewCreated(view);
        KProperty[] kPropertyArr = E0;
        KProperty kProperty = kPropertyArr[1];
        Integer num = (Integer) this.x0.a(this);
        if (num != null) {
            int intValue = num.intValue();
            KProperty kProperty2 = kPropertyArr[2];
            Class cls = (Class) this.y0.a(this);
            if (cls != null) {
                bs6 bs6 = new bs6(cls, intValue);
                bs6.c(this);
                py6 py6 = new py6(bs6);
                KProperty kProperty3 = kPropertyArr[3];
                KProperty kProperty4 = kPropertyArr[4];
                KProperty kProperty5 = kPropertyArr[5];
                py6.a(view, (Rect) this.z0.a(this), (Float) this.A0.a(this), (Integer) this.B0.a(this));
            }
        }
    }

    public ContextMenuBottomSheet(Bundle bundle) {
        super(bundle);
        this.w0 = new is(Bundle.class, (Object) null, ApiProtocol.PARAM_PAYLOAD);
        Class<Integer> cls = Integer.class;
        this.x0 = new is(cls, "anchor_id");
        this.y0 = new is(Class.class, "anchor_class");
        this.z0 = new is(Rect.class, "highlight_padding");
        this.A0 = new is(Float.class, "highlight_radius");
        this.B0 = new is(cls, "parent_id");
        this.C0 = new is(Boolean.class, Boolean.FALSE, "callback_sent");
        this.D0 = new ekd(9);
        boolean z = false;
        if (bundle != null) {
            BaseBottomSheetWidget.v.getClass();
            z = bundle.getBoolean(BaseBottomSheetWidget.x, false);
        }
        l0(z);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ContextMenuBottomSheet(Bundle bundle, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : bundle);
    }
}
