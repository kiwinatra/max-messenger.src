package com.google.android.gms.auth.api.signin;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;

public class SignInAccount extends h3 implements ReflectedParcelable {
    public static final Parcelable.Creator<SignInAccount> CREATOR = new ivg(29);
    public String a;
    public GoogleSignInAccount b;
    public String c;

    public final void writeToParcel(Parcel parcel, int i) {
        int B0 = tf6.B0(parcel, 20293);
        tf6.w0(parcel, 4, this.a);
        tf6.u0(parcel, 7, this.b, i);
        tf6.w0(parcel, 8, this.c);
        tf6.E0(parcel, B0);
    }
}
