package defpackage;

import android.widget.EditText;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.reflect.KProperty;
import one.me.login.inputname.InputNameScreen;
import one.me.sdk.arch.Widget;

/* renamed from: vg7  reason: default package */
public final class vg7 extends SuspendLambda implements Function2 {
    public /* synthetic */ Object a;
    public final /* synthetic */ InputNameScreen b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public vg7(Continuation continuation, InputNameScreen inputNameScreen) {
        super(2, continuation);
        this.b = inputNameScreen;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        vg7 vg7 = new vg7(continuation, this.b);
        vg7.a = obj;
        return vg7;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((vg7) create(obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        EditText editText;
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        n85 n85 = (n85) this.a;
        KProperty[] kPropertyArr = InputNameScreen.z0;
        InputNameScreen inputNameScreen = this.b;
        inputNameScreen.c0().setActiveButtonLoaderState(false);
        if (n85 instanceof ng7) {
            ng7 ng7 = (ng7) n85;
            String valueOf = String.valueOf(((ngf) ng7.a).a(inputNameScreen.getContext()));
            f2b f2b = f2b.a;
            int ordinal = ng7.c.ordinal();
            if (ordinal == 0) {
                inputNameScreen.d0().c(valueOf, f2b);
            } else if (ordinal == 1) {
                inputNameScreen.e0().c(valueOf, f2b);
            } else {
                throw new NoWhenBranchMatchedException();
            }
        } else if (n85 instanceof gy6) {
            int ordinal2 = ((gy6) n85).a.ordinal();
            if (ordinal2 == 0) {
                inputNameScreen.d0().a();
            } else if (ordinal2 == 1) {
                inputNameScreen.e0().a();
            } else {
                throw new NoWhenBranchMatchedException();
            }
        } else if (n85 instanceof g0d) {
            v88 v88 = (v88) ((g0d) n85).a;
            if (v88 instanceof u88) {
                u88 u88 = (u88) v88;
                ((r80) inputNameScreen.z.getValue()).a(new p80(u88.e));
                inputNameScreen.a.getClass();
                CharSequence a2 = u88.c.a(inputNameScreen.getContext());
                if (a2 != null) {
                    ngf ngf = u88.d;
                    CharSequence a3 = ngf != null ? ngf.a(inputNameScreen.getContext()) : null;
                    e0b e0b = new e0b((Widget) inputNameScreen);
                    e0b.i(a2);
                    e0b.b(a3);
                    e0b.e(1);
                    e0b.j();
                }
            } else if (v88 instanceof t88) {
                inputNameScreen.d0().c(String.valueOf(((t88) v88).c.a(inputNameScreen.getContext())), f2b.a);
            } else {
                throw new NoWhenBranchMatchedException();
            }
        } else if (n85 instanceof l8e) {
            inputNameScreen.e0().setHint(q8.p(nlc.oneme_login_input_name_hint_surname_short, inputNameScreen.getContext()));
            inputNameScreen.e0().c(q8.p(nlc.oneme_login_input_name_surname_placeholder, inputNameScreen.getContext()), f2b.b);
        } else if (n85 instanceof hy6) {
            inputNameScreen.e0().setHint(q8.p(nlc.oneme_login_input_name_hint_surname, inputNameScreen.getContext()));
            inputNameScreen.e0().a();
        } else if ((n85 instanceof k8e) && (editText = inputNameScreen.d0().a) != null) {
            editText.requestFocus();
            editText.post(new uo5(17, (Object) editText, (Object) editText));
        }
        return Unit.INSTANCE;
    }
}
