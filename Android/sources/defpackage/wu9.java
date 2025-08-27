package defpackage;

import android.net.Uri;
import java.util.List;

/* renamed from: wu9  reason: default package */
public class wu9 extends ol0 {
    public final List j;

    public wu9(String str, List list, long j2, long j3, long j4, zy zyVar, boolean z, int i, int i2) {
        super(i, i2, j3, j2, j4, zyVar, str, false, z);
        this.j = list;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass() || !super.equals(obj)) {
            return false;
        }
        return this.j.equals(((wu9) obj).j);
    }

    public final int f() {
        return 2;
    }

    public final int getHeight() {
        List list = this.j;
        if (list.isEmpty()) {
            return 0;
        }
        return ((uu9) list.get(0)).c;
    }

    public final int getWidth() {
        List list = this.j;
        if (list.isEmpty()) {
            return 0;
        }
        return ((uu9) list.get(0)).b;
    }

    public final Uri h() {
        return Uri.parse(((uu9) this.j.get(0)).a);
    }

    public int hashCode() {
        return this.j.hashCode() + (super.hashCode() * 31);
    }

    public wu9(long j2, long j3, List list, boolean z) {
        this((String) null, list, j2, j3, 0, (zy) null, z, -1, -1);
    }
}
