package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Collections;
import java.util.List;

/* renamed from: t6  reason: default package */
public final class t6 implements Parcelable {
    public static final Parcelable.Creator<t6> CREATOR = new s6(0);
    public final String a;
    public final List b;
    public final String c;

    public t6(List list, String str) {
        this.b = list;
        this.c = str;
        this.a = (String) cjf.s(list, (nsb) null);
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        List list = this.b;
        if (te8.E(parcel, list)) {
            parcel.writeInt(list.size());
            parcel.writeStringList(list);
        }
        te8.D(parcel, this.c);
    }

    public t6(Parcel parcel) {
        List v = te8.v(parcel);
        v = v == null ? Collections.emptyList() : v;
        this.b = v;
        this.c = te8.u(parcel);
        this.a = (String) cjf.s(v, (nsb) null);
    }
}
