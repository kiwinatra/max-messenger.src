package defpackage;

import android.net.Uri;
import android.util.Size;
import androidx.fragment.app.a;
import androidx.fragment.app.b;
import java.io.File;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

/* renamed from: tle  reason: default package */
public final class tle extends SuspendLambda implements Function2 {
    public b a;
    public int b;
    public final /* synthetic */ a c;
    public final /* synthetic */ ule o;
    public final /* synthetic */ String v;
    public final /* synthetic */ gaf w;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public tle(a aVar, ule ule, String str, osa osa, Continuation continuation) {
        super(2, continuation);
        this.c = aVar;
        this.o = ule;
        this.v = str;
        this.w = osa;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        return new tle(this.c, this.o, this.v, (osa) this.w, continuation);
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((tle) create((d14) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        b bVar;
        File o2;
        ule ule = this.o;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.b;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            a aVar = this.c;
            b E2 = aVar.E2();
            try {
                po5 po5 = ule.a;
                try {
                    po5.getClass();
                    o2 = po5.o((String) null, (String) null);
                    m5a.o(E2, o5a.x(this.v), o2.getName());
                } catch (Exception e) {
                    e = e;
                    e = e;
                    bVar = E2;
                    z68.f(ule.d, "startCropImageAsChatBackgroundUseCase: ", e);
                    hi7.a0(qad.V8, bVar);
                    return Unit.INSTANCE;
                }
                try {
                    ule.b.getClass();
                    Size k = hn4.k(E2);
                    int min = Math.min(Math.max(k.getWidth(), k.getHeight()), 2048);
                    String absolutePath = o2.getAbsolutePath();
                    o5a.Y(absolutePath, absolutePath, min, min, 100);
                    o5a.W(ule.c, absolutePath);
                    Uri fromFile = Uri.fromFile(o2);
                    gc8 c2 = ((osa) this.w).c();
                    sle sle = new sle(aVar, fromFile, absolutePath, (Continuation) null);
                    this.a = E2;
                    this.b = 1;
                    if (ev0.I(c2, sle, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } catch (Exception e2) {
                    e = e2;
                    e = e;
                    bVar = E2;
                    z68.f(ule.d, "startCropImageAsChatBackgroundUseCase: ", e);
                    hi7.a0(qad.V8, bVar);
                    return Unit.INSTANCE;
                }
            } catch (Exception e3) {
                e = e3;
                bVar = E2;
                z68.f(ule.d, "startCropImageAsChatBackgroundUseCase: ", e);
                hi7.a0(qad.V8, bVar);
                return Unit.INSTANCE;
            }
        } else if (i == 1) {
            bVar = this.a;
            try {
                ResultKt.throwOnFailure(obj);
            } catch (Exception e4) {
                e = e4;
            }
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        return Unit.INSTANCE;
    }
}
