package defpackage;

import android.content.Context;
import android.view.MenuItem;
import androidx.fragment.app.a;
import java.io.File;
import kotlin.Lazy;
import kotlin.io.FilesKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* renamed from: aob  reason: default package */
public final class aob extends Lambda implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public /* synthetic */ aob(int i, Object obj, Object obj2) {
        super(0);
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    public final Object invoke() {
        dbg defaultViewModelProviderFactory;
        switch (this.a) {
            case 0:
                return Boolean.valueOf(aob.super.onOptionsItemSelected((MenuItem) this.c));
            case 1:
                return Boolean.valueOf(aob.super.shouldShowRequestPermissionRationale((String) this.c));
            case 2:
                hbg hbg = (hbg) ((Lazy) this.c).getValue();
                tw6 tw6 = hbg instanceof tw6 ? (tw6) hbg : null;
                return (tw6 == null || (defaultViewModelProviderFactory = tw6.getDefaultViewModelProviderFactory()) == null) ? ((a) this.b).getDefaultViewModelProviderFactory() : defaultViewModelProviderFactory;
            default:
                File cacheDir = ((Context) this.b).getCacheDir();
                return new gx4(FilesKt.resolve(FilesKt.resolve(cacheDir, "tracer-lite-" + ((String) this.c)), "drops.json"));
        }
    }
}
