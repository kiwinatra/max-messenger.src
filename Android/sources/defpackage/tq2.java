package defpackage;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.reflect.KProperty;
import kotlin.text.StringsKt;
import one.me.sdk.uikit.common.avatar.OneMeAvatarView;
import one.me.startconversation.chattitleicon.ChatTitleIconScreen;

/* renamed from: tq2  reason: default package */
public final class tq2 extends SuspendLambda implements Function2 {
    public /* synthetic */ Object a;
    public final /* synthetic */ ChatTitleIconScreen b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public tq2(Continuation continuation, ChatTitleIconScreen chatTitleIconScreen) {
        super(2, continuation);
        this.b = chatTitleIconScreen;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        tq2 tq2 = new tq2(continuation, this.b);
        tq2.a = obj;
        return tq2;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((tq2) create(obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        String str;
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        yq2 yq2 = (yq2) this.a;
        String str2 = yq2.b;
        if (str2 == null || StringsKt.isBlank(str2)) {
            str = yq2.a;
            if (str == null || StringsKt.isBlank(str)) {
                str = null;
            }
        } else {
            str = yq2.b;
        }
        KProperty[] kPropertyArr = ChatTitleIconScreen.x0;
        OneMeAvatarView d0 = this.b.d0();
        d0.setAvatarUrl(str);
        d0.setCloseBadgeVisibility(!(str == null || str.length() == 0));
        return Unit.INSTANCE;
    }
}
