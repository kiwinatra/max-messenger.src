package org.apache.http.message;

import java.util.NoSuchElementException;
import org.apache.http.Header;
import org.apache.http.HeaderIterator;

@Deprecated
public class BasicHeaderIterator implements HeaderIterator {
    protected final Header[] allHeaders;
    protected int currentIndex;
    protected String headerName;

    public BasicHeaderIterator(Header[] headerArr, String str) {
        if (headerArr != null) {
            this.allHeaders = headerArr;
            this.headerName = str;
            this.currentIndex = findNext(-1);
            return;
        }
        throw new IllegalArgumentException("Header array must not be null.");
    }

    public boolean filterHeader(int i) {
        String str = this.headerName;
        return str == null || str.equalsIgnoreCase(this.allHeaders[i].getName());
    }

    public int findNext(int i) {
        if (i < -1) {
            return -1;
        }
        int length = this.allHeaders.length - 1;
        boolean z = false;
        while (!z && i < length) {
            i++;
            z = filterHeader(i);
        }
        if (z) {
            return i;
        }
        return -1;
    }

    public boolean hasNext() {
        return this.currentIndex >= 0;
    }

    public final Object next() throws NoSuchElementException {
        return nextHeader();
    }

    public Header nextHeader() throws NoSuchElementException {
        int i = this.currentIndex;
        if (i >= 0) {
            this.currentIndex = findNext(i);
            return this.allHeaders[i];
        }
        throw new NoSuchElementException("Iteration already finished.");
    }

    public void remove() throws UnsupportedOperationException {
        throw new UnsupportedOperationException("Removing headers is not supported.");
    }
}
