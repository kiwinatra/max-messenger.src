package defpackage;

import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

/* renamed from: nz  reason: default package */
public final class nz extends SuspendLambda implements Function2 {
    public Integer a;
    public int b;
    public /* synthetic */ Object c;
    public final /* synthetic */ oz o;
    public final /* synthetic */ ha9 v;
    public final /* synthetic */ int w;
    public final /* synthetic */ Long x;
    public final /* synthetic */ boolean y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public nz(oz ozVar, ha9 ha9, int i, Long l, boolean z, Continuation continuation) {
        super(2, continuation);
        this.o = ozVar;
        this.v = ha9;
        this.w = i;
        this.x = l;
        this.y = z;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        nz nzVar = new nz(this.o, this.v, this.w, this.x, this.y, continuation);
        nzVar.c = obj;
        return nzVar;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((nz) create((d14) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        String str;
        Object obj2;
        Integer num;
        Object obj3;
        mk4 mk4;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.b;
        Integer num2 = null;
        ha9 ha9 = this.v;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            d14 d14 = (d14) this.c;
            oz ozVar = this.o;
            a89 a2 = gb9.a((gb9) ozVar.e.getValue(), ha9);
            nk4 d = ev0.d(d14, (q04) null, new mz(this.o, this.v, this.x, this.y, (Continuation) null), 3);
            int i2 = this.w;
            mk4 = ev0.d(d14, (q04) null, new lz(this.o, a2, this.x, i2 == 0 ? ((yva) ozVar.i.getValue()).h() : i2, (Continuation) null), 3);
            this.c = mk4;
            this.b = 1;
            obj3 = d.a(this);
            if (obj3 == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else if (i == 1) {
            mk4 = (mk4) this.c;
            ResultKt.throwOnFailure(obj);
            obj3 = obj;
        } else if (i == 2) {
            num = this.a;
            ResultKt.throwOnFailure(obj);
            str = (String) this.c;
            obj2 = obj;
            CharSequence charSequence = (CharSequence) obj2;
            Integer boxInt = Boxing.boxInt(ha9.b());
            int intValue = boxInt.intValue();
            if (this.x == null && intValue > 1) {
                num2 = boxInt;
            }
            return new jz(charSequence, str, num, num2);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        Pair pair = (Pair) obj3;
        str = (String) pair.component1();
        Integer num3 = (Integer) pair.component2();
        this.c = str;
        this.a = num3;
        this.b = 2;
        obj2 = mk4.a(this);
        if (obj2 == coroutine_suspended) {
            return coroutine_suspended;
        }
        num = num3;
        CharSequence charSequence2 = (CharSequence) obj2;
        Integer boxInt2 = Boxing.boxInt(ha9.b());
        int intValue2 = boxInt2.intValue();
        num2 = boxInt2;
        return new jz(charSequence2, str, num, num2);
    }
}
