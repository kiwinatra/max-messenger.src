package ru.ok.messages.settings.view;

import android.content.Context;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.OvalShape;
import android.util.AttributeSet;
import android.widget.SeekBar;
import androidx.appcompat.widget.AppCompatSeekBar;

public class LedSeekBar extends AppCompatSeekBar implements SeekBar.OnSeekBarChangeListener {
    public final int b;
    public ss7 c;
    public final int[] o = ((qra) ym.e()).y().c.A();
    public final ShapeDrawable v;

    public LedSeekBar(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        getContext();
        ro4 b2 = ro4.b();
        int i = b2.q;
        this.b = b2.b;
        int dimension = (int) getResources().getDimension(mad.g);
        setPadding(dimension, 0, dimension, 0);
        setProgressDrawable(new y6(this));
        ShapeDrawable shapeDrawable = new ShapeDrawable(new OvalShape());
        this.v = shapeDrawable;
        shapeDrawable.setBounds(0, 0, i, i);
        this.v.setIntrinsicHeight(i);
        this.v.setIntrinsicWidth(i);
        setThumb(this.v);
        setThumbOffset(i / 2);
        setOnSeekBarChangeListener(this);
    }

    public final void onProgressChanged(SeekBar seekBar, int i, boolean z) {
        int[] iArr = this.o;
        int length = (int) ((((float) iArr.length) / ((float) getMax())) * ((float) i));
        if (length > iArr.length - 1) {
            length = iArr.length - 1;
        }
        this.v.getPaint().setColor(this.o[length]);
    }

    public final void onStartTrackingTouch(SeekBar seekBar) {
    }

    public final void onStopTrackingTouch(SeekBar seekBar) {
        int progress = getProgress();
        int[] iArr = this.o;
        int length = (int) ((((float) iArr.length) / ((float) getMax())) * ((float) progress));
        if (length > iArr.length - 1) {
            length = iArr.length - 1;
        }
        float max = ((float) getMax()) / ((float) this.o.length);
        setProgress((int) ((max / 2.0f) + (((float) length) * max)));
        ss7 ss7 = this.c;
        if (ss7 != null) {
            int i = this.o[length];
            ib4 ib4 = (ib4) ss7;
            ts7 ts7 = (ts7) ib4.b;
            b0e b0e = (b0e) ib4.c;
            if (b0e != null) {
                b0e.C(ts7.J0.a, Integer.valueOf(i));
            } else {
                ts7.getClass();
            }
        }
    }

    public void setColor(int i) {
        int i2 = 0;
        int i3 = 0;
        while (true) {
            int[] iArr = this.o;
            if (i3 >= iArr.length) {
                break;
            } else if (i == iArr[i3]) {
                i2 = i3;
                break;
            } else {
                i3++;
            }
        }
        float max = ((float) getMax()) / ((float) this.o.length);
        setProgress((int) ((max / 2.0f) + (((float) i2) * max)));
    }

    public void setListener(ss7 ss7) {
        this.c = ss7;
    }
}
