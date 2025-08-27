package defpackage;

import android.content.Context;
import android.os.Build;
import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;

/* renamed from: ug0  reason: default package */
public final class ug0 extends e68 {
    public final /* synthetic */ int e;
    public final jtb f;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ug0(lt6 lt6, c68 c68, Context context, jtb jtb, int i) {
        super(lt6, c68, context);
        this.e = i;
        this.f = jtb;
    }

    public final y58 a() {
        jtb jtb = this.f;
        switch (this.e) {
            case 0:
                long max = Math.max(1000, TimeUnit.SECONDS.toMillis((long) ((ltb) jtb).b.q()) / 4);
                long max2 = Math.max(1000, max / 6);
                y58 y58 = new y58();
                String str = Build.BRAND;
                Pattern pattern = hhf.a;
                if (!str.regionMatches(true, 0, "huawei", 0, 6)) {
                    str.regionMatches(true, 0, "honor", 0, 5);
                }
                y58.b = 3;
                y58.c = Long.valueOf(max);
                y58.d = Long.valueOf(max2);
                return new y58(y58);
            default:
                long max3 = Math.max(1000, TimeUnit.SECONDS.toMillis((long) ((ltb) jtb).b.q()) / 6);
                y58 y582 = new y58();
                y582.b = 1;
                y582.d = Long.valueOf(max3);
                return new y58(y582);
        }
    }
}
