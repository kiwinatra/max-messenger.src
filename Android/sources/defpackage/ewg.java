package defpackage;

import android.app.PendingIntent;
import com.google.android.gms.common.api.Status;
import java.util.Map;

/* renamed from: ewg  reason: default package */
public final class ewg extends qwg {
    public final e5h b;

    public ewg(e5h e5h) {
        super(1);
        this.b = e5h;
    }

    public final void a(Status status) {
        try {
            this.b.Z(status);
        } catch (IllegalStateException unused) {
        }
    }

    public final void b(RuntimeException runtimeException) {
        try {
            this.b.Z(new Status(10, g63.i(runtimeException.getClass().getSimpleName(), ": ", runtimeException.getLocalizedMessage()), (PendingIntent) null, (bi3) null));
        } catch (IllegalStateException unused) {
        }
    }

    /* JADX WARNING: No exception handlers in catch block: Catch:{  } */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void c(defpackage.kvg r6) {
        /*
            r5 = this;
            e5h r0 = r5.b     // Catch:{ RuntimeException -> 0x002a }
            ql r6 = r6.d     // Catch:{ RuntimeException -> 0x002a }
            r0.getClass()     // Catch:{ RuntimeException -> 0x002a }
            r1 = 0
            r2 = 8
            r0.Y(r6)     // Catch:{ DeadObjectException -> 0x001c, RemoteException -> 0x000e }
            goto L_0x001b
        L_0x000e:
            r6 = move-exception
            com.google.android.gms.common.api.Status r3 = new com.google.android.gms.common.api.Status     // Catch:{ RuntimeException -> 0x002a }
            java.lang.String r6 = r6.getLocalizedMessage()     // Catch:{ RuntimeException -> 0x002a }
            r3.<init>(r2, r6, r1, r1)     // Catch:{ RuntimeException -> 0x002a }
            r0.Z(r3)     // Catch:{ RuntimeException -> 0x002a }
        L_0x001b:
            return
        L_0x001c:
            r6 = move-exception
            com.google.android.gms.common.api.Status r3 = new com.google.android.gms.common.api.Status     // Catch:{ RuntimeException -> 0x002a }
            java.lang.String r4 = r6.getLocalizedMessage()     // Catch:{ RuntimeException -> 0x002a }
            r3.<init>(r2, r4, r1, r1)     // Catch:{ RuntimeException -> 0x002a }
            r0.Z(r3)     // Catch:{ RuntimeException -> 0x002a }
            throw r6     // Catch:{ RuntimeException -> 0x002a }
        L_0x002a:
            r6 = move-exception
            r5.b(r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ewg.c(kvg):void");
    }

    public final void d(m8g m8g, boolean z) {
        Boolean valueOf = Boolean.valueOf(z);
        e5h e5h = this.b;
        ((Map) m8g.a).put(e5h, valueOf);
        e5h.T(new evg(m8g, e5h));
    }
}
