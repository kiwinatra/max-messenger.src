package defpackage;

import java.util.List;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

/* renamed from: be1  reason: default package */
public final class be1 extends SuspendLambda implements Function2 {
    public /* synthetic */ Object a;
    public final /* synthetic */ he1 b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public be1(he1 he1, Continuation continuation) {
        super(2, continuation);
        this.b = he1;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        be1 be1 = new be1(this.b, continuation);
        be1.a = obj;
        return be1;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((be1) create((y11) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        Object value;
        oe1 oe1;
        CharSequence charSequence;
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        y11 y11 = (y11) this.a;
        xme xme = this.b.Y;
        do {
            value = xme.getValue();
            oe1 = (oe1) value;
            charSequence = y11.b;
            if (charSequence == null) {
                charSequence = "";
            }
        } while (!xme.b(value, oe1.a(oe1, (List) null, (List) null, charSequence, 11)));
        return Unit.INSTANCE;
    }
}
