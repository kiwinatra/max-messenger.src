package defpackage;

import android.app.Service;
import android.content.Intent;
import android.os.Bundle;
import android.os.IBinder;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: sy8  reason: default package */
public final class sy8 extends Service {
    public static final /* synthetic */ int Z = 0;
    public final yx8 X;
    public final m7f Y;
    public qm8 a;
    public final er7 b = new er7(25, (Object) this);
    public final mm8 c = new mm8(this, "android.media.session.MediaController", -1, -1, (vm8) null);
    public final ArrayList o = new ArrayList();
    public final ts v = new qae(0);
    public mm8 w;
    public final hy x;
    public ox8 y;
    public final ny8 z;

    /* JADX WARNING: type inference failed for: r0v3, types: [qae, ts] */
    public sy8(yx8 yx8) {
        hy hyVar = new hy();
        hyVar.b = this;
        this.x = hyVar;
        this.z = ny8.a(yx8.f);
        this.X = yx8;
        this.Y = new m7f(yx8);
    }

    public final void a(ox8 ox8) {
        attachBaseContext(this.X.f);
        onCreate();
        if (ox8 == null) {
            throw new IllegalArgumentException("Session token may not be null");
        } else if (this.y == null) {
            this.y = ox8;
            qm8 qm8 = this.a;
            qm8.getClass();
            ((sy8) qm8.o).x.d(new uj6((Object) qm8, (Object) ox8, false, 12));
        } else {
            throw new IllegalStateException("The session token has already been set");
        }
    }

    public final fj b(Bundle bundle) {
        qm8 qm8 = this.a;
        qm8.getClass();
        ly8 Q = qm8.Q();
        if (bundle == null) {
            bundle = Bundle.EMPTY;
        }
        cx8 cx8 = new cx8(Q, 0, 0, this.z.b(Q), (bx8) null, bundle);
        AtomicReference atomicReference = new AtomicReference();
        bv1 bv1 = new bv1(2, false, false);
        v0g.W(this.X.l, new jh3(8, this, atomicReference, cx8, bv1));
        try {
            bv1.a();
            ax8 ax8 = (ax8) atomicReference.get();
            ax8.getClass();
            this.Y.c(Q, cx8, ax8.a, ax8.b);
            return kne.l;
        } catch (InterruptedException e) {
            i8b.p("Couldn't get a result from onConnect", e);
            return null;
        }
    }

    public final void dump(FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
    }

    public final IBinder onBind(Intent intent) {
        qm8 qm8 = this.a;
        qm8.getClass();
        om8 om8 = (om8) qm8.b;
        om8.getClass();
        return om8.onBind(intent);
    }

    public final void onCreate() {
        super.onCreate();
        qm8 qm8 = new qm8(this);
        this.a = qm8;
        qm8.P();
    }

    public final void onDestroy() {
        this.x.b = null;
    }
}
