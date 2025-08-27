package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.os.Messenger;
import android.service.media.MediaBrowserService;
import java.util.ArrayList;

/* renamed from: om8  reason: default package */
public final class om8 extends MediaBrowserService {
    public final /* synthetic */ f0 a;
    public final /* synthetic */ nm8 b;
    public final /* synthetic */ pm8 c;

    public om8(pm8 pm8, Context context) {
        this.c = pm8;
        this.b = pm8;
        this.a = pm8;
        attachBaseContext(context);
    }

    public final MediaBrowserService.BrowserRoot onGetRoot(String str, int i, Bundle bundle) {
        Bundle bundle2;
        fj fjVar;
        px8.a(bundle);
        Bundle bundle3 = bundle == null ? null : new Bundle(bundle);
        f0 f0Var = this.a;
        sy8 sy8 = (sy8) f0Var.o;
        int i2 = -1;
        if (bundle3 == null || bundle3.getInt("extra_client_version", 0) == 0) {
            bundle2 = null;
        } else {
            bundle3.remove("extra_client_version");
            f0Var.c = new Messenger(sy8.x);
            bundle2 = wj6.g(2, "extra_service_version");
            bundle2.putBinder("extra_messenger", ((Messenger) f0Var.c).getBinder());
            ox8 ox8 = sy8.y;
            if (ox8 != null) {
                h67 a2 = ox8.a();
                bundle2.putBinder("extra_session_binder", a2 == null ? null : a2.asBinder());
            } else {
                ((ArrayList) f0Var.a).add(bundle2);
            }
            i2 = bundle3.getInt("extra_calling_pid", -1);
            bundle3.remove("extra_calling_pid");
        }
        mm8 mm8 = new mm8((sy8) f0Var.o, str, i2, i, (vm8) null);
        sy8.w = mm8;
        fj b2 = sy8.b(bundle3);
        sy8.w = null;
        if (b2 == null) {
            fjVar = null;
        } else {
            if (((Messenger) f0Var.c) != null) {
                sy8.o.add(mm8);
            }
            Bundle bundle4 = (Bundle) b2.c;
            if (bundle2 == null) {
                bundle2 = bundle4;
            } else if (bundle4 != null) {
                bundle2.putAll(bundle4);
            }
            fjVar = new fj(bundle2);
        }
        if (fjVar == null) {
            return null;
        }
        return new MediaBrowserService.BrowserRoot((String) fjVar.b, (Bundle) fjVar.c);
    }

    public final void onLoadChildren(String str, MediaBrowserService.Result result) {
        rt6 rt6 = new rt6(26, (Object) result);
        f0 f0Var = this.a;
        f0Var.getClass();
        sy8 sy8 = (sy8) f0Var.o;
        sy8.w = sy8.c;
        rt6.s((Object) null);
        sy8.w = null;
    }

    public final void onLoadItem(String str, MediaBrowserService.Result result) {
        rt6 rt6 = new rt6(26, (Object) result);
        sy8 sy8 = this.b.v;
        sy8.w = sy8.c;
        rt6.s((Object) null);
        sy8.w = null;
    }

    public final void onLoadChildren(String str, MediaBrowserService.Result result, Bundle bundle) {
        px8.a(bundle);
        pm8 pm8 = this.c;
        sy8 sy8 = pm8.w;
        mm8 mm8 = sy8.c;
        rt6 rt6 = new rt6(26, (Object) result);
        sy8.w = mm8;
        rt6.s((Object) null);
        sy8.w = null;
        pm8.w.w = null;
    }
}
