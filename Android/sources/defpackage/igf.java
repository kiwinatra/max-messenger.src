package defpackage;

import android.os.Parcel;

/* renamed from: igf  reason: default package */
public final class igf extends ngf {
    public static final hgf CREATOR = new Object();
    public final int b;

    public igf(int i) {
        this.b = i;
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof igf) && this.b == ((igf) obj).b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b);
    }

    public final String toString() {
        return wj6.l(new StringBuilder("Resource(resId="), this.b, ")");
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.b);
    }
}
