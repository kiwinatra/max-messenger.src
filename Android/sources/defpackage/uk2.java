package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Lazy;
import kotlin.enums.EnumEntriesKt;

/* renamed from: uk2  reason: default package */
public enum uk2 implements Parcelable {
    DEFAULT,
    SCHEDULED_SEND;
    
    public static final Parcelable.Creator<uk2> CREATOR = null;
    public static final sx6 c = null;
    public final Lazy a;
    public final Lazy b;

    static {
        uk2[] uk2Arr;
        x = EnumEntriesKt.enumEntries((E[]) uk2Arr);
        c = new sx6(9);
        CREATOR = new j22(4);
    }

    public final boolean a() {
        return ((Boolean) this.a.getValue()).booleanValue();
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(name());
    }
}
