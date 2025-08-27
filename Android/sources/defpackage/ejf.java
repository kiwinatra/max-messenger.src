package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import kotlin.jvm.internal.StringCompanionObject;

/* renamed from: ejf  reason: default package */
public final class ejf implements Parcelable {
    public static final Parcelable.Creator<ejf> CREATOR = new nje(9);
    public final int a;
    public final String b;

    public ejf(int i) {
        this.a = i;
        StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
        this.b = String.format("%02d", Arrays.copyOf(new Object[]{Integer.valueOf(i)}, 1));
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ejf) && this.a == ((ejf) obj).a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.a);
    }

    public final String toString() {
        return this.b;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.a);
    }
}
