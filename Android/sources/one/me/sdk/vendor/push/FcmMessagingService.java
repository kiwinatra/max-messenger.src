package one.me.sdk.vendor.push;

import android.os.Bundle;
import com.google.firebase.messaging.FirebaseMessagingService;
import java.util.Objects;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lone/me/sdk/vendor/push/FcmMessagingService;", "", "Lcom/google/firebase/messaging/FirebaseMessagingService;", "<init>", "()V", "google_release"}, k = 1, mv = {2, 0, 0})
@SourceDebugExtension({"SMAP\nFcmMessagingService.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FcmMessagingService.kt\none/me/sdk/vendor/push/FcmMessagingService\n+ 2 Log.kt\nru/ok/tamtam/logger/Log\n*L\n1#1,35:1\n32#2,4:36\n*S KotlinDebug\n*F\n+ 1 FcmMessagingService.kt\none/me/sdk/vendor/push/FcmMessagingService\n*L\n15#1:36,4\n*E\n"})
public final class FcmMessagingService extends FirebaseMessagingService {
    public final String y = "FCM";

    public final void c() {
        z68.c(this.y, "onDeletedMessages", new Object[0]);
        bbf bbf = (bbf) ((np9) h2g.a.getAccessor().g(np9.class));
        z68.c(bbf.j, "onDeletedMessages", new Object[0]);
        bbf.a().a().h(false, true);
        ((nd) bbf.c.getValue()).e("FCM_ON_DELETED_MESSAGES");
    }

    /* JADX WARNING: type inference failed for: r1v3, types: [qae, ts] */
    public final void d(b1d b1d) {
        long j;
        String str = this.y;
        a67 a67 = z68.b;
        if (a67 != null && a67.c()) {
            w78 w78 = w78.o;
            a67.d(w78, str, "onMessageReceived " + b1d, (Throwable) null);
        }
        np9 np9 = (np9) h2g.a.getAccessor().g(np9.class);
        if (b1d.b == null) {
            ? qae = new qae(0);
            Bundle bundle = b1d.a;
            for (String next : bundle.keySet()) {
                Object obj = bundle.get(next);
                if (obj instanceof String) {
                    String str2 = (String) obj;
                    if (!next.startsWith("google.") && !next.startsWith("gcm.") && !next.equals("from") && !next.equals("message_type") && !next.equals("collapse_key")) {
                        qae.put(next, str2);
                    }
                }
            }
            b1d.b = qae;
        }
        ts tsVar = b1d.b;
        Object obj2 = b1d.a.get("google.sent_time");
        if (obj2 instanceof Long) {
            j = ((Long) obj2).longValue();
        } else {
            if (obj2 instanceof String) {
                try {
                    j = Long.parseLong((String) obj2);
                } catch (NumberFormatException unused) {
                    Objects.toString(obj2);
                }
            }
            j = 0;
        }
        bbf bbf = (bbf) np9;
        ((aua) bbf.g.getValue()).c().execute(new s6e(12, new op9(tsVar, j), bbf));
    }

    public final void e(String str) {
        z68.c(this.y, "onNewToken", new Object[0]);
        bbf bbf = (bbf) ((np9) h2g.a.getAccessor().g(np9.class));
        ((qjd) ((x23) bbf.d.getValue())).l("user.fcmToken", str);
        if (str.length() > 0 && ((doa) bbf.e.getValue()).e()) {
            ((jna) ((rl) bbf.f.getValue())).v();
        }
    }
}
