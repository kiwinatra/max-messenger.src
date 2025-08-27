package defpackage;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.util.Base64;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.a;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

/* renamed from: a3h  reason: default package */
public final class a3h extends a {
    public final GoogleSignInOptions I0;

    /* JADX WARNING: type inference failed for: r8v3, types: [pt6, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r8v4, types: [pt6, java.lang.Object] */
    public a3h(Context context, Looper looper, b33 b33, GoogleSignInOptions googleSignInOptions, ft6 ft6, gt6 gt6) {
        super(context, looper, 91, b33, ft6, gt6);
        pt6 pt6;
        if (googleSignInOptions != null) {
            ? obj = new Object();
            obj.d = new HashSet();
            obj.i = new HashMap();
            obj.d = new HashSet(googleSignInOptions.b);
            obj.a = googleSignInOptions.v;
            obj.b = googleSignInOptions.w;
            obj.c = googleSignInOptions.o;
            obj.e = googleSignInOptions.x;
            obj.h = googleSignInOptions.c;
            obj.f = googleSignInOptions.y;
            obj.i = GoogleSignInOptions.c(googleSignInOptions.z);
            obj.g = googleSignInOptions.X;
            pt6 = obj;
        } else {
            ? obj2 = new Object();
            obj2.d = new HashSet();
            obj2.i = new HashMap();
            pt6 = obj2;
        }
        byte[] bArr = new byte[16];
        uyg.a.nextBytes(bArr);
        pt6.g = Base64.encodeToString(bArr, 11);
        Set<Scope> set = (Set) b33.c;
        if (!set.isEmpty()) {
            for (Scope add : set) {
                HashSet hashSet = (HashSet) pt6.d;
                hashSet.add(add);
                hashSet.addAll(Arrays.asList(new Scope[0]));
            }
        }
        this.I0 = pt6.a();
    }

    public final int f() {
        return 12451000;
    }

    public final IInterface l(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.auth.api.signin.internal.ISignInService");
        return queryLocalInterface instanceof u7h ? (u7h) queryLocalInterface : new bvg(iBinder, "com.google.android.gms.auth.api.signin.internal.ISignInService", 4);
    }

    public final String p() {
        return "com.google.android.gms.auth.api.signin.internal.ISignInService";
    }

    public final String q() {
        return "com.google.android.gms.auth.api.signin.service.START";
    }
}
