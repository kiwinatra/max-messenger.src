package defpackage;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function4;
import ru.ok.tamtam.errors.TamErrorException;

/* renamed from: sf2  reason: default package */
public final class sf2 extends SuspendLambda implements Function4 {
    public final /* synthetic */ int a;
    public /* synthetic */ Throwable b;
    public /* synthetic */ long c;
    public final /* synthetic */ Object o;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public /* synthetic */ sf2(Object obj, Continuation continuation, int i) {
        super(4, continuation);
        this.a = i;
        this.o = obj;
    }

    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        ds5 ds5 = (ds5) obj;
        Throwable th = (Throwable) obj2;
        Number number = (Number) obj3;
        switch (this.a) {
            case 0:
                long longValue = number.longValue();
                sf2 sf2 = new sf2((vf2) this.o, (Continuation) obj4, 0);
                sf2.b = th;
                sf2.c = longValue;
                return sf2.invokeSuspend(Unit.INSTANCE);
            default:
                long longValue2 = number.longValue();
                sf2 sf22 = new sf2((n5g) this.o, (Continuation) obj4, 1);
                sf22.b = th;
                sf22.c = longValue2;
                return sf22.invokeSuspend(Unit.INSTANCE);
        }
    }

    public final Object invokeSuspend(Object obj) {
        boolean z;
        boolean z2;
        int i = this.a;
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        switch (i) {
            case 0:
                ResultKt.throwOnFailure(obj);
                Throwable th = this.b;
                long j = this.c;
                boolean z3 = th instanceof TamErrorException;
                vf2 vf2 = (vf2) this.o;
                if (!z3 || !m58.A(((TamErrorException) th).a.b) || j > 2) {
                    z68.f((String) vf2.e, "request failed with " + th + ". Couldn't recover", (Throwable) null);
                    z = false;
                } else {
                    z68.f((String) vf2.e, "request failed with " + th + ". Retrying", (Throwable) null);
                    z = true;
                }
                return Boxing.boxBoolean(z);
            default:
                ResultKt.throwOnFailure(obj);
                Throwable th2 = this.b;
                long j2 = this.c;
                boolean z4 = th2 instanceof TamErrorException;
                n5g n5g = (n5g) this.o;
                if (!z4 || !m58.A(((TamErrorException) th2).a.b) || j2 > 2) {
                    String str = n5g.g;
                    z68.f(str, "Fetch video. Request failed with " + th2 + ". Couldn't recover", (Throwable) null);
                    z2 = false;
                } else {
                    String str2 = n5g.g;
                    z68.f(str2, "Fetch video. Request failed with " + th2 + ". Retrying", (Throwable) null);
                    z2 = true;
                }
                return Boxing.boxBoolean(z2);
        }
    }
}
