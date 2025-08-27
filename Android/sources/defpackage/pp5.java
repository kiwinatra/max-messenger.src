package defpackage;

import com.google.firebase.messaging.FirebaseMessaging;

/* renamed from: pp5  reason: default package */
public final /* synthetic */ class pp5 implements vma {
    public final /* synthetic */ int a;
    public final /* synthetic */ FirebaseMessaging b;

    public /* synthetic */ pp5(FirebaseMessaging firebaseMessaging, int i) {
        this.a = i;
        this.b = firebaseMessaging;
    }

    public final void a(Object obj) {
        boolean z;
        switch (this.a) {
            case 0:
                unf unf = (unf) obj;
                if (this.b.e.m() && unf.h.a() != null) {
                    synchronized (unf) {
                        z = unf.g;
                    }
                    if (!z) {
                        unf.f(0);
                        return;
                    }
                    return;
                }
                return;
            default:
                b43 b43 = (b43) obj;
                xga xga = FirebaseMessaging.k;
                FirebaseMessaging firebaseMessaging = this.b;
                firebaseMessaging.getClass();
                if (b43 != null) {
                    n79.F(b43.a);
                    firebaseMessaging.f();
                    return;
                }
                return;
        }
    }
}
