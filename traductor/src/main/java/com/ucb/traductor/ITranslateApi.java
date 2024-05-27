package com.ucb.traductor;

import com.ucb.traductor.dto.TranslateDto;

public interface ITranslateApi {
    String translate(TranslateDto translateDto);
}
