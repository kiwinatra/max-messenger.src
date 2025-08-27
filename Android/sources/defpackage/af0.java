package defpackage;

import java.io.Serializable;

/* renamed from: af0  reason: default package */
public final class af0 implements Serializable {
    public final /* synthetic */ int a = 1;
    public String b;
    public long c;
    public String o;

    public /* synthetic */ af0() {
    }

    public final String toString() {
        switch (this.a) {
            case 0:
                StringBuilder sb = new StringBuilder("Background{id=");
                sb.append(this.c);
                sb.append(", url=");
                sb.append(this.b);
                sb.append(", color=");
                return wj6.n(sb, this.o, "}");
            default:
                StringBuilder sb2 = new StringBuilder("{conversationId='");
                sb2.append(this.b);
                sb2.append("', startedAt=");
                sb2.append(this.c);
                sb2.append(", joinLink=");
                return wj6.n(sb2, this.o, "}");
        }
    }

    public af0(long j, String str, String str2) {
        this.c = j;
        this.b = str;
        this.o = str2;
    }
}
