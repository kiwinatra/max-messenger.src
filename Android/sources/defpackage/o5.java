package defpackage;

import android.content.Context;
import android.content.Intent;
import androidx.appcompat.widget.Toolbar;
import java.util.WeakHashMap;

/* renamed from: o5  reason: default package */
public abstract class o5 extends m5 {
    public static void U(int i, long j, Context context, boolean z) {
        Intent intent = new Intent(context, o5.class);
        intent.putExtra("ru.ok.tamtam.extra.CHAT_ID", j);
        intent.putExtra("ru.ok.tamtam.extra.SUBMIT_TEXT", i);
        intent.putExtra("ru.ok.tamtam.extra.DESCRIPTION_ONLY", z);
        context.startActivity(intent);
    }

    public b33 T(int i) {
        setContentView(i);
        obd obd = new obd(new fj((hn) this), (Toolbar) findViewById(lic.toolbar));
        obd.x = K0();
        b33 b33 = new b33(obd);
        Toolbar toolbar = (Toolbar) b33.c;
        if (toolbar != null) {
            nqd nqd = new nqd(29, b33);
            WeakHashMap weakHashMap = gag.a;
            v9g.u(toolbar, nqd);
        }
        return b33;
    }
}
