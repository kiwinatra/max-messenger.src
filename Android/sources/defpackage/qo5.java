package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: qo5  reason: default package */
public final class qo5 implements Parcelable {
    public static final Parcelable.Creator<qo5> CREATOR = new uv4(5);
    public final String a;
    public final q82 b;
    public final boolean c;

    public qo5(String str, q82 q82, boolean z) {
        this.a = str;
        this.b = q82;
        this.c = z;
    }

    public static qo5 a(qo5 qo5, boolean z) {
        String str = qo5.a;
        q82 q82 = qo5.b;
        qo5.getClass();
        return new qo5(str, q82, z);
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qo5)) {
            return false;
        }
        qo5 qo5 = (qo5) obj;
        return Intrinsics.areEqual((Object) this.a, (Object) qo5.a) && this.b == qo5.b && this.c == qo5.c;
    }

    public final int hashCode() {
        int hashCode = this.b.hashCode();
        return Boolean.hashCode(this.c) + ((hashCode + (this.a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("FilterModel(name=");
        sb.append(this.a);
        sb.append(", filter=");
        sb.append(this.b);
        sb.append(", isEnabled=");
        return tr1.m(sb, this.c, ")");
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.a);
        parcel.writeString(this.b.name());
        parcel.writeInt(this.c ? 1 : 0);
    }
}
