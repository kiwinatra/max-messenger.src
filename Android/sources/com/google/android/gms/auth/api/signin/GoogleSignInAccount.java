package com.google.android.gms.auth.api.signin;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.ReflectedParcelable;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

@Deprecated
public class GoogleSignInAccount extends h3 implements ReflectedParcelable {
    public static final Parcelable.Creator<GoogleSignInAccount> CREATOR = new ivg(0);
    public final List X;
    public final String Y;
    public final String Z;
    public final int a;
    public final String b;
    public final String c;
    public final String o;
    public final String v;
    public final HashSet v0 = new HashSet();
    public final Uri w;
    public String x;
    public final long y;
    public final String z;

    public GoogleSignInAccount(int i, String str, String str2, String str3, String str4, Uri uri, String str5, long j, String str6, ArrayList arrayList, String str7, String str8) {
        this.a = i;
        this.b = str;
        this.c = str2;
        this.o = str3;
        this.v = str4;
        this.w = uri;
        this.x = str5;
        this.y = j;
        this.z = str6;
        this.X = arrayList;
        this.Y = str7;
        this.Z = str8;
    }

    public static GoogleSignInAccount b(String str) {
        String str2 = null;
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        JSONObject jSONObject = new JSONObject(str);
        String optString = jSONObject.optString("photoUrl");
        Uri parse = !TextUtils.isEmpty(optString) ? Uri.parse(optString) : null;
        long parseLong = Long.parseLong(jSONObject.getString("expirationTime"));
        HashSet hashSet = new HashSet();
        JSONArray jSONArray = jSONObject.getJSONArray("grantedScopes");
        int length = jSONArray.length();
        for (int i = 0; i < length; i++) {
            hashSet.add(new Scope(1, jSONArray.getString(i)));
        }
        String optString2 = jSONObject.optString("id");
        String optString3 = jSONObject.has("tokenId") ? jSONObject.optString("tokenId") : null;
        String optString4 = jSONObject.has("email") ? jSONObject.optString("email") : null;
        String optString5 = jSONObject.has("displayName") ? jSONObject.optString("displayName") : null;
        String optString6 = jSONObject.has("givenName") ? jSONObject.optString("givenName") : null;
        String optString7 = jSONObject.has("familyName") ? jSONObject.optString("familyName") : null;
        String string = jSONObject.getString("obfuscatedIdentifier");
        vzg.i(string);
        GoogleSignInAccount googleSignInAccount = r3;
        GoogleSignInAccount googleSignInAccount2 = new GoogleSignInAccount(3, optString2, optString3, optString4, optString5, parse, (String) null, parseLong, string, new ArrayList(hashSet), optString6, optString7);
        if (jSONObject.has("serverAuthCode")) {
            str2 = jSONObject.optString("serverAuthCode");
        }
        googleSignInAccount.x = str2;
        return googleSignInAccount;
    }

    public final boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof GoogleSignInAccount)) {
            return false;
        }
        GoogleSignInAccount googleSignInAccount = (GoogleSignInAccount) obj;
        if (googleSignInAccount.z.equals(this.z)) {
            HashSet hashSet = new HashSet(googleSignInAccount.X);
            hashSet.addAll(googleSignInAccount.v0);
            HashSet hashSet2 = new HashSet(this.X);
            hashSet2.addAll(this.v0);
            if (hashSet.equals(hashSet2)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        HashSet hashSet = new HashSet(this.X);
        hashSet.addAll(this.v0);
        return ((this.z.hashCode() + 527) * 31) + hashSet.hashCode();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int B0 = tf6.B0(parcel, 20293);
        tf6.G0(parcel, 1, 4);
        parcel.writeInt(this.a);
        tf6.w0(parcel, 2, this.b);
        tf6.w0(parcel, 3, this.c);
        tf6.w0(parcel, 4, this.o);
        tf6.w0(parcel, 5, this.v);
        tf6.u0(parcel, 6, this.w, i);
        tf6.w0(parcel, 7, this.x);
        tf6.G0(parcel, 8, 8);
        parcel.writeLong(this.y);
        tf6.w0(parcel, 9, this.z);
        tf6.y0(parcel, this.X, 10);
        tf6.w0(parcel, 11, this.Y);
        tf6.w0(parcel, 12, this.Z);
        tf6.E0(parcel, B0);
    }
}
