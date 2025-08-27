package defpackage;

import java.util.Locale;

/* renamed from: ri5  reason: default package */
public final /* synthetic */ class ri5 implements qk3 {
    public final /* synthetic */ int a;
    public final /* synthetic */ vi5 b;
    public final /* synthetic */ long c;

    public /* synthetic */ ri5(vi5 vi5, long j, int i) {
        this.a = i;
        this.b = vi5;
        this.c = j;
    }

    public final void accept(Object obj) {
        long j = this.c;
        vi5 vi5 = this.b;
        int i = this.a;
        Throwable th = (Throwable) obj;
        vi5.getClass();
        switch (i) {
            case 0:
                Locale locale = Locale.ENGLISH;
                z68.f("vi5", wj6.m(new StringBuilder("onNotifAdded: failed to add sticker "), j, " to cache"), th);
                vi5.d();
                return;
            default:
                Locale locale2 = Locale.ENGLISH;
                z68.f("vi5", "onNotifUpdated: failed for id: " + j, th);
                vi5.d();
                return;
        }
    }
}
