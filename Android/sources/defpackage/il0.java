package defpackage;

import android.accessibilityservice.AccessibilityServiceInfo;
import android.animation.TimeInterpolator;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.os.Handler;
import android.os.Looper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityManager;
import android.view.animation.LinearInterpolator;
import com.google.android.material.behavior.SwipeDismissBehavior;
import com.google.android.material.snackbar.SnackbarContentLayout;
import java.util.List;
import java.util.WeakHashMap;

/* renamed from: il0  reason: default package */
public abstract class il0 {
    public static final gh5 v = xg.b;
    public static final LinearInterpolator w = xg.a;
    public static final fh5 x = xg.d;
    public static final Handler y = new Handler(Looper.getMainLooper(), new Object());
    public static final int[] z = {edc.snackbarStyle};
    public final int a;
    public final int b;
    public final int c;
    public final TimeInterpolator d;
    public final TimeInterpolator e;
    public final TimeInterpolator f;
    public final ViewGroup g;
    public final Context h;
    public final hl0 i;
    public final tv3 j;
    public int k;
    public final dl0 l = new dl0(this, 0);
    public int m;
    public int n;
    public int o;
    public int p;
    public int q;
    public int r;
    public boolean s;
    public final AccessibilityManager t;
    public final fl0 u = new fl0(this);

    public il0(Context context, ViewGroup viewGroup, SnackbarContentLayout snackbarContentLayout, SnackbarContentLayout snackbarContentLayout2) {
        if (snackbarContentLayout == null) {
            throw new IllegalArgumentException("Transient bottom bar must have non-null content");
        } else if (snackbarContentLayout2 != null) {
            this.g = viewGroup;
            this.j = snackbarContentLayout2;
            this.h = context;
            vhf.c(context, vhf.a, "Theme.AppCompat");
            LayoutInflater from = LayoutInflater.from(context);
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(z);
            int resourceId = obtainStyledAttributes.getResourceId(0, -1);
            obtainStyledAttributes.recycle();
            hl0 hl0 = (hl0) from.inflate(resourceId != -1 ? qjc.mtrl_layout_snackbar : qjc.design_layout_snackbar, viewGroup, false);
            this.i = hl0;
            hl0.setBaseTransientBottomBar(this);
            float actionTextColorAlpha = hl0.getActionTextColorAlpha();
            if (actionTextColorAlpha != 1.0f) {
                snackbarContentLayout.b.setTextColor(ld9.K(ld9.A(snackbarContentLayout, edc.colorSurface), actionTextColorAlpha, snackbarContentLayout.b.getCurrentTextColor()));
            }
            snackbarContentLayout.setMaxInlineActionWidth(hl0.getMaxInlineActionWidth());
            hl0.addView(snackbarContentLayout);
            WeakHashMap weakHashMap = gag.a;
            hl0.setAccessibilityLiveRegion(1);
            hl0.setImportantForAccessibility(1);
            hl0.setFitsSystemWindows(true);
            v9g.u(hl0, new er7(5, (Object) this));
            gag.j(hl0, new el0(0, this));
            this.t = (AccessibilityManager) context.getSystemService("accessibility");
            this.c = ld8.n0(edc.motionDurationLong2, 250, context);
            this.a = ld8.n0(edc.motionDurationLong2, 150, context);
            this.b = ld8.n0(edc.motionDurationMedium1, 75, context);
            this.d = ld8.o0(context, edc.motionEasingEmphasizedInterpolator, w);
            this.f = ld8.o0(context, edc.motionEasingEmphasizedInterpolator, x);
            this.e = ld8.o0(context, edc.motionEasingEmphasizedInterpolator, v);
        } else {
            throw new IllegalArgumentException("Transient bottom bar must have non-null callback");
        }
    }

    public final void a(int i2) {
        qpg l2 = qpg.l();
        fl0 fl0 = this.u;
        synchronized (l2.a) {
            try {
                if (l2.m(fl0)) {
                    l2.c((ffe) l2.c, i2);
                } else {
                    ffe ffe = (ffe) l2.o;
                    if ((ffe == null || fl0 == null || ffe.a.get() != fl0) ? false : true) {
                        l2.c((ffe) l2.o, i2);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final View b() {
        return null;
    }

    public final void c() {
        qpg l2 = qpg.l();
        fl0 fl0 = this.u;
        synchronized (l2.a) {
            try {
                if (l2.m(fl0)) {
                    l2.c = null;
                    if (((ffe) l2.o) != null) {
                        l2.x();
                    }
                }
            } catch (Throwable th) {
                while (true) {
                    throw th;
                }
            }
        }
        ViewParent parent = this.i.getParent();
        if (parent instanceof ViewGroup) {
            ((ViewGroup) parent).removeView(this.i);
        }
    }

    public final void d() {
        qpg l2 = qpg.l();
        fl0 fl0 = this.u;
        synchronized (l2.a) {
            try {
                if (l2.m(fl0)) {
                    l2.v((ffe) l2.c);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void e() {
        List<AccessibilityServiceInfo> enabledAccessibilityServiceList;
        boolean z2 = true;
        AccessibilityManager accessibilityManager = this.t;
        if (accessibilityManager != null && ((enabledAccessibilityServiceList = accessibilityManager.getEnabledAccessibilityServiceList(1)) == null || !enabledAccessibilityServiceList.isEmpty())) {
            z2 = false;
        }
        hl0 hl0 = this.i;
        if (z2) {
            hl0.post(new dl0(this, 2));
            return;
        }
        if (hl0.getParent() != null) {
            hl0.setVisibility(0);
        }
        d();
    }

    public final void f() {
        hl0 hl0 = this.i;
        ViewGroup.LayoutParams layoutParams = hl0.getLayoutParams();
        if ((layoutParams instanceof ViewGroup.MarginLayoutParams) && hl0.v0 != null && hl0.getParent() != null) {
            int i2 = b() != null ? this.p : this.m;
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            Rect rect = hl0.v0;
            int i3 = rect.bottom + i2;
            int i4 = rect.left + this.n;
            int i5 = rect.right + this.o;
            int i6 = rect.top;
            boolean z2 = (marginLayoutParams.bottomMargin == i3 && marginLayoutParams.leftMargin == i4 && marginLayoutParams.rightMargin == i5 && marginLayoutParams.topMargin == i6) ? false : true;
            if (z2) {
                marginLayoutParams.bottomMargin = i3;
                marginLayoutParams.leftMargin = i4;
                marginLayoutParams.rightMargin = i5;
                marginLayoutParams.topMargin = i6;
                hl0.requestLayout();
            }
            if ((z2 || this.r != this.q) && this.q > 0) {
                ViewGroup.LayoutParams layoutParams2 = hl0.getLayoutParams();
                if ((layoutParams2 instanceof wz3) && (((wz3) layoutParams2).a instanceof SwipeDismissBehavior)) {
                    dl0 dl0 = this.l;
                    hl0.removeCallbacks(dl0);
                    hl0.post(dl0);
                }
            }
        }
    }
}
