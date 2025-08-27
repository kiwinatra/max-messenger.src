package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Status;
import java.util.ArrayList;
import java.util.List;

/* renamed from: mwg  reason: default package */
public final class mwg extends h3 implements u4d {
    public static final Parcelable.Creator<mwg> CREATOR = new ivg(2);
    public final List a;
    public final String b;

    public mwg(String str, ArrayList arrayList) {
        this.a = arrayList;
        this.b = str;
    }

    public final Status a() {
        return this.b != null ? Status.v : Status.z;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int B0 = tf6.B0(parcel, 20293);
        List list = this.a;
        if (list != null) {
            int B02 = tf6.B0(parcel, 1);
            parcel.writeStringList(list);
            tf6.E0(parcel, B02);
        }
        tf6.w0(parcel, 2, this.b);
        tf6.E0(parcel, B0);
    }
}
