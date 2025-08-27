package defpackage;

import java.util.List;
import java.util.Locale;

/* renamed from: ui5  reason: default package */
public final /* synthetic */ class ui5 implements qk3 {
    public final /* synthetic */ int a;
    public final /* synthetic */ vi5 b;
    public final /* synthetic */ List c;

    public /* synthetic */ ui5(vi5 vi5, List list, int i) {
        this.a = i;
        this.b = vi5;
        this.c = list;
    }

    public final void accept(Object obj) {
        List list = this.c;
        vi5 vi5 = this.b;
        int i = this.a;
        Throwable th = (Throwable) obj;
        vi5.getClass();
        switch (i) {
            case 0:
                z68.f("vi5", String.format(Locale.ENGLISH, "onListUpdated: failed to store stickers %s", new Object[]{list}), th);
                vi5.d();
                return;
            default:
                z68.f("vi5", String.format(Locale.ENGLISH, "onNotifRemoved: failed to remove stickers %s from cache", new Object[]{list}), th);
                vi5.d();
                return;
        }
    }
}
