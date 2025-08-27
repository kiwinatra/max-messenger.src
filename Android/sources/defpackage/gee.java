package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.List;

/* renamed from: gee  reason: default package */
public final class gee implements pp9 {
    public static final Parcelable.Creator<gee> CREATOR = new g9d(13);
    public final List a;

    public gee(ArrayList arrayList) {
        this.a = arrayList;
        boolean z = false;
        if (!arrayList.isEmpty()) {
            long j = ((eee) arrayList.get(0)).b;
            int i = 1;
            while (true) {
                if (i >= arrayList.size()) {
                    break;
                } else if (((eee) arrayList.get(i)).a < j) {
                    z = true;
                    break;
                } else {
                    j = ((eee) arrayList.get(i)).b;
                    i++;
                }
            }
        }
        y64.g(!z);
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || gee.class != obj.getClass()) {
            return false;
        }
        return this.a.equals(((gee) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        String valueOf = String.valueOf(this.a);
        StringBuilder sb = new StringBuilder(valueOf.length() + 21);
        sb.append("SlowMotion: segments=");
        sb.append(valueOf);
        return sb.toString();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeList(this.a);
    }
}
