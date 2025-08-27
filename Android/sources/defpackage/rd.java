package defpackage;

import android.content.ComponentName;
import android.content.Context;
import android.graphics.Color;
import android.text.SpannableStringBuilder;
import android.text.SpannedString;
import android.text.style.ForegroundColorSpan;
import java.util.Iterator;
import java.util.List;
import kotlin.Lazy;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import one.me.android.concurrent.SingleCoreActivity;

/* renamed from: rd  reason: default package */
public final class rd implements dn4 {
    public final /* synthetic */ int a;
    public final Object b;
    public final Object c;
    public final Object o;

    public rd(Lazy lazy, Lazy lazy2, int i) {
        this.a = i;
        switch (i) {
            case 1:
                this.b = lazy;
                this.c = lazy2;
                this.o = new etc(f6e.a(CollectionsKt.listOf(new o94(System.nanoTime(), new mgf("Пуши заново"), cad.P1, (ngf) null, (ev0) null, 24))));
                return;
            default:
                long nanoTime = System.nanoTime();
                this.b = lazy;
                this.c = lazy2;
                this.o = new etc(f6e.a(CollectionsKt.listOf(new o94(nanoTime, new mgf("Отправить аналитику"), cad.W, (ngf) null, (ev0) null, 24))));
                return;
        }
    }

    public final ome a() {
        switch (this.a) {
            case 0:
                return (etc) this.o;
            case 1:
                return (etc) this.o;
            default:
                return (xme) this.c;
        }
    }

    public final void b(o94 o94) {
        switch (this.a) {
            case 0:
                k78.h((k78) ((Lazy) this.c).getValue(), true, 2);
                e0b e0b = (e0b) ((Lazy) this.b).getValue();
                e0b.i("Логи отправлены");
                e0b.j();
                return;
            case 1:
                ws wsVar = new ws(0);
                Iterator it = ((r62) ((Lazy) this.b).getValue()).B((zb2) null).iterator();
                while (it.hasNext()) {
                    a32 a32 = (a32) it.next();
                    if (a32.b.m > 0) {
                        wsVar.add(Long.valueOf(a32.a));
                    }
                }
                ((qwa) ((Lazy) this.c).getValue()).d(wsVar);
                return;
            default:
                Class<f6e> cls = f6e.class;
                z68.c(cls.getName(), "switch", new Object[0]);
                Context context = (Context) this.b;
                try {
                    context.getPackageManager().setComponentEnabledSetting(new ComponentName("ru.oneme.app", SingleCoreActivity.class.getName()), f6e.w(context) ? 2 : 1, 1);
                } catch (Throwable th) {
                    z68.f(cls.getName(), "fail to update component state", th);
                }
                ((xme) this.c).setValue(d());
                e0b e0b2 = (e0b) ((q4) this.o).g(e0b.class);
                e0b2.i("Перезапустите приложение");
                e0b2.b("Для применения конфига перезапустите приложение");
                e0b2.j();
                return;
        }
    }

    public List d() {
        SpannedString spannedString;
        boolean w = f6e.w((Context) this.b);
        long nanoTime = System.nanoTime();
        mgf mgf = new mgf("Включить single-core mode");
        if (w) {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            j4b.b(spannableStringBuilder, "включено‼️", new ForegroundColorSpan(-65536));
            Unit unit = Unit.INSTANCE;
            spannedString = new SpannedString(spannableStringBuilder);
        } else {
            SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder();
            j4b.b(spannableStringBuilder2, "выключено", new ForegroundColorSpan(Color.parseColor("#4CAF50")));
            Unit unit2 = Unit.INSTANCE;
            spannedString = new SpannedString(spannableStringBuilder2);
        }
        return CollectionsKt.listOf(new o94(nanoTime, mgf, 0, new mgf(spannedString), new n94(w), 4));
    }

    public rd(q4 q4Var) {
        this.a = 2;
        this.o = q4Var;
        this.b = (Context) q4Var.g(Context.class);
        this.c = f6e.a(d());
    }
}
