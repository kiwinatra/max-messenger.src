package ru.ok.messages.views.widgets;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.util.AttributeSet;
import android.view.View;
import ru.ok.messages.media.mediabar.SimpleTransitionDraweeView;

public class VideoThumbnailView extends SimpleTransitionDraweeView {
    public k20 v0;
    public final w4d w0 = new w4d();
    public int x0;
    public int y0;

    public VideoThumbnailView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
    }

    private void setPlaceHolderDrawable(Drawable drawable) {
        tp6 tp6 = new tp6(getResources());
        ydd ydd = ydd.m;
        tp6.l = ydd;
        tp6.d = drawable;
        tp6.e = ydd;
        setHierarchy(tp6.a());
    }

    private void setPlaceHolderFromVideo(k20 k20) {
        Uri x = o5a.x(k20.c);
        if (x != null) {
            setPlaceHolderUri(x);
        }
    }

    private void setPlaceHolderUri(Uri uri) {
        tp6 tp6 = new tp6(getResources());
        tp6.l = ydd.m;
        tp6.b = 0;
        setHierarchy(tp6.a());
        knb a = ld9.p.get();
        a.g = this.w0;
        a.l = getController();
        setController(a.a());
        qa7 a2 = qa7.a(uri);
        w4d w4d = this.w0;
        ba7 B = ld9.B();
        B.getClass();
        w4d.a(new aa7(B, a2, (Object) null));
    }

    public final void n(k20 k20, Drawable drawable) {
        this.v0 = k20;
        if (k20 == null && drawable == null) {
            setController((gv4) null);
        } else if (drawable == null) {
            setPlaceHolderFromVideo(k20);
        } else {
            setPlaceHolderDrawable(drawable);
        }
    }

    public final void o(k20 k20, Uri uri) {
        this.v0 = k20;
        if (k20 == null && uri == null) {
            setController((gv4) null);
        } else if (uri == null) {
            setPlaceHolderFromVideo(k20);
        } else {
            setPlaceHolderUri(uri);
        }
    }

    public final void onMeasure(int i, int i2) {
        if (this.v0 == null || View.MeasureSpec.getMode(i2) == 1073741824) {
            super.onMeasure(i, i2);
            return;
        }
        int size = View.MeasureSpec.getSize(i);
        int size2 = View.MeasureSpec.getSize(i2);
        int i3 = this.x0;
        if (i3 <= 0) {
            i3 = this.v0.d;
        }
        int i4 = this.y0;
        if (i4 <= 0) {
            i4 = this.v0.e;
        }
        int[] B = iq.B(size, size2, i3, i4);
        setMeasuredDimension(B[0], B[1]);
    }
}
