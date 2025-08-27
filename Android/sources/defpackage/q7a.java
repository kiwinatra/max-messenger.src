package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: q7a  reason: default package */
public final class q7a implements Parcelable, lz7 {
    public static final Parcelable.Creator<q7a> CREATOR = new ia9(17);
    public final long a;
    public final String b;
    public final int c;
    public final boolean o;

    public q7a(long j, String str, int i, boolean z) {
        this.a = j;
        this.b = str;
        this.c = i;
        this.o = z;
    }

    public static q7a w(q7a q7a, boolean z) {
        long j = q7a.a;
        String str = q7a.b;
        int i = q7a.c;
        q7a.getClass();
        return new q7a(j, str, i, z);
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q7a)) {
            return false;
        }
        q7a q7a = (q7a) obj;
        return this.a == q7a.a && Intrinsics.areEqual((Object) this.b, (Object) q7a.b) && this.c == q7a.c && this.o == q7a.o;
    }

    public final long getItemId() {
        return this.a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.o) + rae.h(this.c, g63.d(Long.hashCode(this.a) * 31, 31, this.b), 31);
    }

    public final int i() {
        return 1;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("NeuroAvatarModel(id=");
        sb.append(this.a);
        sb.append(", url=");
        sb.append(this.b);
        sb.append(", categoryId=");
        sb.append(this.c);
        sb.append(", isSelected=");
        return tr1.m(sb, this.o, ")");
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(this.a);
        parcel.writeString(this.b);
        parcel.writeInt(this.c);
        parcel.writeInt(this.o ? 1 : 0);
    }
}
