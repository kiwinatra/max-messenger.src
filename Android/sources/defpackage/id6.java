package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.fragment.app.a;
import kotlin.uuid.Uuid;

/* renamed from: id6  reason: default package */
public final class id6 implements Parcelable {
    public static final Parcelable.Creator<id6> CREATOR = new uv4(18);
    public final boolean X;
    public final boolean Y;
    public final int Z;
    public final String a;
    public final String b;
    public final boolean c;
    public final boolean o;
    public final int v;
    public final String v0;
    public final int w;
    public final int w0;
    public final String x;
    public final boolean x0;
    public final boolean y;
    public final boolean z;

    public id6(a aVar) {
        this.a = aVar.getClass().getName();
        this.b = aVar.w;
        this.c = aVar.x0;
        this.o = aVar.z0;
        this.v = aVar.H0;
        this.w = aVar.I0;
        this.x = aVar.J0;
        this.y = aVar.M0;
        this.z = aVar.v0;
        this.X = aVar.L0;
        this.Y = aVar.K0;
        this.Z = aVar.a1.ordinal();
        this.v0 = aVar.z;
        this.w0 = aVar.X;
        this.x0 = aVar.U0;
    }

    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(Uuid.SIZE_BITS);
        sb.append("FragmentState{");
        sb.append(this.a);
        sb.append(" (");
        sb.append(this.b);
        sb.append(")}:");
        if (this.c) {
            sb.append(" fromLayout");
        }
        if (this.o) {
            sb.append(" dynamicContainer");
        }
        int i = this.w;
        if (i != 0) {
            sb.append(" id=0x");
            sb.append(Integer.toHexString(i));
        }
        String str = this.x;
        if (str != null && !str.isEmpty()) {
            sb.append(" tag=");
            sb.append(str);
        }
        if (this.y) {
            sb.append(" retainInstance");
        }
        if (this.z) {
            sb.append(" removing");
        }
        if (this.X) {
            sb.append(" detached");
        }
        if (this.Y) {
            sb.append(" hidden");
        }
        String str2 = this.v0;
        if (str2 != null) {
            sb.append(" targetWho=");
            sb.append(str2);
            sb.append(" targetRequestCode=");
            sb.append(this.w0);
        }
        if (this.x0) {
            sb.append(" userVisibleHint");
        }
        return sb.toString();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.a);
        parcel.writeString(this.b);
        parcel.writeInt(this.c ? 1 : 0);
        parcel.writeInt(this.o ? 1 : 0);
        parcel.writeInt(this.v);
        parcel.writeInt(this.w);
        parcel.writeString(this.x);
        parcel.writeInt(this.y ? 1 : 0);
        parcel.writeInt(this.z ? 1 : 0);
        parcel.writeInt(this.X ? 1 : 0);
        parcel.writeInt(this.Y ? 1 : 0);
        parcel.writeInt(this.Z);
        parcel.writeString(this.v0);
        parcel.writeInt(this.w0);
        parcel.writeInt(this.x0 ? 1 : 0);
    }

    public id6(Parcel parcel) {
        this.a = parcel.readString();
        this.b = parcel.readString();
        boolean z2 = false;
        this.c = parcel.readInt() != 0;
        this.o = parcel.readInt() != 0;
        this.v = parcel.readInt();
        this.w = parcel.readInt();
        this.x = parcel.readString();
        this.y = parcel.readInt() != 0;
        this.z = parcel.readInt() != 0;
        this.X = parcel.readInt() != 0;
        this.Y = parcel.readInt() != 0;
        this.Z = parcel.readInt();
        this.v0 = parcel.readString();
        this.w0 = parcel.readInt();
        this.x0 = parcel.readInt() != 0 ? true : z2;
    }
}
