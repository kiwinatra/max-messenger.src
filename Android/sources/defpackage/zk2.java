package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.enums.EnumEntriesKt;

/* renamed from: zk2  reason: default package */
public enum zk2 implements Parcelable {
    ;
    
    public static final Parcelable.Creator<zk2> CREATOR = null;

    /* JADX WARNING: type inference failed for: r0v0, types: [zk2, java.lang.Enum] */
    /* JADX WARNING: type inference failed for: r1v1, types: [zk2, java.lang.Enum] */
    /* JADX WARNING: type inference failed for: r2v2, types: [zk2, java.lang.Enum] */
    /* JADX WARNING: type inference failed for: r3v2, types: [zk2, java.lang.Enum] */
    /* JADX WARNING: type inference failed for: r4v2, types: [zk2, java.lang.Enum] */
    static {
        zk2[] zk2Arr;
        x = EnumEntriesKt.enumEntries((E[]) zk2Arr);
        CREATOR = new j22(5);
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(name());
    }
}
