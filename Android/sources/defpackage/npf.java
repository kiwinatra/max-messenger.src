package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: npf  reason: default package */
public final class npf implements Parcelable {
    public static final Parcelable.Creator<npf> CREATOR = new nje(13);
    public static final npf c = new npf(mpf.X, Collections.emptyList());
    public final mpf a;
    public final List b;

    public npf(mpf mpf, List list) {
        this.a = mpf;
        this.b = list;
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || npf.class != obj.getClass()) {
            return false;
        }
        npf npf = (npf) obj;
        if (!this.a.equals(npf.a)) {
            return false;
        }
        return this.b.equals(npf.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "TrackContainer{videoTrack=" + this.a + ", audioTracks=" + this.b + '}';
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.a, i);
        parcel.writeTypedList(this.b);
    }

    public npf(Parcel parcel) {
        this.a = (mpf) parcel.readParcelable(mpf.class.getClassLoader());
        ArrayList arrayList = new ArrayList();
        this.b = arrayList;
        parcel.readTypedList(arrayList, mpf.CREATOR);
    }
}
