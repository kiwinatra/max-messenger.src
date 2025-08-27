package defpackage;

import android.content.Intent;
import kotlin.ResultKt;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import one.me.profile.screens.invite.ProfileInviteScreen;
import org.apache.http.protocol.HTTP;

/* renamed from: j2c  reason: default package */
public final class j2c extends SuspendLambda implements Function2 {
    public /* synthetic */ Object a;
    public final /* synthetic */ ProfileInviteScreen b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public j2c(ProfileInviteScreen profileInviteScreen, Continuation continuation) {
        super(2, continuation);
        this.b = profileInviteScreen;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        j2c j2c = new j2c(this.b, continuation);
        j2c.a = obj;
        return j2c;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((j2c) create((v5a) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        v5a v5a = (v5a) this.a;
        boolean z = v5a instanceof g2c;
        ProfileInviteScreen profileInviteScreen = this.b;
        if (z) {
            Intent intent = new Intent();
            intent.setAction("android.intent.action.SEND");
            intent.putExtra("android.intent.extra.TEXT", ((g2c) v5a).b);
            intent.setType(HTTP.PLAIN_TEXT_TYPE);
            i9d i9d = (i9d) CollectionsKt.lastOrNull(profileInviteScreen.getRouter().e());
            r4c.b.W0().b(":chats/share", o54.f(TuplesKt.to("ru.ok.tamtam.extra.DATA", intent), TuplesKt.to("tag", i9d != null ? i9d.b : null)));
        } else if (v5a instanceof h2c) {
            gsg.B(profileInviteScreen.getContext(), ((h2c) v5a).b);
        } else if (v5a instanceof pa4) {
            r4c.b.Y0((pa4) v5a);
        } else if (v5a instanceof p33) {
            profileInviteScreen.getRouter().B(profileInviteScreen);
        }
        return Unit.INSTANCE;
    }
}
