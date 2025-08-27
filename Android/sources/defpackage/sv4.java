package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* renamed from: sv4  reason: default package */
public final class sv4 implements Parcelable {
    public static final Parcelable.Creator<sv4> CREATOR = new j22(26);
    public final int a;
    public final float[] b;

    public sv4(float[] fArr, int i) {
        this.a = i;
        this.b = fArr;
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || sv4.class != obj.getClass()) {
            return false;
        }
        sv4 sv4 = (sv4) obj;
        if (this.a != sv4.a) {
            return false;
        }
        return Arrays.equals(this.b, sv4.b);
    }

    public final int hashCode() {
        int i = this.a;
        return Arrays.hashCode(this.b) + ((i != 0 ? tr1.y(i) : 0) * 31);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        String str;
        parcel.writeFloatArray(this.b);
        int i2 = this.a;
        if (i2 == 1) {
            str = "LINE";
        } else if (i2 == 2) {
            str = "CUBIC_BEZIER";
        } else {
            throw null;
        }
        parcel.writeString(str);
    }

    public sv4(Parcel parcel) {
        int i;
        this.b = parcel.createFloatArray();
        String readString = parcel.readString();
        if (readString != null) {
            if (readString.equals("LINE")) {
                i = 1;
            } else if (readString.equals("CUBIC_BEZIER")) {
                i = 2;
            } else {
                throw new IllegalArgumentException("No enum constant ru.ok.tamtam.photoeditor.state.DrawingPrimitive.Type.".concat(readString));
            }
            this.a = i;
            return;
        }
        throw new NullPointerException("Name is null");
    }
}
