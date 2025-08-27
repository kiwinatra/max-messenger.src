package defpackage;

import kotlin.properties.ObservableProperty;
import kotlin.reflect.KProperty;
import ru.ok.tamtam.stickers.view.RecyclerAutofitGridView;

/* renamed from: mae  reason: default package */
public final class mae extends ObservableProperty {
    public final /* synthetic */ int a;
    public final /* synthetic */ nae b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public /* synthetic */ mae(nae nae, int i) {
        super(null);
        this.a = i;
        this.b = nae;
    }

    public final void afterChange(KProperty kProperty, Object obj, Object obj2) {
        switch (this.a) {
            case 0:
                xoe xoe = (xoe) obj2;
                xoe xoe2 = (xoe) obj;
                nae nae = this.b;
                xoe theme = nae.getTheme();
                if (theme != null) {
                    nae.setBackgroundColor(theme.a);
                    nae.b.K(theme);
                    return;
                }
                return;
            case 1:
                ise ise = (ise) obj2;
                ise ise2 = (ise) obj;
                nae nae2 = this.b;
                ise stickers = nae2.getStickers();
                if (stickers != null) {
                    boolean I = ld9.I(nae2.getContext());
                    RecyclerAutofitGridView recyclerAutofitGridView = nae2.a;
                    r3 r3Var = stickers.a;
                    if (I) {
                        recyclerAutofitGridView.setDefaultColumns(r3Var.b);
                    } else {
                        recyclerAutofitGridView.setDefaultColumns(r3Var.c);
                    }
                }
                nae2.requestLayout();
                return;
            default:
                gb8 gb8 = (gb8) obj2;
                gb8 gb82 = (gb8) obj;
                nae nae3 = this.b;
                gb8 lottieLayer = nae3.getLottieLayer();
                gv gvVar = nae3.b;
                if (lottieLayer != gvVar.X) {
                    gvVar.X = lottieLayer;
                    if (gvVar.j() > 0) {
                        gvVar.I();
                        return;
                    }
                    return;
                }
                return;
        }
    }
}
