package one.me.android.deeplink;

import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import kotlin.Metadata;
import kotlin.io.ConstantsKt;
import kotlin.jvm.internal.IntCompanionObject;
import kotlin.jvm.internal.Intrinsics;
import one.me.android.MainActivity;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lone/me/android/deeplink/LinkInterceptorActivity;", "Lhn;", "<init>", "()V", "oneme_playGoogleRelease"}, k = 1, mv = {2, 0, 0})
public final class LinkInterceptorActivity extends hn {
    public final boolean C(Intent intent) {
        String action = intent.getAction();
        if (action == null || Intrinsics.areEqual((Object) o9a.f(action), (Object) v91.a)) {
            return false;
        }
        Intent intent2 = new Intent(this, MainActivity.class);
        intent2.setAction(intent.getAction());
        intent2.setData(intent.getData());
        startActivity(intent2);
        finish();
        return true;
    }

    public final void onCreate(Bundle bundle) {
        if (Build.VERSION.SDK_INT >= 34) {
            overrideActivityTransition(0, 0, 0);
            overrideActivityTransition(1, 0, 0);
        } else {
            overridePendingTransition(0, 0);
        }
        Window window = getWindow();
        window.clearFlags(67108864);
        window.addFlags(IntCompanionObject.MIN_VALUE);
        window.setStatusBarColor(0);
        View decorView = window.getDecorView();
        decorView.setSystemUiVisibility(decorView.getSystemUiVisibility() | ConstantsKt.DEFAULT_BUFFER_SIZE);
        if (!C(getIntent())) {
            Uri data = getIntent().getData();
            if (data == null) {
                js9.l(this, (Uri) null, (z0b) null, (iz1) null, 14);
                finish();
                return;
            }
            oz1 a = kv0.a(this);
            a.setId(dgc.root);
            setContentView((View) a);
            super.onCreate(bundle);
            e9d e = cvg.e(this, a, bundle);
            e.e = 1;
            e.Q(true);
            if (!e.n()) {
                i9d n = iq.n(new LinkInterceptorWidget(data), (ey3) null, (ey3) null);
                n.d("link");
                e.R(n);
            }
            e.I();
        }
    }

    public final void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        C(intent);
    }
}
