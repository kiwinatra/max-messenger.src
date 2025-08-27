package ru.ok.messages.media.attaches;

import android.content.Context;
import android.net.Uri;
import android.util.AttributeSet;
import android.view.View;
import com.facebook.drawee.view.SimpleDraweeView;

public class ShareAttachBigImageBgView extends SimpleDraweeView {
    public l20 v0;
    public bq0 w0;
    public o20 x0;

    public ShareAttachBigImageBgView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        id3 e = ym.e();
        int i = bq0.f;
        this.w0 = e.b(25, 1);
        this.x0 = ((qra) e).h();
    }

    public final void n(l20 l20) {
        this.v0 = l20;
        Uri s = po5.s(ld8.E(l20));
        if (s != null) {
            ra7 d = ra7.d(s);
            d.d = ryg.w(getContext(), l20, true);
            d.l = this.w0;
            qa7 a = d.a();
            knb a2 = ld9.p.get();
            a2.l = getController();
            a2.e = a;
            setController(a2.a());
        } else {
            setController((gv4) null);
        }
        ((sp6) getHierarchy()).i(this.x0.b(l20, false), 1);
        requestLayout();
    }

    public final void onMeasure(int i, int i2) {
        if (this.v0 != null) {
            int size = View.MeasureSpec.getSize(i);
            setMeasuredDimension(size, (int) ((((float) size) * 2.0f) / 3.0f));
            return;
        }
        super.onMeasure(i, i2);
    }
}
