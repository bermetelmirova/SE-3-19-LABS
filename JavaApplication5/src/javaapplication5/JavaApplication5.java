/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication5;
import java.awt.*;
import java.awt.image.*;

/**
 *
 * @author User
 */
public class JavaApplication5 extends javax.swing.JFrame {

    private int w=100,h=100;
    private int[] pix=new int[h*w];
    private Image img;
    JavaApplication5(String s)
    {
        super(s);
        int i=0;
        for (int y=0;y<h;y++)
        {
            int red=255*y/(h-1);
            for (int x=0;x<w;x++)
            {
                int green = 255*x/(w-1);
                pix[i++] = (255<<24)|(red<<24)|(green<<8)|128;
            }
        }
        setSize(250,200);
        setVisible(true);
        //setDefaultCloseOperation(CLOSE);
        
    }
    public void paint(Graphics gr){
        if(img==null)
            img=createImage(new MemoryImageSource(w,h,pix,0,w));
        gr.drawImage(img, 50, 50, this);
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        new JavaApplication5("Изображение памяти");
    }
    
}
