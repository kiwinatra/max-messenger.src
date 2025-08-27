package defpackage;

import java.io.File;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.IntCompanionObject;

/* renamed from: ls4  reason: default package */
public final class ls4 extends ContinuationImpl {
    public ns4 a;
    public File b;
    public /* synthetic */ Object c;
    public final /* synthetic */ ns4 o;
    public int v;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ls4(ns4 ns4, Continuation continuation) {
        super(continuation);
        this.o = ns4;
    }

    public final Object invokeSuspend(Object obj) {
        this.c = obj;
        this.v |= IntCompanionObject.MIN_VALUE;
        return this.o.f((File) null, this);
    }
}
