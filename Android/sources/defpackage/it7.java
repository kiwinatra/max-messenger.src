package defpackage;

import android.app.Activity;
import android.content.Intent;
import ru.ok.messages.media.attaches.ActAttachesView;

/* renamed from: it7  reason: default package */
public final /* synthetic */ class it7 implements r8 {
    public final /* synthetic */ a89 a;
    public final /* synthetic */ String b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ boolean e;
    public final /* synthetic */ boolean f;

    public /* synthetic */ it7(a89 a89, String str, boolean z, boolean z2, boolean z3, boolean z4) {
        this.a = a89;
        this.b = str;
        this.c = z;
        this.d = z2;
        this.e = z3;
        this.f = z4;
    }

    public final void a(e9d e9d) {
        Activity w = te8.w(e9d);
        a89 a89 = this.a;
        Intent Y = ActAttachesView.Y(w, a89.a.z, a89, this.b, this.c, this.d, this.e, this.f);
        Y.putExtra("ru.ok.tamtam.extra.COMPAT_MODE", true);
        Y.putExtra("ru.ok.tamtam.extra.START_COMPAT_VIDEO", true);
        te8.w(e9d).startActivity(Y);
    }
}
