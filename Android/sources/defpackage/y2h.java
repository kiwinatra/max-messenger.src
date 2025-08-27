package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: y2h  reason: default package */
public abstract class y2h {
    public static final /* synthetic */ int a = 0;

    static {
        y2h.class.getClassLoader();
    }

    public static Parcelable a(Parcel parcel, Parcelable.Creator creator) {
        if (parcel.readInt() == 0) {
            return null;
        }
        return (Parcelable) creator.createFromParcel(parcel);
    }
}
