package defpackage;

import android.content.Intent;
import android.os.Binder;
import android.os.Process;

/* renamed from: mog  reason: default package */
public final class mog extends Binder {
    public final xv1 c;

    public mog(xv1 xv1) {
        this.c = xv1;
    }

    public final void a(nog nog) {
        if (Binder.getCallingUid() == Process.myUid()) {
            Intent intent = nog.a;
            f75 f75 = (f75) this.c.b;
            f75.getClass();
            qdf qdf = new qdf();
            f75.a.execute(new x55((Object) f75, (Object) intent, (Object) qdf, 4));
            qdf.a.b(new fs(2), new jrf(14, (Object) nog));
            return;
        }
        throw new SecurityException("Binding only allowed within app");
    }
}
