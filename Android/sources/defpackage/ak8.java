package defpackage;

import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.util.AttributeSet;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.math.MathKt;
import kotlin.reflect.KProperty;
import one.me.chatscreen.mediabar.permission.MediaBarPermissionWidget;
import one.me.sdk.uikit.common.button.OneMeButton;
import ru.ok.tamtam.android.widgets.quickcamera.CameraxCameraApiView;

/* renamed from: ak8  reason: default package */
public final /* synthetic */ class ak8 implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ MediaBarPermissionWidget b;

    public /* synthetic */ ak8(MediaBarPermissionWidget mediaBarPermissionWidget, int i) {
        this.a = i;
        this.b = mediaBarPermissionWidget;
    }

    public final Object invoke() {
        MediaBarPermissionWidget mediaBarPermissionWidget = this.b;
        switch (this.a) {
            case 0:
                KProperty[] kPropertyArr = MediaBarPermissionWidget.x;
                LinearLayout linearLayout = new LinearLayout(mediaBarPermissionWidget.getContext());
                linearLayout.setOrientation(1);
                linearLayout.setVerticalGravity(16);
                linearLayout.setHorizontalGravity(1);
                FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
                float f = (float) 4;
                layoutParams.setMargins(MathKt.roundToInt(vo4.c().getDisplayMetrics().density * f), MathKt.roundToInt(((float) 24) * vo4.c().getDisplayMetrics().density), MathKt.roundToInt(vo4.c().getDisplayMetrics().density * f), MathKt.roundToInt(f * vo4.c().getDisplayMetrics().density));
                linearLayout.setLayoutParams(layoutParams);
                Drawable b2 = ew3.b(linearLayout.getContext(), kra.e);
                AppCompatImageView appCompatImageView = new AppCompatImageView(linearLayout.getContext(), (AttributeSet) null);
                appCompatImageView.setImageDrawable(b2);
                AppCompatTextView appCompatTextView = new AppCompatTextView(linearLayout.getContext(), (AttributeSet) null);
                appCompatTextView.setText(mra.M);
                appCompatTextView.setLayoutParams(new FrameLayout.LayoutParams(-2, -2, 17));
                appCompatTextView.setPadding(appCompatTextView.getPaddingLeft(), MathKt.roundToInt(((float) 10) * vo4.c().getDisplayMetrics().density), appCompatTextView.getPaddingRight(), appCompatTextView.getPaddingBottom());
                puf.B.b(appCompatTextView, uy4.b);
                b0h.H(linearLayout, new x2(b2, appCompatTextView, (Continuation) null, 15));
                linearLayout.addView(appCompatImageView);
                linearLayout.addView(appCompatTextView);
                ct.G(linearLayout, 300, new bk8(mediaBarPermissionWidget, 0));
                return linearLayout;
            case 1:
                KProperty[] kPropertyArr2 = MediaBarPermissionWidget.x;
                CameraxCameraApiView cameraxCameraApiView = new CameraxCameraApiView(mediaBarPermissionWidget.getContext(), (AttributeSet) null, 14);
                cameraxCameraApiView.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
                cameraxCameraApiView.e();
                return cameraxCameraApiView;
            case 2:
                KProperty[] kPropertyArr3 = MediaBarPermissionWidget.x;
                FrameLayout frameLayout = new FrameLayout(mediaBarPermissionWidget.getContext());
                LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-1, MathKt.roundToInt(((float) 138) * vo4.c().getDisplayMetrics().density));
                float f2 = (float) 12;
                layoutParams2.setMargins(MathKt.roundToInt(vo4.c().getDisplayMetrics().density * f2), MathKt.roundToInt(((float) 4) * vo4.c().getDisplayMetrics().density), MathKt.roundToInt(f2 * vo4.c().getDisplayMetrics().density), MathKt.roundToInt(((float) 8) * vo4.c().getDisplayMetrics().density));
                frameLayout.setLayoutParams(layoutParams2);
                GradientDrawable gradientDrawable = new GradientDrawable();
                gradientDrawable.setCornerRadius(vo4.c().getDisplayMetrics().density * 12.0f);
                frameLayout.setBackground(gradientDrawable);
                frameLayout.setClipToOutline(true);
                b0h.H(frameLayout, new sa((Object) gradientDrawable, (Continuation) null, 17));
                o5a.O(new ps5(((zj8) mediaBarPermissionWidget.b.getValue()).c, new ck8(mediaBarPermissionWidget, frameLayout, (Continuation) null), 5), mediaBarPermissionWidget.getViewLifecycleScope());
                return frameLayout;
            default:
                KProperty[] kPropertyArr4 = MediaBarPermissionWidget.x;
                LinearLayout linearLayout2 = new LinearLayout(mediaBarPermissionWidget.getContext());
                linearLayout2.setOrientation(1);
                linearLayout2.setVerticalGravity(16);
                linearLayout2.setHorizontalGravity(1);
                FrameLayout.LayoutParams layoutParams3 = new FrameLayout.LayoutParams(-1, MathKt.roundToInt(((float) 166) * vo4.c().getDisplayMetrics().density));
                float f3 = (float) 20;
                float f4 = (float) 0;
                layoutParams3.setMargins(MathKt.roundToInt(vo4.c().getDisplayMetrics().density * f3), MathKt.roundToInt(vo4.c().getDisplayMetrics().density * f4), MathKt.roundToInt(f3 * vo4.c().getDisplayMetrics().density), MathKt.roundToInt(f4 * vo4.c().getDisplayMetrics().density));
                linearLayout2.setLayoutParams(layoutParams3);
                AppCompatTextView appCompatTextView2 = new AppCompatTextView(linearLayout2.getContext(), (AttributeSet) null);
                appCompatTextView2.setText(mra.S);
                puf.n.b(appCompatTextView2, uy4.b);
                appCompatTextView2.setGravity(17);
                AppCompatTextView appCompatTextView3 = new AppCompatTextView(linearLayout2.getContext(), (AttributeSet) null);
                appCompatTextView3.setText(mra.R);
                puf.r.b(appCompatTextView3, uy4.b);
                appCompatTextView3.setPadding(appCompatTextView3.getPaddingLeft(), MathKt.roundToInt(((float) 4) * vo4.c().getDisplayMetrics().density), appCompatTextView3.getPaddingRight(), MathKt.roundToInt(((float) 16) * vo4.c().getDisplayMetrics().density));
                appCompatTextView3.setGravity(17);
                OneMeButton oneMeButton = new OneMeButton(linearLayout2.getContext(), (AttributeSet) null);
                oneMeButton.setText(mra.L);
                oneMeButton.setLayoutParams(new LinearLayout.LayoutParams(-2, -2));
                ct.G(oneMeButton, 300, new bk8(mediaBarPermissionWidget, 1));
                b0h.H(linearLayout2, new x2(appCompatTextView2, appCompatTextView3, (Continuation) null, 16));
                linearLayout2.addView(appCompatTextView2);
                linearLayout2.addView(appCompatTextView3);
                linearLayout2.addView(oneMeButton);
                return linearLayout2;
        }
    }
}
