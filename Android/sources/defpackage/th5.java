package defpackage;

import java.util.List;
import java.util.Locale;

/* renamed from: th5  reason: default package */
public final /* synthetic */ class th5 implements qk3 {
    public final /* synthetic */ int a;
    public final /* synthetic */ ai5 b;
    public final /* synthetic */ List c;

    public /* synthetic */ th5(ai5 ai5, List list, int i) {
        this.a = i;
        this.b = ai5;
        this.c = list;
    }

    public final void accept(Object obj) {
        List list = this.c;
        ai5 ai5 = this.b;
        int i = this.a;
        Throwable th = (Throwable) obj;
        ai5.getClass();
        switch (i) {
            case 0:
                z68.f("ai5", String.format(Locale.ENGLISH, "onNotifRemoved: failed to remove sticker sets %s from cache", new Object[]{list}), th);
                ai5.j();
                return;
            default:
                z68.f("ai5", String.format(Locale.ENGLISH, "onListUpdated: failed to store sticker sets=%s", new Object[]{list}), th);
                ai5.j();
                return;
        }
    }
}
