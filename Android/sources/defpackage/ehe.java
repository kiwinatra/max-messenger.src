package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: ehe  reason: default package */
public final class ehe extends yge {
    public static final Parcelable.Creator<ehe> CREATOR = new g9d(20);
    public final long X;
    public final int Y;
    public final int Z;
    public final long a;
    public final boolean b;
    public final boolean c;
    public final boolean o;
    public final boolean v;
    public final int v0;
    public final long w;
    public final long x;
    public final List y;
    public final boolean z;

    public ehe(long j, boolean z2, boolean z3, boolean z4, boolean z5, long j2, long j3, List list, boolean z6, long j4, int i, int i2, int i3) {
        this.a = j;
        this.b = z2;
        this.c = z3;
        this.o = z4;
        this.v = z5;
        this.w = j2;
        this.x = j3;
        this.y = Collections.unmodifiableList(list);
        this.z = z6;
        this.X = j4;
        this.Y = i;
        this.Z = i2;
        this.v0 = i3;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SCTE-35 SpliceInsertCommand { programSplicePts=");
        sb.append(this.w);
        sb.append(", programSplicePlaybackPositionUs= ");
        return wj6.m(sb, this.x, " }");
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(this.a);
        parcel.writeByte(this.b ? (byte) 1 : 0);
        parcel.writeByte(this.c ? (byte) 1 : 0);
        parcel.writeByte(this.o ? (byte) 1 : 0);
        parcel.writeByte(this.v ? (byte) 1 : 0);
        parcel.writeLong(this.w);
        parcel.writeLong(this.x);
        List list = this.y;
        int size = list.size();
        parcel.writeInt(size);
        for (int i2 = 0; i2 < size; i2++) {
            che che = (che) list.get(i2);
            parcel.writeInt(che.a);
            parcel.writeLong(che.b);
            parcel.writeLong(che.c);
        }
        parcel.writeByte(this.z ? (byte) 1 : 0);
        parcel.writeLong(this.X);
        parcel.writeInt(this.Y);
        parcel.writeInt(this.Z);
        parcel.writeInt(this.v0);
    }

    public ehe(Parcel parcel) {
        this.a = parcel.readLong();
        boolean z2 = true;
        this.b = parcel.readByte() == 1;
        this.c = parcel.readByte() == 1;
        this.o = parcel.readByte() == 1;
        this.v = parcel.readByte() == 1;
        this.w = parcel.readLong();
        this.x = parcel.readLong();
        int readInt = parcel.readInt();
        ArrayList arrayList = new ArrayList(readInt);
        for (int i = 0; i < readInt; i++) {
            arrayList.add(new che(parcel.readInt(), parcel.readLong(), parcel.readLong()));
        }
        this.y = Collections.unmodifiableList(arrayList);
        this.z = parcel.readByte() != 1 ? false : z2;
        this.X = parcel.readLong();
        this.Y = parcel.readInt();
        this.Z = parcel.readInt();
        this.v0 = parcel.readInt();
    }
}
