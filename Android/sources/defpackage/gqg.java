package defpackage;

import android.content.Context;
import androidx.work.WorkerParameters;

/* renamed from: gqg  reason: default package */
public abstract class gqg {
    public static final String a = h88.V("WorkerFactory");

    public abstract e08 a(Context context, String str, WorkerParameters workerParameters);

    public final e08 b(Context context, String str, WorkerParameters workerParameters) {
        Class<? extends U> cls;
        String str2 = a;
        e08 a2 = a(context, str, workerParameters);
        if (a2 == null) {
            try {
                cls = Class.forName(str).asSubclass(e08.class);
            } catch (Throwable th) {
                h88 x = h88.x();
                x.u(str2, "Invalid class: " + str, th);
                cls = null;
            }
            if (cls != null) {
                try {
                    a2 = (e08) cls.getDeclaredConstructor(new Class[]{Context.class, WorkerParameters.class}).newInstance(new Object[]{context, workerParameters});
                } catch (Throwable th2) {
                    h88 x2 = h88.x();
                    x2.u(str2, "Could not instantiate " + str, th2);
                }
            }
        }
        if (a2 == null || !a2.isUsed()) {
            return a2;
        }
        throw new IllegalStateException(rae.p("WorkerFactory (", getClass().getName(), ") returned an instance of a ListenableWorker (", str, ") which has already been invoked. createWorker() must always return a new instance of a ListenableWorker."));
    }
}
