package com.goosemagnet.observer.swingobserver;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SwingObserverExample {

    JFrame jFrame;

    public static void main(String[] args) {
        SwingObserverExample swingObserverExample = new SwingObserverExample();
        swingObserverExample.go();
    }

    public void go() {
        jFrame = new JFrame();

        JButton jButton = new JButton("Should I do it?");
        jButton.addActionListener(event -> System.out.println("Don't do it, you might regret it!"));
        jButton.addActionListener(event -> System.out.println("Come on, do it!"));

        jFrame.getContentPane().add(BorderLayout.CENTER, jButton);

        jFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        jFrame.getContentPane().setSize(800,600);
        jFrame.setVisible(true);
    }
}
