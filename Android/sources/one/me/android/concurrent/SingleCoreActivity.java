package one.me.android.concurrent;

import android.app.Activity;
import android.os.Bundle;
import kotlin.Deprecated;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lone/me/android/concurrent/SingleCoreActivity;", "Landroid/app/Activity;", "<init>", "()V", "oneme_playGoogleRelease"}, k = 1, mv = {2, 0, 0})
@Deprecated(message = "empty component")
public final class SingleCoreActivity extends Activity {
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        finish();
    }
}
