package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: dz7  reason: default package */
public class dz7 implements Parcelable {
    public static final Parcelable.Creator<dz7> CREATOR = new f27(11);
    public final long a;
    public final long b;
    public final long c;
    public final long o;

    public dz7(long j, long j2, long j3, long j4) {
        this.a = j;
        this.b = j2;
        this.c = j3;
        this.o = j4;
    }

    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("DeepLinkData{chatId=");
        sb.append(this.a);
        sb.append(", messageServerId=");
        sb.append(this.b);
        sb.append(", contactId=");
        sb.append(this.c);
        sb.append(", stickerSetId=");
        return i2a.j(sb, this.o, '}');
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(this.a);
        parcel.writeLong(this.b);
        parcel.writeLong(this.c);
        parcel.writeLong(this.o);
    }

    public dz7(Parcel parcel) {
        this.a = parcel.readLong();
        this.b = parcel.readLong();
        this.c = parcel.readLong();
        this.o = parcel.readLong();
    }
}
