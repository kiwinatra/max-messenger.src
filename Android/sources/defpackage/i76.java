package defpackage;

import kotlin.jvm.functions.Function0;
import one.me.common.drawable.SavedMessagesIconDrawable;
import org.apache.http.util.LangUtils;
import ru.ok.tamtam.nano.Protos;

/* renamed from: i76  reason: default package */
public final class i76 implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Function0 b;

    public /* synthetic */ i76(int i, Function0 function0) {
        this.a = i;
        this.b = function0;
    }

    public final Object invoke() {
        switch (this.a) {
            case 0:
                return new hz5(4, (u75) this.b);
            case 1:
                return new qn2(26, (j76) this.b);
            case 2:
                return new qn2(27, (a46) this.b);
            case 3:
                return new qn2(28, (qg7) this.b);
            case 4:
                return new qn2(29, (a46) this.b);
            case 5:
                return new pk7(0, (ck7) this.b);
            case 6:
                return new pk7(1, (ck7) this.b);
            case 7:
                return new pk7(2, (u75) this.b);
            case 8:
                return new pk7(3, (ck7) this.b);
            case 9:
                return new pk7(4, (bg2) this.b);
            case 10:
                return new pk7(5, (ck7) this.b);
            case 11:
                return new pk7(6, (ck7) this.b);
            case 12:
                return new pk7(7, (ck7) this.b);
            case 13:
                return new pk7(8, (c28) this.b);
            case Protos.Attaches.Attach.LOCATION /*14*/:
                return new pk7(9, (ck7) this.b);
            case Protos.Attaches.Attach.DAILY_MEDIA /*15*/:
                return new pk7(10, (ck7) this.b);
            case 16:
                return new pk7(11, (jl8) this.b);
            case LangUtils.HASH_SEED /*17*/:
                return new pk7(12, (ck7) this.b);
            case 18:
                return new pk7(13, (ck7) this.b);
            case 19:
                return new pk7(14, (j35) this.b);
            case 20:
                return new pk7(15, (ck7) this.b);
            case 21:
                return new pk7(16, (yt8) this.b);
            case 22:
                return new pk7(17, (yt8) this.b);
            case 23:
                return new pk7(18, (z19) this.b);
            case SavedMessagesIconDrawable.NORMAL_ICON_SIZE /*24*/:
                return new pk7(19, (s49) this.b);
            case 25:
                return new pk7(20, (w99) this.b);
            case 26:
                return new pk7(21, (w11) this.b);
            case 27:
                return new pk7(22, (fn9) this.b);
            case 28:
                return new pk7(23, (h49) this.b);
            default:
                return new pk7(24, (a8a) this.b);
        }
    }
}
