/*
* � ������ ���������� ���������� ����� ���������� � ��������������� ������������� � ���������� ����������� � ���.
�������������� � ����������� ����������� ��� ��� ������ � �������� ������ �����������.

��������:
���������� ������� �����������: ������, �������, ����������� ����������
�������� ���������� ��� �������� ������
�������� ���������� ��� ����������� �������\�������� ������
*
���� ������ ��������� ��������� ������: id, ���� ���������� ������, ����� ���������� ������, ������ ������, ��� ������,
������ �������� � ����� csv/jsom/xml
������ ����������
* */

import java.io.File;
import java.io.IOException;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class Main {
    public static void main(String[] args) throws IOException {
        TaskList tasks = new TaskList();
        tasks.addTask(new Task(new GregorianCalendar(2022,12,5),new User("Alex"),Priority.HIGH,0));
        tasks.addTask(new Task(new GregorianCalendar(2022,11,2),new User("John"),Priority.Low, 1));
        tasks.addTask(new Task(new GregorianCalendar(2022,9,3),new User("Mike"),Priority.Medium,2 ));
        tasks.addTask(new Task(new GregorianCalendar(2022,10,1),new User("Steve"),Priority.HIGH,3));
        tasks.printTask();
        tasks.sortTask();
        tasks.printTask();
        Json json = new Json();
        json.printToFile(new File("log.txt"), tasks);

    }
}