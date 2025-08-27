package defpackage;

import kotlin.Lazy;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import org.apache.http.util.LangUtils;
import ru.ok.tamtam.nano.Protos;

/* renamed from: vc  reason: default package */
public final class vc extends Lambda implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Lazy b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public /* synthetic */ vc(int i, Lazy lazy) {
        super(0);
        this.a = i;
        this.b = lazy;
    }

    public final Object invoke() {
        switch (this.a) {
            case 0:
                return ((hbg) this.b.getValue()).getViewModelStore();
            case 1:
                hbg hbg = (hbg) this.b.getValue();
                tw6 tw6 = hbg instanceof tw6 ? (tw6) hbg : null;
                return tw6 != null ? tw6.getDefaultViewModelCreationExtras() : w34.b;
            case 2:
                return ((hbg) this.b.getValue()).getViewModelStore();
            case 3:
                hbg hbg2 = (hbg) this.b.getValue();
                tw6 tw62 = hbg2 instanceof tw6 ? (tw6) hbg2 : null;
                return tw62 != null ? tw62.getDefaultViewModelCreationExtras() : w34.b;
            case 4:
                return ((hbg) this.b.getValue()).getViewModelStore();
            case 5:
                hbg hbg3 = (hbg) this.b.getValue();
                tw6 tw63 = hbg3 instanceof tw6 ? (tw6) hbg3 : null;
                return tw63 != null ? tw63.getDefaultViewModelCreationExtras() : w34.b;
            case 6:
                return ((hbg) this.b.getValue()).getViewModelStore();
            case 7:
                hbg hbg4 = (hbg) this.b.getValue();
                tw6 tw64 = hbg4 instanceof tw6 ? (tw6) hbg4 : null;
                return tw64 != null ? tw64.getDefaultViewModelCreationExtras() : w34.b;
            case 8:
                return ((hbg) this.b.getValue()).getViewModelStore();
            case 9:
                hbg hbg5 = (hbg) this.b.getValue();
                tw6 tw65 = hbg5 instanceof tw6 ? (tw6) hbg5 : null;
                return tw65 != null ? tw65.getDefaultViewModelCreationExtras() : w34.b;
            case 10:
                return ((hbg) this.b.getValue()).getViewModelStore();
            case 11:
                hbg hbg6 = (hbg) this.b.getValue();
                tw6 tw66 = hbg6 instanceof tw6 ? (tw6) hbg6 : null;
                return tw66 != null ? tw66.getDefaultViewModelCreationExtras() : w34.b;
            case 12:
                return ((hbg) this.b.getValue()).getViewModelStore();
            case 13:
                hbg hbg7 = (hbg) this.b.getValue();
                tw6 tw67 = hbg7 instanceof tw6 ? (tw6) hbg7 : null;
                return tw67 != null ? tw67.getDefaultViewModelCreationExtras() : w34.b;
            case Protos.Attaches.Attach.LOCATION:
                return ((hbg) this.b.getValue()).getViewModelStore();
            case Protos.Attaches.Attach.DAILY_MEDIA:
                hbg hbg8 = (hbg) this.b.getValue();
                tw6 tw68 = hbg8 instanceof tw6 ? (tw6) hbg8 : null;
                return tw68 != null ? tw68.getDefaultViewModelCreationExtras() : w34.b;
            case 16:
                return ((hbg) this.b.getValue()).getViewModelStore();
            case LangUtils.HASH_SEED:
                hbg hbg9 = (hbg) this.b.getValue();
                tw6 tw69 = hbg9 instanceof tw6 ? (tw6) hbg9 : null;
                return tw69 != null ? tw69.getDefaultViewModelCreationExtras() : w34.b;
            case 18:
                return ((hbg) this.b.getValue()).getViewModelStore();
            case 19:
                hbg hbg10 = (hbg) this.b.getValue();
                tw6 tw610 = hbg10 instanceof tw6 ? (tw6) hbg10 : null;
                return tw610 != null ? tw610.getDefaultViewModelCreationExtras() : w34.b;
            case 20:
                return ((hbg) this.b.getValue()).getViewModelStore();
            case 21:
                hbg hbg11 = (hbg) this.b.getValue();
                tw6 tw611 = hbg11 instanceof tw6 ? (tw6) hbg11 : null;
                return tw611 != null ? tw611.getDefaultViewModelCreationExtras() : w34.b;
            case 22:
                return ((hbg) this.b.getValue()).getViewModelStore();
            default:
                hbg hbg12 = (hbg) this.b.getValue();
                tw6 tw612 = hbg12 instanceof tw6 ? (tw6) hbg12 : null;
                return tw612 != null ? tw612.getDefaultViewModelCreationExtras() : w34.b;
        }
    }
}
