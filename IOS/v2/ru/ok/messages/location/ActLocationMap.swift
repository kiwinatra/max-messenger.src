package ru.ok.messages.location;

import android.content.Intent;
import android.os.Bundle;
import androidx.fragment.app.a;

public class ActLocationMap extends m5 implements th6 {
    public static final /* synthetic */ int z0 = 0;

    public static void T(a aVar, long j, long j2, long j3, s58 s58, boolean z, long j4, boolean z2, String str) {
        Intent intent = new Intent(aVar.O1(), ActLocationMap.class);
        intent.putExtra("ru.ok.tamtam.extra.CHAT_ID", j);
        intent.putExtra("ru.ok.tamtam.extra.MESSAGE_ID", j2);
        intent.putExtra("ru.ok.tamtam.extra.CONTACT_ID", j3);
        intent.putExtra("ru.ok.tamtam.extra.LOCATION", s58);
        intent.putExtra("ru.ok.tamtam.extra.ZOOM", 14.0f);
        intent.putExtra("ru.ok.tamtam.extra.LIVE", z);
        intent.putExtra("ru.ok.tamtam.extra.DATE", j4);
        intent.putExtra("ru.ok.tamtam.extra.ACTIVE", z2);
        intent.putExtra("ru.ok.tamtam.extra.DEVICE_ID", str);
        aVar.R2(intent, (Bundle) null);
    }

    public final String E() {
        return null;
    }

    public final void H(int i, int i2, Intent intent) {
        a E = v().E("ru.ok.messages.location.FrgLocationMap");
        if (E instanceof FrgLocationMap) {
            ((FrgLocationMap) E).b3(i, i2, intent);
        }
    }

    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(ujc.act_single_fragment);
        L(this.X.M);
        if (bundle == null) {
            Intent intent = getIntent();
            long longExtra = intent.getLongExtra("ru.ok.tamtam.extra.CHAT_ID", 0);
            long longExtra2 = intent.getLongExtra("ru.ok.tamtam.extra.MESSAGE_ID", 0);
            long longExtra3 = intent.getLongExtra("ru.ok.tamtam.extra.CONTACT_ID", 0);
            s58 s58 = (s58) intent.getSerializableExtra("ru.ok.tamtam.extra.LOCATION");
            if (s58 == null) {
                s58 = s58.x;
            }
            float floatExtra = intent.getFloatExtra("ru.ok.tamtam.extra.ZOOM", 14.0f);
            boolean booleanExtra = intent.getBooleanExtra("ru.ok.tamtam.extra.LIVE", false);
            float f = floatExtra;
            long longExtra4 = intent.getLongExtra("ru.ok.tamtam.extra.DATE", 0);
            long longExtra5 = intent.getLongExtra("map:REQUEST_MESSAGE_ID", 0);
            boolean booleanExtra2 = intent.getBooleanExtra("ru.ok.tamtam.extra.ACTIVE", false);
            String stringExtra = intent.getStringExtra("ru.ok.tamtam.extra.DEVICE_ID");
            boolean booleanExtra3 = intent.getBooleanExtra("map:DISABLE_LIVE", false);
            boolean booleanExtra4 = intent.getBooleanExtra("map:REGULAR_SENDING", true);
            FrgLocationMap frgLocationMap = new FrgLocationMap();
            Bundle bundle2 = new Bundle();
            bundle2.putLong("ru.ok.tamtam.extra.CHAT_ID", longExtra);
            bundle2.putLong("ru.ok.tamtam.extra.MESSAGE_ID", longExtra2);
            bundle2.putLong("ru.ok.tamtam.extra.CONTACT_ID", longExtra3);
            bundle2.putSerializable("ru.ok.tamtam.extra.LOCATION", s58);
            bundle2.putFloat("ru.ok.tamtam.extra.ZOOM", f);
            bundle2.putBoolean("ru.ok.tamtam.extra.LIVE", booleanExtra);
            bundle2.putLong("ru.ok.tamtam.extra.DATE", longExtra4);
            bundle2.putLong("ru.ok.tamtam.extra.REQUEST_MESSAGE_ID", longExtra5);
            bundle2.putBoolean("ru.ok.tamtam.extra.ACTIVE", booleanExtra2);
            bundle2.putString("ru.ok.tamtam.extra.DEVICE_ID", stringExtra);
            bundle2.putBoolean("ru.ok.tamtam.extra.DISABLE_LIVE", booleanExtra3);
            bundle2.putBoolean("ru.ok.tamtam.extra.REGULAR_SENDING", booleanExtra4);
            frgLocationMap.L2(bundle2);
            b59.c(v(), lic.act_single_fragment__container, frgLocationMap, "ru.ok.messages.location.FrgLocationMap");
        }
    }

    public final void q0() {
        a E = v().E("ru.ok.messages.location.FrgLocationMap");
        if (E instanceof FrgLocationMap) {
            ((FrgLocationMap) E).getClass();
        }
    }

    public final void r() {
        a E = v().E("ru.ok.messages.location.FrgLocationMap");
        if (E instanceof FrgLocationMap) {
            ((FrgLocationMap) E).r();
        }
    }

    public final void x0() {
        a E = v().E("ru.ok.messages.location.FrgLocationMap");
        if (E instanceof FrgLocationMap) {
            ((FrgLocationMap) E).getClass();
        }
    }
}
