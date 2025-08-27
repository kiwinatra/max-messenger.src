package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: h63  reason: default package */
public final class h63 implements Parcelable {
    public static final Parcelable.Creator<h63> CREATOR = new j22(7);
    public final int a;
    public final int b;

    public h63(int i) {
        this.a = 1;
        this.b = i;
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || h63.class != obj.getClass()) {
            return false;
        }
        h63 h63 = (h63) obj;
        if (this.b != h63.b) {
            return false;
        }
        return this.a == h63.a;
    }

    public final int hashCode() {
        int i = this.a;
        return ((i != 0 ? tr1.y(i) : 0) * 31) + this.b;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.b);
        if (this.a == 1) {
            parcel.writeString("ADD");
            return;
        }
        throw null;
    }

    public h63(Parcel parcel) {
        this.b = parcel.readInt();
        String readString = parcel.readString();
        if (readString == null) {
            throw new NullPointerException("Name is null");
        } else if (readString.equals("ADD")) {
            this.a = 1;
        } else {
            throw new IllegalArgumentException("No enum constant ru.ok.tamtam.photoeditor.state.CommandState.Type.".concat(readString));
        }
    }
}
