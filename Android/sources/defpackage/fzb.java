package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.enums.EnumEntriesKt;

/* renamed from: fzb  reason: default package */
public enum fzb implements Parcelable {
    CREATE("create");
    
    public static final Parcelable.Creator<fzb> CREATOR = null;
    public static final o9a b = null;
    public final String a;

    static {
        fzb[] fzbArr;
        v = EnumEntriesKt.enumEntries((E[]) fzbArr);
        b = new o9a(17);
        CREATOR = new w0b(22);
    }

    /* access modifiers changed from: public */
    fzb(String str) {
        this.a = str;
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(name());
    }
}
