package com.google.android.gms.auth.api.signin;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.ReflectedParcelable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;

@Deprecated
public class GoogleSignInOptions extends h3 implements pl, ReflectedParcelable {
    public static final Parcelable.Creator<GoogleSignInOptions> CREATOR = new ivg(1);
    public static final GoogleSignInOptions Z;
    public static final Scope v0;
    public static final Scope w0;
    public static final Scope x0 = new Scope(1, "https://www.googleapis.com/auth/games");
    public static final ed7 y0 = new ed7(17);
    public final String X;
    public final Map Y;
    public final int a;
    public final ArrayList b;
    public final Account c;
    public final boolean o;
    public final boolean v;
    public final boolean w;
    public final String x;
    public final String y;
    public final ArrayList z;

    static {
        Scope scope = new Scope(1, "profile");
        new Scope(1, "email");
        Scope scope2 = new Scope(1, "openid");
        v0 = scope2;
        Scope scope3 = new Scope(1, "https://www.googleapis.com/auth/games_lite");
        w0 = scope3;
        HashSet hashSet = new HashSet();
        HashMap hashMap = new HashMap();
        hashSet.add(scope2);
        hashSet.add(scope);
        if (hashSet.contains(x0)) {
            Scope scope4 = w0;
            if (hashSet.contains(scope4)) {
                hashSet.remove(scope4);
            }
        }
        Z = new GoogleSignInOptions(3, new ArrayList(hashSet), (Account) null, false, false, false, (String) null, (String) null, hashMap, (String) null);
        HashSet hashSet2 = new HashSet();
        HashMap hashMap2 = new HashMap();
        hashSet2.add(scope3);
        hashSet2.addAll(Arrays.asList(new Scope[0]));
        if (hashSet2.contains(x0)) {
            Scope scope5 = w0;
            if (hashSet2.contains(scope5)) {
                hashSet2.remove(scope5);
            }
        }
        new GoogleSignInOptions(3, new ArrayList(hashSet2), (Account) null, false, false, false, (String) null, (String) null, hashMap2, (String) null);
    }

    public GoogleSignInOptions(int i, ArrayList arrayList, Account account, boolean z2, boolean z3, boolean z4, String str, String str2, Map map, String str3) {
        this.a = i;
        this.b = arrayList;
        this.c = account;
        this.o = z2;
        this.v = z3;
        this.w = z4;
        this.x = str;
        this.y = str2;
        this.z = new ArrayList(map.values());
        this.Y = map;
        this.X = str3;
    }

    public static GoogleSignInOptions b(String str) {
        String str2 = null;
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        JSONObject jSONObject = new JSONObject(str);
        HashSet hashSet = new HashSet();
        JSONArray jSONArray = jSONObject.getJSONArray("scopes");
        int length = jSONArray.length();
        for (int i = 0; i < length; i++) {
            hashSet.add(new Scope(1, jSONArray.getString(i)));
        }
        String optString = jSONObject.has("accountName") ? jSONObject.optString("accountName") : null;
        Account account = !TextUtils.isEmpty(optString) ? new Account(optString, "com.google") : null;
        ArrayList arrayList = new ArrayList(hashSet);
        boolean z2 = jSONObject.getBoolean("idTokenRequested");
        boolean z3 = jSONObject.getBoolean("serverAuthRequested");
        boolean z4 = jSONObject.getBoolean("forceCodeForRefreshToken");
        String optString2 = jSONObject.has("serverClientId") ? jSONObject.optString("serverClientId") : null;
        if (jSONObject.has("hostedDomain")) {
            str2 = jSONObject.optString("hostedDomain");
        }
        return new GoogleSignInOptions(3, arrayList, account, z2, z3, z4, optString2, str2, new HashMap(), (String) null);
    }

    public static HashMap c(List list) {
        HashMap hashMap = new HashMap();
        if (list != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                qt6 qt6 = (qt6) it.next();
                hashMap.put(Integer.valueOf(qt6.b), qt6);
            }
        }
        return hashMap;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0047, code lost:
        if (r1.equals(r5) != false) goto L_0x0049;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean equals(java.lang.Object r9) {
        /*
            r8 = this;
            java.lang.String r0 = r8.x
            java.util.ArrayList r1 = r8.b
            r2 = 0
            if (r9 != 0) goto L_0x0008
            return r2
        L_0x0008:
            com.google.android.gms.auth.api.signin.GoogleSignInOptions r9 = (com.google.android.gms.auth.api.signin.GoogleSignInOptions) r9     // Catch:{ ClassCastException -> 0x007b }
            java.util.ArrayList r3 = r9.b     // Catch:{ ClassCastException -> 0x007b }
            java.lang.String r4 = r9.x     // Catch:{ ClassCastException -> 0x007b }
            android.accounts.Account r5 = r9.c     // Catch:{ ClassCastException -> 0x007b }
            java.util.ArrayList r6 = r8.z     // Catch:{ ClassCastException -> 0x007b }
            boolean r6 = r6.isEmpty()     // Catch:{ ClassCastException -> 0x007b }
            if (r6 == 0) goto L_0x007b
            java.util.ArrayList r6 = r9.z     // Catch:{ ClassCastException -> 0x007b }
            boolean r6 = r6.isEmpty()     // Catch:{ ClassCastException -> 0x007b }
            if (r6 != 0) goto L_0x0021
            goto L_0x007b
        L_0x0021:
            int r6 = r1.size()     // Catch:{ ClassCastException -> 0x007b }
            java.util.ArrayList r7 = new java.util.ArrayList     // Catch:{ ClassCastException -> 0x007b }
            r7.<init>(r3)     // Catch:{ ClassCastException -> 0x007b }
            int r7 = r7.size()     // Catch:{ ClassCastException -> 0x007b }
            if (r6 != r7) goto L_0x007b
            java.util.ArrayList r6 = new java.util.ArrayList     // Catch:{ ClassCastException -> 0x007b }
            r6.<init>(r3)     // Catch:{ ClassCastException -> 0x007b }
            boolean r1 = r1.containsAll(r6)     // Catch:{ ClassCastException -> 0x007b }
            if (r1 != 0) goto L_0x003c
            goto L_0x007b
        L_0x003c:
            android.accounts.Account r1 = r8.c     // Catch:{ ClassCastException -> 0x007b }
            if (r1 != 0) goto L_0x0043
            if (r5 != 0) goto L_0x007b
            goto L_0x0049
        L_0x0043:
            boolean r1 = r1.equals(r5)     // Catch:{ ClassCastException -> 0x007b }
            if (r1 == 0) goto L_0x007b
        L_0x0049:
            boolean r1 = android.text.TextUtils.isEmpty(r0)     // Catch:{ ClassCastException -> 0x007b }
            if (r1 == 0) goto L_0x0056
            boolean r0 = android.text.TextUtils.isEmpty(r4)     // Catch:{ ClassCastException -> 0x007b }
            if (r0 == 0) goto L_0x007b
            goto L_0x005d
        L_0x0056:
            boolean r0 = r0.equals(r4)     // Catch:{ ClassCastException -> 0x007b }
            if (r0 != 0) goto L_0x005d
            goto L_0x007b
        L_0x005d:
            boolean r0 = r8.w     // Catch:{ ClassCastException -> 0x007b }
            boolean r1 = r9.w     // Catch:{ ClassCastException -> 0x007b }
            if (r0 != r1) goto L_0x007b
            boolean r0 = r8.o     // Catch:{ ClassCastException -> 0x007b }
            boolean r1 = r9.o     // Catch:{ ClassCastException -> 0x007b }
            if (r0 != r1) goto L_0x007b
            boolean r0 = r8.v     // Catch:{ ClassCastException -> 0x007b }
            boolean r1 = r9.v     // Catch:{ ClassCastException -> 0x007b }
            if (r0 != r1) goto L_0x007b
            java.lang.String r8 = r8.X     // Catch:{ ClassCastException -> 0x007b }
            java.lang.String r9 = r9.X     // Catch:{ ClassCastException -> 0x007b }
            boolean r8 = android.text.TextUtils.equals(r8, r9)     // Catch:{ ClassCastException -> 0x007b }
            if (r8 == 0) goto L_0x007b
            r8 = 1
            return r8
        L_0x007b:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.auth.api.signin.GoogleSignInOptions.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = this.b;
        int size = arrayList2.size();
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            arrayList.add(((Scope) arrayList2.get(i2)).b);
        }
        Collections.sort(arrayList);
        Account account = this.c;
        int hashCode = ((arrayList.hashCode() + (1 * 31)) * 31) + (account == null ? 0 : account.hashCode());
        String str = this.x;
        int hashCode2 = (((hashCode * 31) + (str == null ? 0 : str.hashCode())) * 31) + (this.w ? 1 : 0);
        String str2 = this.X;
        int i3 = ((((hashCode2 * 31) + (this.o ? 1 : 0)) * 31) + (this.v ? 1 : 0)) * 31;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return i3 + i;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int B0 = tf6.B0(parcel, 20293);
        tf6.G0(parcel, 1, 4);
        parcel.writeInt(this.a);
        tf6.y0(parcel, new ArrayList(this.b), 2);
        tf6.u0(parcel, 3, this.c, i);
        tf6.G0(parcel, 4, 4);
        parcel.writeInt(this.o ? 1 : 0);
        tf6.G0(parcel, 5, 4);
        parcel.writeInt(this.v ? 1 : 0);
        tf6.G0(parcel, 6, 4);
        parcel.writeInt(this.w ? 1 : 0);
        tf6.w0(parcel, 7, this.x);
        tf6.w0(parcel, 8, this.y);
        tf6.y0(parcel, this.z, 9);
        tf6.w0(parcel, 10, this.X);
        tf6.E0(parcel, B0);
    }
}
