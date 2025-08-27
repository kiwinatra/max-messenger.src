package defpackage;

import android.content.Intent;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import one.me.mediapicker.MediaPickerScreen;
import ru.ok.messages.views.ActAvatarCrop;

/* renamed from: bu8  reason: default package */
public final class bu8 extends SuspendLambda implements Function2 {
    public /* synthetic */ Object a;
    public final /* synthetic */ MediaPickerScreen b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public bu8(Continuation continuation, MediaPickerScreen mediaPickerScreen) {
        super(2, continuation);
        this.b = mediaPickerScreen;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        bu8 bu8 = new bu8(continuation, this.b);
        bu8.a = obj;
        return bu8;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((bu8) create(obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        v5a v5a = (v5a) this.a;
        if (v5a instanceof xt8) {
            MediaPickerScreen mediaPickerScreen = this.b;
            Intent intent = new Intent(mediaPickerScreen.getContext(), ActAvatarCrop.class);
            xt8 xt8 = (xt8) v5a;
            intent.putExtra("ru.ok.tamtam.extra.URI", xt8.b);
            intent.putExtra("ru.ok.tamtam.extra.FILE_PATH", xt8.c);
            intent.putExtra("ru.ok.tamtam.extra.SHOW_RECAPTURE", true);
            intent.putExtra("ru.ok.tamtam.extra.FOR_CHAT_BACKGROUND", false);
            mediaPickerScreen.startActivityForResult(intent, 666);
        }
        return Unit.INSTANCE;
    }
}
