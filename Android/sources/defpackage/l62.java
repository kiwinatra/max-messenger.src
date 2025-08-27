package defpackage;

import java.io.IOException;
import java.util.Arrays;
import java.util.List;
import java.util.Set;

/* renamed from: l62  reason: default package */
public final /* synthetic */ class l62 implements qk3 {
    public final /* synthetic */ r62 a;
    public final /* synthetic */ Set b;
    public final /* synthetic */ bd2 c;
    public final /* synthetic */ int o;
    public final /* synthetic */ long v;
    public final /* synthetic */ int w;
    public final /* synthetic */ long x;
    public final /* synthetic */ long y;

    public /* synthetic */ l62(r62 r62, Set set, bd2 bd2, int i, long j, int i2, long j2, long j3) {
        this.a = r62;
        this.b = set;
        this.c = bd2;
        this.o = i;
        this.v = j;
        this.w = i2;
        this.x = j2;
        this.y = j3;
    }

    public final void accept(Object obj) {
        w62 w62 = (w62) obj;
        r62 r62 = this.a;
        r62.getClass();
        Set set = this.b;
        y62 a2 = r62.M(w62, set).a();
        bd2 bd2 = this.c;
        a2.a = bd2.v;
        boolean isEmpty = bd2.d().isEmpty();
        int i = this.o;
        int i2 = this.w;
        long j = this.y;
        if (isEmpty) {
            long j2 = this.v;
            if (i > 0) {
                a2.b = j2;
            }
            if (i2 > 0) {
                a2.c = j2;
            }
        } else {
            a2.v = hd8.p((List) a2.v, bd2.d(), this.x, i, 0, i2, 0);
            hs7 hs7 = r62.s;
            if (i > 0 && bd2.d().size() < i) {
                z68.c("r62", "onChatMediaNew firstMessageUpdate", new Object[0]);
                ha9 k = ((fa9) hs7.get()).k(j, ((b89) bd2.d().get(0)).a);
                if (k != null) {
                    a2.b = k.b;
                } else {
                    z68.n("r62", (IOException) null, "onChatMediaNew can't find message to update firstMessage", Arrays.copyOf(new Object[0], 0));
                }
            }
            if (i2 > 0 && bd2.d().size() < i2) {
                z68.c("r62", "onChatMediaNew lastMessageUpdate", new Object[0]);
                ha9 k2 = ((fa9) hs7.get()).k(j, ((b89) bd2.d().get(bd2.d().size() - 1)).a);
                if (k2 != null) {
                    a2.c = k2.b;
                } else {
                    z68.n("r62", (IOException) null, "onChatMediaNew can't find message to update lastMessage", Arrays.copyOf(new Object[0], 0));
                }
            }
        }
        ((tz9) MapsKt__MapsKt.getOrPut(r62.F, Long.valueOf(j), new r52(0))).setValue(new os8(bd2.x, bd2.w, set, j));
        r62.l0(w62, set, a2.a());
    }
}
