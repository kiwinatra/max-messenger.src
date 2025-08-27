package defpackage;

import android.net.Uri;
import java.io.File;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

/* renamed from: eu8  reason: default package */
public final class eu8 extends SuspendLambda implements Function2 {
    public File a;
    public String b;
    public int c;
    public final /* synthetic */ gu8 o;
    public final /* synthetic */ k48 v;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public eu8(gu8 gu8, k48 k48, Continuation continuation) {
        super(2, continuation);
        this.o = gu8;
        this.v = k48;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        return new eu8(this.o, this.v, continuation);
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((eu8) create((d14) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        File file;
        String str;
        File file2;
        String str2;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.c;
        gu8 gu8 = this.o;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            file = ((po5) ((ln5) gu8.w.getValue())).r(String.valueOf(System.currentTimeMillis()));
            Uri x = o5a.x(this.v.b.toString());
            str = file.getAbsolutePath();
            if (x != null) {
                this.a = file;
                this.b = str;
                this.c = 1;
                if (gu8.j(gu8, file, x, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                file2 = file;
                str2 = str;
            }
            xag.h(gu8.Y, new xt8(Uri.fromFile(file), str));
            return Unit.INSTANCE;
        } else if (i == 1) {
            str2 = this.b;
            file2 = this.a;
            ResultKt.throwOnFailure(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        o5a.X((bud) gu8.x.getValue(), str2, str2);
        o5a.W((bud) gu8.x.getValue(), str2);
        file = file2;
        str = str2;
        xag.h(gu8.Y, new xt8(Uri.fromFile(file), str));
        return Unit.INSTANCE;
    }
}
