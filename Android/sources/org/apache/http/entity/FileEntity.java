package org.apache.http.entity;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import kotlin.io.ConstantsKt;

@Deprecated
public class FileEntity extends AbstractHttpEntity implements Cloneable {
    protected final File file;

    public FileEntity(File file2, String str) {
        if (file2 != null) {
            this.file = file2;
            setContentType(str);
            return;
        }
        throw new IllegalArgumentException("File may not be null");
    }

    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    public InputStream getContent() throws IOException {
        return new FileInputStream(this.file);
    }

    public long getContentLength() {
        return this.file.length();
    }

    public boolean isRepeatable() {
        return true;
    }

    public boolean isStreaming() {
        return false;
    }

    public void writeTo(OutputStream outputStream) throws IOException {
        if (outputStream != null) {
            FileInputStream fileInputStream = new FileInputStream(this.file);
            try {
                byte[] bArr = new byte[ConstantsKt.DEFAULT_BLOCK_SIZE];
                while (true) {
                    int read = fileInputStream.read(bArr);
                    if (read != -1) {
                        outputStream.write(bArr, 0, read);
                    } else {
                        outputStream.flush();
                        fileInputStream.close();
                        return;
                    }
                }
            } catch (Throwable th) {
                fileInputStream.close();
                throw th;
            }
        } else {
            throw new IllegalArgumentException("Output stream may not be null");
        }
    }
}
