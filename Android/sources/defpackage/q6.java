package defpackage;

import android.app.Activity;
import android.content.Intent;
import java.util.Collections;

/* renamed from: q6  reason: default package */
public abstract class q6 extends m5 {
    public static void T(Activity activity, long j) {
        if (j == ym.v.c().a.s()) {
            ((uta) ((qra) ym.e()).o()).c(new Exception("open self profile as contact profile"), true);
        }
        Intent intent = new Intent(activity, q6.class);
        intent.putExtra("ru.ok.tamtam.extra.PROFILE_TYPE", "CONTACT");
        intent.putExtra("ru.ok.tamtam.extra.CONTACT_ID", j);
        intent.putExtra("ru.ok.tamtam.extra.PRIVACY_WARNING", false);
        intent.putExtra("gallery_mode", new pl6(false, true, true, true, false, Collections.emptyList(), false, 768));
        activity.startActivityForResult(intent, 20);
    }
}
