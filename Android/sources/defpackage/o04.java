package defpackage;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.ContinuationInterceptor;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.jvm.internal.CoroutineStackFrame;
import kotlin.jvm.internal.Ref;

/* renamed from: o04  reason: default package */
public abstract class o04 {
    public static final CoroutineContext a(CoroutineContext coroutineContext, CoroutineContext coroutineContext2, boolean z) {
        Boolean bool = Boolean.FALSE;
        boolean booleanValue = ((Boolean) coroutineContext.fold(bool, new ui0(6))).booleanValue();
        boolean booleanValue2 = ((Boolean) coroutineContext2.fold(bool, new ui0(6))).booleanValue();
        if (!booleanValue && !booleanValue2) {
            return coroutineContext.plus(coroutineContext2);
        }
        Ref.ObjectRef objectRef = new Ref.ObjectRef();
        objectRef.element = coroutineContext2;
        EmptyCoroutineContext emptyCoroutineContext = EmptyCoroutineContext.INSTANCE;
        CoroutineContext coroutineContext3 = (CoroutineContext) coroutineContext.fold(emptyCoroutineContext, new ui0(7));
        if (booleanValue2) {
            objectRef.element = ((CoroutineContext) objectRef.element).fold(emptyCoroutineContext, new ui0(8));
        }
        return coroutineContext3.plus((CoroutineContext) objectRef.element);
    }

    public static final CoroutineContext b(d14 d14, CoroutineContext coroutineContext) {
        CoroutineContext a = a(d14.U(), coroutineContext, true);
        bi4 bi4 = dq4.a;
        return (a == bi4 || a.get(ContinuationInterceptor.Key) != null) ? a : a.plus(bi4);
    }

    public static final ivf c(Continuation continuation, CoroutineContext coroutineContext, Object obj) {
        ivf ivf = null;
        if (!(continuation instanceof CoroutineStackFrame)) {
            return null;
        }
        if (coroutineContext.get(jvf.a) != null) {
            CoroutineStackFrame coroutineStackFrame = (CoroutineStackFrame) continuation;
            while (true) {
                if (!(coroutineStackFrame instanceof aq4) && (coroutineStackFrame = coroutineStackFrame.getCallerFrame()) != null) {
                    if (coroutineStackFrame instanceof ivf) {
                        ivf = (ivf) coroutineStackFrame;
                        break;
                    }
                } else {
                    break;
                }
            }
            if (ivf != null) {
                ivf.n0(coroutineContext, obj);
            }
        }
        return ivf;
    }
}
