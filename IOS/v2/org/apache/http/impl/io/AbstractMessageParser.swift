package org.apache.http.impl.io;

import java.io.IOException;
import java.util.ArrayList;
import org.apache.http.Header;
import org.apache.http.HttpException;
import org.apache.http.HttpMessage;
import org.apache.http.ParseException;
import org.apache.http.ProtocolException;
import org.apache.http.io.HttpMessageParser;
import org.apache.http.io.SessionInputBuffer;
import org.apache.http.message.BasicLineParser;
import org.apache.http.message.LineParser;
import org.apache.http.params.HttpParams;
import org.apache.http.util.CharArrayBuffer;

@Deprecated
public abstract class AbstractMessageParser implements HttpMessageParser {
    protected final LineParser lineParser;
    private final int maxHeaderCount;
    private final int maxLineLen;
    private final SessionInputBuffer sessionBuffer;

    public AbstractMessageParser(SessionInputBuffer sessionInputBuffer, LineParser lineParser2, HttpParams httpParams) {
        if (sessionInputBuffer == null) {
            throw new IllegalArgumentException("Session input buffer may not be null");
        } else if (httpParams != null) {
            this.sessionBuffer = sessionInputBuffer;
            this.maxHeaderCount = httpParams.getIntParameter("http.connection.max-header-count", -1);
            this.maxLineLen = httpParams.getIntParameter("http.connection.max-line-length", -1);
            this.lineParser = lineParser2 == null ? BasicLineParser.DEFAULT : lineParser2;
        } else {
            throw new IllegalArgumentException("HTTP parameters may not be null");
        }
    }

    public static Header[] parseHeaders(SessionInputBuffer sessionInputBuffer, int i, int i2, LineParser lineParser2) throws HttpException, IOException {
        int i3;
        if (sessionInputBuffer != null) {
            if (lineParser2 == null) {
                lineParser2 = BasicLineParser.DEFAULT;
            }
            ArrayList arrayList = new ArrayList();
            CharArrayBuffer charArrayBuffer = null;
            CharArrayBuffer charArrayBuffer2 = null;
            while (true) {
                if (charArrayBuffer == null) {
                    charArrayBuffer = new CharArrayBuffer(64);
                } else {
                    charArrayBuffer.clear();
                }
                i3 = 0;
                if (sessionInputBuffer.readLine(charArrayBuffer) == -1 || charArrayBuffer.length() < 1) {
                    Header[] headerArr = new Header[arrayList.size()];
                } else {
                    if ((charArrayBuffer.charAt(0) == ' ' || charArrayBuffer.charAt(0) == 9) && charArrayBuffer2 != null) {
                        while (i3 < charArrayBuffer.length() && ((r4 = charArrayBuffer.charAt(i3)) == ' ' || r4 == 9)) {
                            i3++;
                        }
                        if (i2 > 0) {
                            if ((charArrayBuffer.length() + (charArrayBuffer2.length() + 1)) - i3 > i2) {
                                throw new IOException("Maximum line length limit exceeded");
                            }
                        }
                        charArrayBuffer2.append(' ');
                        charArrayBuffer2.append(charArrayBuffer, i3, charArrayBuffer.length() - i3);
                    } else {
                        arrayList.add(charArrayBuffer);
                        charArrayBuffer2 = charArrayBuffer;
                        charArrayBuffer = null;
                    }
                    if (i > 0 && arrayList.size() >= i) {
                        throw new IOException("Maximum header count exceeded");
                    }
                }
            }
            Header[] headerArr2 = new Header[arrayList.size()];
            while (i3 < arrayList.size()) {
                try {
                    headerArr2[i3] = lineParser2.parseHeader((CharArrayBuffer) arrayList.get(i3));
                    i3++;
                } catch (ParseException e) {
                    throw new ProtocolException(e.getMessage());
                }
            }
            return headerArr2;
        }
        throw new IllegalArgumentException("Session input buffer may not be null");
    }

    public HttpMessage parse() throws IOException, HttpException {
        try {
            HttpMessage parseHead = parseHead(this.sessionBuffer);
            parseHead.setHeaders(parseHeaders(this.sessionBuffer, this.maxHeaderCount, this.maxLineLen, this.lineParser));
            return parseHead;
        } catch (ParseException e) {
            throw new ProtocolException(e.getMessage(), e);
        }
    }

    public abstract HttpMessage parseHead(SessionInputBuffer sessionInputBuffer) throws IOException, HttpException, ParseException;
}
