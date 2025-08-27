package defpackage;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.text.TextPaint;
import android.util.DisplayMetrics;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.KotlinVersion;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.math.MathKt;

/* renamed from: vo3  reason: default package */
public final class vo3 extends zyc implements phf {
    public final /* synthetic */ int a = 1;
    public final Rect b;
    public final Object c;
    public final Object o;
    public final Object v;
    public Object w;
    public final Object x;

    public vo3(fl2 fl2, k2b k2b, uo3 uo3) {
        this.o = fl2;
        this.v = uo3;
        this.b = new Rect();
        ez9 ez9 = ri7.a;
        this.w = new ez9();
        Paint paint = new Paint();
        paint.setStrokeWidth(vo4.c().getDisplayMetrics().density * 0.5f);
        this.x = paint;
        this.c = new pl7(0);
        onThemeChanged(k2b);
    }

    public static boolean j(int i, Integer num, Integer num2) {
        int i2 = m1b.r;
        return i == i2 && (num == null || num.intValue() != i2) && (num2 == null || num2.intValue() != i2);
    }

    public static final void k(vo3 vo3, Canvas canvas) {
        RectF rectF = (RectF) vo3.o;
        Path.Direction direction = Path.Direction.CCW;
        float[] fArr = (float[]) vo3.v;
        ((Path) vo3.w).addRoundRect(rectF, fArr, direction);
        Path path = (Path) vo3.w;
        canvas.drawPath(path, (Paint) vo3.x);
        path.reset();
        rectF.set(Float.MAX_VALUE, Float.MAX_VALUE, Float.MIN_VALUE, Float.MIN_VALUE);
        ArraysKt___ArraysJvmKt.fill$default(fArr, (float) c44.DEFAULT_ASPECT_RATIO, 0, 0, 6, (Object) null);
    }

    public static final void l(vo3 vo3) {
        RectF rectF = (RectF) vo3.o;
        float f = rectF.left;
        Rect rect = vo3.b;
        rectF.left = Math.min(f, (float) rect.left);
        RectF rectF2 = (RectF) vo3.o;
        rectF2.top = Math.min(rectF2.top, (float) rect.top);
        rectF2.right = Math.max(rectF2.right, (float) rect.right);
        rectF2.bottom = Math.max(rectF2.bottom, (float) rect.bottom);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:58:0x0106, code lost:
        if (r1 != false) goto L_0x0108;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void f(android.graphics.Rect r6, android.view.View r7, androidx.recyclerview.widget.RecyclerView r8, defpackage.lzc r9) {
        /*
            r5 = this;
            int r0 = r5.a
            switch(r0) {
                case 0: goto L_0x0136;
                case 1: goto L_0x00b5;
                case 2: goto L_0x0009;
                default: goto L_0x0005;
            }
        L_0x0005:
            super.f(r6, r7, r8, r9)
            return
        L_0x0009:
            r8.getClass()
            int r9 = androidx.recyclerview.widget.RecyclerView.S(r7)
            tyc r0 = r8.getAdapter()
            boolean r1 = r0 instanceof defpackage.pae
            r2 = 0
            if (r1 == 0) goto L_0x001c
            pae r0 = (defpackage.pae) r0
            goto L_0x001d
        L_0x001c:
            r0 = r2
        L_0x001d:
            r1 = -1
            if (r9 == r1) goto L_0x00b4
            if (r0 != 0) goto L_0x0024
            goto L_0x00b4
        L_0x0024:
            java.lang.Object r1 = r0.o
            ov r1 = (defpackage.ov) r1
            java.util.List r3 = r1.f
            int r4 = r9 + -1
            java.lang.Object r3 = kotlin.collections.CollectionsKt.getOrNull(r3, r4)
            lz7 r3 = (defpackage.lz7) r3
            if (r3 == 0) goto L_0x003d
            int r3 = r3.i()
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            goto L_0x003e
        L_0x003d:
            r3 = r2
        L_0x003e:
            int r0 = r0.l(r9)
            java.util.List r1 = r1.f
            int r9 = r9 + 1
            java.lang.Object r9 = kotlin.collections.CollectionsKt.getOrNull(r1, r9)
            lz7 r9 = (defpackage.lz7) r9
            if (r9 == 0) goto L_0x0056
            int r9 = r9.i()
            java.lang.Integer r2 = java.lang.Integer.valueOf(r9)
        L_0x0056:
            r9 = 4
            float r9 = (float) r9
            android.content.res.Resources r1 = defpackage.vo4.c()
            android.util.DisplayMetrics r1 = r1.getDisplayMetrics()
            float r1 = r1.density
            float r9 = r9 * r1
            int r9 = kotlin.math.MathKt.roundToInt((float) r9)
            int r1 = defpackage.m1b.r
            if (r0 != r1) goto L_0x0083
            if (r3 != 0) goto L_0x006e
            goto L_0x0074
        L_0x006e:
            int r4 = r3.intValue()
            if (r4 == r1) goto L_0x0083
        L_0x0074:
            if (r2 != 0) goto L_0x0077
            goto L_0x0083
        L_0x0077:
            int r4 = r2.intValue()
            if (r4 != r1) goto L_0x0083
            int r0 = r6.top
            int r0 = r0 + r9
            r6.top = r0
            goto L_0x00ad
        L_0x0083:
            if (r0 != r1) goto L_0x009d
            if (r3 != 0) goto L_0x0088
            goto L_0x009d
        L_0x0088:
            int r4 = r3.intValue()
            if (r4 != r1) goto L_0x009d
            if (r2 != 0) goto L_0x0091
            goto L_0x0097
        L_0x0091:
            int r4 = r2.intValue()
            if (r4 == r1) goto L_0x009d
        L_0x0097:
            int r0 = r6.bottom
            int r0 = r0 + r9
            r6.bottom = r0
            goto L_0x00ad
        L_0x009d:
            boolean r0 = j(r0, r3, r2)
            if (r0 == 0) goto L_0x00ad
            int r0 = r6.top
            int r0 = r0 + r9
            r6.top = r0
            int r0 = r6.bottom
            int r0 = r0 + r9
            r6.bottom = r0
        L_0x00ad:
            java.lang.Object r5 = r5.c
            pl7 r5 = (defpackage.pl7) r5
            r5.c(r6, r7, r8)
        L_0x00b4:
            return
        L_0x00b5:
            super.f(r6, r7, r8, r9)
            r8.getClass()
            int r9 = androidx.recyclerview.widget.RecyclerView.S(r7)
            boolean r0 = r5.i(r9)
            if (r0 != 0) goto L_0x0108
            java.lang.Object r0 = r5.o
            androidx.recyclerview.widget.RecyclerView r0 = (androidx.recyclerview.widget.RecyclerView) r0
            androidx.recyclerview.widget.GridLayoutManager r0 = defpackage.y7e.u(r0)
            r1 = 0
            if (r0 == 0) goto L_0x00d3
            int r0 = r0.F
            goto L_0x00d4
        L_0x00d3:
            r0 = r1
        L_0x00d4:
            if (r9 <= 0) goto L_0x0106
            int r0 = r9 - r0
            if (r0 < 0) goto L_0x0106
            java.lang.Object r2 = r5.v
            t56 r2 = (defpackage.t56) r2
            int r3 = r2.j()
            if (r3 > 0) goto L_0x00e5
            goto L_0x0106
        L_0x00e5:
            q7a r0 = r2.L(r0)
            r1 = 0
            if (r0 == 0) goto L_0x00f3
            int r0 = r0.c
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            goto L_0x00f4
        L_0x00f3:
            r0 = r1
        L_0x00f4:
            q7a r9 = r2.L(r9)
            if (r9 == 0) goto L_0x0100
            int r9 = r9.c
            java.lang.Integer r1 = java.lang.Integer.valueOf(r9)
        L_0x0100:
            boolean r9 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r0, (java.lang.Object) r1)
            r1 = r9 ^ 1
        L_0x0106:
            if (r1 == 0) goto L_0x012e
        L_0x0108:
            int r9 = r6.top
            r0 = 10
            float r0 = (float) r0
            android.content.res.Resources r1 = defpackage.vo4.c()
            android.util.DisplayMetrics r1 = r1.getDisplayMetrics()
            float r1 = r1.density
            float r0 = r0 * r1
            int r0 = kotlin.math.MathKt.roundToInt((float) r0)
            java.lang.Object r1 = r5.x
            android.text.TextPaint r1 = (android.text.TextPaint) r1
            float r2 = r1.descent()
            float r1 = r1.ascent()
            float r2 = r2 - r1
            int r1 = (int) r2
            int r0 = r0 + r1
            int r0 = r0 + r9
            r6.top = r0
        L_0x012e:
            java.lang.Object r5 = r5.c
            pl7 r5 = (defpackage.pl7) r5
            r5.c(r6, r7, r8)
            return
        L_0x0136:
            super.f(r6, r7, r8, r9)
            r8.getClass()
            int r9 = androidx.recyclerview.widget.RecyclerView.S(r7)
            java.lang.Object r0 = r5.o
            fl2 r0 = (defpackage.fl2) r0
            java.lang.Object r1 = r5.v
            uo3 r1 = (defpackage.uo3) r1
            if (r1 == 0) goto L_0x0153
            boolean r1 = r1.c(r9)
            r2 = 1
            if (r1 != r2) goto L_0x0153
            r1 = 0
            goto L_0x0157
        L_0x0153:
            java.lang.Character r1 = r0.d(r9)
        L_0x0157:
            java.lang.Object r2 = r5.w
            ez9 r2 = (defpackage.ez9) r2
            if (r1 != 0) goto L_0x0161
            r2.h(r9)
            goto L_0x01b1
        L_0x0161:
            r3 = 10
            if (r9 <= 0) goto L_0x0198
            int r4 = r9 + -1
            java.lang.Character r0 = r0.d(r4)
            boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r1, (java.lang.Object) r0)
            if (r0 != 0) goto L_0x0194
            float r0 = (float) r3
            android.content.res.Resources r1 = defpackage.vo4.c()
            android.util.DisplayMetrics r1 = r1.getDisplayMetrics()
            float r1 = r1.density
            float r0 = r0 * r1
            int r0 = kotlin.math.MathKt.roundToInt((float) r0)
            int r0 = r0 * 2
            float r0 = (float) r0
            java.lang.Object r1 = r5.x
            android.graphics.Paint r1 = (android.graphics.Paint) r1
            float r1 = r1.getStrokeWidth()
            float r1 = r1 + r0
            int r0 = (int) r1
            r6.top = r0
            r2.b(r9)
            goto L_0x01aa
        L_0x0194:
            r2.h(r9)
            goto L_0x01aa
        L_0x0198:
            float r9 = (float) r3
            android.content.res.Resources r0 = defpackage.vo4.c()
            android.util.DisplayMetrics r0 = r0.getDisplayMetrics()
            float r0 = r0.density
            float r9 = r9 * r0
            int r9 = kotlin.math.MathKt.roundToInt((float) r9)
            r6.top = r9
        L_0x01aa:
            java.lang.Object r5 = r5.c
            pl7 r5 = (defpackage.pl7) r5
            r5.c(r6, r7, r8)
        L_0x01b1:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.vo3.f(android.graphics.Rect, android.view.View, androidx.recyclerview.widget.RecyclerView, lzc):void");
    }

    public void g(Canvas canvas, RecyclerView recyclerView, lzc lzc) {
        switch (this.a) {
            case 2:
                RectF rectF = (RectF) this.o;
                rectF.set(Float.MAX_VALUE, Float.MAX_VALUE, Float.MIN_VALUE, Float.MIN_VALUE);
                float f = vo4.c().getDisplayMetrics().density * 16.0f;
                tyc adapter = recyclerView.getAdapter();
                pae pae = adapter instanceof pae ? (pae) adapter : null;
                if (pae != null) {
                    int childCount = recyclerView.getChildCount();
                    char c2 = 0;
                    int i = 0;
                    while (i < childCount) {
                        View childAt = recyclerView.getChildAt(i);
                        int S = RecyclerView.S(childAt);
                        if (S != -1) {
                            Rect rect = this.b;
                            ((pl7) this.c).a(rect, childAt, S);
                            ov ovVar = (ov) pae.o;
                            lz7 lz7 = (lz7) CollectionsKt.getOrNull(ovVar.f, S - 1);
                            Integer valueOf = lz7 != null ? Integer.valueOf(lz7.i()) : null;
                            int l = pae.l(S);
                            lz7 lz72 = (lz7) CollectionsKt.getOrNull(ovVar.f, S + 1);
                            Integer valueOf2 = lz72 != null ? Integer.valueOf(lz72.i()) : null;
                            int i2 = m1b.r;
                            char c3 = (l != i2 || (valueOf != null && valueOf.intValue() == i2) || valueOf2 == null || valueOf2.intValue() != i2) ? c2 : 1;
                            float[] fArr = (float[]) this.v;
                            if (c3 != 0 || j(l, valueOf, valueOf2)) {
                                fArr[c2] = f;
                                fArr[1] = f;
                                fArr[2] = f;
                                fArr[3] = f;
                                rectF.set((float) rect.left, (float) rect.top, (float) rect.right, (float) rect.bottom);
                            }
                            if ((l == i2 && valueOf != null && valueOf.intValue() == i2 && (valueOf2 == null || valueOf2.intValue() != i2)) || j(l, valueOf, valueOf2)) {
                                l(this);
                                fArr[4] = f;
                                fArr[5] = f;
                                fArr[6] = f;
                                fArr[7] = f;
                                k(this, canvas);
                            } else if (l == i2 && valueOf != null && valueOf.intValue() == i2 && valueOf2 != null && valueOf2.intValue() == i2) {
                                l(this);
                            }
                            i++;
                            c2 = 0;
                        } else {
                            return;
                        }
                    }
                    if (rectF.height() > c44.DEFAULT_ASPECT_RATIO) {
                        k(this, canvas);
                        return;
                    }
                    return;
                }
                return;
            default:
                return;
        }
    }

    public void h(Canvas canvas, RecyclerView recyclerView) {
        switch (this.a) {
            case 0:
                int roundToInt = MathKt.roundToInt(((float) 12) * vo4.c().getDisplayMetrics().density);
                int i = 0;
                while (true) {
                    if (i < recyclerView.getChildCount()) {
                        int i2 = i + 1;
                        View childAt = recyclerView.getChildAt(i);
                        if (childAt != null) {
                            recyclerView.getClass();
                            int S = RecyclerView.S(childAt);
                            if (((ez9) this.w).a(S)) {
                                Rect rect = this.b;
                                ((pl7) this.c).b(rect, childAt, S);
                                canvas.drawLine((float) (rect.left + roundToInt), (float) rect.centerY(), (float) (rect.right - roundToInt), (float) rect.centerY(), (Paint) this.x);
                            }
                            i = i2;
                        } else {
                            throw new IndexOutOfBoundsException();
                        }
                    } else {
                        return;
                    }
                }
            case 1:
                int i3 = 0;
                while (true) {
                    if (i3 < recyclerView.getChildCount()) {
                        int i4 = i3 + 1;
                        View childAt2 = recyclerView.getChildAt(i3);
                        if (childAt2 != null) {
                            recyclerView.getClass();
                            int S2 = RecyclerView.S(childAt2);
                            if (S2 != -1 && i(S2)) {
                                Integer valueOf = Integer.valueOf(S2);
                                Rect rect2 = this.b;
                                ((pl7) this.c).b(rect2, childAt2, S2);
                                int i5 = rect2.top;
                                TextPaint textPaint = (TextPaint) this.x;
                                canvas.drawText((String) ((Function1) this.w).invoke(valueOf), (float) rect2.left, textPaint.descent() + ((float) g63.b((float) 10, vo4.c().getDisplayMetrics().density, i5)), textPaint);
                            }
                            i3 = i4;
                        } else {
                            throw new IndexOutOfBoundsException();
                        }
                    } else {
                        return;
                    }
                }
            case 3:
                int roundToInt2 = MathKt.roundToInt(((float) 4) * vo4.c().getDisplayMetrics().density);
                int roundToInt3 = MathKt.roundToInt(((float) 24) * vo4.c().getDisplayMetrics().density);
                int i6 = 0;
                while (true) {
                    if (i6 < recyclerView.getChildCount()) {
                        int i7 = i6 + 1;
                        View childAt3 = recyclerView.getChildAt(i6);
                        if (childAt3 != null) {
                            recyclerView.getClass();
                            int S3 = RecyclerView.S(childAt3);
                            Rect rect3 = this.b;
                            RecyclerView.W(rect3, childAt3);
                            if (((Boolean) ((Function1) this.v).invoke(Integer.valueOf(S3))).booleanValue()) {
                                ((Drawable) this.w).setState((int[]) this.x);
                            } else {
                                ((Drawable) this.w).setState((int[]) this.c);
                            }
                            Drawable drawable = (Drawable) this.w;
                            drawable.setAlpha(MathKt.roundToInt(childAt3.getAlpha() * ((float) KotlinVersion.MAX_COMPONENT_VALUE)));
                            int i8 = rect3.right - roundToInt2;
                            int i9 = rect3.top;
                            drawable.setBounds(i8 - roundToInt3, i9 + roundToInt2, i8, i9 + roundToInt3 + roundToInt2);
                            drawable.draw(canvas);
                            i6 = i7;
                        } else {
                            throw new IndexOutOfBoundsException();
                        }
                    } else {
                        return;
                    }
                }
            default:
                return;
        }
    }

    public boolean i(int i) {
        if (i <= 0) {
            return false;
        }
        t56 t56 = (t56) this.v;
        if (t56.j() <= 0) {
            return false;
        }
        q7a L = t56.L(i - 1);
        Integer num = null;
        Integer valueOf = L != null ? Integer.valueOf(L.c) : null;
        q7a L2 = t56.L(i);
        if (L2 != null) {
            num = Integer.valueOf(L2.c);
        }
        return !Intrinsics.areEqual((Object) valueOf, (Object) num);
    }

    public final void onThemeChanged(k2b k2b) {
        switch (this.a) {
            case 0:
                ((Paint) this.x).setColor(k2b.h().j);
                return;
            case 1:
                ogf ogf = puf.n;
                RecyclerView recyclerView = (RecyclerView) this.o;
                DisplayMetrics displayMetrics = recyclerView.getResources().getDisplayMetrics();
                TextPaint textPaint = (TextPaint) this.x;
                ogf.a(textPaint, displayMetrics, uy4.b);
                textPaint.setColor(fu4.k.e(recyclerView.getContext()).f().getText().h);
                return;
            case 2:
                ((Paint) this.x).setColor(k2b.c().f);
                return;
            default:
                this.w = (Drawable) ((Function0) this.o).invoke();
                return;
        }
    }

    public vo3(ex9 ex9, fx9 fx9) {
        this.o = ex9;
        this.v = fx9;
        this.w = (Drawable) ex9.invoke();
        this.b = new Rect();
        this.x = new int[]{16842912};
        this.c = new int[]{-16842912};
    }

    public vo3(k2b k2b) {
        Paint paint = new Paint();
        paint.setAntiAlias(true);
        paint.setStyle(Paint.Style.FILL);
        this.x = paint;
        this.o = new RectF();
        this.b = new Rect();
        this.v = new float[8];
        this.w = new Path();
        this.c = new pl7(0);
        onThemeChanged(k2b);
    }

    public vo3(RecyclerView recyclerView, t56 t56, z7a z7a) {
        this.o = recyclerView;
        this.v = t56;
        this.w = z7a;
        this.b = new Rect();
        this.x = new TextPaint();
        onThemeChanged(fu4.k.e(recyclerView.getContext()).f());
        this.c = new pl7(0);
    }
}
