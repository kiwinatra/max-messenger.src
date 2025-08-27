package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.List;

/* renamed from: hee  reason: default package */
public final class hee implements qp9 {
    public static final Parcelable.Creator<hee> CREATOR = new g9d(14);
    public final List a;

    public hee(ArrayList arrayList) {
        this.a = arrayList;
        boolean z = false;
        if (!arrayList.isEmpty()) {
            long j = ((fee) arrayList.get(0)).b;
            int i = 1;
            while (true) {
                if (i >= arrayList.size()) {
                    break;
                } else if (((fee) arrayList.get(i)).a < j) {
                    z = true;
                    break;
                } else {
                    j = ((fee) arrayList.get(i)).b;
                    i++;
                }
            }
        }
        n79.g(!z);
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || hee.class != obj.getClass()) {
            return false;
        }
        return this.a.equals(((hee) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "SlowMotion: segments=" + this.a;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeList(this.a);
    }
}
