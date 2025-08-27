package defpackage;

import android.content.Context;
import androidx.media3.common.VideoFrameProcessingException;
import androidx.media3.effect.PreviewingSingleInputVideoGraph$Factory;

/* renamed from: cd3  reason: default package */
public final class cd3 implements nub {
    public final v5g a;

    public cd3(bd3 bd3) {
        this.a = bd3;
    }

    public final mub a(Context context, m53 m53, k6g k6g, zc3 zc3, k0d k0d) {
        try {
            return PreviewingSingleInputVideoGraph$Factory.class.getConstructor(new Class[]{v5g.class}).newInstance(new Object[]{this.a}).a(context, m53, k6g, zc3, k0d);
        } catch (Exception e) {
            throw VideoFrameProcessingException.a(e);
        }
    }
}
