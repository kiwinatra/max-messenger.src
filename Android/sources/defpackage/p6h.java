package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.util.Base64;
import com.google.android.gms.common.internal.a;

/* renamed from: p6h  reason: default package */
public final class p6h extends a {
    public final g80 I0;

    /* JADX WARNING: type inference failed for: r8v1, types: [jk3, java.lang.Object] */
    public p6h(Context context, Looper looper, b33 b33, g80 g80, ft6 ft6, gt6 gt6) {
        super(context, looper, 68, b33, ft6, gt6);
        g80 = g80 == null ? g80.o : g80;
        ? obj = new Object();
        obj.b = Boolean.FALSE;
        obj.a = g80.a;
        obj.b = Boolean.valueOf(g80.b);
        obj.c = g80.c;
        byte[] bArr = new byte[16];
        uyg.a.nextBytes(bArr);
        obj.c = Base64.encodeToString(bArr, 11);
        this.I0 = new g80(obj);
    }

    public final int f() {
        return 12800000;
    }

    public final IInterface l(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.auth.api.credentials.internal.ICredentialsService");
        return queryLocalInterface instanceof p7h ? (p7h) queryLocalInterface : new bvg(iBinder, "com.google.android.gms.auth.api.credentials.internal.ICredentialsService", 4);
    }

    public final Bundle n() {
        g80 g80 = this.I0;
        g80.getClass();
        Bundle bundle = new Bundle();
        bundle.putString("consumer_package", g80.a);
        bundle.putBoolean("force_save_dialog", g80.b);
        bundle.putString("log_session_id", g80.c);
        return bundle;
    }

    public final String p() {
        return "com.google.android.gms.auth.api.credentials.internal.ICredentialsService";
    }

    public final String q() {
        return "com.google.android.gms.auth.api.credentials.service.START";
    }
}
