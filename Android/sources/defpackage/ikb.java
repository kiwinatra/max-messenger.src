package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: ikb  reason: default package */
public final class ikb implements Parcelable {
    public static final Parcelable.Creator<ikb> CREATOR = new w0b(7);
    public final String a;
    public final boolean b;

    public ikb(String str, boolean z) {
        this.a = str;
        this.b = z;
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ikb)) {
            return false;
        }
        ikb ikb = (ikb) obj;
        return Intrinsics.areEqual((Object) this.a, (Object) ikb.a) && this.b == ikb.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "PickerInputModel(id=" + this.a + ", editable=" + this.b + ")";
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.a);
        parcel.writeInt(this.b ? 1 : 0);
    }
}
