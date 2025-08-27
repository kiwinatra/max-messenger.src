package defpackage;

import java.io.File;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import ru.ok.tamtam.upload.workers.DownloadFileAttachWorker;

/* renamed from: js4  reason: default package */
public final class js4 extends SuspendLambda implements Function2 {
    public final /* synthetic */ DownloadFileAttachWorker a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public js4(DownloadFileAttachWorker downloadFileAttachWorker, Continuation continuation) {
        super(2, continuation);
        this.a = downloadFileAttachWorker;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        return new js4(this.a, continuation);
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((js4) create((d14) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        s10 s10;
        String str;
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        DownloadFileAttachWorker downloadFileAttachWorker = this.a;
        if (downloadFileAttachWorker.g().c > 0) {
            return ((po5) downloadFileAttachWorker.d()).t(downloadFileAttachWorker.g().c);
        } else if (downloadFileAttachWorker.g().d > 0) {
            return ((po5) downloadFileAttachWorker.d()).d(downloadFileAttachWorker.g().d);
        } else if (downloadFileAttachWorker.g().e > 0) {
            return ((po5) downloadFileAttachWorker.d()).k(downloadFileAttachWorker.g().e);
        } else if (downloadFileAttachWorker.g().f > 0) {
            return ((po5) downloadFileAttachWorker.d()).p(downloadFileAttachWorker.g().f);
        } else {
            File file = null;
            if (downloadFileAttachWorker.g().j > 0) {
                ha9 r = downloadFileAttachWorker.e().r(downloadFileAttachWorker.g().a);
                if (r != null) {
                    w28 w28 = r.x0;
                    if (w28 != null) {
                        l20 I = w28.I(g20.X);
                        if (!(I == null || (s10 = I.j) == null || (str = I.r) == null || str.length() == 0)) {
                            File file2 = new File(str);
                            if (file2.exists() && file2.length() == s10.b && file2.lastModified() == I.v) {
                                file = file2;
                            }
                        }
                    } else {
                        throw new IllegalArgumentException("Required value was null.".toString());
                    }
                }
                if (file == null) {
                    return ((po5) downloadFileAttachWorker.d()).i(downloadFileAttachWorker.g().k);
                }
            }
            return file;
        }
    }
}
