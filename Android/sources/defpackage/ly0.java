package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Objects;

/* renamed from: ly0  reason: default package */
public final class ly0 implements Parcelable {
    public static final Parcelable.Creator<ly0> CREATOR = new s6(16);
    public final at9 a;
    public final at9 b;
    public final l84 c;
    public final at9 o;
    public final int v;
    public final int w;
    public final int x;

    public ly0(at9 at9, at9 at92, l84 l84, at9 at93, int i) {
        Objects.requireNonNull(at9, "start cannot be null");
        Objects.requireNonNull(at92, "end cannot be null");
        Objects.requireNonNull(l84, "validator cannot be null");
        this.a = at9;
        this.b = at92;
        this.o = at93;
        this.v = i;
        this.c = l84;
        if (at93 != null && at9.a.compareTo(at93.a) > 0) {
            throw new IllegalArgumentException("start Month cannot be after current Month");
        } else if (at93 != null && at93.a.compareTo(at92.a) > 0) {
            throw new IllegalArgumentException("current Month cannot be after end Month");
        } else if (i < 0 || i > q0g.d((Calendar) null).getMaximum(7)) {
            throw new IllegalArgumentException("firstDayOfWeek is not valid");
        } else {
            this.x = at9.d(at92) + 1;
            this.w = (at92.c - at9.c) + 1;
        }
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ly0)) {
            return false;
        }
        ly0 ly0 = (ly0) obj;
        return this.a.equals(ly0.a) && this.b.equals(ly0.b) && Objects.equals(this.o, ly0.o) && this.v == ly0.v && this.c.equals(ly0.c);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b, this.o, Integer.valueOf(this.v), this.c});
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.a, 0);
        parcel.writeParcelable(this.b, 0);
        parcel.writeParcelable(this.o, 0);
        parcel.writeParcelable(this.c, 0);
        parcel.writeInt(this.v);
    }
}
