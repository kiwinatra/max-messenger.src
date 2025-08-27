package defpackage;

import kotlin.coroutines.CoroutineContext;

/* renamed from: eif  reason: default package */
public abstract class eif {
    public static final bpa a = new bpa(10, "NO_THREAD_ELEMENTS");
    public static final ui0 b = new ui0(22);
    public static final ui0 c = new ui0(23);
    public static final ui0 d = new ui0(24);

    public static final void a(CoroutineContext coroutineContext, Object obj) {
        if (obj != a) {
            if (obj instanceof pif) {
                pif pif = (pif) obj;
                dif[] difArr = pif.c;
                int length = difArr.length - 1;
                if (length >= 0) {
                    while (true) {
                        int i = length - 1;
                        ((kif) difArr[length]).c(pif.b[length]);
                        if (i >= 0) {
                            length = i;
                        } else {
                            return;
                        }
                    }
                }
            } else {
                ((kif) ((dif) coroutineContext.fold(null, c))).c(obj);
            }
        }
    }

    public static final Object b(CoroutineContext coroutineContext, Object obj) {
        if (obj == null) {
            obj = coroutineContext.fold(0, b);
        }
        return obj == 0 ? a : obj instanceof Integer ? coroutineContext.fold(new pif(((Number) obj).intValue(), coroutineContext), d) : ((kif) ((dif) obj)).k0(coroutineContext);
    }
}
