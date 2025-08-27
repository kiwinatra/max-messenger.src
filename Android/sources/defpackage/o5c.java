package defpackage;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import one.me.profile.ProfileScreen;
import one.me.profile.screens.members.compact.ChatMembersCompactWidget;

/* renamed from: o5c  reason: default package */
public final class o5c extends SuspendLambda implements Function2 {
    public final /* synthetic */ ProfileScreen a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public o5c(Continuation continuation, ProfileScreen profileScreen) {
        super(2, continuation);
        this.a = profileScreen;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        return new o5c(continuation, this.a);
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((o5c) create((d14) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        ProfileScreen profileScreen = this.a;
        if (profileScreen.getView() == null || profileScreen.g0().I0.r() || profileScreen.g0().I0.p()) {
            return Unit.INSTANCE;
        }
        mz2 mz2 = (mz2) profileScreen.z0.getValue(profileScreen, ProfileScreen.D0[12]);
        if (!Intrinsics.areEqual((Object) mz2.b(), (Object) "profile_members_list_widget")) {
            i9d i9d = new i9d(new ChatMembersCompactWidget(profileScreen.getArgs().getLong("profile:id")), (String) null, (ey3) null, (ey3) null, false, -1);
            i9d.d("profile_members_list_widget");
            mz2.a.R(i9d);
        }
        return Unit.INSTANCE;
    }
}
