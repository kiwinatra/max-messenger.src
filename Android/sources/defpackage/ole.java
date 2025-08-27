package defpackage;

import java.util.List;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import ru.ok.tamtam.android.prefs.PmsKey;

/* renamed from: ole  reason: default package */
public final class ole extends SuspendLambda implements Function2 {
    public final /* synthetic */ rle a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ole(rle rle, Continuation continuation) {
        super(2, continuation);
        this.a = rle;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        return new ole(this.a, continuation);
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((ole) create((d14) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        rle rle = this.a;
        xme xme = rle.X;
        List createListBuilder = CollectionsKt.createListBuilder();
        createListBuilder.add(new g24(f1b.s, cad.f2, new igf(qad.U0)));
        akd akd = (akd) rle.c;
        akd.getClass();
        if (akd.m(PmsKey.f17channelsenabled, false)) {
            createListBuilder.add(new g24(f1b.r, lya.k, new igf(qad.T1)));
        }
        xme.setValue(CollectionsKt.build(createListBuilder));
        return Unit.INSTANCE;
    }
}
