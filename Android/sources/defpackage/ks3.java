package defpackage;

import android.graphics.Rect;
import android.media.MediaCodec;
import android.util.Size;
import java.util.Comparator;
import java.util.Map;
import java.util.Objects;

/* renamed from: ks3  reason: default package */
public final /* synthetic */ class ks3 implements Comparator {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ ks3(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    public final int compare(Object obj, Object obj2) {
        switch (this.a) {
            case 0:
                vk3 vk3 = (vk3) obj2;
                long r = ((vk3) obj).r();
                hz9 hz9 = (hz9) this.b;
                int a2 = hz9.a(r);
                long j = 0;
                long j2 = a2 >= 0 ? hz9.c[a2] : 0;
                int a3 = hz9.a(vk3.r());
                if (a3 >= 0) {
                    j = hz9.c[a3];
                }
                return kne.l(j2, j);
            case 1:
                Map.Entry entry = (Map.Entry) obj;
                Map.Entry entry2 = (Map.Entry) obj2;
                Objects.requireNonNull(entry);
                Objects.requireNonNull(entry2);
                return ((Comparator) this.b).compare(entry.getKey(), entry2.getKey());
            case 2:
                co8 co8 = (co8) this.b;
                return co8.a(obj2) - co8.a(obj);
            case 3:
                do8 do8 = (do8) this.b;
                return do8.a(obj2) - do8.a(obj);
            case 4:
                dc0 dc0 = (dc0) obj2;
                ((bv1) this.b).getClass();
                Class<MediaCodec> cls = ((dc0) obj).a.j;
                int i = 1;
                Class<bub> cls2 = bub.class;
                Class<MediaCodec> cls3 = MediaCodec.class;
                int i2 = cls == cls3 ? 2 : cls == cls2 ? 0 : 1;
                Class<MediaCodec> cls4 = dc0.a.j;
                if (cls4 == cls3) {
                    i = 2;
                } else if (cls4 == cls2) {
                    i = 0;
                }
                return i2 - i;
            default:
                Size size = (Size) obj;
                Size size2 = (Size) obj2;
                int width = size.getWidth();
                Rect rect = (Rect) this.b;
                return (Math.abs(size.getHeight() - rect.height()) + Math.abs(width - rect.width())) - (Math.abs(size2.getHeight() - rect.height()) + Math.abs(size2.getWidth() - rect.width()));
        }
    }
}
