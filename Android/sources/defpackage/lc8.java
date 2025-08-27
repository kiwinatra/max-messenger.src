package defpackage;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.ServiceConfigurationError;
import kotlin.sequences.SequencesKt;
import kotlinx.coroutines.android.AndroidDispatcherFactory;
import kotlinx.coroutines.test.internal.TestMainDispatcherFactory;

/* renamed from: lc8  reason: default package */
public abstract class lc8 {
    public static final gc8 a;

    static {
        String str;
        int i = z7f.a;
        Object obj = null;
        try {
            str = System.getProperty("kotlinx.coroutines.fast.service.loader");
        } catch (SecurityException unused) {
            str = null;
        }
        if (str != null) {
            Boolean.parseBoolean(str);
        }
        try {
            List list = SequencesKt.toList(SequencesKt.asSequence(Arrays.asList(new kc8[]{new AndroidDispatcherFactory(), new TestMainDispatcherFactory()}).iterator()));
            Iterator it = list.iterator();
            if (it.hasNext()) {
                obj = it.next();
                if (it.hasNext()) {
                    int c = ((kc8) obj).c();
                    do {
                        Object next = it.next();
                        int c2 = ((kc8) next).c();
                        if (c < c2) {
                            obj = next;
                            c = c2;
                        }
                    } while (it.hasNext());
                }
            }
            kc8 kc8 = (kc8) obj;
            if (kc8 != null) {
                try {
                    gc8 b = kc8.b(list);
                    if (b != null) {
                        a = b;
                        return;
                    }
                } catch (Throwable th) {
                    kc8.a();
                    throw th;
                }
            }
            throw new IllegalStateException("Module with the Main dispatcher is missing. Add dependency providing the Main dispatcher, e.g. 'kotlinx-coroutines-android' and ensure it has the same version as 'kotlinx-coroutines-core'");
        } catch (Throwable th2) {
            throw new ServiceConfigurationError(th2.getMessage(), th2);
        }
    }
}
