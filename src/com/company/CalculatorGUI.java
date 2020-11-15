package com.company;
import javax.swing.*;
import java.awt.*;

/**
 * the CalculatorGUI class represents a calculator with 2 modes : 1- basic and 2- scientific.
 * the basic one have operators + , - , * , / , and %.
 * the scientific one in addition to these features , have log , exp , sin , cos , tan and cot operators.
 *
 * @author Erfan Majedi
 * @version 1.0
 * @since 2020.10.15
 */

public class CalculatorGUI {
    //a frame for calculator.
    private JFrame calcFrame;

    public CalculatorGUI() {

        //init the frame.
        makeFrame();

        //a panel for basic mode.
        JPanel basicPanel = new JPanel();
        basicPanel.setLayout(new GridLayout(5, 4));

        //a panel for scientific mode.
        JPanel scientificPanel = new JPanel();
        scientificPanel.setLayout(new GridLayout(5, 5));
        scientificPanel.setName("scientificPanel");

        //text area to show details.
        JTextArea display = new JTextArea(3, 10);
        display.setEditable(false);
        display.setFont(new Font("Serif", Font.ITALIC, 16));

        //add scroll pane for text area.
        JScrollPane scrollPane = new JScrollPane(display);


        //make buttons for basic mode.
        initBasicOperatorButtons(basicPanel);
        //make buttons for scientific mode.
        initBasicOperatorButtons(scientificPanel);

        //make 2 tabs to switch between 2 modes.
        JTabbedPane tabbedPane = new JTabbedPane();
        tabbedPane.add("                 Basic                 ", basicPanel);
        tabbedPane.add("                 Scientific                 ", scientificPanel);


        //add text area and tab to main frame.
        calcFrame.getContentPane().add(scrollPane, BorderLayout.NORTH);
        calcFrame.add(tabbedPane, BorderLayout.CENTER);


    }

    /**
     * this makeFrame method initializes the frame.
     */
    public void makeFrame() {

        calcFrame = new JFrame();
        calcFrame.setTitle("AUT Calculator");
        calcFrame.setSize(400, 500);
        calcFrame.setLocation(100, 200);
        calcFrame.setLayout(new BorderLayout());
        calcFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        calcFrame.setVisible(true);

    }

    /**
     * this initNumberButtons method makes the numerical buttons of the calculator.
     *
     * @param basicPanel the panel want to add buttons to it.
     */
    public void initNumberButtons(JPanel basicPanel) {

        for (int i = 9; i > 0; i--) {

            JButton btn = new JButton();

            switch (i) {
                case 9:
                    btn.setText("⑨");
                    basicPanel.add(btn);
                    break;
                case 8:
                    btn.setText("⑧");
                    basicPanel.add(btn);
                    break;
                case 7:
                    btn.setText("⑦");
                    basicPanel.add(btn);

                    //make sum buttons.
                    JButton sumBtn = new JButton();
                    sumBtn.setText("+");
                    sumBtn.setBackground(Color.RED);
                    basicPanel.add(sumBtn);

                    //make log and exp buttons.
                    if (basicPanel.getName() != null) {
                        JButton logBtn = new JButton();
                        logBtn.setText("log/exp");
                        logBtn.setBackground(Color.WHITE);
                        basicPanel.add(logBtn);

                    }
                    break;
                case 6:
                    btn.setText("⑥");
                    basicPanel.add(btn);
                    break;
                case 5:
                    btn.setText("⑤");
                    basicPanel.add(btn);
                    break;
                case 4:
                    btn.setText("④");
                    basicPanel.add(btn);

                    //make multiply button.
                    JButton multiplyBtn = new JButton();
                    multiplyBtn.setText("✕");
                    multiplyBtn.setBackground(Color.RED);
                    basicPanel.add(multiplyBtn);

                    //make e and pi button.
                    if (basicPanel.getName() != null) {
                        JButton eandpBtn = new JButton();
                        eandpBtn.setText("ℯ/π");
                        eandpBtn.setBackground(Color.WHITE);
                        basicPanel.add(eandpBtn);

                    }

                    break;
                case 3:
                    btn.setText("③");
                    basicPanel.add(btn);
                    break;
                case 2:
                    btn.setText("②");
                    basicPanel.add(btn);
                    break;
                case 1:
                    btn.setText("①");
                    basicPanel.add(btn);
                    break;
            }
        }
    }

    /**
     * this initBasicOperatorButtons method makes the operation buttons of the calculator.
     *
     * @param basicPanel the panel want to add buttons to it.
     */

    public void initBasicOperatorButtons(JPanel basicPanel) {

        //make sin and cos button.
        if (basicPanel.getName() != null) {
            JButton sinBtn = new JButton();
            sinBtn.setText("sin/cos");
            sinBtn.setBackground(Color.WHITE);
            basicPanel.add(sinBtn);

        }

        //make parentheses open button.
        JButton openParanBtn = new JButton();
        openParanBtn.setText("(");
        openParanBtn.setBackground(Color.WHITE);
        basicPanel.add(openParanBtn);

        //make parentheses close button.
        JButton closeParanBtn = new JButton();
        closeParanBtn.setText(")");
        closeParanBtn.setBackground(Color.WHITE);
        basicPanel.add(closeParanBtn);

        //make radical button.
        JButton sqrtBtn = new JButton();
        sqrtBtn.setText("√");
        sqrtBtn.setBackground(Color.WHITE);
        basicPanel.add(sqrtBtn);

        //make remaining button.
        JButton amountBtn = new JButton();
        amountBtn.setText("%");
        amountBtn.setBackground(Color.RED);
        basicPanel.add(amountBtn);

        //make tan and cot button.
        if (basicPanel.getName() != null) {
            JButton tanBtn = new JButton();
            tanBtn.setText("tan/cot");
            tanBtn.setBackground(Color.WHITE);
            basicPanel.add(tanBtn);

        }

        //make numbers.
        initNumberButtons(basicPanel);

        //make division button.
        JButton divBtn = new JButton();
        divBtn.setText("÷");
        divBtn.setBackground(Color.RED);
        basicPanel.add(divBtn);

        //make shift button.
        if (basicPanel.getName() != null) {
            JButton shiftBtn = new JButton();
            shiftBtn.setText("⇧");
            shiftBtn.setBackground(Color.GRAY);
            basicPanel.add(shiftBtn);
        }

        //make C button.
        JButton cBtn = new JButton();
        cBtn.setText("C");
        cBtn.setBackground(Color.WHITE);
        basicPanel.add(cBtn);

        //make zero button.
        JButton zeroBtn = new JButton();
        zeroBtn.setText("⓪");
        basicPanel.add(zeroBtn);
        JButton dotBtn = new JButton();

        //make dot button.
        dotBtn.setText(".");
        dotBtn.setBackground(Color.WHITE);
        basicPanel.add(dotBtn);

        //make equal button.
        JButton doBtn = new JButton();
        doBtn.setText("=");
        doBtn.setBackground(Color.YELLOW);
        basicPanel.add(doBtn);
    }
}

