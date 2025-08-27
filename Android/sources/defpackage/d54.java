package defpackage;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: d54  reason: default package */
public final class d54 implements Parcelable {
    public static final Parcelable.Creator<d54> CREATOR = new j22(21);
    public final List a;
    public final List b;
    public final List c;
    public final int o;

    public d54(ArrayList arrayList, ArrayList arrayList2, List list, int i) {
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
        if (!(obj instanceof d54)) {
            return false;
        }
        d54 d54 = (d54) obj;
        return Intrinsics.areEqual((Object) this.a, (Object) d54.a) && Intrinsics.areEqual((Object) this.b, (Object) d54.b) && Intrinsics.areEqual((Object) this.c, (Object) d54.c) && this.o == d54.o;
    }

    public final int hashCode() {
        return Integer.hashCode(this.o) + rae.i(this.c, rae.i(this.b, this.a.hashCode() * 31, 31), 31);
    }

    public final String toString() {
        return "SavedState(savedPagesKeys=" + this.a + ", savedPagesValues=" + this.b + ", savedPageHistory=" + this.c + ", maxPagesToStateSave=" + this.o + ")";
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
