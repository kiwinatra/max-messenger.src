package defpackage;

import android.content.ComponentName;
import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import java.lang.ref.WeakReference;
import kotlin.uuid.Uuid;

/* renamed from: rn  reason: default package */
public abstract class rn {
    public static final qn a = new qn(new ep4(4));
    public static final int b = -100;
    public static j58 c = null;
    public static j58 o = null;
    public static Boolean v = null;
    public static boolean w = false;
    public static final ws x = new ws(0);
    public static final Object y = new Object();
    public static final Object z = new Object();

    public static boolean b(Context context) {
        if (v == null) {
            try {
                int i = yp.a;
                Bundle bundle = context.getPackageManager().getServiceInfo(new ComponentName(context, yp.class), xp.a() | Uuid.SIZE_BITS).metaData;
                if (bundle != null) {
                    v = Boolean.valueOf(bundle.getBoolean("autoStoreLocales"));
                }
            } catch (PackageManager.NameNotFoundException unused) {
                v = Boolean.FALSE;
            }
        }
        return v.booleanValue();
    }

    public static void e(rn rnVar) {
        synchronized (y) {
            try {
                ws wsVar = x;
                wsVar.getClass();
                ps psVar = new ps(wsVar);
                while (psVar.hasNext()) {
                    rn rnVar2 = (rn) ((WeakReference) psVar.next()).get();
                    if (rnVar2 == rnVar || rnVar2 == null) {
                        psVar.remove();
                    }
                }
            } finally {
            }
        }
    }

    public abstract void a();

    public abstract void c();

    public abstract void d();

    public abstract boolean f(int i);

    public abstract void g(int i);

    public abstract void i(View view);

    public abstract void j(View view, ViewGroup.LayoutParams layoutParams);

    public abstract void k(CharSequence charSequence);
}
