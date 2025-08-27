package defpackage;

import android.util.Base64;
import androidx.media3.effect.DefaultVideoFrameProcessor$Factory$Builder;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;

/* renamed from: ad3  reason: default package */
public final /* synthetic */ class ad3 implements s2f {
    public final /* synthetic */ int a;

    public /* synthetic */ ad3(int i) {
        this.a = i;
    }

    public final Object get() {
        switch (this.a) {
            case 0:
                Class<DefaultVideoFrameProcessor$Factory$Builder> cls = DefaultVideoFrameProcessor$Factory$Builder.class;
                try {
                    Object invoke = cls.getMethod("build", (Class[]) null).invoke(cls.getConstructor((Class[]) null).newInstance((Object[]) null), (Object[]) null);
                    invoke.getClass();
                    return (v5g) invoke;
                } catch (Exception e) {
                    throw new IllegalStateException(e);
                }
            case 1:
                ExecutorService newSingleThreadExecutor = Executors.newSingleThreadExecutor();
                if (newSingleThreadExecutor instanceof n08) {
                    return (n08) newSingleThreadExecutor;
                }
                return newSingleThreadExecutor instanceof ScheduledExecutorService ? new ft9((ScheduledExecutorService) newSingleThreadExecutor) : new ct9(newSingleThreadExecutor);
            case 2:
                byte[] bArr = new byte[12];
                rh4.i.nextBytes(bArr);
                return Base64.encodeToString(bArr, 10);
            case 3:
                return new sg4(new cb4(0), 2500);
            case 4:
                return new tg4(new cb4(1), 2500, 5000);
            default:
                throw new IllegalStateException();
        }
    }
}
