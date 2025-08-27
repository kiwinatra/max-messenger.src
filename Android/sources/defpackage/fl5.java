package defpackage;

import androidx.work.WorkRequest;
import java.util.LinkedHashSet;
import java.util.concurrent.TimeUnit;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.reflect.KProperty;
import ru.ok.android.externcalls.sdk.api.ApiProtocol;
import ru.ok.tamtam.upload.workers.UploadExternalGifWorker;

/* renamed from: fl5  reason: default package */
public final class fl5 extends SuspendLambda implements Function2 {
    public int a;
    public final /* synthetic */ gl5 b;
    public final /* synthetic */ long c;
    public final /* synthetic */ String o;
    public final /* synthetic */ String v;
    public final /* synthetic */ long w;
    public final /* synthetic */ long x;
    public final /* synthetic */ String y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public fl5(gl5 gl5, long j, String str, String str2, long j2, long j3, String str3, Continuation continuation) {
        super(2, continuation);
        this.b = gl5;
        this.c = j;
        this.o = str;
        this.v = str2;
        this.w = j2;
        this.x = j3;
        this.y = str3;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        return new fl5(this.b, this.c, this.o, this.v, this.w, this.x, this.y, continuation);
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((fl5) create((d14) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.a;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            ipg ipg = this.b.a;
            long j = this.c;
            String str = this.o;
            String str2 = this.v;
            long j2 = this.w;
            long j3 = this.x;
            String str3 = this.y;
            long j4 = j3;
            String str4 = "ru.ok.tamtam.upload.workers.UploadExternalGifWorker/" + new txf(j, str, str2, j2, j4, str3);
            v3b v3b = (v3b) ((v3b) ((v3b) new v3b(UploadExternalGifWorker.class).setConstraints(new wj3(2, false, false, false, false, -1, -1, CollectionsKt.toSet(new LinkedHashSet())))).setExpedited(t5b.a)).setBackoffCriteria(ag0.a, WorkRequest.MIN_BACKOFF_MILLIS, TimeUnit.MILLISECONDS);
            Pair[] pairArr = {TuplesKt.to("taskName", str4), TuplesKt.to("requestId", Long.valueOf(j)), TuplesKt.to("externalUrl", str), TuplesKt.to("attachLocalId", str2), TuplesKt.to("messageId", Long.valueOf(j2)), TuplesKt.to(ApiProtocol.PARAM_CHAT_ID, Long.valueOf(j4)), TuplesKt.to("stickerId", str3)};
            xv1 xv1 = new xv1(15);
            for (int i2 = 0; i2 < 7; i2++) {
                Pair pair = pairArr[i2];
                xv1.w(pair.getSecond(), (String) pair.getFirst());
            }
            fb5 fb5 = fb5.b;
            KProperty[] kPropertyArr = ipg.n;
            sv7 b2 = ipg.b(str4, fb5, (w3b) ((v3b) v3b.setInputData(xv1.m())).build(), false);
            b2.v();
            on2 on2 = new on2(new kyd(kv0.i(b2.x.H()), 9), 23);
            this.a = 1;
            Object z = bs0.z(on2, this);
            return z == coroutine_suspended ? coroutine_suspended : z;
        } else if (i == 1) {
            ResultKt.throwOnFailure(obj);
            return obj;
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }
}
