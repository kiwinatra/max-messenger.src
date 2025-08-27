package defpackage;

import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.ArraysKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: yl1  reason: default package */
public final class yl1 extends SuspendLambda implements Function3 {
    public /* synthetic */ boolean a;
    public /* synthetic */ dhd b;
    public final /* synthetic */ am1 c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public yl1(am1 am1, Continuation continuation) {
        super(3, continuation);
        this.c = am1;
    }

    public final Object invoke(Object obj, Object obj2, Object obj3) {
        boolean booleanValue = ((Boolean) obj).booleanValue();
        yl1 yl1 = new yl1(this.c, (Continuation) obj3);
        yl1.a = booleanValue;
        yl1.b = (dhd) obj2;
        return yl1.invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        boolean z = this.a;
        dhd dhd = this.b;
        String str = null;
        if (!z) {
            return null;
        }
        int ordinal = dhd.a.ordinal();
        if (ordinal != 0) {
            if (ordinal == 1 || ordinal == 2 || ordinal == 3) {
                return null;
            }
            throw new NoWhenBranchMatchedException();
        } else if (dhd.c) {
            return null;
        } else {
            am1 am1 = this.c;
            y8b c2 = ((v9b) am1.c.d).c();
            zgd zgd = dhd.b;
            if (Intrinsics.areEqual((Object) zgd != null ? zgd.c : null, (Object) c2.a.getId())) {
                return null;
            }
            int i = c2.a.l() ? sqa.z0 : sqa.A0;
            y8b y8b = (y8b) ((i9b) ((etc) am1.c.c()).a.getValue()).c.get(zgd != null ? zgd.c : null);
            int i2 = sqa.B0;
            if (y8b != null) {
                str = y8b.b.getName();
            }
            if (str == null) {
                str = "";
            }
            return new smf(new kgf(i2, ArraysKt.toList((T[]) new Object[]{str})), new igf(i));
        }
    }
}
