package defpackage;

import android.content.ActivityNotFoundException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KProperty;
import one.me.startconversation.chattitleicon.ChatTitleIconScreen;

/* renamed from: uq2  reason: default package */
public final class uq2 extends SuspendLambda implements Function2 {
    public /* synthetic */ Object a;
    public final /* synthetic */ ChatTitleIconScreen b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public uq2(Continuation continuation, ChatTitleIconScreen chatTitleIconScreen) {
        super(2, continuation);
        this.b = chatTitleIconScreen;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        uq2 uq2 = new uq2(continuation, this.b);
        uq2.a = obj;
        return uq2;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((uq2) create(obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        v5a v5a = (v5a) this.a;
        boolean z = v5a instanceof iq2;
        ChatTitleIconScreen chatTitleIconScreen = this.b;
        if (z) {
            kr7.z(chatTitleIconScreen);
            chatTitleIconScreen.startActivityForResult(((iq2) v5a).b, 666);
        } else if (v5a instanceof mq2) {
            kr7.z(chatTitleIconScreen);
            try {
                chatTitleIconScreen.startActivityForResult(((mq2) v5a).b, 777);
                z5a.g((z5a) chatTitleIconScreen.y.getValue(), jgd.AVATAR_PICKER_CAMERA);
            } catch (ActivityNotFoundException unused) {
                KProperty[] kPropertyArr = ChatTitleIconScreen.x0;
                chatTitleIconScreen.h0().m();
                z68.f(ChatTitleIconScreen.class.getName(), "failed open camera", (Throwable) null);
            }
        } else if (v5a instanceof lq2) {
            KProperty[] kPropertyArr2 = ChatTitleIconScreen.x0;
            chatTitleIconScreen.f0().setProgressEnabled(false);
            ble.b.p1(new vq2(chatTitleIconScreen, v5a, 0));
        } else if (v5a instanceof kq2) {
            KProperty[] kPropertyArr3 = ChatTitleIconScreen.x0;
            chatTitleIconScreen.f0().setProgressEnabled(false);
            ble.b.p1(new vq2(chatTitleIconScreen, v5a, 1));
        } else if (v5a instanceof jq2) {
            KProperty[] kPropertyArr4 = ChatTitleIconScreen.x0;
            chatTitleIconScreen.f0().setProgressEnabled(false);
            ble.b.p1(new vq2(chatTitleIconScreen, v5a, 2));
        } else if (Intrinsics.areEqual((Object) v5a, (Object) nq2.b)) {
            KProperty[] kPropertyArr5 = ChatTitleIconScreen.x0;
            ((edb) chatTitleIconScreen.x.getValue()).g(new eng(chatTitleIconScreen, 1));
        }
        return Unit.INSTANCE;
    }
}
