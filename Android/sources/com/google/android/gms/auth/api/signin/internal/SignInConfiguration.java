package com.google.android.gms.auth.api.signin.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.common.internal.ReflectedParcelable;

public final class SignInConfiguration extends h3 implements ReflectedParcelable {
    public static final Parcelable.Creator<SignInConfiguration> CREATOR = new o0h(16);
    public final String a;
    public final GoogleSignInOptions b;

    public SignInConfiguration(String str, GoogleSignInOptions googleSignInOptions) {
        vzg.i(str);
        this.a = str;
        this.b = googleSignInOptions;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof SignInConfiguration)) {
            return false;
        }
        SignInConfiguration signInConfiguration = (SignInConfiguration) obj;
        if (this.a.equals(signInConfiguration.a)) {
            GoogleSignInOptions googleSignInOptions = signInConfiguration.b;
            GoogleSignInOptions googleSignInOptions2 = this.b;
            if (googleSignInOptions2 == null) {
                if (googleSignInOptions == null) {
                    return true;
                }
            } else if (googleSignInOptions2.equals(googleSignInOptions)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = 1 * 31;
        int i2 = 0;
        String str = this.a;
        int hashCode = (i + (str == null ? 0 : str.hashCode())) * 31;
        GoogleSignInOptions googleSignInOptions = this.b;
        if (googleSignInOptions != null) {
            i2 = googleSignInOptions.hashCode();
        }
        return hashCode + i2;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int B0 = tf6.B0(parcel, 20293);
        tf6.w0(parcel, 2, this.a);
        tf6.u0(parcel, 5, this.b, i);
        tf6.E0(parcel, B0);
    }
}
