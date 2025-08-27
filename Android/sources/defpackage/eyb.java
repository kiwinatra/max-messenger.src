package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.enums.EnumEntriesKt;

/* renamed from: eyb  reason: default package */
public enum eyb implements Parcelable {
    SETUP_NEW_ADMIN("setup_new_admin"),
    CHANGE_ADMIN("change_admin");
    
    public static final Parcelable.Creator<eyb> CREATOR = null;
    public static final js9 b = null;
    public final String a;

    /* JADX WARNING: type inference failed for: r0v3, types: [js9, java.lang.Object] */
    static {
        eyb[] eybArr;
        w = EnumEntriesKt.enumEntries((E[]) eybArr);
        b = new Object();
        CREATOR = new w0b(21);
    }

    /* access modifiers changed from: public */
    eyb(String str) {
        this.a = str;
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(name());
    }
}
