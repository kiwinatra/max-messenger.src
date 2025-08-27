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
import kotlin.jvm.internal.Intrinsics;

/* renamed from: jeb  reason: default package */
public final class jeb extends SuspendLambda implements Function2 {
    public /* synthetic */ Object a;
    public final /* synthetic */ List b;
    public final /* synthetic */ meb c;
    public final /* synthetic */ List o;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public jeb(ArrayList arrayList, meb meb, ArrayList arrayList2, Continuation continuation) {
        super(2, continuation);
        this.b = arrayList;
        this.c = meb;
        this.o = arrayList2;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        jeb jeb = new jeb((ArrayList) this.b, this.c, (ArrayList) this.o, continuation);
        jeb.a = obj;
        return jeb;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((jeb) create((d14) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        jeb jeb = this;
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        d14 d14 = (d14) jeb.a;
        ArrayList arrayList = new ArrayList();
        for (xdb xdb : jeb.b) {
            if (!e14.f(d14)) {
                return CollectionsKt.emptyList();
            }
            xdb b2 = meb.b(jeb.c, xdb, jeb.o);
            if (b2 == null || Intrinsics.areEqual((Object) b2, (Object) xdb)) {
                jeb = this;
            } else {
                int y = tr1.y(Intrinsics.areEqual((Object) xdb.v, (Object) b2.v) ? b2.Y : xdb.Y);
                String str = xdb.z;
                String str2 = xdb.X;
                long j = b2.b;
                long j2 = b2.c;
                int i = xdb.o;
                String str3 = xdb.v;
                long j3 = b2.w;
                xdb xdb2 = r7;
                xdb xdb3 = new xdb(j, j2, i, str3, j3, (String) null, xdb.y, str, str2, y);
                arrayList.add(xdb2);
                jeb = this;
                d14 = d14;
            }
        }
        return arrayList;
    }
}
