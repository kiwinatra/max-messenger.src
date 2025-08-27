package androidx.camera.camera2.internal.compat.quirk;

import androidx.camera.core.internal.compat.quirk.SoftwareJpegEncodingPreferredQuirk;
import java.util.Arrays;
import java.util.HashSet;

public class JpegCaptureDownsizingQuirk implements SoftwareJpegEncodingPreferredQuirk {
    public static final HashSet a = new HashSet(Arrays.asList(new String[]{"redmi note 8 pro"}));
}
