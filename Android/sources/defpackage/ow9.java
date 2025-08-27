package defpackage;

import com.facebook.imagepipeline.nativecode.NativeJpegTranscoderFactory;
import java.lang.reflect.InvocationTargetException;

/* renamed from: ow9  reason: default package */
public final class ow9 implements ta7 {
    public final int a;

    public ow9(int i) {
        this.a = i;
    }

    public final sa7 a(h97 h97, boolean z) {
        int i = this.a;
        Class<NativeJpegTranscoderFactory> cls = NativeJpegTranscoderFactory.class;
        try {
            Class cls2 = Integer.TYPE;
            Class cls3 = Boolean.TYPE;
            return cls.getConstructor(new Class[]{cls2, cls3, cls3}).newInstance(new Object[]{Integer.valueOf(i), Boolean.FALSE, Boolean.TRUE}).createImageTranscoder(h97, z);
        } catch (NoSuchMethodException e) {
            throw new RuntimeException("Dependency ':native-imagetranscoder' is needed to use the default native image transcoder.", e);
        } catch (SecurityException e2) {
            throw new RuntimeException("Dependency ':native-imagetranscoder' is needed to use the default native image transcoder.", e2);
        } catch (InstantiationException e3) {
            throw new RuntimeException("Dependency ':native-imagetranscoder' is needed to use the default native image transcoder.", e3);
        } catch (InvocationTargetException e4) {
            throw new RuntimeException("Dependency ':native-imagetranscoder' is needed to use the default native image transcoder.", e4);
        } catch (IllegalAccessException e5) {
            throw new RuntimeException("Dependency ':native-imagetranscoder' is needed to use the default native image transcoder.", e5);
        } catch (IllegalArgumentException e6) {
            throw new RuntimeException("Dependency ':native-imagetranscoder' is needed to use the default native image transcoder.", e6);
        } catch (ClassNotFoundException e7) {
            throw new RuntimeException("Dependency ':native-imagetranscoder' is needed to use the default native image transcoder.", e7);
        }
    }

    public final sa7 createImageTranscoder(h97 h97, boolean z) {
        sa7 a2 = j4b.B ? a(h97, z) : null;
        return a2 == null ? new qd3(z, this.a) : a2;
    }
}
