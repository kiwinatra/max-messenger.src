package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: f41  reason: default package */
public final class f41 implements Parcelable {
    public static final Parcelable.Creator<f41> CREATOR = new s6(23);
    public final pje a;
    public final boolean b;
    public final boolean c;

    public f41(pje pje, boolean z, boolean z2) {
        this.a = pje;
        this.b = z;
        this.c = z2;
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f41)) {
            return false;
        }
        f41 f41 = (f41) obj;
        return Intrinsics.areEqual((Object) this.a, (Object) f41.a) && this.b == f41.b && this.c == f41.c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + g63.e(this.a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CallDialogInput(startCall=");
        sb.append(this.a);
        sb.append(", isMuted=");
        sb.append(this.b);
        sb.append(", isVideo=");
        return tr1.m(sb, this.c, ")");
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.a, i);
        parcel.writeInt(this.b ? 1 : 0);
        parcel.writeInt(this.c ? 1 : 0);
    }
}
