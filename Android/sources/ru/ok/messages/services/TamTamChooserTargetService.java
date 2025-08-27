package ru.ok.messages.services;

import android.annotation.TargetApi;
import android.content.ComponentName;
import android.content.IntentFilter;
import android.graphics.drawable.Icon;
import android.os.Bundle;
import android.service.chooser.ChooserTarget;
import android.service.chooser.ChooserTargetService;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@TargetApi(23)
public class TamTamChooserTargetService extends ChooserTargetService {
    public final List onGetChooserTargets(ComponentName componentName, IntentFilter intentFilter) {
        ArrayList arrayList = new ArrayList();
        ComponentName componentName2 = new ComponentName(getPackageName(), o6.class.getCanonicalName());
        qra qra = (qra) ym.e();
        r62 l = qra.l();
        v00 v00 = r62.I;
        ArrayList H = l.H(r62.M, true, (osb) null);
        Collections.sort(H, v00);
        List unmodifiableList = Collections.unmodifiableList(H);
        int min = Math.min(unmodifiableList.size(), 4);
        for (int i = 0; i < min; i++) {
            a32 a32 = (a32) unmodifiableList.get(i);
            Bundle bundle = new Bundle();
            bundle.putLong("ru.ok.tamtam.extra.DIRECT_SHARE_CHAT_ID", a32.a);
            arrayList.add(new ChooserTarget(a32.r(), Icon.createWithBitmap(yd0.a(ym.v, qra.v(), qra.l(), (ce0) qra.getAccessor().g(ce0.class), (vk3) null, a32, (String) null, 200, qra.y().a.p(), ((kbf) qra.H()).a())), 1.0f - (((float) i) / 8.0f), componentName2, bundle));
        }
        return arrayList;
    }
}
