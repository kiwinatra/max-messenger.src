package defpackage;

import android.net.Uri;
import com.google.android.exoplayer2.upstream.DataSourceException;
import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.MulticastSocket;
import java.net.SocketTimeoutException;

/* renamed from: tuf  reason: default package */
public final class tuf extends cj0 {
    public MulticastSocket X;
    public InetAddress Y;
    public boolean Z;
    public final int v = 8000;
    public int v0;
    public final byte[] w;
    public final DatagramPacket x;
    public Uri y;
    public DatagramSocket z;

    public tuf() {
        super(true);
        byte[] bArr = new byte[2000];
        this.w = bArr;
        this.x = new DatagramPacket(bArr, 0, 2000);
    }

    public final long N(p74 p74) {
        Uri uri = p74.a;
        this.y = uri;
        String host = uri.getHost();
        host.getClass();
        int port = this.y.getPort();
        c();
        try {
            this.Y = InetAddress.getByName(host);
            InetSocketAddress inetSocketAddress = new InetSocketAddress(this.Y, port);
            if (this.Y.isMulticastAddress()) {
                MulticastSocket multicastSocket = new MulticastSocket(inetSocketAddress);
                this.X = multicastSocket;
                multicastSocket.joinGroup(this.Y);
                this.z = this.X;
            } else {
                this.z = new DatagramSocket(inetSocketAddress);
            }
            this.z.setSoTimeout(this.v);
            this.Z = true;
            d(p74);
            return -1;
        } catch (SecurityException e) {
            throw new DataSourceException((Throwable) e, 2006);
        } catch (IOException e2) {
            throw new DataSourceException((Throwable) e2, 2001);
        }
    }

    public final void close() {
        this.y = null;
        MulticastSocket multicastSocket = this.X;
        if (multicastSocket != null) {
            try {
                InetAddress inetAddress = this.Y;
                inetAddress.getClass();
                multicastSocket.leaveGroup(inetAddress);
            } catch (IOException unused) {
            }
            this.X = null;
        }
        DatagramSocket datagramSocket = this.z;
        if (datagramSocket != null) {
            datagramSocket.close();
            this.z = null;
        }
        this.Y = null;
        this.v0 = 0;
        if (this.Z) {
            this.Z = false;
            b();
        }
    }

    public final Uri getUri() {
        return this.y;
    }

    public final int read(byte[] bArr, int i, int i2) {
        if (i2 == 0) {
            return 0;
        }
        int i3 = this.v0;
        DatagramPacket datagramPacket = this.x;
        if (i3 == 0) {
            try {
                DatagramSocket datagramSocket = this.z;
                datagramSocket.getClass();
                datagramSocket.receive(datagramPacket);
                int length = datagramPacket.getLength();
                this.v0 = length;
                a(length);
            } catch (SocketTimeoutException e) {
                throw new DataSourceException((Throwable) e, 2002);
            } catch (IOException e2) {
                throw new DataSourceException((Throwable) e2, 2001);
            }
        }
        int length2 = datagramPacket.getLength();
        int i4 = this.v0;
        int min = Math.min(i4, i2);
        System.arraycopy(this.w, length2 - i4, bArr, i, min);
        this.v0 -= min;
        return min;
    }
}
