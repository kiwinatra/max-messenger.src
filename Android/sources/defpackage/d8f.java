package defpackage;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.IntCompanionObject;
import one.me.sdk.vendor.SystemServicesManager$PushTokenGeneratedListener;

/* renamed from: d8f  reason: default package */
public final class d8f extends ContinuationImpl {
    public f8f a;
    public SystemServicesManager$PushTokenGeneratedListener b;
    public /* synthetic */ Object c;
    public final /* synthetic */ f8f o;
    public int v;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public d8f(f8f f8f, Continuation continuation) {
        super(continuation);
        this.o = f8f;
    }

    public final Object invokeSuspend(Object obj) {
        this.c = obj;
        this.v |= IntCompanionObject.MIN_VALUE;
        return this.o.h((SystemServicesManager$PushTokenGeneratedListener) null, this);
    }
}
