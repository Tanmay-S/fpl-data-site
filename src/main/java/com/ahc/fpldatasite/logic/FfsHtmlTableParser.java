package com.ahc.fpldatasite.logic;

import com.ahc.fpldatasite.constants.SecurityKeys;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;

import java.io.IOException;

public class FfsHtmlTableParser {

    private static final String COOKIE_NAME = SecurityKeys.FFS_COOKIE_NAME.value();
    private static final String FFS_TOKEN = SecurityKeys.FFS_TOKEN.value();
    private final String url;

    public FfsHtmlTableParser(String url) {
        this.url = url;
    }

    private Document setDocument() throws IOException {
        return Jsoup.connect(url)
                .cookie(COOKIE_NAME, FFS_TOKEN)
                .get();
    }

    public String getTable() throws IOException {
        Document document = setDocument();
        Element tableElement = document.select("table").first();
        return tableElement.outerHtml();
    }
}
