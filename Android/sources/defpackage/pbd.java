package defpackage;

import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.CoroutineStackFrame;
import kotlin.coroutines.jvm.internal.DebugProbesKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* renamed from: pbd  reason: default package */
public final class pbd extends ContinuationImpl implements ds5 {
    public final ds5 a;
    public final CoroutineContext b;
    public final int c;
    public CoroutineContext o;
    public Continuation v;

    public pbd(ds5 ds5, CoroutineContext coroutineContext) {
        super(q9a.a, EmptyCoroutineContext.INSTANCE);
        this.a = ds5;
        this.b = coroutineContext;
        this.c = ((Number) coroutineContext.fold(0, new ui0(18))).intValue();
    }

    public final Object a(Object obj, Continuation continuation) {
        try {
            Object e = e(continuation, obj);
            if (e == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                DebugProbesKt.probeCoroutineSuspended(continuation);
            }
            return e == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? e : Unit.INSTANCE;
        } catch (Throwable th) {
            this.o = new ot4(th, continuation.getContext());
            throw th;
        }
    }

    public final Object e(Continuation continuation, Object obj) {
        CoroutineContext context = continuation.getContext();
        kv0.q(context);
        CoroutineContext coroutineContext = this.o;
        if (coroutineContext != context) {
            if (coroutineContext instanceof ot4) {
                throw new IllegalStateException(StringsKt.trimIndent("\n            Flow exception transparency is violated:\n                Previous 'emit' call has thrown exception " + ((ot4) coroutineContext).b + ", but then emission attempt of value '" + obj + "' has been detected.\n                Emissions from 'catch' blocks are prohibited in order to avoid unspecified behaviour, 'Flow.catch' operator can be used instead.\n                For a more detailed explanation, please refer to Flow documentation.\n            ").toString());
            } else if (((Number) context.fold(0, new r6(16, this))).intValue() == this.c) {
                this.o = context;
            } else {
                throw new IllegalStateException(("Flow invariant is violated:\n\t\tFlow was collected in " + this.b + ",\n\t\tbut emission happened in " + context + ".\n\t\tPlease refer to 'flow' documentation or use 'flowOn' instead").toString());
            }
        }
        this.v = continuation;
        Object invoke = rbd.a.invoke(this.a, obj, this);
        if (!Intrinsics.areEqual(invoke, IntrinsicsKt.getCOROUTINE_SUSPENDED())) {
            this.v = null;
        }
        return invoke;
    }

    public final CoroutineStackFrame getCallerFrame() {
        Continuation continuation = this.v;
        if (continuation instanceof CoroutineStackFrame) {
            return (CoroutineStackFrame) continuation;
        }
        return null;
    }

    public final CoroutineContext getContext() {
        CoroutineContext coroutineContext = this.o;
        return coroutineContext == null ? EmptyCoroutineContext.INSTANCE : coroutineContext;
    }

    public final StackTraceElement getStackTraceElement() {
        return null;
    }

    public final Object invokeSuspend(Object obj) {
        Throwable r0 = Result.m26exceptionOrNullimpl(obj);
        if (r0 != null) {
            this.o = new ot4(r0, getContext());
        }
        Continuation continuation = this.v;
        if (continuation != null) {
            continuation.resumeWith(obj);
        }
        return IntrinsicsKt.getCOROUTINE_SUSPENDED();
    }
}
