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
import one.me.profile.screens.members.ChatMembersScreen;

/* renamed from: yj2  reason: default package */
public final class yj2 extends SuspendLambda implements Function2 {
    public /* synthetic */ Object a;
    public final /* synthetic */ ChatMembersScreen b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public yj2(Continuation continuation, ChatMembersScreen chatMembersScreen) {
        super(2, continuation);
        this.b = chatMembersScreen;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        yj2 yj2 = new yj2(continuation, this.b);
        yj2.a = obj;
        return yj2;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((yj2) create(obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        Set set = (Set) this.a;
        ChatMembersScreen chatMembersScreen = this.b;
        if (set != null) {
            KProperty[] kPropertyArr = ChatMembersScreen.X;
            chatMembersScreen.f0().a(String.valueOf(set.size()), CollectionsKt.listOf(new e3b(10101, qad.l5, nad.P1)), new zj2(0, chatMembersScreen), new ak2(0, set, chatMembersScreen));
        } else {
            KProperty[] kPropertyArr2 = ChatMembersScreen.X;
            chatMembersScreen.f0().b();
        }
        return Unit.INSTANCE;
    }
}
