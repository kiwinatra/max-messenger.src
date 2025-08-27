package org.apache.http.entity;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

@Deprecated
public class BasicHttpEntity extends AbstractHttpEntity {
    private InputStream content;
    private boolean contentObtained;
    private long length = -1;

    public void consumeContent() throws IOException {
        InputStream inputStream = this.content;
        if (inputStream != null) {
            inputStream.close();
        }
    }

    public InputStream getContent() throws IllegalStateException {
        InputStream inputStream = this.content;
        if (inputStream == null) {
            throw new IllegalStateException("Content has not been provided");
        } else if (!this.contentObtained) {
            this.contentObtained = true;
            return inputStream;
        } else {
            throw new IllegalStateException("Content has been consumed");
        }
    }

    public long getContentLength() {
        return this.length;
    }

    public boolean isRepeatable() {
        return false;
    }

    public boolean isStreaming() {
        return !this.contentObtained && this.content != null;
    }

    public void setContent(InputStream inputStream) {
        this.content = inputStream;
        this.contentObtained = false;
    }

    public void setContentLength(long j) {
        this.length = j;
    }

    public void writeTo(OutputStream outputStream) throws IOException {
        if (outputStream != null) {
            InputStream content2 = getContent();
            byte[] bArr = new byte[2048];
            while (true) {
                int read = content2.read(bArr);
                if (read != -1) {
                    outputStream.write(bArr, 0, read);
                } else {
                    return;
                }
            }
        } else {
            throw new IllegalArgumentException("Output stream may not be null");
        }
    }
}
