package defpackage;

/* renamed from: id4  reason: default package */
public abstract class id4 extends yi0 {
    public final void finalize() {
        if (!isClosed()) {
            bg5.o("CloseableImage", "finalize: %s %x still open.", getClass().getSimpleName(), Integer.valueOf(System.identityHashCode(this)));
            try {
                close();
            } finally {
                super.finalize();
            }
        }
    }
}
