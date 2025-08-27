package defpackage;

import kotlin.Lazy;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.text.StringsKt;

/* renamed from: ih7  reason: default package */
public final class ih7 extends SuspendLambda implements Function2 {
    public /* synthetic */ Object a;
    public final /* synthetic */ rh7 b;
    public final /* synthetic */ Lazy c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ih7(rh7 rh7, Lazy lazy, Continuation continuation) {
        super(2, continuation);
        this.b = rh7;
        this.c = lazy;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        ih7 ih7 = new ih7(this.b, this.c, continuation);
        ih7.a = obj;
        return ih7;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((ih7) create((v88) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        v88 v88 = (v88) this.a;
        rh7 rh7 = this.b;
        int i = ((ysa) rh7.w0.getValue()).b;
        String u = StringsKt__StringsJVMKt.repeat("*", 6);
        String str = (String) rh7.y0.getValue();
        StringBuilder sb = new StringBuilder();
        int length = str.length();
        for (int i2 = 0; i2 < length; i2++) {
            char charAt = (char) str.charAt(i2);
            if (Character.isDigit((char) charAt)) {
                sb.append(charAt);
            }
        }
        String str2 = "'+" + i + u + StringsKt.takeLast(sb.toString(), 4) + "'";
        boolean z = v88 instanceof q88;
        Lazy lazy = this.c;
        if (z) {
            ((e24) lazy.getValue()).a((String) null, new y88(a81.m("Phone: ", str2), ((q88) v88).b));
        } else if (v88 instanceof r88) {
            ((e24) lazy.getValue()).a((String) null, new y88(str2, 0));
        } else if (v88 instanceof s88) {
            ((e24) lazy.getValue()).a((String) null, new y88(str2, 1));
        } else if (v88 != null && !(v88 instanceof u88)) {
            throw new NoWhenBranchMatchedException();
        }
        return Unit.INSTANCE;
    }
}
