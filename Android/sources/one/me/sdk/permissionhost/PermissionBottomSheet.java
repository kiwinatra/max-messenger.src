package one.me.sdk.permissionhost;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.appcompat.widget.AppCompatTextView;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.math.MathKt;
import kotlin.reflect.KProperty;
import one.me.sdk.bottomsheet.BottomSheetWidget;
import one.me.sdk.uikit.common.button.OneMeButton;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\b\u0001\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003B=\b\u0016\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\b\u0001\u0010\t\u001a\u00020\u0007\u0012\b\b\u0001\u0010\n\u001a\u00020\u0007\u0012\b\b\u0001\u0010\u000b\u001a\u00020\u0007¢\u0006\u0004\b\u0002\u0010\fB\u001d\b\u0016\u0012\b\b\u0001\u0010\t\u001a\u00020\u0007\u0012\b\b\u0001\u0010\n\u001a\u00020\u0007¢\u0006\u0004\b\u0002\u0010\r¨\u0006\u000e"}, d2 = {"Lone/me/sdk/permissionhost/PermissionBottomSheet;", "Lone/me/sdk/bottomsheet/BottomSheetWidget;", "<init>", "()V", "", "", "permissions", "", "requestCode", "titleId", "rationaleId", "positiveButtonId", "([Ljava/lang/String;IIII)V", "(II)V", "permission-host_release"}, k = 1, mv = {2, 0, 0})
@SourceDebugExtension({"SMAP\nPermissionBottomSheet.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PermissionBottomSheet.kt\none/me/sdk/permissionhost/PermissionBottomSheet\n+ 2 Widget.kt\none/me/sdk/arch/Widget\n+ 3 Dimensions.kt\nru/ok/tamtam/shared/Dimensions\n+ 4 View.kt\nandroidx/core/view/ViewKt\n+ 5 WidgetExt.kt\none/me/sdk/arch/ext/WidgetExtKt\n*L\n1#1,212:1\n150#1,18:230\n127#1,21:248\n170#1,18:269\n419#2:213\n420#2:214\n420#2:215\n420#2:216\n420#2:217\n420#2:218\n419#2:219\n24#3:220\n24#3:221\n157#4,8:222\n55#5,12:287\n*S KotlinDebug\n*F\n+ 1 PermissionBottomSheet.kt\none/me/sdk/permissionhost/PermissionBottomSheet\n*L\n103#1:230,18\n111#1:248,21\n119#1:269,18\n33#1:213\n34#1:214\n35#1:215\n36#1:216\n37#1:217\n38#1:218\n39#1:219\n81#1:220\n92#1:221\n92#1:222,8\n193#1:287,12\n*E\n"})
@SuppressLint({"ValidController"})
public final class PermissionBottomSheet extends BottomSheetWidget {
    public static final /* synthetic */ KProperty[] F0;
    public final is A0;
    public final is B0;
    public final is C0;
    public final is D0;
    public boolean E0;
    public final Lazy w0;
    public final is x0;
    public final is y0;
    public final is z0;

    static {
        Class<PermissionBottomSheet> cls = PermissionBottomSheet.class;
        F0 = new KProperty[]{rae.s(cls, "settingsMode", "getSettingsMode()Z", 0), rae.s(cls, "titleId", "getTitleId()I", 0), rae.s(cls, "rationaleId", "getRationaleId()I", 0), rae.s(cls, "positiveButtonId", "getPositiveButtonId()I", 0), rae.s(cls, "requestedPermissions", "getRequestedPermissions()[Ljava/lang/String;", 0), rae.s(cls, "requestCode", "getRequestCode()I", 0), rae.s(cls, "isCallbackSent", "isCallbackSent()Z", 0)};
    }

    public PermissionBottomSheet() {
        super((Bundle) null, 1, (DefaultConstructorMarker) null);
        this.w0 = fdb.a.c();
        Class<Boolean> cls = Boolean.class;
        this.x0 = new is(cls, Boolean.TRUE, "PermissionBottomSheet.settings_mode");
        Class<Integer> cls2 = Integer.class;
        this.y0 = new is(cls2, "PermissionBottomSheet.title_res");
        this.z0 = new is(cls2, "PermissionBottomSheet.rationale_res");
        this.A0 = new is(cls2, "PermissionBottomSheet.positive_button_res");
        this.B0 = new is(String[].class, "PermissionBottomSheet.permissions");
        this.C0 = new is(cls2, "PermissionBottomSheet.request_code");
        this.D0 = new is(cls, Boolean.FALSE, "callback_sent");
    }

    public final View n0(LayoutInflater layoutInflater, FrameLayout frameLayout) {
        LinearLayout linearLayout = new LinearLayout(layoutInflater.getContext());
        linearLayout.setOrientation(1);
        AppCompatTextView appCompatTextView = new AppCompatTextView(linearLayout.getContext(), (AttributeSet) null);
        appCompatTextView.setId(zya.e);
        KProperty[] kPropertyArr = F0;
        KProperty kProperty = kPropertyArr[1];
        appCompatTextView.setText(((Number) this.y0.a(this)).intValue());
        appCompatTextView.setGravity(1);
        appCompatTextView.setTextAlignment(4);
        puf.c.b(appCompatTextView, uy4.b);
        js9 js9 = fu4.k;
        appCompatTextView.setTextColor(js9.e(appCompatTextView.getContext()).f().getText().e);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
        layoutParams.topMargin = MathKt.roundToInt(((float) 16) * vo4.c().getDisplayMetrics().density);
        Unit unit = Unit.INSTANCE;
        linearLayout.addView(appCompatTextView, layoutParams);
        AppCompatTextView appCompatTextView2 = new AppCompatTextView(linearLayout.getContext(), (AttributeSet) null);
        appCompatTextView2.setId(zya.d);
        KProperty kProperty2 = kPropertyArr[2];
        appCompatTextView2.setText(((Number) this.z0.a(this)).intValue());
        appCompatTextView2.setGravity(1);
        appCompatTextView2.setTextAlignment(4);
        puf.m.b(appCompatTextView2, uy4.b);
        appCompatTextView2.setTextColor(js9.e(appCompatTextView2.getContext()).f().getText().g);
        float f = (float) 12;
        appCompatTextView2.setPadding(appCompatTextView2.getPaddingLeft(), MathKt.roundToInt(vo4.c().getDisplayMetrics().density * f), appCompatTextView2.getPaddingRight(), MathKt.roundToInt(f * vo4.c().getDisplayMetrics().density));
        linearLayout.addView(appCompatTextView2, new LinearLayout.LayoutParams(-1, -2));
        KProperty kProperty3 = kPropertyArr[0];
        if (((Boolean) this.x0.a(this)).booleanValue()) {
            OneMeButton oneMeButton = new OneMeButton(linearLayout.getContext(), (AttributeSet) null);
            oneMeButton.setId(zya.b);
            oneMeButton.setMode(zpa.o);
            oneMeButton.setSize(aqa.c);
            oneMeButton.setAppearance(xpa.o);
            oneMeButton.setText(aza.d);
            oneMeButton.setOnClickListener(new cr(2, linearLayout, this));
            LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-2, -2);
            layoutParams2.gravity = 1;
            linearLayout.addView(oneMeButton, layoutParams2);
        } else {
            OneMeButton oneMeButton2 = new OneMeButton(linearLayout.getContext(), (AttributeSet) null);
            oneMeButton2.setId(zya.c);
            zpa zpa = zpa.o;
            oneMeButton2.setMode(zpa);
            aqa aqa = aqa.c;
            oneMeButton2.setSize(aqa);
            xpa xpa = xpa.o;
            oneMeButton2.setAppearance(xpa);
            KProperty kProperty4 = kPropertyArr[3];
            oneMeButton2.setText(((Number) this.A0.a(this)).intValue());
            oneMeButton2.setOnClickListener(new cr(3, this, this));
            LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(-2, -2);
            layoutParams3.gravity = 1;
            linearLayout.addView(oneMeButton2, layoutParams3);
            OneMeButton oneMeButton3 = new OneMeButton(linearLayout.getContext(), (AttributeSet) null);
            oneMeButton3.setId(zya.a);
            oneMeButton3.setMode(zpa);
            oneMeButton3.setSize(aqa);
            oneMeButton3.setAppearance(xpa);
            oneMeButton3.setText(aza.c);
            oneMeButton3.setOnClickListener(new wld(10, this));
            LinearLayout.LayoutParams layoutParams4 = new LinearLayout.LayoutParams(-2, -2);
            layoutParams4.gravity = 1;
            linearLayout.addView(oneMeButton3, layoutParams4);
        }
        return linearLayout;
    }

    public final void onAttach(View view) {
        super.onAttach(view);
        zr0 zr0 = new zr0((zx3) this, (Function0) new c28(27, this));
        if (getRouter() != null) {
            getRouter().a(zr0);
        } else {
            addLifecycleListener(new la(this, zr0, 9));
        }
    }

    public PermissionBottomSheet(String[] strArr, int i, int i2, int i3, int i4) {
        this(i2, i3);
        KProperty[] kPropertyArr = F0;
        KProperty kProperty = kPropertyArr[4];
        this.B0.b(this, strArr);
        KProperty kProperty2 = kPropertyArr[5];
        this.C0.b(this, Integer.valueOf(i));
        KProperty kProperty3 = kPropertyArr[3];
        this.A0.b(this, Integer.valueOf(i4));
        KProperty kProperty4 = kPropertyArr[0];
        this.x0.b(this, Boolean.FALSE);
    }

    public PermissionBottomSheet(int i, int i2) {
        this();
        KProperty[] kPropertyArr = F0;
        KProperty kProperty = kPropertyArr[1];
        this.y0.b(this, Integer.valueOf(i));
        KProperty kProperty2 = kPropertyArr[2];
        this.z0.b(this, Integer.valueOf(i2));
    }
}
