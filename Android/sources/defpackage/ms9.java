package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* renamed from: ms9  reason: default package */
public final class ms9 extends t77 {
    public static final Parcelable.Creator<ms9> CREATOR = new ia9(5);
    public final int b;
    public final int c;
    public final int o;
    public final int[] v;
    public final int[] w;

    public ms9(int[] iArr, int[] iArr2, int i, int i2, int i3) {
        super("MLLT");
        this.b = i;
        this.c = i2;
        this.o = i3;
        this.v = iArr;
        this.w = iArr2;
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || ms9.class != obj.getClass()) {
            return false;
        }
        ms9 ms9 = (ms9) obj;
        return this.b == ms9.b && this.c == ms9.c && this.o == ms9.o && Arrays.equals(this.v, ms9.v) && Arrays.equals(this.w, ms9.w);
    }

    public final int hashCode() {
        int hashCode = Arrays.hashCode(this.v);
        return Arrays.hashCode(this.w) + ((hashCode + ((((((527 + this.b) * 31) + this.c) * 31) + this.o) * 31)) * 31);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.b);
        parcel.writeInt(this.c);
        parcel.writeInt(this.o);
        parcel.writeIntArray(this.v);
        parcel.writeIntArray(this.w);
    }

    public ms9(Parcel parcel) {
        super("MLLT");
        this.b = parcel.readInt();
        this.c = parcel.readInt();
        this.o = parcel.readInt();
        int[] createIntArray = parcel.createIntArray();
        int i = t0g.a;
        this.v = createIntArray;
        this.w = parcel.createIntArray();
    }
}
