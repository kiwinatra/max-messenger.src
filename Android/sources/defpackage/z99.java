package defpackage;

import android.os.Bundle;
import java.util.Collection;
import java.util.List;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.reflect.KProperty;
import one.me.messages.list.ui.contextmenu.MessageContextMenuBottomSheet;

/* renamed from: z99  reason: default package */
public final class z99 extends SuspendLambda implements Function2 {
    public /* synthetic */ Object a;
    public final /* synthetic */ MessageContextMenuBottomSheet b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public z99(Continuation continuation, MessageContextMenuBottomSheet messageContextMenuBottomSheet) {
        super(2, continuation);
        this.b = messageContextMenuBottomSheet;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        z99 z99 = new z99(continuation, this.b);
        z99.a = obj;
        return z99;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((z99) create(obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        List list = (List) this.a;
        KProperty[] kPropertyArr = MessageContextMenuBottomSheet.X0;
        MessageContextMenuBottomSheet messageContextMenuBottomSheet = this.b;
        Bundle bundle = messageContextMenuBottomSheet.getArgs().getBundle("actions");
        Collection g = bundle != null ? kr7.g(bundle) : null;
        if (g == null) {
            g = CollectionsKt.emptyList();
        }
        messageContextMenuBottomSheet.U0.G(CollectionsKt.plus(CollectionsKt.listOf(new pw3(g)), list));
        return Unit.INSTANCE;
    }
}
