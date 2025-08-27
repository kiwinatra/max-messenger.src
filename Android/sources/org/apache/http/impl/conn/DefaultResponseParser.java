package org.apache.http.impl.conn;

import java.io.IOException;
import kotlin.jvm.internal.IntCompanionObject;
import kotlin.uuid.Uuid;
import org.apache.http.HttpException;
import org.apache.http.HttpMessage;
import org.apache.http.HttpResponseFactory;
import org.apache.http.NoHttpResponseException;
import org.apache.http.ProtocolException;
import org.apache.http.conn.params.ConnConnectionPNames;
import org.apache.http.impl.io.AbstractMessageParser;
import org.apache.http.io.SessionInputBuffer;
import org.apache.http.message.LineParser;
import org.apache.http.message.ParserCursor;
import org.apache.http.params.HttpParams;
import org.apache.http.protocol.HttpContext;
import org.apache.http.util.CharArrayBuffer;

@Deprecated
public class DefaultResponseParser extends AbstractMessageParser {
    private final CharArrayBuffer lineBuf;
    private final int maxGarbageLines;
    private final HttpResponseFactory responseFactory;

    public DefaultResponseParser(SessionInputBuffer sessionInputBuffer, LineParser lineParser, HttpResponseFactory httpResponseFactory, HttpParams httpParams) {
        super(sessionInputBuffer, lineParser, httpParams);
        if (httpResponseFactory != null) {
            this.responseFactory = httpResponseFactory;
            this.lineBuf = new CharArrayBuffer(Uuid.SIZE_BITS);
            this.maxGarbageLines = httpParams.getIntParameter(ConnConnectionPNames.MAX_STATUS_LINE_GARBAGE, IntCompanionObject.MAX_VALUE);
            return;
        }
        throw new IllegalArgumentException("Response factory may not be null");
    }

    public HttpMessage parseHead(SessionInputBuffer sessionInputBuffer) throws IOException, HttpException {
        this.lineBuf.clear();
        int i = 0;
        while (true) {
            int readLine = sessionInputBuffer.readLine(this.lineBuf);
            if (readLine == -1 && i == 0) {
                throw new NoHttpResponseException("The target server failed to respond");
            }
            ParserCursor parserCursor = new ParserCursor(0, this.lineBuf.length());
            if (this.lineParser.hasProtocolVersion(this.lineBuf, parserCursor)) {
                return this.responseFactory.newHttpResponse(this.lineParser.parseStatusLine(this.lineBuf, parserCursor), (HttpContext) null);
            } else if (readLine != -1 && i < this.maxGarbageLines) {
                i++;
            }
        }
        throw new ProtocolException("The server failed to respond with a valid HTTP response");
    }
}
