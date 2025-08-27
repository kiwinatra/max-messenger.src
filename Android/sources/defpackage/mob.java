package defpackage;

import android.media.session.PlaybackState;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.List;

/* renamed from: mob  reason: default package */
public final class mob implements Parcelable {
    public static final Parcelable.Creator<mob> CREATOR = new w0b(10);
    public final long X;
    public final Bundle Y;
    public PlaybackState Z;
    public final int a;
    public final long b;
    public final long c;
    public final float o;
    public final long v;
    public final int w;
    public final CharSequence x;
    public final long y;
    public final AbstractCollection z;

    public mob(int i, long j, long j2, float f, long j3, int i2, CharSequence charSequence, long j4, List list, long j5, Bundle bundle) {
        AbstractCollection abstractCollection;
        List list2 = list;
        this.a = i;
        this.b = j;
        this.c = j2;
        this.o = f;
        this.v = j3;
        this.w = i2;
        this.x = charSequence;
        this.y = j4;
        if (list2 == null) {
            lx5 lx5 = tb7.b;
            abstractCollection = k0d.v;
        } else {
            abstractCollection = new ArrayList(list2);
        }
        this.z = abstractCollection;
        this.X = j5;
        this.Y = bundle;
    }

    public static mob a(Object obj) {
        ArrayList arrayList = null;
        if (obj == null) {
            return null;
        }
        PlaybackState playbackState = (PlaybackState) obj;
        List<PlaybackState.CustomAction> j = iob.j(playbackState);
        if (j != null) {
            arrayList = new ArrayList(j.size());
            for (PlaybackState.CustomAction next : j) {
                if (next != null) {
                    PlaybackState.CustomAction customAction = next;
                    Bundle l = iob.l(customAction);
                    px8.a(l);
                    lob lob = new lob(iob.f(customAction), iob.o(customAction), iob.m(customAction), l);
                    lob.v = customAction;
                    arrayList.add(lob);
                }
            }
        }
        Bundle a2 = job.a(playbackState);
        px8.a(a2);
        mob mob = new mob(iob.r(playbackState), iob.q(playbackState), iob.i(playbackState), iob.p(playbackState), iob.g(playbackState), 0, iob.k(playbackState), iob.n(playbackState), arrayList, iob.h(playbackState), a2);
        mob.Z = playbackState;
        return mob;
    }

    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PlaybackState {state=");
        sb.append(this.a);
        sb.append(", position=");
        sb.append(this.b);
        sb.append(", buffered position=");
        sb.append(this.c);
        sb.append(", speed=");
        sb.append(this.o);
        sb.append(", updated=");
        sb.append(this.y);
        sb.append(", actions=");
        sb.append(this.v);
        sb.append(", error code=");
        sb.append(this.w);
        sb.append(", error message=");
        sb.append(this.x);
        sb.append(", custom actions=");
        sb.append(this.z);
        sb.append(", active item id=");
        return wj6.m(sb, this.X, "}");
    }

    /* JADX WARNING: type inference failed for: r4v1, types: [java.util.AbstractCollection, java.util.List] */
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.a);
        parcel.writeLong(this.b);
        parcel.writeFloat(this.o);
        parcel.writeLong(this.y);
        parcel.writeLong(this.c);
        parcel.writeLong(this.v);
        TextUtils.writeToParcel(this.x, parcel, i);
        parcel.writeTypedList(this.z);
        parcel.writeLong(this.X);
        parcel.writeBundle(this.Y);
        parcel.writeInt(this.w);
    }

    public mob(Parcel parcel) {
        this.a = parcel.readInt();
        this.b = parcel.readLong();
        this.o = parcel.readFloat();
        this.y = parcel.readLong();
        this.c = parcel.readLong();
        this.v = parcel.readLong();
        this.x = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        AbstractCollection createTypedArrayList = parcel.createTypedArrayList(lob.CREATOR);
        if (createTypedArrayList == null) {
            lx5 lx5 = tb7.b;
            createTypedArrayList = k0d.v;
        }
        this.z = createTypedArrayList;
        this.X = parcel.readLong();
        this.Y = parcel.readBundle(px8.class.getClassLoader());
        this.w = parcel.readInt();
    }
}
