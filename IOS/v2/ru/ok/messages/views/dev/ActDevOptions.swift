package ru.ok.messages.views.dev;

import android.os.Bundle;
import androidx.appcompat.widget.Toolbar;

public class ActDevOptions extends m5 {
    public static final /* synthetic */ int z0 = 0;

    public final String E() {
        return null;
    }

    public final void J() {
    }

    public final scf K0() {
        return vi4.f0;
    }

    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(ujc.act_dev_prefs);
        obd obd = new obd(new fj((hn) this), (Toolbar) findViewById(lic.toolbar));
        obd.x = vi4.f0;
        b33 b33 = new b33(obd);
        b33.k(rmc.act_dev_prefs__title);
        L(getResources().getColor(lad.s));
        b33.g(nad.u);
        b33.i(new x4(3, (Object) this));
        if (bundle == null) {
            b59.c(v(), lic.act_dev_prefs__container, new FrgPrefs(), "ru.ok.messages.views.dev.FrgPrefs");
        }
    }
}
