package androidx.emoji2.text;

import android.content.Context;
import androidx.lifecycle.ProcessLifecycleInitializer;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

public class EmojiCompatInitializer implements xf7 {
    public final List a() {
        return Collections.singletonList(ProcessLifecycleInitializer.class);
    }

    public final /* bridge */ /* synthetic */ Object b(Context context) {
        c(context);
        return Boolean.TRUE;
    }

    public final void c(Context context) {
        Object obj;
        a96 a96 = new a96(new xv1(context));
        a96.g = 1;
        s15.c(a96);
        w28 J = w28.J(context);
        Class<ProcessLifecycleInitializer> cls = ProcessLifecycleInitializer.class;
        J.getClass();
        synchronized (w28.z) {
            try {
                obj = ((HashMap) J.b).get(cls);
                if (obj == null) {
                    obj = J.E(cls, new HashSet());
                }
            } catch (Throwable th) {
                while (true) {
                    throw th;
                }
            }
        }
        ju7 lifecycle = ((jv7) obj).getLifecycle();
        lifecycle.a(new u15(this, lifecycle));
    }
}
