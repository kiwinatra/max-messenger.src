package defpackage;

import android.view.View;
import com.google.android.gms.common.api.Scope;
import java.util.Comparator;
import java.util.Map;
import kotlin.comparisons.ComparisonsKt;
import org.webrtc.CameraEnumerationAndroid;
import ru.ok.tamtam.nano.Protos;

/* renamed from: ed7  reason: default package */
public final class ed7 implements Comparator {
    public final /* synthetic */ int a;

    public /* synthetic */ ed7(int i) {
        this.a = i;
    }

    public final int compare(Object obj, Object obj2) {
        switch (this.a) {
            case 0:
                return ComparisonsKt.compareValues(Long.valueOf(((k48) obj2).v), Long.valueOf(((k48) obj).v));
            case 1:
                return ComparisonsKt.compareValues(Long.valueOf(((k48) obj2).v), Long.valueOf(((k48) obj).v));
            case 2:
                return ComparisonsKt.compareValues(Integer.valueOf(j4b.G((String) ((Map.Entry) obj).getKey())), Integer.valueOf(j4b.G((String) ((Map.Entry) obj2).getKey())));
            case 3:
                return ComparisonsKt.compareValues(Long.valueOf(((o78) obj).a), Long.valueOf(((o78) obj2).a));
            case 4:
                return ComparisonsKt.compareValues(Long.valueOf(((yk2) obj2).m), Long.valueOf(((yk2) obj).m));
            case 5:
                return ComparisonsKt.compareValues(Long.valueOf(((zi8) obj).w), Long.valueOf(((zi8) obj2).w));
            case 6:
                return ComparisonsKt.compareValues(Integer.valueOf(((lbb) obj).b), Integer.valueOf(((lbb) obj2).b));
            case 7:
                return ComparisonsKt.compareValues(Integer.valueOf(((lbb) obj).b), Integer.valueOf(((lbb) obj2).b));
            case 8:
                return ComparisonsKt.compareValues(Boolean.valueOf(((zo3) obj2).y), Boolean.valueOf(((zo3) obj).y));
            case 9:
                return ((sfe) obj).b - ((sfe) obj2).b;
            case 10:
                a32 a32 = ((ald) obj2).o;
                Long l = null;
                Long valueOf = a32 != null ? Long.valueOf(a32.n()) : null;
                a32 a322 = ((ald) obj).o;
                if (a322 != null) {
                    l = Long.valueOf(a322.n());
                }
                return ComparisonsKt.compareValues(valueOf, l);
            case 11:
                a32 a323 = ((ald) obj2).o;
                Long l2 = null;
                Long valueOf2 = a323 != null ? Long.valueOf(a323.n()) : null;
                a32 a324 = ((ald) obj).o;
                if (a324 != null) {
                    l2 = Long.valueOf(a324.n());
                }
                return ComparisonsKt.compareValues(valueOf2, l2);
            case 12:
                return ComparisonsKt.compareValues(Long.valueOf(((a32) obj2).n()), Long.valueOf(((a32) obj).n()));
            case 13:
                return ComparisonsKt.compareValues(Boolean.valueOf(!((mqe) obj).y), Boolean.valueOf(!((mqe) obj2).y));
            case Protos.Attaches.Attach.LOCATION /*14*/:
                return ((View) obj).getTop() - ((View) obj2).getTop();
            case Protos.Attaches.Attach.DAILY_MEDIA /*15*/:
                return ((pbg) obj).b - ((pbg) obj2).b;
            case 16:
                CameraEnumerationAndroid.CaptureFormat captureFormat = (CameraEnumerationAndroid.CaptureFormat) obj;
                CameraEnumerationAndroid.CaptureFormat captureFormat2 = (CameraEnumerationAndroid.CaptureFormat) obj2;
                return Integer.compare(captureFormat2.width * captureFormat2.height, captureFormat.width * captureFormat.height);
            default:
                return ((Scope) obj).b.compareTo(((Scope) obj2).b);
        }
    }
}
