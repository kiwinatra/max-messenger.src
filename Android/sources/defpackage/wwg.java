package defpackage;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;

/* renamed from: wwg  reason: default package */
public final class wwg extends h3 {
    public static final Parcelable.Creator<wwg> CREATOR = new ivg(5);
    public final int a;
    public final Account b;
    public final int c;
    public final GoogleSignInAccount o;

    public wwg(int i, Account account, int i2, GoogleSignInAccount googleSignInAccount) {
        this.a = i;
        this.b = account;
        this.c = i2;
        this.o = googleSignInAccount;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int B0 = tf6.B0(parcel, 20293);
        tf6.G0(parcel, 1, 4);
        parcel.writeInt(this.a);
        tf6.u0(parcel, 2, this.b, i);
        tf6.G0(parcel, 3, 4);
        parcel.writeInt(this.c);
        tf6.u0(parcel, 4, this.o, i);
        tf6.E0(parcel, B0);
    }
}
