package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

/* renamed from: fd6  reason: default package */
public final class fd6 implements Parcelable {
    public static final Parcelable.Creator<fd6> CREATOR = new uv4(17);
    public ArrayList a;
    public ArrayList b;
    public ye0[] c;
    public int o;
    public String v = null;
    public ArrayList w = new ArrayList();
    public ArrayList x = new ArrayList();
    public ArrayList y;

    public fd6(Parcel parcel) {
        this.a = parcel.createStringArrayList();
        this.b = parcel.createStringArrayList();
        this.c = (ye0[]) parcel.createTypedArray(ye0.CREATOR);
        this.o = parcel.readInt();
        this.v = parcel.readString();
        this.w = parcel.createStringArrayList();
        this.x = parcel.createTypedArrayList(ze0.CREATOR);
        this.y = parcel.createTypedArrayList(zc6.CREATOR);
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeStringList(this.a);
        parcel.writeStringList(this.b);
        parcel.writeTypedArray(this.c, i);
        parcel.writeInt(this.o);
        parcel.writeString(this.v);
        parcel.writeStringList(this.w);
        parcel.writeTypedList(this.x);
        parcel.writeTypedList(this.y);
    }
}
