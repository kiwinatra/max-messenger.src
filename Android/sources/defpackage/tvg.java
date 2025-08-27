package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import com.google.android.gms.tasks.RuntimeExecutionException;
import com.google.android.gms.tasks.Task;
import java.util.UUID;
import java.util.concurrent.CancellationException;

/* renamed from: tvg  reason: default package */
public final /* synthetic */ class tvg implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ tvg(int i, Object obj, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    public final void run() {
        switch (this.a) {
            case 0:
                g08 g08 = (g08) this.c;
                Object obj = ((o15) this.b).b;
                if (obj == null) {
                    g08.getClass();
                    return;
                }
                try {
                    g08.k(obj);
                    return;
                } catch (RuntimeException e) {
                    g08.getClass();
                    throw e;
                }
            case 1:
                if (((s7h) ((Task) this.b)).d) {
                    ((f0h) this.c).o.o();
                    return;
                }
                try {
                    ((f0h) this.c).o.n(((f0h) this.c).c.n((Task) this.b));
                    return;
                } catch (RuntimeExecutionException e2) {
                    if (e2.getCause() instanceof Exception) {
                        ((f0h) this.c).o.m((Exception) e2.getCause());
                        return;
                    } else {
                        ((f0h) this.c).o.m(e2);
                        return;
                    }
                } catch (Exception e3) {
                    ((f0h) this.c).o.m(e3);
                    return;
                }
            case 2:
                o5h o5h = (o5h) this.b;
                Context context = (Context) o5h.a;
                String string = o5h.C(context).getString("app_set_id", (String) null);
                long j = -1;
                long j2 = o5h.C((Context) o5h.a).getLong("app_set_id_last_used_time", -1);
                if (j2 != -1) {
                    j = 33696000000L + j2;
                }
                qdf qdf = (qdf) this.c;
                if (string == null || System.currentTimeMillis() > j) {
                    string = UUID.randomUUID().toString();
                    try {
                        if (!context.getSharedPreferences("app_set_id_storage", 0).edit().putString("app_set_id", string).commit()) {
                            String valueOf = String.valueOf(context.getPackageName());
                            if (valueOf.length() != 0) {
                                "Failed to store app set ID generated for App ".concat(valueOf);
                            }
                            throw new Exception("Failed to store the app set ID.");
                        }
                        o5h.E(context);
                        SharedPreferences sharedPreferences = context.getSharedPreferences("app_set_id_storage", 0);
                        if (!sharedPreferences.edit().putLong("app_set_id_creation_time", System.currentTimeMillis()).commit()) {
                            String valueOf2 = String.valueOf(context.getPackageName());
                            if (valueOf2.length() != 0) {
                                "Failed to store app set ID creation time for App ".concat(valueOf2);
                            }
                            throw new Exception("Failed to store the app set ID creation time.");
                        }
                    } catch (i5h e4) {
                        qdf.a(e4);
                        return;
                    }
                } else {
                    try {
                        o5h.E(context);
                    } catch (i5h e5) {
                        qdf.a(e5);
                        return;
                    }
                }
                qdf.b(new kq(string, 1));
                return;
            case 3:
                synchronized (((d4h) this.c).c) {
                    try {
                        ima ima = (ima) ((d4h) this.c).o;
                        if (ima != null) {
                            ima.q((Task) this.b);
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return;
            case 4:
                synchronized (((d4h) this.c).c) {
                    try {
                        vma vma = (vma) ((d4h) this.c).o;
                        if (vma != null) {
                            vma.a(((Task) this.b).f());
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
                return;
            default:
                d4h d4h = (d4h) this.c;
                try {
                    s7h e6 = ((mze) d4h.c).e(((Task) this.b).f());
                    ep4 ep4 = xdf.b;
                    e6.d(ep4, d4h);
                    e6.c(ep4, d4h);
                    e6.a(ep4, d4h);
                    return;
                } catch (RuntimeExecutionException e7) {
                    if (e7.getCause() instanceof Exception) {
                        d4h.onFailure((Exception) e7.getCause());
                        return;
                    } else {
                        d4h.onFailure(e7);
                        return;
                    }
                } catch (CancellationException unused) {
                    d4h.r();
                    return;
                } catch (Exception e8) {
                    d4h.onFailure(e8);
                    return;
                }
        }
    }

    public /* synthetic */ tvg(s6h s6h, Task task, int i) {
        this.a = i;
        this.c = s6h;
        this.b = task;
    }
}
