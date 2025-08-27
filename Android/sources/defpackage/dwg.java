package defpackage;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Looper;
import android.os.Message;

/* renamed from: dwg  reason: default package */
public final class dwg extends ws9 {
    public final Context b;
    public final /* synthetic */ dt6 c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public dwg(dt6 dt6, Context context) {
        super(Looper.myLooper() == null ? Looper.getMainLooper() : Looper.myLooper(), 2);
        this.c = dt6;
        this.b = context.getApplicationContext();
    }

    public final void handleMessage(Message message) {
        boolean z = true;
        if (message.what == 1) {
            int i = et6.a;
            dt6 dt6 = this.c;
            Context context = this.b;
            int b2 = dt6.b(i, context);
            int i2 = ot6.e;
            if (!(b2 == 1 || b2 == 2 || b2 == 3 || b2 == 9)) {
                z = false;
            }
            if (z) {
                Intent a = dt6.a(b2, context, "n");
                dt6.f(context, b2, a == null ? null : PendingIntent.getActivity(context, 0, a, 201326592));
            }
        }
    }
}
