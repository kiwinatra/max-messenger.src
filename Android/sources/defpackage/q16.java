package defpackage;

import java.util.Set;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.reflect.KProperty;
import one.me.folders.picker.FolderMemberPickerScreen;

/* renamed from: q16  reason: default package */
public final class q16 extends SuspendLambda implements Function2 {
    public /* synthetic */ Object a;
    public final /* synthetic */ FolderMemberPickerScreen b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public q16(Continuation continuation, FolderMemberPickerScreen folderMemberPickerScreen) {
        super(2, continuation);
        this.b = folderMemberPickerScreen;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        q16 q16 = new q16(continuation, this.b);
        q16.a = obj;
        return q16;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((q16) create(obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        boolean z = !((Set) this.a).isEmpty();
        FolderMemberPickerScreen folderMemberPickerScreen = this.b;
        if (z) {
            KProperty[] kPropertyArr = FolderMemberPickerScreen.v0;
            folderMemberPickerScreen.k0().setRightActions(new r2b(new hw2(2, folderMemberPickerScreen)));
        } else {
            KProperty[] kPropertyArr2 = FolderMemberPickerScreen.v0;
            folderMemberPickerScreen.k0().setRightActions(s2b.a);
        }
        return Unit.INSTANCE;
    }
}
