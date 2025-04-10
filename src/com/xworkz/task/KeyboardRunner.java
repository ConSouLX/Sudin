package com.xworkz.task;

import com.xworkz.task.keyboard.KeyBoard;
import com.xworkz.task.logitech.Logitech;

public class KeyboardRunner {

    public static void main(String[] args)
    {
        KeyBoard keyboard = new KeyBoard();
        keyboard.type();
        keyboard.layout();
        keyboard.connectivity();

        Logitech logitech = new Logitech();
        logitech.type();
        logitech.layout();
        logitech.connectivity();
    }
}
