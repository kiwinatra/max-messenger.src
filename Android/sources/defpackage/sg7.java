package defpackage;

import android.widget.EditText;
import kotlin.Lazy;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.reflect.KProperty;
import one.me.login.inputname.InputNameScreen;

/* renamed from: sg7  reason: default package */
public final class sg7 extends SuspendLambda implements Function2 {
    public /* synthetic */ Object a;
    public final /* synthetic */ InputNameScreen b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public sg7(Continuation continuation, InputNameScreen inputNameScreen) {
        super(2, continuation);
        this.b = inputNameScreen;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        sg7 sg7 = new sg7(continuation, this.b);
        sg7.a = obj;
        return sg7;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((sg7) create(obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        boolean booleanValue = ((Boolean) this.a).booleanValue();
        InputNameScreen inputNameScreen = this.b;
        if (booleanValue) {
            KProperty[] kPropertyArr = InputNameScreen.z0;
            boolean b2 = ((edb) inputNameScreen.w.getValue()).b(edb.f);
            Lazy lazy = inputNameScreen.w;
            Lazy lazy2 = inputNameScreen.x;
            if (!b2) {
                ((qjd) ((x23) lazy2.getValue())).i("app.writeConctatsRequested", true);
                ((edb) lazy.getValue()).e(new eng(inputNameScreen, 1));
            } else if (!((edb) lazy.getValue()).b(edb.g)) {
                qjd qjd = (qjd) ((x23) lazy2.getValue());
                qjd.getClass();
                if (!((a33) qjd).g.getBoolean("app.writeConctatsRequested", false)) {
                    ((qjd) ((x23) lazy2.getValue())).i("app.writeConctatsRequested", true);
                    ((edb) lazy.getValue()).e(new eng(inputNameScreen, 1));
                }
            }
        } else {
            int i = pq7.a;
            if (!pq7.b(pq7.c)) {
                KProperty[] kPropertyArr2 = InputNameScreen.z0;
                EditText editText = inputNameScreen.d0().a;
                if (editText != null) {
                    editText.requestFocus();
                    editText.post(new uo5(17, (Object) editText, (Object) editText));
                }
            }
        }
        return Unit.INSTANCE;
    }
}
