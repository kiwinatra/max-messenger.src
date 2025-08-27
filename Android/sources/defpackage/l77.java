package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* renamed from: l77  reason: default package */
public final class l77 implements pp9 {
    public static final Parcelable.Creator<l77> CREATOR = new f27(4);
    public final byte[] a;
    public final String b;
    public final String c;

    public l77(String str, String str2, byte[] bArr) {
        this.a = bArr;
        this.b = str;
        this.c = str2;
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || l77.class != obj.getClass()) {
            return false;
        }
        return Arrays.equals(this.a, ((l77) obj).a);
    }

    public final int hashCode() {
        return Arrays.hashCode(this.a);
    }

    public final void o(rs8 rs8) {
        String str = this.b;
        if (str != null) {
            rs8.a = str;
        }
    }

    public final String toString() {
        int length = this.a.length;
        return "ICY: title=\"" + this.b + "\", url=\"" + this.c + "\", rawMetadata.length=\"" + length + "\"";
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeByteArray(this.a);
        parcel.writeString(this.b);
        parcel.writeString(this.c);
    }

    public l77(Parcel parcel) {
        byte[] createByteArray = parcel.createByteArray();
        createByteArray.getClass();
        this.a = createByteArray;
        this.b = parcel.readString();
        this.c = parcel.readString();
    }
}
