package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import java.util.List;

/* renamed from: rp9  reason: default package */
public final class rp9 implements Parcelable {
    public static final Parcelable.Creator<rp9> CREATOR = new ia9(3);
    public final pp9[] a;

    public rp9(pp9... pp9Arr) {
        this.a = pp9Arr;
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || rp9.class != obj.getClass()) {
            return false;
        }
        return Arrays.equals(this.a, ((rp9) obj).a);
    }

    public final int hashCode() {
        return Arrays.hashCode(this.a);
    }

    public final String toString() {
        String valueOf = String.valueOf(Arrays.toString(this.a));
        return valueOf.length() != 0 ? "entries=".concat(valueOf) : new String("entries=");
    }

    public final void writeToParcel(Parcel parcel, int i) {
        pp9[] pp9Arr = this.a;
        parcel.writeInt(pp9Arr.length);
        for (pp9 writeParcelable : pp9Arr) {
            parcel.writeParcelable(writeParcelable, 0);
        }
    }

    public rp9(List list) {
        this.a = (pp9[]) list.toArray(new pp9[0]);
    }

    public rp9(Parcel parcel) {
        this.a = new pp9[parcel.readInt()];
        int i = 0;
        while (true) {
            pp9[] pp9Arr = this.a;
            if (i < pp9Arr.length) {
                pp9Arr[i] = (pp9) parcel.readParcelable(pp9.class.getClassLoader());
                i++;
            } else {
                return;
            }
        }
    }
}
