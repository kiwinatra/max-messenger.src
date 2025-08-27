package defpackage;

import java.util.concurrent.CancellationException;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KProperty;
import one.me.stickerssearch.StickersSearchScreen;

/* renamed from: lte  reason: default package */
public final class lte implements mza {
    public final /* synthetic */ StickersSearchScreen a;

    public lte(StickersSearchScreen stickersSearchScreen) {
        this.a = stickersSearchScreen;
    }

    public final void C(CharSequence charSequence) {
        KProperty[] kPropertyArr = StickersSearchScreen.X;
        ute d0 = this.a.d0();
        if (!Intrinsics.areEqual((Object) charSequence, (Object) ((pte) d0.Y.get()).a)) {
            aje aje = d0.v0;
            String str = null;
            if (aje != null) {
                aje.b((CancellationException) null);
            }
            xme xme = d0.w;
            xme.m((Object) null, new kld(jld.a, ((kld) xme.getValue()).b));
            if (charSequence != null) {
                str = charSequence.toString();
            }
            d0.z.setValue(str);
        }
    }

    public final void n() {
        this.a.getRouter().C();
    }
}
