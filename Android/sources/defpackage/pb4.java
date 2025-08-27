package defpackage;

import android.media.MediaCodecInfo;
import android.util.Size;
import kotlin.jvm.internal.IntCompanionObject;

/* renamed from: pb4  reason: default package */
public final /* synthetic */ class pb4 implements i08, df4, eo1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ pb4(Object obj, int i, int i2) {
        this.c = obj;
        this.a = i;
        this.b = i2;
    }

    public int a(MediaCodecInfo mediaCodecInfo) {
        int i = this.a;
        int i2 = this.b;
        Size h = k65.h(mediaCodecInfo, (String) this.c, i, i2);
        if (h == null) {
            return IntCompanionObject.MAX_VALUE;
        }
        return Math.abs((i * i2) - (h.getHeight() * h.getWidth()));
    }

    public void invoke(Object obj) {
        ((ud) obj).J((td) this.c, this.a, this.b);
    }

    public Object r(do1 do1) {
        ti4 ti4 = (ti4) this.c;
        ti4.getClass();
        ti4.e(new ir1(27, ti4, new na0(this.a, this.b, do1)), new qi4(do1, 0));
        return "DefaultSurfaceProcessor#snapshot";
    }
}
