package defpackage;

import android.content.Context;
import android.location.Geocoder;
import android.util.Size;
import java.util.Locale;
import kotlin.Lazy;
import kotlin.jvm.functions.Function0;

/* renamed from: ae  reason: default package */
public final /* synthetic */ class ae implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Lazy b;
    public final /* synthetic */ Context c;

    public /* synthetic */ ae(Context context, Lazy lazy) {
        this.a = 0;
        this.c = context;
        this.b = lazy;
    }

    public final Object invoke() {
        switch (this.a) {
            case 0:
                return new Geocoder(this.c, (Locale) this.b.getValue());
            case 1:
                ((hn4) this.b.getValue()).getClass();
                Size k = hn4.k(this.c);
                return Integer.valueOf(Math.max(k.getWidth(), k.getHeight()));
            case 2:
                ((hn4) this.b.getValue()).getClass();
                Size k2 = hn4.k(this.c);
                int min = (int) ((Math.min((double) k2.getWidth(), (double) k2.getHeight()) / ((double) 3.0f)) * ((double) 2.0f));
                if (min < 400) {
                    min = 400;
                }
                return Integer.valueOf(min);
            default:
                ((hn4) this.b.getValue()).getClass();
                Size k3 = hn4.k(this.c);
                return Integer.valueOf(Math.max(k3.getWidth(), k3.getHeight()));
        }
    }

    public /* synthetic */ ae(Lazy lazy, Context context, int i) {
        this.a = i;
        this.b = lazy;
        this.c = context;
    }
}
