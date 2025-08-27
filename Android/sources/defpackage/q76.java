package defpackage;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.reflect.KProperty;
import one.me.folders.pickerfolders.FoldersPickerScreen;
import one.me.sdk.uikit.common.button.OneMeButton;

/* renamed from: q76  reason: default package */
public final class q76 extends SuspendLambda implements Function2 {
    public /* synthetic */ Object a;
    public final /* synthetic */ FoldersPickerScreen b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public q76(Continuation continuation, FoldersPickerScreen foldersPickerScreen) {
        super(2, continuation);
        this.b = foldersPickerScreen;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        q76 q76 = new q76(continuation, this.b);
        q76.a = obj;
        return q76;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((q76) create(obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        boolean booleanValue = ((Boolean) this.a).booleanValue();
        KProperty[] kPropertyArr = FoldersPickerScreen.z;
        FoldersPickerScreen foldersPickerScreen = this.b;
        foldersPickerScreen.getClass();
        ((OneMeButton) foldersPickerScreen.x.getValue(foldersPickerScreen, FoldersPickerScreen.z[3])).setEnabled(booleanValue);
        return Unit.INSTANCE;
    }
}
