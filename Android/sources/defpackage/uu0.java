package defpackage;

import android.net.Uri;
import androidx.fragment.app.a;
import androidx.work.impl.WorkDatabase;
import java.util.ArrayList;
import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: uu0  reason: default package */
public final /* synthetic */ class uu0 implements Callable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object o;

    public /* synthetic */ uu0(Object obj, Object obj2, Object obj3, int i) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
        this.o = obj3;
    }

    public final Object call() {
        Object obj = this.c;
        Object obj2 = this.o;
        Object obj3 = this.b;
        switch (this.a) {
            case 0:
                if (!((AtomicBoolean) obj3).get()) {
                    vu0 vu0 = (vu0) obj;
                    qx0 qx0 = (qx0) obj2;
                    j55 c0 = vu0.g.c0((uae) qx0);
                    Class<vu0> cls = vu0.class;
                    t9a t9a = vu0.f;
                    if (c0 != null) {
                        bg5.f(cls, qx0.c(), "Found image for %s in staging area");
                        t9a.getClass();
                    } else {
                        bg5.f(cls, qx0.c(), "Did not find image for %s in staging area");
                        t9a.getClass();
                        c0 = null;
                        e69 e = vu0.e((uae) qx0);
                        if (e == null) {
                            return c0;
                        }
                        jd4 p0 = y33.p0(e);
                        try {
                            j55 j55 = new j55(p0);
                            y33.U(p0);
                            c0 = j55;
                        } catch (Exception unused) {
                        } catch (Throwable th) {
                            y33.U(p0);
                            throw th;
                        }
                    }
                    if (Thread.interrupted()) {
                        bg5.a.a(2);
                        c0.close();
                        throw new InterruptedException();
                    }
                    return c0;
                }
                throw new CancellationException();
            case 1:
                pl4 pl4 = (pl4) obj3;
                pl4.getClass();
                return pl4.a.submit(new bk4(2, (Callable) obj, (u6h) obj2));
            case 2:
                Uri uri = (Uri) obj3;
                String uri2 = uri.toString();
                int i = o5a.f;
                if (uri2.startsWith("content://")) {
                    return uri;
                }
                return ((po5) obj).f(((a) obj2).O1(), n79.V(uri));
            default:
                WorkDatabase workDatabase = ((rvb) obj3).v;
                String str = (String) obj2;
                ((ArrayList) obj).addAll(workDatabase.z().k(str));
                return workDatabase.y().m(str);
        }
    }
}
