package defpackage;

import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.jvm.functions.Function2;

/* renamed from: gbd  reason: default package */
public abstract class gbd {
    public static mka a(Function2 function2) {
        EmptyCoroutineContext emptyCoroutineContext = EmptyCoroutineContext.INSTANCE;
        if (emptyCoroutineContext.get(om7.a) == null) {
            return new mka(1, new dbd((CoroutineContext) emptyCoroutineContext, function2));
        }
        throw new IllegalArgumentException(("Single context cannot contain job in it.Its lifecycle should be managed via Disposable handle. Had " + emptyCoroutineContext).toString());
    }
}
