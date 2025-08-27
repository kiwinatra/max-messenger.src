package defpackage;

import android.database.Cursor;
import android.os.CancellationSignal;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

/* renamed from: cu7  reason: default package */
public final class cu7 extends SuspendLambda implements Function2 {
    public final /* synthetic */ du7 a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public cu7(du7 du7, Continuation continuation) {
        super(2, continuation);
        this.a = du7;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        return new cu7(this.a, continuation);
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((cu7) create((d14) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX INFO: finally extract failed */
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        km3 km3 = (km3) this.a.g.getValue();
        hs7 hs7 = km3.f;
        ht3 p = ((a74) ((s74) hs7.get())).d.p();
        p.getClass();
        int i = 0;
        d7d a2 = d7d.a(0, "SELECT COUNT(*) FROM contact_title");
        i6d i6d = p.a;
        i6d.b();
        Cursor o = i6d.o(a2, (CancellationSignal) null);
        try {
            if (o.moveToFirst()) {
                i = o.getInt(0);
            }
            o.close();
            a2.o();
            StringBuilder sb = new StringBuilder("ContactController contacts.size=");
            ConcurrentHashMap concurrentHashMap = km3.a;
            sb.append(concurrentHashMap.size());
            sb.append(" titlesCount=");
            sb.append(i);
            z68.c("km3", sb.toString(), new Object[0]);
            if (i < concurrentHashMap.size()) {
                try {
                    ((a74) ((s74) hs7.get())).a();
                    concurrentHashMap.forEach(new z23(1, km3));
                    ((a74) ((s74) hs7.get())).c();
                } finally {
                    ((a74) ((s74) hs7.get())).b();
                }
            }
            return Unit.INSTANCE;
        } catch (Throwable th) {
            o.close();
            a2.o();
            throw th;
        }
    }
}
