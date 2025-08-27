package defpackage;

/* renamed from: rt1  reason: default package */
public interface rt1 extends btc {
    public static final la0 g = new la0(c0g.class, (Object) null, "camerax.core.camera.useCaseConfigFactory");
    public static final la0 h = new la0(Integer.class, (Object) null, "camerax.core.camera.useCaseCombinationRequiredRule");
    public static final la0 i = new la0(rwd.class, (Object) null, "camerax.core.camera.SessionProcessor");
    public static final la0 j;
    public static final la0 k;

    static {
        Class<Boolean> cls = Boolean.class;
        j = new la0(cls, (Object) null, "camerax.core.camera.isPostviewSupported");
        k = new la0(cls, (Object) null, "camerax.core.camera.isCaptureProcessProgressSupported");
    }

    void Q() {
        rae.w(k(i, (Object) null));
    }
}
