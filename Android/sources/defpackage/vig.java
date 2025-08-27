package defpackage;

import androidx.work.WorkRequest;
import java.util.concurrent.TimeUnit;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.reflect.KProperty;
import ru.ok.tamtam.upload.workers.DownloadFileFromWebAppWorker;

/* renamed from: vig  reason: default package */
public final class vig extends SuspendLambda implements Function2 {
    public final /* synthetic */ hjg a;
    public final /* synthetic */ bgg b;
    public final /* synthetic */ long c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public vig(hjg hjg, bgg bgg, long j, Continuation continuation) {
        super(2, continuation);
        this.a = hjg;
        this.b = bgg;
        this.c = j;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        return new vig(this.a, this.b, this.c, continuation);
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((vig) create((d14) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        hjg hjg = this.a;
        uk5 uk5 = (uk5) hjg.w0.getValue();
        bgg bgg = this.b;
        String str = bgg.d;
        long j = this.c;
        long j2 = hjg.b;
        String str2 = bgg.c;
        ydf ydf = new ydf(str2, str, j, j2);
        uk5.getClass();
        z68.c("ru.ok.tamtam.upload.workers.DownloadFileFromWebAppWorker", "start %s", ydf);
        String str3 = "ru.ok.tamtam.upload.workers.DownloadFileFromWebAppWorker/" + ydf;
        v3b v3b = (v3b) ((v3b) ((v3b) new v3b(DownloadFileFromWebAppWorker.class).setExpedited(t5b.a)).setBackoffCriteria(ag0.b, WorkRequest.MIN_BACKOFF_MILLIS, TimeUnit.MILLISECONDS)).addTag("ru.ok.tamtam.upload.workers.DownloadFileFromWebAppWorker");
        Pair[] pairArr = {TuplesKt.to("taskName", str3), TuplesKt.to("requestId", Long.valueOf(j)), TuplesKt.to("botId", Long.valueOf(j2)), TuplesKt.to("fileName", str), TuplesKt.to("fileUrl", str2)};
        xv1 xv1 = new xv1(15);
        for (int i = 0; i < 5; i++) {
            Pair pair = pairArr[i];
            xv1.w(pair.getSecond(), (String) pair.getFirst());
        }
        fb5 fb5 = fb5.b;
        KProperty[] kPropertyArr = ipg.n;
        sv7 b2 = uk5.a.b(str3, fb5, (w3b) ((v3b) v3b.setInputData(xv1.m())).build(), false);
        b2.v();
        kv0.i(b2.x.H());
        agg agg = agg.DOWNLOADING;
        ru0 ru0 = bgg.a;
        if (!ru0.u()) {
            ru0.s(agg);
        }
        hjg.K0.put(Boxing.boxLong(this.c), bgg);
        return Unit.INSTANCE;
    }
}
