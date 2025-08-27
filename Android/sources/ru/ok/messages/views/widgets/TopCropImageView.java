package ru.ok.messages.views.widgets;

import android.content.Context;
import android.graphics.Matrix;
import android.util.AttributeSet;
import android.widget.ImageView;
import androidx.appcompat.widget.AppCompatImageView;

public class TopCropImageView extends AppCompatImageView {
    public TopCropImageView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        setScaleType(ImageView.ScaleType.MATRIX);
    }

    public final void a() {
        Matrix imageMatrix = getImageMatrix();
        int width = (getWidth() - getPaddingLeft()) - getPaddingRight();
        int height = (getHeight() - getPaddingTop()) - getPaddingBottom();
        float intrinsicWidth = ((float) width) / ((float) getDrawable().getIntrinsicWidth());
        float intrinsicHeight = ((float) height) / ((float) getDrawable().getIntrinsicHeight());
        if (intrinsicHeight > intrinsicWidth) {
            intrinsicWidth = intrinsicHeight;
        }
        imageMatrix.setScale(intrinsicWidth, intrinsicWidth);
        setImageMatrix(imageMatrix);
    }

    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        a();
    }

    public final boolean setFrame(int i, int i2, int i3, int i4) {
        a();
        return super.setFrame(i, i2, i3, i4);
    }
}
