package defpackage;

import android.view.View;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.reflect.KProperty;
import one.me.stickerssettings.StickersSettingsScreen;

/* renamed from: oue  reason: default package */
public final /* synthetic */ class oue implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ StickersSettingsScreen b;

    public /* synthetic */ oue(StickersSettingsScreen stickersSettingsScreen, int i) {
        this.a = i;
        this.b = stickersSettingsScreen;
    }

    public final Object invoke(Object obj) {
        switch (this.a) {
            case 0:
                View view = (View) obj;
                KProperty[] kPropertyArr = StickersSettingsScreen.w;
                this.b.getRouter().C();
                return Unit.INSTANCE;
            case 1:
                StickersSettingsScreen stickersSettingsScreen = this.b;
                KProperty[] kPropertyArr2 = StickersSettingsScreen.w;
                zue c0 = stickersSettingsScreen.c0();
                int p = ((pzc) obj).p();
                String name = zue.class.getName();
                a67 a67 = z68.b;
                if (a67 != null) {
                    c0.getClass();
                    if (a67.c()) {
                        w78 w78 = w78.o;
                        Long l = c0.Z;
                        Long l2 = c0.w0;
                        a67.d(w78, name, "Move finish. moved:" + l + ", target:" + l2, (Throwable) null);
                    }
                }
                Long l3 = c0.Z;
                Long l4 = c0.w0;
                if (l3 == null || l4 == null || c0.v0 == -1 || c0.v0 == p) {
                    c0.v0 = -1;
                    c0.Z = null;
                    c0.w0 = null;
                } else {
                    c0.v0 = -1;
                    c0.Z = null;
                    c0.w0 = null;
                    c0.x0.setValue(c0, zue.C0[0], ev0.u(c0.a, ((osa) c0.c).b(), f14.b, new xue(c0, l3, l4, (Continuation) null)));
                }
                return Unit.INSTANCE;
            case 2:
                wmd wmd = (wmd) obj;
                KProperty[] kPropertyArr3 = StickersSettingsScreen.w;
                zue c02 = this.b.c0();
                c02.getClass();
                boolean z = wmd instanceof umd;
                s85 s85 = c02.Y;
                if (z) {
                    nue nue = nue.b;
                    long j = ((umd) wmd).a;
                    nue.getClass();
                    a81.r(":stickers/set?set_id=" + j, s85);
                } else if (wmd instanceof vmd) {
                    xag.h(s85, ((vmd) wmd).b);
                }
                return Unit.INSTANCE;
            case 3:
                wmd wmd2 = (wmd) obj;
                KProperty[] kPropertyArr4 = StickersSettingsScreen.w;
                zue c03 = this.b.c0();
                c03.getClass();
                if (wmd2 instanceof umd) {
                    List createListBuilder = CollectionsKt.createListBuilder();
                    int i = m1b.k;
                    igf igf = new igf(n1b.n);
                    Integer valueOf = Integer.valueOf(cad.Z1);
                    int i2 = jya.G;
                    createListBuilder.add(new ow3(i, (ngf) igf, valueOf, Integer.valueOf(i2), 4));
                    createListBuilder.add(new ow3(m1b.l, (ngf) new igf(n1b.o), Integer.valueOf(lya.A), Integer.valueOf(i2), 4));
                    createListBuilder.add(new ow3(m1b.i, (ngf) new igf(n1b.f), Integer.valueOf(cad.v), Integer.valueOf(i2), 4));
                    createListBuilder.add(new ow3(m1b.j, (ngf) new igf(n1b.m), Integer.valueOf(cad.y), Integer.valueOf(jya.E), 4));
                    List build = CollectionsKt.build(createListBuilder);
                    c03.y0 = Long.valueOf(((umd) wmd2).a);
                    xag.h(c03.X, new r0e(build));
                }
                return Unit.INSTANCE;
            default:
                pzc pzc = (pzc) obj;
                KProperty[] kPropertyArr5 = StickersSettingsScreen.w;
                b0h.K(pzc.a, rw6.LONG_PRESS);
                yl7 yl7 = this.b.o;
                if (yl7 != null) {
                    yl7.t(pzc);
                }
                return Unit.INSTANCE;
        }
    }
}
