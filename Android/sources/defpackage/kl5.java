package defpackage;

import android.content.Context;
import android.content.Intent;
import ru.ok.messages.views.fragments.base.FrgBase;

/* renamed from: kl5  reason: default package */
public final /* synthetic */ class kl5 implements x6 {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ kl5(ll5 ll5, l20 l20, boolean z, a89 a89, o5h o5h) {
        this.c = ll5;
        this.d = l20;
        this.b = z;
        this.e = a89;
        this.f = o5h;
    }

    public final void run() {
        boolean z = this.b;
        Object obj = this.f;
        Object obj2 = this.e;
        Object obj3 = this.d;
        Object obj4 = this.c;
        switch (this.a) {
            case 0:
                ll5 ll5 = (ll5) obj4;
                if (ll5.f()) {
                    l20 l20 = (l20) obj3;
                    String absolutePath = ll5.x.h(l20).getAbsolutePath();
                    boolean f2 = scf.f(absolutePath, true);
                    Context context = (Context) ll5.a;
                    if (f2) {
                        try {
                            int i = w6.z0;
                            Intent intent = new Intent(context, w6.class);
                            intent.putExtra("ru.ok.tamtam.extra.THEME_PATH", absolutePath);
                            intent.addFlags(65536);
                            context.startActivity(intent);
                            return;
                        } catch (Exception e2) {
                            z68.f("ll5", "openFileAttach: open theme failed: ", e2);
                        }
                    }
                    a89 a89 = (a89) obj2;
                    FrgBase frgBase = (FrgBase) ll5.c;
                    if (!z || frgBase == null || (!ld8.W(l20) && !ld8.Y(l20))) {
                        m58.E(context, a89, l20, ((sjd) ((z9f) ll5.b)).r(), ((qra) ((id3) frgBase.p1.b)).p());
                        return;
                    }
                    y64.B(new jh3(4, ll5, a89, l20, (o5h) obj));
                    return;
                }
                return;
            default:
                fa9 fa9 = (fa9) obj4;
                fa9.getClass();
                ha9 ha9 = (ha9) obj3;
                fa9.x(ha9.b, (String) obj2, (qk3) obj);
                if (z) {
                    fa9.b.c(new twf(ha9.z, ha9.b));
                    return;
                }
                return;
        }
    }

    public /* synthetic */ kl5(fa9 fa9, ha9 ha9, String str, qk3 qk3) {
        this.c = fa9;
        this.d = ha9;
        this.e = str;
        this.f = qk3;
        this.b = true;
    }
}
