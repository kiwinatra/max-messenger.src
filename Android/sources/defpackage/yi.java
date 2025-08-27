package defpackage;

import android.content.SharedPreferences;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ThreadFactory;
import java.util.function.Function;
import kotlin.jvm.functions.Function1;
import one.me.rlottie.RLottieDrawable;
import org.apache.http.util.LangUtils;
import ru.ok.tamtam.nano.Protos;

/* renamed from: yi  reason: default package */
public final /* synthetic */ class yi implements Function {
    public final /* synthetic */ int a;
    public final /* synthetic */ Function1 b;

    public /* synthetic */ yi(int i, Function1 function1) {
        this.a = i;
        this.b = function1;
    }

    public final Object apply(Object obj) {
        switch (this.a) {
            case 0:
                return (RLottieDrawable) this.b.invoke(obj);
            case 1:
                return (tz9) this.b.invoke(obj);
            case 2:
                return (tz9) this.b.invoke(obj);
            case 3:
                return (tz9) this.b.invoke(obj);
            case 4:
                return (tz9) this.b.invoke(obj);
            case 5:
                return (tz9) this.b.invoke(obj);
            case 6:
                return (tz9) this.b.invoke(obj);
            case 7:
                return (tz9) this.b.invoke(obj);
            case 8:
                return (tz9) this.b.invoke(obj);
            case 9:
                return (pm7) this.b.invoke(obj);
            case 10:
                return (xz9) this.b.invoke(obj);
            case 11:
                return (ExecutorService) this.b.invoke(obj);
            case 12:
                return (cl) this.b.invoke(obj);
            case 13:
                return (ThreadFactory) this.b.invoke(obj);
            case Protos.Attaches.Attach.LOCATION:
                return (gsb) this.b.invoke(obj);
            case Protos.Attaches.Attach.DAILY_MEDIA:
                return (gsb) this.b.invoke(obj);
            case 16:
                return (tz9) this.b.invoke(obj);
            case LangUtils.HASH_SEED:
                return (SharedPreferences) this.b.invoke(obj);
            case 18:
                return (k2b) this.b.invoke(obj);
            default:
                return (Long) this.b.invoke(obj);
        }
    }
}
