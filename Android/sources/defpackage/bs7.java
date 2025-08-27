package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.List;

/* renamed from: bs7  reason: default package */
public final class bs7 implements Parcelable {
    public static final Parcelable.Creator<bs7> CREATOR = new f27(9);
    public final int a;
    public final int b;
    public final int c;
    public final float o;
    public final List v;

    public bs7(int i, int i2, float f, ArrayList arrayList) {
        this.a = i;
        this.b = 1;
        this.c = i2;
        this.o = f;
        this.v = arrayList;
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || bs7.class != obj.getClass()) {
            return false;
        }
        bs7 bs7 = (bs7) obj;
        if (this.a != bs7.a || this.c != bs7.c || Float.compare(bs7.o, this.o) != 0 || this.b != bs7.b) {
            return false;
        }
        List list = bs7.v;
        List list2 = this.v;
        return list2 != null ? list2.equals(list) : list == null;
    }

    public final int hashCode() {
        int i = this.a * 31;
        int i2 = 0;
        int i3 = this.b;
        int y = (((i + (i3 != 0 ? tr1.y(i3) : 0)) * 31) + this.c) * 31;
        float f = this.o;
        int floatToIntBits = (y + (f != c44.DEFAULT_ASPECT_RATIO ? Float.floatToIntBits(f) : 0)) * 31;
        List list = this.v;
        if (list != null) {
            i2 = list.hashCode();
        }
        return floatToIntBits + i2;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        if (this.b == 1) {
            parcel.writeString("DRAWING");
            parcel.writeInt(this.a);
            parcel.writeInt(this.c);
            parcel.writeFloat(this.o);
            parcel.writeTypedList(this.v);
            return;
        }
        throw null;
    }

    public bs7(Parcel parcel) {
        String readString = parcel.readString();
        if (readString == null) {
            throw new NullPointerException("Name is null");
        } else if (readString.equals("DRAWING")) {
            this.b = 1;
            this.a = parcel.readInt();
            this.c = parcel.readInt();
            this.o = parcel.readFloat();
            this.v = parcel.createTypedArrayList(sv4.CREATOR);
        } else {
            throw new IllegalArgumentException("No enum constant ru.ok.tamtam.photoeditor.state.LayerState.Type.".concat(readString));
        }
    }
}
