package com.yalantis.ucrop.view.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.text.TextUtils;
import android.util.AttributeSet;
import androidx.appcompat.widget.AppCompatTextView;
import java.util.Locale;

public class AspectRatioTextView extends AppCompatTextView {
    public String v0;
    public float w0;
    public final Rect x = new Rect();
    public float x0;
    public final Paint y;
    public final int z;

    public AspectRatioTextView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, vnc.ucrop_AspectRatioTextView);
        setGravity(1);
        this.v0 = obtainStyledAttributes.getString(vnc.ucrop_AspectRatioTextView_ucrop_artv_ratio_title);
        this.w0 = obtainStyledAttributes.getFloat(vnc.ucrop_AspectRatioTextView_ucrop_artv_ratio_x, c44.DEFAULT_ASPECT_RATIO);
        float f = obtainStyledAttributes.getFloat(vnc.ucrop_AspectRatioTextView_ucrop_artv_ratio_y, c44.DEFAULT_ASPECT_RATIO);
        this.x0 = f;
        if (this.w0 != c44.DEFAULT_ASPECT_RATIO) {
            int i = (f > c44.DEFAULT_ASPECT_RATIO ? 1 : (f == c44.DEFAULT_ASPECT_RATIO ? 0 : -1));
        }
        this.z = getContext().getResources().getDimensionPixelSize(kec.ucrop_size_dot_scale_text_view);
        Paint paint = new Paint(1);
        this.y = paint;
        paint.setStyle(Paint.Style.FILL);
        k();
        j(getResources().getColor(sdc.ucrop_color_widget_active));
        obtainStyledAttributes.recycle();
    }

    public final void j(int i) {
        Paint paint = this.y;
        if (paint != null) {
            paint.setColor(i);
        }
        setTextColor(new ColorStateList(new int[][]{new int[]{16842913}, new int[]{0}}, new int[]{i, fw3.a(getContext(), sdc.ucrop_color_widget)}));
    }

    public final void k() {
        if (!TextUtils.isEmpty(this.v0)) {
            setText(this.v0);
            return;
        }
        Locale locale = Locale.US;
        setText(((int) this.w0) + ":" + ((int) this.x0));
    }

    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (isSelected()) {
            Rect rect = this.x;
            canvas.getClipBounds(rect);
            float f = ((float) rect.bottom) - (((float) rect.top) / 2.0f);
            int i = this.z;
            canvas.drawCircle(((float) (rect.right - rect.left)) / 2.0f, f - (((float) i) * 1.5f), ((float) i) / 2.0f, this.y);
        }
    }

    public void setActiveColor(int i) {
        j(i);
        invalidate();
    }

    public void setAspectRatio(bt btVar) {
        this.v0 = btVar.a;
        float f = btVar.b;
        this.w0 = f;
        float f2 = btVar.c;
        this.x0 = f2;
        if (f != c44.DEFAULT_ASPECT_RATIO) {
            int i = (f2 > c44.DEFAULT_ASPECT_RATIO ? 1 : (f2 == c44.DEFAULT_ASPECT_RATIO ? 0 : -1));
        }
        k();
    }
}
