package com.ucb.traductor.dto;

public class TranslateDto {
    private String text;
    private String source;
    private String target;

    public TranslateDto() {
    }

    public TranslateDto(String text, String source, String target) {
        this.text = text;
        this.source = source;
        this.target = target;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getSourceLanguage() {
        return source;
    }

    public void setSourceLanguage(String source) {
        this.source = source;
    }

    public String getTargetLanguage() {
        return target;
    }

    public void setTargetLanguage(String target) {
        this.target = target;
    }
}
