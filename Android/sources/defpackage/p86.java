package defpackage;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

/* renamed from: p86  reason: default package */
public final class p86 extends SuspendLambda implements Function2 {
    public int a;
    public /* synthetic */ Object b;
    public final /* synthetic */ w86 c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public p86(w86 w86, Continuation continuation) {
        super(2, continuation);
        this.c = w86;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        p86 p86 = new p86(this.c, continuation);
        p86.b = obj;
        return p86;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((p86) create((List) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.a;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            List list = (List) this.b;
            uua uua = this.c.v;
            Iterable<y16> iterable = list;
            ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(iterable, 10));
            for (y16 y16 : iterable) {
                arrayList.add(new jr9(y16.a, y16.b, y16.d, y16.e));
            }
            a67 a67 = z68.b;
            if (a67 != null) {
                uua.getClass();
                if (a67.c()) {
                    a67.d(w78.o, "OneMeInitialDataStorage", wj6.h(arrayList.size(), "updateFolders by count: "), (Throwable) null);
                }
            }
            ((AtomicReference) ((kr9) uua.c.getValue()).c).set(arrayList);
            ((kr9) uua.c.getValue()).J();
            xme xme = this.c.z;
            this.a = 1;
            xme.setValue(list);
            if (Unit.INSTANCE == coroutine_suspended) {
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
