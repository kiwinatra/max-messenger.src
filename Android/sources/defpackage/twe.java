package defpackage;

import android.accounts.Account;
import android.content.Context;
import android.content.SharedPreferences;
import android.net.Uri;
import android.text.TextUtils;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.common.api.Scope;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.locks.ReentrantLock;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: twe  reason: default package */
public final class twe {
    public static final ReentrantLock c = new ReentrantLock();
    public static twe d;
    public final ReentrantLock a = new ReentrantLock();
    public final SharedPreferences b;

    public twe(Context context) {
        this.b = context.getSharedPreferences("com.google.android.gms.signin", 0);
    }

    public static twe a(Context context) {
        vzg.m(context);
        ReentrantLock reentrantLock = c;
        reentrantLock.lock();
        try {
            if (d == null) {
                d = new twe(context.getApplicationContext());
            }
            twe twe = d;
            reentrantLock.unlock();
            return twe;
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    public static final String g(String str, String str2) {
        return g63.i(str, ":", str2);
    }

    public final GoogleSignInAccount b() {
        String e;
        String e2 = e("defaultGoogleSignInAccount");
        if (TextUtils.isEmpty(e2) || (e = e(g("googleSignInAccount", e2))) == null) {
            return null;
        }
        try {
            return GoogleSignInAccount.b(e);
        } catch (JSONException unused) {
            return null;
        }
    }

    public final GoogleSignInOptions c() {
        String e;
        String e2 = e("defaultGoogleSignInAccount");
        if (TextUtils.isEmpty(e2) || (e = e(g("googleSignInOptions", e2))) == null) {
            return null;
        }
        try {
            return GoogleSignInOptions.b(e);
        } catch (JSONException unused) {
            return null;
        }
    }

    public final void d(GoogleSignInAccount googleSignInAccount, GoogleSignInOptions googleSignInOptions) {
        vzg.m(googleSignInAccount);
        vzg.m(googleSignInOptions);
        String str = googleSignInAccount.z;
        f("defaultGoogleSignInAccount", str);
        String g = g("googleSignInAccount", str);
        JSONObject jSONObject = new JSONObject();
        try {
            String str2 = googleSignInAccount.b;
            if (str2 != null) {
                jSONObject.put("id", (Object) str2);
            }
            String str3 = googleSignInAccount.c;
            if (str3 != null) {
                jSONObject.put("tokenId", (Object) str3);
            }
            String str4 = googleSignInAccount.o;
            if (str4 != null) {
                jSONObject.put("email", (Object) str4);
            }
            String str5 = googleSignInAccount.v;
            if (str5 != null) {
                jSONObject.put("displayName", (Object) str5);
            }
            String str6 = googleSignInAccount.Y;
            if (str6 != null) {
                jSONObject.put("givenName", (Object) str6);
            }
            String str7 = googleSignInAccount.Z;
            if (str7 != null) {
                jSONObject.put("familyName", (Object) str7);
            }
            Uri uri = googleSignInAccount.w;
            if (uri != null) {
                jSONObject.put("photoUrl", (Object) uri.toString());
            }
            String str8 = googleSignInAccount.x;
            if (str8 != null) {
                jSONObject.put("serverAuthCode", (Object) str8);
            }
            jSONObject.put("expirationTime", googleSignInAccount.y);
            jSONObject.put("obfuscatedIdentifier", (Object) str);
            JSONArray jSONArray = new JSONArray();
            List list = googleSignInAccount.X;
            Scope[] scopeArr = (Scope[]) list.toArray(new Scope[list.size()]);
            Arrays.sort(scopeArr, cx4.x);
            for (Scope scope : scopeArr) {
                jSONArray.put((Object) scope.b);
            }
            jSONObject.put("grantedScopes", (Object) jSONArray);
            jSONObject.remove("serverAuthCode");
            f(g, jSONObject.toString());
            String g2 = g("googleSignInOptions", str);
            String str9 = googleSignInOptions.y;
            String str10 = googleSignInOptions.x;
            ArrayList arrayList = googleSignInOptions.b;
            JSONObject jSONObject2 = new JSONObject();
            try {
                JSONArray jSONArray2 = new JSONArray();
                Collections.sort(arrayList, GoogleSignInOptions.y0);
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    jSONArray2.put((Object) ((Scope) it.next()).b);
                }
                jSONObject2.put("scopes", (Object) jSONArray2);
                Account account = googleSignInOptions.c;
                if (account != null) {
                    jSONObject2.put("accountName", (Object) account.name);
                }
                jSONObject2.put("idTokenRequested", googleSignInOptions.o);
                jSONObject2.put("forceCodeForRefreshToken", googleSignInOptions.w);
                jSONObject2.put("serverAuthRequested", googleSignInOptions.v);
                if (!TextUtils.isEmpty(str10)) {
                    jSONObject2.put("serverClientId", (Object) str10);
                }
                if (!TextUtils.isEmpty(str9)) {
                    jSONObject2.put("hostedDomain", (Object) str9);
                }
                f(g2, jSONObject2.toString());
            } catch (JSONException e) {
                throw new RuntimeException(e);
            }
        } catch (JSONException e2) {
            throw new RuntimeException(e2);
        }
    }

    public final String e(String str) {
        ReentrantLock reentrantLock = this.a;
        reentrantLock.lock();
        try {
            return this.b.getString(str, (String) null);
        } finally {
            reentrantLock.unlock();
        }
    }

    public final void f(String str, String str2) {
        ReentrantLock reentrantLock = this.a;
        reentrantLock.lock();
        try {
            this.b.edit().putString(str, str2).apply();
        } finally {
            reentrantLock.unlock();
        }
    }
}
