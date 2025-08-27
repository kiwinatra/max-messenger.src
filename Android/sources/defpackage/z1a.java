package defpackage;

import android.text.TextUtils;

/* renamed from: z1a  reason: default package */
public final /* synthetic */ class z1a implements tk3 {
    public final /* synthetic */ boolean a;
    public final /* synthetic */ boolean b = false;

    public /* synthetic */ z1a(boolean z) {
        this.a = z;
    }

    public final void accept(Object obj) {
        j4a j4a = (j4a) obj;
        j4a.w0.e(rre.c);
        if (this.a) {
            d6a d6a = j4a.Y;
            s3a s3a = j4a.o;
            if (s3a == null || TextUtils.isEmpty(s3a.e0())) {
                d6a.p(1);
            } else if (j4a.w0.getState() == rre.a) {
                d6a.p(1);
                ((nd) d6a.b).f("STICKERS_SEARCH_OPEN_FROM_CHAT", rae.e(1));
            } else if (j4a.w0.getState() == rre.b) {
                d6a.p(1);
                ((nd) d6a.b).f("STICKERS_SEARCH_OPEN_FROM_SUGGEST", rae.e(1));
            }
        } else {
            ((qra) ym.e()).c().f("STICKERS_STOREFRONT_OPEN", this.b ? "recents_promo" : "recents");
        }
    }
}
