package defpackage;

import java.util.List;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function4;

/* renamed from: sr3  reason: default package */
public final class sr3 extends SuspendLambda implements Function4 {
    public final /* synthetic */ int a = 1;
    public /* synthetic */ List b;
    public /* synthetic */ Object c;
    public /* synthetic */ Object o;

    public /* synthetic */ sr3(int i, Continuation continuation) {
        super(i, continuation);
    }

    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        switch (this.a) {
            case 0:
                mtb mtb = (mtb) obj2;
                sr3 sr3 = new sr3((vr3) this.o, (Continuation) obj4);
                sr3.c = (vk3) obj;
                sr3.b = (List) obj3;
                return sr3.invokeSuspend(Unit.INSTANCE);
            default:
                sr3 sr32 = new sr3(4, (Continuation) obj4);
                sr32.b = (List) obj;
                sr32.c = (List) obj2;
                sr32.o = (List) obj3;
                return sr32.invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX WARNING: type inference failed for: r1v1, types: [vue, java.lang.Object] */
    public final Object invokeSuspend(Object obj) {
        int i = this.a;
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        switch (i) {
            case 0:
                ResultKt.throwOnFailure(obj);
                Pair E = ((vr3) this.o).E((vk3) this.c);
                return new fwb((owb) E.component1(), (List) E.component2(), this.b);
            default:
                ResultKt.throwOnFailure(obj);
                ? obj2 = new Object();
                obj2.a = this.b;
                obj2.b = (List) this.c;
                obj2.c = (List) this.o;
                return obj2;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public sr3(vr3 vr3, Continuation continuation) {
        super(4, continuation);
        this.o = vr3;
    }
}
