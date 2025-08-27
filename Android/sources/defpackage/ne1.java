package defpackage;

import android.text.Editable;
import android.text.TextWatcher;
import one.me.sdk.arch.Widget;

/* renamed from: ne1  reason: default package */
public final class ne1 implements TextWatcher {
    public final /* synthetic */ int a;
    public Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ ne1(int i, Object obj, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    private final void a(Editable editable) {
    }

    private final void b(Editable editable) {
    }

    private final void c(Editable editable) {
    }

    private final void d(Editable editable) {
    }

    private final void e(Editable editable) {
    }

    private final void f(int i, int i2, int i3, CharSequence charSequence) {
    }

    private final void g(int i, int i2, int i3, CharSequence charSequence) {
    }

    private final void h(int i, int i2, int i3, CharSequence charSequence) {
    }

    private final void i(int i, int i2, int i3, CharSequence charSequence) {
    }

    private final void j(int i, int i2, int i3, CharSequence charSequence) {
    }

    private final void k(int i, int i2, int i3, CharSequence charSequence) {
    }

    private final void l(int i, int i2, int i3, CharSequence charSequence) {
    }

    private final void m(int i, int i2, int i3, CharSequence charSequence) {
    }

    private final void n(int i, int i2, int i3, CharSequence charSequence) {
    }

    private final void o(int i, int i2, int i3, CharSequence charSequence) {
    }

    private final void p(int i, int i2, int i3, CharSequence charSequence) {
    }

    private final void q(int i, int i2, int i3, CharSequence charSequence) {
    }

    private final void r(int i, int i2, int i3, CharSequence charSequence) {
    }

    private final void s(int i, int i2, int i3, CharSequence charSequence) {
    }

    private final void t(int i, int i2, int i3, CharSequence charSequence) {
    }

    private final void u(int i, int i2, int i3, CharSequence charSequence) {
    }

    /* JADX WARNING: Removed duplicated region for block: B:29:0x00cb  */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x0101  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void afterTextChanged(android.text.Editable r8) {
        /*
            r7 = this;
            r0 = 1
            r1 = 0
            java.lang.Object r2 = r7.c
            int r3 = r7.a
            switch(r3) {
                case 0: goto L_0x0106;
                case 1: goto L_0x006f;
                case 2: goto L_0x004f;
                case 3: goto L_0x002d;
                case 4: goto L_0x002c;
                case 5: goto L_0x002c;
                case 6: goto L_0x002c;
                case 7: goto L_0x002c;
                case 8: goto L_0x001f;
                case 9: goto L_0x001e;
                default: goto L_0x0009;
            }
        L_0x0009:
            java.lang.Object r7 = r7.b
            v7e r7 = (defpackage.v7e) r7
            androidx.appcompat.widget.AppCompatEditText r7 = r7.F0
            boolean r7 = r7.isFocused()
            if (r7 == 0) goto L_0x001e
            java.lang.String r7 = java.lang.String.valueOf(r8)
            kotlin.jvm.functions.Function1 r2 = (kotlin.jvm.functions.Function1) r2
            r2.invoke(r7)
        L_0x001e:
            return
        L_0x001f:
            dc9 r2 = (defpackage.dc9) r2
            java.lang.CharSequence r8 = r2.getText()
            java.lang.Object r7 = r7.b
            kotlin.jvm.functions.Function1 r7 = (kotlin.jvm.functions.Function1) r7
            r7.invoke(r8)
        L_0x002c:
            return
        L_0x002d:
            java.lang.String r0 = java.lang.String.valueOf(r8)
            java.lang.Object r7 = r7.b
            kotlin.jvm.functions.Function1 r7 = (kotlin.jvm.functions.Function1) r7
            r7.invoke(r0)
            lm4 r2 = (defpackage.lm4) r2
            android.widget.TextView r7 = r2.x
            int r0 = r2.getMaxCount()
            if (r8 == 0) goto L_0x0046
            int r1 = r8.length()
        L_0x0046:
            int r0 = r0 - r1
            java.lang.String r8 = java.lang.String.valueOf(r0)
            r7.setText(r8)
            return
        L_0x004f:
            java.lang.String r0 = java.lang.String.valueOf(r8)
            java.lang.Object r7 = r7.b
            kotlin.jvm.functions.Function1 r7 = (kotlin.jvm.functions.Function1) r7
            r7.invoke(r0)
            c54 r2 = (defpackage.c54) r2
            android.widget.TextView r7 = r2.c
            int r0 = r2.a
            if (r8 == 0) goto L_0x0066
            int r1 = r8.length()
        L_0x0066:
            int r0 = r0 - r1
            java.lang.String r8 = java.lang.String.valueOf(r0)
            r7.setText(r8)
            return
        L_0x006f:
            if (r8 == 0) goto L_0x0105
            java.lang.Object r7 = r7.b
            ru.ok.messages.channels.CreateChannelFragment r7 = (ru.ok.messages.channels.CreateChannelFragment) r7
            t24 r3 = r7.D1
            r3.getClass()
            kotlin.reflect.KProperty[] r4 = defpackage.t24.Z
            r5 = 4
            r4 = r4[r5]
            w28 r5 = r3.x
            java.lang.Object r3 = r5.getValue(r3, r4)
            android.widget.ImageView r3 = (android.widget.ImageView) r3
            androidx.appcompat.widget.AppCompatEditText r2 = (androidx.appcompat.widget.AppCompatEditText) r2
            boolean r2 = r2.hasFocus()
            if (r2 == 0) goto L_0x009d
            int r2 = r8.length()
            if (r2 != 0) goto L_0x0097
            r2 = r0
            goto L_0x0098
        L_0x0097:
            r2 = r1
        L_0x0098:
            r2 = r2 ^ r0
            if (r2 == 0) goto L_0x009d
            r2 = r1
            goto L_0x009f
        L_0x009d:
            r2 = 8
        L_0x009f:
            r3.setVisibility(r2)
            ru.ok.messages.channels.CreateChannelViewModel r2 = r7.i3()
            java.lang.String r8 = r8.toString()
            rt6 r3 = r2.B
            kotlin.reflect.KProperty[] r4 = ru.ok.messages.channels.CreateChannelViewModel.G
            r5 = 5
            r4 = r4[r5]
            r3.setValue(r2, r4, r8)
            t24 r7 = r7.D1
            androidx.appcompat.widget.AppCompatEditText r8 = r7.g()
            android.text.Editable r8 = r8.getText()
            java.lang.String r8 = java.lang.String.valueOf(r8)
            int r2 = r8.length()
            int r2 = r2 - r0
            r3 = r1
            r4 = r3
        L_0x00c9:
            if (r3 > r2) goto L_0x00ed
            if (r4 != 0) goto L_0x00cf
            r5 = r3
            goto L_0x00d0
        L_0x00cf:
            r5 = r2
        L_0x00d0:
            char r5 = r8.charAt(r5)
            r6 = 32
            int r5 = kotlin.jvm.internal.Intrinsics.compare((int) r5, (int) r6)
            if (r5 > 0) goto L_0x00de
            r5 = r0
            goto L_0x00df
        L_0x00de:
            r5 = r1
        L_0x00df:
            if (r4 != 0) goto L_0x00e7
            if (r5 != 0) goto L_0x00e5
            r4 = r0
            goto L_0x00c9
        L_0x00e5:
            int r3 = r3 + r0
            goto L_0x00c9
        L_0x00e7:
            if (r5 != 0) goto L_0x00ea
            goto L_0x00ed
        L_0x00ea:
            int r2 = r2 + -1
            goto L_0x00c9
        L_0x00ed:
            int r2 = r2 + r0
            java.lang.CharSequence r8 = r8.subSequence(r3, r2)
            java.lang.String r8 = r8.toString()
            int r8 = r8.length()
            one.me.sdk.uikit.common.button.OneMeButton r7 = r7.f()
            if (r8 <= 0) goto L_0x0101
            goto L_0x0102
        L_0x0101:
            r0 = r1
        L_0x0102:
            r7.setEnabled(r0)
        L_0x0105:
            return
        L_0x0106:
            r0 = 2
            one.me.calls.ui.bottomsheet.opponents.CallOpponentsListWidget r2 = (one.me.calls.ui.bottomsheet.opponents.CallOpponentsListWidget) r2
            r1 = 0
            java.lang.Object r7 = r7.b
            android.widget.EditText r7 = (android.widget.EditText) r7
            if (r8 == 0) goto L_0x0139
            boolean r3 = kotlin.text.StringsKt.isBlank(r8)
            if (r3 == 0) goto L_0x0117
            goto L_0x0139
        L_0x0117:
            android.graphics.drawable.Drawable[] r3 = r7.getCompoundDrawablesRelative()
            r3 = r3[r0]
            kotlin.Lazy r4 = r2.o
            java.lang.Object r4 = r4.getValue()
            android.graphics.drawable.Drawable r4 = (android.graphics.drawable.Drawable) r4
            boolean r3 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r3, (java.lang.Object) r4)
            if (r3 != 0) goto L_0x013e
            kotlin.Lazy r3 = r2.o
            java.lang.Object r3 = r3.getValue()
            android.graphics.drawable.Drawable r3 = (android.graphics.drawable.Drawable) r3
            java.util.ArrayList r4 = defpackage.wgf.a
            r7.setCompoundDrawablesRelativeWithIntrinsicBounds(r1, r1, r3, r1)
            goto L_0x013e
        L_0x0139:
            java.util.ArrayList r3 = defpackage.wgf.a
            r7.setCompoundDrawablesRelativeWithIntrinsicBounds(r1, r1, r1, r1)
        L_0x013e:
            kotlin.reflect.KProperty[] r7 = one.me.calls.ui.bottomsheet.opponents.CallOpponentsListWidget.B0
            he1 r7 = r2.f0()
            if (r8 == 0) goto L_0x014c
            java.lang.String r8 = r8.toString()
            if (r8 != 0) goto L_0x014e
        L_0x014c:
            java.lang.String r8 = ""
        L_0x014e:
            gaf r2 = r7.c
            osa r2 = (defpackage.osa) r2
            q04 r2 = r2.e()
            de1 r3 = new de1
            r3.<init>(r7, r8, r1)
            jx3 r7 = r7.a
            defpackage.ev0.v(r7, r2, r1, r3, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ne1.afterTextChanged(android.text.Editable):void");
    }

    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        int i4 = this.a;
    }

    /* JADX WARNING: type inference failed for: r4v19, types: [o54] */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x003a, code lost:
        if (r0.r == true) goto L_0x003f;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onTextChanged(java.lang.CharSequence r5, int r6, int r7, int r8) {
        /*
            r4 = this;
            r6 = 1
            r7 = 0
            java.lang.Object r8 = r4.c
            r0 = 0
            int r1 = r4.a
            switch(r1) {
                case 0: goto L_0x0137;
                case 1: goto L_0x0137;
                case 2: goto L_0x0137;
                case 3: goto L_0x0137;
                case 4: goto L_0x0127;
                case 5: goto L_0x00ce;
                case 6: goto L_0x007e;
                case 7: goto L_0x006d;
                case 8: goto L_0x006c;
                case 9: goto L_0x0043;
                default: goto L_0x000a;
            }
        L_0x000a:
            java.lang.Object r4 = r4.b
            v7e r4 = (defpackage.v7e) r4
            o54 r8 = r4.D0
            boolean r8 = r8 instanceof defpackage.s7e
            if (r8 == 0) goto L_0x0042
            android.widget.ImageView r8 = r4.J0
            if (r5 == 0) goto L_0x0021
            int r5 = r5.length()
            if (r5 != 0) goto L_0x001f
            goto L_0x0021
        L_0x001f:
            r5 = r7
            goto L_0x0022
        L_0x0021:
            r5 = r6
        L_0x0022:
            r5 = r5 ^ r6
            if (r5 == 0) goto L_0x003d
            androidx.appcompat.widget.AppCompatEditText r5 = r4.F0
            boolean r5 = r5.isFocused()
            if (r5 != 0) goto L_0x003d
            o54 r4 = r4.D0
            boolean r5 = r4 instanceof defpackage.s7e
            if (r5 == 0) goto L_0x0036
            r0 = r4
            s7e r0 = (defpackage.s7e) r0
        L_0x0036:
            if (r0 == 0) goto L_0x003d
            boolean r4 = r0.r
            if (r4 != r6) goto L_0x003d
            goto L_0x003f
        L_0x003d:
            r7 = 8
        L_0x003f:
            r8.setVisibility(r7)
        L_0x0042:
            return
        L_0x0043:
            java.lang.Object r4 = r4.b
            android.widget.EditText r4 = (android.widget.EditText) r4
            if (r5 == 0) goto L_0x0069
            int r5 = r5.length()
            if (r5 != 0) goto L_0x0050
            goto L_0x0069
        L_0x0050:
            h2b r8 = (defpackage.h2b) r8
            kotlin.Lazy r5 = r8.z
            java.lang.Object r5 = r5.getValue()
            r6 = r5
            android.graphics.drawable.Drawable r6 = (android.graphics.drawable.Drawable) r6
            boolean r6 = r4.isEnabled()
            if (r6 == 0) goto L_0x0062
            goto L_0x0063
        L_0x0062:
            r5 = r0
        L_0x0063:
            android.graphics.drawable.Drawable r5 = (android.graphics.drawable.Drawable) r5
            r4.setCompoundDrawablesWithIntrinsicBounds(r0, r0, r5, r0)
            goto L_0x006c
        L_0x0069:
            r4.setCompoundDrawablesWithIntrinsicBounds(r0, r0, r0, r0)
        L_0x006c:
            return
        L_0x006d:
            java.lang.String r5 = java.lang.String.valueOf(r5)
            java.lang.Object r4 = r4.b
            kotlin.jvm.functions.Function1 r4 = (kotlin.jvm.functions.Function1) r4
            r4.invoke(r5)
            xr7 r8 = (defpackage.xr7) r8
            r8.P(r0)
            return
        L_0x007e:
            java.lang.String r5 = java.lang.String.valueOf(r5)
            java.lang.Object r1 = r4.b
            java.lang.String r1 = (java.lang.String) r1
            boolean r1 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r1, (java.lang.Object) r5)
            if (r1 != 0) goto L_0x00cd
            kotlin.reflect.KProperty[] r1 = one.me.inviteactions.invitebyphone.InviteByPhoneScreen.z0
            one.me.inviteactions.invitebyphone.InviteByPhoneScreen r8 = (one.me.inviteactions.invitebyphone.InviteByPhoneScreen) r8
            xk7 r1 = r8.f0()
            r1.getClass()
            f14 r2 = defpackage.f14.b
            vk7 r3 = new vk7
            r3.<init>(r1, r0)
            aje r0 = defpackage.xag.g(r1, r0, r2, r3, r6)
            kotlin.reflect.KProperty[] r2 = defpackage.xk7.z0
            r2 = r2[r6]
            wie r3 = r1.v0
            r3.setValue(r1, r2, r0)
            r4.b = r5
            kotlin.reflect.KProperty[] r4 = one.me.inviteactions.invitebyphone.InviteByPhoneScreen.z0
            r0 = r4[r7]
            is r0 = r8.v
            r0.b(r8, r5)
            one.me.sdk.uikit.common.button.OneMeButton r5 = r8.d0()
            r4 = r4[r7]
            java.lang.Object r4 = r0.a(r8)
            java.lang.String r4 = (java.lang.String) r4
            int r4 = r4.length()
            if (r4 <= 0) goto L_0x00c9
            goto L_0x00ca
        L_0x00c9:
            r6 = r7
        L_0x00ca:
            r5.setEnabled(r6)
        L_0x00cd:
            return
        L_0x00ce:
            java.lang.String r5 = java.lang.String.valueOf(r5)
            java.lang.Object r1 = r4.b
            java.lang.String r1 = (java.lang.String) r1
            boolean r1 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r1, (java.lang.Object) r5)
            if (r1 != 0) goto L_0x0126
            kotlin.reflect.KProperty[] r1 = one.me.login.inputphone.InputPhoneScreen.D0
            one.me.login.inputphone.InputPhoneScreen r8 = (one.me.login.inputphone.InputPhoneScreen) r8
            rh7 r1 = r8.g0()
            r1.getClass()
            f14 r2 = defpackage.f14.b
            nh7 r3 = new nh7
            r3.<init>(r1, r0)
            aje r0 = defpackage.xag.g(r1, r0, r2, r3, r6)
            kotlin.reflect.KProperty[] r2 = defpackage.rh7.B0
            r6 = r2[r6]
            wie r2 = r1.v0
            r2.setValue(r1, r6, r0)
            r4.b = r5
            kotlin.reflect.KProperty[] r4 = one.me.login.inputphone.InputPhoneScreen.D0
            r4 = r4[r7]
            is r4 = r8.v
            r4.b(r8, r5)
            rh7 r4 = r8.g0()
            zwa r6 = r8.f0()
            java.lang.String r6 = r6.getCode()
            xme r4 = r4.y0
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            r7.append(r6)
            r7.append(r5)
            java.lang.String r5 = r7.toString()
            r4.setValue(r5)
        L_0x0126:
            return
        L_0x0127:
            java.lang.String r5 = java.lang.String.valueOf(r5)
            java.lang.Object r4 = r4.b
            kotlin.jvm.functions.Function1 r4 = (kotlin.jvm.functions.Function1) r4
            r4.invoke(r5)
            up5 r8 = (defpackage.up5) r8
            r8.P(r0)
        L_0x0137:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ne1.onTextChanged(java.lang.CharSequence, int, int, int):void");
    }

    public /* synthetic */ ne1(Widget widget, int i) {
        this.a = i;
        this.c = widget;
    }
}
