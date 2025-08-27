package defpackage;

import android.net.wifi.ScanResult;
import java.util.Comparator;
import kotlin.uuid.Uuid;

/* renamed from: baf  reason: default package */
public final /* synthetic */ class baf implements Comparator {
    public final /* synthetic */ int a;

    public /* synthetic */ baf(int i) {
        this.a = i;
    }

    public final int compare(Object obj, Object obj2) {
        switch (this.a) {
            case 0:
                return ((xdb) obj2).a().compareTo(((xdb) obj).a());
            case 1:
                return Integer.compare(((mpf) obj).w, ((mpf) obj2).w);
            case 2:
                return Uuid.LEXICAL_ORDER$lambda$2((Uuid) obj, (Uuid) obj2);
            case 3:
                return Integer.compare(((fmg) obj).a.b, ((fmg) obj2).a.b);
            case 4:
                return Integer.compare(((gmg) obj).a.b, ((gmg) obj2).a.b);
            case 5:
                return Long.compare(((dmg) obj).b, ((dmg) obj2).b);
            case 6:
                return Long.compare(((emg) obj).b, ((emg) obj2).b);
            default:
                return Integer.compare(((ScanResult) obj2).level, ((ScanResult) obj).level);
        }
    }
}
