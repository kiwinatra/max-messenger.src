package defpackage;

import java.util.ArrayList;
import java.util.List;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: r66  reason: default package */
public final class r66 extends SuspendLambda implements Function2 {
    public g0g a;
    public int b;
    public /* synthetic */ Object c;
    public final /* synthetic */ w66 o;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public r66(w66 w66, Continuation continuation) {
        super(2, continuation);
        this.o = w66;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        r66 r66 = new r66(this.o, continuation);
        r66.c = obj;
        return r66;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((r66) create((List) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        List<zx5> list;
        g0g g0g;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.b;
        w66 w66 = this.o;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            List list2 = (List) this.c;
            g0g = new g0g((zx5) null, f0g.c, new igf(iua.m));
            u82 u82 = w66.b;
            this.c = list2;
            this.a = g0g;
            this.b = 1;
            ia2 ia2 = (ia2) u82;
            ia2.getClass();
            Object I = ev0.I(ia2.x, new l92(ia2, (Continuation) null), this);
            if (I == coroutine_suspended) {
                return coroutine_suspended;
            }
            Object obj2 = I;
            list = list2;
            obj = obj2;
        } else if (i == 1) {
            g0g = this.a;
            list = (List) this.c;
            ResultKt.throwOnFailure(obj);
        } else if (i == 2) {
            ResultKt.throwOnFailure(obj);
            return Unit.INSTANCE;
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        Iterable<zx5> iterable = (Iterable) obj;
        ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(iterable, 10));
        for (zx5 zx5 : iterable) {
            f0g f0g = f0g.o;
            CharSequence charSequence = zx5 != null ? zx5.b : null;
            if (charSequence == null) {
                charSequence = "";
            }
            arrayList.add(new g0g(zx5, f0g, new mgf(charSequence)));
        }
        ArrayList arrayList2 = new ArrayList(list.size());
        for (zx5 zx52 : list) {
            f0g f0g2 = Intrinsics.areEqual((Object) zx52.a, (Object) "all.chat.folder") ? f0g.a : f0g.b;
            wa9 wa9 = wa9.a;
            arrayList2.add(new g0g(zx52, f0g2, new mgf(((xva) w66.o.getValue()).a(zx52.b, zx52.w0, wa9.b, false, 0, true))));
        }
        arrayList2.add(g0g);
        arrayList2.addAll(arrayList);
        xme xme = w66.v;
        this.c = null;
        this.a = null;
        this.b = 2;
        xme.getClass();
        xme.m((Object) null, arrayList2);
        if (Unit.INSTANCE == coroutine_suspended) {
            return coroutine_suspended;
        }
        return Unit.INSTANCE;
    }
}
