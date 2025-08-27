package androidx.mediarouter.app;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import java.lang.ref.WeakReference;

public class MediaRouteActionProvider extends c8 {
    public final sw8 b;
    public final kw8 c = kw8.c;
    public final ov8 d = ov8.a;
    public cv8 e;

    public MediaRouteActionProvider(Context context) {
        super(context);
        this.b = sw8.d(context);
        new WeakReference(this);
    }

    public final boolean b() {
        kw8 kw8 = this.c;
        this.b.getClass();
        return sw8.e(kw8);
    }

    public final View c() {
        cv8 cv8 = new cv8(this.a);
        this.e = cv8;
        cv8.setCheatSheetEnabled(true);
        this.e.setRouteSelector(this.c);
        this.e.setAlwaysVisible(false);
        this.e.setDialogFactory(this.d);
        this.e.setLayoutParams(new ViewGroup.LayoutParams(-2, -1));
        return this.e;
    }

    public final boolean e() {
        cv8 cv8 = this.e;
        if (cv8 != null) {
            return cv8.d();
        }
        return false;
    }

    public final boolean g() {
        return true;
    }
}
