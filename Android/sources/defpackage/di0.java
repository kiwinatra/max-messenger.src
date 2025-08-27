package defpackage;

import android.os.Build;
import java.util.List;
import kotlin.Lazy;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

/* renamed from: di0  reason: default package */
public final class di0 extends SuspendLambda implements Function2 {
    public boolean a;
    public boolean b;
    public int c;
    public /* synthetic */ Object o;
    public final /* synthetic */ ei0 v;
    public final /* synthetic */ qh0 w;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public di0(ei0 ei0, qh0 qh0, Continuation continuation) {
        super(2, continuation);
        this.v = ei0;
        this.w = qh0;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        di0 di0 = new di0(this.v, this.w, continuation);
        di0.o = obj;
        return di0;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((di0) create((d14) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        boolean z;
        boolean z2;
        boolean z3;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.c;
        ei0 ei0 = this.v;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            d14 d14 = (d14) this.o;
            boolean z4 = !((edb) ei0.a.getValue()).b(edb.f);
            edb edb = (edb) ei0.a.getValue();
            if (Build.VERSION.SDK_INT >= 33) {
                z3 = edb.b(edb.k);
            } else {
                edb.getClass();
                z3 = true;
            }
            boolean z5 = !z3;
            Lazy lazy = ei0.d;
            this.a = z4;
            this.b = z5;
            this.c = 1;
            obj = new te0(new mk4[]{ev0.d(d14, ((osa) ((gaf) lazy.getValue())).b(), new ai0(ei0, (Continuation) null), 2), ev0.d(d14, ((osa) ((gaf) lazy.getValue())).b(), new bi0(ei0, (Continuation) null), 2), ev0.d(d14, ((osa) ((gaf) lazy.getValue())).a(), new ci0(this.w, (Continuation) null), 2)}).a(this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
            z = z4;
            z2 = z5;
        } else if (i == 1) {
            z2 = this.b;
            z = this.a;
            ResultKt.throwOnFailure(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        List list = (List) obj;
        boolean booleanValue = ((Boolean) list.get(0)).booleanValue();
        boolean booleanValue2 = ((Boolean) list.get(1)).booleanValue();
        boolean booleanValue3 = ((Boolean) list.get(2)).booleanValue();
        ei0.e = z;
        ei0.f = z2;
        return Unit.INSTANCE;
    }
}
