package jframe;
import javax.swing.*;
import java.awt.*;


public class Screen{

    public Screen(){
    {
    Font arial = new Font("Arial", Font.ITALIC, 30);
    Color preto = new Color(0, 0, 0);
    Color branco = new Color(237, 241, 238);
    Color cinza = new Color(35, 35, 35);
    Color vermelho = new Color(81, 0, 89);

    JFrame jframe = new JFrame();
    //colocando a tela visivel para poder aparecer
    jframe.getContentPane().setBackground(new Color(140, 140, 140));


    jframe.setVisible(true);
    //definindo tamanho da janela;
    jframe.setSize(335, 540);
    //colocando titulo da janela
    jframe.setTitle("JavaCaulculator");
    jframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    jframe.setResizable(false);
    jframe.setLocationRelativeTo(null);
    jframe.setLayout(null);



    JButton vazio = new JButton("");
        vazio.setBackground(cinza);
        vazio.setBounds(1, 1, 317, 98);
        jframe.add(vazio);


    JButton button1 = new JButton("1");
        button1.setFont(arial);
        button1.setBackground(preto);
        button1.setForeground(vermelho);
        button1.setBounds(0, 340, 79, 79);
        jframe.add(button1);

    JButton button2 = new JButton("2");
        button2.setFont(arial);
        button2.setBackground(preto);
        button2.setForeground(vermelho);
        button2.setBounds(80, 340, 79, 79);
        jframe.add(button2);


    JButton button3 = new JButton("3");
        button3.setFont(arial);
        button3.setBackground(preto);
        button3.setForeground(vermelho);
        button3.setBounds(160, 340, 79, 79);
        jframe.add(button3);


    JButton button4 = new JButton("4");
        button4.setFont(arial);
        button4.setBackground(preto);
        button4.setForeground(vermelho);
        button4.setBounds(0, 260, 79, 79);
        jframe.add(button4);


    JButton button5 = new JButton("5");
        button5.setFont(arial);
        button5.setBackground(preto);
        button5.setForeground(vermelho);
        button5.setBounds(80, 260, 79, 79);
        jframe.add(button5);


    JButton button6 = new JButton("6");
        button6.setFont(arial);
        button6.setBackground(preto);
        button6.setForeground(vermelho);
        button6.setBounds(160, 260, 79, 79);
        jframe.add(button6);


    JButton button7 = new JButton("7");
        button7.setFont(arial);
        button7.setBackground(preto);
        button7.setForeground(vermelho);
        button7.setBounds(0, 180, 79, 79);
        jframe.add(button7);


    JButton button8 = new JButton("8");
        button8.setFont(arial);
        button8.setBackground(preto);
        button8.setForeground(vermelho);
        button8.setBounds(80, 180, 79, 79);
        jframe.add(button8);


    JButton button9 = new JButton("9");
        button9.setFont(arial);
        button9.setBackground(preto);
        button9.setForeground(vermelho);
        button9.setBounds(160, 180, 79, 79);
        jframe.add(button9);


    JButton button0 = new JButton("0");
        button0.setFont(arial);
        button0.setBackground(vermelho);
        button0.setForeground(preto);
        button0.setBounds(80, 420, 79, 79);
        jframe.add(button0);


    JButton minus = new JButton("-");
        minus.setFont(arial);
        minus.setBackground(preto);
        minus.setForeground(branco);
        minus.setBounds(0, 100, 79, 79);
        jframe.add(minus);


    JButton plus = new JButton("+");
        plus.setFont(arial);
        plus.setBackground(preto);
        plus.setForeground(branco);
        plus.setBounds(80, 100, 79, 79);
        jframe.add(plus);


    JButton multi = new JButton("x");
        multi.setFont(arial);
        multi.setForeground(branco);
        multi.setBackground(preto);
        multi.setBounds(160, 100, 79, 79);
        jframe.add(multi);


    JButton dividir = new JButton("/");
        dividir.setFont(arial);
        dividir.setForeground(branco);
        dividir.setBackground(preto);
        dividir.setBounds(240, 100, 79, 79);
        jframe.add(dividir);


    JButton igual = new JButton("=");
        igual.setFont(arial);
        igual.setBackground(vermelho);
        igual.setForeground(preto);
        igual.setBounds(240, 420, 79, 79);
        jframe.add(igual);

    JButton porcent = new JButton("%");
        porcent.setFont(arial);
        porcent.setBackground(preto);
        porcent.setForeground(branco);
        porcent.setBounds(160, 420, 79, 79);
        jframe.add(porcent);

    JButton virg = new JButton(",");
        virg.setFont(arial);
        virg.setBackground(preto);
        virg.setForeground(branco);
        virg.setBounds(0, 420, 79, 79);
        jframe.add(virg);

    JButton c = new JButton("C");
        c.setFont(arial);
        c.setBackground(preto);
        c.setForeground(new Color(255, 225, 89));
        c.setBounds(240, 260, 79, 79);
        jframe.add(c);


    JButton back = new JButton("DEL");
        back.setFont(arial);
        back.setBackground(preto);
        back.setForeground(branco);
        back.setBounds(240, 180, 79, 79);
        jframe.add(back);


    JButton raiz = new JButton("R");
        raiz.setFont(arial);
        raiz.setBackground(preto);
        raiz.setForeground(branco);
        raiz.setBounds(240, 340, 79, 79);
        jframe.add(raiz);

    }







    //formas de por texto
    //1 dentro do proprio construtor JButton jbutton = new JButton("texto aqui");
    //2 jbutton.setText("texto aqui");
    //definindo local do botao
    //jbutton.setBounds(100, 200, 250, 70);
    //alterando a fonte
    //jbutton.setFont(new Font("Arial",Font.ITALIC, 50));
    //alterando cores
    //Color colorBlack = new Color(237, 241, 238);
    //jbutton.setForeground(colorBlack);
    //jbutton.setBackground(new Color(10, 10, 10));
    //adicionando o botao
    //jframe.add(jbutton);


    }


}
