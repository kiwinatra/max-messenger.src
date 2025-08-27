package defpackage;

import android.net.Uri;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import ru.ok.android.externcalls.sdk.audio.internal.impl3.CallsAudioManagerV3Impl;
import ru.ok.messages.NotificationsImagesProvider;

/* renamed from: jfa  reason: default package */
public final class jfa extends SuspendLambda implements Function2 {
    public int a;
    public final /* synthetic */ NotificationsImagesProvider b;
    public final /* synthetic */ Uri c;
    public final /* synthetic */ qx0 o;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public jfa(NotificationsImagesProvider notificationsImagesProvider, Uri uri, uae uae, Continuation continuation) {
        super(2, continuation);
        this.b = notificationsImagesProvider;
        this.c = uri;
        this.o = uae;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        return new jfa(this.b, this.c, (uae) this.o, continuation);
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((jfa) create((d14) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.a;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            ifa ifa = new ifa(this.b, this.c, (uae) this.o, (Continuation) null);
            this.a = 1;
            obj = okf.b(CallsAudioManagerV3Impl.USED_DEVICE_RECOVER_TIMEOUT_MS, ifa, this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else if (i == 1) {
            ResultKt.throwOnFailure(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        return obj;
    }
}
