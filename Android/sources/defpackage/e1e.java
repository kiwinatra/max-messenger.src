package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: e1e  reason: default package */
public final class e1e extends f1e {
    public static final Parcelable.Creator<e1e> CREATOR = new g9d(12);
    public final ngf a;

    public e1e(ngf ngf) {
        this.a = ngf;
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof e1e) && Intrinsics.areEqual((Object) this.a, (Object) ((e1e) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return g63.k(new StringBuilder("Text(text="), this.a, ")");
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.a, i);
    }
}
