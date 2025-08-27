package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* renamed from: ns9  reason: default package */
public final class ns9 extends u77 {
    public static final Parcelable.Creator<ns9> CREATOR = new ia9(6);
    public final int b;
    public final int c;
    public final int o;
    public final int[] v;
    public final int[] w;

    public ns9(int[] iArr, int[] iArr2, int i, int i2, int i3) {
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
        if (obj == null || ns9.class != obj.getClass()) {
            return false;
        }
        ns9 ns9 = (ns9) obj;
        return this.b == ns9.b && this.c == ns9.c && this.o == ns9.o && Arrays.equals(this.v, ns9.v) && Arrays.equals(this.w, ns9.w);
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

    public ns9(Parcel parcel) {
        super("MLLT");
        this.b = parcel.readInt();
        this.c = parcel.readInt();
        this.o = parcel.readInt();
        int[] createIntArray = parcel.createIntArray();
        int i = v0g.a;
        this.v = createIntArray;
        this.w = parcel.createIntArray();
    }
}
