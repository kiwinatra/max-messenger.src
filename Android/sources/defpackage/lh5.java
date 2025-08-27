package defpackage;

import java.util.Locale;

/* renamed from: lh5  reason: default package */
public final /* synthetic */ class lh5 implements zi6, qk3 {
    public final /* synthetic */ int a;
    public final /* synthetic */ long b;
    public final /* synthetic */ boolean c;

    public /* synthetic */ lh5(int i, long j, boolean z) {
        this.a = i;
        this.b = j;
        this.c = z;
    }

    public void accept(Object obj) {
        boolean z = this.c;
        long j = this.b;
        Throwable th = (Throwable) obj;
        switch (this.a) {
            case 2:
                Locale locale = Locale.ENGLISH;
                z68.f("ai5", "markAsFavorite: failed for setId=" + j + " favorite=" + z, th);
                return;
            default:
                Locale locale2 = Locale.ENGLISH;
                z68.f("vi5", "markAsFavorite: failed for stickerId=" + j + " favorite=" + z, th);
                return;
        }
    }

    public Object apply(Object obj) {
        switch (this.a) {
            case 0:
                return new qa3(1, new mh5((xi5) obj, this.b, this.c, 0));
            case 1:
                return new na3(4, ((fi5) obj).a(), new lh5(3, this.b, this.c));
            default:
                return new qa3(1, new mh5((oi5) obj, this.b, this.c, 1));
        }
    }
}
