package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import com.google.firebase.messaging.FirebaseMessaging;
import java.io.IOException;

/* renamed from: op5  reason: default package */
public final /* synthetic */ class op5 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ FirebaseMessaging b;

    public /* synthetic */ op5(FirebaseMessaging firebaseMessaging, int i) {
        this.a = i;
        this.b = firebaseMessaging;
    }

    public final void run() {
        s7h s7h;
        int i;
        switch (this.a) {
            case 0:
                FirebaseMessaging firebaseMessaging = this.b;
                if (firebaseMessaging.e.m() && firebaseMessaging.i(firebaseMessaging.e())) {
                    synchronized (firebaseMessaging) {
                        if (!firebaseMessaging.i) {
                            firebaseMessaging.h(0);
                        }
                    }
                    return;
                }
                return;
            default:
                FirebaseMessaging firebaseMessaging2 = this.b;
                Context context = firebaseMessaging2.b;
                ld8.R(context);
                boolean g = firebaseMessaging2.g();
                SharedPreferences l = te8.l(context);
                if (!l.contains("proxy_retention") || l.getBoolean("proxy_retention", false) != g) {
                    m9d m9d = (m9d) firebaseMessaging2.c.c;
                    if (m9d.c.g() >= 241100000) {
                        Bundle bundle = new Bundle();
                        bundle.putBoolean("proxy_retention", g);
                        m7h g2 = m7h.g(m9d.b);
                        synchronized (g2) {
                            i = g2.c;
                            g2.c = i + 1;
                        }
                        s7h = g2.h(new w6h(i, 4, bundle, 0));
                    } else {
                        s7h = hsg.n(new IOException("SERVICE_NOT_AVAILABLE"));
                    }
                    s7h.d(new fs(2), new t9c(0, context, g));
                }
                if (firebaseMessaging2.g()) {
                    firebaseMessaging2.f();
                    return;
                }
                return;
        }
    }
}
