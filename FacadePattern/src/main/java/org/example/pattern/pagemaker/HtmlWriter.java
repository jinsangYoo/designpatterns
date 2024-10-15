package org.example.pattern.pagemaker;

import java.io.IOException;

public class HtmlWriter {
    private static final String TAG = "HtmlWriter";

    private StringBuilder sb;

    public HtmlWriter(StringBuilder sb) {
        this.sb = sb;
    }

    public void title(String title) throws IOException {
        sb.append("<html>");
        sb.append("<head>");
        sb.append("<title>" + title +"</title>");
        sb.append("</head>");
        sb.append("<body>\n");
        sb.append("<h1>" + title +"</h1>\n");
    }

    public void paragraph(String msg) throws IOException {
        sb.append("<p>" + msg +"</p>\n");
    }

    public void link(String href, String caption) throws IOException {
        sb.append("<a href=\"" + href + "\">" + caption + "</a>\n");
    }

    public void mailto(String mailAddr, String userName) throws IOException {
        link("mailto:" + mailAddr, userName);
    }

    public void close() throws IOException {
        sb.append("</body>\n");
        sb.append("</html>\n");

        System.out.println(sb.toString());
    }
}
