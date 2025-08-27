package one.me.sdk.contextmenu.popup;

import android.annotation.SuppressLint;
import android.graphics.Rect;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.math.MathKt;
import kotlin.properties.ReadOnlyProperty;
import kotlin.reflect.KProperty;
import one.me.sdk.arch.Widget;
import ru.ok.android.externcalls.sdk.api.ApiProtocol;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0001\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0007B\u0013\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\b"}, d2 = {"Lone/me/sdk/contextmenu/popup/ContextMenuPopupWindow;", "Lone/me/sdk/arch/Widget;", "Lmw3;", "Landroid/os/Bundle;", "args", "<init>", "(Landroid/os/Bundle;)V", "vs6", "context-menu_release"}, k = 1, mv = {2, 0, 0})
@SourceDebugExtension({"SMAP\nContextMenuPopupWindow.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ContextMenuPopupWindow.kt\none/me/sdk/contextmenu/popup/ContextMenuPopupWindow\n+ 2 Widget.kt\none/me/sdk/arch/Widget\n+ 3 BundleExt.kt\none/me/sdk/uikit/common/BundleExtKt\n+ 4 WidgetExt.kt\none/me/sdk/arch/ext/WidgetExtKt\n+ 5 Dimensions.kt\nru/ok/tamtam/shared/Dimensions\n+ 6 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 7 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,301:1\n419#2:302\n420#2:303\n420#2:304\n419#2:305\n420#2:306\n420#2:307\n419#2:308\n419#2:309\n16#3:310\n55#4,12:311\n33#4,14:323\n24#5:337\n24#5:338\n24#5:343\n24#5:344\n24#5:345\n24#5:346\n1#6:339\n1755#7,3:340\n1863#7,2:347\n*S KotlinDebug\n*F\n+ 1 ContextMenuPopupWindow.kt\none/me/sdk/contextmenu/popup/ContextMenuPopupWindow\n*L\n48#1:302\n56#1:303\n57#1:304\n59#1:305\n60#1:306\n62#1:307\n64#1:308\n67#1:309\n51#1:310\n76#1:311,12\n86#1:323,14\n125#1:337\n126#1:338\n186#1:343\n187#1:344\n188#1:345\n189#1:346\n165#1:340,3\n193#1:347,2\n*E\n"})
@SuppressLint({"ValidController"})
public final class ContextMenuPopupWindow extends Widget implements mw3 {
    public static final /* synthetic */ KProperty[] X;
    public static final int Y = nhc.context_menu_card_id;
    public final is a;
    public final is b;
    public final is c;
    public final is o;
    public final is v;
    public final is w;
    public final is x;
    public final ReadOnlyProperty y;
    public final is z;

    static {
        Class<ContextMenuPopupWindow> cls = ContextMenuPopupWindow.class;
        X = new KProperty[]{wj6.p(cls, ApiProtocol.PARAM_PAYLOAD, "getPayload()Landroid/os/Bundle;", 0), wj6.p(cls, "highlightPadding", "getHighlightPadding()Landroid/graphics/Rect;", 0), wj6.p(cls, "highlightRadius", "getHighlightRadius()Ljava/lang/Float;", 0), wj6.p(cls, "anchorViewId", "getAnchorViewId()I", 0), wj6.p(cls, "anchorClass", "getAnchorClass()Ljava/lang/Class;", 0), wj6.p(cls, "parentViewId", "getParentViewId()Ljava/lang/Integer;", 0), rae.s(cls, "isCallbackSent", "isCallbackSent()Z", 0), wj6.p(cls, "cardView", "getCardView()Landroid/view/View;", 0), wj6.p(cls, "useDarkTheme", "getUseDarkTheme()Z", 0)};
    }

    public ContextMenuPopupWindow() {
        this((Bundle) null, 1, (DefaultConstructorMarker) null);
    }

    public static final k2b c0(ContextMenuPopupWindow contextMenuPopupWindow) {
        return contextMenuPopupWindow.d0() ? l2b.a : fu4.k.e(contextMenuPopupWindow.getContext()).f();
    }

    public final boolean d0() {
        KProperty kProperty = X[8];
        return ((Boolean) this.z.a(this)).booleanValue();
    }

    public final void dismiss() {
        getRouter().B(this);
    }

    public final yh7 getInsetsConfig() {
        yh7 yh7 = yh7.c;
        return yh7.d;
    }

    public final boolean handleBack() {
        dismiss();
        return true;
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
        if (e9d != null) {
            i9d i9d = new i9d(this, (String) null, (ey3) null, (ey3) null, false, -1);
            a81.t(false, i9d, true, "BottomSheetWidget");
            e9d.G(i9d);
        }
    }

    public final void onAttach(View view) {
        super.onAttach(view);
        zr0 zr0 = new zr0((zx3) this, (Function0) new nm1(21, this));
        if (getRouter() != null) {
            getRouter().a(zr0);
        } else {
            addLifecycleListener(new la(this, zr0, 3));
        }
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return new gx3(this, layoutInflater, layoutInflater.getContext());
    }

    public final void onViewCreated(View view) {
        super.onViewCreated(view);
        int roundToInt = MathKt.roundToInt(((float) 12) * vo4.c().getDisplayMetrics().density);
        int roundToInt2 = MathKt.roundToInt(((float) 8) * vo4.c().getDisplayMetrics().density);
        KProperty[] kPropertyArr = X;
        KProperty kProperty = kPropertyArr[3];
        int intValue = ((Number) this.o.a(this)).intValue();
        if (intValue != -1) {
            KProperty kProperty2 = kPropertyArr[4];
            bs6 bs6 = new bs6((Class) this.v.a(this), intValue);
            bs6.c(this);
            py6 py6 = new py6(bs6);
            KProperty kProperty3 = kPropertyArr[1];
            KProperty kProperty4 = kPropertyArr[2];
            KProperty kProperty5 = kPropertyArr[5];
            py6.a(view, (Rect) this.b.a(this), (Float) this.c.a(this), (Integer) this.w.a(this));
            KProperty kProperty6 = kPropertyArr[7];
            ((ArrayList) bs6.c).add(new eq4(new Rect(), (View) this.y.getValue(this, kProperty6), view, new Rect(), roundToInt, roundToInt2));
        }
        float f = getArgs().getFloat("x", -1.0f);
        float f2 = getArgs().getFloat("y", -1.0f);
        View findViewById = view.findViewById(Y);
        if (f > c44.DEFAULT_ASPECT_RATIO && f2 > c44.DEFAULT_ASPECT_RATIO) {
            findViewById.addOnLayoutChangeListener(new yrb(findViewById, f, f2));
        }
    }

    public ContextMenuPopupWindow(Bundle bundle) {
        super(bundle, 0, 2, (DefaultConstructorMarker) null);
        this.a = new is(Bundle.class, (Object) null, ApiProtocol.PARAM_PAYLOAD);
        this.b = new is(Rect.class, "highlight_padding");
        this.c = new is(Float.class, "highlight_radius");
        Class<Integer> cls = Integer.class;
        this.o = new is(cls, -1, "anchor_id");
        this.v = new is(Class.class, "anchor_class");
        this.w = new is(cls, "parent_id");
        Boolean bool = Boolean.FALSE;
        Class<Boolean> cls2 = Boolean.class;
        this.x = new is(cls2, bool, "callback_sent");
        this.y = viewBinding(Y);
        this.z = new is(cls2, bool, "dark_theme");
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ContextMenuPopupWindow(Bundle bundle, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : bundle);
    }
}
