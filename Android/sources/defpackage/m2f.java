package defpackage;

import java.util.Iterator;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import ru.ok.messages.suggests.SuggestsViewModel;

/* renamed from: m2f  reason: default package */
public final class m2f extends SuspendLambda implements Function2 {
    public zuf a;
    public int b;
    public final /* synthetic */ SuggestsViewModel c;
    public final /* synthetic */ String o;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public m2f(SuggestsViewModel suggestsViewModel, String str, Continuation continuation) {
        super(2, continuation);
        this.c = suggestsViewModel;
        this.o = str;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        return new m2f(this.c, this.o, continuation);
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((m2f) create((d14) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        zuf zuf;
        Object obj2;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.b;
        SuggestsViewModel suggestsViewModel = this.c;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            Iterator it = suggestsViewModel.v.iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj2 = null;
                    break;
                }
                obj2 = it.next();
                CharSequence charSequence = ((zuf) obj2).d;
                if (Intrinsics.areEqual((Object) charSequence != null ? charSequence.toString() : null, (Object) this.o)) {
                    break;
                }
            }
            zuf = (zuf) obj2;
            if (zuf == null) {
                return Unit.INSTANCE;
            }
            drd drd = (drd) suggestsViewModel.i.getValue();
            erd erd = erd.a;
            this.a = zuf;
            this.b = 1;
            drd.getClass();
            Object I = ev0.I(drd.b, new crd(drd, zuf.i, erd, (Continuation) null), this);
            if (I != IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                I = Unit.INSTANCE;
            }
            if (I == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else if (i == 1) {
            zuf = this.a;
            ResultKt.throwOnFailure(obj);
        } else if (i == 2) {
            ResultKt.throwOnFailure(obj);
            y1f y1f = y1f.a;
            int i2 = SuggestsViewModel.I;
            suggestsViewModel.o(y1f);
            return Unit.INSTANCE;
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        CharSequence charSequence2 = zuf.d;
        if (charSequence2 == null) {
            return Unit.INSTANCE;
        }
        if (charSequence2.length() == 0) {
            return Unit.INSTANCE;
        }
        sa9 sa9 = sa9.a;
        CharSequence b2 = suggestsViewModel.h.b(charSequence2, new ta9(zuf.i, charSequence2.length()), false, true);
        gc8 c2 = ((osa) suggestsViewModel.d).c();
        l2f l2f = new l2f(suggestsViewModel, zuf, b2, (Continuation) null);
        this.a = null;
        this.b = 2;
        if (ev0.I(c2, l2f, this) == coroutine_suspended) {
            return coroutine_suspended;
        }
        y1f y1f2 = y1f.a;
        int i22 = SuggestsViewModel.I;
        suggestsViewModel.o(y1f2);
        return Unit.INSTANCE;
    }
}
