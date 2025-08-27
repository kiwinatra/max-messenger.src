package defpackage;

import java.io.File;

/* renamed from: yd4  reason: default package */
public final class yd4 {
    public final String a;
    public final ml5 b;
    public long c = -1;
    public long d = -1;

    public yd4(File file, String str) {
        str.getClass();
        this.a = str;
        this.b = new ml5(file);
    }

    public final long a() {
        if (this.d < 0) {
            this.d = this.b.a.lastModified();
        }
        return this.d;
    }
}
