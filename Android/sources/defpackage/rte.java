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

/* renamed from: rte  reason: default package */
public final class rte extends SuspendLambda implements Function2 {
    public int a;
    public /* synthetic */ Object b;
    public final /* synthetic */ ute c;
    public final /* synthetic */ pte o;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public rte(ute ute, pte pte, Continuation continuation) {
        super(2, continuation);
        this.c = ute;
        this.o = pte;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        rte rte = new rte(this.c, this.o, continuation);
        rte.b = obj;
        return rte;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((rte) create((d14) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        d14 d14;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.a;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            d14 d142 = (d14) this.b;
            pte pte = this.o;
            String str = pte.a;
            long j = pte.b;
            this.b = d142;
            this.a = 1;
            Object b2 = ((bte) this.c.o.getValue()).b(str, j, 50, this);
            if (b2 == coroutine_suspended) {
                return coroutine_suspended;
            }
            d14 = d142;
            obj = b2;
        } else if (i == 1) {
            d14 = (d14) this.b;
            ResultKt.throwOnFailure(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        wse wse = (wse) obj;
        this.c.Y.updateAndGet(new qte(wse, 0));
        String name = d14.getClass().getName();
        a67 a67 = z68.b;
        if (a67 != null && a67.c()) {
            w78 w78 = w78.o;
            int size = wse.a.size();
            long j2 = wse.b;
            a67.d(w78, name, "Stickers search next page. finish, size:" + size + "|marker:" + j2, (Throwable) null);
        }
        Iterable<boe> iterable = wse.a;
        ute ute = this.c;
        ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(iterable, 10));
        for (boe j3 : iterable) {
            arrayList.add(ute.j(ute, j3));
        }
        List plus = CollectionsKt.plus(((kld) this.c.w.getValue()).b, arrayList);
        xme xme = this.c.w;
        kld kld = new kld(jld.b, plus);
        xme.getClass();
        xme.m((Object) null, kld);
        return Unit.INSTANCE;
    }
}
