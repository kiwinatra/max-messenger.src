package defpackage;

import java.util.List;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import one.me.chats.picker.members.PickerMembersListWidget;

/* renamed from: lkb  reason: default package */
public final class lkb extends SuspendLambda implements Function2 {
    public /* synthetic */ Object a;
    public final /* synthetic */ PickerMembersListWidget b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public lkb(PickerMembersListWidget pickerMembersListWidget, Continuation continuation) {
        super(2, continuation);
        this.b = pickerMembersListWidget;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        lkb lkb = new lkb(this.b, continuation);
        lkb.a = obj;
        return lkb;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((lkb) create((List) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        this.b.w.G((List) this.a);
        return Unit.INSTANCE;
    }
}
