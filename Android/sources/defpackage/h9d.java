package defpackage;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: h9d  reason: default package */
public final class h9d implements Parcelable {
    public static final Parcelable.Creator<h9d> CREATOR = new g9d(0);
    public final List a;
    public final List b;
    public final List c;
    public final int o;

    public h9d(ArrayList arrayList, ArrayList arrayList2, List list, int i) {
        this.a = arrayList;
        this.b = arrayList2;
        this.c = list;
        this.o = i;
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h9d)) {
            return false;
        }
        h9d h9d = (h9d) obj;
        return Intrinsics.areEqual((Object) this.a, (Object) h9d.a) && Intrinsics.areEqual((Object) this.b, (Object) h9d.b) && Intrinsics.areEqual((Object) this.c, (Object) h9d.c) && this.o == h9d.o;
    }

    public final int hashCode() {
        return Integer.hashCode(this.o) + rae.i(this.c, rae.i(this.b, this.a.hashCode() * 31, 31), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SavedState(savedPagesKeys=");
        sb.append(this.a);
        sb.append(", savedPagesValues=");
        sb.append(this.b);
        sb.append(", savedPageHistory=");
        sb.append(this.c);
        sb.append(", maxPagesToStateSave=");
        return tr1.k(sb, this.o, ')');
    }

    public final void writeToParcel(Parcel parcel, int i) {
        List<Number> list = this.a;
        parcel.writeInt(list.size());
        for (Number longValue : list) {
            parcel.writeLong(longValue.longValue());
        }
        List<Bundle> list2 = this.b;
        parcel.writeInt(list2.size());
        for (Bundle writeBundle : list2) {
            parcel.writeBundle(writeBundle);
        }
        List<Number> list3 = this.c;
        parcel.writeInt(list3.size());
        for (Number longValue2 : list3) {
            parcel.writeLong(longValue2.longValue());
        }
        parcel.writeInt(this.o);
    }
}
