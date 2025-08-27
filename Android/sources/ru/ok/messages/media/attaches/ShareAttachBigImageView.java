package ru.ok.messages.media.attaches;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import com.facebook.drawee.view.SimpleDraweeView;

public class ShareAttachBigImageView extends SimpleDraweeView {
    public ro4 v0 = ro4.b();
    public o20 w0;
    public x10 x0;

    public ShareAttachBigImageView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        id3 e = ym.e();
        getContext();
        this.w0 = ((qra) e).h();
    }

    public final void n(l20 l20) {
        boolean a = l20.g.a();
        c20 c20 = l20.g;
        if (a) {
            this.x0 = c20.f;
        } else {
            this.x0 = c20.g.b;
        }
        ra7 d = ra7.d(po5.s(this.x0.a()));
        Context context = getContext();
        x10 x10 = this.x0;
        v3d u = ryg.u(context, x10.c, x10.o, true);
        if (u != null) {
            d.d = u;
        }
        knb a2 = ld9.p.get();
        a2.j = true;
        a2.e = d.a();
        a2.j = this.x0.v;
        a2.l = getController();
        jnb a3 = a2.a();
        ((sp6) getHierarchy()).i(this.w0.b(l20, false), 1);
        setController(a3);
        requestLayout();
    }

    public final void onMeasure(int i, int i2) {
        if (this.x0 != null) {
            int size = View.MeasureSpec.getSize(i);
            float f = (float) size;
            x10 x10 = this.x0;
            float f2 = (float) x10.o;
            float f3 = (float) x10.c;
            int i3 = (int) ((f2 / f3) * f);
            if (i3 > size) {
                i3 = (int) ((f * 2.0f) / 3.0f);
                size = (int) ((f3 / f2) * ((float) i3));
                ((sp6) getHierarchy()).h(ydd.p);
                b9d a = b9d.a(c44.DEFAULT_ASPECT_RATIO, c44.DEFAULT_ASPECT_RATIO, c44.DEFAULT_ASPECT_RATIO, c44.DEFAULT_ASPECT_RATIO);
                a.h = true;
                ((sp6) getHierarchy()).n(a);
            } else {
                ((sp6) getHierarchy()).h(ydd.m);
                this.v0.getClass();
                int i4 = (int) 9.0f;
                this.v0.getClass();
                b9d a2 = b9d.a(c44.DEFAULT_ASPECT_RATIO, c44.DEFAULT_ASPECT_RATIO, (float) vo4.b(i4), (float) vo4.b(i4));
                a2.h = true;
                ((sp6) getHierarchy()).n(a2);
            }
            setMeasuredDimension(size, i3);
            return;
        }
        super.onMeasure(i, i2);
    }
}
