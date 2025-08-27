package defpackage;

import java.io.File;
import java.io.FileNotFoundException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

/* renamed from: sr9  reason: default package */
public final class sr9 extends SuspendLambda implements Function2 {
    public final /* synthetic */ ez a;
    public final /* synthetic */ f0 b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public sr9(ez ezVar, f0 f0Var, Continuation continuation) {
        super(2, continuation);
        this.a = ezVar;
        this.b = f0Var;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        return new sr9(this.a, this.b, continuation);
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((sr9) create((d14) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        try {
            return this.a.d();
        } catch (FileNotFoundException unused) {
            String e = this.b.e();
            ez ezVar = this.a;
            a67 a67 = z68.b;
            if (a67 != null && a67.c()) {
                w78 w78 = w78.o;
                File file = ezVar.c;
                a67.d(w78, e, "file " + file + " not found", (Throwable) null);
            }
            return null;
        } catch (InterruptedException e2) {
            throw e2;
        } catch (Throwable th) {
            z68.f(this.b.e(), "load failed", th);
            return null;
        }
    }
}
