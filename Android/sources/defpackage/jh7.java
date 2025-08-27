package defpackage;

import kotlin.Lazy;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: jh7  reason: default package */
public final class jh7 extends SuspendLambda implements Function2 {
    public String a;
    public int b;
    public final /* synthetic */ String c;
    public final /* synthetic */ String o;
    public final /* synthetic */ rh7 v;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public jh7(String str, String str2, rh7 rh7, Continuation continuation) {
        super(2, continuation);
        this.c = str;
        this.o = str2;
        this.v = rh7;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        return new jh7(this.c, this.o, this.v, continuation);
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((jh7) create((d14) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        String str;
        boolean z;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.b;
        rh7 rh7 = this.v;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            String str2 = this.c + " " + this.o;
            if (Intrinsics.areEqual((Object) "", (Object) ((ysa) rh7.w0.getValue()).a)) {
                z = true;
            } else {
                Lazy lazy = rh7.w;
                z = ((aeb) lazy.getValue()).m(((aeb) lazy.getValue()).t(str2, (String) null));
            }
            if (!z) {
                n6e n6e = rh7.z;
                t88 t88 = new t88(new igf(nlc.oneme_login_input_is_not_valid_phone_error), (Throwable) null);
                this.b = 1;
                if (n6e.a(t88, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                ((zbf) rh7.x.getValue()).g();
                String replace = rh7.A0.replace((CharSequence) str2, "");
                w80 w80 = w80.START_AUTH;
                this.a = str2;
                this.b = 2;
                Object a2 = ((x80) rh7.c.getValue()).a(replace, w80, this);
                if (a2 == coroutine_suspended) {
                    return coroutine_suspended;
                }
                String str3 = str2;
                obj = a2;
                str = str3;
                v80 v80 = (v80) obj;
                xag.h(rh7.y, new zg7(v80.c, str, v80.o));
                return Unit.INSTANCE;
            }
        } else if (i == 1) {
            ResultKt.throwOnFailure(obj);
        } else if (i == 2) {
            str = this.a;
            ResultKt.throwOnFailure(obj);
            v80 v802 = (v80) obj;
            xag.h(rh7.y, new zg7(v802.c, str, v802.o));
            return Unit.INSTANCE;
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        return Unit.INSTANCE;
    }
}
