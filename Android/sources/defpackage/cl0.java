package defpackage;

import android.accessibilityservice.AccessibilityServiceInfo;
import android.animation.ValueAnimator;
import android.os.Handler;
import android.os.Message;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityManager;
import com.google.android.material.snackbar.BaseTransientBottomBar$Behavior;
import java.util.List;
import java.util.WeakHashMap;

/* renamed from: cl0  reason: default package */
public final class cl0 implements Handler.Callback {
    public final boolean handleMessage(Message message) {
        List<AccessibilityServiceInfo> enabledAccessibilityServiceList;
        int i = 0;
        int i2 = message.what;
        if (i2 == 0) {
            il0 il0 = (il0) message.obj;
            hl0 hl0 = il0.i;
            if (hl0.getParent() == null) {
                ViewGroup.LayoutParams layoutParams = hl0.getLayoutParams();
                if (layoutParams instanceof wz3) {
                    wz3 wz3 = (wz3) layoutParams;
                    BaseTransientBottomBar$Behavior baseTransientBottomBar$Behavior = new BaseTransientBottomBar$Behavior();
                    e4 e4Var = baseTransientBottomBar$Behavior.j;
                    e4Var.getClass();
                    e4Var.b = il0.u;
                    baseTransientBottomBar$Behavior.b = new wie(5, (Object) il0);
                    wz3.b(baseTransientBottomBar$Behavior);
                    if (il0.b() == null) {
                        wz3.g = 80;
                    }
                }
                hl0.w0 = true;
                ViewGroup viewGroup = il0.g;
                viewGroup.addView(hl0);
                hl0.w0 = false;
                if (il0.b() != null) {
                    int[] iArr = new int[2];
                    il0.b().getLocationOnScreen(iArr);
                    int i3 = iArr[1];
                    int[] iArr2 = new int[2];
                    viewGroup.getLocationOnScreen(iArr2);
                    i = (viewGroup.getHeight() + iArr2[1]) - i3;
                }
                il0.p = i;
                il0.f();
                hl0.setVisibility(4);
            }
            WeakHashMap weakHashMap = gag.a;
            if (hl0.isLaidOut()) {
                il0.e();
            } else {
                il0.s = true;
            }
            return true;
        } else if (i2 != 1) {
            return false;
        } else {
            il0 il02 = (il0) message.obj;
            int i4 = message.arg1;
            AccessibilityManager accessibilityManager = il02.t;
            if (accessibilityManager == null || ((enabledAccessibilityServiceList = accessibilityManager.getEnabledAccessibilityServiceList(1)) != null && enabledAccessibilityServiceList.isEmpty())) {
                hl0 hl02 = il02.i;
                if (hl02.getVisibility() == 0) {
                    if (hl02.getAnimationMode() == 1) {
                        ValueAnimator ofFloat = ValueAnimator.ofFloat(new float[]{1.0f, c44.DEFAULT_ASPECT_RATIO});
                        ofFloat.setInterpolator(il02.d);
                        ofFloat.addUpdateListener(new bl0(il02, 0, (byte) 0));
                        ofFloat.setDuration((long) il02.b);
                        ofFloat.addListener(new al0(il02, i4, 0));
                        ofFloat.start();
                    } else {
                        ValueAnimator valueAnimator = new ValueAnimator();
                        int height = hl02.getHeight();
                        ViewGroup.LayoutParams layoutParams2 = hl02.getLayoutParams();
                        if (layoutParams2 instanceof ViewGroup.MarginLayoutParams) {
                            height += ((ViewGroup.MarginLayoutParams) layoutParams2).bottomMargin;
                        }
                        valueAnimator.setIntValues(new int[]{0, height});
                        valueAnimator.setInterpolator(il02.e);
                        valueAnimator.setDuration((long) il02.c);
                        valueAnimator.addListener(new al0(il02, i4, 2));
                        valueAnimator.addUpdateListener(new bl0(il02, 3, (byte) 0));
                        valueAnimator.start();
                    }
                    return true;
                }
            }
            il02.c();
            return true;
        }
    }
}
