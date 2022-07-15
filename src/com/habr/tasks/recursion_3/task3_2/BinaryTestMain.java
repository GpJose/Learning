package com.habr.tasks.recursion_3.task3_2;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class BinaryTestMain {

    public static void main (String [] args){
       /* SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new SwingDemo();
            }
        });*/
        SwingUtilities.invokeLater(ButtomDemo::new);
    }
}
class SwingDemo {
    SwingDemo() {
        //создать новый контейнер JFrame
        JFrame jrm = new JFrame("Простое приложение Swing");

        //установить начальные размеры
        jrm.setSize(322, 150);

        //завершить работу программы, когда позьзователь закрывает приложение
        jrm.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

        //создать текстовую метку
        JLabel jlab = new JLabel("Программирование интерфейса с помощью Swing");
        JLabel jlab2 = new JLabel("ЮГ");

        //добавить метку на панель содержимого
        jrm.add(jlab, BorderLayout.NORTH);
        jrm.add(jlab2, BorderLayout.EAST);

        //отобразить фрейм
        jrm.setVisible(true);

    }
}
class ButtomDemo implements ActionListener {
    JLabel jlab;
    JLabel Clicks;
    int click = 0;
    ButtomDemo() {
        //создать новый контейнер JFrame
        JFrame jfrm = new JFrame("Пример кнопки");
        //задать объект FlowLayout для менеджера комновоки
        jfrm.setLayout(new FlowLayout());

        //задать исходные данные фрейма
        jfrm.setSize(250, 100);

        //прекратить работу программы если приложение закрыто
        jfrm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        //создать две кнопки
        JButton jbttnUP = new JButton("Отпущена");
        JButton jbttnDOWN = new JButton("Нажата");

        jbttnUP.addActionListener(this);
        jbttnDOWN.addActionListener(this);

        //расположить две кнопки
        jfrm.add(jbttnUP);
        jfrm.add(jbttnDOWN);

        //создать метку
        jlab = new JLabel("Нажать кнопку.");
        Clicks = new JLabel("Клики: " + click);

        //добавить метку во фрейм
         jfrm.add(jlab);
         jfrm.add(Clicks);
         //отобразить фрейм
        jfrm.setVisible(true);
    }
    //обработка событий кнопки
    public void actionPerformed (ActionEvent ae){
        if (ae.getActionCommand().equals("Отпущена")){
            jlab.setText("Кнопка отпущена");
            Clicks.setText("Клики: " + (++click));
        }
        else {
            jlab.setText("Кнопка нажата");
        }
    }
}
