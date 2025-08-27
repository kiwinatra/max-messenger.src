package defpackage;

import java.io.IOException;
import java.net.Socket;
import java.net.SocketTimeoutException;
import java.util.logging.Level;
import java.util.logging.Logger;
import kotlin.Unit;

/* renamed from: g47  reason: default package */
public final class g47 extends cy {
    public final /* synthetic */ int k;
    public final Object l;

    public /* synthetic */ g47(int i, Object obj) {
        this.k = i;
        this.l = obj;
    }

    public IOException k(IOException iOException) {
        switch (this.k) {
            case 0:
                SocketTimeoutException socketTimeoutException = new SocketTimeoutException("timeout");
                if (iOException != null) {
                    socketTimeoutException.initCause(iOException);
                }
                return socketTimeoutException;
            case 2:
                SocketTimeoutException socketTimeoutException2 = new SocketTimeoutException("timeout");
                if (iOException != null) {
                    socketTimeoutException2.initCause(iOException);
                }
                return socketTimeoutException2;
            default:
                return super.k(iOException);
        }
    }

    public final void l() {
        switch (this.k) {
            case 0:
                ((h47) this.l).e(9);
                a47 a47 = ((h47) this.l).n;
                synchronized (a47) {
                    long j = a47.y0;
                    long j2 = a47.x0;
                    if (j >= j2) {
                        a47.x0 = j2 + 1;
                        a47.z0 = System.nanoTime() + ((long) 1000000000);
                        Unit unit = Unit.INSTANCE;
                        a47.z.c(new y37(wj6.n(new StringBuilder(), a47.o, " ping"), a47), 0);
                        return;
                    }
                    return;
                }
            case 1:
                ((jtc) this.l).e();
                return;
            default:
                Socket socket = (Socket) this.l;
                try {
                    socket.close();
                    return;
                } catch (Exception e) {
                    Logger logger = ula.a;
                    Level level = Level.WARNING;
                    logger.log(level, "Failed to close timed out socket " + socket, e);
                    return;
                } catch (AssertionError e2) {
                    Logger logger2 = ula.a;
                    boolean z = false;
                    if (e2.getCause() != null) {
                        String message = e2.getMessage();
                        if (message != null ? StringsKt__StringsKt.contains$default((CharSequence) message, (CharSequence) "getsockname failed", false, 2, (Object) null) : false) {
                            z = true;
                        }
                    }
                    if (z) {
                        Logger logger3 = ula.a;
                        Level level2 = Level.WARNING;
                        logger3.log(level2, "Failed to close timed out socket " + socket, e2);
                        return;
                    }
                    throw e2;
                }
        }
    }

    public void m() {
        if (j()) {
            throw k((IOException) null);
        }
    }
}
