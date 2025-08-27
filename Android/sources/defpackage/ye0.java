package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import androidx.fragment.app.a;
import java.util.ArrayList;

/* renamed from: ye0  reason: default package */
public final class ye0 implements Parcelable {
    public static final Parcelable.Creator<ye0> CREATOR = new s6(9);
    public final int X;
    public final CharSequence Y;
    public final ArrayList Z;
    public final int[] a;
    public final ArrayList b;
    public final int[] c;
    public final int[] o;
    public final int v;
    public final ArrayList v0;
    public final String w;
    public final boolean w0;
    public final int x;
    public final int y;
    public final CharSequence z;

    public ye0(xe0 xe0) {
        int size = xe0.a.size();
        this.a = new int[(size * 6)];
        if (xe0.g) {
            this.b = new ArrayList(size);
            this.c = new int[size];
            this.o = new int[size];
            int i = 0;
            for (int i2 = 0; i2 < size; i2++) {
                md6 md6 = (md6) xe0.a.get(i2);
                int i3 = i + 1;
                this.a[i] = md6.a;
                ArrayList arrayList = this.b;
                a aVar = md6.b;
                arrayList.add(aVar != null ? aVar.w : null);
                int[] iArr = this.a;
                iArr[i3] = md6.c;
                iArr[i + 2] = md6.d;
                iArr[i + 3] = md6.e;
                int i4 = i + 5;
                iArr[i + 4] = md6.f;
                i += 6;
                iArr[i4] = md6.g;
                this.c[i2] = md6.h.ordinal();
                this.o[i2] = md6.i.ordinal();
            }
            this.v = xe0.f;
            this.w = xe0.i;
            this.x = xe0.t;
            this.y = xe0.j;
            this.z = xe0.k;
            this.X = xe0.l;
            this.Y = xe0.m;
            this.Z = xe0.n;
            this.v0 = xe0.o;
            this.w0 = xe0.p;
            return;
        }
        throw new IllegalStateException("Not on back stack");
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeIntArray(this.a);
        parcel.writeStringList(this.b);
        parcel.writeIntArray(this.c);
        parcel.writeIntArray(this.o);
        parcel.writeInt(this.v);
        parcel.writeString(this.w);
        parcel.writeInt(this.x);
        parcel.writeInt(this.y);
        TextUtils.writeToParcel(this.z, parcel, 0);
        parcel.writeInt(this.X);
        TextUtils.writeToParcel(this.Y, parcel, 0);
        parcel.writeStringList(this.Z);
        parcel.writeStringList(this.v0);
        parcel.writeInt(this.w0 ? 1 : 0);
    }

    public ye0(Parcel parcel) {
        this.a = parcel.createIntArray();
        this.b = parcel.createStringArrayList();
        this.c = parcel.createIntArray();
        this.o = parcel.createIntArray();
        this.v = parcel.readInt();
        this.w = parcel.readString();
        this.x = parcel.readInt();
        this.y = parcel.readInt();
        Parcelable.Creator creator = TextUtils.CHAR_SEQUENCE_CREATOR;
        this.z = (CharSequence) creator.createFromParcel(parcel);
        this.X = parcel.readInt();
        this.Y = (CharSequence) creator.createFromParcel(parcel);
        this.Z = parcel.createStringArrayList();
        this.v0 = parcel.createStringArrayList();
        this.w0 = parcel.readInt() != 0;
    }
}
