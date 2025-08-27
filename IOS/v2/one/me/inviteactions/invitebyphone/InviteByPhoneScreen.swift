package one.me.inviteactions.invitebyphone;

import android.os.Bundle;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatTextView;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.math.MathKt;
import kotlin.properties.ReadOnlyProperty;
import kotlin.reflect.KProperty;
import one.me.sdk.arch.Widget;
import one.me.sdk.uikit.common.button.OneMeButton;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004B\u0007¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lone/me/inviteactions/invitebyphone/InviteByPhoneScreen;", "Lone/me/sdk/arch/Widget;", "Ly14;", "", "Lqg3;", "<init>", "()V", "invite-actions_release"}, k = 1, mv = {2, 0, 0})
@SourceDebugExtension({"SMAP\nInviteByPhoneScreen.kt\nKotlin\n*S Kotlin\n*F\n+ 1 InviteByPhoneScreen.kt\none/me/inviteactions/invitebyphone/InviteByPhoneScreen\n+ 2 Widget.kt\none/me/sdk/arch/Widget\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 Dimensions.kt\nru/ok/tamtam/shared/Dimensions\n+ 5 View.kt\nandroidx/core/view/ViewKt\n+ 6 BottomSheetWidget.kt\none/me/sdk/bottomsheet/BottomSheetWidget$Companion\n+ 7 WidgetExt.kt\none/me/sdk/arch/ext/WidgetExtKt\n*L\n1#1,359:1\n235#2,10:360\n419#2:370\n419#2:371\n410#2,8:384\n1#3:372\n24#4:373\n24#4:374\n24#4:375\n24#4:376\n24#4:381\n188#5,3:377\n254#5:380\n256#5,2:382\n135#6,3:392\n138#6,8:409\n33#7,14:395\n*S KotlinDebug\n*F\n+ 1 InviteByPhoneScreen.kt\none/me/inviteactions/invitebyphone/InviteByPhoneScreen\n*L\n74#1:360,10\n78#1:370\n91#1:371\n282#1:384,8\n140#1:373\n153#1:374\n164#1:375\n190#1:376\n267#1:381\n247#1:377,3\n259#1:380\n278#1:382,2\n178#1:392,3\n178#1:409,8\n178#1:395,14\n*E\n"})
public final class InviteByPhoneScreen extends Widget implements y14, qg3 {
    public static final /* synthetic */ KProperty[] z0;
    public final ReadOnlyProperty X = viewBinding(wua.j);
    public AppCompatTextView Y;
    public final Lazy Z = LazyKt.lazy(new ck7(3));
    public final /* synthetic */ bk3 a = new Object();
    public final w28 b = new w28(new ck7(1), (Function0) null, 6);
    public final yh7 c = yh7.d;
    public final Lazy o = createViewModelLazy(xk7.class, new i76(5, new ck7(2)));
    public final is v = new is(String.class, "", "screen:input_phone:phone");
    public final Lazy v0 = bk7.a.getAccessor().h(aeb.class);
    public final ReadOnlyProperty w = viewBinding(wua.i);
    public ij7 w0;
    public final ReadOnlyProperty x = viewBinding(wua.g);
    public final is x0 = new is(ysa.class, xsa.b, "screen:input_phone:country_model");
    public final ReadOnlyProperty y = viewBinding(wua.f);
    public final ne1 y0 = new ne1(this, 6);
    public final ReadOnlyProperty z = viewBinding(wua.h);

    static {
        Class<InviteByPhoneScreen> cls = InviteByPhoneScreen.class;
        z0 = new KProperty[]{rae.s(cls, "phone", "getPhone()Ljava/lang/String;", 0), wj6.p(cls, "titleView", "getTitleView()Landroid/widget/TextView;", 0), wj6.p(cls, "descriptionView", "getDescriptionView()Landroid/widget/TextView;", 0), wj6.p(cls, "continueButton", "getContinueButton()Lone/me/sdk/uikit/common/button/OneMeButton;", 0), wj6.p(cls, "phoneNumberInput", "getPhoneNumberInput()Lone/me/sdk/phoneutils/OneMePhoneNumberInput;", 0), wj6.p(cls, "toolbar", "getToolbar()Lone/me/sdk/uikit/common/toolbar/OneMeToolbar;", 0), rae.s(cls, "selectedCountry", "getSelectedCountry()Lone/me/sdk/phoneutils/OneMeCountryModel;", 0)};
    }

    /* JADX WARNING: type inference failed for: r1v1, types: [java.lang.Object, bk3] */
    public InviteByPhoneScreen() {
        super((Bundle) null, 0, 3, (DefaultConstructorMarker) null);
    }

    /* JADX WARNING: type inference failed for: r2v8, types: [android.view.View] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void c0(one.me.inviteactions.invitebyphone.InviteByPhoneScreen r8, java.lang.CharSequence r9) {
        /*
            androidx.appcompat.widget.AppCompatTextView r0 = r8.Y
            r1 = 0
            if (r0 != 0) goto L_0x008b
            if (r9 == 0) goto L_0x008b
            androidx.appcompat.widget.AppCompatTextView r0 = new androidx.appcompat.widget.AppCompatTextView
            android.content.Context r2 = r8.getContext()
            r3 = 0
            r0.<init>(r2, r3)
            ogf r2 = defpackage.puf.o
            r2.b(r0, defpackage.uy4.b)
            js9 r2 = defpackage.fu4.k
            android.content.Context r4 = r0.getContext()
            fu4 r2 = r2.e(r4)
            k2b r2 = r2.f()
            xef r2 = r2.getText()
            int r2 = r2.b
            r0.setTextColor(r2)
            fj3 r2 = new fj3
            r4 = -2
            r2.<init>(r1, r4)
            r4 = 24
            float r4 = (float) r4
            android.content.res.Resources r5 = defpackage.vo4.c()
            android.util.DisplayMetrics r5 = r5.getDisplayMetrics()
            float r5 = r5.density
            float r5 = r5 * r4
            int r5 = kotlin.math.MathKt.roundToInt((float) r5)
            r6 = 4
            float r6 = (float) r6
            android.content.res.Resources r7 = defpackage.vo4.c()
            android.util.DisplayMetrics r7 = r7.getDisplayMetrics()
            float r7 = r7.density
            float r6 = r6 * r7
            int r6 = kotlin.math.MathKt.roundToInt((float) r6)
            android.content.res.Resources r7 = defpackage.vo4.c()
            android.util.DisplayMetrics r7 = r7.getDisplayMetrics()
            float r7 = r7.density
            float r4 = r4 * r7
            int r4 = kotlin.math.MathKt.roundToInt((float) r4)
            r2.setMargins(r5, r6, r4, r1)
            int r4 = defpackage.wua.h
            r2.j = r4
            r2.t = r1
            r2.v = r1
            r4 = 8388611(0x800003, float:1.1754948E-38)
            r0.setGravity(r4)
            r0.setLayoutParams(r2)
            android.view.View r2 = r8.getView()
            boolean r4 = r2 instanceof android.view.ViewGroup
            if (r4 == 0) goto L_0x0084
            r3 = r2
            android.view.ViewGroup r3 = (android.view.ViewGroup) r3
        L_0x0084:
            if (r3 == 0) goto L_0x0089
            r3.addView(r0)
        L_0x0089:
            r8.Y = r0
        L_0x008b:
            androidx.appcompat.widget.AppCompatTextView r0 = r8.Y
            if (r0 == 0) goto L_0x0092
            r0.setText(r9)
        L_0x0092:
            androidx.appcompat.widget.AppCompatTextView r8 = r8.Y
            if (r8 == 0) goto L_0x00ac
            r0 = 1
            if (r9 == 0) goto L_0x00a2
            int r9 = r9.length()
            if (r9 != 0) goto L_0x00a0
            goto L_0x00a2
        L_0x00a0:
            r9 = r1
            goto L_0x00a3
        L_0x00a2:
            r9 = r0
        L_0x00a3:
            r9 = r9 ^ r0
            if (r9 == 0) goto L_0x00a7
            goto L_0x00a9
        L_0x00a7:
            r1 = 8
        L_0x00a9:
            r8.setVisibility(r1)
        L_0x00ac:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: one.me.inviteactions.invitebyphone.InviteByPhoneScreen.c0(one.me.inviteactions.invitebyphone.InviteByPhoneScreen, java.lang.CharSequence):void");
    }

    public final void D(ysa ysa) {
        f0().X.setValue(ysa);
    }

    public final OneMeButton d0() {
        return (OneMeButton) this.y.getValue(this, z0[3]);
    }

    public final zwa e0() {
        return (zwa) this.z.getValue(this, z0[4]);
    }

    public final xk7 f0() {
        return (xk7) this.o.getValue();
    }

    public final void g(int i, Bundle bundle) {
        if (i == hya.d) {
            getRouter().C();
        } else if (i == wua.b) {
            ((oo3) this.Z.getValue()).a(getContext());
        }
    }

    public final yh7 getInsetsConfig() {
        return this.c;
    }

    public final pgd getScreenDelegate() {
        return this.b;
    }

    public final void onAttach(View view) {
        super.onAttach(view);
        e0().postDelayed(new tj7(1, this), 200);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        nk7 nk7 = new nk7(this, getContext());
        h3b d = o54.d(nk7.getContext(), (AttributeSet) null);
        int i = wua.j;
        d.setId(i);
        fj3 fj3 = new fj3(-1, -2);
        fj3.i = 0;
        fj3.t = 0;
        fj3.v = 0;
        d.setLayoutParams(fj3);
        d.setForm(z2b.a);
        d.setLeftActions(new p2b(new rx2(27, this)));
        nk7.addView(d);
        AppCompatTextView appCompatTextView = new AppCompatTextView(nk7.getContext(), (AttributeSet) null);
        int i2 = wua.i;
        appCompatTextView.setId(i2);
        puf.c.b(appCompatTextView, uy4.b);
        appCompatTextView.setText(xua.k);
        fj3 fj32 = new fj3(0, -2);
        float f = (float) 28;
        float f2 = (float) 24;
        fj32.setMargins(MathKt.roundToInt(vo4.c().getDisplayMetrics().density * f), MathKt.roundToInt(vo4.c().getDisplayMetrics().density * f2), MathKt.roundToInt(vo4.c().getDisplayMetrics().density * f), 0);
        fj32.j = i;
        fj32.t = 0;
        fj32.v = 0;
        appCompatTextView.setGravity(17);
        appCompatTextView.setLayoutParams(fj32);
        nk7.addView(appCompatTextView);
        AppCompatTextView appCompatTextView2 = new AppCompatTextView(nk7.getContext(), (AttributeSet) null);
        int i3 = wua.g;
        appCompatTextView2.setId(i3);
        puf.l.b(appCompatTextView2, uy4.b);
        appCompatTextView2.setText(xua.i);
        fj3 fj33 = new fj3(0, -2);
        float f3 = (float) 12;
        fj33.setMargins(MathKt.roundToInt(vo4.c().getDisplayMetrics().density * f), MathKt.roundToInt(vo4.c().getDisplayMetrics().density * f3), MathKt.roundToInt(f * vo4.c().getDisplayMetrics().density), 0);
        fj33.j = i2;
        fj33.t = 0;
        fj33.v = 0;
        appCompatTextView2.setGravity(17);
        appCompatTextView2.setLayoutParams(fj33);
        nk7.addView(appCompatTextView2);
        zwa zwa = new zwa(nk7.getContext());
        zwa.setId(wua.h);
        fj3 fj34 = new fj3(0, -2);
        fj34.setMargins(MathKt.roundToInt(vo4.c().getDisplayMetrics().density * f3), MathKt.roundToInt(f2 * vo4.c().getDisplayMetrics().density), MathKt.roundToInt(vo4.c().getDisplayMetrics().density * f3), 0);
        fj34.j = i3;
        fj34.t = 0;
        fj34.v = 0;
        zwa.setLayoutParams(fj34);
        zwa.setPhoneFormatterProvider(new ib4(26, this, zwa));
        zwa.setOnCountryViewClickListener(new u75(26, this));
        nk7.addView(zwa);
        OneMeButton oneMeButton = new OneMeButton(nk7.getContext(), (AttributeSet) null);
        oneMeButton.setId(wua.f);
        oneMeButton.setMode(zpa.a);
        oneMeButton.setSize(aqa.c);
        oneMeButton.setAppearance(xpa.o);
        fj3 fj35 = new fj3(0, -2);
        fj35.setMargins(MathKt.roundToInt(vo4.c().getDisplayMetrics().density * f3), 0, MathKt.roundToInt(((float) 16) * vo4.c().getDisplayMetrics().density), MathKt.roundToInt(f3 * vo4.c().getDisplayMetrics().density));
        fj35.l = 0;
        fj35.t = 0;
        fj35.v = 0;
        oneMeButton.setLayoutParams(fj35);
        oneMeButton.setText(xua.h);
        nk7.addView(oneMeButton);
        return nk7;
    }

    public final void onDestroyView(View view) {
        super.onDestroyView(view);
        this.Y = null;
        zwa e0 = e0();
        e0.z.removeTextChangedListener(this.w0);
        this.w0 = null;
    }

    public final void onDetach(View view) {
        super.onDetach(view);
        kr7.C(view);
    }

    public final void onViewCreated(View view) {
        super.onViewCreated(view);
        phf phf = view instanceof phf ? (phf) view : null;
        if (phf != null) {
            phf.onThemeChanged(fu4.k.f(view));
        }
        zwa e0 = e0();
        KProperty[] kPropertyArr = z0;
        boolean z2 = false;
        KProperty kProperty = kPropertyArr[0];
        is isVar = this.v;
        e0.setText((String) isVar.a(this));
        OneMeButton d0 = d0();
        KProperty kProperty2 = kPropertyArr[0];
        if (((String) isVar.a(this)).length() > 0) {
            z2 = true;
        }
        d0.setEnabled(z2);
        ct.G(d0(), 300, new xu3(19, (Object) this));
        KProperty kProperty3 = kPropertyArr[6];
        D((ysa) this.x0.a(this));
        e0().z.addTextChangedListener(this.y0);
        s85 s85 = f0().x;
        ju7 lifecycle = this.lifecycleOwner.getLifecycle();
        iu7 iu7 = iu7.o;
        bs0.K(new ps5(ct.k(s85, lifecycle, iu7), new mk7((Continuation) null, this), 5), getLifecycleScope());
        bs0.K(new ps5(ct.k(f0().z, this.lifecycleOwner.getLifecycle(), iu7), new ok7((Continuation) null, this), 5), getViewLifecycleScope());
        bs0.K(new ps5(ct.k(f0().Y, getViewLifecycleOwner().getLifecycle(), iu7), new lk7((Continuation) null, this), 5), getViewLifecycleScope());
    }
}
