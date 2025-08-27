package defpackage;

import android.media.session.MediaSession;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: mx8  reason: default package */
public final class mx8 implements Parcelable {
    public static final Parcelable.Creator<mx8> CREATOR = new f27(25);
    public final zp8 a;
    public final long b;
    public MediaSession.QueueItem c;

    public mx8(MediaSession.QueueItem queueItem, zp8 zp8, long j) {
        if (zp8 == null) {
            throw new IllegalArgumentException("Description cannot be null");
        } else if (j != -1) {
            this.a = zp8;
            this.b = j;
            this.c = queueItem;
        } else {
            throw new IllegalArgumentException("Id cannot be QueueItem.UNKNOWN_ID");
        }
    }

    public static ArrayList a(List list) {
        if (list == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            MediaSession.QueueItem queueItem = (MediaSession.QueueItem) it.next();
            arrayList.add(new mx8(queueItem, zp8.a(lx8.b(queueItem)), lx8.c(queueItem)));
        }
        return arrayList;
    }

    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MediaSession.QueueItem {Description=");
        sb.append(this.a);
        sb.append(", Id=");
        return wj6.m(sb, this.b, " }");
    }

    public final void writeToParcel(Parcel parcel, int i) {
        this.a.writeToParcel(parcel, i);
        parcel.writeLong(this.b);
    }

    public mx8(Parcel parcel) {
        this.a = zp8.CREATOR.createFromParcel(parcel);
        this.b = parcel.readLong();
    }
}
