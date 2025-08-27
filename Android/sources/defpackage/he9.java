package defpackage;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/* renamed from: he9  reason: default package */
public final class he9 implements Serializable {
    public final long a;
    public final b89 b;
    public final String c;
    public final List o;

    public he9(String str, ArrayList arrayList, long j, b89 b89) {
        this.c = str;
        this.o = arrayList;
        this.a = j;
        this.b = b89;
    }

    public final String toString() {
        String G = cvg.G(this.c);
        int o2 = kv0.o(this.o);
        return "{, feedback='" + G + "', highlights=" + o2 + ", chatId='" + this.a + "', message=" + this.b + "}";
    }
}
