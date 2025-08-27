package defpackage;

import kotlin.jvm.functions.Function0;
import one.me.common.drawable.SavedMessagesIconDrawable;
import org.apache.http.util.LangUtils;
import ru.ok.tamtam.nano.Protos;

/* renamed from: zfa  reason: default package */
public final class zfa implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Function0 b;

    public /* synthetic */ zfa(int i, Function0 function0) {
        this.a = i;
        this.b = function0;
    }

    public final Object invoke() {
        switch (this.a) {
            case 0:
                return new pk7(25, (h49) this.b);
            case 1:
                return new pk7(26, (h49) this.b);
            case 2:
                return new pk7(27, (pna) this.b);
            case 3:
                return new pk7(28, (vra) this.b);
            case 4:
                return new pk7(29, (lgb) this.b);
            case 5:
                return new tib(0, (ifb) this.b);
            case 6:
                return new tib(1, (uib) this.b);
            case 7:
                return new tib(2, (lgb) this.b);
            case 8:
                return new tib(3, (lgb) this.b);
            case 9:
                return new tib(4, (lgb) this.b);
            case 10:
                return new tib(5, (lgb) this.b);
            case 11:
                return new tib(6, (kkb) this.b);
            case 12:
                return new tib(7, (ifb) this.b);
            case 13:
                return new tib(8, (vra) this.b);
            case Protos.Attaches.Attach.LOCATION:
                return new tib(9, (uyb) this.b);
            case Protos.Attaches.Attach.DAILY_MEDIA:
                return new tib(10, (vra) this.b);
            case 16:
                return new tib(11, (bg2) this.b);
            case LangUtils.HASH_SEED:
                return new tib(12, (bg2) this.b);
            case 18:
                return new tib(13, (bg2) this.b);
            case 19:
                return new tib(14, (swc) this.b);
            case 20:
                return new tib(15, (vra) this.b);
            case 21:
                return new tib(16, (red) this.b);
            case 22:
                return new tib(17, (red) this.b);
            case 23:
                return new tib(18, (red) this.b);
            case SavedMessagesIconDrawable.NORMAL_ICON_SIZE:
                return new tib(19, (red) this.b);
            case 25:
                return new tib(20, (red) this.b);
            case 26:
                return new tib(21, (j3e) this.b);
            case 27:
                return new tib(22, (red) this.b);
            case 28:
                return new tib(23, (red) this.b);
            default:
                return new tib(24, (dle) this.b);
        }
    }
}
