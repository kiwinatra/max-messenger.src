package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Locale;

/* renamed from: at9  reason: default package */
public final class at9 implements Comparable, Parcelable {
    public static final Parcelable.Creator<at9> CREATOR = new ia9(9);
    public final Calendar a;
    public final int b;
    public final int c;
    public final int o;
    public final int v;
    public final long w;
    public String x;

    public at9(Calendar calendar) {
        calendar.set(5, 1);
        Calendar b2 = q0g.b(calendar);
        this.a = b2;
        this.b = b2.get(2);
        this.c = b2.get(1);
        this.o = b2.getMaximum(7);
        this.v = b2.getActualMaximum(5);
        this.w = b2.getTimeInMillis();
    }

    public static at9 a(int i, int i2) {
        Calendar d = q0g.d((Calendar) null);
        d.set(1, i);
        d.set(2, i2);
        return new at9(d);
    }

    public static at9 b(long j) {
        Calendar d = q0g.d((Calendar) null);
        d.setTimeInMillis(j);
        return new at9(d);
    }

    public final String c() {
        if (this.x == null) {
            this.x = q0g.a("yMMMM", Locale.getDefault()).format(new Date(this.a.getTimeInMillis()));
        }
        return this.x;
    }

    public final int compareTo(Object obj) {
        return this.a.compareTo(((at9) obj).a);
    }

    public final int d(at9 at9) {
        if (this.a instanceof GregorianCalendar) {
            return (at9.b - this.b) + ((at9.c - this.c) * 12);
        }
        throw new IllegalArgumentException("Only Gregorian calendars are supported.");
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof at9)) {
            return false;
        }
        at9 at9 = (at9) obj;
        return this.b == at9.b && this.c == at9.c;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.b), Integer.valueOf(this.c)});
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.c);
        parcel.writeInt(this.b);
    }
}
