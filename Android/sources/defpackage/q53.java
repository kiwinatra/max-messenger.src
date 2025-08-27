package defpackage;

import android.content.Context;
import android.graphics.Paint;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;

/* renamed from: q53  reason: default package */
public final class q53 extends tyc {
    public s53 X;
    public final int o;
    public int[] v = {-65536};
    public final int w;
    public final int x;
    public int y = -1;
    public final int z;

    public q53(Context context, int i) {
        this.o = i;
        this.w = hd8.n(6, context);
        this.x = hd8.n(32, context);
        this.z = hd8.n(2, context);
    }

    public final int j() {
        return this.v.length;
    }

    public final void s(pzc pzc, int i) {
        u53 u53 = (u53) pzc;
        u53.D0.setColor(this.v[i]);
        View view = u53.a;
        view.animate().cancel();
        view.setScaleX(1.0f);
        view.setScaleY(1.0f);
    }

    /* JADX WARNING: type inference failed for: r1v1, types: [r53, android.view.View] */
    public final pzc u(ViewGroup viewGroup, int i) {
        int measuredHeight;
        int paddingBottom;
        int i2 = this.y;
        int i3 = this.x;
        int i4 = this.w;
        int i5 = this.o;
        if (i2 == -1) {
            if (i5 == 0) {
                measuredHeight = viewGroup.getMeasuredWidth() - viewGroup.getPaddingLeft();
                paddingBottom = viewGroup.getPaddingRight();
            } else {
                measuredHeight = viewGroup.getMeasuredHeight() - viewGroup.getPaddingTop();
                paddingBottom = viewGroup.getPaddingBottom();
            }
            int i6 = measuredHeight - paddingBottom;
            float f = (float) ((i4 * 2) + i3);
            float f2 = (float) i6;
            float f3 = f2 / f;
            this.y = (int) (((f2 / (f3 - (f3 - (((float) ((int) f3)) + 0.5f)))) - f) / 2.0f);
        }
        FrameLayout frameLayout = new FrameLayout(viewGroup.getContext());
        frameLayout.setLayoutParams(new bzc(-2, -2));
        frameLayout.setClipToPadding(false);
        if (i5 == 0) {
            int i7 = this.y + i4;
            frameLayout.setPadding(i7, i4, i7, i4);
        } else {
            int i8 = this.y + i4;
            frameLayout.setPadding(i4, i8, i4, i8);
        }
        ? view = new View(viewGroup.getContext());
        view.c = hd8.n(2, view.getContext());
        Paint paint = new Paint();
        view.a = paint;
        paint.setColor(-65536);
        Paint paint2 = view.a;
        Paint.Style style = Paint.Style.FILL;
        paint2.setStyle(style);
        view.a.setAntiAlias(true);
        view.a.setDither(true);
        Paint paint3 = new Paint();
        view.b = paint3;
        paint3.setColor(-1);
        view.b.setStyle(style);
        view.b.setAntiAlias(true);
        view.b.setDither(true);
        view.setClipToOutline(false);
        view.setOutlineProvider(new a42(view, 2));
        view.setLayoutParams(new bzc(i3, i3));
        view.setElevation((float) this.z);
        frameLayout.addView(view);
        return new u53(frameLayout, view, this.X);
    }
}
