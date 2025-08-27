package defpackage;

import android.net.SSLCertificateSocketFactory;
import java.net.InetAddress;
import java.net.Socket;
import javax.net.ssl.SSLSocketFactory;

/* renamed from: pfe  reason: default package */
public final class pfe extends SSLSocketFactory {
    public final SSLCertificateSocketFactory a;

    public pfe(SSLCertificateSocketFactory sSLCertificateSocketFactory) {
        this.a = sSLCertificateSocketFactory;
    }

    public final Socket createSocket() {
        SSLCertificateSocketFactory sSLCertificateSocketFactory = this.a;
        Socket createSocket = sSLCertificateSocketFactory.createSocket();
        sSLCertificateSocketFactory.setUseSessionTickets(createSocket, true);
        return createSocket;
    }

    public final String[] getDefaultCipherSuites() {
        return this.a.getDefaultCipherSuites();
    }

    public final String[] getSupportedCipherSuites() {
        return this.a.getSupportedCipherSuites();
    }

    public final Socket createSocket(InetAddress inetAddress, int i) {
        SSLCertificateSocketFactory sSLCertificateSocketFactory = this.a;
        Socket createSocket = sSLCertificateSocketFactory.createSocket(inetAddress, i);
        sSLCertificateSocketFactory.setUseSessionTickets(createSocket, true);
        return createSocket;
    }

    public final Socket createSocket(Socket socket, String str, int i, boolean z) {
        SSLCertificateSocketFactory sSLCertificateSocketFactory = this.a;
        Socket createSocket = sSLCertificateSocketFactory.createSocket(socket, str, i, z);
        sSLCertificateSocketFactory.setUseSessionTickets(createSocket, true);
        return createSocket;
    }

    public final Socket createSocket(String str, int i) {
        SSLCertificateSocketFactory sSLCertificateSocketFactory = this.a;
        Socket createSocket = sSLCertificateSocketFactory.createSocket(str, i);
        sSLCertificateSocketFactory.setUseSessionTickets(createSocket, true);
        return createSocket;
    }

    public final Socket createSocket(String str, int i, InetAddress inetAddress, int i2) {
        SSLCertificateSocketFactory sSLCertificateSocketFactory = this.a;
        Socket createSocket = sSLCertificateSocketFactory.createSocket(str, i, inetAddress, i2);
        sSLCertificateSocketFactory.setUseSessionTickets(createSocket, true);
        return createSocket;
    }

    public final Socket createSocket(InetAddress inetAddress, int i, InetAddress inetAddress2, int i2) {
        SSLCertificateSocketFactory sSLCertificateSocketFactory = this.a;
        Socket createSocket = sSLCertificateSocketFactory.createSocket(inetAddress, i, inetAddress2, i2);
        sSLCertificateSocketFactory.setUseSessionTickets(createSocket, true);
        return createSocket;
    }
}
