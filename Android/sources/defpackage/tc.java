package defpackage;

import androidx.fragment.app.a;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import org.apache.http.util.LangUtils;
import ru.ok.tamtam.nano.Protos;

/* renamed from: tc  reason: default package */
public final class tc extends Lambda implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ a b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public /* synthetic */ tc(int i, a aVar) {
        super(0);
        this.a = i;
        this.b = aVar;
    }

    public final Object invoke() {
        switch (this.a) {
            case 0:
                return this.b.E2().getViewModelStore();
            case 1:
                return this.b.E2().getDefaultViewModelCreationExtras();
            case 2:
                return this.b;
            case 3:
                return this.b;
            case 4:
                return this.b;
            case 5:
                return this.b;
            case 6:
                return this.b;
            case 7:
                return this.b;
            case 8:
                return this.b;
            case 9:
                return this.b.E2().getViewModelStore();
            case 10:
                return this.b.E2().getDefaultViewModelCreationExtras();
            case 11:
                return this.b.E2().getViewModelStore();
            case 12:
                return this.b.E2().getDefaultViewModelCreationExtras();
            case 13:
                return this.b.E2().getDefaultViewModelProviderFactory();
            case Protos.Attaches.Attach.LOCATION:
                return this.b;
            case Protos.Attaches.Attach.DAILY_MEDIA:
                return this.b.E2().getViewModelStore();
            case 16:
                return this.b.E2().getDefaultViewModelCreationExtras();
            case LangUtils.HASH_SEED:
                return this.b.E2().getDefaultViewModelProviderFactory();
            case 18:
                return this.b.E2().getViewModelStore();
            case 19:
                return this.b.E2().getDefaultViewModelCreationExtras();
            case 20:
                return this.b.E2().getDefaultViewModelProviderFactory();
            case 21:
                return this.b;
            default:
                return this.b;
        }
    }
}
