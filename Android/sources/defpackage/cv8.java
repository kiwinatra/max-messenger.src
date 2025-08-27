package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.IntentFilter;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.drawable.AnimationDrawable;
import android.graphics.drawable.Drawable;
import android.os.AsyncTask;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.SparseArray;
import android.view.View;
import androidx.fragment.app.b;
import androidx.fragment.app.c;
import androidx.mediarouter.app.MediaRouteChooserDialogFragment;
import androidx.mediarouter.app.MediaRouteControllerDialogFragment;
import java.util.ArrayList;
import java.util.List;

/* renamed from: cv8  reason: default package */
public final class cv8 extends View {
    public static zu8 C0;
    public static final SparseArray D0 = new SparseArray(2);
    public static final int[] E0 = {16842912};
    public static final int[] F0 = {16842911};
    public boolean A0;
    public boolean B0;
    public final sw8 a;
    public final av8 b;
    public kw8 c;
    public ov8 o;
    public boolean v;
    public int v0;
    public int w;
    public int w0;
    public bv8 x;
    public final ColorStateList x0;
    public Drawable y;
    public final int y0;
    public int z;
    public final int z0;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public cv8(android.content.Context r10) {
        /*
            r9 = this;
            r0 = 0
            int r6 = defpackage.bdc.mediaRouteButtonStyle
            int r1 = defpackage.zw8.a
            android.view.ContextThemeWrapper r1 = new android.view.ContextThemeWrapper
            int r2 = defpackage.zw8.f(r10)
            r1.<init>(r10, r2)
            int r10 = defpackage.bdc.mediaRouteTheme
            int r10 = defpackage.zw8.h(r10, r1)
            if (r10 == 0) goto L_0x001c
            android.view.ContextThemeWrapper r2 = new android.view.ContextThemeWrapper
            r2.<init>(r1, r10)
            r1 = r2
        L_0x001c:
            r4 = 0
            r9.<init>(r1, r4, r6)
            kw8 r10 = defpackage.kw8.c
            r9.c = r10
            ov8 r10 = defpackage.ov8.a
            r9.o = r10
            r9.w = r0
            android.content.Context r10 = r9.getContext()
            int[] r1 = defpackage.joc.MediaRouteButton
            android.content.res.TypedArray r8 = r10.obtainStyledAttributes(r4, r1, r6, r0)
            int[] r3 = defpackage.joc.MediaRouteButton
            java.util.WeakHashMap r1 = defpackage.gag.a
            r7 = 0
            r1 = r9
            r2 = r10
            r5 = r8
            defpackage.bag.d(r1, r2, r3, r4, r5, r6, r7)
            boolean r1 = r9.isInEditMode()
            if (r1 == 0) goto L_0x0058
            r1 = 0
            r9.a = r1
            r9.b = r1
            int r1 = defpackage.joc.MediaRouteButton_externalRouteEnabledDrawableStatic
            int r0 = r8.getResourceId(r1, r0)
            android.graphics.drawable.Drawable r10 = defpackage.iq.D(r10, r0)
            r9.y = r10
            goto L_0x00ff
        L_0x0058:
            sw8 r1 = defpackage.sw8.d(r10)
            r9.a = r1
            av8 r1 = new av8
            r1.<init>(r9, r0)
            r9.b = r1
            defpackage.sw8.b()
            ow8 r1 = defpackage.sw8.c()
            rw8 r1 = r1.f()
            boolean r2 = r1.d()
            r3 = 1
            r2 = r2 ^ r3
            if (r2 == 0) goto L_0x007b
            int r1 = r1.h
            goto L_0x007c
        L_0x007b:
            r1 = r0
        L_0x007c:
            r9.w0 = r1
            r9.v0 = r1
            zu8 r1 = C0
            if (r1 != 0) goto L_0x008f
            zu8 r1 = new zu8
            android.content.Context r10 = r10.getApplicationContext()
            r1.<init>(r10)
            C0 = r1
        L_0x008f:
            int r10 = defpackage.joc.MediaRouteButton_mediaRouteButtonTint
            android.content.res.ColorStateList r10 = r8.getColorStateList(r10)
            r9.x0 = r10
            int r10 = defpackage.joc.MediaRouteButton_android_minWidth
            int r10 = r8.getDimensionPixelSize(r10, r0)
            r9.y0 = r10
            int r10 = defpackage.joc.MediaRouteButton_android_minHeight
            int r10 = r8.getDimensionPixelSize(r10, r0)
            r9.z0 = r10
            int r10 = defpackage.joc.MediaRouteButton_externalRouteEnabledDrawableStatic
            int r10 = r8.getResourceId(r10, r0)
            int r1 = defpackage.joc.MediaRouteButton_externalRouteEnabledDrawable
            int r1 = r8.getResourceId(r1, r0)
            r9.z = r1
            r8.recycle()
            int r1 = r9.z
            android.util.SparseArray r2 = D0
            if (r1 == 0) goto L_0x00cd
            java.lang.Object r1 = r2.get(r1)
            android.graphics.drawable.Drawable$ConstantState r1 = (android.graphics.drawable.Drawable.ConstantState) r1
            if (r1 == 0) goto L_0x00cd
            android.graphics.drawable.Drawable r1 = r1.newDrawable()
            r9.setRemoteIndicatorDrawable(r1)
        L_0x00cd:
            android.graphics.drawable.Drawable r1 = r9.y
            if (r1 != 0) goto L_0x00f9
            if (r10 == 0) goto L_0x00f6
            java.lang.Object r1 = r2.get(r10)
            android.graphics.drawable.Drawable$ConstantState r1 = (android.graphics.drawable.Drawable.ConstantState) r1
            if (r1 == 0) goto L_0x00e3
            android.graphics.drawable.Drawable r10 = r1.newDrawable()
            r9.setRemoteIndicatorDrawableInternal(r10)
            goto L_0x00f9
        L_0x00e3:
            bv8 r1 = new bv8
            android.content.Context r2 = r9.getContext()
            r1.<init>(r9, r10, r2)
            r9.x = r1
            java.util.concurrent.Executor r10 = android.os.AsyncTask.SERIAL_EXECUTOR
            java.lang.Void[] r0 = new java.lang.Void[r0]
            r1.executeOnExecutor(r10, r0)
            goto L_0x00f9
        L_0x00f6:
            r9.a()
        L_0x00f9:
            r9.e()
            r9.setClickable(r3)
        L_0x00ff:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cv8.<init>(android.content.Context):void");
    }

    private Activity getActivity() {
        for (Context context = getContext(); context instanceof ContextWrapper; context = ((ContextWrapper) context).getBaseContext()) {
            if (context instanceof Activity) {
                return (Activity) context;
            }
        }
        return null;
    }

    private c getFragmentManager() {
        Activity activity = getActivity();
        if (activity instanceof b) {
            return ((b) activity).v();
        }
        return null;
    }

    public final void a() {
        if (this.z > 0) {
            bv8 bv8 = this.x;
            if (bv8 != null) {
                bv8.cancel(false);
            }
            bv8 bv82 = new bv8(this, this.z, getContext());
            this.x = bv82;
            this.z = 0;
            bv82.executeOnExecutor(AsyncTask.SERIAL_EXECUTOR, new Void[0]);
        }
    }

    public final void b() {
        this.a.getClass();
        sw8.b();
        rw8 f = sw8.c().f();
        boolean z2 = true;
        boolean z3 = !f.d();
        int i = z3 ? f.h : 0;
        if (this.w0 != i) {
            this.w0 = i;
            e();
            refreshDrawableState();
        }
        if (i == 1) {
            a();
        }
        if (this.v) {
            if (!this.A0 && !z3 && !sw8.e(this.c)) {
                z2 = false;
            }
            setEnabled(z2);
        }
    }

    public final void c() {
        int i = this.w;
        if (i == 0 && !this.A0 && !C0.b) {
            i = 4;
        }
        super.setVisibility(i);
        Drawable drawable = this.y;
        if (drawable != null) {
            drawable.setVisible(getVisibility() == 0, false);
        }
    }

    public final boolean d() {
        if (!this.v) {
            return false;
        }
        sw8 sw8 = this.a;
        sw8.getClass();
        sw8.b();
        sw8.c();
        c fragmentManager = getFragmentManager();
        if (fragmentManager != null) {
            sw8.getClass();
            sw8.b();
            if (sw8.c().f().d()) {
                if (fragmentManager.E("android.support.v7.mediarouter:MediaRouteChooserDialogFragment") != null) {
                    return false;
                }
                this.o.getClass();
                MediaRouteChooserDialogFragment mediaRouteChooserDialogFragment = new MediaRouteChooserDialogFragment();
                kw8 kw8 = this.c;
                if (kw8 != null) {
                    mediaRouteChooserDialogFragment.Z2();
                    if (!mediaRouteChooserDialogFragment.D1.equals(kw8)) {
                        mediaRouteChooserDialogFragment.D1 = kw8;
                        Bundle bundle = mediaRouteChooserDialogFragment.x;
                        if (bundle == null) {
                            bundle = new Bundle();
                        }
                        bundle.putBundle("selector", kw8.a);
                        mediaRouteChooserDialogFragment.L2(bundle);
                        go goVar = mediaRouteChooserDialogFragment.C1;
                        if (goVar != null) {
                            if (mediaRouteChooserDialogFragment.B1) {
                                ((uv8) goVar).h(kw8);
                            } else {
                                ((ev8) goVar).h(kw8);
                            }
                        }
                    }
                    xe0 xe0 = new xe0(fragmentManager);
                    xe0.h(0, mediaRouteChooserDialogFragment, "android.support.v7.mediarouter:MediaRouteChooserDialogFragment", 1);
                    xe0.e(true);
                } else {
                    throw new IllegalArgumentException("selector must not be null");
                }
            } else if (fragmentManager.E("android.support.v7.mediarouter:MediaRouteControllerDialogFragment") != null) {
                return false;
            } else {
                this.o.getClass();
                MediaRouteControllerDialogFragment mediaRouteControllerDialogFragment = new MediaRouteControllerDialogFragment();
                kw8 kw82 = this.c;
                if (kw82 != null) {
                    if (mediaRouteControllerDialogFragment.D1 == null) {
                        Bundle bundle2 = mediaRouteControllerDialogFragment.x;
                        if (bundle2 != null) {
                            Bundle bundle3 = bundle2.getBundle("selector");
                            kw8 kw83 = null;
                            if (bundle3 != null) {
                                kw83 = new kw8((List) null, bundle3);
                            } else {
                                kw8 kw84 = kw8.c;
                            }
                            mediaRouteControllerDialogFragment.D1 = kw83;
                        }
                        if (mediaRouteControllerDialogFragment.D1 == null) {
                            mediaRouteControllerDialogFragment.D1 = kw8.c;
                        }
                    }
                    if (!mediaRouteControllerDialogFragment.D1.equals(kw82)) {
                        mediaRouteControllerDialogFragment.D1 = kw82;
                        Bundle bundle4 = mediaRouteControllerDialogFragment.x;
                        if (bundle4 == null) {
                            bundle4 = new Bundle();
                        }
                        bundle4.putBundle("selector", kw82.a);
                        mediaRouteControllerDialogFragment.L2(bundle4);
                        go goVar2 = mediaRouteControllerDialogFragment.C1;
                        if (goVar2 != null && mediaRouteControllerDialogFragment.B1) {
                            ((dw8) goVar2).j(kw82);
                        }
                    }
                    xe0 xe02 = new xe0(fragmentManager);
                    xe02.h(0, mediaRouteControllerDialogFragment, "android.support.v7.mediarouter:MediaRouteControllerDialogFragment", 1);
                    xe02.e(true);
                } else {
                    throw new IllegalArgumentException("selector must not be null");
                }
            }
            return true;
        }
        throw new IllegalStateException("The activity must be a subclass of FragmentActivity");
    }

    public final void drawableStateChanged() {
        super.drawableStateChanged();
        if (this.y != null) {
            this.y.setState(getDrawableState());
            if (this.y.getCurrent() instanceof AnimationDrawable) {
                AnimationDrawable animationDrawable = (AnimationDrawable) this.y.getCurrent();
                int i = this.w0;
                if (i == 1 || this.v0 != i) {
                    if (!animationDrawable.isRunning()) {
                        animationDrawable.start();
                    }
                } else if (i == 2 && !animationDrawable.isRunning()) {
                    animationDrawable.selectDrawable(animationDrawable.getNumberOfFrames() - 1);
                }
            }
            invalidate();
        }
        this.v0 = this.w0;
    }

    public final void e() {
        int i = this.w0;
        String string = getContext().getString(i != 1 ? i != 2 ? wlc.mr_cast_button_disconnected : wlc.mr_cast_button_connected : wlc.mr_cast_button_connecting);
        setContentDescription(string);
        if (!this.B0 || TextUtils.isEmpty(string)) {
            string = null;
        }
        pmf.a(this, string);
    }

    public ov8 getDialogFactory() {
        return this.o;
    }

    public kw8 getRouteSelector() {
        return this.c;
    }

    public final void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable drawable = this.y;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
    }

    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (!isInEditMode()) {
            this.v = true;
            if (!this.c.c()) {
                this.a.a(this.c, this.b, 0);
            }
            b();
            zu8 zu8 = C0;
            ArrayList arrayList = zu8.c;
            if (arrayList.size() == 0) {
                IntentFilter intentFilter = new IntentFilter();
                intentFilter.addAction("android.net.conn.CONNECTIVITY_CHANGE");
                zu8.a.registerReceiver(zu8, intentFilter);
            }
            arrayList.add(this);
        }
    }

    public final int[] onCreateDrawableState(int i) {
        int[] onCreateDrawableState = super.onCreateDrawableState(i + 1);
        if (this.a == null) {
            return onCreateDrawableState;
        }
        int i2 = this.w0;
        if (i2 == 1) {
            View.mergeDrawableStates(onCreateDrawableState, F0);
        } else if (i2 == 2) {
            View.mergeDrawableStates(onCreateDrawableState, E0);
        }
        return onCreateDrawableState;
    }

    public final void onDetachedFromWindow() {
        if (!isInEditMode()) {
            this.v = false;
            if (!this.c.c()) {
                this.a.f(this.b);
            }
            zu8 zu8 = C0;
            ArrayList arrayList = zu8.c;
            arrayList.remove(this);
            if (arrayList.size() == 0) {
                zu8.a.unregisterReceiver(zu8);
            }
        }
        super.onDetachedFromWindow();
    }

    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (this.y != null) {
            int paddingLeft = getPaddingLeft();
            int width = getWidth() - getPaddingRight();
            int paddingTop = getPaddingTop();
            int height = getHeight() - getPaddingBottom();
            int intrinsicWidth = this.y.getIntrinsicWidth();
            int intrinsicHeight = this.y.getIntrinsicHeight();
            int i = (((width - paddingLeft) - intrinsicWidth) / 2) + paddingLeft;
            int i2 = (((height - paddingTop) - intrinsicHeight) / 2) + paddingTop;
            this.y.setBounds(i, i2, intrinsicWidth + i, intrinsicHeight + i2);
            this.y.draw(canvas);
        }
    }

    public final void onMeasure(int i, int i2) {
        int i3;
        int size = View.MeasureSpec.getSize(i);
        int size2 = View.MeasureSpec.getSize(i2);
        int mode = View.MeasureSpec.getMode(i);
        int mode2 = View.MeasureSpec.getMode(i2);
        Drawable drawable = this.y;
        int i4 = 0;
        if (drawable != null) {
            i3 = getPaddingRight() + getPaddingLeft() + drawable.getIntrinsicWidth();
        } else {
            i3 = 0;
        }
        int max = Math.max(this.y0, i3);
        Drawable drawable2 = this.y;
        if (drawable2 != null) {
            i4 = getPaddingBottom() + getPaddingTop() + drawable2.getIntrinsicHeight();
        }
        int max2 = Math.max(this.z0, i4);
        if (mode == Integer.MIN_VALUE) {
            size = Math.min(size, max);
        } else if (mode != 1073741824) {
            size = max;
        }
        if (mode2 == Integer.MIN_VALUE) {
            size2 = Math.min(size2, max2);
        } else if (mode2 != 1073741824) {
            size2 = max2;
        }
        setMeasuredDimension(size, size2);
    }

    public final boolean performClick() {
        boolean performClick = super.performClick();
        if (!performClick) {
            playSoundEffect(0);
        }
        a();
        if (this.v) {
            this.a.getClass();
            sw8.b();
            sw8.c();
            c fragmentManager = getFragmentManager();
            if (fragmentManager != null) {
                sw8.b();
                if (sw8.c().f().d()) {
                    if (fragmentManager.E("android.support.v7.mediarouter:MediaRouteChooserDialogFragment") == null) {
                        this.o.getClass();
                        MediaRouteChooserDialogFragment mediaRouteChooserDialogFragment = new MediaRouteChooserDialogFragment();
                        kw8 kw8 = this.c;
                        if (kw8 != null) {
                            mediaRouteChooserDialogFragment.Z2();
                            if (!mediaRouteChooserDialogFragment.D1.equals(kw8)) {
                                mediaRouteChooserDialogFragment.D1 = kw8;
                                Bundle bundle = mediaRouteChooserDialogFragment.x;
                                if (bundle == null) {
                                    bundle = new Bundle();
                                }
                                bundle.putBundle("selector", kw8.a);
                                mediaRouteChooserDialogFragment.L2(bundle);
                                go goVar = mediaRouteChooserDialogFragment.C1;
                                if (goVar != null) {
                                    if (mediaRouteChooserDialogFragment.B1) {
                                        ((uv8) goVar).h(kw8);
                                    } else {
                                        ((ev8) goVar).h(kw8);
                                    }
                                }
                            }
                            xe0 xe0 = new xe0(fragmentManager);
                            xe0.h(0, mediaRouteChooserDialogFragment, "android.support.v7.mediarouter:MediaRouteChooserDialogFragment", 1);
                            xe0.e(true);
                            return true;
                        }
                        throw new IllegalArgumentException("selector must not be null");
                    }
                } else if (fragmentManager.E("android.support.v7.mediarouter:MediaRouteControllerDialogFragment") == null) {
                    this.o.getClass();
                    MediaRouteControllerDialogFragment mediaRouteControllerDialogFragment = new MediaRouteControllerDialogFragment();
                    kw8 kw82 = this.c;
                    if (kw82 != null) {
                        if (mediaRouteControllerDialogFragment.D1 == null) {
                            Bundle bundle2 = mediaRouteControllerDialogFragment.x;
                            if (bundle2 != null) {
                                Bundle bundle3 = bundle2.getBundle("selector");
                                kw8 kw83 = null;
                                if (bundle3 != null) {
                                    kw83 = new kw8((List) null, bundle3);
                                } else {
                                    kw8 kw84 = kw8.c;
                                }
                                mediaRouteControllerDialogFragment.D1 = kw83;
                            }
                            if (mediaRouteControllerDialogFragment.D1 == null) {
                                mediaRouteControllerDialogFragment.D1 = kw8.c;
                            }
                        }
                        if (!mediaRouteControllerDialogFragment.D1.equals(kw82)) {
                            mediaRouteControllerDialogFragment.D1 = kw82;
                            Bundle bundle4 = mediaRouteControllerDialogFragment.x;
                            if (bundle4 == null) {
                                bundle4 = new Bundle();
                            }
                            bundle4.putBundle("selector", kw82.a);
                            mediaRouteControllerDialogFragment.L2(bundle4);
                            go goVar2 = mediaRouteControllerDialogFragment.C1;
                            if (goVar2 != null && mediaRouteControllerDialogFragment.B1) {
                                ((dw8) goVar2).j(kw82);
                            }
                        }
                        xe0 xe02 = new xe0(fragmentManager);
                        xe02.h(0, mediaRouteControllerDialogFragment, "android.support.v7.mediarouter:MediaRouteControllerDialogFragment", 1);
                        xe02.e(true);
                        return true;
                    }
                    throw new IllegalArgumentException("selector must not be null");
                }
            } else {
                throw new IllegalStateException("The activity must be a subclass of FragmentActivity");
            }
        }
        if (!performClick) {
            return false;
        }
        return true;
    }

    public void setAlwaysVisible(boolean z2) {
        if (z2 != this.A0) {
            this.A0 = z2;
            c();
            b();
        }
    }

    public void setCheatSheetEnabled(boolean z2) {
        if (z2 != this.B0) {
            this.B0 = z2;
            e();
        }
    }

    public void setDialogFactory(ov8 ov8) {
        if (ov8 != null) {
            this.o = ov8;
            return;
        }
        throw new IllegalArgumentException("factory must not be null");
    }

    public void setRemoteIndicatorDrawable(Drawable drawable) {
        this.z = 0;
        setRemoteIndicatorDrawableInternal(drawable);
    }

    public void setRemoteIndicatorDrawableInternal(Drawable drawable) {
        bv8 bv8 = this.x;
        if (bv8 != null) {
            bv8.cancel(false);
        }
        Drawable drawable2 = this.y;
        if (drawable2 != null) {
            drawable2.setCallback((Drawable.Callback) null);
            unscheduleDrawable(this.y);
        }
        if (drawable != null) {
            ColorStateList colorStateList = this.x0;
            if (colorStateList != null) {
                drawable = drawable.mutate();
                ru4.h(drawable, colorStateList);
            }
            drawable.setCallback(this);
            drawable.setState(getDrawableState());
            drawable.setVisible(getVisibility() == 0, false);
        }
        this.y = drawable;
        refreshDrawableState();
    }

    public void setRouteSelector(kw8 kw8) {
        if (kw8 == null) {
            throw new IllegalArgumentException("selector must not be null");
        } else if (!this.c.equals(kw8)) {
            if (this.v) {
                boolean c2 = this.c.c();
                av8 av8 = this.b;
                sw8 sw8 = this.a;
                if (!c2) {
                    sw8.f(av8);
                }
                if (!kw8.c()) {
                    sw8.a(kw8, av8, 0);
                }
            }
            this.c = kw8;
            b();
        }
    }

    public void setVisibility(int i) {
        this.w = i;
        c();
    }

    public final boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.y;
    }
}
