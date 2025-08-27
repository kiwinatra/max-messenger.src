package defpackage;

import android.os.Bundle;
import java.io.File;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

/* renamed from: qy9  reason: default package */
public final class qy9 extends SuspendLambda implements Function2 {
    public final /* synthetic */ xy9 a;
    public final /* synthetic */ a32 b;
    public final /* synthetic */ l20 c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public qy9(xy9 xy9, a32 a32, l20 l20, Continuation continuation) {
        super(2, continuation);
        this.a = xy9;
        this.b = a32;
        this.c = l20;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        return new qy9(this.a, this.b, this.c, continuation);
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((qy9) create((d14) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        String str;
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        xy9 xy9 = this.a;
        xq6 xq6 = xy9.i;
        jr8 jr8 = jr8.o;
        a32 a32 = this.b;
        Pair a2 = xq6.a(a32, jr8);
        Bundle f = o54.f(TuplesKt.to("MediaMetadata.Extra.CHAT_ID", Boxing.boxLong(a32.a)));
        po5 po5 = xy9.d;
        po5.getClass();
        l20 l20 = this.c;
        if (!cvg.A(l20.r)) {
            String str2 = l20.r;
            if (new File(str2).exists()) {
                str = str2;
                xy9.t(str, String.valueOf(a32.a), jr8, (String) a2.getFirst(), (String) a2.getSecond(), f);
                return Unit.INSTANCE;
            }
        }
        i10 i10 = l20.e;
        long j = i10.a;
        str = j == 0 ? i10.b : po5.d(j).getAbsolutePath();
        xy9.t(str, String.valueOf(a32.a), jr8, (String) a2.getFirst(), (String) a2.getSecond(), f);
        return Unit.INSTANCE;
    }
}
