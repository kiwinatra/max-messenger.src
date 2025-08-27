package defpackage;

import android.support.v4.media.session.PlaybackStateCompat;
import java.io.File;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import ru.ok.tamtam.upload.workers.UploadFileAttachWorker;

/* renamed from: dyf  reason: default package */
public final class dyf extends SuspendLambda implements Function2 {
    public final /* synthetic */ UploadFileAttachWorker a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public dyf(UploadFileAttachWorker uploadFileAttachWorker, Continuation continuation) {
        super(2, continuation);
        this.a = uploadFileAttachWorker;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        return new dyf(this.a, continuation);
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((dyf) create((d14) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        long j;
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        try {
            j = new File(this.a.c().b).length() / PlaybackStateCompat.ACTION_PLAY_FROM_MEDIA_ID;
        } catch (Throwable th) {
            z68.f("UploadFileAttachWorker", "fileSize fail!", th);
            j = 0;
        }
        return Boxing.boxLong(j);
    }
}
