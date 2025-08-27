package defpackage;

import android.content.Context;
import android.net.Uri;
import kotlin.collections.CollectionsKt;

/* renamed from: ny2  reason: default package */
public final class ny2 {
    public final Context a;
    public final ptb b;
    public final rtb c;

    public ny2(Context context, ptb ptb, rtb rtb) {
        this.a = context;
        this.b = ptb;
        this.c = rtb;
    }

    public final zo3 a(vk3 vk3) {
        CharSequence charSequence;
        vk3 vk32 = vk3;
        int i = this.b.b(vk3.r()).a;
        boolean z = i == 10 || i == 20 || i == 40;
        String t = vk32.t(kl0.b);
        if (vk3.y()) {
            charSequence = null;
        } else {
            boolean z2 = vk32.w;
            Context context = this.a;
            charSequence = z2 ? context.getString(jad.I) : (!vk3.x() || !vk3.A()) ? vk3.x() ? context.getString(qad.J) : this.c.d(vk32, true) : context.getString(qad.T8);
        }
        long r = vk3.r();
        String f = vk3.f();
        if (f == null) {
            f = "";
        }
        return new zo3(r, (CharSequence) f, hhf.b(vk3.j()), CollectionsKt.listOf(Long.valueOf(vk3.s())), charSequence, (CharSequence) null, t != null ? Uri.parse(t) : null, z, vk3.z(), vk3.q(), false, (qdb) null, (Boolean) null, 0, vk3.x(), 27648);
    }

    public final cuc b(vk3 vk3) {
        int i = this.b.b(vk3.r()).a;
        return new cuc(vk3.r(), vk3.g(), vk3.t(kl0.c), vk3.q(), i == 10 || i == 20 || i == 40, vk3.z());
    }
}
