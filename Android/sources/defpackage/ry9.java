package defpackage;

import android.os.Bundle;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

/* renamed from: ry9  reason: default package */
public final class ry9 extends SuspendLambda implements Function2 {
    public final /* synthetic */ xy9 a;
    public final /* synthetic */ String b;
    public final /* synthetic */ String c;
    public final /* synthetic */ jr8 o;
    public final /* synthetic */ String v;
    public final /* synthetic */ String w;
    public final /* synthetic */ Bundle x;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ry9(xy9 xy9, String str, String str2, jr8 jr8, String str3, String str4, Bundle bundle, Continuation continuation) {
        super(2, continuation);
        this.a = xy9;
        this.b = str;
        this.c = str2;
        this.o = jr8;
        this.v = str3;
        this.w = str4;
        this.x = bundle;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        return new ry9(this.a, this.b, this.c, this.o, this.v, this.w, this.x, continuation);
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((ry9) create((d14) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        int i = xy9.N;
        xy9 xy9 = this.a;
        xy9.getClass();
        ir8 j = xy9.j(this.b, this.c, this.o, this.v, this.w, this.x);
        qo8 qo8 = xy9.o;
        if (qo8 != null) {
            qo8.I0();
            po8 po8 = qo8.c;
            if (!po8.isConnected()) {
                i8b.V("The controller is not connected. Ignoring setMediaItem().");
            } else {
                po8.F0(j);
            }
        }
        xy9.r();
        return Unit.INSTANCE;
    }
}
