package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextPaint;
import android.text.style.RelativeSizeSpan;

/* renamed from: mx6  reason: default package */
public final class mx6 extends RelativeSizeSpan implements jf8, Parcelable {
    public static final Parcelable.Creator<mx6> CREATOR = new uv4(27);
    public final float a;
    public final if8 b;

    public /* synthetic */ mx6() {
        this(1.3f);
    }

    public final zz3 copy() {
        return new mx6(this.a);
    }

    public final if8 getType() {
        return this.b;
    }

    public final void updateDrawState(TextPaint textPaint) {
        super.updateDrawState(textPaint);
        textPaint.setFakeBoldText(true);
    }

    public final void updateMeasureState(TextPaint textPaint) {
        super.updateMeasureState(textPaint);
        textPaint.setFakeBoldText(true);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeFloat(this.a);
    }

    public mx6(float f) {
        super(f);
        this.a = f;
        this.b = if8.y;
    }
}
