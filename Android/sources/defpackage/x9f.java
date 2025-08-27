package defpackage;

import android.content.Intent;
import androidx.fragment.app.b;
import kotlin.Lazy;

/* renamed from: x9f  reason: default package */
public final class x9f {
    public final Lazy a;

    public x9f(Lazy lazy) {
        this.a = lazy;
    }

    public static void a(b bVar, long j) {
        int i = u6.z0;
        bVar.startActivity(new Intent(bVar, u6.class).putExtra("settings.folders.picker.info", new qs9(j)));
    }
}
