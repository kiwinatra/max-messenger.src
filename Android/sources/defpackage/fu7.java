package defpackage;

/* renamed from: fu7  reason: default package */
public final class fu7 {
    public static hu7 a(iu7 iu7) {
        int i = eu7.$EnumSwitchMapping$0[iu7.ordinal()];
        if (i == 1) {
            return hu7.ON_DESTROY;
        }
        if (i == 2) {
            return hu7.ON_STOP;
        }
        if (i != 3) {
            return null;
        }
        return hu7.ON_PAUSE;
    }
}
