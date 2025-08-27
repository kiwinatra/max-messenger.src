package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.math.MathKt;

/* renamed from: e1b  reason: default package */
public final class e1b extends ViewGroup {
    public int a = MathKt.roundToInt(((float) 28) * vo4.c().getDisplayMetrics().density);
    public int b = MathKt.roundToInt(((float) 10) * vo4.c().getDisplayMetrics().density);
    public int c = MathKt.roundToInt(((float) 2) * vo4.c().getDisplayMetrics().density);
    public final Paint o;
    public final Lazy v;
    public final xf w;
    public final ArrayList x;

    public e1b(Context context) {
        super(context);
        Paint paint = new Paint(1);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
        this.o = paint;
        this.v = LazyKt.lazy(LazyThreadSafetyMode.NONE, new a1b(context, 3));
        this.w = new xf(3, this);
        this.x = new ArrayList();
    }

    private final int getAvatarsWidth() {
        int i = this.a;
        ArrayList arrayList = this.x;
        return (arrayList.size() * i) - ((arrayList.size() - 1) * this.b);
    }

    /* JADX INFO: finally extract failed */
    public final void dispatchDraw(Canvas canvas) {
        float f = ((float) this.a) / 2.0f;
        float measuredHeight = (((float) getMeasuredHeight()) / 2.0f) - f;
        float f2 = vo4.c().getDisplayMetrics().density * c44.DEFAULT_ASPECT_RATIO;
        int saveLayer = canvas.saveLayer(c44.DEFAULT_ASPECT_RATIO, c44.DEFAULT_ASPECT_RATIO, (float) getWidth(), (float) getHeight(), (Paint) null);
        ArrayList arrayList = this.x;
        Iterator it = arrayList.iterator();
        int i = 0;
        while (it.hasNext()) {
            Object next = it.next();
            int i2 = i + 1;
            if (i < 0) {
                CollectionsKt.throwIndexOverflow();
            }
            Drawable drawable = (Drawable) next;
            int save = canvas.save();
            canvas.translate(f2, measuredHeight);
            try {
                int i3 = this.a;
                int i4 = i3 - this.b;
                float f3 = ((float) i3) / 2.0f;
                float f4 = (float) i4;
                f2 += f4;
                drawable.draw(canvas);
                if (i != CollectionsKt.getLastIndex(arrayList)) {
                    canvas.drawCircle(f4 + f, f3, ((float) this.c) + f, this.o);
                }
                canvas.restoreToCount(save);
                i = i2;
            } catch (Throwable th) {
                canvas.restoreToCount(save);
                throw th;
            }
        }
        canvas.restoreToCount(saveLayer);
        super.dispatchDraw(canvas);
    }

    public final int getAvatarOffset() {
        return this.b;
    }

    public final int getAvatarSize() {
        return this.a;
    }

    public final int getStrokeWidth() {
        return this.c;
    }

    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        View t = y7e.t(this.v);
        if (t != null) {
            int b2 = g63.b((float) 8, vo4.c().getDisplayMetrics().density, getAvatarsWidth());
            t.layout(b2, (getMeasuredHeight() / 2) - (t.getMeasuredHeight() / 2), t.getMeasuredWidth() + b2, (t.getMeasuredHeight() / 2) + (getMeasuredHeight() / 2));
        }
    }

    /* JADX WARNING: type inference failed for: r2v6, types: [android.view.ViewGroup$LayoutParams] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onMeasure(int r7, int r8) {
        /*
            r6 = this;
            int r7 = android.view.View.MeasureSpec.getSize(r7)
            int r8 = r6.getAvatarsWidth()
            int r0 = r6.a
            kotlin.Lazy r1 = r6.v
            android.view.View r1 = defpackage.y7e.t(r1)
            if (r1 == 0) goto L_0x0078
            int r7 = r7 - r8
            r0 = 8
            float r0 = (float) r0
            android.content.res.Resources r2 = defpackage.vo4.c()
            android.util.DisplayMetrics r2 = r2.getDisplayMetrics()
            float r2 = r2.density
            int r7 = defpackage.a81.e(r0, r2, r7)
            android.view.ViewGroup$LayoutParams r2 = r6.getLayoutParams()
            boolean r3 = r2 instanceof android.view.ViewGroup.MarginLayoutParams
            r4 = 0
            if (r3 == 0) goto L_0x0030
            android.view.ViewGroup$MarginLayoutParams r2 = (android.view.ViewGroup.MarginLayoutParams) r2
            goto L_0x0031
        L_0x0030:
            r2 = r4
        L_0x0031:
            r3 = 0
            if (r2 == 0) goto L_0x0037
            int r2 = r2.leftMargin
            goto L_0x0038
        L_0x0037:
            r2 = r3
        L_0x0038:
            int r7 = r7 - r2
            android.view.ViewGroup$LayoutParams r2 = r6.getLayoutParams()
            boolean r5 = r2 instanceof android.view.ViewGroup.MarginLayoutParams
            if (r5 == 0) goto L_0x0044
            r4 = r2
            android.view.ViewGroup$MarginLayoutParams r4 = (android.view.ViewGroup.MarginLayoutParams) r4
        L_0x0044:
            if (r4 == 0) goto L_0x0049
            int r2 = r4.rightMargin
            goto L_0x004a
        L_0x0049:
            r2 = r3
        L_0x004a:
            int r7 = r7 - r2
            int r7 = kotlin.ranges.RangesKt.coerceAtLeast((int) r7, (int) r3)
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            int r7 = android.view.View.MeasureSpec.makeMeasureSpec(r7, r2)
            int r2 = android.view.View.MeasureSpec.makeMeasureSpec(r3, r3)
            r1.measure(r7, r2)
            int r7 = r1.getMeasuredWidth()
            android.content.res.Resources r2 = defpackage.vo4.c()
            android.util.DisplayMetrics r2 = r2.getDisplayMetrics()
            float r2 = r2.density
            int r8 = defpackage.tr1.e(r0, r2, r7, r8)
            int r7 = r6.a
            int r0 = r1.getMeasuredHeight()
            int r0 = java.lang.Math.max(r7, r0)
        L_0x0078:
            r6.setMeasuredDimension(r8, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.e1b.onMeasure(int, int):void");
    }

    public final void setAvatarOffset(int i) {
        this.b = i;
        requestLayout();
        invalidate();
    }

    public final void setAvatarSize(int i) {
        this.a = i;
        requestLayout();
        invalidate();
    }

    public final void setAvatars(List<Pair<gd0, String>> list) {
        ArrayList arrayList = this.x;
        arrayList.clear();
        if (list == null) {
            requestLayout();
            invalidate();
            return;
        }
        int i = 0;
        for (Object next : list) {
            int i2 = i + 1;
            if (i < 0) {
                CollectionsKt.throwIndexOverflow();
            }
            Pair pair = (Pair) next;
            eoa eoa = new eoa(getContext());
            eoa.setCallback(this.w);
            int i3 = this.a;
            eoa.setBounds(0, 0, i3, i3);
            if (pair.getSecond() == null) {
                eoa.b((gd0) pair.getFirst());
            } else {
                eoa.c((String) pair.getSecond());
            }
            arrayList.add(eoa);
            i = i2;
        }
        requestLayout();
        invalidate();
    }

    public final void setStrokeWidth(int i) {
        this.c = i;
        requestLayout();
        invalidate();
    }

    public final void setTitle(ngf ngf) {
        Lazy lazy = this.v;
        if (ngf == null) {
            ((TextView) lazy.getValue()).setText((CharSequence) null);
            ((TextView) lazy.getValue()).setVisibility(8);
            return;
        }
        f6e.c(this, (View) lazy.getValue(), -1);
        ((TextView) lazy.getValue()).setText(ngf.a(getContext()));
        ((TextView) lazy.getValue()).setVisibility(0);
    }
}
