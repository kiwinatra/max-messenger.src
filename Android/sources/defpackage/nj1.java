package defpackage;

import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import android.os.Looper;
import java.util.ArrayList;
import kotlin.jvm.functions.Function1;
import one.me.calls.impl.service.CallServiceImpl;

/* renamed from: nj1  reason: default package */
public final class nj1 {
    public static final String a(int i) {
        nj1 nj1 = CallServiceImpl.y;
        if (i == -1) {
            return "manifest";
        }
        ArrayList arrayList = new ArrayList();
        for (Number intValue : CallServiceImpl.X) {
            int intValue2 = intValue.intValue();
            if (!(intValue2 == -1 || (i & intValue2) == 0)) {
                arrayList.add(intValue2 != -1 ? intValue2 != 2 ? intValue2 != 32 ? intValue2 != 64 ? intValue2 != 128 ? a81.j(intValue2, "unknown(", ")") : "microphone" : "camera" : "mediaProjection" : "mediaPlayback" : "manifest");
            }
        }
        return CollectionsKt___CollectionsKt.joinToString$default(arrayList, "|", (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, (Function1) null, 62, (Object) null);
    }

    public static void b(Context context, Intent intent) {
        try {
            context.startService(intent);
        } catch (Throwable th) {
            String message = th.getMessage();
            z68.f("CallServiceTag", "cant start service... handle exception: " + message, th);
            c().post(new c(17, context, intent));
        }
    }

    public static Handler c() {
        if (CallServiceImpl.z == null) {
            CallServiceImpl.z = new Handler(Looper.getMainLooper());
        }
        Handler handler = CallServiceImpl.z;
        if (handler != null) {
            return handler;
        }
        throw new IllegalArgumentException("Required value was null.".toString());
    }

    public static void d(Context context) {
        Intent intent = new Intent(context, CallServiceImpl.class);
        mj1 mj1 = mj1.a;
        b(context, intent.putExtra("ACTION", 3));
    }
}
