package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.NoSuchElementException;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: zke  reason: default package */
public enum zke implements Parcelable, hv0 {
    CHAT("chat"),
    CHANNEL("channel");
    
    public static final Parcelable.Creator<zke> CREATOR = null;
    public static final js9 b = null;
    public final String a;

    /* JADX WARNING: type inference failed for: r0v3, types: [js9, java.lang.Object] */
    static {
        zke[] zkeArr;
        w = EnumEntriesKt.enumEntries((E[]) zkeArr);
        b = new Object();
        CREATOR = new nje(1);
    }

    /* access modifiers changed from: public */
    zke(String str) {
        this.a = str;
    }

    public final Object a(String str) {
        b.getClass();
        for (zke zke : w) {
            if (Intrinsics.areEqual((Object) zke.a, (Object) str)) {
                return zke;
            }
        }
        throw new NoSuchElementException("Collection contains no element matching the predicate.");
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(name());
    }
}
