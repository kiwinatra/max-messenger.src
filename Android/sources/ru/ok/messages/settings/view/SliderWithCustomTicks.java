package ru.ok.messages.settings.view;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.drawable.ColorDrawable;
import android.util.AttributeSet;
import com.google.android.material.ComGoogleAndroidMaterialR$style;
import kotlin.Metadata;
import kotlin.jvm.JvmOverloads;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u0002J\u0017\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\t\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\t\u0010\u0007J\u0017\u0010\u000b\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u000b\u0010\u0007J\u0019\u0010\u000e\u001a\u00020\u00052\b\b\u0001\u0010\r\u001a\u00020\fH\u0017¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"Lru/ok/messages/settings/view/SliderWithCustomTicks;", "Lwde;", "", "", "valueFrom", "", "setValueFrom", "(F)V", "valueTo", "setValueTo", "stepSize", "setStepSize", "", "color", "setBackgroundColor", "(I)V", "tamtam-app_release"}, k = 1, mv = {2, 0, 0})
public final class SliderWithCustomTicks extends wde implements ek0 {
    public final int I1;
    public float[] J1;
    public boolean K1;
    public final Paint L1;
    public final Paint M1;
    public final Paint N1;
    public final int O1;
    public final float P1;

    @JvmOverloads
    public SliderWithCustomTicks(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, new int[]{16842788});
        if (obtainStyledAttributes.hasValue(0)) {
            setValue(obtainStyledAttributes.getFloat(0, c44.DEFAULT_ASPECT_RATIO));
        }
        obtainStyledAttributes.recycle();
        this.I1 = getResources().getDimensionPixelOffset(iec.mtrl_slider_track_height);
        this.J1 = new float[0];
        this.K1 = true;
        Paint paint = new Paint(1);
        this.L1 = paint;
        Paint paint2 = new Paint(1);
        this.M1 = paint2;
        Paint paint3 = new Paint(1);
        this.N1 = paint3;
        TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, tnc.Slider, 0, ComGoogleAndroidMaterialR$style.Widget_MaterialComponents_Slider);
        boolean hasValue = obtainStyledAttributes2.hasValue(tnc.Slider_tickColor);
        int i = hasValue ? tnc.Slider_tickColor : tnc.Slider_tickColorInactive;
        int i2 = hasValue ? tnc.Slider_tickColor : tnc.Slider_tickColorActive;
        paint.setColor(obtainStyledAttributes2.getColor(i, 0));
        paint2.setColor(obtainStyledAttributes2.getColor(i2, 0));
        obtainStyledAttributes2.recycle();
        TypedArray obtainStyledAttributes3 = context.obtainStyledAttributes(attributeSet, wnc.SliderWithCustomTicks, 0, 0);
        int i3 = wnc.SliderWithCustomTicks_tickRadius;
        ro4.b();
        this.O1 = obtainStyledAttributes3.getDimensionPixelSize(i3, vo4.b((int) 4.0f));
        this.P1 = obtainStyledAttributes3.getDimension(wnc.SliderWithCustomTicks_normalValue, c44.DEFAULT_ASPECT_RATIO);
        obtainStyledAttributes3.recycle();
        if (getBackground() instanceof ColorDrawable) {
            paint3.setColor(((ColorDrawable) getBackground()).getColor());
        }
        this.y0.add(this);
    }

    public final void A(Object obj, float f, boolean z) {
        wde wde = (wde) obj;
        if (z) {
            b0h.K(this, qw6.VIRTUAL_KEY);
        }
    }

    public final void onDraw(Canvas canvas) {
        Canvas canvas2 = canvas;
        super.onDraw(canvas);
        int i = 0;
        if (this.K1 && getStepSize() > c44.DEFAULT_ASPECT_RATIO) {
            int min = Math.min((int) (((getValueTo() - getValueFrom()) / getStepSize()) + ((float) 1)), (getTrackWidth() / (getTrackHeight() * 2)) + 1);
            int i2 = min * 2;
            if (this.J1.length != i2) {
                this.J1 = new float[i2];
            }
            float trackWidth = ((float) getTrackWidth()) / ((float) (min - 1));
            for (int i3 = 0; i3 < i2; i3 += 2) {
                this.J1[i3] = (((float) (i3 / 2)) * trackWidth) + ((float) getTrackSidePadding());
                this.J1[i3 + 1] = (float) this.I1;
            }
            this.K1 = false;
        }
        if (getStepSize() > c44.DEFAULT_ASPECT_RATIO) {
            int value = (int) (getValue() - getValueFrom());
            int valueFrom = (int) (this.P1 - getValueFrom());
            float f = (float) this.O1;
            int length = this.J1.length / 2;
            while (i < length) {
                Paint paint = this.N1;
                Paint paint2 = this.L1;
                Paint paint3 = this.M1;
                if (i == valueFrom && i != value) {
                    float[] fArr = this.J1;
                    int i4 = i * 2;
                    int i5 = i4 + 1;
                    canvas2.drawCircle(fArr[i4], fArr[i5], (float) getThumbRadius(), i < value ? paint3 : paint2);
                    float[] fArr2 = this.J1;
                    canvas2.drawCircle(fArr2[i4], fArr2[i5], f, paint);
                    float[] fArr3 = this.J1;
                    float f2 = fArr3[i4];
                    float f3 = fArr3[i5];
                    float f4 = f / 2.0f;
                    if (i < value) {
                        paint2 = paint3;
                    }
                    canvas2.drawCircle(f2, f3, f4, paint2);
                } else if (i < value) {
                    float[] fArr4 = this.J1;
                    int i6 = i * 2;
                    int i7 = i6 + 1;
                    canvas2.drawCircle(fArr4[i6], fArr4[i7], f, paint3);
                    float[] fArr5 = this.J1;
                    canvas2.drawCircle(fArr5[i6], fArr5[i7], f / 2.0f, paint);
                } else if (i > value) {
                    float[] fArr6 = this.J1;
                    int i8 = i * 2;
                    int i9 = i8 + 1;
                    canvas2.drawCircle(fArr6[i8], fArr6[i9], f, paint2);
                    float[] fArr7 = this.J1;
                    canvas2.drawCircle(fArr7[i8], fArr7[i9], f / 2.0f, paint);
                }
                i++;
            }
        }
    }

    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        this.K1 = true;
    }

    @SuppressLint({"ResourceType"})
    public void setBackgroundColor(int i) {
        super.setBackgroundColor(i);
        this.N1.setColor(i);
    }

    public void setStepSize(float f) {
        super.setStepSize(f);
        this.K1 = true;
    }

    public void setValueFrom(float f) {
        super.setValueFrom(f);
        this.K1 = true;
    }

    public void setValueTo(float f) {
        super.setValueTo(f);
        this.K1 = true;
    }
}
