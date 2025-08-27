package org.apache.http.entity;

import android.support.v4.media.session.PlaybackStateCompat;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

@Deprecated
public class InputStreamEntity extends AbstractHttpEntity {
    private static final int BUFFER_SIZE = 2048;
    private boolean consumed = false;
    private final InputStream content;
    private final long length;

    public InputStreamEntity(InputStream inputStream, long j) {
        if (inputStream != null) {
            this.content = inputStream;
            this.length = j;
            return;
        }
        throw new IllegalArgumentException("Source input stream may not be null");
    }

    public void consumeContent() throws IOException {
        this.consumed = true;
        this.content.close();
    }

    public InputStream getContent() throws IOException {
        return this.content;
    }

    public long getContentLength() {
        return this.length;
    }

    public boolean isRepeatable() {
        return false;
    }

    public boolean isStreaming() {
        return !this.consumed;
    }

    public void writeTo(OutputStream outputStream) throws IOException {
        int read;
        if (outputStream != null) {
            InputStream inputStream = this.content;
            byte[] bArr = new byte[BUFFER_SIZE];
            long j = this.length;
            if (j < 0) {
                while (true) {
                    int read2 = inputStream.read(bArr);
                    if (read2 == -1) {
                        break;
                    }
                    outputStream.write(bArr, 0, read2);
                }
            } else {
                while (j > 0 && (read = inputStream.read(bArr, 0, (int) Math.min(PlaybackStateCompat.ACTION_PLAY_FROM_SEARCH, j))) != -1) {
                    outputStream.write(bArr, 0, read);
                    j -= (long) read;
                }
            }
            this.consumed = true;
            return;
        }
        throw new IllegalArgumentException("Output stream may not be null");
    }
}
