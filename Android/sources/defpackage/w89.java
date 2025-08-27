package defpackage;

import android.graphics.drawable.Drawable;
import android.text.TextPaint;
import kotlin.jvm.functions.Function0;
import org.apache.http.util.LangUtils;
import ru.ok.tamtam.nano.Protos;

/* renamed from: w89  reason: default package */
public final /* synthetic */ class w89 implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ z89 b;

    public /* synthetic */ w89(z89 z89, int i) {
        this.a = i;
        this.b = z89;
    }

    public final Object invoke() {
        switch (this.a) {
            case 0:
                return (uy4) ((rta) this.b.g.getValue()).a.getValue();
            case 1:
                Drawable b2 = ew3.b(this.b.a, bwa.h);
                if (b2 != null) {
                    return b2;
                }
                throw new IllegalArgumentException("Required value was null.".toString());
            case 2:
                TextPaint textPaint = new TextPaint();
                ogf ogf = tr2.j;
                z89 z89 = this.b;
                ogf.a(textPaint, z89.a.getResources().getDisplayMetrics(), (uy4) z89.h.getValue());
                return textPaint;
            case 3:
                Drawable b3 = ew3.b(this.b.a, bwa.f);
                if (b3 != null) {
                    return b3;
                }
                throw new IllegalArgumentException("Required value was null.".toString());
            case 4:
                Drawable b4 = ew3.b(this.b.a, bwa.e);
                if (b4 != null) {
                    return b4;
                }
                throw new IllegalArgumentException("Required value was null.".toString());
            case 5:
                TextPaint textPaint2 = new TextPaint();
                ogf ogf2 = tr2.f;
                z89 z892 = this.b;
                ogf2.a(textPaint2, z892.a.getResources().getDisplayMetrics(), (uy4) z892.h.getValue());
                return textPaint2;
            case 6:
                TextPaint textPaint3 = new TextPaint();
                ogf ogf3 = tr2.g;
                z89 z893 = this.b;
                ogf3.a(textPaint3, z893.a.getResources().getDisplayMetrics(), (uy4) z893.h.getValue());
                return textPaint3;
            case 7:
                TextPaint textPaint4 = new TextPaint();
                ogf ogf4 = tr2.c;
                z89 z894 = this.b;
                ogf4.a(textPaint4, z894.a.getResources().getDisplayMetrics(), (uy4) z894.h.getValue());
                return textPaint4;
            case 8:
                TextPaint textPaint5 = new TextPaint();
                ogf ogf5 = tr2.i;
                z89 z895 = this.b;
                ogf5.a(textPaint5, z895.a.getResources().getDisplayMetrics(), (uy4) z895.h.getValue());
                return textPaint5;
            case 9:
                return tr1.j(this.b.a.getString(ewa.y0), ":");
            case 10:
                return this.b.a.getString(ewa.z0);
            case 11:
                return this.b.a.getString(ewa.A0);
            case 12:
                return this.b.a.getString(ewa.w0);
            case 13:
                return this.b.a.getString(ewa.x0);
            case Protos.Attaches.Attach.LOCATION:
                return this.b.a.getString(ewa.v0);
            case Protos.Attaches.Attach.DAILY_MEDIA:
                Drawable b5 = ew3.b(this.b.a, cad.R);
                if (b5 != null) {
                    return b5;
                }
                throw new IllegalArgumentException("Required value was null.".toString());
            case 16:
                Drawable b6 = ew3.b(this.b.a, cad.q1);
                if (b6 != null) {
                    return b6;
                }
                throw new IllegalArgumentException("Required value was null.".toString());
            case LangUtils.HASH_SEED:
                Drawable b7 = ew3.b(this.b.a, cad.z0);
                if (b7 != null) {
                    return b7;
                }
                throw new IllegalArgumentException("Required value was null.".toString());
            case 18:
                Drawable b8 = ew3.b(this.b.a, cad.r);
                if (b8 != null) {
                    return b8;
                }
                throw new IllegalArgumentException("Required value was null.".toString());
            case 19:
                Drawable b9 = ew3.b(this.b.a, cad.z1);
                if (b9 != null) {
                    return b9;
                }
                throw new IllegalArgumentException("Required value was null.".toString());
            case 20:
                Drawable b10 = ew3.b(this.b.a, cad.g0);
                if (b10 != null) {
                    return b10;
                }
                throw new IllegalArgumentException("Required value was null.".toString());
            default:
                Drawable b11 = ew3.b(this.b.a, cad.y1);
                if (b11 != null) {
                    return b11;
                }
                throw new IllegalArgumentException("Required value was null.".toString());
        }
    }
}
