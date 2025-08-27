package defpackage;

import android.app.Activity;
import android.content.Intent;

/* renamed from: z4  reason: default package */
public abstract class z4 extends m5 implements i2e, kmf {
    public static void T(Activity activity, int i, long j, long j2) {
        Intent intent = new Intent(activity, z4.class);
        intent.putExtra("ru.ok.tamtam.extra.CONTACT_ID", j);
        intent.putExtra("ru.ok.tamtam.extra.CHAT_ID", j2);
        activity.startActivityForResult(intent, i);
    }
}
