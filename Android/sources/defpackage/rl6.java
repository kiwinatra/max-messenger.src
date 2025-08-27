package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: rl6  reason: default package */
public final class rl6 extends tl6 {
    public static final Parcelable.Creator<rl6> CREATOR = new uv4(23);
    public final List a;

    public rl6(ArrayList arrayList) {
        this.a = arrayList;
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof rl6) && Intrinsics.areEqual((Object) this.a, (Object) ((rl6) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return tr1.l(new StringBuilder("Multi(items="), this.a, ")");
    }

    public final void writeToParcel(Parcel parcel, int i) {
        List<Parcelable> list = this.a;
        parcel.writeInt(list.size());
        for (Parcelable writeParcelable : list) {
            parcel.writeParcelable(writeParcelable, i);
        }
    }
}
