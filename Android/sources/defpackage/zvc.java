package defpackage;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

/* renamed from: zvc  reason: default package */
public final class zvc extends SuspendLambda implements Function2 {
    public /* synthetic */ Object a;
    public final /* synthetic */ pwc b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public zvc(pwc pwc, Continuation continuation) {
        super(2, continuation);
        this.b = pwc;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        zvc zvc = new zvc(this.b, continuation);
        zvc.a = obj;
        return zvc;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((zvc) create((gwc) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        Object value;
        xme xme;
        Object value2;
        xme xme2;
        Object value3;
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        gwc gwc = (gwc) this.a;
        pwc pwc = this.b;
        yvc yvc = pwc.c;
        boolean z = (gwc instanceof ewc) || (gwc instanceof dwc);
        xme xme3 = yvc.o;
        do {
            value = xme3.getValue();
            ((Boolean) value).getClass();
        } while (!xme3.b(value, Boolean.valueOf(z)));
        boolean q = pwc.q();
        do {
            xme = yvc.w;
            value2 = xme.getValue();
            ((Boolean) value2).getClass();
        } while (!xme.b(value2, Boolean.valueOf(q)));
        if (pwc.b == qvc.a) {
            boolean z2 = !(gwc instanceof fwc);
            do {
                xme2 = yvc.x;
                value3 = xme2.getValue();
                ((Boolean) value3).getClass();
            } while (!xme2.b(value3, Boolean.valueOf(z2)));
        }
        return Unit.INSTANCE;
    }
}
