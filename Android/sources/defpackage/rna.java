package defpackage;

import kotlin.Lazy;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import one.me.android.OneMeApplication;

/* renamed from: rna  reason: default package */
public final class rna extends SuspendLambda implements Function2 {
    public int a;
    public final /* synthetic */ OneMeApplication b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public rna(OneMeApplication oneMeApplication, Continuation continuation) {
        super(2, continuation);
        this.b = oneMeApplication;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        return new rna(this.b, continuation);
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((rna) create((d14) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        Unit unit;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.a;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            Lazy lazy = rjd.a;
            g51 g51 = new g51(sjd.a.getAccessor().h(x23.class));
            this.a = 1;
            String b2 = nf0.b(g51.a(), true);
            String b3 = nf0.b(g51.a(), false);
            ((a33) g51.a()).i("app.chat.background.migrated", kf0.c.contains(b2) && kf0.b.contains(b3));
            if (((a33) g51.a()).g.getBoolean("app.chat.background.migrated", false)) {
                z68.c("SavedBackgroundThemeMigration", "Chat theme background already migrated.", new Object[0]);
                unit = Unit.INSTANCE;
            } else {
                g51.b(true);
                g51.b(false);
                ((a33) g51.a()).i("app.chat.background.migrated", true);
                unit = Unit.INSTANCE;
            }
            if (unit == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else if (i == 1) {
            ResultKt.throwOnFailure(obj);
        } else if (i == 2) {
            ResultKt.throwOnFailure(obj);
            return Unit.INSTANCE;
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        Lazy lazy2 = rjd.a;
        npg npg = new npg(19);
        this.a = 2;
        Object I = ev0.I(((osa) ((gaf) ((Lazy) npg.c).getValue())).b(), new itb(npg, this.b, (Continuation) null), this);
        if (I != IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            I = Unit.INSTANCE;
        }
        if (I == coroutine_suspended) {
            return coroutine_suspended;
        }
        return Unit.INSTANCE;
    }
}
