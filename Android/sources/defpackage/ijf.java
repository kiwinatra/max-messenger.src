package defpackage;

import android.content.res.Resources;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* renamed from: ijf  reason: default package */
public final class ijf implements Parcelable {
    public static final Parcelable.Creator<ijf> CREATOR = new nje(10);
    public final mh8 a;
    public final mh8 b;
    public final int c;
    public int o;
    public int v;
    public int w;
    public int x;

    public ijf(int i) {
        this(0, 0, 10, i);
    }

    public static String a(Resources resources, CharSequence charSequence, String str) {
        try {
            return String.format(resources.getConfiguration().locale, str, new Object[]{Integer.valueOf(Integer.parseInt(String.valueOf(charSequence)))});
        } catch (NumberFormatException unused) {
            return null;
        }
    }

    public final int b() {
        if (this.c == 1) {
            return this.o % 24;
        }
        int i = this.o;
        if (i % 12 == 0) {
            return 12;
        }
        return this.x == 1 ? i - 12 : i;
    }

    public final void c(int i) {
        if (this.c == 1) {
            this.o = i;
            return;
        }
        int i2 = 12;
        int i3 = i % 12;
        if (this.x != 1) {
            i2 = 0;
        }
        this.o = i3 + i2;
    }

    public final void d(int i) {
        this.v = i % 60;
    }

    public final int describeContents() {
        return 0;
    }

    public final void e(int i) {
        if (i != this.x) {
            this.x = i;
            int i2 = this.o;
            if (i2 < 12 && i == 1) {
                this.o = i2 + 12;
            } else if (i2 >= 12 && i == 0) {
                this.o = i2 - 12;
            }
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ijf)) {
            return false;
        }
        ijf ijf = (ijf) obj;
        return this.o == ijf.o && this.v == ijf.v && this.c == ijf.c && this.w == ijf.w;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.c), Integer.valueOf(this.o), Integer.valueOf(this.v), Integer.valueOf(this.w)});
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.o);
        parcel.writeInt(this.v);
        parcel.writeInt(this.w);
        parcel.writeInt(this.c);
    }

    public ijf(int i, int i2, int i3, int i4) {
        this.o = i;
        this.v = i2;
        this.w = i3;
        this.c = i4;
        int i5 = 12;
        this.x = i >= 12 ? 1 : 0;
        this.a = new mh8(59);
        this.b = new mh8(i4 == 1 ? 23 : i5);
    }
}
