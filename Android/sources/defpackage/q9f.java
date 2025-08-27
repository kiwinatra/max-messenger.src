package defpackage;

import android.app.Dialog;
import android.content.res.ColorStateList;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.Window;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.IntCompanionObject;
import ru.ok.TamBottomSheetDialogFragment;

/* renamed from: q9f  reason: default package */
public final class q9f extends SuspendLambda implements Function2 {
    public /* synthetic */ Object a;
    public final /* synthetic */ TamBottomSheetDialogFragment b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public q9f(TamBottomSheetDialogFragment tamBottomSheetDialogFragment, Continuation continuation) {
        super(2, continuation);
        this.b = tamBottomSheetDialogFragment;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        q9f q9f = new q9f(this.b, continuation);
        q9f.a = obj;
        return q9f;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((q9f) create((scf) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        Window window;
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        scf scf = (scf) this.a;
        TamBottomSheetDialogFragment tamBottomSheetDialogFragment = this.b;
        Dialog dialog = tamBottomSheetDialogFragment.w1;
        if (!(dialog == null || (window = dialog.getWindow()) == null)) {
            window.addFlags(IntCompanionObject.MIN_VALUE);
            int systemUiVisibility = window.getDecorView().getSystemUiVisibility();
            window.getDecorView().setSystemUiVisibility(scf.c ? systemUiVisibility & -17 : systemUiVisibility | 16);
            window.setNavigationBarColor(scf.I);
        }
        View view = tamBottomSheetDialogFragment.S0;
        ViewGroup viewGroup = null;
        ViewParent parent = view != null ? view.getParent() : null;
        if (parent instanceof ViewGroup) {
            viewGroup = (ViewGroup) parent;
        }
        if (viewGroup != null) {
            viewGroup.setBackgroundTintList(ColorStateList.valueOf(scf.n));
        }
        tamBottomSheetDialogFragment.L0(scf);
        return Unit.INSTANCE;
    }
}
