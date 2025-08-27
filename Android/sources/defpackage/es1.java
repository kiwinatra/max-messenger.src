package defpackage;

import android.hardware.camera2.TotalCaptureResult;
import android.util.Size;
import androidx.camera.video.internal.encoder.InvalidConfigException;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import ru.ok.tamtam.nano.Protos;

/* renamed from: es1  reason: default package */
public final /* synthetic */ class es1 implements bj6 {
    public final /* synthetic */ int a;

    public /* synthetic */ es1(int i) {
        this.a = i;
    }

    public final Object apply(Object obj) {
        ArrayList arrayList = null;
        switch (this.a) {
            case 0:
                Void voidR = (Void) obj;
                return Boolean.TRUE;
            case 1:
                TotalCaptureResult totalCaptureResult = (TotalCaptureResult) obj;
                return null;
            case 2:
                return Boolean.valueOf(((List) obj).contains(Boolean.TRUE));
            case 3:
                TotalCaptureResult totalCaptureResult2 = (TotalCaptureResult) obj;
                int i = qs1.g;
                return Boolean.FALSE;
            case 4:
                TotalCaptureResult totalCaptureResult3 = (TotalCaptureResult) obj;
                int i2 = ss1.h;
                return Boolean.FALSE;
            case 5:
                return new dvb((cvb) obj);
            case 6:
                List list = (List) obj;
                w87 w87 = y87.z;
                return null;
            case 7:
                z48 z48 = (z48) obj;
                z48.a();
                return z48;
            case 8:
                z48 z482 = (z48) obj;
                z482.e = false;
                return z482;
            case 9:
                z48 z483 = (z48) obj;
                z483.g = true;
                z483.i = true;
                z483.h = true;
                return z483;
            case 10:
                z48 z484 = (z48) obj;
                z484.e = true;
                return z484;
            case 11:
                z48 z485 = (z48) obj;
                z485.e = false;
                z485.a();
                return z485;
            case 12:
                z48 z486 = (z48) obj;
                z486.a();
                z486.e = false;
                return z486;
            case 13:
                z48 z487 = (z48) obj;
                z487.e = false;
                z487.a();
                return z487;
            case Protos.Attaches.Attach.LOCATION /*14*/:
                z48 z488 = (z48) obj;
                z488.a = true;
                z488.c = true;
                z488.b = false;
                return z488;
            case Protos.Attaches.Attach.DAILY_MEDIA /*15*/:
                List list2 = (List) obj;
                return null;
            case 16:
                try {
                    return c5g.a(b5g.n1((uc0) obj), (Size) null);
                } catch (InvalidConfigException unused) {
                    return null;
                }
            default:
                List list3 = (List) obj;
                if (list3 != null) {
                    Iterable<wpg> iterable = list3;
                    arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(iterable, 10));
                    for (wpg wpg : iterable) {
                        List list4 = wpg.g;
                        arrayList.add(new yog(UUID.fromString(wpg.a), wpg.b, wpg.c, (ArrayList) wpg.f, list4.isEmpty() ^ true ? (t64) list4.get(0) : t64.b, wpg.d, wpg.e));
                    }
                }
                return arrayList;
        }
    }
}
