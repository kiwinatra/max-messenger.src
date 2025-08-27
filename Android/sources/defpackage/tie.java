package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* renamed from: tie  reason: default package */
public final class tie implements Parcelable {
    public static final Parcelable.Creator<tie> CREATOR = new g9d(25);
    public int a;
    public int b;
    public int[] c;
    public boolean o;

    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        return "FullSpanItem{mPosition=" + this.a + ", mGapDir=" + this.b + ", mHasUnwantedGapAfter=" + this.o + ", mGapPerSpan=" + Arrays.toString(this.c) + '}';
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.a);
        parcel.writeInt(this.b);
        parcel.writeInt(this.o ? 1 : 0);
        int[] iArr = this.c;
        if (iArr == null || iArr.length <= 0) {
            parcel.writeInt(0);
            return;
        }
        parcel.writeInt(iArr.length);
        parcel.writeIntArray(this.c);
    }
}
