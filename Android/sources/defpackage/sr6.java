package defpackage;

import android.net.Uri;
import java.io.File;

/* renamed from: sr6  reason: default package */
public final class sr6 extends ol0 {
    public final ln5 j;
    public final l20 k;

    public sr6(ln5 ln5, l20 l20) {
        super(-1, -1, 0, 0, 0, (zy) null, (String) null, false, true);
        this.j = ln5;
        this.k = l20;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || sr6.class != obj.getClass() || !super.equals(obj)) {
            return false;
        }
        sr6 sr6 = (sr6) obj;
        return this.j.equals(sr6.j) && this.k.equals(sr6.k);
    }

    public final int f() {
        return 3;
    }

    public final int getHeight() {
        return this.k.b.o;
    }

    public final int getWidth() {
        return this.k.b.c;
    }

    public final Uri h() {
        l20 l20 = this.k;
        if (!cvg.A(l20.r)) {
            return Uri.parse(l20.r);
        }
        File k2 = ((po5) this.j).k(l20.b.y);
        return k2.exists() ? Uri.fromFile(k2) : Uri.fromFile(new File(l20.r));
    }

    public final int hashCode() {
        int hashCode = this.j.hashCode();
        int hashCode2 = this.k.hashCode();
        return tr1.y(3) + ((hashCode2 + ((hashCode + (super.hashCode() * 31)) * 31)) * 31);
    }
}
