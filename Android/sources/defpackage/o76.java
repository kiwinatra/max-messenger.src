package defpackage;

import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.reflect.KProperty;
import one.me.folders.pickerfolders.FoldersPickerScreen;
import one.me.sdk.uikit.common.button.OneMeButton;
import one.me.sdk.uikit.common.emptyview.OneMeEmptyView;

/* renamed from: o76  reason: default package */
public final class o76 extends SuspendLambda implements Function2 {
    public /* synthetic */ Object a;
    public final /* synthetic */ FoldersPickerScreen b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public o76(Continuation continuation, FoldersPickerScreen foldersPickerScreen) {
        super(2, continuation);
        this.b = foldersPickerScreen;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        o76 o76 = new o76(continuation, this.b);
        o76.a = obj;
        return o76;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((o76) create(obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        List list = (List) this.a;
        KProperty[] kPropertyArr = FoldersPickerScreen.z;
        FoldersPickerScreen foldersPickerScreen = this.b;
        foldersPickerScreen.getClass();
        if (list == null || !list.isEmpty()) {
            foldersPickerScreen.o.H(list, new ne4(29, foldersPickerScreen));
        } else {
            View view = foldersPickerScreen.getView();
            ConstraintLayout constraintLayout = view instanceof ConstraintLayout ? (ConstraintLayout) view : null;
            if (constraintLayout != null) {
                KProperty kProperty = FoldersPickerScreen.z[4];
                fj3 fj3 = new fj3(0, -2);
                fj3.i = 0;
                fj3.e = 0;
                fj3.h = 0;
                fj3.l = 0;
                Unit unit = Unit.INSTANCE;
                f6e.b(constraintLayout, (OneMeEmptyView) foldersPickerScreen.y.getValue(), fj3);
            }
            KProperty[] kPropertyArr2 = FoldersPickerScreen.z;
            ((RecyclerView) foldersPickerScreen.v.getValue(foldersPickerScreen, kPropertyArr2[1])).setVisibility(8);
            ((OneMeButton) foldersPickerScreen.x.getValue(foldersPickerScreen, kPropertyArr2[3])).setVisibility(8);
        }
        return Unit.INSTANCE;
    }
}
