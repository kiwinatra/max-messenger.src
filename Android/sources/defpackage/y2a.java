package defpackage;

import android.os.Bundle;
import ru.ok.messages.settings.locations.FrgLiveLocationSettings;
import ru.ok.messages.views.dialogs.FrgDlgStopLiveLocation;

/* renamed from: y2a  reason: default package */
public final /* synthetic */ class y2a implements tk3 {
    public final /* synthetic */ int a;
    public final /* synthetic */ mc2 b;

    public /* synthetic */ y2a(mc2 mc2, int i) {
        this.a = i;
        this.b = mc2;
    }

    public final void accept(Object obj) {
        mc2 mc2 = this.b;
        r0a r0a = (r0a) obj;
        switch (this.a) {
            case 0:
                r0a.getClass();
                z68.c("r0a", "Click on stop chatId = %d", Long.valueOf(mc2.a.a));
                FrgLiveLocationSettings frgLiveLocationSettings = r0a.Z;
                if (frgLiveLocationSettings != null) {
                    long j = mc2.a.a;
                    Bundle bundle = new Bundle();
                    FrgDlgStopLiveLocation frgDlgStopLiveLocation = new FrgDlgStopLiveLocation();
                    bundle.putLong("ru.ok.tamtam.extra.CHAT_ID", j);
                    frgDlgStopLiveLocation.L2(bundle);
                    frgDlgStopLiveLocation.d3(frgLiveLocationSettings);
                    return;
                }
                return;
            default:
                r0a.getClass();
                z68.c("r0a", "Click on chatId = %d", Long.valueOf(mc2.a.a));
                FrgLiveLocationSettings frgLiveLocationSettings2 = r0a.Z;
                if (frgLiveLocationSettings2 != null) {
                    long j2 = mc2.a.a;
                    ec2 ec2 = mc2.b;
                    long j3 = ec2.d;
                    t5 a2 = t5.a(j2);
                    a2.d = j3;
                    a2.f = ec2.c;
                    a2.e = true;
                    q5.T(frgLiveLocationSettings2.X2(), a2);
                    return;
                }
                return;
        }
    }
}
