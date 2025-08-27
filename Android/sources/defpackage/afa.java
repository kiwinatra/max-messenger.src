package defpackage;

import kotlin.ResultKt;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.MapsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import ru.ok.tamtam.android.services.NotificationTamService;

/* renamed from: afa  reason: default package */
public final class afa extends SuspendLambda implements Function2 {
    public final /* synthetic */ NotificationTamService a;
    public final /* synthetic */ long b;
    public final /* synthetic */ long c;
    public final /* synthetic */ long o;
    public final /* synthetic */ boolean v;
    public final /* synthetic */ long w;
    public final /* synthetic */ String x;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public afa(NotificationTamService notificationTamService, long j, long j2, long j3, boolean z, long j4, String str, Continuation continuation) {
        super(2, continuation);
        this.a = notificationTamService;
        this.b = j;
        this.c = j2;
        this.o = j3;
        this.v = z;
        this.w = j4;
        this.x = str;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        return new afa(this.a, this.b, this.c, this.o, this.v, this.w, this.x, continuation);
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((afa) create((d14) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        NotificationTamService notificationTamService = this.a;
        ysc ysc = (ysc) notificationTamService.x.getValue();
        ysc.getClass();
        long j = this.b;
        ysc.e(ysc, j, this.c, this.o, false, false, this.v, 88);
        ((qwa) ysc.b.getValue()).a(j);
        iga c2 = ((hga) notificationTamService.y.getValue()).c();
        c2.getClass();
        StringBuilder sb = new StringBuilder("onNotificationMarkAsRead: pushId=");
        long j2 = this.w;
        sb.append(j2);
        sb.append(", eventKey=");
        String str = this.x;
        sb.append(str);
        String sb2 = sb.toString();
        String str2 = iga.d;
        z68.c(str2, sb2, new Object[0]);
        if (str != null) {
            try {
                c2.b().a("Action", MapsKt.mapOf(TuplesKt.to("trid", Long.valueOf(j2)), TuplesKt.to("eKey", str), TuplesKt.to("p_op", "m_as_read")));
            } catch (Exception e) {
                z68.f(str2, "onNotificationMarkAsRead: failed", e);
                ((uta) c2.c()).c(new Exception("failed to log mark as read", e), true);
            }
        }
        return Unit.INSTANCE;
    }
}
