package defpackage;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Set;
import kotlin.Lazy;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: u76  reason: default package */
public final class u76 extends SuspendLambda implements Function2 {
    public int a;
    public /* synthetic */ Object b;
    public final /* synthetic */ l86 c;
    public final /* synthetic */ Lazy o;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public u76(l86 l86, Lazy lazy, Continuation continuation) {
        super(2, continuation);
        this.c = l86;
        this.o = lazy;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        u76 u76 = new u76(this.c, this.o, continuation);
        u76.b = obj;
        return u76;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((u76) create((List) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        ws wsVar;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.a;
        l86 l86 = this.c;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            List list = (List) this.b;
            if (list.size() != 1 || !Intrinsics.areEqual((Object) ((zx5) CollectionsKt.first(list)).a, (Object) "all.chat.folder")) {
                ws wsVar2 = new ws((Collection) l86.v0.getValue());
                Iterable<zx5> iterable = list;
                ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(iterable, 10));
                for (zx5 zx5 : iterable) {
                    boolean areEqual = Intrinsics.areEqual((Object) zx5.a, (Object) "all.chat.folder");
                    String str = zx5.a;
                    if (!areEqual) {
                        if (zx5.Y.contains(Boxing.boxLong(l86.b))) {
                            wsVar2.add(str);
                        }
                    }
                    f0g f0g = Intrinsics.areEqual((Object) str, (Object) "all.chat.folder") ? f0g.a : f0g.b;
                    wa9 wa9 = wa9.a;
                    arrayList.add(new g0g(zx5, f0g, new mgf(((xva) this.o.getValue()).a(zx5.b, zx5.w0, wa9.b, false, 0, true))));
                }
                if (((Set) l86.Z.get()) == null) {
                    l86.Z.updateAndGet(new r76(0, list, l86));
                }
                this.b = wsVar2;
                this.a = 2;
                xme xme = l86.y;
                xme.getClass();
                xme.m((Object) null, arrayList);
                if (Unit.INSTANCE == coroutine_suspended) {
                    return coroutine_suspended;
                }
                wsVar = wsVar2;
                l86.v0.setValue(wsVar);
                return Unit.INSTANCE;
            }
            xme xme2 = l86.y;
            List emptyList = CollectionsKt.emptyList();
            this.a = 1;
            xme2.setValue(emptyList);
            if (Unit.INSTANCE == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else if (i == 1) {
            ResultKt.throwOnFailure(obj);
        } else if (i == 2) {
            wsVar = (ws) this.b;
            ResultKt.throwOnFailure(obj);
            l86.v0.setValue(wsVar);
            return Unit.INSTANCE;
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        return Unit.INSTANCE;
    }
}
