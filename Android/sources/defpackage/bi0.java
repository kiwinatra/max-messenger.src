package defpackage;

import android.database.Cursor;
import android.os.CancellationSignal;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

/* renamed from: bi0  reason: default package */
public final class bi0 extends SuspendLambda implements Function2 {
    public final /* synthetic */ ei0 a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public bi0(ei0 ei0, Continuation continuation) {
        super(2, continuation);
        this.a = ei0;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        return new bi0(this.a, continuation);
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((bi0) create((d14) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX INFO: finally extract failed */
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        ueb c = ((c7d) ((ph4) this.a.c.getValue()).a.getValue()).c();
        c.getClass();
        boolean z = false;
        d7d a2 = d7d.a(0, "SELECT COUNT(*) FROM phones");
        i6d i6d = c.a;
        i6d.b();
        Cursor o = i6d.o(a2, (CancellationSignal) null);
        try {
            long j = o.moveToFirst() ? o.getLong(0) : 0;
            o.close();
            a2.o();
            if (j == 0) {
                z = true;
            }
            return Boxing.boxBoolean(z);
        } catch (Throwable th) {
            o.close();
            a2.o();
            throw th;
        }
    }
}
