package defpackage;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import ru.ok.tamtam.upload.workers.DownloadFileFromWebAppWorker;

/* renamed from: xs4  reason: default package */
public final class xs4 extends SuspendLambda implements Function2 {
    public final /* synthetic */ DownloadFileFromWebAppWorker a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public xs4(DownloadFileFromWebAppWorker downloadFileFromWebAppWorker, Continuation continuation) {
        super(2, continuation);
        this.a = downloadFileFromWebAppWorker;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        return new xs4(this.a, continuation);
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((xs4) create((d14) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        DownloadFileFromWebAppWorker downloadFileFromWebAppWorker = this.a;
        return ((po5) ((ln5) downloadFileFromWebAppWorker.c.getValue())).i(downloadFileFromWebAppWorker.c().d);
    }
}
