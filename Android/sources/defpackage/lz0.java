package defpackage;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import kotlin.Lazy;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import one.me.android.MainActivity;

/* renamed from: lz0  reason: default package */
public final class lz0 {
    public final Lazy a;
    public final Lazy b;
    public final Lazy c;

    public lz0(Lazy lazy, Lazy lazy2, Lazy lazy3) {
        this.a = lazy2;
        this.b = lazy3;
        this.c = lazy;
    }

    public final boolean a(Context context, Intent intent, String str) {
        Context context2 = context;
        String action = intent.getAction();
        z68.c("CallActionsProcessor", "handleCallNotificationActionIntent action=" + action + " from=" + str, new Object[0]);
        String action2 = intent.getAction();
        if (action2 == null) {
            return false;
        }
        m01 m01 = (m01) m21.a.getAccessor().g(m01.class);
        w91 f = o9a.f(action2);
        Class<MainActivity> cls = MainActivity.class;
        if (Intrinsics.areEqual((Object) f, (Object) s91.a)) {
            Intent intent2 = new Intent(context2, cls);
            intent2.setAction("action-open-call");
            intent2.setFlags(268435456);
            context2.startActivity(intent2);
        } else {
            boolean areEqual = Intrinsics.areEqual((Object) f, (Object) n91.a);
            Lazy lazy = this.c;
            if (areEqual) {
                if (((edb) this.a.getValue()).b(edb.h)) {
                    ((mp1) ((dp1) lazy.getValue())).d();
                    Intent intent3 = new Intent(context2, cls);
                    intent3.setAction("action-open-call");
                    intent3.setFlags(268435456);
                    context2.startActivity(intent3);
                } else {
                    Bundle extras = intent.getExtras();
                    Intent intent4 = new Intent(context2, cls);
                    intent4.setAction("action-open-incoming");
                    if (extras != null) {
                        intent4.putExtras(extras);
                    }
                    intent4.setFlags(268435456);
                    context2.startActivity(intent4);
                }
            } else if (Intrinsics.areEqual((Object) f, (Object) q91.a)) {
                ((mp1) ((dp1) lazy.getValue())).u((nw6) null);
            } else if (Intrinsics.areEqual((Object) f, (Object) o91.a)) {
                tq1 tq1 = (tq1) this.b.getValue();
                String str2 = ((mp1) ((dp1) lazy.getValue())).j().c;
                o01 o01 = (o01) m01;
                boolean z = ((mp1) ((dp1) lazy.getValue())).j().h;
                tq1.getClass();
                tq1.a(tq1, "AUDIO_ENABLED", str2, (String) null, Integer.valueOf(o01.d() ^ true ? 1 : 0), (String) null, (String) null, z, 52);
                o01.e(!o01.d());
            } else if (Intrinsics.areEqual((Object) f, (Object) p91.a)) {
                ((mp1) ((dp1) lazy.getValue())).u(nw6.c);
            } else if (Intrinsics.areEqual((Object) f, (Object) t91.a)) {
                Bundle extras2 = intent.getExtras();
                Intent intent5 = new Intent(context2, cls);
                intent5.setAction("action-open-incoming");
                if (extras2 != null) {
                    intent5.putExtras(extras2);
                }
                intent5.setFlags(268435456);
                context2.startActivity(intent5);
            } else if (Intrinsics.areEqual((Object) f, (Object) r91.a)) {
                Bundle extras3 = intent.getExtras();
                Intent intent6 = new Intent(context2, cls);
                intent6.setAction("action-join-link");
                if (extras3 != null) {
                    intent6.putExtras(extras3);
                }
                intent6.setFlags(268435456);
                context2.startActivity(intent6);
            } else if (Intrinsics.areEqual((Object) f, (Object) u91.a)) {
                Bundle extras4 = intent.getExtras();
                Intent intent7 = new Intent(context2, cls);
                intent7.setAction("action-rate-call");
                if (extras4 != null) {
                    intent7.putExtras(extras4);
                }
                intent7.setFlags(268435456);
                context2.startActivity(intent7);
            } else if (Intrinsics.areEqual((Object) f, (Object) v91.a)) {
                return false;
            } else {
                throw new NoWhenBranchMatchedException();
            }
        }
        return true;
    }
}
