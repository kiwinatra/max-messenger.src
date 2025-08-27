package defpackage;

import androidx.camera.core.ImageProcessingUtil;

/* renamed from: ga7  reason: default package */
public final /* synthetic */ class ga7 implements rb6 {
    public final /* synthetic */ ha7 a;
    public final /* synthetic */ ha7 b;

    public /* synthetic */ ga7(ha7 ha7, ha7 ha72) {
        this.a = ha7;
        this.b = ha72;
    }

    public final void a(ha7 ha7) {
        ha7 ha72;
        int i = ImageProcessingUtil.a;
        if (this.a != null && (ha72 = this.b) != null) {
            ha72.close();
        }
    }
}
