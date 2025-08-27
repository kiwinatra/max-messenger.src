package androidx.work;

import android.content.Context;
import java.util.Collections;
import java.util.List;

public final class WorkManagerInitializer implements xf7 {
    public static final String a = h88.V("WrkMgrInitializer");

    public final List a() {
        return Collections.emptyList();
    }

    public final Object b(Context context) {
        h88.x().p(a, "Initializing WorkManager with default configuration.");
        dpg.e(context, new ve3(new g7a(1)));
        return dpg.d(context);
    }
}
