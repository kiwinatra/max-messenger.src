package defpackage;

import java.util.Locale;

/* renamed from: vh5  reason: default package */
public final /* synthetic */ class vh5 implements qk3 {
    public final /* synthetic */ int a;
    public final /* synthetic */ ai5 b;
    public final /* synthetic */ long c;

    public /* synthetic */ vh5(ai5 ai5, long j, int i) {
        this.a = i;
        this.b = ai5;
        this.c = j;
    }

    public final void accept(Object obj) {
        long j = this.c;
        ai5 ai5 = this.b;
        int i = this.a;
        Throwable th = (Throwable) obj;
        ai5.getClass();
        switch (i) {
            case 0:
                Locale locale = Locale.ENGLISH;
                z68.f("ai5", "onNotifUpdated: failed for id: " + j, th);
                ai5.j();
                return;
            default:
                Locale locale2 = Locale.ENGLISH;
                z68.f("ai5", wj6.m(new StringBuilder("onNotifAdded: failed to add sticker set "), j, " to cache"), th);
                ai5.j();
                return;
        }
    }
}
