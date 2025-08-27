package defpackage;

import androidx.recyclerview.widget.RecyclerView;
import java.util.Set;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.reflect.KProperty;
import one.me.folders.pickerfolders.FoldersPickerScreen;

/* renamed from: p76  reason: default package */
public final class p76 extends SuspendLambda implements Function2 {
    public /* synthetic */ Object a;
    public final /* synthetic */ FoldersPickerScreen b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public p76(Continuation continuation, FoldersPickerScreen foldersPickerScreen) {
        super(2, continuation);
        this.b = foldersPickerScreen;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        p76 p76 = new p76(continuation, this.b);
        p76.a = obj;
        return p76;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((p76) create(obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        Set set = (Set) this.a;
        KProperty[] kPropertyArr = FoldersPickerScreen.z;
        FoldersPickerScreen foldersPickerScreen = this.b;
        foldersPickerScreen.getClass();
        ((RecyclerView) foldersPickerScreen.v.getValue(foldersPickerScreen, FoldersPickerScreen.z[1])).invalidate();
        return Unit.INSTANCE;
    }
}
