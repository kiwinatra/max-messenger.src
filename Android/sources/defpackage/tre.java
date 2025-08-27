package defpackage;

import java.util.ArrayList;

/* renamed from: tre  reason: default package */
public final class tre extends ibf {
    public ArrayList c;
    public long o;

    public tre(pf9 pf9) {
        super(pf9);
    }

    public final void c(pf9 pf9, String str) {
        str.getClass();
        if (str.equals("marker")) {
            this.o = pf9.x0();
        } else if (!str.equals("stickers")) {
            pf9.A();
        } else {
            int X = ryg.X(pf9);
            this.c = new ArrayList(X);
            for (int i = 0; i < X; i++) {
                this.c.add(Long.valueOf(pf9.x0()));
            }
        }
    }

    public final String toString() {
        ArrayList arrayList = this.c;
        long j = this.o;
        return "{stickerIds=" + arrayList + ", marker=" + j + "}";
    }
}
