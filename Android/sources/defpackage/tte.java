package defpackage;

import java.util.ArrayList;
import java.util.List;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

/* renamed from: tte  reason: default package */
public final class tte extends SuspendLambda implements Function2 {
    public int a;
    public /* synthetic */ Object b;
    public final /* synthetic */ String c;
    public final /* synthetic */ ute o;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public tte(String str, ute ute, Continuation continuation) {
        super(2, continuation);
        this.c = str;
        this.o = ute;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        tte tte = new tte(this.c, this.o, continuation);
        tte.b = obj;
        return tte;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((tte) create((d14) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        d14 d14;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.a;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            d14 d142 = (d14) this.b;
            String str = this.c;
            if (str == null || str.length() == 0) {
                this.o.Y.updateAndGet(new md2(8));
                xme xme = this.o.w;
                kld kld = new kld(jld.b, (List) this.o.X.get());
                xme.getClass();
                xme.m((Object) null, kld);
                return Unit.INSTANCE;
            }
            this.o.Y.updateAndGet(new ste(this.c, 0));
            String str2 = this.c;
            this.b = d142;
            this.a = 1;
            Object b2 = ((bte) this.o.o.getValue()).b(str2, 0, 50, this);
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
        this.o.Y.updateAndGet(new qte(wse, 1));
        String name = d14.getClass().getName();
        a67 a67 = z68.b;
        if (a67 != null && a67.c()) {
            w78 w78 = w78.o;
            int size = wse.a.size();
            long j = wse.b;
            a67.d(w78, name, "Stickers search. finish, size:" + size + "|marker:" + j, (Throwable) null);
        }
        Iterable<boe> iterable = wse.a;
        ute ute = this.o;
        ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(iterable, 10));
        for (boe j2 : iterable) {
            arrayList.add(ute.j(ute, j2));
        }
        jld jld = arrayList.isEmpty() ? jld.c : jld.b;
        xme xme2 = this.o.w;
        kld kld2 = new kld(jld, arrayList);
        xme2.getClass();
        xme2.m((Object) null, kld2);
        return Unit.INSTANCE;
    }
}
