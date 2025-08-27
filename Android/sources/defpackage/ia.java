package defpackage;

import java.util.Set;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.reflect.KProperty;
import one.me.profile.screens.addmembers.AddChatMembersScreen;

/* renamed from: ia  reason: default package */
public final class ia extends SuspendLambda implements Function2 {
    public /* synthetic */ Object a;
    public final /* synthetic */ AddChatMembersScreen b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ia(Continuation continuation, AddChatMembersScreen addChatMembersScreen) {
        super(2, continuation);
        this.b = addChatMembersScreen;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        ia iaVar = new ia(continuation, this.b);
        iaVar.a = obj;
        return iaVar;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((ia) create((Set) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        long[] longArray = CollectionsKt.toLongArray((Set) this.a);
        KProperty[] kPropertyArr = AddChatMembersScreen.Z;
        AddChatMembersScreen addChatMembersScreen = this.b;
        addChatMembersScreen.getClass();
        KProperty kProperty = AddChatMembersScreen.Z[1];
        addChatMembersScreen.z.b(addChatMembersScreen, longArray);
        return Unit.INSTANCE;
    }
}
