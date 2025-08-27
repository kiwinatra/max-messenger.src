package defpackage;

import android.accounts.Account;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.common.api.Scope;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

/* renamed from: pt6  reason: default package */
public final class pt6 {
    public boolean a;
    public boolean b;
    public boolean c;
    public Object d;
    public Object e;
    public Object f;
    public Object g;
    public Object h;
    public Object i;

    public GoogleSignInOptions a() {
        Scope scope = GoogleSignInOptions.x0;
        HashSet hashSet = (HashSet) this.d;
        if (hashSet.contains(scope)) {
            Scope scope2 = GoogleSignInOptions.w0;
            if (hashSet.contains(scope2)) {
                hashSet.remove(scope2);
            }
        }
        if (this.c && (((Account) this.h) == null || !hashSet.isEmpty())) {
            ((HashSet) this.d).add(GoogleSignInOptions.v0);
        }
        return new GoogleSignInOptions(3, new ArrayList(hashSet), (Account) this.h, this.c, this.a, this.b, (String) this.e, (String) this.f, (HashMap) this.i, (String) this.g);
    }
}
