package defpackage;

import java.util.ArrayList;
import java.util.List;

/* renamed from: m20  reason: default package */
public final class m20 {
    public List a;
    public zf7 b;
    public i2d c;

    public final void a(l20 l20) {
        if (this.a == null) {
            this.a = new ArrayList();
        }
        this.a.add(l20);
    }

    public final int b() {
        List list = this.a;
        if (list != null) {
            return list.size();
        }
        return 0;
    }

    public final w28 c() {
        if (this.a == null) {
            this.a = new ArrayList();
        }
        return new w28(this);
    }

    public final l20 d(int i) {
        if (i >= 0 && i < b()) {
            return (l20) this.a.get(i);
        }
        throw new IllegalArgumentException("index < 0 or index >= attaches.size()");
    }

    public final void e(int i, l20 l20) {
        if (this.a == null) {
            this.a = new ArrayList();
        }
        if (i < 0 || i >= b()) {
            throw new IllegalArgumentException("index < 0 or index >= attaches.size()");
        }
        this.a.set(i, l20);
    }
}
