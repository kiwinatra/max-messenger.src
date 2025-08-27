package androidx.camera.video.internal.compat.quirk;

import java.util.Arrays;
import java.util.HashSet;

public class CameraUseInconsistentTimebaseQuirk implements icc {
    public static final HashSet a = new HashSet(Arrays.asList(new String[]{"samsungexynos7570", "samsungexynos7870", "qcom"}));
    public static final HashSet b = new HashSet(Arrays.asList(new String[]{"sm4350", "sm6375", "sm7325"}));
    public static final HashSet c = new HashSet(Arrays.asList(new String[]{"m2007j20cg", "m2007j20ct"}));
}
