package org.apache.http.entity;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.UnsupportedEncodingException;

@Deprecated
public class StringEntity extends AbstractHttpEntity implements Cloneable {
    protected final byte[] content;

    public StringEntity(String str, String str2) throws UnsupportedEncodingException {
        if (str != null) {
            str2 = str2 == null ? "ISO-8859-1" : str2;
            this.content = str.getBytes(str2);
            setContentType("text/plain; charset=".concat(str2));
            return;
        }
        throw new IllegalArgumentException("Source string may not be null");
    }

    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    public InputStream getContent() throws IOException {
        return new ByteArrayInputStream(this.content);
    }

    public long getContentLength() {
        return (long) this.content.length;
    }

    public boolean isRepeatable() {
        return true;
    }

    public boolean isStreaming() {
        return false;
    }

    public void writeTo(OutputStream outputStream) throws IOException {
        if (outputStream != null) {
            outputStream.write(this.content);
            outputStream.flush();
            return;
        }
        throw new IllegalArgumentException("Output stream may not be null");
    }

    public StringEntity(String str) throws UnsupportedEncodingException {
        this(str, (String) null);
    }
}
