package defpackage;

import android.net.Uri;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.CipherInputStream;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* renamed from: ec  reason: default package */
public final class ec implements h74 {
    public final h74 a;
    public final byte[] b;
    public final byte[] c;
    public CipherInputStream o;

    public ec(h74 h74, byte[] bArr, byte[] bArr2) {
        this.a = h74;
        this.b = bArr;
        this.c = bArr2;
    }

    public final long N(p74 p74) {
        try {
            Cipher instance = Cipher.getInstance("AES/CBC/PKCS7Padding");
            try {
                instance.init(2, new SecretKeySpec(this.b, "AES"), new IvParameterSpec(this.c));
                l74 l74 = new l74(this.a, p74);
                this.o = new CipherInputStream(l74, instance);
                l74.m();
                return -1;
            } catch (InvalidAlgorithmParameterException | InvalidKeyException e) {
                throw new RuntimeException(e);
            }
        } catch (NoSuchAlgorithmException | NoSuchPaddingException e2) {
            throw new RuntimeException(e2);
        }
    }

    public final void O(arf arf) {
        arf.getClass();
        this.a.O(arf);
    }

    public final void close() {
        if (this.o != null) {
            this.o = null;
            this.a.close();
        }
    }

    public final Uri getUri() {
        return this.a.getUri();
    }

    public final int read(byte[] bArr, int i, int i2) {
        this.o.getClass();
        int read = this.o.read(bArr, i, i2);
        if (read < 0) {
            return -1;
        }
        return read;
    }

    public final Map x() {
        return this.a.x();
    }
}
