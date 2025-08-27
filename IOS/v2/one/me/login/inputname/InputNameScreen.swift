package one.me.login.inputname;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.text.InputFilter;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.ListIterator;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.math.MathKt;
import kotlin.properties.ReadOnlyProperty;
import kotlin.reflect.KProperty;
import one.me.sdk.arch.Widget;
import one.me.sdk.bottomsheet.BottomSheetWidget;
import one.me.sdk.bottomsheet.ConfirmationBottomSheet;
import ru.ok.android.externcalls.sdk.api.ApiProtocol;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004B\u000f\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bB!\b\u0016\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\u000b\u001a\u00020\t\u0012\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u0007\u0010\u000e¨\u0006\u000f"}, d2 = {"Lone/me/login/inputname/InputNameScreen;", "Lone/me/sdk/arch/Widget;", "", "Lkcb;", "Lqg3;", "Landroid/os/Bundle;", "args", "<init>", "(Landroid/os/Bundle;)V", "", "token", "phone", "Lytb;", "presetAvatars", "(Ljava/lang/String;Ljava/lang/String;Lytb;)V", "login_playGoogleRelease"}, k = 1, mv = {2, 0, 0})
@SourceDebugExtension({"SMAP\nInputNameScreen.kt\nKotlin\n*S Kotlin\n*F\n+ 1 InputNameScreen.kt\none/me/login/inputname/InputNameScreen\n+ 2 Widget.kt\none/me/sdk/arch/Widget\n+ 3 LazyExt.kt\none/me/sdk/kotlintools/delegates/LazyExtKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 5 ContextExt.kt\none/me/sdk/arch/ext/ContextExtKt\n+ 6 Dimensions.kt\nru/ok/tamtam/shared/Dimensions\n+ 7 Transform.kt\nkotlinx/coroutines/flow/FlowKt__TransformKt\n+ 8 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt\n+ 9 SafeCollector.common.kt\nkotlinx/coroutines/flow/internal/SafeCollector_commonKt\n+ 10 ConstraintSetExt.kt\none/me/sdk/uikit/common/ConstraintSetExtKt\n+ 11 ConstraintSetExt.kt\none/me/sdk/uikit/common/ConstraintSetBuilder\n+ 12 BottomSheetWidget.kt\none/me/sdk/bottomsheet/BottomSheetWidget$Companion\n+ 13 WidgetExt.kt\none/me/sdk/arch/ext/WidgetExtKt\n*L\n1#1,437:1\n420#2:438\n420#2:439\n255#2,9:441\n235#2,10:450\n419#2:460\n419#2:461\n410#2,8:475\n410#2,8:483\n5#3:440\n1#4:462\n17#5:463\n17#5:464\n17#5:466\n17#5:468\n24#6:465\n24#6:467\n24#6:495\n24#6:496\n24#6:497\n24#6:500\n24#6:501\n24#6:502\n24#6:505\n24#6:506\n24#6:507\n24#6:510\n24#6:511\n24#6:512\n24#6:515\n24#6:516\n24#6:517\n32#7:469\n17#7:470\n19#7:474\n46#8:471\n51#8:473\n105#9:472\n20#10:491\n21#10:519\n186#11,2:492\n186#11:494\n187#11:498\n186#11:499\n187#11:503\n186#11:504\n187#11:508\n186#11:509\n187#11:513\n186#11:514\n187#11:518\n135#12,3:520\n138#12,8:537\n33#13,14:523\n*S KotlinDebug\n*F\n+ 1 InputNameScreen.kt\none/me/login/inputname/InputNameScreen\n*L\n72#1:438\n73#1:439\n94#1:441,9\n98#1:450,10\n110#1:460\n111#1:461\n266#1:475,8\n278#1:483,8\n91#1:440\n133#1:463\n144#1:464\n151#1:466\n165#1:468\n150#1:465\n164#1:467\n362#1:495\n363#1:496\n364#1:497\n368#1:500\n369#1:501\n370#1:502\n374#1:505\n375#1:506\n376#1:507\n380#1:510\n381#1:511\n382#1:512\n386#1:515\n387#1:516\n388#1:517\n250#1:469\n250#1:470\n250#1:474\n250#1:471\n250#1:473\n250#1:472\n354#1:491\n354#1:519\n355#1:492,2\n361#1:494\n361#1:498\n367#1:499\n367#1:503\n373#1:504\n373#1:508\n379#1:509\n379#1:513\n385#1:514\n385#1:518\n420#1:520,3\n420#1:537,8\n420#1:523,14\n*E\n"})
@SuppressLint({"ValidController"})
public final class InputNameScreen extends Widget implements kcb, qg3 {
    public static final /* synthetic */ KProperty[] z0;
    public final Lazy X;
    public final Lazy Y;
    public final ReadOnlyProperty Z;
    public final /* synthetic */ bk3 a;
    public final is b;
    public final is c;
    public final w28 o;
    public final yh7 v;
    public final ReadOnlyProperty v0;
    public final Lazy w;
    public final ReadOnlyProperty w0;
    public final Lazy x;
    public final is x0;
    public final Lazy y;
    public final is y0;
    public final Lazy z;

    static {
        Class<InputNameScreen> cls = InputNameScreen.class;
        z0 = new KProperty[]{wj6.p(cls, ApiProtocol.KEY_TOKEN, "getToken()Ljava/lang/String;", 0), wj6.p(cls, "phone", "getPhone()Ljava/lang/String;", 0), wj6.p(cls, "nameInput", "getNameInput()Lone/me/sdk/uikit/common/views/OneMeTextInput;", 0), wj6.p(cls, "surnameInput", "getSurnameInput()Lone/me/sdk/uikit/common/views/OneMeTextInput;", 0), wj6.p(cls, "buttonsContainer", "getButtonsContainer()Lone/me/login/inputname/AnimatedOneMeButton;", 0), rae.s(cls, "nameText", "getNameText()Ljava/lang/String;", 0), rae.s(cls, "surnameText", "getSurnameText()Ljava/lang/String;", 0)};
    }

    /* JADX WARNING: type inference failed for: r5v1, types: [java.lang.Object, bk3] */
    public InputNameScreen(Bundle bundle) {
        super(bundle, 0, 2, (DefaultConstructorMarker) null);
        this.a = new Object();
        Class<String> cls = String.class;
        this.b = new is(cls, "screen:input_name:token");
        this.c = new is(cls, "screen:input_name:phone");
        this.o = new w28(new a46(26), (Function0) null, 6);
        this.v = yh7.d;
        n88 n88 = n88.a;
        this.w = n88.getAccessor().h(edb.class);
        this.x = n88.getAccessor().h(x23.class);
        this.y = LazyKt.lazy(LazyThreadSafetyMode.NONE, new qg7(this, 0));
        this.z = n88.getAccessor().h(r80.class);
        this.X = m1571getSharedViewModelcp94BC8("LoginScope", k98.class, (Function0) null);
        this.Y = createViewModelLazy(yg7.class, new i76(3, new qg7(this, 1)));
        this.Z = viewBinding(xgc.oneme_login_input_name);
        this.v0 = viewBinding(xgc.oneme_login_input_surname);
        this.w0 = viewBinding(xgc.oneme_login_input_name_btn_container);
        this.x0 = new is(cls, "", "screen:input_name:name");
        this.y0 = new is(cls, "", "screen:input_name:surname");
    }

    public final void O(boolean z2) {
        xme xme = ((k98) this.X.getValue()).b;
        Boolean bool = Boolean.FALSE;
        xme.getClass();
        xme.m((Object) null, bool);
    }

    public final vf c0() {
        return (vf) this.w0.getValue(this, z0[4]);
    }

    public final h2b d0() {
        return (h2b) this.Z.getValue(this, z0[2]);
    }

    public final h2b e0() {
        return (h2b) this.v0.getValue(this, z0[3]);
    }

    public final String f0() {
        KProperty kProperty = z0[6];
        return (String) this.y0.a(this);
    }

    public final void g(int i, Bundle bundle) {
        Object obj;
        zx3 zx3;
        if (i == xgc.oneme_login_input_name_confirmation_return) {
            aj7 aj7 = (aj7) this.y.getValue();
            aj7.getClass();
            Bundle bundle2 = new Bundle();
            bundle2.putString("screen:input_phone:phone", "");
            Unit unit = Unit.INSTANCE;
            e9d e9d = aj7.a;
            ArrayList e = e9d.e();
            HashSet hashSet = new HashSet();
            for (i9d i9d : CollectionsKt.asReversedMutable(e9d.e())) {
                if (Intrinsics.areEqual((Object) i9d.b, (Object) "InputPhoneScreen")) {
                    break;
                }
                hashSet.add(i9d);
            }
            ListIterator listIterator = e.listIterator(e.size());
            while (true) {
                if (!listIterator.hasPrevious()) {
                    obj = null;
                    break;
                }
                obj = listIterator.previous();
                if (Intrinsics.areEqual((Object) ((i9d) obj).b, (Object) "InputPhoneScreen")) {
                    break;
                }
            }
            i9d i9d2 = (i9d) obj;
            if (i9d2 != null && (zx3 = i9d2.a) != null) {
                zx3.getArgs().clear();
                zx3.getArgs().putAll(bundle2);
                e.removeAll(hashSet);
                e9d.P(e, (ey3) null);
            }
        }
    }

    public final yg7 g0() {
        return (yg7) this.Y.getValue();
    }

    public final yh7 getInsetsConfig() {
        return this.v;
    }

    public final pgd getScreenDelegate() {
        return this.o;
    }

    public final void h0() {
        KProperty[] kPropertyArr = BottomSheetWidget.v0;
        e9d e9d = null;
        ng3 a2 = b0h.a(new igf(nlc.oneme_login_input_name_confirmation_title), (Bundle) null, 6);
        int i = nlc.oneme_login_input_name_confirmation_description;
        KProperty kProperty = z0[1];
        a2.f(new kgf(i, ArraysKt.toList((T[]) new Object[]{(String) this.c.a(this)})));
        a2.d(xgc.oneme_login_input_name_confirmation_cancel, new igf(nlc.oneme_login_input_name_confirmation_cancel));
        a2.b(xgc.oneme_login_input_name_confirmation_return, new igf(nlc.oneme_login_input_name_confirmation_return));
        ConfirmationBottomSheet e = a2.e();
        e.setTargetController(this);
        zx3 zx3 = this;
        while (zx3.getParentController() != null) {
            zx3 = zx3.getParentController();
        }
        l9d l9d = zx3 instanceof l9d ? (l9d) zx3 : null;
        if (l9d != null) {
            e9d = l9d.K();
        }
        e.p0(this);
        if (e9d != null) {
            i9d i9d = new i9d(e, (String) null, (ey3) null, (ey3) null, false, -1);
            a81.t(false, i9d, true, "BottomSheetWidget");
            e9d.G(i9d);
        }
    }

    /* JADX WARNING: type inference failed for: r11v4, types: [vf, android.widget.FrameLayout, android.view.View] */
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        ConstraintLayout constraintLayout = new ConstraintLayout(getContext());
        constraintLayout.setLayoutParams(new fj3(-1, -1));
        h3b d = o54.d(constraintLayout.getContext(), (AttributeSet) null);
        d.setId(xgc.oneme_login_input_name_toolbar);
        d.setForm(z2b.a);
        d.setLeftActions(new p2b(new rg7(this, 0)));
        constraintLayout.addView(d);
        TextView textView = new TextView(constraintLayout.getContext());
        textView.setId(xgc.oneme_login_input_name_title);
        textView.setLayoutParams(new fj3(-1, -2));
        textView.setGravity(17);
        puf.c.b(textView, uy4.b);
        b0h.H(textView, new ra(3, (Continuation) null, 12));
        textView.setText(q8.p(nlc.oneme_login_input_name_title, getContext()));
        constraintLayout.addView(textView);
        TextView textView2 = new TextView(constraintLayout.getContext());
        textView2.setId(xgc.oneme_login_input_name_description);
        textView2.setLayoutParams(new fj3(-1, -2));
        textView2.setGravity(17);
        puf.l.b(textView2, uy4.b);
        b0h.H(textView2, new ra(3, (Continuation) null, 13));
        textView2.setText(q8.p(nlc.oneme_login_input_name_description, getContext()));
        constraintLayout.addView(textView2);
        h2b h2b = new h2b(constraintLayout.getContext());
        h2b.setId(xgc.oneme_login_input_name);
        h2b.setLayoutParams(new fj3(-1, -2));
        float f = (float) 76;
        h2b.setMinimumHeight(MathKt.roundToInt(vo4.c().getDisplayMetrics().density * f));
        h2b.setHint(q8.p(nlc.oneme_login_input_name_hint_name, getContext()));
        KProperty kProperty = z0[5];
        h2b.setText((String) this.x0.a(this));
        h2b.setFilters(new InputFilter[]{new InputFilter.LengthFilter(60)});
        int i = jya.a;
        h2b.setBackgroundColorAttr(Integer.valueOf(i));
        b0h.H(h2b, new sq2(3, (Continuation) null, 1));
        constraintLayout.addView(h2b);
        h2b h2b2 = new h2b(constraintLayout.getContext());
        h2b2.setId(xgc.oneme_login_input_surname);
        h2b2.setLayoutParams(new fj3(-1, -2));
        h2b2.setBackgroundColorAttr(Integer.valueOf(i));
        h2b2.setMinimumHeight(MathKt.roundToInt(f * vo4.c().getDisplayMetrics().density));
        h2b2.setHint(q8.p(nlc.oneme_login_input_name_hint_surname, getContext()));
        h2b2.setText(f0());
        h2b2.setFilters(new InputFilter[]{new InputFilter.LengthFilter(60)});
        b0h.H(h2b2, new sq2(3, (Continuation) null, 2));
        constraintLayout.addView(h2b2);
        ? frameLayout = new FrameLayout(constraintLayout.getContext());
        frameLayout.setClipToOutline(true);
        frameLayout.setId(xgc.oneme_login_input_name_btn_container);
        frameLayout.setLayoutParams(new fj3(-1, -2));
        frameLayout.setupDisabledButton(new of3(28));
        frameLayout.setupActiveButton(new of3(29));
        constraintLayout.addView(frameLayout);
        pj3 h = ct.h(constraintLayout);
        int i2 = xgc.oneme_login_input_name_toolbar;
        h.e(i2, 6, 0, 6);
        h.e(i2, 3, 0, 3);
        h.e(i2, 7, 0, 7);
        int i3 = xgc.oneme_login_input_name_title;
        h.e(i3, 6, 0, 6);
        float f2 = (float) 12;
        tr1.u(f2, vo4.c().getDisplayMetrics().density, new ila(h, 6, i3, 4));
        h.e(i3, 3, xgc.oneme_login_input_name_toolbar, 4);
        float f3 = (float) 24;
        tr1.u(f3, vo4.c().getDisplayMetrics().density, new ila(h, 3, i3, 4));
        h.e(i3, 7, 0, 7);
        tr1.u(f2, vo4.c().getDisplayMetrics().density, new ila(h, 7, i3, 4));
        int i4 = xgc.oneme_login_input_name_description;
        h.e(i4, 6, 0, 6);
        tr1.u(f2, vo4.c().getDisplayMetrics().density, new ila(h, 6, i4, 4));
        h.e(i4, 3, xgc.oneme_login_input_name_title, 4);
        tr1.u(f2, vo4.c().getDisplayMetrics().density, new ila(h, 3, i4, 4));
        h.e(i4, 7, 0, 7);
        tr1.u(f2, vo4.c().getDisplayMetrics().density, new ila(h, 7, i4, 4));
        int i5 = xgc.oneme_login_input_name;
        h.e(i5, 6, 0, 6);
        tr1.u(f2, vo4.c().getDisplayMetrics().density, new ila(h, 6, i5, 4));
        h.e(i5, 3, xgc.oneme_login_input_name_description, 4);
        tr1.u(f3, vo4.c().getDisplayMetrics().density, new ila(h, 3, i5, 4));
        h.e(i5, 7, 0, 7);
        tr1.u(f2, vo4.c().getDisplayMetrics().density, new ila(h, 7, i5, 4));
        int i6 = xgc.oneme_login_input_surname;
        h.e(i6, 6, 0, 6);
        tr1.u(f2, vo4.c().getDisplayMetrics().density, new ila(h, 6, i6, 4));
        h.e(i6, 3, xgc.oneme_login_input_name, 4);
        tr1.u((float) 8, vo4.c().getDisplayMetrics().density, new ila(h, 3, i6, 4));
        h.e(i6, 7, 0, 7);
        tr1.u(f2, vo4.c().getDisplayMetrics().density, new ila(h, 7, i6, 4));
        int i7 = xgc.oneme_login_input_name_btn_container;
        h.e(i7, 6, 0, 6);
        tr1.u(f2, vo4.c().getDisplayMetrics().density, new ila(h, 6, i7, 4));
        h.e(i7, 4, 0, 4);
        tr1.u(f2, vo4.c().getDisplayMetrics().density, new ila(h, 4, i7, 4));
        h.e(i7, 7, 0, 7);
        new ila(h, 7, i7, 4).e(MathKt.roundToInt(f2 * vo4.c().getDisplayMetrics().density));
        h.a(constraintLayout);
        return constraintLayout;
    }

    public final void onDestroyView(View view) {
        super.onDestroyView(view);
        e0().a.setOnFocusChangeListener((View.OnFocusChangeListener) null);
    }

    public final void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        if (i == 156 && getView() != null) {
            yg7 g0 = g0();
            xag.h(g0.y, k8e.a);
        }
    }

    public final void onViewCreated(View view) {
        phf phf = view instanceof phf ? (phf) view : null;
        if (phf != null) {
            phf.onThemeChanged(fu4.k.f(view));
        }
        c0().setActiveButtonClickListener(new qg7(this, 2));
        vf c0 = c0();
        KProperty kProperty = z0[5];
        c0.setEnabled(((String) this.x0.a(this)).length() > 0);
        d0().a.addTextChangedListener(new u2(12, new rg7(this, 1)));
        e0().a.addTextChangedListener(new u2(12, new rg7(this, 2)));
        g0().j(f0(), e0().a.isFocused());
        e0().a.setOnFocusChangeListener(new qb9(1, new rg7(this, 3)));
        fma h = getRouter().h();
        if (h != null) {
            h.a(this.lifecycleOwner, new wx3(6, (Object) this));
        }
        g12 g12 = g0().z;
        iu7 iu7 = iu7.o;
        bs0.K(new ps5(ct.k(g12, getViewLifecycleOwner().getLifecycle(), iu7), new vg7((Continuation) null, this), 5), getViewLifecycleScope());
        bs0.K(new ps5(new k26(ct.k(g0().w, getViewLifecycleOwner().getLifecycle(), iu7), 16), new ug7((Continuation) null, this), 5), getViewLifecycleScope());
        bs0.K(new ps5(ct.k(((k98) this.X.getValue()).c, getViewLifecycleOwner().getLifecycle(), iu7), new sg7((Continuation) null, this), 5), getViewLifecycleScope());
    }

    public InputNameScreen(String str, String str2, ytb ytb) {
        this(o54.f(TuplesKt.to("screen:input_name:token", str), TuplesKt.to("screen:input_name:phone", str2), TuplesKt.to("screen:input_name:avatars", ytb)));
    }
}
