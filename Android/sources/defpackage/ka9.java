package defpackage;

import java.io.Closeable;
import java.util.zip.Deflater;
import java.util.zip.Inflater;

/* renamed from: ka9  reason: default package */
public final class ka9 implements Closeable {
    public final /* synthetic */ int a;
    public final rt0 b;
    public final boolean c;
    public final Object o;
    public final Closeable v;

    /* JADX WARNING: type inference failed for: r3v1, types: [yfe, java.lang.Object, rt0] */
    /* JADX WARNING: type inference failed for: r3v2, types: [java.lang.Object, rt0] */
    public ka9(boolean z, int i) {
        this.a = i;
        switch (i) {
            case 1:
                this.c = z;
                ? obj = new Object();
                this.b = obj;
                Inflater inflater = new Inflater(true);
                this.o = inflater;
                this.v = new cf7(new gtc(obj), inflater);
                return;
            default:
                this.c = z;
                ? obj2 = new Object();
                this.b = obj2;
                Deflater deflater = new Deflater(-1, true);
                this.o = deflater;
                this.v = new uk4(obj2, deflater);
                return;
        }
    }

    public final void close() {
        switch (this.a) {
            case 0:
                ((uk4) this.v).close();
                return;
            default:
                ((cf7) this.v).close();
                return;
        }
    }
}
