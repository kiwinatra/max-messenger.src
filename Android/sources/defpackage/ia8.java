package defpackage;

import java.io.File;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

/* renamed from: ia8  reason: default package */
public final class ia8 extends SuspendLambda implements Function2 {
    public /* synthetic */ Object a;
    public final /* synthetic */ CharSequence b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ia8(CharSequence charSequence, Continuation continuation) {
        super(2, continuation);
        this.b = charSequence;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        ia8 ia8 = new ia8(this.b, continuation);
        ia8.a = obj;
        return ia8;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((ia8) create((File) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        ata ata = new ata(((File) this.a).getAbsolutePath());
        return new tx7(new sbd(new d9f(ata, (Continuation) null)), this.b.toString(), 2);
    }
}
