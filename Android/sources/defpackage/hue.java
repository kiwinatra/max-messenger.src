package defpackage;

import java.util.List;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.reflect.KProperty;

/* renamed from: hue  reason: default package */
public final class hue extends SuspendLambda implements Function2 {
    public xse a;
    public int b;
    public /* synthetic */ Object c;
    public final /* synthetic */ String o;
    public final /* synthetic */ iue v;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public hue(String str, iue iue, Continuation continuation) {
        super(2, continuation);
        this.o = str;
        this.v = iue;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        hue hue = new hue(this.o, this.v, continuation);
        hue.c = obj;
        return hue;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((hue) create((d14) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        d14 d14;
        xse xse;
        a67 a67;
        d14 d142;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.b;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            d14 d143 = (d14) this.c;
            String str = this.o;
            if (str == null || str.length() == 0) {
                iue iue = this.v;
                KProperty[] kPropertyArr = iue.j;
                iue.d.setValue(iue.k);
                iue.g.set(new eue((String) null, 3));
                return Unit.INSTANCE;
            }
            this.v.g.updateAndGet(new ste(this.o, 1));
            String str2 = this.o;
            this.c = d143;
            this.b = 1;
            Object d = bte.d((bte) this.v.b.getValue(), str2, 0, this, 6);
            if (d == coroutine_suspended) {
                return coroutine_suspended;
            }
            Object obj2 = d;
            d142 = d143;
            obj = obj2;
        } else if (i == 1) {
            d142 = (d14) this.c;
            ResultKt.throwOnFailure(obj);
        } else if (i == 2) {
            xse = this.a;
            d14 = (d14) this.c;
            ResultKt.throwOnFailure(obj);
            List list = (List) obj;
            this.v.g.updateAndGet(new aue(xse, 2));
            String name = d14.getClass().getName();
            a67 = z68.b;
            if (a67 != null && a67.c()) {
                w78 w78 = w78.o;
                int size = xse.a.size();
                long j = xse.b;
                a67.d(w78, name, "Stickers sets search. finish, size:" + size + "|marker:" + j, (Throwable) null);
            }
            xme xme = this.v.d;
            fue fue = new fue(2, false, list);
            xme.getClass();
            xme.m((Object) null, fue);
            return Unit.INSTANCE;
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        xse xse2 = (xse) obj;
        wbe c2 = ((vqe) this.v.a.getValue()).c(xse2.a);
        this.c = d142;
        this.a = xse2;
        this.b = 2;
        Object f = bs0.f(c2, this);
        if (f == coroutine_suspended) {
            return coroutine_suspended;
        }
        d14 = d142;
        xse = xse2;
        obj = f;
        List list2 = (List) obj;
        this.v.g.updateAndGet(new aue(xse, 2));
        String name2 = d14.getClass().getName();
        a67 = z68.b;
        w78 w782 = w78.o;
        int size2 = xse.a.size();
        long j2 = xse.b;
        a67.d(w782, name2, "Stickers sets search. finish, size:" + size2 + "|marker:" + j2, (Throwable) null);
        xme xme2 = this.v.d;
        fue fue2 = new fue(2, false, list2);
        xme2.getClass();
        xme2.m((Object) null, fue2);
        return Unit.INSTANCE;
    }
}
