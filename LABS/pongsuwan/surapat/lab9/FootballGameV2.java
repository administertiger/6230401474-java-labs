/*
* Author : Surapat Pongsuwan
* ID : 623040147-4
* section : 2
* Date : Febuary 28, 2020
*/

package pongsuwan.surapat.lab9;
import java.awt.BorderLayout;
import java.awt.event.*;

import javax.swing.SwingUtilities;

public class FootballGameV2 extends FootballGameV1 implements ActionListener, KeyListener{

    private static final long serialVersionUID = 1L;

    protected Object srcObject; 
    protected CanvasDrawerV4 canvasDrawerV4;

    protected FootballGameV2(String title) {
        super(title);
        setFocusable(true);
        requestFocus();
    }

    protected void initComponents() {
        super.initComponents();
        canvasDrawerV4 = new CanvasDrawerV4();
    }

    @Override
    protected void addComponents() {
        super.addComponents();
        add(canvasDrawerV4, BorderLayout.CENTER);
    }

    //------------Actionlistener section.---------------
    @Override
    public void actionPerformed(ActionEvent e) {
        srcObject = e.getSource();

        if (srcObject == moveUP_button) {
            canvasDrawerV4.keeperLeft.moveUp();
        } else if (srcObject == moveDown_button) {
            canvasDrawerV4.keeperLeft.moveDown();
        } else if (srcObject == moveLeft_button) {
            canvasDrawerV4.keeperRight.moveUp();
        } else if (srcObject == moveRight_button) {
            canvasDrawerV4.keeperRight.moveDown();
        }
    }

    protected void addListeners() {
        moveUP_button.addActionListener(this);
        moveDown_button.addActionListener(this);
        moveLeft_button.addActionListener(this);
        moveRight_button.addActionListener(this);

        this.addKeyListener(this);
    }

    //----------------Keylistener section.---------------
    @Override
	public void keyPressed(KeyEvent e) {
        int key = e.getKeyCode();
        
        if (key == KeyEvent.VK_UP) {
            canvasDrawerV4.keeperRight.moveUp();
        } else if (key == KeyEvent.VK_DOWN) {
            canvasDrawerV4.keeperRight.moveDown();
        } else if (key == KeyEvent.VK_W) {
            canvasDrawerV4.keeperLeft.moveUp();
        } else if (key == KeyEvent.VK_S) {
            canvasDrawerV4.keeperLeft.moveDown();
        }
    }
	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
	}
	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
    }
    
    public static void createAndShowGUI() {
        FootballGameV2 footballV2 = new FootballGameV2("FootballGameV2");
        footballV2.initComponents();
        footballV2.addComponents();
        footballV2.addMenus();
        footballV2.addListeners();
        footballV2.setFrameFeatures();
    }
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                createAndShowGUI();
            }
        });
    }
}