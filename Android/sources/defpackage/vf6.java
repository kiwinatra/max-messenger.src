package defpackage;

import android.content.Intent;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.List;
import ru.ok.messages.settings.FrgAppearanceSettings;
import ru.ok.messages.settings.view.ThemePreviewView;

/* renamed from: vf6  reason: default package */
public final /* synthetic */ class vf6 implements x6 {
    public final /* synthetic */ int a;
    public final /* synthetic */ FrgAppearanceSettings b;

    public /* synthetic */ vf6(FrgAppearanceSettings frgAppearanceSettings, int i) {
        this.a = i;
        this.b = frgAppearanceSettings;
    }

    public final void run() {
        FrgAppearanceSettings frgAppearanceSettings = this.b;
        switch (this.a) {
            case 0:
                frgAppearanceSettings.getClass();
                pl6 pl6 = new pl6(true, false, false, false, false, (List) null, false, 1008);
                int i = ik6.z0;
                Intent intent = new Intent(frgAppearanceSettings.O1(), ik6.class);
                intent.putExtra("GalleryActivity:mode", pl6);
                frgAppearanceSettings.S2(intent, 10400, (Bundle) null);
                return;
            case 1:
                if (frgAppearanceSettings.G1) {
                    ThemePreviewView themePreviewView = frgAppearanceSettings.C1;
                    themePreviewView.a(themePreviewView.getMeasuredWidth());
                } else {
                    frgAppearanceSettings.C1.a(0);
                }
                boolean z = !frgAppearanceSettings.G1;
                frgAppearanceSettings.G1 = z;
                if (z) {
                    frgAppearanceSettings.E1.setImageResource(nad.Z);
                    return;
                } else {
                    frgAppearanceSettings.E1.setImageResource(nad.F0);
                    return;
                }
            default:
                if (frgAppearanceSettings.o1) {
                    ArrayList arrayList = frgAppearanceSettings.P1;
                    arrayList.clear();
                    arrayList.addAll(frgAppearanceSettings.j3());
                    frgAppearanceSettings.K1.m();
                    frgAppearanceSettings.o3();
                    return;
                }
                return;
        }
    }
}
