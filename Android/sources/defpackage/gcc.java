package defpackage;

import android.net.Uri;
import java.io.File;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

/* renamed from: gcc  reason: default package */
public final class gcc extends SuspendLambda implements Function2 {
    public int a;
    public /* synthetic */ Object b;
    public final /* synthetic */ hcc c;
    public final /* synthetic */ File o;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public gcc(hcc hcc, File file, Continuation continuation) {
        super(2, continuation);
        this.c = hcc;
        this.o = file;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        gcc gcc = new gcc(this.c, this.o, continuation);
        gcc.b = obj;
        return gcc;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((gcc) create((d14) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        Object obj2;
        Object obj3;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.a;
        hcc hcc = this.c;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            zcd zcd = hcc.c;
            this.b = (d14) this.b;
            this.a = 1;
            obj2 = zcd.a(this.o, this);
            if (obj2 == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else if (i == 1) {
            d14 d14 = (d14) this.b;
            ResultKt.throwOnFailure(obj);
            obj2 = obj;
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        Uri uri = (Uri) obj2;
        if (uri == null) {
            return Unit.INSTANCE;
        }
        try {
            Result.Companion companion = Result.Companion;
            obj3 = Result.m23constructorimpl(((wj0) hcc.x).d(uri.toString()));
        } catch (Throwable th) {
            Result.Companion companion2 = Result.Companion;
            obj3 = Result.m23constructorimpl(ResultKt.createFailure(th));
        }
        if (Result.m29isFailureimpl(obj3)) {
            obj3 = null;
        }
        i7g i7g = (i7g) obj3;
        String uri2 = i7g != null ? i7g.a : uri.toString();
        String uri3 = uri.toString();
        o9a o9a = sq9.b;
        d48 d48 = new d48(3, (long) uri.toString().hashCode(), uri3, uri2, 0, 0, "video/mp4", 0, (Uri) null);
        xag.h(hcc.Z, new tbc(d48, hcc.o.f.u(d48)));
        return Unit.INSTANCE;
    }
}
