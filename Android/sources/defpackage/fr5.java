package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: fr5  reason: default package */
public final class fr5 implements Parcelable {
    public static final Parcelable.Creator<fr5> CREATOR = new uv4(8);
    public int a;
    public int b;

    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SavedState{mAnchorPosition=");
        sb.append(this.a);
        sb.append(", mAnchorOffset=");
        return tr1.k(sb, this.b, '}');
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.a);
        parcel.writeInt(this.b);
    }
}
