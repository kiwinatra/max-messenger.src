package defpackage;

import android.content.SharedPreferences;
import android.os.Bundle;
import com.google.firebase.messaging.FirebaseMessaging;

/* renamed from: qp5  reason: default package */
public final /* synthetic */ class qp5 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ FirebaseMessaging b;
    public final /* synthetic */ qdf c;

    public /* synthetic */ qp5(FirebaseMessaging firebaseMessaging, qdf qdf, int i) {
        this.a = i;
        this.b = firebaseMessaging;
        this.c = qdf;
    }

    public final void run() {
        switch (this.a) {
            case 0:
                FirebaseMessaging firebaseMessaging = this.b;
                qdf qdf = this.c;
                xga xga = FirebaseMessaging.k;
                firebaseMessaging.getClass();
                try {
                    kwd kwd = firebaseMessaging.c;
                    kwd.getClass();
                    Bundle bundle = new Bundle();
                    bundle.putString("delete", "1");
                    hsg.c(kwd.d(kwd.h(bundle, jv3.f((hp5) kwd.a), "*")));
                    xga c2 = FirebaseMessaging.c(firebaseMessaging.b);
                    String d = firebaseMessaging.d();
                    String f = jv3.f(firebaseMessaging.a);
                    synchronized (c2) {
                        String e = xga.e(d, f);
                        SharedPreferences.Editor edit = ((SharedPreferences) c2.b).edit();
                        edit.remove(e);
                        edit.commit();
                    }
                    qdf.b((Object) null);
                    return;
                } catch (Exception e2) {
                    qdf.a(e2);
                    return;
                }
            default:
                qdf qdf2 = this.c;
                xga xga2 = FirebaseMessaging.k;
                FirebaseMessaging firebaseMessaging2 = this.b;
                firebaseMessaging2.getClass();
                try {
                    qdf2.b(firebaseMessaging2.a());
                    return;
                } catch (Exception e3) {
                    qdf2.a(e3);
                    return;
                }
        }
    }
}
