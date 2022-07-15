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
        //������� ����� ��������� JFrame
        JFrame jrm = new JFrame("������� ���������� Swing");

        //���������� ��������� �������
        jrm.setSize(322, 150);

        //��������� ������ ���������, ����� ������������ ��������� ����������
        jrm.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

        //������� ��������� �����
        JLabel jlab = new JLabel("���������������� ���������� � ������� Swing");
        JLabel jlab2 = new JLabel("��");

        //�������� ����� �� ������ �����������
        jrm.add(jlab, BorderLayout.NORTH);
        jrm.add(jlab2, BorderLayout.EAST);

        //���������� �����
        jrm.setVisible(true);

    }
}
class ButtomDemo implements ActionListener {
    JLabel jlab;
    JLabel Clicks;
    int click = 0;
    ButtomDemo() {
        //������� ����� ��������� JFrame
        JFrame jfrm = new JFrame("������ ������");
        //������ ������ FlowLayout ��� ��������� ���������
        jfrm.setLayout(new FlowLayout());

        //������ �������� ������ ������
        jfrm.setSize(250, 100);

        //���������� ������ ��������� ���� ���������� �������
        jfrm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        //������� ��� ������
        JButton jbttnUP = new JButton("��������");
        JButton jbttnDOWN = new JButton("������");

        jbttnUP.addActionListener(this);
        jbttnDOWN.addActionListener(this);

        //����������� ��� ������
        jfrm.add(jbttnUP);
        jfrm.add(jbttnDOWN);

        //������� �����
        jlab = new JLabel("������ ������.");
        Clicks = new JLabel("�����: " + click);

        //�������� ����� �� �����
         jfrm.add(jlab);
         jfrm.add(Clicks);
         //���������� �����
        jfrm.setVisible(true);
    }
    //��������� ������� ������
    public void actionPerformed (ActionEvent ae){
        if (ae.getActionCommand().equals("��������")){
            jlab.setText("������ ��������");
            Clicks.setText("�����: " + (++click));
        }
        else {
            jlab.setText("������ ������");
        }
    }
}
