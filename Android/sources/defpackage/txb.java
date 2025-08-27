package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.enums.EnumEntriesKt;

/* renamed from: txb  reason: default package */
public enum txb implements Parcelable, hv0 {
    LOCAL_CHAT("local_chat"),
    SERVER_CHAT("server_chat"),
    CONTACT("contact");
    
    public static final Parcelable.Creator<txb> CREATOR = null;
    public static final wc8 b = null;
    public final String a;

    /* JADX WARNING: type inference failed for: r0v3, types: [java.lang.Object, wc8] */
    static {
        txb[] txbArr;
        x = EnumEntriesKt.enumEntries((E[]) txbArr);
        b = new Object();
        CREATOR = new w0b(20);
    }

    /* access modifiers changed from: public */
    txb(String str) {
        this.a = str;
    }

    public final Object a(String str) {
        b.getClass();
        return wc8.v(str);
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(name());
    }
}
