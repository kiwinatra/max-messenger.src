package defpackage;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import ru.ok.messages.messages.widgets.MessageComposeEditText;
import ru.ok.messages.suggests.SuggestsViewModel;

/* renamed from: n2f  reason: default package */
public final class n2f extends SuspendLambda implements Function2 {
    public /* synthetic */ Object a;
    public final /* synthetic */ SuggestsViewModel b;
    public final /* synthetic */ CharSequence c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public n2f(SuggestsViewModel suggestsViewModel, CharSequence charSequence, Continuation continuation) {
        super(2, continuation);
        this.b = suggestsViewModel;
        this.c = charSequence;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        n2f n2f = new n2f(this.b, this.c, continuation);
        n2f.a = obj;
        return n2f;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((n2f) create((d14) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        e14.e((d14) this.a);
        SuggestsViewModel suggestsViewModel = this.b;
        p1a p1a = suggestsViewModel.D;
        p1a p1a2 = null;
        if (p1a == null) {
            p1a = null;
        }
        int X = p1a.X();
        p1a p1a3 = suggestsViewModel.D;
        if (p1a3 == null) {
            p1a3 = null;
        }
        f2a f2a = p1a3.a;
        if (f2a != null) {
            s3a s3a = (s3a) f2a;
            MessageComposeEditText messageComposeEditText = s3a.X;
            CharSequence charSequence = this.c;
            messageComposeEditText.setText(charSequence);
            if (charSequence != null) {
                try {
                    s3a.X.setSelection(charSequence.length());
                } catch (Exception unused) {
                }
            }
        }
        p1a p1a4 = suggestsViewModel.D;
        if (p1a4 != null) {
            p1a2 = p1a4;
        }
        f2a f2a2 = p1a2.a;
        if (f2a2 != null) {
            try {
                ((s3a) f2a2).X.setSelection(X);
            } catch (Exception unused2) {
            }
        }
        return Unit.INSTANCE;
    }
}
