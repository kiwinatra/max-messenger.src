package defpackage;

import java.util.ArrayList;
import java.util.List;
import kotlin.Lazy;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.text.StringsKt;

/* renamed from: de1  reason: default package */
public final class de1 extends SuspendLambda implements Function2 {
    public final /* synthetic */ he1 a;
    public final /* synthetic */ String b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public de1(he1 he1, String str, Continuation continuation) {
        super(2, continuation);
        this.a = he1;
        this.b = str;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        return new de1(this.a, this.b, continuation);
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((de1) create((d14) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        he1 he1 = this.a;
        String str = this.b;
        he1.X = str;
        i9b i9b = (i9b) ((v9b) he1.b).Y.a.getValue();
        if (!StringsKt.isBlank(str)) {
            List createListBuilder = CollectionsKt.createListBuilder();
            Lazy lazy = he1.v;
            if (((tld) lazy.getValue()).h(i9b.a.b.getName(), str)) {
                createListBuilder.add(i9b.a);
            }
            ArrayList arrayList = new ArrayList();
            for (Object next : i9b.c.values()) {
                if (((tld) lazy.getValue()).h(((y8b) next).b.getName(), str)) {
                    arrayList.add(next);
                }
            }
            createListBuilder.addAll(arrayList);
            he1.j(he1, CollectionsKt.build(createListBuilder));
        } else {
            List createListBuilder2 = CollectionsKt.createListBuilder();
            createListBuilder2.add(i9b.a);
            createListBuilder2.addAll(i9b.c.values());
            he1.j(he1, CollectionsKt.build(createListBuilder2));
        }
        return Unit.INSTANCE;
    }
}
