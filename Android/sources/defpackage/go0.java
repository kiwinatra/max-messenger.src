package defpackage;

import android.graphics.Bitmap;
import kotlin.ranges.RangesKt;

/* renamed from: go0  reason: default package */
public final class go0 extends tb8 {
    public final /* synthetic */ int g;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public /* synthetic */ go0(int i, int i2) {
        super(i);
        this.g = i2;
    }

    public Object a(Object obj) {
        switch (this.g) {
            case 3:
                uhe uhe = (uhe) obj;
                return t4e.b(uhe.b, uhe.a);
            default:
                return super.a(obj);
        }
    }

    public void b(boolean z, Object obj, Object obj2, Object obj3) {
        switch (this.g) {
            case 1:
                String str = (String) obj;
                Bitmap bitmap = (Bitmap) obj3;
                ((Bitmap) obj2).recycle();
                return;
            default:
                return;
        }
    }

    public int h(Object obj) {
        switch (this.g) {
            case 0:
                return RangesKt.coerceAtLeast(vo0.d((Bitmap) obj), 1);
            default:
                return super.h(obj);
        }
    }
}
