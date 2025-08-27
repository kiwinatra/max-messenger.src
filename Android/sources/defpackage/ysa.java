package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: ysa  reason: default package */
public final class ysa implements Parcelable {
    public static final Parcelable.Creator<ysa> CREATOR = new ia9(19);
    public final String a;
    public final int b;
    public final int c;
    public final Integer o;

    public ysa(int i, int i2, Integer num, String str) {
        this.a = str;
        this.b = i;
        this.c = i2;
        this.o = num;
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ysa)) {
            return false;
        }
        ysa ysa = (ysa) obj;
        return Intrinsics.areEqual((Object) this.a, (Object) ysa.a) && this.b == ysa.b && this.c == ysa.c && Intrinsics.areEqual((Object) this.o, (Object) ysa.o);
    }

    public final int hashCode() {
        int h = rae.h(this.c, rae.h(this.b, this.a.hashCode() * 31, 31), 31);
        Integer num = this.o;
        return h + (num == null ? 0 : num.hashCode());
    }

    public final String toString() {
        return "OneMeCountryModel(countryNameCode=" + this.a + ", countryPhoneCode=" + this.b + ", countryName=" + this.c + ", flagDrawable=" + this.o + ")";
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int intValue;
        parcel.writeString(this.a);
        parcel.writeInt(this.b);
        parcel.writeInt(this.c);
        Integer num = this.o;
        if (num == null) {
            intValue = 0;
        } else {
            parcel.writeInt(1);
            intValue = num.intValue();
        }
        parcel.writeInt(intValue);
    }
}
