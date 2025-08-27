package defpackage;

import java.util.Iterator;
import java.util.List;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

/* renamed from: ro7  reason: default package */
public final class ro7 extends SuspendLambda implements Function2 {
    public int a;
    public final /* synthetic */ String b;
    public final /* synthetic */ String c;
    public final /* synthetic */ tgg o;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ro7(String str, String str2, tgg tgg, Continuation continuation) {
        super(2, continuation);
        this.b = str;
        this.c = str2;
        this.o = tgg;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        return new ro7(this.b, this.c, this.o, continuation);
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((ro7) create((d14) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        Object obj2;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.a;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            StringBuilder sb = new StringBuilder("Process js event: ");
            String str = this.b;
            sb.append(str);
            sb.append(", data = ");
            String str2 = this.c;
            sb.append(str2);
            z68.i("JsBridge", sb.toString(), (Throwable) null);
            Iterator it = ((List) this.o.c).iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj2 = null;
                    break;
                }
                obj2 = it.next();
                if (((xo7) obj2).c().contains(str)) {
                    break;
                }
            }
            xo7 xo7 = (xo7) obj2;
            if (xo7 != null) {
                this.a = 1;
                if (xo7.a(str, str2, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                z68.f("JsBridge", "Unhandled method " + str + " in JsBridge", (Throwable) null);
            }
        } else if (i == 1) {
            ResultKt.throwOnFailure(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        return Unit.INSTANCE;
    }
}
