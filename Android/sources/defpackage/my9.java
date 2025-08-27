package defpackage;

import kotlin.Unit;
import kotlin.coroutines.Continuation;

/* renamed from: my9  reason: default package */
public final class my9 implements ds5 {
    public final /* synthetic */ long a;
    public final /* synthetic */ String b;
    public final /* synthetic */ String c;
    public final /* synthetic */ xy9 o;
    public final /* synthetic */ long v;

    public my9(long j, String str, String str2, xy9 xy9, long j2) {
        this.a = j;
        this.b = str;
        this.c = str2;
        this.o = xy9;
        this.v = j2;
    }

    public final Object a(Object obj, Continuation continuation) {
        if (((rr4) obj).b == 3) {
            int i = xy9.N;
            StringBuilder sb = new StringBuilder();
            long j = this.a;
            sb.append(j);
            sb.append(" | ");
            String str = this.b;
            sb.append(str);
            sb.append(" is loaded, ");
            sb.append(this.c);
            z68.c("xy9", sb.toString(), new Object[0]);
            xy9 xy9 = this.o;
            xy9.e.x(j, str, new p79(25));
            xy9.g.c(new twf(0, this.v, this.a));
        }
        return Unit.INSTANCE;
    }
}
