package org.webrtc;

import org.webrtc.PeerConnection;

public final class PeerConnectionDependencies {
    private final PeerConnection.Observer observer;
    private final SSLCertificateVerifier sslCertificateVerifier;

    public static class Builder {
        private PeerConnection.Observer observer;
        private SSLCertificateVerifier sslCertificateVerifier;

        public /* synthetic */ Builder(PeerConnection.Observer observer2, int i) {
            this(observer2);
        }

        public PeerConnectionDependencies createPeerConnectionDependencies() {
            return new PeerConnectionDependencies(this.observer, this.sslCertificateVerifier, 0);
        }

        public Builder setSSLCertificateVerifier(SSLCertificateVerifier sSLCertificateVerifier) {
            this.sslCertificateVerifier = sSLCertificateVerifier;
            return this;
        }

        private Builder(PeerConnection.Observer observer2) {
            this.observer = observer2;
        }
    }

    public /* synthetic */ PeerConnectionDependencies(PeerConnection.Observer observer2, SSLCertificateVerifier sSLCertificateVerifier, int i) {
        this(observer2, sSLCertificateVerifier);
    }

    public static Builder builder(PeerConnection.Observer observer2) {
        return new Builder(observer2, 0);
    }

    public PeerConnection.Observer getObserver() {
        return this.observer;
    }

    public SSLCertificateVerifier getSSLCertificateVerifier() {
        return this.sslCertificateVerifier;
    }

    private PeerConnectionDependencies(PeerConnection.Observer observer2, SSLCertificateVerifier sSLCertificateVerifier) {
        this.observer = observer2;
        this.sslCertificateVerifier = sSLCertificateVerifier;
    }
}
