package org.apache.http;

import java.io.Serializable;
import org.apache.http.util.CharArrayBuffer;

@Deprecated
public class ProtocolVersion implements Serializable, Cloneable {
    private static final long serialVersionUID = 8950662842175091068L;
    protected final int major;
    protected final int minor;
    protected final String protocol;

    public ProtocolVersion(String str, int i, int i2) {
        if (str == null) {
            throw new IllegalArgumentException("Protocol name must not be null.");
        } else if (i < 0) {
            throw new IllegalArgumentException("Protocol major version number must not be negative.");
        } else if (i2 >= 0) {
            this.protocol = str;
            this.major = i;
            this.minor = i2;
        } else {
            throw new IllegalArgumentException("Protocol minor version number may not be negative");
        }
    }

    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    public int compareToVersion(ProtocolVersion protocolVersion) {
        if (protocolVersion == null) {
            throw new IllegalArgumentException("Protocol version must not be null.");
        } else if (this.protocol.equals(protocolVersion.protocol)) {
            int major2 = getMajor() - protocolVersion.getMajor();
            return major2 == 0 ? getMinor() - protocolVersion.getMinor() : major2;
        } else {
            throw new IllegalArgumentException("Versions for different protocols cannot be compared. " + this + " " + protocolVersion);
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ProtocolVersion)) {
            return false;
        }
        ProtocolVersion protocolVersion = (ProtocolVersion) obj;
        return this.protocol.equals(protocolVersion.protocol) && this.major == protocolVersion.major && this.minor == protocolVersion.minor;
    }

    public ProtocolVersion forVersion(int i, int i2) {
        return (i == this.major && i2 == this.minor) ? this : new ProtocolVersion(this.protocol, i, i2);
    }

    public final int getMajor() {
        return this.major;
    }

    public final int getMinor() {
        return this.minor;
    }

    public final String getProtocol() {
        return this.protocol;
    }

    public final boolean greaterEquals(ProtocolVersion protocolVersion) {
        return isComparable(protocolVersion) && compareToVersion(protocolVersion) >= 0;
    }

    public final int hashCode() {
        return this.minor ^ (this.protocol.hashCode() ^ (this.major * 100000));
    }

    public boolean isComparable(ProtocolVersion protocolVersion) {
        return protocolVersion != null && this.protocol.equals(protocolVersion.protocol);
    }

    public final boolean lessEquals(ProtocolVersion protocolVersion) {
        return isComparable(protocolVersion) && compareToVersion(protocolVersion) <= 0;
    }

    public String toString() {
        CharArrayBuffer charArrayBuffer = new CharArrayBuffer(16);
        charArrayBuffer.append(this.protocol);
        charArrayBuffer.append('/');
        charArrayBuffer.append(Integer.toString(this.major));
        charArrayBuffer.append('.');
        charArrayBuffer.append(Integer.toString(this.minor));
        return charArrayBuffer.toString();
    }
}
