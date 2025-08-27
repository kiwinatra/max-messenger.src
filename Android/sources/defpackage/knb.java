package defpackage;

import android.content.Context;
import android.net.Uri;
import com.facebook.fresco.ui.common.ImagePerfDataListener;
import java.util.Set;

/* renamed from: knb  reason: default package */
public final class knb extends p0 {
    public final ba7 p;
    public final ay2 q;
    public ImagePerfDataListener r;

    public knb(Context context, ay2 ay2, ba7 ba7, Set set, Set set2) {
        super(context, set, set2);
        this.p = ba7;
        this.q = ay2;
    }

    public final void c(Uri uri) {
        if (uri == null) {
            this.e = null;
            return;
        }
        ra7 d = ra7.d(uri);
        d.e = f8d.c;
        this.e = d.a();
    }
}
