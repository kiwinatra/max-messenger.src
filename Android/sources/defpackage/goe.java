package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.enums.EnumEntriesKt;

/* renamed from: goe  reason: default package */
public enum goe implements Parcelable {
    ;
    
    public static final Parcelable.Creator<goe> CREATOR = null;

    /* JADX WARNING: type inference failed for: r0v0, types: [java.lang.Enum, goe] */
    /* JADX WARNING: type inference failed for: r1v1, types: [java.lang.Enum, goe] */
    /* JADX WARNING: type inference failed for: r2v2, types: [java.lang.Enum, goe] */
    static {
        goe[] goeArr;
        o = EnumEntriesKt.enumEntries((E[]) goeArr);
        CREATOR = new nje(2);
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(name());
    }
}
