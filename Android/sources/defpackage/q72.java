package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.enums.EnumEntriesKt;

/* renamed from: q72  reason: default package */
public enum q72 implements Parcelable, hv0 {
    LOCAL_ID("local");
    
    public static final Parcelable.Creator<q72> CREATOR = null;
    public static final v02 b = null;
    public final String a;

    /* JADX WARNING: type inference failed for: r0v3, types: [v02, java.lang.Object] */
    static {
        q72[] q72Arr;
        v = EnumEntriesKt.enumEntries((E[]) q72Arr);
        b = new Object();
        CREATOR = new j22(2);
    }

    /* access modifiers changed from: public */
    q72(String str) {
        this.a = str;
    }

    public final Object a(String str) {
        b.getClass();
        return v02.l(str);
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(name());
    }
}
