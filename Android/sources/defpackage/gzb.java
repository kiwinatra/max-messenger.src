package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.enums.EnumEntriesKt;

/* renamed from: gzb  reason: default package */
public enum gzb implements Parcelable {
    LOCAL_CHAT("local_chat"),
    CONTACT("contact");
    
    public static final Parcelable.Creator<gzb> CREATOR = null;
    public static final p9a b = null;
    public final String a;

    static {
        gzb[] gzbArr;
        w = EnumEntriesKt.enumEntries((E[]) gzbArr);
        b = new p9a(17);
        CREATOR = new w0b(23);
    }

    /* access modifiers changed from: public */
    gzb(String str) {
        this.a = str;
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(name());
    }
}
