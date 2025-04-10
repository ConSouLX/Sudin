package com.xworkz.task;

import com.xworkz.task.table.Table;
import com.xworkz.task.table.studytable.StudyTable;

public class TableRunner {


    public static void main(String[] args)
    {
        Table table = new Table();
        table.shape();
        table.material();
        table.height();

        StudyTable studyTable = new StudyTable();
        studyTable.shape();
        studyTable.material();
        studyTable.height();
    }
}
