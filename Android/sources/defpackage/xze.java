package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.Lazy;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

/* renamed from: xze  reason: default package */
public final class xze extends SuspendLambda implements Function2 {
    public int a;
    public final /* synthetic */ gy8 b;
    public final /* synthetic */ Set c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public xze(gy8 gy8, LinkedHashSet linkedHashSet, Continuation continuation) {
        super(2, continuation);
        this.b = gy8;
        this.c = linkedHashSet;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        return new xze(this.b, (LinkedHashSet) this.c, continuation);
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((xze) create((d14) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.a;
        gy8 gy8 = this.b;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            np2 np2 = new np2(CollectionsKt.toLongArray(this.c));
            this.a = 1;
            obj = ((jna) ((rl) gy8.a)).T(np2, this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else if (i == 1) {
            ResultKt.throwOnFailure(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        List d = ((jo3) obj).d();
        ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(d, 10));
        Iterator it = ((ArrayList) d).iterator();
        while (it.hasNext()) {
            fo3 fo3 = (fo3) it.next();
            gy8.getClass();
            String c2 = hhf.c(fo3.Z);
            ArrayList arrayList2 = new ArrayList();
            gy8.n(arrayList2, fo3.v);
            arrayList.add(((zqd) gy8.b).r(fo3.a, arrayList2, c2, fo3.a(), fo3.b(), (mtb) null, ((drd) ((Lazy) gy8.v).getValue()).a(fo3.a)));
        }
        return arrayList;
    }
}
