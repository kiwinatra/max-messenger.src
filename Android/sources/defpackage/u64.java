package defpackage;

import java.nio.ByteBuffer;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import org.webrtc.DataChannel;

/* renamed from: u64  reason: default package */
public final class u64 {
    public final DataChannel a;
    public final voc b;
    public final CopyOnWriteArrayList c = new CopyOnWriteArrayList();
    public final CopyOnWriteArrayList d = new CopyOnWriteArrayList();
    public final CopyOnWriteArrayList e = new CopyOnWriteArrayList();

    public u64(DataChannel dataChannel, voc voc) {
        this.a = dataChannel;
        this.b = voc;
        dataChannel.registerObserver(new p7d(this, dataChannel, false, 9));
    }

    public final void a(z9d z9d) {
        if (z9d != null) {
            this.d.add(z9d);
            return;
        }
        throw new IllegalArgumentException("Illegal 'listener' value: null");
    }

    public final boolean b() {
        return this.a.state() == DataChannel.State.OPEN;
    }

    public final void c(z9d z9d) {
        if (z9d != null) {
            this.d.remove(z9d);
            return;
        }
        throw new IllegalArgumentException("Illegal 'listener' value: null");
    }

    public final void d(ByteBuffer... byteBufferArr) {
        Iterator it = this.d.iterator();
        while (it.hasNext()) {
            try {
                ((z9d) it.next()).getClass();
            } catch (Throwable th) {
                this.b.reportException("DataChannelRtcTransport", "rtc.datachannel.listen.send", new Exception(th));
            }
        }
        this.a.sendMultiple(true, byteBufferArr);
    }

    public final boolean e(int i, byte[] bArr) {
        if (bArr != null) {
            Iterator it = this.d.iterator();
            while (it.hasNext()) {
                try {
                    ((z9d) it.next()).getClass();
                    ByteBuffer.wrap(bArr);
                } catch (Throwable th) {
                    this.b.reportException("DataChannelRtcTransport", "rtc.datachannel.listen.send", new Exception(th));
                }
            }
            return this.a.send(new DataChannel.Buffer(ByteBuffer.wrap(bArr), i == 2));
        }
        throw new IllegalArgumentException("Illegal 'command' value: null");
    }
}
