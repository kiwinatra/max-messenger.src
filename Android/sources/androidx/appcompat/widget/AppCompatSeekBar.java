package androidx.appcompat.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.SeekBar;

public class AppCompatSeekBar extends SeekBar {
    public final po a;

    public AppCompatSeekBar(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, hdc.seekBarStyle);
    }

    public void drawableStateChanged() {
        super.drawableStateChanged();
        po poVar = this.a;
        Drawable drawable = poVar.w;
        if (drawable != null && drawable.isStateful()) {
            SeekBar seekBar = poVar.v;
            if (drawable.setState(seekBar.getDrawableState())) {
                seekBar.invalidateDrawable(drawable);
            }
        }
    }

    public final void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable drawable = this.a.w;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
    }

    public synchronized void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        this.a.E(canvas);
    }

    public AppCompatSeekBar(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        zhf.a(getContext(), this);
        po poVar = new po(this);
        this.a = poVar;
        poVar.u(attributeSet, i);
    }
}
