package defpackage;

import android.graphics.RectF;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* renamed from: d44  reason: default package */
public final class d44 implements Parcelable {
    public static final Parcelable.Creator<d44> CREATOR = new j22(20);
    public final RectF a;
    public final float b;
    public final float[] c;

    public d44(RectF rectF, float f, float[] fArr) {
        this.a = rectF;
        this.b = f;
        this.c = fArr;
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || d44.class != obj.getClass()) {
            return false;
        }
        d44 d44 = (d44) obj;
        if (Float.compare(d44.b, this.b) == 0 && this.a.equals(d44.a)) {
            return Arrays.equals(this.c, d44.c);
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        float f = this.b;
        return Arrays.hashCode(this.c) + ((hashCode + (f != c44.DEFAULT_ASPECT_RATIO ? Float.floatToIntBits(f) : 0)) * 31);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.a, i);
        parcel.writeFloat(this.b);
        parcel.writeFloatArray(this.c);
    }

    public d44(Parcel parcel) {
        this.a = (RectF) parcel.readParcelable(RectF.class.getClassLoader());
        this.b = parcel.readFloat();
        float[] fArr = new float[9];
        this.c = fArr;
        parcel.readFloatArray(fArr);
    }
}
