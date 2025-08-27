package one.me.android.deeplink;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0005B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lone/me/android/deeplink/NewWidgetActivity;", "Lm5;", "Lt7d;", "<init>", "()V", "ekd", "oneme_playGoogleRelease"}, k = 1, mv = {2, 0, 0})
public final class NewWidgetActivity extends m5 implements t7d {
    public static final /* synthetic */ int A0 = 0;
    public e9d z0;

    public final String E() {
        return null;
    }

    public final void J() {
    }

    public final boolean Q() {
        return true;
    }

    public final e9d h() {
        e9d e9d = this.z0;
        if (e9d != null) {
            return e9d;
        }
        return null;
    }

    public final boolean i() {
        return false;
    }

    public final void onCreate(Bundle bundle) {
        oz1 a = kv0.a(this);
        a.setId(dgc.root);
        setContentView((View) a);
        hz4.a(this);
        super.onCreate(bundle);
        e9d e = cvg.e(this, a, bundle);
        e.e = 1;
        e.Q(false);
        this.z0 = e;
        qra.a.z().f(new vra(17, this, q8.i(this)));
        q8.Q(this, (Intent) null);
    }

    public final void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        q8.b(q8.i(this));
        qra.a.z().f(new vra(16, this, intent));
        q8.Q(this, intent);
    }
}
