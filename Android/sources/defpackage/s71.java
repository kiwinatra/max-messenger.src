package defpackage;

import java.util.ArrayList;
import java.util.List;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.enums.EnumEntries;
import kotlin.jvm.functions.Function2;

/* renamed from: s71  reason: default package */
public final class s71 extends SuspendLambda implements Function2 {
    public /* synthetic */ boolean a;
    public final /* synthetic */ v71 b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public s71(v71 v71, Continuation continuation) {
        super(2, continuation);
        this.b = v71;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        s71 s71 = new s71(this.b, continuation);
        s71.a = ((Boolean) obj).booleanValue();
        return s71;
    }

    public final Object invoke(Object obj, Object obj2) {
        Boolean bool = (Boolean) obj;
        bool.booleanValue();
        return ((s71) create(bool, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        List list;
        Object value;
        boolean booleanValue;
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        if (this.a) {
            list = CollectionsKt.emptyList();
        } else {
            EnumEntries<x71> enumEntries = x71.w;
            ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(enumEntries, 10));
            for (x71 x71 : enumEntries) {
                arrayList.add(new y71(x71.ordinal(), x71.a, x71));
            }
            list = arrayList;
        }
        v71 v71 = this.b;
        xme xme = v71.y;
        do {
            value = xme.getValue();
            booleanValue = ((Boolean) v71.v.getValue()).booleanValue();
            ((aq1) value).getClass();
        } while (!xme.b(value, new aq1(list, booleanValue)));
        return Unit.INSTANCE;
    }
}
