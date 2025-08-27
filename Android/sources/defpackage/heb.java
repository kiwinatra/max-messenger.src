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

/* renamed from: heb  reason: default package */
public final class heb extends SuspendLambda implements Function2 {
    public /* synthetic */ Object a;
    public final /* synthetic */ List b;
    public final /* synthetic */ meb c;
    public final /* synthetic */ List o;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public heb(List list, meb meb, List list2, Continuation continuation) {
        super(2, continuation);
        this.b = list;
        this.c = meb;
        this.o = list2;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        heb heb = new heb(this.b, this.c, this.o, continuation);
        heb.a = obj;
        return heb;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((heb) create((d14) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        String str;
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        d14 d14 = (d14) this.a;
        ArrayList arrayList = new ArrayList();
        for (xdb xdb : this.b) {
            if (!e14.f(d14)) {
                return CollectionsKt.emptyList();
            }
            xdb b2 = meb.b(this.c, xdb, this.o);
            if (b2 == null || (str = b2.v) == null || str.length() == 0) {
                arrayList.add(new xdb(xdb.b, xdb.c, xdb.o, (String) null, xdb.w, (String) null, (String) null, (String) null, (String) null, 0));
            }
        }
        return arrayList;
    }
}
