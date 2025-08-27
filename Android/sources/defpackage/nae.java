package defpackage;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import kotlin.properties.Delegates;
import kotlin.reflect.KProperty;
import ru.ok.tamtam.stickers.view.RecyclerAutofitGridView;

/* renamed from: nae  reason: default package */
public final class nae extends FrameLayout implements fv {
    public static final /* synthetic */ KProperty[] y;
    public final RecyclerAutofitGridView a;
    public final gv b;
    public lae c;
    public final mae o = new mae(this, 0);
    public final mae v = new mae(this, 1);
    public p7b w;
    public final mae x = new mae(this, 2);

    static {
        Class<nae> cls = nae.class;
        y = new KProperty[]{rae.s(cls, "theme", "getTheme()Lru/ok/tamtam/stickers/keyboard/StickerKeyboardTheme;", 0), rae.s(cls, "stickers", "getStickers()Lru/ok/tamtam/stickers/Stickers;", 0), rae.s(cls, "lottieLayer", "getLottieLayer()Lru/ok/tamtam/stickers/lottie/LottieLayer;", 0)};
    }

    public nae(Context context) {
        super(context, (AttributeSet) null, 0, 0);
        Delegates delegates = Delegates.INSTANCE;
        View.inflate(context, ljc.page_view, this);
        setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        RecyclerAutofitGridView recyclerAutofitGridView = (RecyclerAutofitGridView) findViewById(tic.page_view__rv_content);
        this.a = recyclerAutofitGridView;
        lw9 lw9 = new lw9();
        gv gvVar = new gv(ew3.b(context, ifc.stickers_placeholder), ise.a().a.a, getTheme(), getLottieLayer());
        this.b = gvVar;
        lw9.E(gvVar);
        gvVar.J(this);
        recyclerAutofitGridView.setItemAnimator((yyc) null);
        recyclerAutofitGridView.setAdapter(lw9);
        recyclerAutofitGridView.m(new k61(10, this));
    }

    public final void D(qq7 qq7) {
        lae lae;
        p7b p7b = this.w;
        if (p7b != null && (lae = this.c) != null) {
            ((t26) lae).J(qq7, p7b);
        }
    }

    public final lae getListener() {
        return this.c;
    }

    public final gb8 getLottieLayer() {
        return (gb8) this.x.getValue(this, y[2]);
    }

    public final ise getStickers() {
        return (ise) this.v.getValue(this, y[1]);
    }

    public final xoe getTheme() {
        return (xoe) this.o.getValue(this, y[0]);
    }

    public final p7b getType() {
        return this.w;
    }

    public final void l(qq7 qq7) {
        lae lae;
        i7b i7b;
        bpe bpe;
        p7b p7b = this.w;
        if (p7b != null && (lae = this.c) != null && (i7b = (i7b) ((t26) lae).z) != null && (bpe = ((cpe) i7b).G0) != null) {
            bpe.D(qq7, p7b);
        }
    }

    public final void setListener(lae lae) {
        this.c = lae;
    }

    public final void setLottieLayer(gb8 gb8) {
        this.x.setValue(this, y[2], gb8);
    }

    public final void setStickers(ise ise) {
        this.v.setValue(this, y[1], ise);
    }

    public final void setTheme(xoe xoe) {
        this.o.setValue(this, y[0], xoe);
    }

    public final void setType(p7b p7b) {
        this.w = p7b;
    }

    public final void u() {
        lae lae = this.c;
        if (lae != null) {
            ((t26) lae).I();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0011, code lost:
        r2 = (defpackage.cpe) r2;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void w(defpackage.qq7 r3) {
        /*
            r2 = this;
            p7b r0 = r2.w
            if (r0 != 0) goto L_0x0005
            return
        L_0x0005:
            lae r2 = r2.c
            if (r2 == 0) goto L_0x001f
            t26 r2 = (defpackage.t26) r2
            java.lang.Object r2 = r2.z
            i7b r2 = (defpackage.i7b) r2
            if (r2 == 0) goto L_0x001f
            cpe r2 = (defpackage.cpe) r2
            bpe r1 = r2.G0
            if (r1 == 0) goto L_0x001f
            r1.r0(r3, r0)
            bpe r2 = r2.G0
            r2.f0()
        L_0x001f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.nae.w(qq7):void");
    }
}
