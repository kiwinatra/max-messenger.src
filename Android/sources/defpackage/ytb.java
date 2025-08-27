package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: ytb  reason: default package */
public final class ytb implements Parcelable {
    public static final Parcelable.Creator<ytb> CREATOR = new w0b(15);
    public final Map a;
    public final List b;
    public final q7a c;

    public ytb(LinkedHashMap linkedHashMap, ArrayList arrayList, q7a q7a) {
        this.a = linkedHashMap;
        this.b = arrayList;
        this.c = q7a;
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ytb)) {
            return false;
        }
        ytb ytb = (ytb) obj;
        return Intrinsics.areEqual((Object) this.a, (Object) ytb.a) && Intrinsics.areEqual((Object) this.b, (Object) ytb.b) && Intrinsics.areEqual((Object) this.c, (Object) ytb.c);
    }

    public final int hashCode() {
        int i = rae.i(this.b, this.a.hashCode() * 31, 31);
        q7a q7a = this.c;
        return i + (q7a == null ? 0 : q7a.hashCode());
    }

    public final String toString() {
        return "PresetAvatarsModel(categories=" + this.a + ", avatars=" + this.b + ", selectedAvatar=" + this.c + ")";
    }

    public final void writeToParcel(Parcel parcel, int i) {
        Map map = this.a;
        parcel.writeInt(map.size());
        for (Map.Entry entry : map.entrySet()) {
            parcel.writeInt(((Number) entry.getKey()).intValue());
            parcel.writeString((String) entry.getValue());
        }
        List<q7a> list = this.b;
        parcel.writeInt(list.size());
        for (q7a writeToParcel : list) {
            writeToParcel.writeToParcel(parcel, i);
        }
        q7a q7a = this.c;
        if (q7a == null) {
            parcel.writeInt(0);
            return;
        }
        parcel.writeInt(1);
        q7a.writeToParcel(parcel, i);
    }
}
