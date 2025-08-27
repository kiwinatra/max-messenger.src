package ru.ok.tamtam.android.ssl;

import javax.net.ssl.SSLException;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"ru/ok/tamtam/android/ssl/SslProviderVerifier$InvalidSslSessionException", "Ljavax/net/ssl/SSLException;", "api-ssl_release"}, k = 1, mv = {2, 0, 0})
public final class SslProviderVerifier$InvalidSslSessionException extends SSLException {
    public SslProviderVerifier$InvalidSslSessionException() {
        this((String) null, 3);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SslProviderVerifier$InvalidSslSessionException(String str, int i) {
        super((i & 1) != 0 ? null : str, (Throwable) null);
    }
}
