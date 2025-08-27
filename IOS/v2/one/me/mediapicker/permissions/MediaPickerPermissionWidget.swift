package one.me.mediapicker.permissions;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.math.MathKt;
import kotlin.reflect.KProperty;
import one.me.sdk.arch.Widget;
import one.me.sdk.uikit.common.button.OneMeButton;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u0001B\u0011\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B\u0011\b\u0016\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0004\u0010\b¨\u0006\t"}, d2 = {"Lone/me/mediapicker/permissions/MediaPickerPermissionWidget;", "Lone/me/sdk/arch/Widget;", "Landroid/os/Bundle;", "args", "<init>", "(Landroid/os/Bundle;)V", "Legd;", "scopeId", "(Ljava/lang/String;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "media-picker_release"}, k = 1, mv = {2, 0, 0})
@SourceDebugExtension({"SMAP\nMediaPickerPermissionWidget.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MediaPickerPermissionWidget.kt\none/me/mediapicker/permissions/MediaPickerPermissionWidget\n+ 2 Widget.kt\none/me/sdk/arch/Widget\n+ 3 Dimensions.kt\nru/ok/tamtam/shared/Dimensions\n+ 4 View.kt\nandroidx/core/view/ViewKt\n+ 5 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,137:1\n419#2:138\n255#2,9:139\n24#3:148\n24#3:149\n157#4,8:150\n12350#5,2:158\n12350#5,2:160\n*S KotlinDebug\n*F\n+ 1 MediaPickerPermissionWidget.kt\none/me/mediapicker/permissions/MediaPickerPermissionWidget\n*L\n38#1:138\n40#1:139,9\n56#1:148\n67#1:149\n67#1:150,8\n103#1:158,2\n116#1:160,2\n*E\n"})
@SuppressLint({"ValidController"})
public final class MediaPickerPermissionWidget extends Widget {
    public static final /* synthetic */ KProperty[] o = {wj6.p(MediaPickerPermissionWidget.class, "scopeId", "getScopeId-IluPPks()Ljava/lang/String;", 0)};
    public final is a;
    public final Lazy b;
    public final Lazy c;

    public MediaPickerPermissionWidget(Bundle bundle) {
        super(bundle, 0, 2, (DefaultConstructorMarker) null);
        this.a = new is(egd.class, new egd("default"), Widget.ARG_SCOPE_ID);
        this.b = m1571getSharedViewModelcp94BC8(m1555getScopeIdIluPPks(), gu8.class, (Function0) null);
        this.c = fdb.a.c();
    }

    /* renamed from: getScopeId-IluPPks  reason: not valid java name */
    public final String m1555getScopeIdIluPPks() {
        KProperty kProperty = o[0];
        return ((egd) this.a.a(this)).a;
    }

    public final void onActivityResumed(Activity activity) {
        gu8 gu8 = (gu8) this.b.getValue();
        gu8.z.h();
        gu8.X.h();
        super.onActivityResumed(activity);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        LinearLayout linearLayout = new LinearLayout(getContext());
        linearLayout.setOrientation(1);
        linearLayout.setGravity(17);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
        float f = (float) 20;
        float f2 = (float) 0;
        layoutParams.setMargins(MathKt.roundToInt(vo4.c().getDisplayMetrics().density * f), MathKt.roundToInt(vo4.c().getDisplayMetrics().density * f2), MathKt.roundToInt(f * vo4.c().getDisplayMetrics().density), MathKt.roundToInt(f2 * vo4.c().getDisplayMetrics().density));
        linearLayout.setLayoutParams(layoutParams);
        TextView textView = new TextView(linearLayout.getContext());
        textView.setText(tva.j);
        puf.n.b(textView, uy4.b);
        textView.setGravity(17);
        TextView textView2 = new TextView(linearLayout.getContext());
        textView2.setText(tva.i);
        puf.r.b(textView2, uy4.b);
        textView2.setPadding(textView2.getPaddingLeft(), MathKt.roundToInt(((float) 4) * vo4.c().getDisplayMetrics().density), textView2.getPaddingRight(), MathKt.roundToInt(((float) 16) * vo4.c().getDisplayMetrics().density));
        textView2.setGravity(17);
        OneMeButton oneMeButton = new OneMeButton(linearLayout.getContext(), (AttributeSet) null);
        oneMeButton.setText(tva.d);
        oneMeButton.setLayoutParams(new LinearLayout.LayoutParams(-2, -2));
        ct.G(oneMeButton, 300, new xu3(27, (Object) this));
        b0h.H(linearLayout, new m96(textView, textView2, (Continuation) null, 1));
        linearLayout.addView(textView);
        linearLayout.addView(textView2);
        linearLayout.addView(oneMeButton);
        return linearLayout;
    }

    public final void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        Lazy lazy = this.c;
        int i2 = 0;
        if (i == 157) {
            int length = iArr.length;
            while (i2 < length) {
                if (iArr[i2] == -1) {
                    i2++;
                } else {
                    return;
                }
            }
            eng eng = new eng(this, 1);
            int i3 = tva.h;
            int i4 = tva.g;
            ((edb) lazy.getValue()).getClass();
            edb.j(eng, strArr, iArr, i3, i4);
        } else if (i == 162) {
            int length2 = iArr.length;
            while (i2 < length2) {
                if (iArr[i2] == -1) {
                    i2++;
                } else {
                    return;
                }
            }
            boolean unused = ((edb) lazy.getValue()).getClass();
        }
    }

    public MediaPickerPermissionWidget(String str, DefaultConstructorMarker defaultConstructorMarker) {
        this(o54.f(i2a.l(str, Widget.ARG_SCOPE_ID)));
    }
}
