package com.xworkz.task;

import com.xworkz.task.language.Language;
import com.xworkz.task.language.english.English;

public class LanguageRunner {

    public static void main(String[] args)
    {
        Language language = new Language();
        language.origin();
        language.script();
        language.usage();

        English sanskrit = new English();
        sanskrit.origin();
        sanskrit.script();
        sanskrit.usage();
    }
}
