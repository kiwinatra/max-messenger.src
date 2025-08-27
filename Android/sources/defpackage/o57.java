package defpackage;

import android.os.Looper;
import android.util.Pair;
import java.util.ArrayList;
import java.util.Objects;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;

/* renamed from: o57  reason: default package */
public final class o57 extends jk0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ o57(int i, Object obj, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    public final void a() {
        boolean remove;
        ArrayList arrayList;
        ArrayList arrayList2;
        ArrayList arrayList3;
        ik0 ik0;
        j55 j55;
        switch (this.a) {
            case 0:
                if (((Future) this.b).cancel(false)) {
                    p7d p7d = (p7d) this.c;
                    ((u6a) p7d.c).getClass();
                    lk5 lk5 = (lk5) p7d.b;
                    lk5.a().k(lk5.b, "NetworkFetchProducer");
                    lk5.a.c();
                    return;
                }
                return;
            case 1:
                synchronized (((ux9) this.c)) {
                    try {
                        remove = ((ux9) this.c).b.remove((Pair) this.b);
                        arrayList = null;
                        if (!remove) {
                            ik0 = null;
                            arrayList3 = null;
                        } else if (((ux9) this.c).b.isEmpty()) {
                            ik0 = ((ux9) this.c).f;
                            arrayList3 = null;
                        } else {
                            ArrayList k = ((ux9) this.c).k();
                            arrayList3 = ((ux9) this.c).l();
                            arrayList2 = ((ux9) this.c).j();
                            ArrayList arrayList4 = k;
                            ik0 = null;
                            arrayList = arrayList4;
                        }
                        arrayList2 = arrayList3;
                    } catch (Throwable th) {
                        while (true) {
                            throw th;
                            break;
                        }
                    }
                }
                ik0.c(arrayList);
                ik0.d(arrayList3);
                ik0.b(arrayList2);
                if (ik0 != null) {
                    if (!((ux9) this.c).h.c || ik0.g()) {
                        ik0.e();
                    } else {
                        ik0.d(ik0.i(uub.b));
                    }
                }
                if (remove) {
                    ((zi0) ((Pair) this.b).first).c();
                    return;
                }
                return;
            case 2:
                t3d t3d = (t3d) this.c;
                gn7 gn7 = t3d.g;
                synchronized (gn7) {
                    j55 = gn7.e;
                    gn7.e = null;
                    gn7.f = 0;
                }
                j55.b(j55);
                t3d.f = true;
                ((zi0) this.b).c();
                return;
            case 3:
                Looper myLooper = Looper.myLooper();
                Looper mainLooper = Looper.getMainLooper();
                jtc jtc = (jtc) this.b;
                if (myLooper != mainLooper) {
                    jtc.e();
                    return;
                }
                ExecutorService executorService = ((dbf) this.c).r;
                Objects.requireNonNull(jtc);
                executorService.execute(new mgd(24, jtc));
                return;
            default:
                cne cne = (cne) this.b;
                cne.a();
                ((dm4) ((hif) this.c).c).t((r38) cne);
                return;
        }
    }

    public void b() {
        switch (this.a) {
            case 1:
                ik0.b(((ux9) this.c).j());
                return;
            case 2:
                t3d t3d = (t3d) this.c;
                if (((ik0) t3d.e).f()) {
                    t3d.g.c();
                    return;
                }
                return;
            default:
                return;
        }
    }

    public void c() {
        switch (this.a) {
            case 1:
                ik0.c(((ux9) this.c).k());
                return;
            default:
                return;
        }
    }

    public void d() {
        switch (this.a) {
            case 1:
                ik0.d(((ux9) this.c).l());
                return;
            default:
                return;
        }
    }

    public /* synthetic */ o57(Object obj, Object obj2, boolean z, int i) {
        this.a = i;
        this.c = obj;
        this.b = obj2;
    }
}
