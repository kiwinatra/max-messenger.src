package defpackage;

import kotlin.Lazy;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.TypeIntrinsics;

/* renamed from: y4f  reason: default package */
public final class y4f extends SuspendLambda implements Function2 {
    public int a;
    public /* synthetic */ Object b;
    public final /* synthetic */ h5f c;
    public final /* synthetic */ bxf o;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public y4f(h5f h5f, bxf bxf, Continuation continuation) {
        super(2, continuation);
        this.c = h5f;
        this.o = bxf;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        y4f y4f = new y4f(this.c, this.o, continuation);
        y4f.b = obj;
        return y4f;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((y4f) create((ds5) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        myf myf;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.a;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            ds5 ds5 = (ds5) this.b;
            zqf zqf = (zqf) this.c.g.getValue();
            bxf bxf = this.o;
            String str = bxf.d;
            kxf kxf = bxf.a;
            xyf xyf = kxf.c;
            switch (xyf.ordinal()) {
                case 1:
                    myf = myf.c;
                    break;
                case 2:
                case 3:
                case 6:
                    myf = myf.a;
                    break;
                case 4:
                    myf = myf.o;
                    break;
                case 5:
                    myf = myf.b;
                    break;
                case 7:
                    myf = myf.v;
                    break;
                default:
                    throw new RuntimeException("unknown http type for upload type=" + xyf);
            }
            myf myf2 = myf;
            xyf xyf2 = kxf.c;
            xyf2.getClass();
            String str2 = ((xyf2 == xyf.FILE) || kxf.c.b()) ? bxf.c : null;
            Lazy h = zqf.a.h(xlf.class);
            Lazy lazy = zqf.e;
            yqf yqf = zqf.f;
            String str3 = bxf.b;
            gaf gaf = zqf.b;
            yqf yqf2 = yqf;
            Lazy lazy2 = zqf.c;
            Lazy lazy3 = lazy;
            Lazy lazy4 = zqf.d;
            do5 do5 = r6;
            do5 do52 = new do5(str, str3, gaf, lazy2, lazy4, lazy3, h, myf2, str2, yqf2);
            of3 of3 = n79.e;
            vt5 vt5 = new vt5(new sbd(new pu5(new wq4(new on2(new g12(new yn5(do5, (Continuation) null), EmptyCoroutineContext.INSTANCE, -2, cu0.a, 0), 24), (Function2) TypeIntrinsics.beforeCheckcastToFunctionOfArity(new ui0(9), 2)), new b03(3, (Continuation) null, 1), (Continuation) null)), new b03(do5, (Continuation) null));
            this.a = 1;
            if (bs0.x(vt5, ds5, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else if (i == 1) {
            ResultKt.throwOnFailure(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        return Unit.INSTANCE;
    }
}
