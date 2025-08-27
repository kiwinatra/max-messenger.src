package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: x0b  reason: default package */
public final class x0b implements y0b {
    public static final Parcelable.Creator<x0b> CREATOR = new w0b(0);
    public final ngf a;

    public x0b(ngf ngf) {
        this.a = ngf;
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof x0b) && Intrinsics.areEqual((Object) this.a, (Object) ((x0b) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return g63.k(new StringBuilder("TextButton(caption="), this.a, ")");
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.a, i);
    }
}
