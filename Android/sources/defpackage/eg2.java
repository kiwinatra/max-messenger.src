package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.enums.EnumEntriesKt;

/* renamed from: eg2  reason: default package */
public enum eg2 implements Parcelable {
    ;
    
    public static final Parcelable.Creator<eg2> CREATOR = null;

    /* JADX WARNING: type inference failed for: r0v0, types: [eg2, java.lang.Enum] */
    /* JADX WARNING: type inference failed for: r1v1, types: [eg2, java.lang.Enum] */
    /* JADX WARNING: type inference failed for: r2v2, types: [eg2, java.lang.Enum] */
    /* JADX WARNING: type inference failed for: r3v2, types: [eg2, java.lang.Enum] */
    static {
        eg2[] eg2Arr;
        o = EnumEntriesKt.enumEntries((E[]) eg2Arr);
        CREATOR = new j22(3);
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(name());
    }
}
