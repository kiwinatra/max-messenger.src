package defpackage;

import android.content.Context;
import android.view.View;
import kotlin.Lazy;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

/* renamed from: vcf  reason: default package */
public final class vcf extends SuspendLambda implements Function2 {
    public final /* synthetic */ wcf a;
    public final /* synthetic */ View b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public vcf(wcf wcf, View view, Continuation continuation) {
        super(2, continuation);
        this.a = wcf;
        this.b = view;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        return new vcf(this.a, this.b, continuation);
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((vcf) create((scf) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        scf scf;
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        View view = this.b;
        if (view.isInEditMode()) {
            scf = vi4.f0;
        } else {
            Context context = view.getContext();
            Lazy lazy = scf.b0;
            scf = j4b.k0(context);
        }
        this.a.L0(scf);
        return Unit.INSTANCE;
    }
}
