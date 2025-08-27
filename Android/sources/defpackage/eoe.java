package defpackage;

import java.io.File;
import one.me.rlottie.network.LottieDownloadListener;

/* renamed from: eoe  reason: default package */
public final class eoe implements LottieDownloadListener {
    public final /* synthetic */ foe a;

    public eoe(foe foe) {
        this.a = foe;
    }

    public final void onFailed(Throwable th) {
        foe foe = this.a;
        foe.b(foe.f, th);
    }

    public final void onFinished(String str, File file, String str2) {
        ((aua) this.a.c.getValue()).b().execute(new o6d((Object) this, (Object) file, (Object) str2, 7));
    }
}
