package defpackage;

import kotlin.ResultKt;
import kotlin.Triple;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import one.me.rlottie.RLottieDrawable;
import one.me.rlottie.RLottieDrawableUtils;

/* renamed from: al  reason: default package */
public final class al extends SuspendLambda implements Function2 {
    public /* synthetic */ Object a;
    public final /* synthetic */ cl b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public al(cl clVar, Continuation continuation) {
        super(2, continuation);
        this.b = clVar;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        al alVar = new al(this.b, continuation);
        alVar.a = obj;
        return alVar;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((al) create((Triple) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        Triple triple = (Triple) this.a;
        long longValue = ((Number) triple.component1()).longValue();
        String str = (String) triple.component2();
        String str2 = (String) triple.component3();
        cl clVar = this.b;
        String str3 = clVar.y;
        a67 a67 = z68.b;
        if (a67 != null && a67.c()) {
            a67.d(w78.o, str3, wj6.n(i2a.k("handleAnimoji #", longValue, ", ", str), ", ", str2), (Throwable) null);
        }
        if (str != null && str.length() != 0) {
            String str4 = clVar.y;
            a67 a672 = z68.b;
            if (a672 != null && a672.c()) {
                a672.d(w78.o, str4, wj6.n(i2a.k("handleLottie #", longValue, ", ", str), ", ", str2), (Throwable) null);
            }
            aj ajVar = clVar.o;
            int i = clVar.a;
            ajVar.getClass();
            RLottieDrawable rLottieDrawable = (RLottieDrawable) ajVar.a.computeIfAbsent(new zi(longValue, i), new yi(0, new j9(str, i, 1)));
            rLottieDrawable.scaleByCanvas = true;
            if (rLottieDrawable.isLoadingFailed()) {
                RLottieDrawableUtils.restartDownloadFromUrl(rLottieDrawable, true);
            }
            rLottieDrawable.addDrawableLoadListener(new zk(clVar, str2));
        } else if (!(str2 == null || str2.length() == 0)) {
            clVar.c(str2);
        }
        return Unit.INSTANCE;
    }
}
