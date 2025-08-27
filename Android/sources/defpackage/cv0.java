package defpackage;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.Layout;
import android.text.Spanned;
import android.text.style.LeadingMarginSpan;

/* renamed from: cv0  reason: default package */
public final class cv0 implements LeadingMarginSpan, Parcelable {
    public static final Parcelable.Creator<cv0> CREATOR = new s6(15);
    public static Path v;
    public final int a;
    public final int b;
    public final int c;
    public final boolean o;

    public cv0(int i, int i2, int i3, boolean z) {
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.o = z;
    }

    public final int describeContents() {
        return 0;
    }

    public final void drawLeadingMargin(Canvas canvas, Paint paint, int i, int i2, int i3, int i4, int i5, CharSequence charSequence, int i6, int i7, boolean z, Layout layout) {
        int i8;
        if (((Spanned) charSequence).getSpanStart(this) == i6) {
            Paint.Style style = paint.getStyle();
            boolean z2 = this.o;
            if (z2) {
                i8 = paint.getColor();
                paint.setColor(this.c);
            } else {
                i8 = 0;
            }
            paint.setStyle(Paint.Style.FILL);
            boolean isHardwareAccelerated = canvas.isHardwareAccelerated();
            int i9 = this.b;
            if (isHardwareAccelerated) {
                if (v == null) {
                    Path path = new Path();
                    path.addCircle(c44.DEFAULT_ASPECT_RATIO, c44.DEFAULT_ASPECT_RATIO, (float) i9, Path.Direction.CW);
                    v = path;
                }
                canvas.save();
                canvas.translate((float) ((i2 * i9) + i), ((float) (i3 + i5)) / 2.0f);
                canvas.drawPath(v, paint);
                canvas.restore();
            } else {
                canvas.drawCircle((float) ((i2 * i9) + i), ((float) (i3 + i5)) / 2.0f, (float) i9, paint);
            }
            if (z2) {
                paint.setColor(i8);
            }
            paint.setStyle(style);
        }
    }

    public final int getLeadingMargin(boolean z) {
        return (this.b * 2) + this.a;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.a);
        parcel.writeInt(this.b);
        parcel.writeInt(this.c);
        parcel.writeInt(this.o ? 1 : 0);
    }
}
