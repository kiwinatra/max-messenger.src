package defpackage;

import java.util.ArrayList;
import java.util.List;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import one.me.devmenu.DevMenuScreen;

/* renamed from: an4  reason: default package */
public final class an4 extends SuspendLambda implements Function2 {
    public /* synthetic */ Object a;
    public final /* synthetic */ DevMenuScreen b;
    public final /* synthetic */ List c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public an4(DevMenuScreen devMenuScreen, ArrayList arrayList, Continuation continuation) {
        super(2, continuation);
        this.b = devMenuScreen;
        this.c = arrayList;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        an4 an4 = new an4(this.b, (ArrayList) this.c, continuation);
        an4.a = obj;
        return an4;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((an4) create((List) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        k1e k1e = this.b.v;
        List createListBuilder = CollectionsKt.createListBuilder();
        createListBuilder.addAll(this.c);
        createListBuilder.addAll((List) this.a);
        k1e.G(CollectionsKt.build(createListBuilder));
        return Unit.INSTANCE;
    }
}
