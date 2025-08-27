package org.apache.http.message;

import java.util.NoSuchElementException;
import org.apache.http.FormattedHeader;
import org.apache.http.Header;
import org.apache.http.HeaderElement;
import org.apache.http.HeaderElementIterator;
import org.apache.http.HeaderIterator;
import org.apache.http.util.CharArrayBuffer;

@Deprecated
public class BasicHeaderElementIterator implements HeaderElementIterator {
    private CharArrayBuffer buffer;
    private HeaderElement currentElement;
    private ParserCursor cursor;
    private final HeaderIterator headerIt;
    private final HeaderValueParser parser;

    public BasicHeaderElementIterator(HeaderIterator headerIterator, HeaderValueParser headerValueParser) {
        this.currentElement = null;
        this.buffer = null;
        this.cursor = null;
        if (headerIterator == null) {
            throw new IllegalArgumentException("Header iterator may not be null");
        } else if (headerValueParser != null) {
            this.headerIt = headerIterator;
            this.parser = headerValueParser;
        } else {
            throw new IllegalArgumentException("Parser may not be null");
        }
    }

    private void bufferHeaderValue() {
        this.cursor = null;
        this.buffer = null;
        while (this.headerIt.hasNext()) {
            Header nextHeader = this.headerIt.nextHeader();
            if (nextHeader instanceof FormattedHeader) {
                FormattedHeader formattedHeader = (FormattedHeader) nextHeader;
                CharArrayBuffer buffer2 = formattedHeader.getBuffer();
                this.buffer = buffer2;
                ParserCursor parserCursor = new ParserCursor(0, buffer2.length());
                this.cursor = parserCursor;
                parserCursor.updatePos(formattedHeader.getValuePos());
                return;
            }
            String value = nextHeader.getValue();
            if (value != null) {
                CharArrayBuffer charArrayBuffer = new CharArrayBuffer(value.length());
                this.buffer = charArrayBuffer;
                charArrayBuffer.append(value);
                this.cursor = new ParserCursor(0, this.buffer.length());
                return;
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x0027  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void parseNextElement() {
        /*
            r3 = this;
        L_0x0000:
            org.apache.http.HeaderIterator r0 = r3.headerIt
            boolean r0 = r0.hasNext()
            if (r0 != 0) goto L_0x000e
            org.apache.http.message.ParserCursor r0 = r3.cursor
            if (r0 == 0) goto L_0x000d
            goto L_0x000e
        L_0x000d:
            return
        L_0x000e:
            org.apache.http.message.ParserCursor r0 = r3.cursor
            if (r0 == 0) goto L_0x0018
            boolean r0 = r0.atEnd()
            if (r0 == 0) goto L_0x001b
        L_0x0018:
            r3.bufferHeaderValue()
        L_0x001b:
            org.apache.http.message.ParserCursor r0 = r3.cursor
            if (r0 == 0) goto L_0x0000
        L_0x001f:
            org.apache.http.message.ParserCursor r0 = r3.cursor
            boolean r0 = r0.atEnd()
            if (r0 != 0) goto L_0x0044
            org.apache.http.message.HeaderValueParser r0 = r3.parser
            org.apache.http.util.CharArrayBuffer r1 = r3.buffer
            org.apache.http.message.ParserCursor r2 = r3.cursor
            org.apache.http.HeaderElement r0 = r0.parseHeaderElement(r1, r2)
            java.lang.String r1 = r0.getName()
            int r1 = r1.length()
            if (r1 != 0) goto L_0x0041
            java.lang.String r1 = r0.getValue()
            if (r1 == 0) goto L_0x001f
        L_0x0041:
            r3.currentElement = r0
            return
        L_0x0044:
            org.apache.http.message.ParserCursor r0 = r3.cursor
            boolean r0 = r0.atEnd()
            if (r0 == 0) goto L_0x0000
            r0 = 0
            r3.cursor = r0
            r3.buffer = r0
            goto L_0x0000
        */
        throw new UnsupportedOperationException("Method not decompiled: org.apache.http.message.BasicHeaderElementIterator.parseNextElement():void");
    }

    public boolean hasNext() {
        if (this.currentElement == null) {
            parseNextElement();
        }
        return this.currentElement != null;
    }

    public final Object next() throws NoSuchElementException {
        return nextElement();
    }

    public HeaderElement nextElement() throws NoSuchElementException {
        if (this.currentElement == null) {
            parseNextElement();
        }
        HeaderElement headerElement = this.currentElement;
        if (headerElement != null) {
            this.currentElement = null;
            return headerElement;
        }
        throw new NoSuchElementException("No more header elements available");
    }

    public void remove() throws UnsupportedOperationException {
        throw new UnsupportedOperationException("Remove not supported");
    }

    public BasicHeaderElementIterator(HeaderIterator headerIterator) {
        this(headerIterator, BasicHeaderValueParser.DEFAULT);
    }
}
