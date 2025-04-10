package com.xworkz.task;

import com.xworkz.task.speaker.Speaker;
import com.xworkz.task.speaker.jbl.Jbl;

public class SpeakerRunner {
    public static void main(String[] args)
    {
        Speaker speaker = new Speaker();
        speaker.volume();
        speaker.type();
        speaker.brand();

        Jbl jbl = new Jbl();
        jbl.volume();
        jbl.type();
        jbl.brand();
    }
}
