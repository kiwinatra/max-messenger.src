package defpackage;

import android.content.Context;
import java.util.ArrayList;
import java.util.List;
import kotlin.Lazy;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

/* renamed from: fu3  reason: default package */
public final class fu3 extends SuspendLambda implements Function2 {
    public final /* synthetic */ ju3 a;
    public final /* synthetic */ String b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public fu3(ju3 ju3, String str, Continuation continuation) {
        super(2, continuation);
        this.a = ju3;
        this.b = str;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        return new fu3(this.a, this.b, continuation);
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((fu3) create((d14) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        qs6 qs6;
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        he heVar = this.a.c;
        ArrayList arrayList = new ArrayList();
        for (bac bac : (List) ((fd8) ((Lazy) heVar.o).getValue()).e(this.b).f()) {
            cs3 cs3 = bac.c;
            if (cs3 == null) {
                qs6 = null;
            } else {
                ep1 ep1 = new ep1((yva) gt3.a.getAccessor().g(yva.class), bac, (Context) heVar.c, 4);
                fo3 fo3 = cs3.a;
                String a2 = fo3.a();
                isb a3 = (a2 == null || a2.length() == 0) ^ true ? (isb) ep1.invoke(fo3.a()) : isb.a();
                String c = hhf.c(fo3.Z);
                tld w = sjd.a.w();
                List list = bac.b;
                isb a4 = true ^ w.d(c, list).isEmpty() ? (isb) ep1.invoke(c) : isb.a();
                int i = qe8.l(cs3.o).a;
                if (!(i == 10 || i == 20)) {
                }
                String a5 = fo3.a();
                if (a5 == null) {
                    a5 = "";
                }
                qs6 = new qs6(fo3.a, a5, a3, a4, o5a.x(fo3.b()), fo3, (a00) list, heVar.b);
            }
            if (qs6 != null) {
                arrayList.add(qs6);
            }
        }
        return arrayList;
    }
}
