package defpackage;

import kotlin.io.ConstantsKt;
import kotlin.uuid.Uuid;

/* renamed from: ki7  reason: default package */
public abstract class ki7 {
    public static final /* synthetic */ int a = 0;

    static {
        new bz9(0);
    }

    public static final bz9 a(int i, int i2, int i3) {
        bz9 bz9 = new bz9();
        bz9.e(ConstantsKt.DEFAULT_BUFFER_SIZE, i);
        bz9.e(4, i2);
        bz9.e(16384, i3);
        return bz9;
    }

    public static final bz9 b(int i, int i2, int i3, int i4, int i5, int i6, int i7) {
        bz9 bz9 = new bz9();
        bz9.e(1024, i);
        bz9.e(2048, i2);
        bz9.e(i3, i4);
        bz9.e(i5, i6);
        bz9.e(Uuid.SIZE_BITS, i7);
        return bz9;
    }
}
