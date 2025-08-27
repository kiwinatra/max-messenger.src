package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.util.TypedValue;
import java.lang.ref.WeakReference;
import java.util.WeakHashMap;

/* renamed from: a4d  reason: default package */
public final class a4d {
    public static final PorterDuff.Mode f = PorterDuff.Mode.SRC_IN;
    public static a4d g;
    public static final go0 h = new go0(6, 2);
    public WeakHashMap a;
    public final WeakHashMap b = new WeakHashMap(0);
    public TypedValue c;
    public boolean d;
    public q40 e;

    public static synchronized a4d c() {
        a4d a4d;
        synchronized (a4d.class) {
            try {
                if (g == null) {
                    g = new a4d();
                }
                a4d = g;
            } catch (Throwable th) {
                while (true) {
                    throw th;
                }
            }
        }
        return a4d;
    }

    public static synchronized PorterDuffColorFilter g(int i, PorterDuff.Mode mode) {
        PorterDuffColorFilter porterDuffColorFilter;
        synchronized (a4d.class) {
            go0 go0 = h;
            go0.getClass();
            int i2 = (31 + i) * 31;
            porterDuffColorFilter = (PorterDuffColorFilter) go0.c(Integer.valueOf(mode.hashCode() + i2));
            if (porterDuffColorFilter == null) {
                porterDuffColorFilter = new PorterDuffColorFilter(i, mode);
                PorterDuffColorFilter porterDuffColorFilter2 = (PorterDuffColorFilter) go0.d(Integer.valueOf(mode.hashCode() + i2), porterDuffColorFilter);
            }
        }
        return porterDuffColorFilter;
    }

    public final synchronized void a(Context context, long j, Drawable drawable) {
        try {
            Drawable.ConstantState constantState = drawable.getConstantState();
            if (constantState != null) {
                ya8 ya8 = (ya8) this.b.get(context);
                if (ya8 == null) {
                    ya8 = new ya8((Object) null);
                    this.b.put(context, ya8);
                }
                ya8.i(j, new WeakReference(constantState));
            }
        } catch (Throwable th) {
            while (true) {
                throw th;
            }
        }
    }

    public final Drawable b(int i, Context context) {
        if (this.c == null) {
            this.c = new TypedValue();
        }
        TypedValue typedValue = this.c;
        context.getResources().getValue(i, typedValue, true);
        long j = (((long) typedValue.assetCookie) << 32) | ((long) typedValue.data);
        Drawable d2 = d(j, context);
        if (d2 != null) {
            return d2;
        }
        LayerDrawable layerDrawable = null;
        if (this.e != null) {
            if (i == tfc.abc_cab_background_top_material) {
                layerDrawable = new LayerDrawable(new Drawable[]{f(context, tfc.abc_cab_background_internal_bg), f(context, tfc.abc_cab_background_top_mtrl_alpha)});
            } else if (i == tfc.abc_ratingbar_material) {
                layerDrawable = q40.o(this, context, nec.abc_star_big);
            } else if (i == tfc.abc_ratingbar_indicator_material) {
                layerDrawable = q40.o(this, context, nec.abc_star_medium);
            } else if (i == tfc.abc_ratingbar_small_material) {
                layerDrawable = q40.o(this, context, nec.abc_star_small);
            }
        }
        if (layerDrawable != null) {
            layerDrawable.setChangingConfigurations(typedValue.changingConfigurations);
            a(context, j, layerDrawable);
        }
        return layerDrawable;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x002e, code lost:
        return null;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized android.graphics.drawable.Drawable d(long r4, android.content.Context r6) {
        /*
            r3 = this;
            monitor-enter(r3)
            java.util.WeakHashMap r0 = r3.b     // Catch:{ all -> 0x0028 }
            java.lang.Object r0 = r0.get(r6)     // Catch:{ all -> 0x0028 }
            ya8 r0 = (defpackage.ya8) r0     // Catch:{ all -> 0x0028 }
            r1 = 0
            if (r0 != 0) goto L_0x000e
            monitor-exit(r3)
            return r1
        L_0x000e:
            java.lang.Object r2 = r0.f(r4)     // Catch:{ all -> 0x0028 }
            java.lang.ref.WeakReference r2 = (java.lang.ref.WeakReference) r2     // Catch:{ all -> 0x0028 }
            if (r2 == 0) goto L_0x002d
            java.lang.Object r2 = r2.get()     // Catch:{ all -> 0x0028 }
            android.graphics.drawable.Drawable$ConstantState r2 = (android.graphics.drawable.Drawable.ConstantState) r2     // Catch:{ all -> 0x0028 }
            if (r2 == 0) goto L_0x002a
            android.content.res.Resources r4 = r6.getResources()     // Catch:{ all -> 0x0028 }
            android.graphics.drawable.Drawable r4 = r2.newDrawable(r4)     // Catch:{ all -> 0x0028 }
            monitor-exit(r3)
            return r4
        L_0x0028:
            r4 = move-exception
            goto L_0x002f
        L_0x002a:
            r0.j(r4)     // Catch:{ all -> 0x0028 }
        L_0x002d:
            monitor-exit(r3)
            return r1
        L_0x002f:
            monitor-exit(r3)     // Catch:{ all -> 0x0028 }
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.a4d.d(long, android.content.Context):android.graphics.drawable.Drawable");
    }

    public final synchronized Drawable e(int i, Context context, boolean z) {
        Drawable b2;
        if (!this.d) {
            this.d = true;
            Drawable f2 = f(context, yec.abc_vector_test);
            if (f2 == null || (!(f2 instanceof w1g) && !"android.graphics.drawable.VectorDrawable".equals(f2.getClass().getName()))) {
                this.d = false;
                throw new IllegalStateException("This app has been built with an incorrect configuration. Please configure your build for VectorDrawableCompat.");
            }
        }
        b2 = b(i, context);
        if (b2 == null) {
            b2 = ew3.b(context, i);
        }
        if (b2 != null) {
            ColorStateList h2 = h(i, context);
            PorterDuff.Mode mode = null;
            if (h2 != null) {
                b2 = b2.mutate();
                ru4.h(b2, h2);
                if (this.e != null) {
                    if (i == tfc.abc_switch_thumb_material) {
                        mode = PorterDuff.Mode.MULTIPLY;
                    }
                }
                if (mode != null) {
                    ru4.i(b2, mode);
                }
            } else {
                if (this.e != null) {
                    if (i == tfc.abc_seekbar_track_material) {
                        LayerDrawable layerDrawable = (LayerDrawable) b2;
                        Drawable findDrawableByLayerId = layerDrawable.findDrawableByLayerId(16908288);
                        int c2 = zhf.c(hdc.colorControlNormal, context);
                        PorterDuff.Mode mode2 = ho.b;
                        q40.w(findDrawableByLayerId, c2);
                        q40.w(layerDrawable.findDrawableByLayerId(16908303), zhf.c(hdc.colorControlNormal, context));
                        q40.w(layerDrawable.findDrawableByLayerId(16908301), zhf.c(hdc.colorControlActivated, context));
                    } else if (i == tfc.abc_ratingbar_material || i == tfc.abc_ratingbar_indicator_material || i == tfc.abc_ratingbar_small_material) {
                        LayerDrawable layerDrawable2 = (LayerDrawable) b2;
                        Drawable findDrawableByLayerId2 = layerDrawable2.findDrawableByLayerId(16908288);
                        int b3 = zhf.b(hdc.colorControlNormal, context);
                        PorterDuff.Mode mode3 = ho.b;
                        q40.w(findDrawableByLayerId2, b3);
                        q40.w(layerDrawable2.findDrawableByLayerId(16908303), zhf.c(hdc.colorControlActivated, context));
                        q40.w(layerDrawable2.findDrawableByLayerId(16908301), zhf.c(hdc.colorControlActivated, context));
                    }
                }
                if (!i(context, i, b2) && z) {
                    b2 = null;
                }
            }
        }
        if (b2 != null) {
            yu4.a(b2);
        }
        return b2;
    }

    public final synchronized Drawable f(Context context, int i) {
        return e(i, context, false);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x0006, code lost:
        r0 = (defpackage.kge) r0.get(r5);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized android.content.res.ColorStateList h(int r4, android.content.Context r5) {
        /*
            r3 = this;
            monitor-enter(r3)
            java.util.WeakHashMap r0 = r3.a     // Catch:{ all -> 0x0047 }
            r1 = 0
            if (r0 == 0) goto L_0x0015
            java.lang.Object r0 = r0.get(r5)     // Catch:{ all -> 0x0047 }
            kge r0 = (defpackage.kge) r0     // Catch:{ all -> 0x0047 }
            if (r0 == 0) goto L_0x0015
            java.lang.Object r0 = r0.f(r4)     // Catch:{ all -> 0x0047 }
            android.content.res.ColorStateList r0 = (android.content.res.ColorStateList) r0     // Catch:{ all -> 0x0047 }
            goto L_0x0016
        L_0x0015:
            r0 = r1
        L_0x0016:
            if (r0 != 0) goto L_0x0049
            q40 r0 = r3.e     // Catch:{ all -> 0x0047 }
            if (r0 != 0) goto L_0x001d
            goto L_0x0021
        L_0x001d:
            android.content.res.ColorStateList r1 = r0.p(r4, r5)     // Catch:{ all -> 0x0047 }
        L_0x0021:
            if (r1 == 0) goto L_0x0045
            java.util.WeakHashMap r0 = r3.a     // Catch:{ all -> 0x0047 }
            if (r0 != 0) goto L_0x002e
            java.util.WeakHashMap r0 = new java.util.WeakHashMap     // Catch:{ all -> 0x0047 }
            r0.<init>()     // Catch:{ all -> 0x0047 }
            r3.a = r0     // Catch:{ all -> 0x0047 }
        L_0x002e:
            java.util.WeakHashMap r0 = r3.a     // Catch:{ all -> 0x0047 }
            java.lang.Object r0 = r0.get(r5)     // Catch:{ all -> 0x0047 }
            kge r0 = (defpackage.kge) r0     // Catch:{ all -> 0x0047 }
            if (r0 != 0) goto L_0x0042
            kge r0 = new kge     // Catch:{ all -> 0x0047 }
            r0.<init>()     // Catch:{ all -> 0x0047 }
            java.util.WeakHashMap r2 = r3.a     // Catch:{ all -> 0x0047 }
            r2.put(r5, r0)     // Catch:{ all -> 0x0047 }
        L_0x0042:
            r0.a(r4, r1)     // Catch:{ all -> 0x0047 }
        L_0x0045:
            r0 = r1
            goto L_0x0049
        L_0x0047:
            r4 = move-exception
            goto L_0x004b
        L_0x0049:
            monitor-exit(r3)
            return r0
        L_0x004b:
            monitor-exit(r3)     // Catch:{ all -> 0x0047 }
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.a4d.h(int, android.content.Context):android.content.res.ColorStateList");
    }

    /* JADX WARNING: Removed duplicated region for block: B:21:0x0053  */
    /* JADX WARNING: Removed duplicated region for block: B:27:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean i(android.content.Context r7, int r8, android.graphics.drawable.Drawable r9) {
        /*
            r6 = this;
            q40 r6 = r6.e
            r0 = 0
            if (r6 == 0) goto L_0x0068
            android.graphics.PorterDuff$Mode r1 = defpackage.ho.b
            java.lang.Object r2 = r6.a
            int[] r2 = (int[]) r2
            boolean r2 = defpackage.q40.i(r8, r2)
            r3 = 1
            r4 = -1
            if (r2 == 0) goto L_0x0018
            int r6 = defpackage.hdc.colorControlNormal
        L_0x0015:
            r2 = r3
        L_0x0016:
            r8 = r4
            goto L_0x0051
        L_0x0018:
            java.lang.Object r2 = r6.c
            int[] r2 = (int[]) r2
            boolean r2 = defpackage.q40.i(r8, r2)
            if (r2 == 0) goto L_0x0025
            int r6 = defpackage.hdc.colorControlActivated
            goto L_0x0015
        L_0x0025:
            java.lang.Object r6 = r6.o
            int[] r6 = (int[]) r6
            boolean r6 = defpackage.q40.i(r8, r6)
            r2 = 16842801(0x1010031, float:2.3693695E-38)
            if (r6 == 0) goto L_0x0036
            android.graphics.PorterDuff$Mode r1 = android.graphics.PorterDuff.Mode.MULTIPLY
        L_0x0034:
            r6 = r2
            goto L_0x0015
        L_0x0036:
            int r6 = defpackage.tfc.abc_list_divider_mtrl_alpha
            if (r8 != r6) goto L_0x0049
            r6 = 1109603123(0x42233333, float:40.8)
            int r6 = java.lang.Math.round(r6)
            r8 = 16842800(0x1010030, float:2.3693693E-38)
            r2 = r3
            r5 = r8
            r8 = r6
            r6 = r5
            goto L_0x0051
        L_0x0049:
            int r6 = defpackage.tfc.abc_dialog_material_background
            if (r8 != r6) goto L_0x004e
            goto L_0x0034
        L_0x004e:
            r6 = r0
            r2 = r6
            goto L_0x0016
        L_0x0051:
            if (r2 == 0) goto L_0x0068
            android.graphics.drawable.Drawable r9 = r9.mutate()
            int r6 = defpackage.zhf.c(r6, r7)
            android.graphics.PorterDuffColorFilter r6 = defpackage.ho.c(r6, r1)
            r9.setColorFilter(r6)
            if (r8 == r4) goto L_0x0067
            r9.setAlpha(r8)
        L_0x0067:
            r0 = r3
        L_0x0068:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.a4d.i(android.content.Context, int, android.graphics.drawable.Drawable):boolean");
    }
}
