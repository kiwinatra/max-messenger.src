package defpackage;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.IntCompanionObject;

/* renamed from: adb  reason: default package */
public final class adb extends ContinuationImpl {
    public /* synthetic */ Object a;
    public final /* synthetic */ cdb b;
    public int c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public adb(cdb cdb, Continuation continuation) {
        super(continuation);
        this.b = cdb;
    }

    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.c |= IntCompanionObject.MIN_VALUE;
        return this.b.e((ds5) null, this);
    }
}
