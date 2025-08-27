package defpackage;

import android.graphics.Color;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.FrameLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import java.util.WeakHashMap;
import kotlin.jvm.internal.IntCompanionObject;

/* renamed from: xr0  reason: default package */
public class xr0 extends go {
    public boolean X;
    public boolean Y;
    public boolean Z;
    public boolean v0;
    public BottomSheetBehavior w;
    public wr0 w0;
    public FrameLayout x;
    public final boolean x0;
    public CoordinatorLayout y;
    public o5h y0;
    public FrameLayout z;
    public final vr0 z0;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public xr0(android.content.Context r4, int r5) {
        /*
            r3 = this;
            r0 = 1
            if (r5 != 0) goto L_0x0019
            android.util.TypedValue r5 = new android.util.TypedValue
            r5.<init>()
            android.content.res.Resources$Theme r1 = r4.getTheme()
            int r2 = defpackage.edc.bottomSheetDialogTheme
            boolean r1 = r1.resolveAttribute(r2, r5, r0)
            if (r1 == 0) goto L_0x0017
            int r5 = r5.resourceId
            goto L_0x0019
        L_0x0017:
            int r5 = defpackage.hnc.Theme_Design_Light_BottomSheetDialog
        L_0x0019:
            r3.<init>(r4, r5)
            r3.Y = r0
            r3.Z = r0
            vr0 r4 = new vr0
            r5 = 0
            r4.<init>(r5, r3)
            r3.z0 = r4
            rn r4 = r3.d()
            r4.f(r0)
            android.content.Context r4 = r3.getContext()
            android.content.res.Resources$Theme r4 = r4.getTheme()
            int r5 = defpackage.edc.enableEdgeToEdge
            int[] r5 = new int[]{r5}
            android.content.res.TypedArray r4 = r4.obtainStyledAttributes(r5)
            r5 = 0
            boolean r4 = r4.getBoolean(r5, r5)
            r3.x0 = r4
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.xr0.<init>(android.content.Context, int):void");
    }

    public final void cancel() {
        BottomSheetBehavior h = h();
        if (!this.X || h.L == 5) {
            super.cancel();
        } else {
            h.K(5);
        }
    }

    /* JADX WARNING: type inference failed for: r0v11, types: [o5h, java.lang.Object] */
    public final void g() {
        if (this.x == null) {
            FrameLayout frameLayout = (FrameLayout) View.inflate(getContext(), qjc.design_bottom_sheet_dialog, (ViewGroup) null);
            this.x = frameLayout;
            this.y = (CoordinatorLayout) frameLayout.findViewById(agc.coordinator);
            FrameLayout frameLayout2 = (FrameLayout) this.x.findViewById(agc.design_bottom_sheet);
            this.z = frameLayout2;
            BottomSheetBehavior C = BottomSheetBehavior.C(frameLayout2);
            this.w = C;
            C.w(this.z0);
            this.w.I(this.Y);
            BottomSheetBehavior bottomSheetBehavior = this.w;
            FrameLayout frameLayout3 = this.z;
            ? obj = new Object();
            int i = Build.VERSION.SDK_INT;
            obj.a = i >= 34 ? new Object() : i >= 33 ? new Object() : null;
            obj.b = bottomSheetBehavior;
            obj.c = frameLayout3;
            this.y0 = obj;
        }
    }

    public final BottomSheetBehavior h() {
        if (this.w == null) {
            g();
        }
        return this.w;
    }

    public final FrameLayout i(View view, int i, ViewGroup.LayoutParams layoutParams) {
        g();
        CoordinatorLayout coordinatorLayout = (CoordinatorLayout) this.x.findViewById(agc.coordinator);
        if (i != 0 && view == null) {
            view = getLayoutInflater().inflate(i, coordinatorLayout, false);
        }
        if (this.x0) {
            FrameLayout frameLayout = this.z;
            er7 er7 = new er7(6, (Object) this);
            WeakHashMap weakHashMap = gag.a;
            v9g.u(frameLayout, er7);
        }
        this.z.removeAllViews();
        if (layoutParams == null) {
            this.z.addView(view);
        } else {
            this.z.addView(view, layoutParams);
        }
        coordinatorLayout.findViewById(agc.touch_outside).setOnClickListener(new wld(3, this));
        gag.j(this.z, new el0(1, this));
        this.z.setOnTouchListener(new gl0(1));
        return this.x;
    }

    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        Window window = getWindow();
        if (window != null) {
            boolean z2 = this.x0 && Color.alpha(window.getNavigationBarColor()) < 255;
            FrameLayout frameLayout = this.x;
            if (frameLayout != null) {
                frameLayout.setFitsSystemWindows(!z2);
            }
            CoordinatorLayout coordinatorLayout = this.y;
            if (coordinatorLayout != null) {
                coordinatorLayout.setFitsSystemWindows(!z2);
            }
            hd8.U(window, !z2);
            wr0 wr0 = this.w0;
            if (wr0 != null) {
                wr0.e(window);
            }
        }
        o5h o5h = this.y0;
        if (o5h != null) {
            boolean z3 = this.Y;
            View view = (View) o5h.c;
            hg8 hg8 = (hg8) o5h.a;
            if (z3) {
                if (hg8 != null) {
                    hg8.b((gg8) o5h.b, view, false);
                }
            } else if (hg8 != null) {
                hg8.c(view);
            }
        }
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Window window = getWindow();
        if (window != null) {
            window.setStatusBarColor(0);
            window.addFlags(IntCompanionObject.MIN_VALUE);
            window.setLayout(-1, -1);
        }
    }

    public final void onDetachedFromWindow() {
        hg8 hg8;
        wr0 wr0 = this.w0;
        if (wr0 != null) {
            wr0.e((Window) null);
        }
        o5h o5h = this.y0;
        if (o5h != null && (hg8 = (hg8) o5h.a) != null) {
            hg8.c((View) o5h.c);
        }
    }

    public final void onStart() {
        super.onStart();
        BottomSheetBehavior bottomSheetBehavior = this.w;
        if (bottomSheetBehavior != null && bottomSheetBehavior.L == 5) {
            bottomSheetBehavior.K(4);
        }
    }

    public final void setCancelable(boolean z2) {
        o5h o5h;
        super.setCancelable(z2);
        if (this.Y != z2) {
            this.Y = z2;
            BottomSheetBehavior bottomSheetBehavior = this.w;
            if (bottomSheetBehavior != null) {
                bottomSheetBehavior.I(z2);
            }
            if (getWindow() != null && (o5h = this.y0) != null) {
                boolean z3 = this.Y;
                View view = (View) o5h.c;
                hg8 hg8 = (hg8) o5h.a;
                if (z3) {
                    if (hg8 != null) {
                        hg8.b((gg8) o5h.b, view, false);
                    }
                } else if (hg8 != null) {
                    hg8.c(view);
                }
            }
        }
    }

    public final void setCanceledOnTouchOutside(boolean z2) {
        super.setCanceledOnTouchOutside(z2);
        if (z2 && !this.Y) {
            this.Y = true;
        }
        this.Z = z2;
        this.v0 = true;
    }

    public final void setContentView(int i) {
        super.setContentView((View) i((View) null, i, (ViewGroup.LayoutParams) null));
    }

    public final void setContentView(View view) {
        super.setContentView((View) i(view, 0, (ViewGroup.LayoutParams) null));
    }

    public final void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        super.setContentView((View) i(view, 0, layoutParams));
    }
}
