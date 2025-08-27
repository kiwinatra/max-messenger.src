package defpackage;

import android.os.Parcel;
import android.util.SparseIntArray;

/* renamed from: s2g  reason: default package */
public final class s2g extends r2g {
    public final SparseIntArray d;
    public final Parcel e;
    public final int f;
    public final int g;
    public final String h;
    public int i;
    public int j;
    public int k;

    /* JADX WARNING: type inference failed for: r5v0, types: [qae, ts] */
    /* JADX WARNING: type inference failed for: r6v0, types: [qae, ts] */
    /* JADX WARNING: type inference failed for: r7v0, types: [qae, ts] */
    public s2g(Parcel parcel) {
        this(parcel, parcel.dataPosition(), parcel.dataSize(), "", new qae(), new qae(), new qae());
    }

    public final s2g a() {
        Parcel parcel = this.e;
        int dataPosition = parcel.dataPosition();
        int i2 = this.j;
        if (i2 == this.f) {
            i2 = this.g;
        }
        return new s2g(parcel, dataPosition, i2, wj6.n(new StringBuilder(), this.h, "  "), this.a, this.b, this.c);
    }

    public final boolean e(int i2) {
        while (this.j < this.g) {
            int i3 = this.k;
            if (i3 == i2) {
                return true;
            }
            if (String.valueOf(i3).compareTo(String.valueOf(i2)) > 0) {
                return false;
            }
            int i4 = this.j;
            Parcel parcel = this.e;
            parcel.setDataPosition(i4);
            int readInt = parcel.readInt();
            this.k = parcel.readInt();
            this.j += readInt;
        }
        return this.k == i2;
    }

    public final void i(int i2) {
        int i3 = this.i;
        SparseIntArray sparseIntArray = this.d;
        Parcel parcel = this.e;
        if (i3 >= 0) {
            int i4 = sparseIntArray.get(i3);
            int dataPosition = parcel.dataPosition();
            parcel.setDataPosition(i4);
            parcel.writeInt(dataPosition - i4);
            parcel.setDataPosition(dataPosition);
        }
        this.i = i2;
        sparseIntArray.put(i2, parcel.dataPosition());
        parcel.writeInt(0);
        parcel.writeInt(i2);
    }

    public s2g(Parcel parcel, int i2, int i3, String str, ts tsVar, ts tsVar2, ts tsVar3) {
        super(tsVar, tsVar2, tsVar3);
        this.d = new SparseIntArray();
        this.i = -1;
        this.k = -1;
        this.e = parcel;
        this.f = i2;
        this.g = i3;
        this.j = i2;
        this.h = str;
    }
}
