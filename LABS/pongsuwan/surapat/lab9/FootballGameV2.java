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

    //CanvasDrawer.
    protected CanvasDrawerV4 canvasDrawerFBG;

    protected FootballGameV2(String title) {
        super(title);
        setFocusable(true);
        requestFocus();
    }

    protected void initComponents() {
        super.initComponents();
        canvasDrawerFBG = new CanvasDrawerV4();
    }
    
    @Override
    protected void addComponents() {
        super.addComponents();
        main_panel.remove(canvasDrawerV3);
        main_panel.add(canvasDrawerFBG, BorderLayout.CENTER);
    }
    
    //------------Actionlistener section.---------------
    protected void addListeners() {
        moveUP_button.addActionListener(this);
        moveDown_button.addActionListener(this);
        moveLeft_button.addActionListener(this);
        moveRight_button.addActionListener(this);

        this.addKeyListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Object object = e.getSource();

        if (object == moveUP_button) {
            canvasDrawerFBG.keeperLeft.moveUp();
        } else if (object == moveDown_button) {
            canvasDrawerFBG.keeperLeft.moveDown();
        } else if (object == moveLeft_button) {
            canvasDrawerFBG.keeperRight.moveUp();
        } else if (object == moveRight_button) {
            canvasDrawerFBG.keeperRight.moveDown();
        }

        requestFocus();
    }

    //----------------Keylistener section.---------------
    @Override
	public void keyPressed(KeyEvent e) {
        int key = e.getKeyCode();
        
        if (key == KeyEvent.VK_UP) {
            canvasDrawerFBG.keeperRight.moveUp();
        } else if (key == KeyEvent.VK_DOWN) {
            canvasDrawerFBG.keeperRight.moveDown();
        } else if (key == KeyEvent.VK_W) {
            canvasDrawerFBG.keeperLeft.moveUp();
        } else if (key == KeyEvent.VK_S) {
            canvasDrawerFBG.keeperLeft.moveDown();
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

    //-----------------------------------------------------

    public static void createAndShowGUI() {
        FootballGameV2 footballV2 = new FootballGameV2("Football Game V2");
        footballV2.initComponents();
        footballV2.addComponents();
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