package org.apache.http.util;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import kotlin.io.ConstantsKt;
import org.apache.http.HeaderElement;
import org.apache.http.HttpEntity;
import org.apache.http.NameValuePair;
import org.apache.http.ParseException;

@Deprecated
public final class EntityUtils {
    private EntityUtils() {
    }

    public static String getContentCharSet(HttpEntity httpEntity) throws ParseException {
        NameValuePair parameterByName;
        if (httpEntity != null) {
            if (httpEntity.getContentType() != null) {
                HeaderElement[] elements = httpEntity.getContentType().getElements();
                if (elements.length > 0 && (parameterByName = elements[0].getParameterByName("charset")) != null) {
                    return parameterByName.getValue();
                }
            }
            return null;
        }
        throw new IllegalArgumentException("HTTP entity may not be null");
    }

    /* JADX INFO: finally extract failed */
    public static byte[] toByteArray(HttpEntity httpEntity) throws IOException {
        if (httpEntity != null) {
            InputStream content = httpEntity.getContent();
            if (content == null) {
                return new byte[0];
            }
            if (httpEntity.getContentLength() <= 2147483647L) {
                int contentLength = (int) httpEntity.getContentLength();
                if (contentLength < 0) {
                    contentLength = 4096;
                }
                ByteArrayBuffer byteArrayBuffer = new ByteArrayBuffer(contentLength);
                try {
                    byte[] bArr = new byte[ConstantsKt.DEFAULT_BLOCK_SIZE];
                    while (true) {
                        int read = content.read(bArr);
                        if (read != -1) {
                            byteArrayBuffer.append(bArr, 0, read);
                        } else {
                            content.close();
                            return byteArrayBuffer.toByteArray();
                        }
                    }
                } catch (Throwable th) {
                    content.close();
                    throw th;
                }
            } else {
                throw new IllegalArgumentException("HTTP entity too large to be buffered in memory");
            }
        } else {
            throw new IllegalArgumentException("HTTP entity may not be null");
        }
    }

    /* JADX INFO: finally extract failed */
    public static String toString(HttpEntity httpEntity, String str) throws IOException, ParseException {
        if (httpEntity != null) {
            InputStream content = httpEntity.getContent();
            if (content == null) {
                return "";
            }
            if (httpEntity.getContentLength() <= 2147483647L) {
                int contentLength = (int) httpEntity.getContentLength();
                if (contentLength < 0) {
                    contentLength = ConstantsKt.DEFAULT_BLOCK_SIZE;
                }
                String contentCharSet = getContentCharSet(httpEntity);
                if (contentCharSet != null) {
                    str = contentCharSet;
                }
                if (str == null) {
                    str = "ISO-8859-1";
                }
                InputStreamReader inputStreamReader = new InputStreamReader(content, str);
                CharArrayBuffer charArrayBuffer = new CharArrayBuffer(contentLength);
                try {
                    char[] cArr = new char[1024];
                    while (true) {
                        int read = inputStreamReader.read(cArr);
                        if (read != -1) {
                            charArrayBuffer.append(cArr, 0, read);
                        } else {
                            inputStreamReader.close();
                            return charArrayBuffer.toString();
                        }
                    }
                } catch (Throwable th) {
                    inputStreamReader.close();
                    throw th;
                }
            } else {
                throw new IllegalArgumentException("HTTP entity too large to be buffered in memory");
            }
        } else {
            throw new IllegalArgumentException("HTTP entity may not be null");
        }
    }

    public static String toString(HttpEntity httpEntity) throws IOException, ParseException {
        return toString(httpEntity, (String) null);
    }
}
