package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import org.apache.http.cookie.ClientCookie;

/* renamed from: tj5  reason: default package */
public final class tj5 extends h3 {
    public static final Parcelable.Creator<tj5> CREATOR = new ivg(28);
    public final String a;
    public final int b;
    public final long c;

    public tj5(int i, String str, long j) {
        this.a = str;
        this.b = i;
        this.c = j;
    }

    public final long b() {
        long j = this.c;
        return j == -1 ? (long) this.b : j;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof tj5) {
            tj5 tj5 = (tj5) obj;
            String str = this.a;
            return ((str != null && str.equals(tj5.a)) || (str == null && tj5.a == null)) && b() == tj5.b();
        }
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, Long.valueOf(b())});
    }

    public final String toString() {
        fj fjVar = new fj((Object) this);
        fjVar.k(this.a, "name");
        fjVar.k(Long.valueOf(b()), ClientCookie.VERSION_ATTR);
        return fjVar.toString();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int B0 = tf6.B0(parcel, 20293);
        tf6.w0(parcel, 1, this.a);
        tf6.G0(parcel, 2, 4);
        parcel.writeInt(this.b);
        long b2 = b();
        tf6.G0(parcel, 3, 8);
        parcel.writeLong(b2);
        tf6.E0(parcel, B0);
    }

    public tj5(String str, long j) {
        this.a = str;
        this.c = j;
        this.b = -1;
    }
}
