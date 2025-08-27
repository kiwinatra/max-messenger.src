package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.IntCompanionObject;

/* renamed from: ve0  reason: default package */
public final class ve0 extends ContinuationImpl {
    public Iterator a;
    public /* synthetic */ Object b;
    public int c;

    public final Object invokeSuspend(Object obj) {
        this.b = obj;
        this.c |= IntCompanionObject.MIN_VALUE;
        return j4b.V((ArrayList) null, this);
    }
}
