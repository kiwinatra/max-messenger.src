package defpackage;

import java.io.Serializable;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/* renamed from: zyg  reason: default package */
public final class zyg extends nyg implements Serializable {
    public final MessageDigest a;
    public final int b;
    public final boolean c;
    public final String o;

    public zyg() {
        boolean z;
        try {
            MessageDigest instance = MessageDigest.getInstance("SHA-256");
            this.a = instance;
            this.b = instance.getDigestLength();
            this.o = "Hashing.sha256()";
            try {
                instance.clone();
                z = true;
            } catch (CloneNotSupportedException unused) {
                z = false;
            }
            this.c = z;
        } catch (NoSuchAlgorithmException e) {
            throw new AssertionError(e);
        }
    }

    public final String toString() {
        return this.o;
    }
}
