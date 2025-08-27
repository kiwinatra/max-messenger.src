package defpackage;

import android.content.ComponentName;
import android.content.Context;
import android.media.browse.MediaBrowser;
import android.os.Bundle;
import android.os.Messenger;
import android.os.Process;

/* renamed from: jm8  reason: default package */
public final class jm8 {
    public final Context a;
    public final MediaBrowser b;
    public final Bundle c;
    public final hm8 d = new hm8(this);
    public final ts e = new qae(0);
    public dm4 f;
    public Messenger g;
    public ox8 h;

    /* JADX WARNING: type inference failed for: r0v1, types: [qae, ts] */
    public jm8(Context context, ComponentName componentName, w28 w28) {
        this.a = context;
        Bundle bundle = new Bundle();
        this.c = bundle;
        bundle.putInt("extra_client_version", 1);
        bundle.putInt("extra_calling_pid", Process.myPid());
        w28.c = this;
        im8 im8 = (im8) w28.b;
        im8.getClass();
        this.b = new MediaBrowser(context, componentName, im8, bundle);
    }
}
