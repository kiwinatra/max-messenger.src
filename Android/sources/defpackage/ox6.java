package defpackage;

import java.io.File;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

/* renamed from: ox6  reason: default package */
public final class ox6 extends SuspendLambda implements Function2 {
    public final /* synthetic */ qx6 a;
    public final /* synthetic */ File b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ox6(qx6 qx6, File file, Continuation continuation) {
        super(2, continuation);
        this.a = qx6;
        this.b = file;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        return new ox6(this.a, this.b, continuation);
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((ox6) create((d14) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        e0b e0b = (e0b) this.a.o.getValue();
        e0b.i("Дамп памяти закончился");
        String absolutePath = this.b.getAbsolutePath();
        e0b.b("Если что файл можно будет найти по этому пути: " + absolutePath);
        return e0b.j();
    }
}
