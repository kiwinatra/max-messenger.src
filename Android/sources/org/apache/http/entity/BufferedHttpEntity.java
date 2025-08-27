package org.apache.http.entity;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import org.apache.http.HttpEntity;
import org.apache.http.util.EntityUtils;

@Deprecated
public class BufferedHttpEntity extends HttpEntityWrapper {
    private final byte[] buffer;

    public BufferedHttpEntity(HttpEntity httpEntity) throws IOException {
        super(httpEntity);
        if (!httpEntity.isRepeatable() || httpEntity.getContentLength() < 0) {
            this.buffer = EntityUtils.toByteArray(httpEntity);
        } else {
            this.buffer = null;
        }
    }

    public InputStream getContent() throws IOException {
        return this.buffer != null ? new ByteArrayInputStream(this.buffer) : this.wrappedEntity.getContent();
    }

    public long getContentLength() {
        byte[] bArr = this.buffer;
        return bArr != null ? (long) bArr.length : this.wrappedEntity.getContentLength();
    }

    public boolean isChunked() {
        return this.buffer == null && this.wrappedEntity.isChunked();
    }

    public boolean isRepeatable() {
        return true;
    }

    public boolean isStreaming() {
        return this.buffer == null && this.wrappedEntity.isStreaming();
    }

    public void writeTo(OutputStream outputStream) throws IOException {
        if (outputStream != null) {
            byte[] bArr = this.buffer;
            if (bArr != null) {
                outputStream.write(bArr);
            } else {
                this.wrappedEntity.writeTo(outputStream);
            }
        } else {
            throw new IllegalArgumentException("Output stream may not be null");
        }
    }
}
